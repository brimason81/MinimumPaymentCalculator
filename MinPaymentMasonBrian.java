/**
	Author:		Brian Mason
	Date: 		September 27, 2017
	Section: 	CSC-120(N01)
	Desc:		This application uses user input
				to calculate the mininum fixed monthly payment
				to pay off a balance in 12 months.	
*/

import java.util.Scanner;
public class MinPaymentMasonBrian{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//user prompts and variable declaration
		System.out.print("Enter your balance: ");
		double _balance = input.nextDouble();
		System.out.print("Enter your Annual Interest Rate: ");		
		double _annualInterestRate = input.nextDouble();
		double _monthInterest = _annualInterestRate / 12;
		double _minPayment = 10;
		double _newBalance = 0;
		
		//big loop for initial balance
		while(_balance > 0){
			_newBalance = _balance - _minPayment;
			
			//for loop after initial payment
			for(int _months = 11; _months > 0; _months--){			
				_newBalance = _newBalance + (_newBalance * _monthInterest);
				_newBalance = _newBalance - _minPayment;
			}
				//test for _minPayment
				if (_newBalance > 0){
					_minPayment = _minPayment + 10;
					_newBalance = _balance;
				}else{
					break;
				}	
		}	
		//output results
		System.out.printf("Lowest Payment: $ %3.0f", _minPayment);
	}
	
}
 
