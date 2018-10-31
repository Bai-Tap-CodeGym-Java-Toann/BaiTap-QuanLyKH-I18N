package lanaDrahrepus.services.impl;

import lanaDrahrepus.model.Customer;
import lanaDrahrepus.model.Province;
import lanaDrahrepus.repository.CustomerRepo;
import lanaDrahrepus.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;


public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepo customerRepository;

    @Override
    public Iterable<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(Integer id) {
        return customerRepository.findOne(id);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void remove(Integer id) {
        customerRepository.delete(id);
    }

    @Override
    public Iterable<Customer> findAllByProvince(Province province) {
        return customerRepository.findAllByProvince(province);
    }

}
