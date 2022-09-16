

public class Lab1 {

    public static void main(String[] args) {
        //1:Write a program that store your full name ( first name and last name ).
        //Print your full name.

        String firstName = "Haya ";
        String lastName = "Almalki";
        String fullName = firstName + lastName;
        System.out.println(fullName);

        //2:Create two variables and print the sum of theses variables.
        //Save the total of the sum , and divide it by 2
        int num1 = 2;
        int num2 = 3;
        int sum = num1 + num2;
        System.out.println("sum = " + sum);

        int divide = sum / 2;
        System.out.println("divistion = " + divide);
        //3:
        // Write a program that checks the role of the user
        //If the role is admin print "welcome admin"
        //If the role is superuser print "welcome superuser"
        //If the role is user print "welcome user"
        
        String role="user";
        if(role=="user"){
                    System.out.println("Welcome user");
        }
        else if(role =="admin"){
            System.out.println("Welcome admin");
        }
        else{
                        System.out.println("Welcome superuser");
        }
        //4: print the numbers from 0 to 100
        for(int i=1;i<=100;i++){
             System.out.println(i);
        }
        //5: print the numbers from 100 to 30
         for(int i=100;i>=30;i--){
             System.out.println(i);
        }
         //6:Write a program that takes number and store in varaible
           //Print this number power 5
           
           int num=2;
           int power=1;
           for(int i=0;i<5;i++){
               power=num*power;
           }
           System.out.println(power);
           
           //7:print the even numbers from 0 to 25
            for(int i=0;i<25;i++){
                if(i%2==0){
                    System.out.println(i);
                }
           }
    }
}
