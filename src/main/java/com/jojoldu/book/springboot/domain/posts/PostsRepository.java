package com.jojoldu.book.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<com.jojoldu.book.springboot.domain.posts.Posts,Long> {
}
