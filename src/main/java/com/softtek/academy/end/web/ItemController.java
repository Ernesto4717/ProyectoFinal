package com.softtek.academy.end.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.softtek.academy.end.services.ItemService;

@Controller
public class ItemController {

	@Autowired
	ItemService itemService;
	
	@RequestMapping(value="/item/list")
	public String itemList(Model model){
		model.addAttribute("items", itemService.itemList());
		return "items";
	}
}
