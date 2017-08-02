package cn.jbit.pb.tangcco.command.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import cn.jbit.pb.tangcco.command.DbProperties;





public class ConnectionManager {

	
	
	
	public static synchronized Connection getConnection(){
		DbProperties dbp = DbProperties.getInstance();
		String driverName = dbp.getProperty("driver");
		String url = dbp.getProperty("url");
		String user = dbp.getProperty("user");
		String password = dbp.getProperty("password");
		Connection conn=null;
		
		try {
			Class.forName(driverName);
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	public static synchronized int getPageSize(){
		int pageNumber=0;
		DbProperties dbp = DbProperties.getInstance();
		String tNumber = dbp.getProperty("pageSize");
		if(!tNumber.equals("")){
			pageNumber = Integer.valueOf(tNumber);
			
		}
		return pageNumber;
	}
	
}
