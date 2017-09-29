package com.katolisa.rpg.service.impl;

import java.util.ArrayList;

import com.katolisa.rpg.character.Character;
import com.katolisa.rpg.character.impl.Boss;
import com.katolisa.rpg.service.BattleService;

public class BattleServiceAttack implements BattleService {

	public void battle(ArrayList<Character> party, Boss boss) {
		int turn = 0;

		while(true) {
			turn++;
			System.out.println("---------- " + turn + "ターン目 ----------");

			// 味方パーティの行動
			for (Character character : party) {
				if(character.isAlive() == true) {
					character.attack(boss);
				}
			}
			if (boss.isAlive() == false) {
				System.out.println(boss.getName() + "を倒した！");
				break;
			}

			// ボスの行動
			boss.setDefending(false);
			if (turn % 2 == 1) {
				boss.defend();
			} else {
				/* ランダム攻撃
				int random = new Random().nextInt(party.size());
				Character target = party.get(random);
				while(target.isAlive() == false) {
					random = new Random().nextInt(party.size());
					target = party.get(random);
				}
				boss.attack(target);

				if (target.isAlive() == false) {
					System.out.println(target.getName() + "は力尽きた");
				}
				*/

				//連続攻撃
				boss.endlessAttack(party);
			}

			// パーティの全滅チェック
			boolean isPartyAlive = false;
			for (Character character : party) {
				if ((isPartyAlive = character.isAlive()) == true) {
					break;
				}
			}
			if (isPartyAlive == false) {
				System.out.println("味方が全滅した…");
				break;
			}

			// 各キャラの残りHP表示
			for (Character character : party) {
				System.out.println(character.getName() + "の残りHP：" + character.getHp());
			}
			System.out.println(boss.getName() + "の残りHP：" + boss.getHp());
		}
	}
}
