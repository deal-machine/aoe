package br.com.dealmachine.mvc.aoe.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class OrderArt {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private BigDecimal value;
	private LocalDate dateDelivery;
	private String urlProduct;
	private String urlImage;
	private String description;
	
	@Enumerated(EnumType.STRING)
	private Status status;
	
	public Status getStatus() {
		return status;
	}
	
	public void setStatus(Status status) {
		this.status = status;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateDelivery == null) ? 0 : dateDelivery.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((urlImage == null) ? 0 : urlImage.hashCode());
		result = prime * result + ((urlProduct == null) ? 0 : urlProduct.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getValue() {
		return value;
	}
	public void setValue(BigDecimal value) {
		this.value = value;
	}
	public LocalDate getDateDelivery() {
		return dateDelivery;
	}
	public void setDateDelivery(LocalDate dateDelivery) {
		this.dateDelivery = dateDelivery;
	}
	public String getUrlProduct() {
		return urlProduct;
	}
	public void setUrlProduct(String urlProduct) {
		this.urlProduct = urlProduct;
	}
	public String getUrlImage() {
		return urlImage;
	}
	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
