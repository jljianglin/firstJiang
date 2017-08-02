package cn.jbit.pb.tangcco.grade.biz;

import java.util.List;

import cn.jbit.pb.tangcco.grade.entity.Grade;

public interface GradeBiz {

	public List<Grade> queryAllGrade();
	public int CountGrade();
	public Grade detailGrade(int gradeid);
	
	public int addGrade(Grade grade);
	public int updateGrade(Grade grade);
	public int deleteGrade(int gradeid);
}
