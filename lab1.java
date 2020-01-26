/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author micha
 */
public class lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Zad 01");
            /*
                ZAD 01
            Napisz program który wypisze tekst „Hello World”.
            */
        System.out.println("Hello World");
        
        System.out.println(" ");
        System.out.println("Zad 02");
            /*
                ZAD 02
            Napisz program który przypisze zmiennej 
            a wartość 3 i wypisze:
            - a*2
            - a^5(Math.pow(a,b))
            - (a+3)^3
            - (a-2)^6
            - pierwiastek kwadratowy z 5(Math.sqrt(a))
            */
        int a = 3;
        System.out.println("a = " + a);
        System.out.println("a*2 = " + a*2);
        System.out.println("a^5 = " + Math.pow(a, 6));
        System.out.println("(a+3)^3 = " + Math.pow((a+3), 3));
        System.out.println("(a-2)^6 = " + Math.pow((a-2),6));
        System.out.println("Pierwiastek kwadratowy z 5 wynosi =  " + Math.sqrt(5));
        
        System.out.println(" ");
        System.out.println("Zad 03");
            /*
                ZAD 03
            Napisz program, który wypisze wartość maksymalną z dwóch liczb a i b
            */
        int b = 7;
        System.out.println("Z zestawu liczb " + a + " i " + b + " większa jest : " + Math.max(a, b));
        
        System.out.println(" ");
        System.out.println("Zad 04");
            /*
                ZAD 04
            Zmodyfikuj program 2 tak, aby wypisywał wartość maksymalną i minimalną z 3 liczb a, b i c.
            */
        int c = 1;
        System.out.println("Największa liczba z tego zestawy: " + a + ", " + b + ", " + c + " to: " + Math.max(a, (Math.max(b, c))));
        
        /*
            ZAD 05
        Skompiluj i uruchom poniższy kod

        */
        System.out.println(" ");
        System.out.println("Zad 05");
        
        
        
    }
    
    
}
