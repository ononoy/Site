package com.katolisa.rpg.character.impl;

import static com.katolisa.rpg.common.Constants.*;

import java.util.Random;

import com.katolisa.rpg.character.BloodTypeB;
import com.katolisa.rpg.character.Character;

public class Sage extends Character implements BloodTypeB {

	public Sage(String name, int hp, int bloodType) {
		super(name, hp, bloodType);
	}

	public void attack(Character target) {
		int random = new Random().nextInt(5);
		if (random < 1) {
			System.out.println(this.getName() + "は" + target.getName() + "を攻撃した");
			target.damaged(POWER_SAGE);
		} else {
			this.sleep();
		}
	}

	public void sleep() {
		System.out.println(this.getName() + "は眠っている…");
	}
}
