package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {

	void inser(Seller obj);
	void update(Seller obj);
	void deleteById(Integer Id);
	Seller findById(Integer Id);
	List<Seller> findAll();
}