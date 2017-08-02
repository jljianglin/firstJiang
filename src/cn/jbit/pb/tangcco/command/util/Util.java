package cn.jbit.pb.tangcco.command.util;

public class Util {

	public static final String DBFILENAME="/cn/jbit/pb/tangcco/command/properties/db.properties";
	public static int getTotalPages(int totalPosts,int pageSize){
		int totalPages = 1;
		totalPages=totalPosts/pageSize + ((totalPosts%pageSize)>0?1:0);
		return totalPages;
	}
	
	
}
