/**
 *
 */
package com.internousdev.struts2.util;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

/**
 * <p>MySQLに接続する為のユーティリティクラスです。<br>
 * ルートアカウントにてOPENCONNECTに接続されます。</p>
 * @author TAKUMA INOUE
 * @since 2017/05/26
 * @version 1.0
 */
public class DBConnector {
	/**
	 * JDBCドライバー名
	 */
	private static String driverName = "com.mysql.jdbc.Driver";
	/**
	 * データベース接続URL
	 */
	private static String url = "jdbc:mysql://localhost/openconnect";
	/**
	 * データベース接続ユーザ名
	 */
	private static String user = "root";
	/**
	 * データベース接続パスワード
	 */
	private static String password = "mysql";

public Connection getConnection() {
Connection con = null;
try{
Class.forName(driverName);
con = (Connection) DriverManager.getConnection(url,user,password);
} catch (ClassNotFoundException e) {
e.printStackTrace() ;
} catch (SQLException e) {
e.printStackTrace() ;
}
return con ;
}
}