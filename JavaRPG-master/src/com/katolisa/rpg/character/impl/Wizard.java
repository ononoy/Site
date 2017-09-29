package com.katolisa.rpg.character.impl;

import static com.katolisa.rpg.common.Constants.*;

import java.util.Random;

import com.katolisa.rpg.character.BloodTypeA;
import com.katolisa.rpg.character.Character;

public class Wizard extends Character implements BloodTypeA {

	public Wizard(String name, int hp, int bloodType) {
		super(name, hp, bloodType);
	}

	public void attack(Character target) {
		System.out.println(this.getName() + "は" + target.getName() + "を攻撃した");
		target.damaged(POWER_WIZARD);
	}

	public boolean escape() {
		System.out.println(this.getName() + "は逃げ出そうとした");

		int random = new Random().nextInt(3);
		if (random < 1) {
			System.out.println("うまく逃げ切れた！");
			return true;
		} else {
			System.out.println("しかし逃げ切れなかった…");
			return false;
		}
	}

	public Sage summon() {
		System.out.println(this.getName() + "は賢者を召還した");
		Sage sage = new Sage("けんじゃ", HP_SAGE, B);
		return sage;
	}
}
