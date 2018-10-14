package com.nt.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class Demo {

	public static void main(String[] args) throws Exception {

		Entity entity = null;

		try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
			String line = br.readLine();
			while (line != null) {

				// converting into java beans
				entity = new Entity();
				StringTokenizer st1 = new StringTokenizer(line, "~");
				line = br.readLine();
				while (st1.hasMoreTokens()) {
					String id = st1.nextToken();
					entity.setId(id);
					String fName = st1.nextToken();
					entity.setFirstName(fName);
					String lName = st1.nextToken();
					entity.setLastName(lName);
					String dob = st1.nextToken();
					entity.setDob(dob);
					String add = st1.nextToken();
					entity.setAddress(add);
					String bal = st1.nextToken();
					entity.setBalance(bal);
					System.out.println(entity);
					
					// get current year
					int sysDate = new Date().getYear() + 1900;
					System.out.println("Current Year : " + sysDate);
					String a=entity.getDob();
					System.out.println(a);
					String date = entity.getDob().substring(6);
					System.out.println("Birth Year   : " + date + "\n");
					int inputDate = 12202012;
					//int opt=date.format(date, inputDate);
					//System.out.println("......"+opt);
					//opt=Integer.parseInt(opt);
					/*date=Integer.parseInt(date);
					int a=sysDate-(Integer)date;*/
					
				/*	int inputDate = 12202012;
					DateFormat df = new SimpleDateFormat("MMddyyyy");
					Date date1 = df.parse(String.valueOf(inputDate));
					System.out.println(date1);
					String s = date1.format(date1);
					int output = Integer.valueOf(s);*/
					
					
				}//while
			} // while
		} // try
	}// main method
}// class