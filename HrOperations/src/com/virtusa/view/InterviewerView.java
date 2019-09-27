package com.virtusa.view;

import java.util.Scanner;

import com.virtusa.controller.InterviewerController;

public class InterviewerView {
	public void interviewerView() 
	{
		System.out.println("=======Interviewer View======");
		Scanner scanner = new Scanner(System.in);
		System.out.println("1->Conduct Interview");
		System.out.println("2-> Result update");
		System.out.print("please Enter option:");
		int value = scanner.nextInt();
		InterviewerView interviewerView=new InterviewerView();
		if(value==1)
		{
			InterviewerController interviewerController=new InterviewerController();
		//	interviewerController.
		}
		
	}
}
