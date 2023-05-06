package com.bridgelabz.addressBookDB;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AddressBookDB extends BaseClass {
    public void retrieveAddressBook() throws SQLException {
        connection = setUpDatabase();
        Statement statement = connection.createStatement();
        String query = "select * from contacts";
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            String firstName = resultSet.getString(1);
            String lastName = resultSet.getString(2);
            String addrss = resultSet.getString(3);
            String city = resultSet.getString(4);
            String state = resultSet.getString(5);
            int zip = resultSet.getInt(6);
            int phoneNumber = resultSet.getInt(7);
            String email = resultSet.getString(8);
            System.out.println(firstName + " " + lastName + " " + addrss + " " + city + " " + state + " " + zip + " " + phoneNumber + " " + email);
        }

        System.out.println("Retrieve all the addressbook  data");
    }
}