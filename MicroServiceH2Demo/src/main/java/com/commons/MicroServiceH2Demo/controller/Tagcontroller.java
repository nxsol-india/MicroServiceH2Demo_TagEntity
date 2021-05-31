package com.commons.MicroServiceH2Demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.commons.MicroServiceH2Demo.entity.Tag;
import com.commons.MicroServiceH2Demo.service.TagService;


@RestController
public class Tagcontroller {

	@Autowired
	TagService tagService;
	
	@PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
				produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public Tag post(@RequestBody Tag entity) {
		return tagService.post(entity);
	}

	@GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE})
	public List<Tag> get() {
		return tagService.get();
	}

	@PutMapping(consumes = {MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE})
	public Tag put(@RequestBody Tag entity) {
		return tagService.put(entity);
	}

	@DeleteMapping(consumes = {MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE})
	public void delete(@RequestBody Tag entity) {
		tagService.delete(entity);
	}

}
