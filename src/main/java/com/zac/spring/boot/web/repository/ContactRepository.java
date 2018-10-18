package com.zac.spring.boot.web.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.zac.spring.boot.web.entity.Contact;

/**
 * Created by Zac
 */
public interface ContactRepository extends JpaRepository<Contact, Integer>, JpaSpecificationExecutor<Contact>  {
	List<Contact> findByYourEmail(String email);
}
