package com.person.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class PerDAOImpl implements PerDAO {
	@Autowired
	private JdbcTemplate template;

	//추가하기
	@Override
	public void perInsert(Person p) {
		String sql="insert into person values(?,?,?,?,?)";
		Object[] param = new Object[] {
			p.getId(), p.getName(),
			p.getPassword(), p.getGender(),
			p.getJob()
		};
		template.update(sql,param);
		
	}

	//전체보기
	@Override
	public List<Person> perList() {
		String sql = "select*from person";
		List<Person> personlist = template.query(sql, new RowMapper<Person>(){

			@Override
			public Person mapRow(ResultSet rs, int arg1) throws SQLException {
				Person user = new Person();
				user.setGender(rs.getString("gender"));
				user.setId(rs.getString("id"));
				user.setJob(rs.getString("job"));
				user.setName(rs.getString("name"));
				user.setPassword(rs.getString("password"));
				return user;
			}
			
		});
		return personlist;
	}

	//수정하기
	@Override
	public void perUpdate(Person p) {
		String sql = "update person set name=?,job=?,password=? where id=?";
		Object[] param = new Object[] {
				p.getName(),p.getJob(),
				p.getPassword(),p.getId()
		};
		template.update(sql,param);
	}

	//삭제하기
	@Override
	public void perDelete(String id) {
		String sql = "delete from person where id='"+id+"'";
		template.update(sql);
		
	}

	//상세보기
	@Override
	public Person perView(String id) {
		String sql = "select*from person where id='"+id+"'";
		Person person = template.queryForObject(sql, new RowMapper<Person>() {

			@Override
			public Person mapRow(ResultSet rs, int arg1) throws SQLException {
				Person user = new Person();
				user.setGender(rs.getString("gender"));
				user.setId(rs.getString("id"));
				user.setJob(rs.getString("job"));
				user.setName(rs.getString("name"));
				user.setPassword(rs.getString("password"));
				return user;
			}
			
		});
		return person;
	}

}
