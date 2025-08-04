package lk.ijse.gdse72.springbootdeployment.service.Impl;


import lk.ijse.gdse72.springbootdeployment.DTO.CustomerDTO;
import lk.ijse.gdse72.springbootdeployment.entity.Customer;
import lk.ijse.gdse72.springbootdeployment.repository.CustomerRepository;
import lk.ijse.gdse72.springbootdeployment.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;
    private final ModelMapper modelMapper;

    @Override
    public void saveCustomer(CustomerDTO customerDTO) {
        if(customerDTO==null){
            throw new IllegalArgumentException("Customer id is null");
        }
        customerRepository.save(modelMapper.map(customerDTO, Customer.class));
    }
}