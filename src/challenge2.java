import java.util.*;
public class challenge2 
{
 public static void main(String[] args)
 {
     Scanner sc=new Scanner(System.in);
     int t=sc.nextInt();
     int i,l=0,j=0;
     String str="";
     String st="";
     int count=0;
     ArrayList<Integer> li=new ArrayList<Integer>();
     for(i=0;i<t;i++)
     {
         str=sc.next();
         str=str+"";
         l=str.length();
         for(j=0;j<l;)
         {
             if(j>=l-1)
                break;
            if(((str.charAt(j)=='x')&&(str.charAt(j+1)=='y'))||((str.charAt(j)=='y')&&(str.charAt(j+1)=='x')))
            {
                count++;
                j=j+2;
            }
            else
                j++;
         
            
         }
         li.add(count);
         count=0;
     }
     for(i=0;i<t;i++)
         System.out.println(li.get(i));
 }
}
