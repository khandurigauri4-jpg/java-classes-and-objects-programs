// display all magic numbers between 1 to n
import java.util.*;
class Magic
{
    int ar[] = new int[100];
    int n ,i;
    public Magic(int nn)
    {
        n = nn;
    }
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array elements");
        for(i=0; i<n; i++)
        {
            ar[i] = sc.nextInt();
        }
    }
    void find()
    {
        System.out.println("magic numbers in the array are");
        int s = 0;
        for(i=0; i<n; i++)
        {
            int t = ar[i];
            while(t>9)
            {
                s = 0;
                while(t>0)
                {
                    int r = t%10;
                    s = s+r;
                    t = t/10;
                }
                t = s;
            }
            if(s==1)
            System.out.print(ar[i] + " ");
        }
    }
  public static void main(String args[])
    {
        Magic ob = new Magic(10);
        ob.input();
        ob.find();
    }
}