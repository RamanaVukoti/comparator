package com.sortingCollection;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;



public class MyComparator implements Comparator<DataVO> {

	public int compare(DataVO o1, DataVO o2) {
		
		
		/*if(o1.getStartTime().compareTo(o1.getStartTime())==0){
			
			return o1.getEndTime().compareTo(o2.getEndTime());
			
		}
		else{
			return o1.getStartTime().compareTo(o1.getStartTime());
		}*/
		System.out.println("return "+o1.getStartTime().compareTo(o2.getStartTime()));
		return ( convertStringToUtilDate(o1.getStartTime()).compareTo(convertStringToUtilDate(o2.getStartTime())));
		
		
		
	}
	 public  Date convertStringToUtilDate(String dateInString) {
		 SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		 Date date=null;
			if(dateInString!=null && !"".equalsIgnoreCase(dateInString)){
				try {
					  date = formatter.parse(dateInString);
				} catch (ParseException e) {
					
					
				}
	
			}	 
			return date;
	 }

}
