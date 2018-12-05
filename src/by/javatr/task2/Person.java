package by.javatr.task2;

public class Person {
   String firstName;
   String secondName;
   String thirdName;
   String address;
   String phoneNumber;
   Person(String firstName, String secondName, String thirdName,
          String address, String phoneNumber){
       this.firstName = firstName;
       this.secondName = secondName;
       this.thirdName = thirdName;
       this.address = address;
       this.phoneNumber = phoneNumber;
   }
   @Override
    public String toString(){
       StringBuilder str = new StringBuilder();
       str.append("firstName: "+ firstName + "\n");
       str.append("secondName: "+ secondName + "\n");
       str.append("thirdName: "+ thirdName + "\n");
       str.append("address: "+ address + "\n");
       str.append("phone number: "+ phoneNumber + "\n");
       return str.toString();
   }
}
