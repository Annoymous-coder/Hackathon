package practice;
import java.util.*;
public class AngleBetweenHourAndMinuteHand 
{	
	public int getDegree(double hour, double min)
	{
		double degree = 0;
		
		if(min > 60)
			min = min % 60;
		if(hour > 12)
			hour = hour % 12;
		if(min == 60)
			min = 0;
		if(hour == 12)
			hour = 0;
		double hourDegree = (( hour * 60 ) + min ) * 0.5;
		
		double minDegree = ( min * 6);
	
		degree = Math.abs(minDegree - hourDegree); 
		degree = Math.min(degree , 360 - degree);
		
		return (int)degree;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double hour = 6;
		double min = 28.7924;
		
		AngleBetweenHourAndMinuteHand obj = new AngleBetweenHourAndMinuteHand();
		System.out.println("The degree is " + obj.getDegree(12, 39.7827));
		System.out.println("The degree is " + obj.getDegree(6 ,33.8151));
	}
}
//HOUR HAND MOVES 360D IN 12 HOUR AND 30D IN ONE HOUR AND 30/60D IN ONE MIN THAT IS 0.5D / MIN
//MINUTE HAND MOVES 360D FOR 60MINS AND FOR ONE MIN IT MOVES 360/60D OR 6D / MIN
//SO FOR EX H = 4 AND M = 20
//TOTAL MINUTES IS 4*60 + 20 THAT IS 260 MINS.
//HOUR HAND MOVES 260 * 0.5D THAT IS 130 D
//MINUTE HAND MOVES 260 * 5D THAT IS 1300 D, SINCE ITS OUT OF RANGE WE NEED TO GET IT WITHIN 360D.
//THAT IS DONE BY GETTING MOD360 WITH ANY DEGREE TO GET ACTUAL DEGREE.
//RESULT IS 220 AND GREATER THAN 180 DEGREE SO SUBTRACT WITH 360 TO GET 140 DEGREE.
//THIS IS THE ACTUAL MOVEMENT OF MINUTE HAND.
//THE ANGLE BETWEEN BOTH IS THE ABS(HOUR D - MIN D) is 10 D

//LOGIC IS TO FIND BOTH HOUR HAND DEGREE AND MINUTE HAND DEGREE WRT 12
//SO IF HOUR IS 12 THEN MAKE HOUR AS 0 . SIMILARLY FOR MIN IF MINUTE IS 60 THEN MAKE IT 0 SINCE FOR EX 9 60 IS NOT 10 BUT 9:00 O'CLOCK
//CHECK IF MINUTE IS > 60 THEN USE MOD 60 FOR CORRECT MIN
//SAME FOR HOUR IS > 60 THEN MOD 12 GETS CORRECT HOUR

//FOR HOUR DEGREE THE MOVEMENT IS HOUR * 60 MINS + MIN GIVEN * 0.5 AS HOUR HAND MOVES 0.5D EVERY MIN
//FOR MIN DEGREE ITS JUST MIN GIVEN * 6 , DONT ADD HOURS HERE SINCE ITS ALREADY WRT 12

//SUBTRACT WITH ABS() 
//IF DEG > 180 THEN DEG = 360 - DEG