package com.sketysoft.assignment;

public class University {
   public static void main(String[] args) {

      University.divide();

      System.out.println("\tWelcome to University Lecturer Records");

//      LecturerRecord johnDoe = new LecturerRecord("", 30, new EngineeringFaculty(), new ComputerEngineeringDepartment());
//      System.out.println("Lecturer: " + johnDoe.name());
//      System.out.println("Age: " + johnDoe.age());
//      System.out.println("Has PhD: " + johnDoe.hasPhd());

//      University.divide();

//      LecturerRecord janeDoe = new LecturerRecord("Jane Doe", -35, new HumanitiesFaculty(), new SocialCareDepartment());
//      System.out.println("Lecturer: " + janeDoe.name());
//      System.out.println("Age: " + janeDoe.age());
//      System.out.println("Has PhD: " + janeDoe.hasPhd());

      University.divide();

      LecturerRecord janeBloggs = new LecturerRecord("Jane Bloggs", 24, new EngineeringFaculty(), new SoftwareEngineeringDepartment());
      System.out.println(janeBloggs);
      System.out.println("Lecturers Name: " + janeBloggs.name());
      System.out.println("Lecturers Age: " + janeBloggs.age());
      janeBloggs.whichFaculty();
      janeBloggs.whichDepartment();

      University.divide();

      LecturerRecord anneBloggs = new LecturerRecord("Dr. Anne Bloggs PhD", 35, new BusinessFaculty(), new AccountingEngineeringDepartment());
      System.out.println(anneBloggs);
      System.out.println(University.extractName(anneBloggs.name()) + " " + University.hasPhD(anneBloggs) + " a PhD");

      University.divide();

      LecturerRecord joeBloggs = new LecturerRecord("Joe Bloggs PhD", 54, new HumanitiesFaculty(), new SocialCareDepartment());
      System.out.println(joeBloggs);
      System.out.println(University.extractName(joeBloggs.name()) + " " + University.hasPhD(joeBloggs) + " a PhD");

   }// end of main method

   // method to divide sections
   private static void divide() {
      System.out.println();
      System.out.println("--------------------------------------------------");
   }// end of method divide

   // method to remove the prefix and suffix from the name
   private static String extractName(String name) {
      // check if the name contains "Dr." and "PhD" and remove them
      if (name.toLowerCase().contains("dr.") & name.toLowerCase().contains("phd")) {
         return name.substring(name.substring(0, 4).length(), name.length() - 4);
      // check if the name contains "Dr." and remove it
      } else if (name.toLowerCase().contains("dr.")) {
         return name.substring(name.substring(0, 4).length());
      // check if the name contains "PhD" and remove it
      } else if(name.toLowerCase().contains("phd")) {
         return name.substring(0,name.length() - 4);
      // or return the name as it is
      }else {
         return name;
      }
   }// end of method extractName

   // method to check if a lecturer has a PhD
   private static String hasPhD(LecturerRecord lecturerRecord) {
      // return the appropriate message based on the lecturer having a PhD or not
      return lecturerRecord.hasPhd() ? "has" : "don't have";
   }// end of method hasPhD

}