package lk.ijse.gdse72.springbootdeployment.repository;

import lk.ijse.gdse72.springbootdeployment.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long>{
}
