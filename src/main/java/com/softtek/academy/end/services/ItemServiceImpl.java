package com.softtek.academy.end.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softtek.academy.end.domain.Item;
import com.softtek.academy.end.repository.ItemRepository;

@Service
public class ItemServiceImpl implements ItemService {
	
	@Autowired
	private ItemRepository itemRepo;

	@Override
	public List<Item> itemList() {
		return itemRepo.findAll();
	}

	@Override
	public Item findItemById(int id) {
		// TODO Auto-generated method stub
		return itemRepo.findItemById(id);
	}

	@Override
	public boolean createItem(Item item) {
		// TODO Auto-generated method stub
		itemRepo.save(item);
		return true;
	}

}
