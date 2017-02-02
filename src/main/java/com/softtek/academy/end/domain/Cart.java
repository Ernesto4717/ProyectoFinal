package com.softtek.academy.end.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Embedded;
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
@Table(name = "cart")
@NamedNativeQueries({ @NamedNativeQuery(name = "findOneCart", 
query = "SELECT c.cart_id as cart_key, "
		+ "c.lines_amount as linesAmount, " 
		+ "c.shipping_amount as shippingAmount, " 
		+ "c.create_date as createdate, " 
		+ "c.update_date as updatedate "
		+ " FROM cart c " 
		+ "WHERE c.cart_id = :cartId ", resultSetMapping = "CartsMapping") })
@SqlResultSetMappings({ @SqlResultSetMapping(name = "CartsMapping", classes = {
		@ConstructorResult(targetClass = Cart.class, columns = { @ColumnResult(name = "cart_key", type = Long.class),
				@ColumnResult(name = "linesAmount", type = Double.class),
				@ColumnResult(name = "shippingAmount", type = Double.class),
				@ColumnResult(name = "cartAmount", type = Double.class),
				@ColumnResult(name = "createdate", type = Date.class),
				@ColumnResult(name = "updatedate", type = Date.class) }) }) })

public class Cart implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "cart_id", unique=true , nullable = false)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	@Column(name="amount")
	private Double amount;

	@Embedded
	private Audit audit;

	public Cart() {
		super();
	}

	public Cart(final Long cart_key, final Double linesAmount, final Double shippingAmount, final Double cartAmount, final Date date,
			final Date update) {
		super();
		this.id = cart_key;
		this.audit = new Audit(date, update);
	}

	public Cart(final Long cart_key, final Double linesAmount, final Double shippingAmount, final Double cartAmount,
			final Long ship_to_id, final Long status_id) {
		super();
		this.id = cart_key;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((audit == null) ? 0 : audit.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Cart other = (Cart) obj;
		if (audit == null) {
			if (other.audit != null)
				return false;
		} else if (!audit.equals(other.audit))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Audit getAudit() {
		return audit;
	}

	public void setAudit(Audit audit) {
		this.audit = audit;
	}

}
