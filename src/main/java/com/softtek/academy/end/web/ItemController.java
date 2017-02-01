package com.softtek.academy.end.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.softtek.academy.end.domain.Item;
import com.softtek.academy.end.services.ItemService;

@RequestMapping(value="/item")
@Controller
public class ItemController {

	@Autowired
	ItemService itemService;
	
	@RequestMapping(value="/list")
	public String itemList(Model model){
		model.addAttribute("items", itemService.itemList());
		return "items";
	}
	
	@RequestMapping(value="/create")
	public String createItem(){
		return "createItem";
	}
	
	@RequestMapping(value="/add", method = RequestMethod.POST)
	public String addItem(@RequestParam Item item ){
		if(itemService.createItem(item)){
			return "items";
		}
		return "createItem";
	}
}
