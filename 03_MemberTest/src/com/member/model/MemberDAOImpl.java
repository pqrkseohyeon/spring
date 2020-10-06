package com.member.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAOImpl implements MemberDAO {
	@Autowired
	private JdbcTemplate template;

	
	@Override
	public void memberInsert(MemberDTO user) {
		String sql = "insert into springmember values(?,?,?,?,?,sysdate)";
		Object[] param = new Object[] {
			user.getId(), user.getPass(),
			user.getName(), user.getAddr(),
			user.getMemo()
		};
		template.update(sql, param);
		
	}

	@Override
	public List<MemberDTO> getMemberList() {
		String sql = "select*from springmember";
		List<MemberDTO> memberlist = template.query(sql, new RowMapper<MemberDTO>() {

			@Override
			public MemberDTO mapRow(ResultSet rs, int arg1) throws SQLException {
				MemberDTO member = new MemberDTO();
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

	@Override
	public void memberUpdate(MemberDTO user) {
		String sql = "update springmember set name=?,pass=?,addr=?, memo=? where id=?";
		Object[] param = new Object[] {
				user.getName(), user.getPass(),
				user.getAddr(), user.getMemo(),
				user.getId()
		};
		template.update(sql,param);
	}

	@Override
	public void delete(String id) {
		String sql = "delete from springmember where id='"+id+"'";
		template.update(sql);
		
	}

	//상세보기
	@Override
	public MemberDTO findById(String id) {
		String sql = "select*from springmember where id='"+id+"'";
		MemberDTO member = template.queryForObject(sql, new RowMapper<MemberDTO>() {

			@Override
			public MemberDTO mapRow(ResultSet rs, int arg1) throws SQLException {
				MemberDTO user = new MemberDTO();
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

}
