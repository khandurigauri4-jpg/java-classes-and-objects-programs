// string program through classes
import java.util.*;
class StringOP
{
    String str , rev;
    int i;
    StringOP()
    {
        str = "";
        rev = "";
    }
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        str = sc.nextLine();
    }
    void process()
    {
        System.out.println("original string is =" + str);
        int l = str.length();
        for(i = l-1; i>=0; i--)
        {
            rev = rev + str.charAt(i);
        }
        System.out.println("reversed string is =" + rev);
    }
    void find()
    {
        StringTokenizer st = new StringTokenizer(str);
        int w = 0 ;
        
        while(st.hasMoreTokens())
        {
            st.nextToken();
            w++;
            
            }
            
            System.out.println("total words = " + w);
    }
    
public static void main(String args[])
    {
        StringOP ob = new StringOP();
        ob.input();
        ob.process();
        ob.find();
    }
}