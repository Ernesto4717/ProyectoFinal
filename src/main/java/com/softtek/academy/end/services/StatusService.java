package com.softtek.academy.end.services;

import java.util.List;

import com.softtek.academy.end.domain.Status;

public interface StatusService {
	
	List<Status> statusList(String type);

}
