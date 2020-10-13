package com.member.model;

import java.util.List;

import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAOImpl implements MemberDAO{
	@Autowired
	private SqlSessionFactory sqlMapper;
	
	//추가하기
	@Override
	public void dao_insert(String sql_Id, MemberVO member) {
		SqlSession sess = sqlMapper.openSession(ExecutorType.REUSE);
		sess.insert(sql_Id,member);
		sess.commit();
		
	}

	//전체보기
	@Override
	public List<MemberVO> dao_list(String sql_Id) {
		SqlSession sess = sqlMapper.openSession(ExecutorType.REUSE);	
		return sess.selectList(sql_Id);
	}

	@Override
	public MemberVO dao_view(String sql_Id, String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void dao_update(String sql_Id, MemberVO member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dao_delete(String sql_Id, String id) {
		// TODO Auto-generated method stub
		
	}

}
