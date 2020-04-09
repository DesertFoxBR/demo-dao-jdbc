package application;

import java.util.Date;
import java.util.List;
import java.util.Locale;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		System.out.println("===== Test 2: seller findByDepartment =====");
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Department dep = new Department(2,null);
		List<Seller> list = sellerDao.findByDepartment(dep);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("===== Test 3: seller findAll =====");
		
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		System.out.println("===== Test 5: seller update =====");
		
		Seller seller = sellerDao.findById(1);
		System.out.println("Inserted! New id: " + seller.getId());
		seller.setName("Martha Wayne");
		sellerDao.update(seller);
		System.out.println("Update completed!");
	}

}
