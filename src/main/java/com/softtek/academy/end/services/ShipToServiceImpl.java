package com.softtek.academy.end.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softtek.academy.end.domain.ShipTo;
import com.softtek.academy.end.repository.ShipToRepository;

@Service
public class ShipToServiceImpl implements ShipToService {
	
@Autowired
ShipToRepository shipToRepository;
	
	@Override
	public List<ShipTo> shipToList() {
		// TODO Auto-generated method stub
		return shipToRepository.shipToList();
	}

}
