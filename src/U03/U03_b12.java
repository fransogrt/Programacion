package U03;
//12.Escribe un programa que permita determinar la probabilidad con que
//aparece cada uno de los valores al lanzar un dado. Para ello se lanzará el
//dado 1.000.000 de veces y se visualizará cuántas veces a aparecido cada
//número y el porcentaje que representa respecto al total
public class U03_b12 {
    public static void main(String[] args){
        final int max=1000000;
        int p1=0,p2=0,p3=0,p4=0,p5=0,p6=0, rnd;
        float a,b,c,d,e,f;
        for(int i=0; i<=max;i++){
            rnd= (int)(Math.random( )*6) + 1;
            switch(rnd){
                case 1:
                    p1++;
                    break;
                case 2:
                    p2++;
                    break;
                case 3:
                    p3++;
                    break;
                case 4:
                    p4++;
                    break;
                case 5:
                    p5++;
                    break;
                case 6:
                    p6++;
                    break;
            }
        }
        System.out.printf("Han salido %d veces 1 ", p1);
        a= (float) (p1 * 100) /(p1+p2+p3+p4+p5+p6);
        System.out.printf("siendo un %.2f de probabilidad%n", a);
        System.out.printf("Han salido %d veces 2 ", p2);
        b= (float) (p2 * 100) /(p1+p2+p3+p4+p5+p6);
        System.out.printf("siendo un %.2f de probabilidad%n", b);
        System.out.printf("Han salido %d veces 3 ", p3);
        c= (float) (p3 * 100) /(p1+p2+p3+p4+p5+p6);
        System.out.printf("siendo un %.2f de probabilidad%n", c);
        System.out.printf("Han salido %d veces 4 ", p4);
        d= (float) (p4 * 100) /(p1+p2+p3+p4+p5+p6);
        System.out.printf("siendo un %.2f de probabilidad%n", d);
        System.out.printf("Han salido %d veces 5 ", p5);
        e= (float) (p5 * 100) /(p1+p2+p3+p4+p5+p6);
        System.out.printf("siendo un %.2f de probabilidad%n", e);
        System.out.printf("Han salido %d veces 6 ", p6);
        f= (float) (p6 * 100) /(p1+p2+p3+p4+p5+p6);
        System.out.printf("siendo un %.2f de probabilidad", f);

    }
}
