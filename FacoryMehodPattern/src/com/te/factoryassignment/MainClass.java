package com.te.factoryassignment;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
      GetPlan plan = new GetPlan();
      Scanner scanner= new Scanner(System.in);
      System.out.println("Enter the plan");
      String planType = scanner.nextLine();
      System.out.println("enter the units");
      int unit=scanner.nextInt();
      
      Plan plan2 = plan.getPlan(planType);
      System.out.println(planType+" amount is "+unit);
      plan2.getRate();
      plan2.generateBill(unit);
	}
}
