package aplication;

import java.util.Date;
import java.util.List;

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
		for (Seller obj : list) {
			System.out.println(obj);
		}
		/*System.out.println("\n====Teste 03 : FindAll=====");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}

		System.out.println("\n====Teste 04 : Seller Insert=====");
		Seller newseller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4500.0, department);
		sellerDao.insert(newseller);
		System.out.println("Inserido novo Id : " + newseller.getId()); */
		
		System.out.println("\n====Teste 05 : Seller  Update=====");
		seller = sellerDao.finfById(1);
		seller.setName("Valdemir");
		sellerDao.update(seller);
		System.out.println("Feito atualização :" );
	}

}
