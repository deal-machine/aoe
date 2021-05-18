package br.com.dealmachine.mvc.aoe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.dealmachine.mvc.aoe.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
		
	User findByUsername(String username);
}
