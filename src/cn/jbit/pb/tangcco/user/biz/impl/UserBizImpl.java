package cn.jbit.pb.tangcco.user.biz.impl;

import cn.jbit.pb.tangcco.user.biz.UserBiz;
import cn.jbit.pb.tangcco.user.dao.UserDao;
import cn.jbit.pb.tangcco.user.dao.impl.UserDaoImpl;
import cn.jbit.pb.tangcco.user.entity.Tbuser;

public class UserBizImpl implements UserBiz {

	private UserDao udao;
	public UserBizImpl() {

		udao = new UserDaoImpl();
	}
	public Tbuser login(Tbuser users) {
		return udao.login(users);
	}

}
