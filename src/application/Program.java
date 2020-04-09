package application;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

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
		System.out.println("===== Test 6: seller delete =====");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre id to delete: ");
		int id = sc.nextInt();
		
		sellerDao.deleteById(id);
		System.out.println("Delete completed!");
		sc.close();
	}

}
