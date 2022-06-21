package com.wipro;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wipro.beans.Contact;
import com.wipro.beans.User;
import com.wipro.config.SpringConfig;

public class ContactManagerApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		Map<User, Contact[]> dataMap = new HashMap<User, Contact[]>();

		User user1 = context.getBean(User.class);
		user1.setName("Rahul");

		User user2 = context.getBean(User.class);
		user2.setName("Sita");

		Contact contact1 = context.getBean(Contact.class);
		contact1.setEmail("rahul@abc.com");
		contact1.setPhone("9988776655");

		Contact contact2 = context.getBean(Contact.class);
		contact2.setEmail("rahulNew@abc.com");
		contact2.setPhone("112233445");

		Contact[] contacts = { contact1, contact2 };

		dataMap.put(user1, contacts);
		dataMap.put(user2, new Contact[0]);

		System.out.println(dataMap);
		System.out.println(Arrays.toString(dataMap.get(user1)));
		System.out.println(Arrays.toString(dataMap.get(user2)));

		context.close();
	}

}
