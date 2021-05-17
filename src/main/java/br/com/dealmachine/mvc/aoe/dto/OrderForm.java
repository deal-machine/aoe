package br.com.dealmachine.mvc.aoe.dto;

import br.com.dealmachine.mvc.aoe.model.OrderArt;

public class OrderForm {
	private String product;
	private String urlProduct;
	private String urlImagem;
	private String description;
	
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getUrlProduct() {
		return urlProduct;
	}
	public void setUrlProduct(String urlProduct) {
		this.urlProduct = urlProduct;
	}
	public String getUrlImagem() {
		return urlImagem;
	}
	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public OrderArt toOrderArt() {
		OrderArt orderArt = new OrderArt();
		
		orderArt.setName(product);
		orderArt.setDescription(description);
		orderArt.setUrlImage(urlImagem);
		orderArt.setUrlProduct(urlProduct);
		return orderArt;
	}
	
	
}
