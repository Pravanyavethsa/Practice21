package org.example;


import ass21.InvalidEmailException;
import ass21.InvalidFnameException;
import ass21.InvalidLnameException;
import ass21.InvalidMobileException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class UserValidity{
    String fname;
    String lname;
    String email;
    String mobile;

    public UserValidity(String fname,String lname,String email,String mobile){
        this.fname=fname;
        this.lname=lname;
        this.email=email;
        this.mobile=mobile;
    }
    public void checkFname() throws InvalidFnameException{
        Pattern fnamePattern=Pattern.compile("^[A-Z][A-Za-z]{3,}");
        Matcher fnameMatcher= fnamePattern.matcher(""+ fname +" ");
        boolean fnameOk=fnameMatcher.matches();
        if(!fnameOk){
            throw new InvalidFnameException("First name is not valid");
        }else{
            System.out.println("First name is valid");
        }
    }
    public void checkLname() throws InvalidLnameException{
        Pattern lnamePattern=Pattern.compile("^[A-Z][A-Za-z]{3,}");
        Matcher lnameMatcher= lnamePattern.matcher(""+ fname +" ");
        boolean lnameOk=lnameMatcher.matches();
        if(!lnameOk){
            throw new InvalidLnameException("Last name is not valid");
        }else{
            System.out.println("Last name is valid");
        }
    }
    public void checkEmail() throws InvalidEmailException{
        Pattern emailPattern=Pattern.compile("^[a-z]{1,3}[.][a-z*.-@$%]{1,}");
        Matcher emailMatcher= emailPattern.matcher(""+ email+" ");
        boolean emailOk=emailMatcher.matches();
        if(!emailOk){
            throw new InvalidEmailException("Email is not valid");
        }else{
            System.out.println("Email is valid");
        }
    }
    public void checkMobile() throws InvalidMobileException{
        Pattern mobilePattern=Pattern.compile("91 [0-9]{10}");
        Matcher mobileMatcher= mobilePattern.matcher(""+ fname+" ");
        boolean mobileOk=mobileMatcher.matches();
        if(!mobileOk){
            throw new InvalidMobileException("Mobile num is not valid");
        }else{
            System.out.println("Mobile num is valid");
        }
    }
}
public class UserValidationExp {
    public static void main(String[] args) {
        UserValidity u1=new UserValidity("vethsa","pravanya","abc.xyz@gmail.com","91 7981154321");
        try{
            u1.checkFname();
        }catch (InvalidFnameException e){
            e.printStackTrace();
        }
        try{
            u1.checkLname();
        }catch (InvalidLnameException e){
            e.printStackTrace();
        }
        try{
            u1.checkEmail();
        }catch (InvalidEmailException e){
            e.printStackTrace();
        }
        try{
            u1.checkMobile();
        }catch (InvalidMobileException e){
            e.printStackTrace();
        }
    }

}
