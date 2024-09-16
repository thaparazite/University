package com.sketysoft.assignment;


public abstract sealed class Department permits ComputerEngineeringDepartment, SoftwareEngineeringDepartment, AccountingEngineeringDepartment, SocialCareDepartment {

}

final class ComputerEngineeringDepartment extends Department {
   public void compEng() {
      System.out.println("Custom Computer Engineering");
   }
   @Override
   public String toString() {
      return "Computer Engineering";
   }
}//end of class ComputerEngineeringDepartment

final class SoftwareEngineeringDepartment extends Department {
   public void swEng() {
      System.out.println("Custom Software Engineering");
   }
   @Override
   public String toString() {
      return "Software Engineering";
   }
}// end of class SoftwareEngineeringDepartment

final class AccountingEngineeringDepartment extends Department {
   public void accounting() {
      System.out.println("Custom Accounting Engineering");
   }
   @Override
   public String toString() {
      return "Accounting Engineering";
   }
}//end of class AccountingEngineeringDepartment

final class SocialCareDepartment extends Department {
   public void socialCare() {
      System.out.println("Custom Social Care");
   }
   @Override
   public String toString() {
      return "Social Care";
   }
}