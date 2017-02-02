package com.softtek.academy.end.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softtek.academy.end.domain.Cart;
import com.softtek.academy.end.repository.CartRepository;

@Service
public class CartServiceImpl implements CartService{
	
	@Autowired
	CartRepository cartRepository;
	
	@Override
	public List<Cart> cartList() {
		// TODO Auto-generated method stub
		return cartRepository.findAll();
	}

	@Override
	public Cart cart(Long cart_id) {
		// TODO Auto-generated method stub
		return cartRepository.cart(cart_id);
	}

	@Override
	public boolean update(Cart cart) {
		// TODO Auto-generated method stub
		if(isValidCart(cart)){
			cartRepository.save(cart);
			return true;
		}
		
		return false;
	}
	private Boolean isValidCart(final Cart cart) {
		if (cart.getId()== null) {
			return false;
		}
		return true;
	}

}
