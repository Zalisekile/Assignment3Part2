import org.junit.*;


public class TransformerImplTest {
    TransformerInterface megatron;

    @Before
    public void setUp() throws Exception {
        megatron = new TransformerInterfaceImpl();

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