package com.github.model.dao;

import com.github.model.dao.implementation.SellerDaoJDBC;

import db.DB;

public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnetion()); 
	}
}
