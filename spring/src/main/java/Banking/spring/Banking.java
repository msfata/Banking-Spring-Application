package Banking.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings("all")
public class Banking {

	public static void main(String[] args) {
		ApplicationContext contextSaving = new ClassPathXmlApplicationContext("bean.xml");
		Account saving = (Account) contextSaving.getBean("Banking");

		ApplicationContext contextCurrent = new ClassPathXmlApplicationContext("bean.xml");
		Account current = (Account) contextCurrent.getBean("Banking");
		/*
		 * set initial balances current & saving accounts
		 */
		current.setBalance(2000);
		saving.setBalance(100);

		System.out.println("before transfer....");
		System.out.println("current balance is : " + current.getBalance());
		System.out.println("saving balance is  : " + saving.getBalance());

		/*
		 * transfer from current to saving
		 */
		int amountToTransfer = 500;
		System.out.println("transfering amount is : " + amountToTransfer);
		Account.transfer(current, saving, amountToTransfer);
		System.out.println("After transfer....");
		System.out.println("current balance is : " + current.getBalance());
		System.out.println("saving balance is  : " + saving.getBalance());

	}
}
