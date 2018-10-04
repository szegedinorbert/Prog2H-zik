/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Metodusok {
    
    public static void novekvo(int a, int b, int c)
    {
        int max, mid, min;
        if( a > b ){
        if( a > c ){
        max = a;
        if( b > c ){
            mid = b;
            min = c;
        }else{
            mid = c;
            min = b;
            }
        }else
        {
            mid = a;
            max = c;
            min = b;
        }
        }else{
        if( b > c ){
            max = b;
        if( a > c ){
             mid = a;
             min = c;
        }else{
            mid = c;
            min = a;
        }
        }else{
            mid = b;
            max = c;
            min = a;
         }
        }   
        System.out.println("A növekvő sorrend a következő: " + min + " < " + mid + " < " + max);
        
        
    }
    
    public static void minaemax(double a, double b, double c)
    {
        double min=0, aa, ba, ca, maxa=0;
        if (a<b && a<c)
        
            min = a;
            if(b<a && b<c)
                min = b;
                if(c<a && c<b)
                    min = c;
        
        
        if(a<0) aa=a*-1;
        else aa=a;
        if(b<0) ba=b*-1;
        else ba=b;
        if(c<0) ca=c*-1;
        else ca=c;
        
        if(aa>ba && aa>ca)
        
            maxa=aa;
        if(ba>aa && ba>ca)
                maxa=ba;
        if(ca>aa && ca>ba)
                    maxa=ca;
        
        System.out.println("\nA három szám minimuma = " + min + "\nA három szám absz. maximuma = " + maxa);
        
            
        
    }
    
    public static void negyszam(double a, double b,double c, double d)
    {
        System.out.println("\nAz eredeti sorrend: "+ a + "," + b + "," + c + "," + d);
        if (d>=0)
        {
            System.out.println("A megváltozott sorrend" + a + "," + c + "," + b + "," + d);
        }
        else System.out.println("A megváltozott sorrend" + a + "," + b + "," + d + "," + c);
    }
    
    public static boolean isHaromszog(double a, double b, double c)
    {
        if(a<0 || b<0 || c<0){
            return false;
        }
        if(a+b>c && a+c>b && b+c>a){
            return true;
        }    
        else
            return false;
    }
    
    public static void szokoev(int ev1, int ev2)
    {
        
        int szokodb=0;
        int i;
        if (ev1<ev2)
        {
            
            for(i=ev1;i<=ev2;i++)
            {
                if (i%4==0 && i%100!=0 || i%400==0)
                {
                    szokodb=szokodb+1;
                }
            }
            System.out.println("\nA két év közt " + szokodb + " db szökőév van.");
        }
        else
        if (ev2<ev1)
        {
            for(i=ev2;i<=ev1;i++)
            {
               if(i%4==0 && i%100!=0 || i%400==0)
               {
                   szokodb=szokodb+1;
               }
            }
            System.out.println("A két év között " + szokodb + " db szökőév van.");
        }
        else
        if (ev2==ev1)
        {
            if(ev1%4==0 && ev1%100!=0 || ev1%400==0)
            {
                System.out.println("Az év szököév");
            }
            else System.out.println("Az év nem szökőév");
        }
        
        
    }
    
    public static void ertekeles(int jegy)
    {
        switch(jegy){
            case 1: System.out.println("\nElégtelen\n");
            break;    
            case 2: System.out.println("\nElégséges\n");
            break;
            case 3: System.out.println("\nKözepes\n");
            break;
            case 4: System.out.println("\nJó\n");
            break;
            case 5: System.out.println("\nKiváló\n");
            break;
            default: System.out.println("\nIlyen jegy nem létezik!\n");
            break;
         }
    }
    
    public static int osztas(int a, int b)
    {
        int hanyados=0;
        while(a>=b)
        {
            hanyados=hanyados+1;
            a=a-b;
        }
        return hanyados;
    }
    
    public static void isPrime(int a)
    {  
        int i;
        int osz=0;
        for(i=1;i<=Math.sqrt(a);i++)
        {
            if(a%i==0)
            {
                osz=osz+1;
            }
        }
        if(osz==1)
        {
            System.out.println("\nPrímszám!\n");
        }
        else 
            System.out.println("\nNem prímszám!\n");
    }
    
    public static void fibonacci(int n)
    {
        int a=0;
        int b=1;
        int c;
        int k;
        if(n==1)
        {
            System.out.println(a);
        }
        else
        if(n==2)
            System.out.println(a + " " + b);
        else
        {
            c=a+b;
            System.out.println(a + "," + b + "," + c);
            k=3;
            while(k<n)
            {
                a=b;
                b=c;
                c=a+b;
                System.out.println(c);
                k=k+1;
            }
        }   
        
        
    }
    public static void fibonacci2(int n)
    {
        int a = 1;
        int b = 0;
        int k;
        System.out.println("A " + n + " Fibonacci-szám:");
        for(k=0;k<=n;k++)
        {
            System.out.println(b);
            b=a+b;
            a=b-a;
        }
    }
    
    public static void fordsorrend(int szam)
    {
        int ujszam=0;
        
        while(szam!=0)
        {
            int maradek = szam%10;
            ujszam = ujszam*10+maradek;
            szam=szam/10;
        }
        
        System.out.println("\nA fordított sorrend a következő: " + ujszam + "\n");
    }
    
    public static long fakt(int n)
    {
         long eredmeny = 1;
         int i=1;
         while(i<(n+1))
         {
             eredmeny = eredmeny*i;
             i++;
         }
         return eredmeny;
    }
    
    public static void oszthato(int k)
    {
        int a=1;
        int b=20;
        int i;
        System.out.println("\nA két szám között lévő " + k + " osztható számok:");
        if(a<b)
        {
            for(i=a;i<=b;i++)
            {
                if(i%k==0)
                    System.out.println(i);
            }      
        }
        if(b<a)
        {
            for(i=b;i<=a;i++)
            {
                if(i%k==0)
                    System.out.println(i);
            }      
        }
    }
    
    public static int legkissebbfibonacci(int n)
    {
        if(n<0)
        {
            return 0;
        }
        int tmp=0;
        int a=1;
        int b=1;
        while(b<=n)
        {
            tmp=b;
            b=b+a;
            a=tmp;
        }
        return b;
    }
    
    public static void kobosszeg()
    {
        int i;
        for(i=0;i<1000;i++)
        {
            double osszeg=0;
            int tmp=i;
            while(tmp!=0){
                osszeg+=Math.pow(tmp%10, 3);
                tmp=tmp/10;
            }
            if(osszeg==1)
            {
                System.out.println("\n" + i);
            }
        }
    }
    
    
    
    
    
    public static void main(String[] args) {
        
        novekvo(18,128,1228);
        minaemax(6,-40,8);
        negyszam(4,128,68,88);
        isHaromszog(1,1,1);
        szokoev(1920,2020);
        ertekeles(5);
        System.out.println("A szám egész hányadosa: " + osztas(10,2));
        isPrime(5);
        fibonacci2(11);
        fordsorrend(321);
        System.out.println("A szám faktoriálisa: " + fakt(5));
        oszthato(2);
        System.out.println("\nA legkisebb Fibonacci-szám: " + legkissebbfibonacci(10));
        kobosszeg(); 
    }
}


