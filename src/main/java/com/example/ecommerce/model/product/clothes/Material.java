package com.example.ecommerce.model.product.clothes;

public class Material {
	private String materialID;
	private String name;
	private String composition;
	private String texture;
	private String durability;
	private Float elasticity;
	private Float breathability;
	private String careInstructions;
	public Clothes clothes;

	public String getMaterialID() {
		return this.materialID;
	}

	public void setMaterialID(String iD) {
		this.materialID = iD;
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
}