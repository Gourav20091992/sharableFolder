package com.sakshath.core.service;

import java.util.List;

import com.sakshath.core.Exception.FinDetailsException;
import com.sakshath.core.entities.FinDetailIndus;
import com.sakshath.core.response.FinDetailIndusDto;

public interface FinDetailIndusService {

	List<FinDetailIndus> findAllDetailsforIndusOfFinDetailsOfCustomer() throws FinDetailsException;

}
