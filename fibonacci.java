//import neccessary packagaes
import java.util.*;
import java.util.Scanner;

//create classs name as sanket
class sanket{
  
  //create main method with Exception
public static void main(String[] args)throws IOException {
        Scanner sp = new Scanner(System.in);//take input from user(number of testcases)
        int t=sp.nextInt();
        sp.nextLine();
        for(int s=0;s<t;s++)
        {
            String str=sp.next();//
            int arr[]=new int[26];
            int i,x,k=0,l=0,m=0;
            for(i=0;i<str.length();i++)
            {
                x=(int)str.charAt(i)-97;
                arr[x]++;
            }
            for(i=0;i<26;i++)
            {
                if(arr[i]>0)
                k++;
            }
            int a[]=new int[k];
            k=0;
            for(i=0;i<26;i++)
            {
                if(arr[i]>0)
                a[k++]=arr[i];
            }
            Arrays.sort(a);
            if(k>2)
            {
                 for(i=2;i<k;i++)
                 {
                     if(a[i]!=( a[i-1]+a[i-2]))
                     {
                        l=1;
                        break;
                     }
                 }
                 x=a[0];
                 a[0]=a[1];
                 a[1]=x;
                 for(i=2;i<k;i++)
                 {
                     if(a[i]!=( a[i-1]+a[i-2]))
                     {
                        m=1;
                        break;
                     }
                 }
            }
            if(l==0 || m==0)
            System.out.println("Dynamic");
            else
            System.out.println("Not");
        }
    }
}
