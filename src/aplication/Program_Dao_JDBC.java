package aplication;

import model.entities.Seller;
import modelDao.DaoFactory;
import modelDao.SellerDao;

public class Program_Dao_JDBC {

	public static void main(String[] args) {
	
		
		
		SellerDao sellerDao = new DaoFactory().createSellerDao();
		
		System.out.println("====Teste 01 : FindById =====");
		Seller seller = sellerDao.finfById(3);
		
		System.out.println(seller);

	}

}
