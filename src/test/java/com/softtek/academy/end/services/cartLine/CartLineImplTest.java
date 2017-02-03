package com.softtek.academy.end.services.cartLine;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseOperation;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import com.softtek.academy.end.domain.CartLine;
import com.softtek.academy.end.services.CartLineService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/Cart-Context.xml")
@DatabaseSetup(value = {"/dataset/cartLine/default.xml" },  type = DatabaseOperation.CLEAN_INSERT)
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class, DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class, DbUnitTestExecutionListener.class })
public class CartLineImplTest {
	
	@Autowired
	private CartLineService cartLineService;

	@Test
	public void CartLineServiceImplTest() {
//		CartLine cartLine = new CartLine(1L, 1L, 1, 20L);
		List<CartLine> cartLines = cartLineService.listByCartId(1L);
		Assert.assertTrue(cartLines.get(0).getId()==1L);
	}

}
