package com.test.dto;

import com.test.Entity.Posts;

import lombok.Getter;

@Getter
public class PostsListResponseDto {
	private Long id;
	private String title;
	private String contents;
	private String author;
	
	public PostsListResponseDto(Posts posts) {
		this.id = posts.getId();
		this.title = posts.getTitle();
		this.contents = posts.getContents();
		this.author = posts.getAuthor();
	}
}
