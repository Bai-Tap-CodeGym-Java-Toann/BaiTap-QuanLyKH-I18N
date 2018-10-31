package lanaDrahrepus.repository;


import lanaDrahrepus.model.Customer;
import lanaDrahrepus.model.Province;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CustomerRepo extends PagingAndSortingRepository<Customer,Integer> {
    Iterable<Customer> findAllByProvince(Province province);
}
