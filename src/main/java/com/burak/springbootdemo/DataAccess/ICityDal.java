package com.burak.springbootdemo.DataAccess;

import java.util.List;

import com.burak.springbootdemo.Entities.City;

public interface ICityDal {
	List<City> getAll();
	void add(City city);
	void update(City city);
	void delete(City city);
	
}