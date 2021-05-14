package br.com.dealmachine.mvc.aoe.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.dealmachine.mvc.aoe.model.OrderArt;

@Repository
public interface OrderArtRepository extends JpaRepository<OrderArt, Integer>{

		
}
