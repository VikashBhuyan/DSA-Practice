package com.vikash;
//import java.io.*;
import java.util.*;

public class Basics_Of_Bit_Manipulation {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int i = scn.nextInt();
    int j = scn.nextInt();
    int k = scn.nextInt();
    int m = scn.nextInt();
    
    //write your code here
    int onmask = (1<<i);
    int ofmask = ~(1<<j);
    int togglemask = (1<<k);
    int checkmask = (1<<m);
    System.out.println(n | onmask);
    System.out.println(n & ofmask);
    System.out.println(n ^ togglemask);
    System.out.println( (n & checkmask)==0 ? true : false);
    
    scn.close();
  }

}