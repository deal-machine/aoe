package br.com.dealmachine.mvc.aoe.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.dealmachine.mvc.aoe.model.OrderArt;
import br.com.dealmachine.mvc.aoe.model.Status;

@Repository
public interface OrderArtRepository extends JpaRepository<OrderArt, Integer>{

		List<OrderArt> findByStatus(Status status);
}
