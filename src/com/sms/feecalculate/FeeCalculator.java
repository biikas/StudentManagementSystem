package com.sms.feecalculate;

import com.sms.dto.Student;

public abstract class FeeCalculator {
//	double tutionFee=2200.0;
// 	double computerFee =400.0;
// 	double idCard=600.0;
//	Left to do. 
	
	
	public double tutionFeeCalculate(Student s,double idCard,double monthlyFee) {
		double tutionFee=idCard+monthlyFee;
		return tutionFee;
	}
	public double tutionANDhostelFeeCalculate(Student s,double tutionFee,double hostelFee) {
		double totalFee= tutionFee+hostelFee;
		return totalFee;		
	}
		
	public static void main(String args[]) {
		RegularStudent r1  =new RegularStudent();
		
					
	}

}
