/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Test {
    public static void main(String[] args){
        
        QuadraticEquation e1= new QuadraticEquation(1,2,3);
        QuadraticEquation e2= new QuadraticEquation(2,4,2);
        QuadraticEquation e3= new QuadraticEquation(1,6,5);
        
        if(e1.getDiscriminant()>=0){
            System.out.println("QE1: x1="+e1.getRoot1()+" x2="+e1.getRoot2());
        }
        else if(e1.getDiscriminant()<0)
        {
            System.out.println("QE1: The equation has no roots.");
        }
        else
        {
          System.out.println("QE1: Közös gyök:x="+-e1.getRoot1()/e1.getRoot1());
        }
        if(e2.getDiscriminant()>0){
            System.out.println("QE2: x1="+e2.getRoot1()+" x2="+e2.getRoot2());
        }
        else if(e2.getDiscriminant()<0)
        {
            System.out.println("QE2: The equation has no roots.");
        }
        else
        {
          System.out.println("QE2: Közös gyök:x="+-e2.getRoot1()/e2.getRoot1());
        }
        if(e3.getDiscriminant()>0){
            System.out.println("QE3: x1="+e3.getRoot1()+" x2="+e3.getRoot2());
        }
        else if(e3.getDiscriminant()<0)
        {
            System.out.println("QE3: The equation has no roots.");
        }
        else
        {
          System.out.println("QE3: Közös gyök:x="+-e3.getRoot1()/e3.getRoot1());
        }
    } 
}
