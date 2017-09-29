package com.katolisa.rpg.common;

import static com.katolisa.rpg.common.Constants.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.katolisa.rpg.exception.FirstArgumentException;
import com.katolisa.rpg.exception.SecondArgumentException;

public class Utils {

	public static void validateArguments(String args[]) throws FirstArgumentException, SecondArgumentException {
		if (args == null || args.length < 1) {
			throw new FirstArgumentException("第1引数を指定してください");
		}
		if (args.length < 2) {
			throw new SecondArgumentException("第2引数を指定してください");
		}
		if (!COMMANDS.contains(args[0])) {
			throw new FirstArgumentException("第1引数が不正です");
		}
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(args[1]);
			sdf.format(new Date());
		} catch(IllegalArgumentException e) {
			throw new SecondArgumentException("第2引数が不正です");
		}
	}

}
