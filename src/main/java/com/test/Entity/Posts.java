package com.test.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class Posts {
	
	//lombok 활용 
	//setter 메서드 같은경우 값을 변경시키는 메서드는 그 목적을 알 수 있도록 
	//명명해야한다 라는 암묵적 룰에 따라 (restful) 사용 지향
	// 따라서 getter, NoArgsConstructor, RequeiredArgsConstrocut 자주 사용 
	// NoArgsConstructor - 기본 생성자 생성 
	// RequiredArgsConstructor  - final 변수, NotNull 표시가 된 변수처럼 필수적인 정보 세팅하는 생성자 생성
	// AllArgsconstructor - 전체 변수 생성하는 생성자 생성 
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(length=500, nullable=false)
	private String title;
	
	@Column(length=2000, nullable =false)
	private String contents;
	
	private String author;
	
	@Builder
	public Posts(String title, String contents, String author) {
		// 빌더 어노테이션이란? 클래스 레벨에 붙이거나 생성자에 붙이면 빌더 패턴을 자동으로 생성해준다. 
		// 빌더 패턴이란? 복잡한 객체를 생성하는 방법을 정의하는 클래스 와 표현하는 방법을 정의하는 클래스를 
		// 별도로 분리 . 서로 다른 표현이라도 이를 생성할 수 있는 동일한 절차를 제공하는 패턴 
		// 생성자가 많은 경우 빌더 패턴을 사용한다. 
		// 일관성과 불변성을 유지하면서 생성자가 많아도 괜찮다 
		this.title = title;
		this.contents = contents;
		this.author = author;
		
	}
	
	public void update(String title, String contents) {
		this.title = title;
		this.contents = contents;
	}
	
}
