import junit.framework.TestCase;

public class TestNewCircleArea1 extends TestCase {

	public void testArea() {
		//fail("Not yet implemented");
		NewCircle C = new NewCircle ();
		float t = C.area(1);
		assertEquals((float)3.14,t);
	}

}
