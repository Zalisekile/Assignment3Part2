import org.junit.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TransformerImplTest {
   private TransformerInterface megatron;

    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        megatron = (TransformerInterface)ctx.getBean("transformer");

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void transform() throws Exception
    {
        String brand = "Ford";
        String model = "Cortina";
        String result = megatron.transform(model,brand);
        Assert.assertEquals("I have transformed into a " +brand+ " "+ model,result);
    }

}