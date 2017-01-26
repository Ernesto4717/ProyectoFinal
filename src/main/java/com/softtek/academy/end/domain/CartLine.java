package com.softtek.academy.end.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.SqlResultSetMappings;
import javax.persistence.Table;

@Entity
@Table(name="cart_line")
@NamedNativeQueries({
	@NamedNativeQuery(name="findCartLinesByCartId",
			query="SELECT c.cart_line_id as cartLine,"
					+ " c.cart_id as cartId, "
					+ " c.item_id as itemId, "
					+ " c.quantity as quantity"
					+ " From cart_line c"
					+ " Where c.cart_id = :cartId",
					resultSetMapping="CartLineMapping")
})
@SqlResultSetMappings({
	@SqlResultSetMapping(name="CartLineMapping",
	classes= {
			@ConstructorResult(
					targetClass= CartLine.class,
					columns={
							@ColumnResult(name="cartLine", type=Integer.class),
							@ColumnResult(name="cartId", type=Integer.class),
							@ColumnResult(name="itemId", type=Integer.class),
							@ColumnResult(name="quantity", type=Integer.class)
					})
	})
})
public class CartLine implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="cart_line_id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "cart_id")
	private Cart cart;
	
	@ManyToOne
	@JoinColumn(name="item_id")
	private Item item;
	
	@Column(name="quantity")
	private int quantity;

	public CartLine() {
		super();
	}

	public CartLine(int id, Cart cart, Item item, int quantity) {
		super();
		this.id = id;
		this.cart = cart;
		this.item = item;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
}
