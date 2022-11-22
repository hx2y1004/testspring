package com.test.Entity;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PostsRepository extends JpaRepository<Posts, Long>{

	//기본적 CRUD 메소드 자동 생성 해준다. save, update, delete.. 자동적으로 쿼리를 해준다. 명시하지 않아도.
	//사용할 쿼리문들 작성
	//jpa 쿼리 작성 법 검색하여 사용하시면될듯.. 
	
	@Query("SELECT p from Posts p ORDER BY p.id DESC")
	List<Posts> findAllDesc();
	//조회용 프레임워크 사용

	List<Posts> findByTitleContaining(String title);
	//Containing을 붙이면 like 검색 
}
