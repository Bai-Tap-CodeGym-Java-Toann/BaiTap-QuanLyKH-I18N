package lanaDrahrepus.configuration;

import lanaDrahrepus.services.CustomerService;
import lanaDrahrepus.services.ProvinceService;
import lanaDrahrepus.services.impl.CustomerServiceImpl;
import lanaDrahrepus.services.impl.ProvinceServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceInjectedBeans {
    @Bean
    public CustomerService customerService() {
        return new CustomerServiceImpl();
    }

    @Bean
    public ProvinceService provinceService() {
        return new ProvinceServiceImpl();
    }
}
