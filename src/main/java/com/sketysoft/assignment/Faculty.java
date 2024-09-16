package com.sketysoft.assignment;


public abstract sealed class Faculty implements Educational permits EngineeringFaculty, HumanitiesFaculty, BusinessFaculty{

}// end of class Faculty

sealed interface Educational {
}// end of interface Educational

final class EngineeringFaculty extends Faculty {
   public void engineering() {
      System.out.println("Custom Engineering");
   }
   @Override
   public String toString() {
      return "Engineering";
   }
}// end of class EngineeringFaculty

final class HumanitiesFaculty extends Faculty {
   public void humanities() {
      System.out.println("Custom Humanities");
   }
   @Override
   public String toString() {
      return "Humanities";
   }
}

final class BusinessFaculty extends Faculty {
   public void business() {
      System.out.println("Custom Business");
   }
   @Override
   public String toString() {
      return "Business";
   }
}// end of class BusinessFaculty
