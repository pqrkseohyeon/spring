package com.member.model;

import java.util.List;

import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAOImpl implements MemberDAO{
	
	//template ��� SqlSessionFactory ���
	@Autowired
	private SqlSessionFactory sqlMapper;

	//�߰��ϱ�
	@Override
	public void dao_insert(String sql_Id, MemberVO member) {
		SqlSession sess = sqlMapper.openSession(ExecutorType.REUSE);
		sess.insert(sql_Id,member); //sql_Id="insertData"
		sess.commit();
		
	}

	//��ü����
	@Override
	public List<MemberVO> dao_list(String sql_Id) {
		SqlSession sess = sqlMapper.openSession(ExecutorType.REUSE);
//		List<MemberVO> memberlist = sess.selectList(sql_Id); 
		return sess.selectList(sql_Id);
	}

	//�󼼺���
	@Override
	public MemberVO dao_view(String sql_Id, String id) {
		SqlSession sess = sqlMapper.openSession(ExecutorType.REUSE);
		
		return sess.selectOne(sql_Id,id);
	}

	//�����ϱ�
	@Override
	public void dao_update(String sql_Id, MemberVO member) {
		SqlSession sess = sqlMapper.openSession(ExecutorType.REUSE);
		sess.update(sql_Id, member);
		sess.commit();
		
	}

	//�����ϱ�
	@Override
	public void dao_delete(String sql_Id, String id) {
		SqlSession sess = sqlMapper.openSession(ExecutorType.REUSE);
		sess.delete(sql_Id,id);
		sess.commit();
		
	}

}
