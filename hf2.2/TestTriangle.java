/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class TestTriangle {
    
    public static void main(String[] args) 
    {
        Triangle haromszog = new Triangle(1, 1.5, 1);
        haromszog.setColor("yellow");
        System.out.println(haromszog);
        System.out.println("A háromszög területe: " + haromszog.getArea() + ", kerülete: " + haromszog.getPerimeter() +
                ", színe: " + haromszog.getColor() + ", kitöltése: " + haromszog.isFilled());

    }
}  
