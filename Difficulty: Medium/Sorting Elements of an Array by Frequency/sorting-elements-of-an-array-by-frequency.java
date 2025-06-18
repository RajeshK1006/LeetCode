/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code here
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		for(int i=0;i<t;i++){
		    int n = Integer.parseInt(sc.nextLine());
		    String[] vals = sc.nextLine().split(" ");
		    int[] arr = new int[vals.length];
		    for(int j=0;j<n;j++){
		        arr[j] = Integer.parseInt(vals[j]);
		    }
		    
		    int[] res = helper(arr,n);
		    for(int num: res){
		        System.out.print(num +" ");
		    }
		    System.out.println();
		}
		
	}
	
	static int[] helper(int[] arr, int n){
	    Map<Integer,Integer> map = new HashMap<>();
	    List<Integer> ar = new ArrayList<>();
	    for(int num : arr){
	        ar.add(num);
	        map.put(num, map.getOrDefault(num,0)+1);
	    }
	    
	    Collections.sort(ar, (a,b)->{
	        int fa = map.get(a);
	        int fb = map.get(b);
	        
	        if(fa!=fb){
	            return Integer.compare(fb,fa);
	        }
	        else{
	            return Integer.compare(a,b);
	        }
	    });
	    
	    for(int i=0;i<ar.size();i++){
	        arr[i] = ar.get(i);
	    }
	    
	    return arr;
	}
}