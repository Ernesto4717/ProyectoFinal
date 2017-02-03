package com.softtek.academy.end.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.softtek.academy.end.domain.CartLine;

@Repository
public interface CartLineRepository extends JpaRepository<CartLine, Integer>  {
	

	@Query(name ="findCartLinesByCartId",nativeQuery=true)
	public List<CartLine> findCartLinesByCartId(@Param ("cartId") Long cartId);
}
