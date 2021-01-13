package edu.cnm.deepdive;

public class UnderstandingNull {

  static Object myObject = new Object();
  static Object myOtherObject;

  static String myString;

  public static void main(String[] args) {
      Object myLocalObject = new Object();
      Object anotherLocalObject;

      String name = "Java";
      String anotherName = null;

    System.out.println("myObject = " + myObject);
    System.out.println("myOtherObject = " + myOtherObject);



    System.out.println("myLocalObject = " + myLocalObject);
//    System.out.println("anotherLocalObject = " + anotherLocalObject); does not compile because a
//    local object needs to be initialized.

    System.out.println("name = " + name);
    System.out.println("anotherName = " + anotherName);

//    myString.toLowerCase();
//    System.out.println("myString = " + myString); gives you a NullPointerException because
//    myString was never initialized so it is set to null as default.
  }

}
