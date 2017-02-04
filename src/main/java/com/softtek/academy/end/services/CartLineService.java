package com.softtek.academy.end.services;

import java.util.List;

import com.softtek.academy.end.domain.CartLine;

public interface CartLineService {

	public List<CartLine> listByCartId(Long id);

	public boolean addCartLine(int itemId, Long cartId);
}
