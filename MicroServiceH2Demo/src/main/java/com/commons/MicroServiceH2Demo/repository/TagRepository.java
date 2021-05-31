package com.commons.MicroServiceH2Demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.commons.MicroServiceH2Demo.entity.Tag;

@Repository
public interface TagRepository extends JpaRepository<Tag,Integer> {
}
