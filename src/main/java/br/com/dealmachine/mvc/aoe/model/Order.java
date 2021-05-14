package br.com.dealmachine.mvc.aoe.model;

//import java.math.BigDecimal;
//import java.time.LocalDate;

public class Order {
	private String name;
	private Double value;
	private String dateDelivery;
	private String urlProduct;
	private String urlImage;
	private String description;
	
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
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (dateDelivery == null) {
			if (other.dateDelivery != null)
				return false;
		} else if (!dateDelivery.equals(other.dateDelivery))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (urlImage == null) {
			if (other.urlImage != null)
				return false;
		} else if (!urlImage.equals(other.urlImage))
			return false;
		if (urlProduct == null) {
			if (other.urlProduct != null)
				return false;
		} else if (!urlProduct.equals(other.urlProduct))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}
	public String getDateDelivery() {
		return dateDelivery;
	}
	public void setDateDelivery(String dateDelivery) {
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
