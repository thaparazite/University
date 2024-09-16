package com.sketysoft.assignment;

public record LecturerRecord(String name, Integer age, Faculty faculty, Department department) {

   public LecturerRecord {
      if (name.isBlank() || age < 1) {
         String errorMsg = """
                 
                 Illegal Argument Passed:
                        "name": %s,
                        "age": %s
                 """.formatted(name, age);
         throw new IllegalArgumentException(errorMsg);
      }//end of if statement

   }//end of constructor

   public boolean hasPhd() {
      String prefix = name.substring(0, 3).toUpperCase();
      String suffix = name.substring(name.length() - 3).toUpperCase();

      return switch (prefix) {
         case "DR." -> true;
         default -> switch (suffix) {
                        case "PHD" -> true;
                        default -> false;
         };
      };//end of switch statement
   }// end of method hasPhd

   public void whichFaculty(){
      switch(faculty){
         case EngineeringFaculty engineeringFaculty -> {
            System.out.println("Faculty of: " + engineeringFaculty);
            engineeringFaculty.engineering();
         }
         case HumanitiesFaculty humanitiesFaculty -> {
            System.out.println("Faculty of: " + humanitiesFaculty);
            humanitiesFaculty.humanities();
         }
         case BusinessFaculty businessFaculty -> {
            System.out.println("Faculty of: " + businessFaculty);
            businessFaculty.business();
         }
         default -> throw new IllegalStateException("Invalid faculty: " + faculty);
      }
   }// end of method whichFaculty

   public void whichDepartment(){
      switch(department){
         case ComputerEngineeringDepartment computerEngineeringDepartment -> {
            System.out.println("Department of: " + computerEngineeringDepartment);
            computerEngineeringDepartment.compEng();
         }
         case SoftwareEngineeringDepartment softwareEngineeringDepartment -> {
            System.out.println("Department of: " + softwareEngineeringDepartment);
            softwareEngineeringDepartment.swEng();
         }
         case AccountingEngineeringDepartment accountingEngineeringDepartment -> {
            System.out.println("Department of: " + accountingEngineeringDepartment);
            accountingEngineeringDepartment.accounting();
         }
         case SocialCareDepartment socialCareDepartment -> {
            System.out.println("Department of: " + socialCareDepartment);
            socialCareDepartment.socialCare();
         }
         default -> throw new IllegalStateException("Invalid department: " + department);
      }
   }// end of method whichDepartment

}// end of record LecturerRecord
