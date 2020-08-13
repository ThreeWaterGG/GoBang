import org.junit.runner.RunWith;  
import org.junit.runners.Suite;  
import org.junit.runners.Suite.SuiteClasses;  
import org.junit.jupiter.api.Test;

@RunWith(Suite.class)
@SuiteClasses({JMineTest.class,JCounterTest.class,StuControllerTest.class})
public class AllTests {

}
