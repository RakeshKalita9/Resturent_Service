package com.weeklyTest.RakeshAssignment.Service.Model;

public class Resturent {
    public String Id;
  public String Name;
  public String address;
  public String Phone_Number;
  public String Speciality;
  public String Total_Stuff;
  public Resturent(){
     System.out.println("Default Const Is Called From Resturent Class");
  }
  public Resturent(String Id, String Name, String address, String Phone_Number, String Speciality ,String Total_Stuff){
      this.Id =Id;
      this.Name = Name;
      this.address = address;
      this.Phone_Number= Phone_Number;
      this.Speciality = Speciality;
      this.Total_Stuff=Total_Stuff;
      System.out.println("Param Const Is Called "+this.Name);
  }
}
