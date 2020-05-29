package aplication;

import java.util.List;

import model.Dao.Impl.SellerDaoJDBC;
import model.entities.Department;
import model.entities.Seller;
import modelDao.DaoFactory;
import modelDao.SellerDao;

public class Program_Dao_JDBC {

	public static void main(String[] args) {
	
		
		
		SellerDao sellerDao = new DaoFactory().createSellerDao();
		
		System.out.println("====Teste 01 : FindById =====");
		Seller seller = sellerDao.finfById(3);	
		System.out.println(seller);
		
		System.out.println("\n====Teste 02 : FindByDepartment=====");
		
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller obj : list) {
			
			System.out.println(obj);
		}
		

	}

}
