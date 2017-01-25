package com.softtek.academy.end.services;

import java.util.List;

import com.softtek.academy.end.domain.Item;
import com.softtek.academy.end.repository.ItemRepository;

public class ItemServiceImpl implements ItemService {
	
	private ItemRepository itemRepo;

	@Override
	public List<Item> itemList() {
		return itemRepo.findAll();
	}

}
