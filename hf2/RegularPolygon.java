/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class RegularPolygon {
    
    private int n;
    private double side;
    private double x;
    private double y;

    public RegularPolygon()
    { 
        this.n=3; 
        this.side=1; 
        this.x=0; 
        this. y=0; 
    }

    public RegularPolygon(int n, double side)
    {
        this.n = n;
        this.side = side;
        this.x = 0;
        this.y = 0;
    }
    
    public RegularPolygon(int n, double side, double x, double y) 
    {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }
    
    public int getN()
    {
        return this.n;
    }
    
    public void setN(int n)
    {
        this.n=n;
    }
    
    public double getSide()
    {
        return this.side;
    }
    
    public void setSide(double s)
    {
        this.side=s;
    }
    
    public double getX()
    {
        return this.x;
    }
    
    public void setX(double x)
    {
        this.x=x;
    }
    
    public double getY()
    {
        return this.y;
    }
    
    public void setY(double y)
    {
        this.y=y;
    }

    public double getPerimeter()
    {
        return this.n*this.side;
    }
    
    public double getArea()
    {
        return ((this.side*this.side)*this.n)/4*Math.tan(180/this.n);
    }
    
    @Override
    public String toString() {
        return "RegularPolygon{" + "n=" + n + ", side=" + side + ", x=" + x + ", y=" + y + '}';
    } 
}
