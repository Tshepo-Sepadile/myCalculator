package ac.za.cput;
import org.springframework.context.annotation.*;

@Configuration
public class AppConfig {
    @Bean(name ="calcu")
    public myCalculator getService()
    {
        return new calculatorReloaded();
    }
}
