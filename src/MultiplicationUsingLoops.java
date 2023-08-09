import java.util.Scanner;
public class MultiplicationUsingLoops
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);

                    //Using For Loops
      int table = sc.nextInt();
      for (int i=1; i<=10;i++){
          System.out.printf("%d X %d = %d\n",table,i,table*i);
      }
                    //Using While loops
     int table1 = sc.nextInt();
     int i = 1;
     while(i<=10){
        System.out.printf("%d X %d = %d\n",table1,i,table1*i);
        i++;
    }
                    //Using Do While Loops
     int table2 = sc.nextInt();
     int a = 1;
     do{
         System.out.printf("%d X %d = %d\n",table2,a,table2*a);
         a++;
     }
     while (a<=10);









    }
}
