import java.util.Scanner;

import javax.print.attribute.standard.Sides;

// Function Calling in Java 

// import java.util.Scanner;

// public class Opps {

//     int getSum(int  x , int y){
//         return x + y;
//     }

//     public static void seive(int n){

//         boolean [] arr = new boolean [5000];

//         for(int i=0;i<5000;i++){
//             arr[i] = true;
//         }
//         arr[0] = false;
//         arr[1] = false;
//         for(int i=2;i*i<5000;i++){
//             if(arr[i])
//                 for(int j=2*i;j<5000;j+=i){
//                     arr[j] = false;
//                 }
//         }
//         // printing the prime numbers
//         for(int i=0;i<n;i++){
//             if(arr[i]){
//                 System.out.print(i + " ");
//             }
//         }
//         System.out.println("");
//         return;

//     }

//     public static void main(String [] args){
//         Scanner scanner = new Scanner(System.in);
//         int number = scanner.nextInt();
//         System.out.println("Primes numbers are following as: ");
//         seive(number);
//     }
// }


// Opps in  Java 

// public class Opps {
//     public static void main(String [] args){
//         System.out.println("Hello World !! Vishu is this side...");
        
//         // creating the object of the class
//         Person first = new Person();
//         first.name = "vishu chhabra";
//         first.age = 34;
//         first.walk();
//         first.eat();
//         first.walk(344);

//         Person second = new Person("Rakesh Chhabra", 34);
//         second.walk(566);

//         System.out.println("Total People i made till now " + Person.count);
//         return;
//     }
// }

// // This keyword can be used for two purposes , one for calling other constrcutor and other for accessing the properties of that object
// class Person {
//     String name;
//     int age;
//     static int count;

//     public Person(){
//         count++;
//         System.out.println("Count of person is " + count);
//         System.out.println("This is default constructor");
//     }
//     public Person(String name){
//         System.out.println("Calling the single constructor");
//     }
//     public Person(String name, int age){
//         this(name);
//         System.out.println("Count of person is " + count);
//         System.out.println("Parametrized Constrcutor is begin called");
//         this.name = name;
//         this.age = age;
//     }

//     void walk(){
//         System.out.println(name+ " is walking");
//     }
    
//     void walk(int steps){
//         System.out.println(name + " walked " + steps);
//     }

//     void eat(){
//         System.out.println(name + " is eating");
//     }
// }

// Public , Private and Protected Concept 
// class Human{
//     protected String bloodGroup;
    
//     Human(String bloodGroup){
//         this.bloodGroup = bloodGroup;
//     }
// }

// class Person extends Human{
//     String name;
//     int age;

//     Person(String name, int age){
//         super("B+");
//         this.name = name;
//         this.age  = age;
//     }   
//     void walk(){
//         System.out.println(name + " is " + age + " years old.");
//         return;
//     }
// }

// class Developer extends Person{
//     String language;
    
//     Developer(String language, String name, int age){
//         super(name,age); // Super keyboard for calling the parent constructor
//         this.language = language;
//     }

//     void walk(){
//         System.out.println("This is special tpye of walk for developer");
//     }
//     void getInformation(){
//         System.out.println("Name is : " + this.name);
//         System.out.println("Age is : " + this.age);
//         System.out.println("Language is : " + this.language);
//         System.out.println("Blood Group is : " + this.bloodGroup);
//     }
// }

// public class Opps {
//     public static void main(String [] args){

//         Developer firstD = new Developer("C++", "Vishu Chhabra", 12);
//         firstD.getInformation();
//         firstD.walk();
//     }
// }


// simple abstraction in java
// class Laptop {
//     private int price;

//     Laptop(){
//         this.price = -1;
//     }
//     void setPrice(int newPrice){

//         Scanner scanner = new Scanner(System.in);
//         String password = scanner.nextLine();

//         if(!password.equals("vishu")){
//             System.out.println("Wrong Password, Try again..");
//             setPrice(newPrice);
//             return;
//         }
//         this.price = newPrice;
//         System.out.println("Price Updated successfully");
//         return;
//     }
// }

// public class Opps{
//     public static void main(String [] args){
//         Laptop newLaptop = new Laptop();
//         newLaptop.setPrice(45);
//     }
// }


// Abstraction - data hiding due to complexity

// In this example, we will never create car anytime. so no to create object any time
// abstract class Car {
//     int price;
    
//     // Abstract class can have both abstract and non abstract fucntions 
//     abstract void start(); // as this is abtract class, no need function defination too

//     void introduction(){
//         System.out.println("This is car ...");
//     }
// }

// class Audi extends Car {
//     @Override
//     void start() {
//         System.out.println("Car starting Audi...");
//     }

// } 

// class BMW extends Car{
//     @Override
//     void start() {
//         System.out.println("Car starting BMW...");
//     }
// }
// public class Opps {

//     public static void main(String [] args){

//         Audi audi = new Audi();
//         audi.introduction();
        
//     }
// }

// Interface in java - in abstrat class , we can add body of some methods , but in interface , we can;t add this.
interface Car {
    int price = -1;

    // Abstract class can have both abstract and non abstract fucntions 
    void start(); // as this is abtract class, no need function defination too
}

interface Person {
    void walk();
};

// Important , java dont supoort multiple inheritnace but yes , it support multiple interfaces.
class Audi implements Car, Person {

    public void start() {
        System.out.println("Car starting Audi...");
    }
    public void walk(){
        System.out.println("Car is Walking ...");
    }
} 

public class Opps {
    public static void main(String [] args){

        Audi audi = new Audi();
        audi.start();
        audi.walk();
    }
}