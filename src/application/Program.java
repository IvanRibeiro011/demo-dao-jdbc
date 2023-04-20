package application;

import java.time.LocalDate;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
//		Department obj = new Department(1, "Books");
//		System.out.println(obj);
//		Seller seller = new Seller(21,"Bob","bob@gmail.com",LocalDate.now(),3000.0,obj);
//		System.out.println(seller);
		
		SellerDao sellerDao = DaoFactory.CreateSellerDao();
		System.out.println("===TEST 1: sellerFindById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		System.out.println("===TEST 2: sellerFindByDepartment ===");
		Department dep = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(dep);
		for(Seller s : list) {
			System.out.println(s);
		}
		List<Seller> list2 = sellerDao.findAll();
		System.out.println("===TEST 3: sellerFindAll ===");
		list2.forEach(System.out::println);
		System.out.println("===TEST 4: sellerInsert ===");
		Seller seller2 = new Seller(null,"Greg","Greg@gmail.com",LocalDate.now(),4000.0,dep);
		sellerDao.insert(seller2);
		System.out.println("Inserted! New id: = " + seller2.getId());
		
	}

}
