package br.com.dealmachine.mvc.aoe.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.dealmachine.mvc.aoe.model.OrderArt;

@Repository
public class OrderArtRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public List<OrderArt> getOrders(){		
		
		Query query = entityManager.createQuery("select p from OrderArt p", OrderArt.class);
		
		List<OrderArt> orderArts = query.getResultList();
		
		return orderArts;
	}
}
