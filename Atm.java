// Functionality of an Atm machine
//     1. create account 
//     2. set pin 
//     3. Deposite Money
//     4. withdraw Money
//     5. change pin
//     7. Check Balance
//     8. show user details

import java.util.Scanner;

class Sbi_atm{

    Scanner sc= new Scanner(System.in);
    //constructor
    Sbi_atm(){

    }

    //instance variable
    String name;
    int age;
    double balance=0;
    String email;
    String mobile;
    String pin;

    // static variable
    static int count=0;
    static int pin_count=0;

    void choice(){
        pin_count=0;
        System.out.println("""
            1. create account 
            2. set pin 
            3. Deposite Money
            4. withdraw Money
            5. change pin
            7. Check Balance
            8. show user details
                """);
            
        int option= sc.nextInt();

        if(option==1){
            this.createaccount();
        }
        else if(option==2){
            setPin();
        }
        else if(option==3){
            deposite();
            
        }
        else if(option==4){
            
        }
        else if(option==5){
            
        }
        else if(option==6){
            
        }
        else if(option==7){
            checkbalance();
        }
        else if(option==8){
            show_user();
        }
        else{
            this.choice();
        }
    }


    void createaccount(){
        System.out.println("*****ACCOUNT CREATING******");
        System.out.print("Enter your name: ");
        this.name= sc.next();
        // sc.nextLine();

        System.out.print("Enter your Age: ");
        this.age= sc.nextInt();

        System.out.print("Enter your email: ");
        this.email= sc.next();

        System.out.print("Enter your Mobile Number: ");
        this.mobile= sc.next();

        if(true){
            System.out.println("-----Your Account has created Succesfully-----");
            System.out.print("Enter 1 to set pin, Enter 0 to exit: ");
            int option= sc.nextInt();
            if(option==1){
                this.setPin();
            }else{
                this.choice();
            }
        }else{
            System.out.println("Something went wrong Please try again");
            this.choice();
        }
    }

    void setPin(){
        if(pin_count==3){
            System.out.println("*****Exit****");
            this.choice();
        }

        System.out.print("Confirm your email: ");
        String temp_email= sc.next();

        if(temp_email.equals(this.email)){
            System.out.print("Enter new 6 digit Pin: ");
            pin= sc.next();
            System.out.println("Successfully set pin");

            this.choice();
        }
        else{
            System.out.println("Oh' its a wrong email try again: ");
            pin_count++;
            this.setPin();
        }
    }

    void show_user(){
        System.out.println("******USER DETAILS********");
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println("email: "+this.email);
        System.out.println("mobile: "+this.mobile);
    }

    void checkbalance(){
        System.out.println("Confirm pin: ");
        String temp_pin= sc.next();
        if(temp_pin.equals(this.pin)){
            System.out.println("Account Balance: "+ balance);
        }else{
            System.out.println("You enter wrong pin");
            this.choice();
        }
    }

    void deposite(){
        System.out.println("Confirm email: ");
        String temp_email= sc.next();
        if(temp_email.equals(this.email)){
            System.out.print("Enter ammount: ");
            double temp_ammount= sc.nextInt();
            balance+= temp_ammount;
            System.out.print("Successfully Deposite "+ temp_ammount +"INR");
        }else{
            System.out.println("You enter wrong email");
            this.choice();
        }
    }



}

class Atm{
    public static void main(String args[]){
        Sbi_atm cust1= new Sbi_atm();
        cust1.choice();

    }
}