package com.katolisa.rpg.service;

import java.util.ArrayList;

import com.katolisa.rpg.character.Character;
import com.katolisa.rpg.character.impl.Boss;

public interface BattleService {
	void battle(ArrayList<Character> party, Boss boss);
}
