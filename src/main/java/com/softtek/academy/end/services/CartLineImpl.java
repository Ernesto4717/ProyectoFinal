package com.softtek.academy.end.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softtek.academy.end.domain.CartLine;
import com.softtek.academy.end.repository.CartLineRepository;

@Service
public class CartLineImpl implements CartLineService {
	
	@Autowired
	private CartLineRepository cartLineRepo;

	@Override
	public List<CartLine> listByCartId(Long id) {
		System.out.println(id);
		return cartLineRepo.findCartLinesByCartId(id);
	}

	@Override
	public boolean addCartLine() {
		// TODO Auto-generated method stub
		return false;
	}

}
