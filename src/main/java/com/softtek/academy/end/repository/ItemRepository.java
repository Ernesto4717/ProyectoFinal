package com.softtek.academy.end.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.softtek.academy.end.domain.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {
	@Query(name = "findOneItem", nativeQuery = true)
	public Item findItemById(@Param("itemId") int id);
}
