package project;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.getName());
        Bank bank = new Bank("HSBC", "Az", "+994 55 555 5555");
        Person p1 = new Person("John", "20", bank);
        Person p2 = new Person("Solomon", "30", bank);
        logger.log(Level.INFO, "Bank name: {0}", bank.getName());
        logger.log(Level.INFO, "Bank address: {0}", bank.getAddress());
        logger.log(Level.INFO, "Bank phone: {0}", bank.getPhone());
        logger.log(Level.INFO, "Bank ID: {0}", bank.getID());

        logger.log(Level.INFO, "p1 pass {0}", p1.getPassword());
        logger.log(Level.INFO, "p2 pass {0}", p2.getPassword());
        bank.getALoan(p1, 1500, "I need to become gay", new Date(15, 9, 1923), "student loan");
        Credits[] creds = bank.returnCredits(p1.getID());
        logger.log(Level.INFO, "p1 loan {0}", creds[0]);
    }
}
