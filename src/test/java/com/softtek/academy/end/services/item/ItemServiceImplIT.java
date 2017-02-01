package com.softtek.academy.end.services.item;

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
import com.github.springtestdbunit.annotation.ExpectedDatabase;
import com.softtek.academy.end.domain.Item;
import com.softtek.academy.end.services.ItemService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/Item-Context.xml")
@DatabaseSetup(value = { "/dataset/item/default.xml" }, type = DatabaseOperation.CLEAN_INSERT)
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class, DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class, DbUnitTestExecutionListener.class })
public class ItemServiceImplIT {

	@Autowired
	ItemService itemService;
	
	@Test
	public void shouldTrueWhenListIsOK() {
		itemService.itemList();
		Assert.assertNotNull(itemService);
	}
	
	@Test
	@ExpectedDatabase("/dataset/item/updateExpected.xml")
	public void shouldTrueWhenCreateIsOK(){
		Item item = new Item(2,"producto 2",234.23,20);
		itemService.createItem(item);
	}

}
