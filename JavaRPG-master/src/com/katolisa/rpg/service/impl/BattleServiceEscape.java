package com.katolisa.rpg.service.impl;

import java.util.ArrayList;

import com.katolisa.rpg.character.BloodTypeA;
import com.katolisa.rpg.character.Character;
import com.katolisa.rpg.character.impl.Boss;
import com.katolisa.rpg.service.BattleService;

public class BattleServiceEscape implements BattleService {

	public void battle(ArrayList<Character> party, Boss boss) {
		int turn = 0;

		while(true) {
			turn++;
			System.out.println("---------- " + turn + "ターン目 ----------");

			// 味方パーティの行動
			boolean partyResult = true;

			for (Character character : party) {
				if(character.isAlive() == true && character instanceof BloodTypeA) {
					boolean characterResult = ((BloodTypeA) character).escape();
					if (characterResult == false) {
						partyResult = false;
						break;
					}
				}
			}
			if (partyResult == true) {
				System.out.println("逃走に成功した！");
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
		}
	}
}
