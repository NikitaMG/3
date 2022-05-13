import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
public class TaskTest {
    @Test
    public void testMorse(){
Task task=new Task();
Assert.assertEquals(2,task.uniqueMorseRepresentations(new String[]{"gin","zen","gig","msg"}));
Assert.assertEquals(1,task.uniqueMorseRepresentations(new String[]{"a"}));
    }
    @Test
    public void testHappyNumber(){
        Task task = new Task();
        Assert.assertTrue(task.isHappy(19));
        Assert.assertFalse(task.isHappy(2));
    }
    @After
    public void cleanUp() {
        System.setOut(null);
    }
}
