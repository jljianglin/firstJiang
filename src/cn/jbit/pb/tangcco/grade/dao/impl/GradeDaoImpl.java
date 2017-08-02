package cn.jbit.pb.tangcco.grade.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.jbit.pb.tangcco.command.base.dao.impl.BaseDaoImpl;
import cn.jbit.pb.tangcco.command.conn.ConnectionManager;
import cn.jbit.pb.tangcco.grade.dao.GradeDao;
import cn.jbit.pb.tangcco.grade.entity.Grade;

public class GradeDaoImpl extends BaseDaoImpl implements GradeDao {

	public int CountGrade() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int addGrade(Grade grade) {

		Connection conn = ConnectionManager.getConnection();
		String sql = "INSERT INTO grade VALUES(NULL,?)";
		PreparedStatement pstmt = null;
		int rows = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, grade.getGradename());
			rows = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.closeConn(conn, pstmt);
		}
		return rows;
	}

	public int deleteGrade(int gradeid) {
		Connection conn = ConnectionManager.getConnection();
		String sql = "DELETE FROM grade WHERE gradeid = ?";
		PreparedStatement pstmt = null;
		int rows = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, gradeid);
			rows = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.closeConn(conn, pstmt);
		}
		return rows;
	}

	public Grade detailGrade(int gradeid) {

		Connection conn = ConnectionManager.getConnection();
		String sql = "SELECT * FROM grade WHERE gradeid = ?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Grade grade = new Grade();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, gradeid);
			rs = pstmt.executeQuery();
			if(rs.next()){
				grade.setGradeid(rs.getInt(1));
				grade.setGradename(rs.getString(2));
			}else{
				grade = null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.closeConn(conn, pstmt, rs);
		}
		return grade;
	}

	public List<Grade> queryAllGrade() {

		Connection conn = ConnectionManager.getConnection();
		String sql  = "SELECT * FROM grade";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Grade> list = new ArrayList<Grade>();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
//				Grade grade = new Grade();
//				grade.setGradeid(rs.getInt(1));
//				grade.setGradename(rs.getString(2));
//				list.add(grade);
				list.add(new Grade(rs.getInt(1), rs.getString(2)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.closeConn(conn, pstmt, rs);
		}
		return list;
	}

	public int updateGrade(Grade grade) {

		Connection conn = ConnectionManager.getConnection();
		String sql = "UPDATE grade SET gradename = ? WHERE gradeid = ?";
		PreparedStatement pstmt = null;
		int rows = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, grade.getGradename());
			pstmt.setInt(2, grade.getGradeid());
			rows = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.closeConn(conn, pstmt);
		}
		return rows;
	}

}
