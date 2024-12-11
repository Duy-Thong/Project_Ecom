package com.example.ecommerce.service;

import com.example.ecommerce.dto.auth.LoginRequest;
import com.example.ecommerce.dto.auth.SignUpRequest;
import com.example.ecommerce.model.user.Customer;
import com.example.ecommerce.model.user.Role;
import com.example.ecommerce.model.user.User;
import com.example.ecommerce.repository.RoleRepository;
import com.example.ecommerce.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class AuthService {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public ResponseEntity<?> registerUser(SignUpRequest signUpRequest) {
        // Kiểm tra email đã tồn tại chưa
        if (userRepository.existsByEmail(signUpRequest.getEmail())) {
            return ResponseEntity.badRequest()
                    .body("Email đã được sử dụng!");
        }

        // Tạo tài khoản mới
        Customer user = new Customer();
        user.setName(signUpRequest.getName());
        user.setEmail(signUpRequest.getEmail());
        user.setPassword(passwordEncoder.encode(signUpRequest.getPassword()));

        // Tìm role theo ID thay vì name
        Role userRole = roleRepository.findById(signUpRequest.getRole_id())
                .orElseThrow(() -> new RuntimeException("Role không tồn tại."));
        user.setRole(userRole);

        userRepository.save(user);

        return ResponseEntity.ok("Đăng ký thành công!");
    }

    public ResponseEntity<?> authenticateUser(LoginRequest loginRequest) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        loginRequest.getEmail(),
                        loginRequest.getPassword()
                )
        );

        SecurityContextHolder.getContext().setAuthentication(authentication);
        
        User user = userRepository.findByEmail(loginRequest.getEmail())
                .orElseThrow(() -> new RuntimeException("Không tìm thấy user"));

        Map<String, Object> response = new HashMap<>();
        response.put("message", "Đăng nhập thành công!");
        response.put("user", user);

        return ResponseEntity.ok(response);
    }
    
    public ResponseEntity<?> logoutUser() {
        SecurityContextHolder.clearContext();
        return ResponseEntity.ok("Đăng xuất thành công!");
    }
} 