package com.softtek.academy.end.services;

import java.util.List;

import com.softtek.academy.end.domain.Cart;

public interface CartService {
	public List<Cart> cartList();
	public Cart cart(Long cart_id);
	public boolean update(Cart cart);
}
