/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author avisr
 */

import java.util.*;
public class program2
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  
  String s1="";
  String s2="";
  String s3="";
  String pin="";
  s1=sc.next();
  s2=sc.next();
  s3=sc.next();
  ArrayList<Integer> min=new ArrayList<Integer>();
  ArrayList<Integer> max=new ArrayList<Integer>();
  
  min.add(Integer.parseInt(s1.substring(0,1)));
  min.add(Integer.parseInt(s2.substring(0,1)));
  min.add(Integer.parseInt(s3.substring(0,1)));
  Collections.sort(min);
  pin=pin+min.get(0);
  max.add(min.get(2));
  min.removeAll(min);
  
  
 min.add(Integer.parseInt(s1.substring(1,2)));
 min.add(Integer.parseInt(s2.substring(1,2)));
 min.add(Integer.parseInt(s3.substring(1,2)));
 Collections.sort(min);
 pin=pin+min.get(0);
 max.add(min.get(2));
 min.removeAll(min);
  
  
  
 min.add(Integer.parseInt(s1.substring(2,3)));
 min.add(Integer.parseInt(s2.substring(2,3)));
 min.add(Integer.parseInt(s3.substring(2,3)));
 Collections.sort(min);
 pin=pin+min.get(0);
 max.add(min.get(2));
 min.removeAll(min);
  
  Collections.sort(max);
  pin=max.get(2)+pin;
  
  System.out.println(pin);
 }
}
