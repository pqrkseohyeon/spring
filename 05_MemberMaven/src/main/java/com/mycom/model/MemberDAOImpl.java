package com.mycom.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAOImpl implements MemberDAO{

	@Autowired
	private JdbcTemplate template;
	
	//추가하기
	@Override
	public void dao_insert(Member member) {
		String sql = "insert into springmember values(?,?,?,?,?,sysdate)";
		Object[] param = new Object[] {
				member.getId(), member.getPass(),
				member.getName(), member.getAddr(),
				member.getMemo()
		};
		template.update(sql, param);
		
	}

	//전체보기(검색포함)
	@Override
	public List<Member> dao_list(String field, String word) {
		String sql ="";
		if(word.equals("")) {
			sql = "select*from springmember";
		}else {
			sql = "select*from springmember where "+field+" like'%"+word+"%'";
		}
		 
		List<Member> memberlist = template.query(sql, new RowMapper<Member>() {

			@Override
			public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
				Member member = new Member();
				member.setId(rs.getString("id"));
				member.setPass(rs.getString("pass"));
				member.setName(rs.getString("name"));
				member.setAddr(rs.getString("addr"));
				member.setMemo(rs.getString("memo"));
				member.setReg_date(rs.getString("reg_date"));
				return member;
			}
			
		});
		return memberlist;
	}

	//상세보기
	@Override
	public Member dao_findById(String id) {
		String sql = "select*from springmember where id='"+id+"'";
		Member member = template.queryForObject(sql, new RowMapper<Member>() {

			@Override
			public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
				Member user = new Member();
				user.setId(rs.getString("id"));
				user.setPass(rs.getString("pass"));
				user.setName(rs.getString("name"));
				user.setAddr(rs.getString("addr"));
				user.setMemo(rs.getString("memo"));
				user.setReg_date(rs.getString("reg_date"));
				return user;
			}
			
		});
		return member;
	}

	//수정하기
	@Override
	public void dao_update(Member member) {
		String sql = "update springmember set name=?,pass=?,addr=?,memo=? where id=?";
		Object[] param = new Object[] {
				member.getName(),member.getPass(),
				member.getAddr(),member.getMemo(),
				member.getId()
		};
		template.update(sql,param);
		
	}

	//삭제하기
	@Override
	public void dao_delete(String id) {
		String sql = "delete from springmember where id='"+id+"'";
		template.update(sql);
		
	}

}
