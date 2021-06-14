package com.onurdesk.covid.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onurdesk.covid.model.EmailModel;

@Repository
public interface MailRepository extends JpaRepository<EmailModel, String> {
	
}
