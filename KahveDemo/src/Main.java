import adapters.MernisServiceAdapter;
import concrete.StarbucksCustomerManager;
import entities.Customer;

import java.util.GregorianCalendar;


public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setFirstName("ENES");
		customer.setLastName("MUSAOÐLU");
		customer.setDateOfBirth(new GregorianCalendar(20**, * ,**).getTime());
		customer.setNationallyId("*******");
		StarbucksCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		starbucksCustomerManager.save(customer);
	}

}
