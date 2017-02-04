package br.com.rodrigo.alura.factory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestConnection {
	
	public static void main(String[] args) throws SQLException {
		
		Connection c = new ConnectionFactory().getConnection(); // Getting the Connection through the factory.
		
		PreparedStatement ps = c.prepareStatement("SELECT t FROM myTable t");
		
		System.out.println(ps);	
	}

}
