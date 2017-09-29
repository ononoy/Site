package com.katolisa.rpg.common;

import java.util.Arrays;
import java.util.List;

public class Constants {
	private Constants() {
		// インスタンスの生成禁止
	}

	// コマンド
	public static final String ATTACK = "attack";
	public static final String SUMMON  = "summon";
	public static final String ESCAPE = "escape";
	public static final List<String> COMMANDS = Arrays.asList(ATTACK, SUMMON, ESCAPE);

	// 血液型
	public static final int A = 0;
	public static final int B = 1;
	public static final int O = 2;
	public static final int AB = 3;

	// 攻撃力
	public static final int POWER_HERO = 50;
	public static final int POWER_WIZARD = 50;
	public static final int POWER_SAGE = 10000;
	public static final int POWER_BOSS = 50;

	// 初期HP
	public static final int HP_HERO = 100;
	public static final int HP_WIZARD = 50;
	public static final int HP_SAGE = 50;
	public static final int HP_BOSS = 10000;

}