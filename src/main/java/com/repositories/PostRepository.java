package com.repositories;

import com.models.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface PostRepository extends JpaRepository<Post, UUID> {

    public List<Post> findAllByAuthor(UUID id);

    Optional<Post> findByAuthorAndCreatedAtAfter(UUID author, Date createdAt);

    List<Post> findByAuthor(UUID author);









}
