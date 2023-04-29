package com.example.demo.controller;



import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;



import com.example.demo.model.CarModel;

import com.example.demo.service.CarService;



@RestController

@RequestMapping("/stu")

public class CarController {

	@Autowired

	public CarService obj;

	

	@PostMapping("/post")

	

	public CarModel addDetails(@RequestBody CarModel a)

	{

		return obj.save(a);

	}

	@GetMapping("/get")

	

	public List<CarModel> getDetails()

	{

		return obj.findAllCar();

	}

	

	@PutMapping("/put")

	

	public CarModel updateDetails(@RequestBody CarModel cid)

	{

		return obj.update(cid);

	}

	

	@DeleteMapping("/delete/{cid}")

	public String deleteDetails(@PathVariable("cid")int mid)

	{

		obj.delete(mid);

		return "Deleted Sucessfully";

	}
	@PostMapping("/login")
	public String login(@RequestBody Map<String,String> loginDataMap)
	{
		String username = loginDataMap.get("username");
		String password = loginDataMap.get("password");
		String result = obj.LoginCheckData(username, password);
		return result;
	}

}