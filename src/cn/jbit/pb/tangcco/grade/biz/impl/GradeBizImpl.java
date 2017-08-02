package cn.jbit.pb.tangcco.grade.biz.impl;

import java.util.List;

import cn.jbit.pb.tangcco.grade.biz.GradeBiz;
import cn.jbit.pb.tangcco.grade.dao.GradeDao;
import cn.jbit.pb.tangcco.grade.dao.impl.GradeDaoImpl;
import cn.jbit.pb.tangcco.grade.entity.Grade;

public class GradeBizImpl implements GradeBiz {
	private GradeDao gdao;
	public GradeBizImpl() {

		gdao = new GradeDaoImpl();
	}

	public int CountGrade() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int addGrade(Grade grade) {
		return gdao.addGrade(grade);
	}

	public int deleteGrade(int gradeid) {
		return gdao.deleteGrade(gradeid);
	}

	public Grade detailGrade(int gradeid) {
		return gdao.detailGrade(gradeid);
	}

	public List<Grade> queryAllGrade() {
		return gdao.queryAllGrade();
	}

	public int updateGrade(Grade grade) {
		return gdao.updateGrade(grade);
	}

}
