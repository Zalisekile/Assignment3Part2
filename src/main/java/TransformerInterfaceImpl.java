public class TransformerInterfaceImpl implements TransformerInterface {

    public String transform(String model, String brand)
    {
        return "I have transformed into a " + brand +" " + model;
    }
}
