import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig
{
    @Bean(name = "transformer")
    public TransformerInterface getService()
    {
        return new TransformerInterfaceImpl();
    }
}
