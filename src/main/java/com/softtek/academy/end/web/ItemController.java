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

	@RequestMapping(value = "/list")
	public String itemList(Model model) {
		model.addAttribute("items", itemService.itemList());
		return "items";
	}
	
	@RequestMapping(value = "/ListData", method = RequestMethod.GET)
	public ResponseEntity<List<Item>> getAllItems() {
		List<Item> items = itemService.itemList();
		return new ResponseEntity<List<Item>>(items, HttpStatus.OK);
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
