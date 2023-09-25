package com.github.application;

import java.util.Date;
import java.util.List;

import com.github.model.dao.DaoFactory;
import com.github.model.dao.SellerDao;
import com.github.model.entities.Department;
import com.github.model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: seller findbyid ======");
		
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n=== TEST 2: seller findbydepartment ======");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department); 
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 3: seller findAll ======");
		list = sellerDao.findAll(); 
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 4: seller Insert======");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4.000, department);
		sellerDao.insert(newSeller);
		System.out.println("inserted! new Id =" + newSeller.getId());		
		
		System.out.println("\n=== TEST 5: seller update ======");
		seller = sellerDao.findById(1);
		seller.setName("Mario Bros");
		sellerDao.update(seller);
		System.out.println("update completed");
		
		System.out.println("\n=== TEST 6: seller delete======");
		sellerDao.deleteById(3);
		
		System.out.println("Delete Complete");
		
			}

}
