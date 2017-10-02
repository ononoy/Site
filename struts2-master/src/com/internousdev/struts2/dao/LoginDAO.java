package com.internousdev.struts2.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.struts2.dto.LoginDTO;
import com.internousdev.struts2.util.DBConnector;
import com.mysql.jdbc.Connection;

/**
 * <p>
 * ログイン認証をおこなう為のDAOクラスです。<br>
 * ログイン画面にて入力された情報についてデータベースのテーブルを操作します。<br>
 * また、セッションにユーザ名を登録して、次の画面へ引き継ぎを行います。
 * </p>
 *
 * @author TAKUMA INOUE
 * @since 2017/05/26
 * @version 1.0
 */
public class LoginDAO {
	/**
	 * <p>LoginDAOをインスタンス化する為のデフォルトコンストラクタです。</p>
	 */
	public LoginDAO(){

	}
	/**
	 * <p>ログイン認証をおこなう為の実行メソッドです。<br>
	 * 実行した結果、認証成功か認証失敗かを判断します。</p>
	 * @author TAKUMA INOUE
	 * @since 2017/05/26
	 * @param name ユーザ名
	 * @param password パスワード
	 * @return 実行結果 SUCCESS/ERROR
	 */
	public LoginDTO select(String name, String password) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		LoginDTO dto = new LoginDTO();
		String sql = "select * from user where user_name=? and password=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				dto.setName(rs.getString("user_name"));
				dto.setPassword(rs.getString("password"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dto;
	}
}
