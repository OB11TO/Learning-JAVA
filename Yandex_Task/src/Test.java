class Vehicle{
    public static void  kmToMiles(int km){
        System.out.println("Внутри родительского класса/статического метода");
    } }

class Car extends Vehicle{
    public static void  kmToMils(int km){
        System.out.println("Внутри дочернего класса/статического метода ");
    } }

public class Test{
    public static void main(String args[]){
        Vehicle v = new Car();
        ((Car) v).kmToMils(10);
    }}