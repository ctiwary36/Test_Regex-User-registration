package main.com.userragistration;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailSample {

        public static void main(String[] args)
        {
            ArrayList<String> emails = new ArrayList<String>();

            //valid email-ids as per given uc input.
            emails.add("abc@yahoo.com");
            emails.add("abc-100@yahoo.com");
            emails.add("abc.100@yahoo.com");
            emails.add("abc111@abc.com");
            emails.add("abc-100@abc.net");
            emails.add("abc.100@abc.com.au");
            emails.add("abc@1.com");
            emails.add("abc@gmail.com.com");
            emails.add("abc+100@gmail.com");

            //Invalid emails
            emails.add("abc");
            emails.add("abc@.com.my");
            emails.add("abc123@gmail.a");
            emails.add("abc123@.com");
            emails.add(".abc@abc.com");
            emails.add("abc()*@gmail.com");
            emails.add("abc@%*.com");
            emails.add("abc..2002@gmail.com");
            emails.add("abc.@gmail.com");
            emails.add("abc@abc@gnail.com");
            emails.add("abc@gmail.com.1a");
            emails.add("abc@gmail.com.aa.au");

            String regex = "^[A-Za-z0-9]+([._%+-][A-Za-z0-9]+)*@([A-Za-z0-9]+).([A-Za-z]{2,4})(\\.[A-Za-z]{2,3})?$";

            Pattern pattern = Pattern.compile(regex);
            int i = 1;

            for(String email : emails)
            {
                Matcher matcher = pattern.matcher(email);
                System.out.println(i++ + "\t" + email +" : "+ "\t\t" + matcher.matches());
                System.out.println("---------------------------------");
            }
        }
    }


}
