package com.example.ecommerce.model.product.clothes;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "materials")
public class Material {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "material_id")
	private String materialID;

	@Column(nullable = false)
	private String name;

	@Column(columnDefinition = "TEXT")
	private String composition;

	private String texture;
	private String durability;
	private Float elasticity;
	private Float breathability;

	@Column(name = "care_instructions", columnDefinition = "TEXT")
	private String careInstructions;

	@OneToMany(mappedBy = "material")
	private List<Clothes> clothes = new ArrayList<>();

	public Material() {
	}

	public Material(String materialID, String name, String composition, String texture, 
				   String durability, Float elasticity, Float breathability, String careInstructions) {
		this.materialID = materialID;
		this.name = name;
		this.composition = composition;
		this.texture = texture;
		this.durability = durability;
		this.elasticity = elasticity;
		this.breathability = breathability;
		this.careInstructions = careInstructions;
	}

	public String getMaterialID() {
		return this.materialID;
	}

	public void setMaterialID(String materialID) {
		this.materialID = materialID;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getComposition() {
		return this.composition;
	}

	public void setComposition(String composition) {
		this.composition = composition;
	}

	public String getTexture() {
		return this.texture;
	}

	public void setTexture(String texture) {
		this.texture = texture;
	}

	public String getDurability() {
		return this.durability;
	}

	public void setDurability(String durability) {
		this.durability = durability;
	}

	public Float getElasticity() {
		return this.elasticity;
	}

	public void setElasticity(Float elasticity) {
		this.elasticity = elasticity;
	}

	public Float getBreathability() {
		return this.breathability;
	}

	public void setBreathability(Float breathability) {
		this.breathability = breathability;
	}

	public String getCareInstructions() {
		return this.careInstructions;
	}

	public void setCareInstructions(String careInstructions) {
		this.careInstructions = careInstructions;
	}

	public List<Clothes> getClothes() {
		return clothes;
	}

	public void setClothes(List<Clothes> clothes) {
		this.clothes = clothes;
	}
}