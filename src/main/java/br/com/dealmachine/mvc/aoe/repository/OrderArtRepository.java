package br.com.dealmachine.mvc.aoe.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.dealmachine.mvc.aoe.model.OrderArt;
import br.com.dealmachine.mvc.aoe.model.Status;

@Repository
public interface OrderArtRepository extends JpaRepository<OrderArt, Integer>{

		
		List<OrderArt> findByStatus(@Param("status") Status status);
		
		@Query("select p from OrderArt p join p.user u where u.username = :username")
		List<OrderArt> findAllByUser(@Param("username") String username);
}
