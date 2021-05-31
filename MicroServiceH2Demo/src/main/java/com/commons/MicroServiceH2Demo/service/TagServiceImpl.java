package com.commons.MicroServiceH2Demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.commons.MicroServiceH2Demo.entity.Tag;
import com.commons.MicroServiceH2Demo.repository.TagRepository;

@Service
public class TagServiceImpl implements TagService {

	@Autowired
	TagRepository repository;
	
	@Override
	public Tag post(Tag entity) {
		return repository.save(entity);
	}

	@Override
	public List<Tag> get() {
		return repository.findAll();
	}

	@Override
	public Tag put(Tag entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(Tag entity) {
		repository.delete(entity);
	}
}
