package application;

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
		System.out.println("===TEST 1: sellerFindyById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		System.out.println("===TEST 2: sellerFindyByDepartment ===");
		Department dep = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(dep);
		for(Seller s : list) {
			System.out.println(s);
		}
		
	}

}
