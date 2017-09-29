package com.katolisa.rpg.service.impl;

import java.util.ArrayList;

import com.katolisa.rpg.character.Character;
import com.katolisa.rpg.character.impl.Boss;
import com.katolisa.rpg.character.impl.Sage;
import com.katolisa.rpg.character.impl.Wizard;
import com.katolisa.rpg.service.BattleService;

public class BattleServiceSummon extends BattleServiceAttack implements BattleService {
	private ArrayList<Character> summoned = new ArrayList<>();

	@Override
	public void battle(ArrayList<Character> party, Boss boss) {
		for (Character character : party) {
			if(character instanceof Wizard == true) {
				Sage sage = ((Wizard) character).summon();
				summoned.add(sage);
			}
		}
		party.addAll(summoned);
		super.battle(party, boss);
	}
}
