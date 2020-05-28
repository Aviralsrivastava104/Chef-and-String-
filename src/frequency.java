import java.util.*;
public class frequency
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str="";
        str=sc.next();
        int l=str.length();
        int i;
        int arr[]=new int[26];
        for(i=0;i<l;i++)
        {
            arr[(int)str.charAt(i)-97]++;
        }
        for(i=0;i<26;i++)
        {
            if(arr[i]!=0)
            {
                System.out.println((char)(i+97)+" "+arr[i]);
            }
        }
    }
}