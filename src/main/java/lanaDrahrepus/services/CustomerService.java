package lanaDrahrepus.services;

import lanaDrahrepus.model.Customer;
import lanaDrahrepus.model.Province;

public interface CustomerService {
    Iterable<Customer> findAll();

    Customer findById(Integer id);

    void save(Customer customer);

    void remove(Integer id);

    Iterable<Customer> findAllByProvince(Province province);

}
