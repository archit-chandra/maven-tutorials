package guru.springframework;

// NOTES: surefire plugin
//  automatically detect the test class (*Test)
public class JavaHelloWorldTest {

    // NOTES: surefire plugin
    //  test* is the convention for test method
    public void testGetHello() {
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();
        assert ("Hello World".equals(javaHelloWorld.getHello()));
    }
}