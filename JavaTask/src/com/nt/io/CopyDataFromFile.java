package com.nt.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class CopyDataFromFile {

	public static void main(String[] args) throws Exception {

		Entity entity = null;
        Map map =null;
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
					String date = entity.getDob().substring(6);
					System.out.println("Birth Year   : " + date + "\n");
		          
					
					
				}//while
			} // while
		} // try
	}// main method
}// class