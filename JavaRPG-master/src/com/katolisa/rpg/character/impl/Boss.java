package com.katolisa.rpg.character.impl;

import static com.katolisa.rpg.common.Constants.*;

import java.util.List;

import com.katolisa.rpg.character.BloodTypeAB;
import com.katolisa.rpg.character.Character;

public class Boss extends Character implements BloodTypeAB {

	private boolean isDefending = false;

	public Boss(String name, int hp, int bloodType) {
		super(name, hp, bloodType);
	}

	public boolean isDefending() {
		return isDefending;
	}

	public void setDefending(boolean isDefending) {
		this.isDefending = isDefending;
	}

	@Override
	public void damaged(int damage) {
		if(isDefending == true) {
			damage /= 2;
		}
		super.damaged(damage);
	}

	public void attack(Character target) {
		System.out.println(this.getName() + "は" + target.getName() + "を攻撃した");
		target.damaged(POWER_BOSS);
	}

	public void defend() {
		System.out.println(this.getName() + "は防御した");
		this.isDefending = true;
	}

	public void endlessAttack(List<Character> targets) {
		for (Character target : targets) {
			while (target.isAlive() == true) {
				this.attack(target);
			}
			System.out.println(target.getName() + "は力尽きた");
		}
	}
}
