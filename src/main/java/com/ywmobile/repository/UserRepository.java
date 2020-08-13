package com.ywmobile.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ywmobile.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
	// 이것만으로 DB에 데이터 처리가 가능
}
