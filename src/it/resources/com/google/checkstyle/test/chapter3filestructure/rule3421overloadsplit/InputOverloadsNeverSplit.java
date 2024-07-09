package com.google.checkstyle.test.chapter3filestructure.rule3421overloadsplit;

/**
 * Testing.
 */
public class InputOverloadsNeverSplit {

  int abc;

  int bcd;

  void foo() {}

  InputOverloadsNeverSplit() {}

  InputOverloadsNeverSplit(String a) {}

  void foo2() {}

  InputOverloadsNeverSplit(int a) {}
  // violation above 'Constructors should be grouped together.*'

  int abcd;

  InputOverloadsNeverSplit(double x) {}
  // violation above 'Constructors should be grouped together.*'

  private enum InnerEnum1 {

    one;

    int xyz;

    InnerEnum1() {}

    InnerEnum1(String f) {}

    String str;

    String str2;

    InnerEnum1(int x) {} // violation 'Constructors should be grouped together.*'

    private abstract class Inner {
      Inner() {}

      int xyz;

      String neko;

      Inner(String g) {} // violation 'Constructors should be grouped together.*'
    }

    InnerEnum1(double d) {} // violation 'Constructors should be grouped together.*'
  }

  InputOverloadsNeverSplit(float x) {}
  // violation above 'Constructors should be grouped together.*'

  InputOverloadsNeverSplit(long l) {}
  // violation above 'Constructors should be grouped together.*'

  private class Inner {
    Inner() {}

    Inner(String str) {}

    // Comments are allowed between constructors.
    Inner(int x) {}
  }

  private class Inner2 {
    Inner2() {}

    Inner2(String str) {}

    int xyz;

    Inner2(int x) {} // violation 'Constructors should be grouped together.*'

    String xx;

    Inner2(double d) {} // violation 'Constructors should be grouped together.*'

    // violation below 'Constructors should be grouped together.*'
    Inner2(float f) {}
  }

  InputOverloadsNeverSplit(long l, double d) {}
  // violation above 'Constructors should be grouped together.*'

  InputOverloadsNeverSplit annoynmous = new InputOverloadsNeverSplit() {
    int xyz;

    void test() {}

    void test2() {}
  };

  private enum InnerEnum2 {
    ONE, TWO, THREE;
    void test() {}

    void test2() {}

    void test3() {}
  }

  private enum InnerEnum3 {
      InnerEnum3() {}
  }

  private enum InnerEnum4 {}

  private class Inner3 {
    void test() {}

    void test2() {}

    void test3() {}
  }

  private class Inner4 {
    Inner4() {}
  }

  private class Inner5 {}

  public void overloadMethod(int i) {
    //some foo code
  }

  public void overloadMethod(String s) {
    //some foo code
  }

  public void overloadMethod(boolean b) {
    //some foo code
  }

  public void fooMethod() {

  }

  // violation below 'All overloaded methods should be placed next to each other. .* '137'.'
  public void overloadMethod(String s, Boolean b, int i) {
    //some foo code
  }

  InputOverloadsNeverSplit anonymous = new InputOverloadsNeverSplit() {
    public void overloadMethod(int i) {
      //some foo code
    }

    public void overloadMethod(String s) {
      //some foo code
    }

    public void overloadMethod(boolean b) {
      //some foo code
    }

    public void fooMethod() {

    }

    // violation below 'All overloaded methods should be placed next to each other. .* '159'.'
    public void overloadMethod(String s, Boolean b, int i) {
      //some foo code
    }
  };

  public void testing() {
  }

  private void testing(int a) {
  }

  public void testing(int a, int b) {
  }

  public static void testing(String a) {
  }

  public void testing(String a, String b) {
  }

  interface Fooable {
    public abstract void foo(int i);

    public abstract void foo(String s);

    public abstract void noFoo();

    public abstract void foo(String s, Boolean b, int i);
    // violation above 'All overloaded methods should be placed next to each other. .* '191'.'

  }

  enum FooType {
    Strategy(""),
    Shooter(""),
    RPG("");

    private String description;

    private FooType(String description) {
      this.description = description;
    }

    public String getDescription() {
      return description;
    }

    public void setDescription(String description) {
      this.description = description;
    }

    public void overloadMethod(int i) {
      //some foo code
    }

    public void overloadMethod(String s) {
      //some foo code
    }

    public void overloadMethod(boolean b) {
      //some foo code
    }

    public void fooMethod() {

    }

    // violation below 'All overloaded methods should be placed next to each other. .* '227'.'
    public void overloadMethod(String s, Boolean b, int i) {
      //some foo code
    }
  }
}
