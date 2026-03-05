// merging two sorted arrays
import java.util.*;
class Mixer
{
    int ar[] = new int[100];
    int n , i;
    Scanner sc = new Scanner(System.in);
    Mixer(int nx)
    {
        n = nx;
    }
    void accept()
    {
     System.out.println("enter array elements");
     for(i=0; i<n; i++)
     {
         ar[i] = sc.nextInt();
     }
    }
    Mixer mix(Mixer A)   // merging current obj array with the      parametrised obj array
    {
        Mixer result = new Mixer(n + A.n);
        int k = 0;
        for(i=0; i<n; i++)
        {
            result.ar[k] = ar[i];
            k++;
        }
        for(i=0; i<A.n; i++)
        {
            result.ar[k] = A.ar[i];
            k++;
        }
        return(result);
        
    }
    void display()
    {
        System.out.println("array is");
        for(i=0; i<n; i++)
        {
            System.out.print(ar[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n1 , n2;
        System.out.println("enter first array size");
        n1 = sc.nextInt();
        System.out.println("enter second array size");
        n2 = sc.nextInt();
        Mixer ob1 = new Mixer(n1);
        ob1.accept();
        Mixer ob2 = new Mixer(n2);
        ob2.accept();
        Mixer ob3 = new Mixer( n1 + n2 );
        ob3 = ob1.mix(ob2);
        System.out.println("merged array is");
        ob3.display();
    }
}