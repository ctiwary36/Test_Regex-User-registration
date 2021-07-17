package main.com.userragistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRagistration {


        public boolean firstNameValidation(String firstName) {
            return Pattern.matches("^[A-Z]{1}+[a-z]{3,}$", firstName);
        }

        public boolean lastNameValidation(String firstName) {
            return Pattern.matches("^[A-Z]{1}+[a-z]{3,}$", firstName);
        }

        public boolean emailValidation(String email) {
            return Pattern.matches("^a-zA-Z0-9.]+@[a-zA-Z0-9.]+$", email);
        }

        public boolean phoneNumberValidation(String phoneNumber) {
            return Pattern.matches("(0|91)?[7-9][0-9]{9}$", phoneNumber);
        }
        public boolean passwordValidation(String password) {
            return Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()]).{8,}$", password);
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            UserRagistration person = new UserRagistration();
            System.out.println("enter first name");
            String firstName = scanner.nextLine();
            System.out.println("enter last name");
            String lastName = scanner.nextLine();
            System.out.println("enter Email");
            String email = scanner.nextLine();
            System.out.println("enter phone number");
            String phoneNumber = scanner.nextLine();
            System.out.println("enter password");
            String password = scanner.nextLine();

            System.out.println("Welcome " + firstName + " " + lastName + " to the User Registration Program");
            System.out.println(person.firstNameValidation(firstName));
            System.out.println(person.lastNameValidation(lastName));
            System.out.println(person.emailValidation(email));
            System.out.println(person.phoneNumberValidation(phoneNumber));
            System.out.println(person.passwordValidation(password));
        }
    }

