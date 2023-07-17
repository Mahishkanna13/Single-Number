import java.util.Scanner;

public class SingleNumber {
    public static int Calaculate(int[] Array)
    {
        int result=0;
        for (int i=0;i<Array.length;i++)
        {
            result = result ^ Array[i];
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size= scanner.nextInt();
        int Array[]=new int[size];
        for (int i=0;i<size;i++)
        {
            Array[i]=scanner.nextInt();
        }
        System.out.println(Calaculate(Array));
    }
}
