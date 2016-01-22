public class Test extends Config{
    Homepage homepage = new Homepage(driver);

    @org.junit.Test
    public void test1(){
        homepage.inputData();
        homepage.clickSearchButton();
    }




}
