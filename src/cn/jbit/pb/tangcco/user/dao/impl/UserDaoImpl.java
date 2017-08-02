package cn.jbit.pb.tangcco.user.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.jbit.pb.tangcco.command.base.dao.impl.BaseDaoImpl;
import cn.jbit.pb.tangcco.command.conn.ConnectionManager;
import cn.jbit.pb.tangcco.user.dao.UserDao;
import cn.jbit.pb.tangcco.user.entity.Tbuser;

public class UserDaoImpl extends BaseDaoImpl implements UserDao {

	public Tbuser login(Tbuser users) {

		Connection conn = ConnectionManager.getConnection();
		String sql  = "SELECT * FROM tbuser WHERE username = ? AND PASSWORD = ?";
		PreparedStatement pstmt  = null;
		ResultSet rs = null;
		Tbuser user = new Tbuser();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, users.getUsername());
			pstmt.setString(2, users.getPassword());
			rs = pstmt.executeQuery();
			if(rs.next()){
				int i = 1;
				user.setUserid(rs.getInt(i++));
				user.setUsername(rs.getString(i++));
				user.setPassword(rs.getString(i++));
				user.setUserroles(rs.getString(i++));
				user.setNickname(rs.getString(i++));
				
			}else{
				user = null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.closeConn(conn, pstmt, rs);
		}
		
		return user;
	}

}
