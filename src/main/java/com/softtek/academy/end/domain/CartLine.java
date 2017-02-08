package com.softtek.academy.end.domain;

import java.io.Serializable;
import java.util.Date;

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
@Table(name = "cart_line")
@NamedNativeQueries({ @NamedNativeQuery(name = "findCartLinesByCartId", 
query = "SELECT c.cart_line_id as cartLine, "
		+ " ca.cart_id as cartId, " 
		+ " i.item_id as itemId, " 
		+ " c.quantity as quantity, "
		+ " ca.create_user as createUser, " 
		+ " ca.amount as linesAmount, " 
		+ " i.description as itemDesc, "
		+ " i.stock as stock, " 
		+ " ca.create_date as date, " 
		+ " ca.update_date as updatexd, "
		+ " i.unit_price as itemPrice " 
		+ " FROM cart_line c " 
		+ "JOIN cart ca ON ca.cart_id = c.cart_id "
		+ "JOIN item i ON i.item_id = c.item_id " 
		+ "Where c.cart_id= :cartId", resultSetMapping = "CartLineMapping") })
@SqlResultSetMappings({ @SqlResultSetMapping(name = "CartLineMapping", classes = {
		@ConstructorResult(targetClass = CartLine.class, columns = {
				@ColumnResult(name = "cartLine", type = Long.class), 
				@ColumnResult(name = "cartId", type = Long.class),
				@ColumnResult(name = "createUser", type = String.class),
				@ColumnResult(name = "linesAmount", type = Double.class),
				@ColumnResult(name = "itemId", type = int.class), 
				@ColumnResult(name = "itemDesc", type = String.class),
				@ColumnResult(name = "itemPrice", type = Double.class), 
				@ColumnResult(name = "stock", type = int.class),
				@ColumnResult(name = "date", type = Date.class), 
				@ColumnResult(name = "updatexd", type = Date.class),
				@ColumnResult(name = "quantity", type = int.class) }) }) })
public class CartLine implements Serializable {

	/**
	 * 
	 */

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "cart_line_id", unique = true, nullable = false)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "cart_id")
	private Cart cart;

	@ManyToOne
	@JoinColumn(name = "item_id")
	private Item item;

	@Column(name = "quantity")
	private int quantity;

	public CartLine() {
		super();
	}

	public CartLine(Long id, Long cartId, String createUser, Double linesAmount, int itemId, String itemDesc,
			Double itemPrice, int stock, Date date, Date update, int quantity) {
		super();
		this.id = id;
		this.cart = new Cart(cartId,createUser, linesAmount,  date, update);
		this.item = new Item(itemId, itemDesc, itemPrice, stock);
		this.quantity = quantity;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cart == null) ? 0 : cart.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((item == null) ? 0 : item.hashCode());
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
		CartLine other = (CartLine) obj;
		if (cart == null) {
			if (other.cart != null)
				return false;
		} else if (!cart.equals(other.cart))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (item == null) {
			if (other.item != null)
				return false;
		} else if (!item.equals(other.item))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CartLine [id=" + id + ", cart=" + cart + ", item=" + item + ", quantity=" + quantity + "]";
	}

}
