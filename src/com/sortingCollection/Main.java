package com.sortingCollection;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.swing.text.DateFormatter;


public class Main {

	public static void main2(String[] args) throws ParseException {
		
		DataVO dataVO =new DataVO();
		Date date=new Date();
		
		Date date2=new Date();
		date2.setHours(10);
		DateFormat format=new SimpleDateFormat("dd/mm/yy");
		System.out.println("here it is "+format.format(date2));
		
		dataVO.setStartTime("10/09/2013");
		dataVO.setEndTime("13:40");
		dataVO.setName("Ramana");
		dataVO.setDate(date2);
		DataVO dataVO2=new DataVO();
		dataVO2.setStartTime("10/09/2014");
		dataVO2.setEndTime("13:39");
		dataVO2.setName("sateesh");
		DataVO dataVO3=new DataVO();
		dataVO3.setStartTime("12/30/2016");
		dataVO3.setEndTime("13:39");
		dataVO3.setName("sridevi");
		DataVO dataVO4=new DataVO();
		dataVO4.setStartTime("12/31/2016");
		dataVO4.setEndTime("13:39");
		dataVO4.setName("maruthi");
		dataVO4.setDate(date);
		
		List<DataVO> dataVOs=new ArrayList<DataVO>();
		dataVOs.add(dataVO);
		dataVOs.add(dataVO2);
		dataVOs.add(dataVO3);
		dataVOs.add(dataVO4);
		
		Collections.sort(dataVOs,new MyComparator());
		System.out.println(date);
		System.out.println(date2);
	//	Collections.sort(dataVOs,);
		System.out.println(dataVOs);
		// TODO Auto-generated method stub

	}
	public static void main3(String[] args) throws ParseException {
		String str="C:/Capital-GDT/Capital-GDT/ENDOFLEASE/2015-02/01/vvukoti@cisco.com/terminationEThree.xlsx";
		String str2="abcdefghij";
	String str3=	str.substring(0,str.lastIndexOf("/"));
	System.out.println(str.substring(str.lastIndexOf("/")+1)+" is file name");
	System.out.println(str3);
		System.out.println(str3.substring(str3.lastIndexOf("/")+1));
	}
	
	public static void main4(String[] args) throws ParseException {
		long value=1234567;
		NumberFormat formatter = NumberFormat.getInstance();
		System.out.println(formatter.format(value));
		
	}
	public static void main(String[] args) throws ParseException {
			//LOGGER.debug(" ## converting Date to String ");
			String strDate = null;

				DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm");
				strDate = dateFormat.format(new Date(System.currentTimeMillis()));
				System.out.println(strDate);

	}
}
