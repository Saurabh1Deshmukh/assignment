package com.test.pr;

import java.util.Arrays;
import java.util.List;

public class AlladinFly {
	
	public static void main(String[] args) {
		List<Integer> magic = Arrays.asList(2,4,5,2);
		List<Integer> distance = Arrays.asList(4,3,1,3);
		System.out.println(getJourneyPoint(magic, distance));
	}
	
	public static int getJourneyPoint(List<Integer> magic, List<Integer> distance)
	{
		int start = 0, run = 0, dist = 0;
	    for(int i=0;i<magic.size();i++){
	        run = run + magic.get(i) - distance.get(i);
	        if(run < 0){
	            start = i+1;
	            dist = dist + run;
	            run = 0;
	        }
	    }
	    return dist + run >= 0 ? start : -1; 
	}
}
