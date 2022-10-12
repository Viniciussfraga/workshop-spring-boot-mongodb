package com.viniciusfraga.workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viniciusfraga.workshopmongo.domain.Post;
import com.viniciusfraga.workshopmongo.repository.PostRepository;
import com.viniciusfraga.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;

	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Post não encontrado"));
	}

}