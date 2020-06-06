import java.util.*;
public class challenge_1
{
  public static void main(String args[])  
  {
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      int i,j;
      ArrayList<Integer> li=new ArrayList<Integer>();
      int n,k=0,num=0,sum=0;
      for(i=0;i<t;i++)
      {
          n=sc.nextInt();
          k=sc.nextInt();
          sum=0;
          for(j=0;j<n;j++)
          {
              num=sc.nextInt();
              if(num-k>0)
                  sum=sum+(num-k);
          }
          li.add(sum);
      }
      for(i=0;i<t;i++)
          System.out.println(li.get(i));
      
  }
          
}
