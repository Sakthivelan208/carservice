package com.example.demo.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.CarModel;
import com.example.demo.repository.CarRepo;



@Service

public class CarService {

	@Autowired

	CarRepo rep;

	

	public CarModel save(CarModel a)

	{

		return rep.save(a);

	}

	public CarModel update(CarModel u)

	{

		return rep.save(u);

	}

	

	public List<CarModel> findAllCar()

	{

		return (List<CarModel>) rep.findAll();

	}

	

	public void delete(int id)

	{

		rep.deleteById(id);

	}

	
	public String LoginCheckData(String username,String password)
	{
		CarModel user = rep.findByusername(username);
		if(user == null)
		{
			return "No User Found/nPlease Try Again!!!";
		}
		else
		{
			if(user.getPassword().equals(password))
			{
				return "Login Successful";
			}
			else
			{
				return "Login Failed";
			}
		}
	}
	

}