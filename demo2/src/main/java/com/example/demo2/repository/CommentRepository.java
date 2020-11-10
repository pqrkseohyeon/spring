package com.example.demo2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.demo2.model.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
	
	@Modifying
	@Query(value = "insert into comment(bnum, content, regdate) values(?1, ?2, now())",
			nativeQuery = true)
	public void commentInsert(Long bnum, String content);
	
	@Query("SELECT sc from Comment sc where bnum=?1")
	List<Comment> findByBnum(Long bnum);

}
