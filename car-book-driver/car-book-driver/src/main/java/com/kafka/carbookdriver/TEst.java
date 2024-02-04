package com.kafka.carbookdriver;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
//        int arr[];
        for (int i=0;i<=nums.length-1;i++){
            for(int j=i;j<=nums.length-1;j++){
                if (nums[i]+nums[j]==target){
                	System.out.println("The Sum of Target values are:"+nums[i]+":"+nums[j]);
                	return new int [] {nums[i],nums[j]};
                }
            }
        }
//        return arr;
		return new int[] {};
       
    }
    
    public static  int reversePalindromeNumber(int num) {
    	
    	int sum = 0,remainder,temp;
    	
    	while(num>0) {
    		remainder=num%10;
    		sum=(sum*10)+remainder;
    		num=num/10;
    	}
    	System.out.println(sum);
    	return sum;
    }
    
    public static int romanSum(String s) {
    	

        
       int  temp=0;
    		   int sum=0;
        Map<Character,Integer> map=new HashMap();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
          
        char[] charArray = s.toCharArray();

    
    for (int i=0;i<=charArray.length-1;i++){

    if (	i < s.length() - 1 && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))){
    sum-=map.get(charArray[i]);
    }else{
    	sum+=map.get(charArray[i]);
    }
        }
       
    	
    	return sum;
    }
}

 class Result {
	    /*
	     * Complete the 'fizzBuzz' function below.
	     *
	     * The function accepts INTEGER n as parameter.
	     */

	    public static void fizzBuzz(int n) {
	        
	        for(int i=1;i<=n;i++){
	            if (i%3==0 && i%5==0){
	                System.out.println("FizzBuzz");
	            }else if (i%5==0){
	                System.out.println("Buzz");
	            }else if (i%3==0){
	                System.out.println("Fizz");
	            }else{
	                System.out.println(i);
	            }
	        }
	    // Write your code here

	    }
	    
	   

	}

	public class TEst {
	    
	    public static void main(String[] args){
//	        Scanner n=new Scanner(System.in)?;
	    //    Result result=new Result();
	    //    result.fizzBuzz(n.nextInt());
//	    Result.fizzBuzz(n.nextInt());
	    
	    int array[]= {10,20,10,20,50,60};
	    int target=70;
	    int[] twoSum = Solution.twoSum(array, target);
//	    System.out.println(Arrays.toString(twoSum));
	    Solution.reversePalindromeNumber(256489);
	    
	    int romanSum = Solution.romanSum("IV");
	    System.out.println("the Roman Sum is:"+romanSum);
	    }
	}


