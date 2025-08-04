package lk.ijse.gdse72.springbootdeployment.controller;



import lk.ijse.gdse72.springbootdeployment.DTO.APIResponse;
import lk.ijse.gdse72.springbootdeployment.DTO.CustomerDTO;
import lk.ijse.gdse72.springbootdeployment.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

  @PostMapping
    public ResponseEntity<APIResponse<String>> getCustomer(@RequestBody CustomerDTO customerDTO) {
        customerService.saveCustomer(customerDTO);

        return new ResponseEntity<>(new APIResponse<>(
                200,
                "Customer saved successfully",
                null
        ), HttpStatus.CREATED);
    }
}