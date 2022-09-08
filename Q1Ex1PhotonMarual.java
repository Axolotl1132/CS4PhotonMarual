/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1.photon.marual;

/**
 *
 * @author PHOTON
 */
public class Ex1PhotonMarual {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Object1 myObj1 = new Object1();
        Object2 myObj2 = new Object2();
        Object3 myObj3 = new Object3();
        
        System.out.println("Object 1");
        System.out.println("Object: " + myObj1.name);
        System.out.println("Age: " + myObj1.age);
        System.out.println("Brand: " + myObj1.brand + "\n");
        System.out.println("Object 2");
        System.out.println("Object: " + myObj2.name);
        System.out.println("Age: " + myObj2.age);
        System.out.println("Brand: " + myObj2.brand + "\n");
        System.out.println("Object 3");
        System.out.println("Object: " + myObj3.name);
        System.out.println("Age: " + myObj3.age);
        System.out.println("Brand: " + myObj3.brand + "\n");
        System.out.println("Total Age of The Objects: " + (myObj1.age + myObj2.age + myObj3.age));
        System.out.println("Are there any object with similar brands?: " + (myObj1.brand == myObj2.brand || 
                                                                            myObj1.brand == myObj3.brand || 
                                                                            myObj2.brand == myObj3.brand));
        System.out.println("Are there any similar objects: " + (myObj1.name == myObj2.name || 
                                                                myObj1.name == myObj3.name || 
                                                                myObj2.name == myObj3.name));
    }
    
    public static class Object1 {
        String name = "Celphone";
        int age = 3;
        String brand  = "Samsung";
    }
    
    public static class Object2 {
        String name = "Leather Shoes";
        int age = 4;
        String brand = "GIBI";
    }
    
    public static class Object3 {
        String name = "Celphone";
        int age = 1;
        String brand = "Moyu";
    }
}
