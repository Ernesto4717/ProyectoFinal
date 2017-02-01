package com.softtek.academy.end.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.SqlResultSetMappings;
import javax.persistence.Table;

@Entity
@Table(name="item")
@NamedNativeQueries({	
	@NamedNativeQuery(
			name="findOneItem",
				query="SELECT i.item_id as id,"
						+ " i.description as description,"
						+ " i.unit_price as price,"
						+ " i.stock as stock"
						+ " FROM item i "
						+ " WHERE i.item_id = :itemId",
				resultSetMapping = "ItemMapping")
	})
@SqlResultSetMappings({
	@SqlResultSetMapping(name="ItemMapping",
			classes= {
					@ConstructorResult(
							targetClass = Item.class,
							columns = {
								@ColumnResult(name = "username", type = Integer.class),
								@ColumnResult(name = "password", type = String.class),
								@ColumnResult(name = "name", type = Double.class),
								@ColumnResult(name = "active", type = Integer.class)
							})
			})
	})
public class Item implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="item_id")
	private int id;
	
	@Column(name="description")
	private String description;
	
	@Column(name="unit_price")
	private double price;
	
	@Column(name="stock")
	private int stock;
	
	public Item() {
		super();
	}
	
//	public Item(int id) {
//		super();
//	}

	public Item(int id, String description, double price, int stock) {
		super();
		this.id = id;
		this.description = description;
		this.price = price;
		this.stock = stock;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
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
