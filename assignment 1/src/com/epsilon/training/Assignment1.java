package com.epsilon.training;

public class Assignment1 {

		int day;
		int year;
		int month;
		
		public boolean isValidDate(int year, int month, int day) { 
			if(month>=1 && month<=12)
			{
			if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
			{
				if(day>=1 && day<=31)
					return true;
			}
			if(month==4 || month==6 || month==9 || month==11)
			{
				if(day>=1 && day<=30)
					return true;
			}
			if(month==2)
			{
				if(year%4==0 || year%400==0)
				{
					if(day>=1 && day<=29)
						return true;
				}
				else
				{
					if(day>=1 && day<=28)
						return true;
				}
					
			}
			
			}
			return false; 
		}
}


