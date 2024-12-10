package com.example.ecommerce.model.product.clothes;

import com.example.ecommerce.model.product.electronics.Electronics;
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "brands")
public class Brand {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "brand_id")
	private String brandID;

	@Column
	private String name;

	@Column(columnDefinition = "TEXT")
	private String address;

	@Column(columnDefinition = "TEXT")
	private String description;

	@Column(name = "year_established")
	private int yearEstablished;

	@OneToMany(mappedBy = "brand")
	private List<Clothes> clothes = new ArrayList<>();

	@OneToMany(mappedBy = "brand")
	private List<Electronics> electronics = new ArrayList<>();

	public Brand() {
	}

	public Brand(String brandID, String name, String address, String description, int yearEstablished) {
		this.brandID = brandID;
		this.name = name;
		this.address = address;
		this.description = description;
		this.yearEstablished = yearEstablished;
	}

	public String getBrandID() {
		return this.brandID;
	}

	public void setBrandID(String brandID) {
		this.brandID = brandID;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getYearEstablished() {
		return this.yearEstablished;
	}

	public void setYearEstablished(int yearEstablished) {
		this.yearEstablished = yearEstablished;
	}

	public List<Clothes> getClothes() {
		return clothes;
	}

	public void setClothes(List<Clothes> clothes) {
		this.clothes = clothes;
	}

	public List<Electronics> getElectronics() {
		return electronics;
	}

	public void setElectronics(List<Electronics> electronics) {
		this.electronics = electronics;
	}
}