package com.katolisa.rpg.character;

public abstract class Character {

	private String name;
	private int hp;
	private int bloodType;

	public Character(String name, int hp, int bloodType) {
		this.name = name;
		this.hp = hp;
		this.bloodType = bloodType;
	}

	public String getName() {
		return name;
	}

//	public void setName(String name) {
//		this.name = name;
//	}

	public int getBloodType() {
		return bloodType;
	}

//	public void setBloodType(int blood) {
//		this.blood = blood;
//	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public abstract void attack(Character target);

	public void damaged(int damage) {
		System.out.println(this.name + "に" + damage + "のダメージ！");
		this.hp = Math.max(0, (this.hp - damage));
	}

	public boolean isAlive() {
		if (this.hp > 0) {
			return true;
		} else {
			return false;
		}
	}
}
