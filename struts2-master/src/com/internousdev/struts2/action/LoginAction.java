package com.internousdev.struts2.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.struts2.dao.LoginDAO;
import com.internousdev.struts2.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * <p>ログイン認証をおこなう為のACTIONクラスです。<br>
 * ログイン画面にて入力されたユーザ名とパスワードを判断して、認証成功か認証失敗かを判断します。<br>
 * また、セッションにユーザ名を登録して、次の画面へ引き継ぎを行います。</p>
 * @author TAKUMA INOUE
 * @since 2017/05/26
 * @version 1.0
 */
public class LoginAction extends ActionSupport implements SessionAware {
	/**
	 * <p>LoginActionをインスタンス化する為のデフォルトコンストラクタです。</p>
	 */
	public LoginAction(){
	}
	/**
	 * ユーザ名
	 */
	private String name;
	/**
	 * パスワード
	 */
	private String password;
	/**
	 * セッション情報
	 */
	private Map<String, Object> session;
	/**
	 * <p>ログイン認証をおこなう為の実行メソッドです。<br>
	 * 実行した結果、認証成功か認証失敗かを判断します。</p>
	 * @author TAKUMA INOUE
	 * @since 2017/05/26
	 * @return 実行結果 SUCCESS/ERROR
	 */
	public String execute() {
		String ret = ERROR;
		LoginDAO dao = new LoginDAO();
		LoginDTO dto = new LoginDTO();
		dto = dao.select(name, password);

		if (name.equals(dto.getName())) {
			if (password.equals(dto.getPassword()))
				ret = SUCCESS;
		}
		session.put("name", dto.getName());
		return ret;
	}

	/**
	 * <p>VALUESTACKに登録されたユーザ名を取得してフィールドに登録します。</p>
	 * @return ユーザ名 name
	 */
	public String getName() {
		return name;
	}

	/**
	 * <p>フィールドに登録されたユーザ名をVALUE STACKに登録します。<br>
	 * VALUE STACKに登録されたユーザ名は次の画面へ引き継がれます。</p>
	 * @param name ユーザ名
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * <p>VALUESTACKに登録されたパスワードを取得してフィールドに登録します。</p>
	 * @return パスワード password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <p>フィールドに登録されたパスワードをVALUE STACKに登録します。<br>
	 * VALUE STACKに登録されたパスワードは次の画面へ引き継がれます。</p>
	 * @param password パスワード
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * <p>VALUESTACKに登録されたセッション情報を取得してフィールドに登録します。</p>
	 * @return セッション情報 session
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 * <p>フィールドに登録されたユーザ名をVALUE STACKに登録します。<br>
	 * VALUE STACKに登録されたユーザ名は次の画面へ引き継がれます。</p>
	 * @param session セッション情報
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
