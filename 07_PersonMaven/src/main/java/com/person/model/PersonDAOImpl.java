package com.person.model;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDAOImpl implements PersonDAO {
	
	@Autowired
	private SqlSessionFactory sqlMapper;

	//추가하기
	@Override
	public void dao_Insert(String sql_ID, PersonDTO person) {
		SqlSession sess = sqlMapper.openSession(ExecutorType.REUSE);
		sess.insert(sql_ID,person);
		sess.commit();
		
	}

	//전체보기
	@Override
	public List<PersonDTO> dao_findAll(String sql_ID, HashMap<String, String> hm) {
		SqlSession sess = sqlMapper.openSession(ExecutorType.REUSE);
		return sess.selectList(sql_ID,hm);
	}

	//상세보기
	@Override
	public PersonDTO dao_findById(String sql_ID, String id) {
		SqlSession sess = sqlMapper.openSession(ExecutorType.REUSE);
		return sess.selectOne(sql_ID,id);
	}

	//수정하기
	@Override
	public void dao_Update(String sql_ID, PersonDTO person) {
		SqlSession sess = sqlMapper.openSession(ExecutorType.REUSE);
		sess.update(sql_ID,person);
		sess.commit();
		
	}

	//삭제하기
	@Override
	public void dao_Delete(String sql_ID, String id) {
		SqlSession sess = sqlMapper.openSession(ExecutorType.REUSE);
		sess.delete(sql_ID,id);
		sess.commit();
		
	}

	// 전체 회원 수 
	@Override
	public int dao_count(String sql_ID) {
		SqlSession sess = sqlMapper.openSession(ExecutorType.REUSE);
		int count = (Integer) sess.selectOne(sql_ID);
		return count;
	}

}
