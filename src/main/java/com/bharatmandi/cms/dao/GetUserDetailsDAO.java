package com.bharatmandi.cms.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bharatmandi.cms.dto.UserDetails;

public interface GetUserDetailsDAO extends JpaRepository<UserDetails, Integer> {

	public List<UserDetails> findByReportsTo(int userId);
}
