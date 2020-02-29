package po_lab02;
import static java.lang.Math.*;


public class PO_LAB02 {

    static class RownanieKwadratowe {
    
            private double a;
            private double b;
            private double c;

            public RownanieKwadratowe(double vA, double vB, double vC) {
                a = vA;
                b = vB;
                c = vC;
            } 
            public void wspolczynnikA(double a) {
                this.a = a;
            }
            
            public void wspolczynnikB(double b) {
                this.b = b;
            }
            
            public void wspolczynnikC(double c) {
                this.c = c;
            }
            
            public double rownanieObliczenia (int x){
                return (a*x)*(a*x)+ b*x + c;
            }
            
            public double delta(){
                return b*b-4*a*c;
            }
            
            public int parabola(){
                System.out.println("delta = " + delta());
                double d = delta();
                if(d > 0) return 2;
                else if(d == 0) return 1;
                else return 0;
            }
            
            public void obliczenia(){
                
                double d = delta();
                Math.sqrt(d);
                System.out.println(Math.sqrt(d));
            }

            }

    public static void main(String[] args) {
        
        RownanieKwadratowe rk = new RownanieKwadratowe(2.0, 3.0, -1.0);
        
        
    }
    
}
