package com.softtek.academy.end.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.softtek.academy.end.domain.Item;
import com.softtek.academy.end.services.ItemService;

@RequestMapping(value = "/Item")
@Controller
public class ItemController {

	@Autowired
	ItemService itemService;
	
	@RequestMapping(value="/home")
	public String home(){
		return "itemHome";
	}

	@RequestMapping(value = "/List")
	public String itemList(Model model) {
		model.addAttribute("items", itemService.itemList());
		return "items";
	}
	
	@RequestMapping(value = "/ListData", method = RequestMethod.GET)
	public ResponseEntity<List<Item>> getAllItems() {
		List<Item> items = itemService.itemList();
		return new ResponseEntity<List<Item>>(items, HttpStatus.OK);
	}
	
	@RequestMapping(value="/edit")
	public String edit(){
		return "editItem";
	}
	
	@RequestMapping(value="/editData")
	public ResponseEntity<Item> editItem(@RequestParam int itemId) {
		Item item = itemService.findItemById(itemId);
		return new ResponseEntity<Item>(item, HttpStatus.OK);
	}
	

	@RequestMapping(value = "/create")
	public String createItem() {
		return "createItem";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addItem(@RequestBody Item item) {

		if (itemService.createItem(item)) {
			return "items";
		}
		return "createItem";
	}
}
