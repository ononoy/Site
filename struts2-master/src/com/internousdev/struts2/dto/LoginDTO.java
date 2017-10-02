
package com.internousdev.struts2.dto;

/**
 * <p>
 * ログイン認証をおこなう為のDTOクラスです。<br>
 * ログイン画面にて入力されたユーザ名とパスワード及びIDの各情報をカプセル化します。<br>
 * カプセル化された情報は必要に応じて、DTOクラスの各フィールドへ登録及び各フィールドから値を取り出すことが可能です。
 * </p>
 *
 * @author TAKUMA INOUE
 * @since 2017/05/26
 * @version 1.0
 */
public class LoginDTO {
	/**
	 * <p>LoginDTOをインスタンス化する為のデフォルトコンストラクタです。</p>
	 */
	public LoginDTO(){

	}

	/**
	 * ユーザID
	 */
	private int id;
	/**
	 * ユーザ名
	 */
	private String name;
	/**
	 * パスワード
	 */
	private String password;

	/**
	 * <p>カプセル化されたIDの情報を取得します。</p>
	 * @author TAKUMA INOUE
	 * @since 2017/05/26
	 * @return ユーザID id
	 */
	public int getId() {
		return id;
	}

	/**
	 * <p>カプセル化されたIDへ情報を登録します。</p>
	 * @author TAKUMA INOUE
	 * @since 2017/05/26
	 * @param id ユーザID
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * <p>カプセル化されたユーザ名の情報を取得します。</p>
	 * @author TAKUMA INOUE
	 * @since 2017/05/26
	 * @return ユーザ名 name
	 */
	public String getName() {
		return name;
	}

	/**
	 * <p>カプセル化されたユーザ名の情報を登録します。</p>
	 * @author TAKUMA INOUE
	 * @since 2017/05/26
	 * @param name ユーザ名
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * <p>カプセル化されたパスワードの情報を取得します。</p>
	 * @author TAKUMA INOUE
	 * @since 2017/05/26
	 * @return パスワード password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <p>カプセル化されたパスワードの情報を登録します。</p>
	 * @author TAKUMA INOUE
	 * @since 2017/05/26
	 * @param password パスワード
	 */
	public void setPassword(String password) {
		this.password = password;
	}
}
