package com.burak.springbootdemo.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.burak.springbootdemo.DataAccess.ICityDal;
import com.burak.springbootdemo.Entities.City;

@Service
public class CityManager implements ICityService {

	private ICityDal cityDal;
	
	@Autowired
	public CityManager(ICityDal cityDal) {
		this.cityDal = cityDal;
	}
	
	@Override
	@Transactional
	public List<City> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(City city) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(City city) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(City city) {
		// TODO Auto-generated method stub
		
	}

}
