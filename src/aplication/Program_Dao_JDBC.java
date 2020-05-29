package aplication;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program_Dao_JDBC {

	public static void main(String[] args) {
	
		Department obj = new Department(1 , "Rafael");
		Seller seller = new  Seller(2, "Bob", "bob@gmail", new Date(), 25000.0, obj);
		System.out.println(seller);

	}

}
