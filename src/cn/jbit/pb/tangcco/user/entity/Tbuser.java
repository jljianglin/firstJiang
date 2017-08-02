package cn.jbit.pb.tangcco.user.entity;

public class Tbuser {
	private int userid;
	private String username,password,userroles,nickname;
	public Tbuser() {
	}
	public Tbuser(int userid, String username, String password,
			String userroles, String nickname) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.userroles = userroles;
		this.nickname = nickname;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserroles() {
		return userroles;
	}
	public void setUserroles(String userroles) {
		this.userroles = userroles;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public Tbuser(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Tbuser [nickname=" + nickname + ", password=" + password
				+ ", userid=" + userid + ", username=" + username
				+ ", userroles=" + userroles + "]";
	}
	

}
