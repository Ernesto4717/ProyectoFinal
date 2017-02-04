package com.softtek.academy.end.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softtek.academy.end.domain.CartLine;
import com.softtek.academy.end.repository.CartLineRepository;
import com.softtek.academy.end.repository.CartRepository;
import com.softtek.academy.end.repository.ItemRepository;

@Service
public class CartLineImpl implements CartLineService {
	
	@Autowired
	private CartLineRepository cartLineRepo;
	
	@Autowired
	private CartRepository cartRepo;
	
	@Autowired
	private ItemRepository itemRepo;

	@Override
	public List<CartLine> listByCartId(Long id) {
		System.out.println(id);
		return cartLineRepo.findCartLinesByCartId(id);
	}

	@Override
	public boolean addCartLine(int itemId, Long cartId) {
		//Method to add a cart line to the database, will return true
		//if the addition its ok, otherwise it will return false.
		CartLine cartLine= new CartLine();
		cartLine.setId((long) (cartRepo.findAll().size()));
		cartLine.setCart(cartRepo.cart(cartId));
		cartLine.setItem(itemRepo.findItemById(itemId));
		cartLine.setQuantity(1);
		cartLineRepo.save(cartLine);
		
		return true;
	}

}
