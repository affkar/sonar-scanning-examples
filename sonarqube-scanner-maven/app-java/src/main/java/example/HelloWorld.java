package example;

public class HelloWorld {

  public void functionality1() {
    System.out.println("coveredByUnitTest1");
    System.out.println("coveredByUnitTest2");
    System.out.println("coveredByUnitTest3");
  }

  public void functionality2() {
    System.out.println("coveredByIntegrationTest1");
    System.out.println("coveredByIntegrationTest2");
    System.out.println("coveredByIntegrationTest3");
  }

  public void notCovered() {
    System.out.println("notCovered");
  }

}
