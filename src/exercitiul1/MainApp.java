package exercitiul1;

import java.io.*;
import java.util.Random;
import java.util.Scanner;
public class MainApp {
    public static void main(String[] args) throws IOException {
        //System.out.println("Hello world");
        /* citire + afisare numar de la tastatura
        Scanner scanner=new Scanner(System.in);
        System.out.println("a=");
        int a=scanner.nextInt();
        System.out.println("Ai introdus valoarea: "+a);
        scanner.close();
         */
        /* citire + afisare din fisier
        String nume_fis="in.txt";
        BufferedReader flux_in;
        flux_in=new BufferedReader(new FileReader(nume_fis));
        String linie=flux_in.readLine();
        System.out.println("Ai bagat:"+linie);
         */
        /* citire + afisare text
        BufferedReader flux_in=new BufferedReader(new InputStreamReader(System.in));
        String linie=flux_in.readLine();
        System.out.println("Ai bagat:"+linie);
         */

        //incepem tema
        /* ex 1
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lungime = ");
        int lungime=scanner.nextInt();
        System.out.println("Latime = ");
        int latime=scanner.nextInt();
        int arie=lungime*latime;
        System.out.println("Aria este: "+arie);
        int perimetru=2*lungime+2*latime;
        System.out.println("Perimetrul este: "+perimetru);
        */
        /* ex 2
        String nume_fisier="in.txt";
        int suma=0;
        float medie=0;
        int min=99999;
        int max=-1;
        int i=0;
        Scanner scan=new Scanner(new File(nume_fisier));
        while(scan.hasNext())
        {
            int x=scan.nextInt();
            suma=suma+x;
            i++;
            if(x>max)
                max=x;
            if(x<min)
                min=x;
        }

        System.out.println("Suma: "+suma);
        medie=suma/i;
        System.out.println("Media: "+medie);
        System.out.println("Maxim: "+max);
        System.out.println("Minim: "+min);
        */
        /* ex 3
        System.out.println("Dati numarul: ");
        Scanner scan=new Scanner(System.in);
        int ok=1;
        int n=scan.nextInt();
        for(int i=2;i<n;i++)
            if(n%i==0) {
                System.out.println("Divizor: " + i);
                ok = 0;
            }
        if(ok==1)
            System.out.println("Este numar prim");
        else
            System.out.println("Nu e prim!!");
         */
        int nr1,nr2;
        Random nr_random=new Random();
        nr1=nr_random.nextInt(31);
        Random nr_random=new Random();
        nr1=nr_random.nextInt(31);
        System.out.println(altceva);
    }
}
