package com.softtek.academy.end.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.softtek.academy.end.domain.Cart;
import com.softtek.academy.end.domain.CartLine;
import com.softtek.academy.end.services.CartLineService;
import com.softtek.academy.end.services.CartService;

@RequestMapping(value = "/Cart")
@Controller
public class CartController {
	static final Logger logger = LoggerFactory.getLogger(CartController.class);

	@Autowired
	CartService cartService;

	@Autowired
	CartLineService cartLineService;

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String root() {
		return "cartHome";
	}

	@RequestMapping(value = "/List")
	public String List(Model model) {
		return "carts";

	}

	@RequestMapping(value = "/ListData", method = RequestMethod.GET)
	public ResponseEntity<List<Cart>> getAllEmployeesJSON() {
		List<Cart> carts = cartService.cartList();
		return new ResponseEntity<List<Cart>>(carts, HttpStatus.OK);
	}

	@RequestMapping(value = "/edit")
	public String editUser(@RequestParam Long cartId, @RequestParam String status, Model model) {
		Cart cart = cartService.cart(cartId);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("cart", cart);
		map.put("status", status);
		model.addAttribute("map", map);
		return "editCart";

	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updateCart(HttpServletRequest request) {
		return null;
	}

	@RequestMapping(value = "/view")
	public String viewCartLines() {
		return "viewCartLines";
	}

	@RequestMapping(value = "/viewData", method = RequestMethod.GET)
	public ResponseEntity<List<CartLine>> getAllCartLines(@RequestParam Long cartId) {
		return new ResponseEntity<List<CartLine>>((cartLineService.listByCartId(cartId)), HttpStatus.OK);
	}

	@RequestMapping(value = "/createCartLine", method = RequestMethod.GET)
	public ResponseEntity<?> createCartLine(@RequestParam int itemId, @RequestParam Long cartId) {
		System.out.println("golis");
		if (cartLineService.addCartLine(itemId, cartId))
			return new ResponseEntity<String>("", HttpStatus.OK);
		else {
			return new ResponseEntity<String>("", HttpStatus.CONFLICT);
		}
	}
}
