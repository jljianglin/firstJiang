package cn.jbit.pb.tangcco.command;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import cn.jbit.pb.tangcco.command.util.Util;





public class DbProperties extends Properties {

	private static DbProperties instance;
	
	public static synchronized void makeInstance(){
		if(instance==null){
			instance = new DbProperties();
		}
	}
	public static DbProperties getInstance(){
		if(instance!=null){
			return instance;
		}else{
			makeInstance();
			return instance;
		}
		
		
	}
	private DbProperties(){
		InputStream is = getClass().getResourceAsStream(Util.DBFILENAME);
		
		try {
			this.load(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
