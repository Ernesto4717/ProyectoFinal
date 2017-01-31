package com.softtek.academy.end.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;



@Embeddable
public class CartDetails implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "lines_amount")
	private Double linesAmount;
	
	@Column(name = "shipping_amount")
	private Double shippingAmount;
	
	@Column(name = "cart_amount")
	private Double cartAmount;
	
	public CartDetails(){
		
	}
	
	
	public CartDetails(Double linesAmount, Double shippingAmount, Double cartAmount) {
		super();
		this.linesAmount = linesAmount;
		this.shippingAmount = shippingAmount;
		this.cartAmount = cartAmount;
	}
	
	@Override
	public String toString() {
		return "CartDetails [linesAmount=" + linesAmount + ", shippingAmount=" + shippingAmount + ", cartAmount="
				+ cartAmount + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cartAmount == null) ? 0 : cartAmount.hashCode());
		result = prime * result + ((linesAmount == null) ? 0 : linesAmount.hashCode());
		result = prime * result + ((shippingAmount == null) ? 0 : shippingAmount.hashCode());
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
		CartDetails other = (CartDetails) obj;
		if (cartAmount == null) {
			if (other.cartAmount != null)
				return false;
		} else if (!cartAmount.equals(other.cartAmount))
			return false;
		if (linesAmount == null) {
			if (other.linesAmount != null)
				return false;
		} else if (!linesAmount.equals(other.linesAmount))
			return false;
		if (shippingAmount == null) {
			if (other.shippingAmount != null)
				return false;
		} else if (!shippingAmount.equals(other.shippingAmount))
			return false;
		return true;
	}

	public Double getLinesAmount() {
		return linesAmount;
	}

	public void setLinesAmount(Double linesAmount) {
		this.linesAmount = linesAmount;
	}

	public Double getShippingAmount() {
		return shippingAmount;
	}

	public void setShippingAmount(Double shippingAmount) {
		this.shippingAmount = shippingAmount;
	}

	public Double getCartAmount() {
		return cartAmount;
	}

	public void setCartAmount(Double cartAmount) {
		this.cartAmount = cartAmount;
	}
}
