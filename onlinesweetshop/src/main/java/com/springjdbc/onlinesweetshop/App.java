package com.springjdbc.onlinesweetshop;


import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbc.onlinesweetshop.admin.Admin;
import com.springjdbc.onlinesweetshop.admin.Customer;
import com.springjdbc.onlinesweetshop.admin.Sweets;

import com.springjdbc.onlinesweetshop.dao.AdminInterface;
import com.springjdbc.onlinesweetshop.dao.CustomerInterface;

import com.springjdbc.onlinesweetshop.dao.SweetInterface;

/**
 * Hello world!
 *
 */
//Main Driver Class
public class App {

	// main method
	public static void main(String[] args) {
		// welcome message

		System.out.println("Welcome to  Karishma's Online Sweet Shop");

		// It represents the Spring IoC container and is responsible for instantiating
		// and configuring bean

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springjdbc/onlinesweetshop/config.xml");

		// AdminInterface object
		AdminInterface adminDao = context.getBean("adminDao", AdminInterface.class);
		// CustomerInterface object
		CustomerInterface customerDao = context.getBean("customerDao", CustomerInterface.class);

		// SweetInterface object
		SweetInterface sweetDao = context.getBean("sweetDao", SweetInterface.class);

		// Frontend
		// various options for users to select
		// Getting user input through bufferedReader class
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean i = true;
		while (i) {
			System.out.println("Press 0 to login as an Admin");
			System.out.println("Press 1 for Registeration");
			System.out.println("Press 2 for Login");
			System.out.println("Press 3 to add Sweet");

			System.out.println("Press 4 to give feedback");
			System.out.println("Press 5 to logout");

			try {

				// getting user's choice
				int choice = Integer.parseInt(br.readLine());

				// switch
				switch (choice) {

				case 0:
					// login as an admin
					System.out.println("Enter userid");
					int uSerId = Integer.parseInt(br.readLine());
					System.out.println("Enter User name:");
					String uSerName = br.readLine();
					System.out.println("Enter your Password");
					String pass = br.readLine();

					Admin admin = new Admin();
					admin.setUserId(uSerId);
					admin.setUserName(uSerName);
					admin.setPassword(pass);
					int res = adminDao.insert(admin);
					System.out.println("Logged in as Admin" + res);

					// case 1
				case 1:
					// Registering the user
					System.out.println("Enter Customer id");
					int uId = Integer.parseInt(br.readLine());
					System.out.println("Enter customer name :");
					String uName = br.readLine();
					System.out.println("Enter customer city");
					String uCity = br.readLine();

					// Creating Customer object and setting values
					Customer customer = new Customer();
					customer.setcId(uId);
					customer.setcName(uName);
					customer.setcCity(uCity);
					int r = customerDao.insert(customer);
					System.out.println(r + " customer added");

					break;

				case 2:
					// Login as an user
					System.out.println("Enter  user id");
					int id = Integer.parseInt(br.readLine());
					System.out.println("Enter password");
					String password1 = br.readLine();
					System.out.println("Confirm Password");
					String password2 = br.readLine();
					if (password1.equals(password2)) {
						System.out.println("User logged in successfully with id " + id);
					} else {
						System.out.println("Wrong password");
					}

					break;

				// Adding sweet
				case 3:

					System.out.println("Enter sweet id :");
					int sId = Integer.parseInt(br.readLine());
					System.out.println("Enter sweet name :");
					String sName = br.readLine();
					System.out.println("Enter Brand:");
					String brnd = br.readLine();
					System.out.println("Enter the offer or discount to prevail on sweet :");
					float disount = Float.parseFloat(br.readLine());
					System.out.println("Enter price :");
					int rs = Integer.parseInt(br.readLine());
					// creating the sweet class object
					Sweets sweet = new Sweets();
					sweet.setSweetId(sId);
					sweet.setSweetName(sName);
					sweet.setSweetPrice(rs);
					sweet.setSweetBrand(brnd);
					sweet.setSweetOffer(disount);
					// calling the sweetDao class insert method to add data in the database
					int resl = sweetDao.insert(sweet);
					System.out.println("Sweet Added :" + resl);
					break;

				case 4:
					System.out.println("Did you like our services? Give us a quick feedback");
					String feedback = br.readLine();
					System.out.println(feedback + "Thanks for your feedback");
					break;

				case 5:
					i = false;
					break;

				}

			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Invalid Input Try with another one !!!");
			}
		}
		System.out.println("Thank you for using my application");
		System.out.println("See you again!");
		((ClassPathXmlApplicationContext) context).close();

	}
}
