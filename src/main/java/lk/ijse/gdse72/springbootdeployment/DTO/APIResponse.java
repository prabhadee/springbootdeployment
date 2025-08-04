package lk.ijse.gdse72.springbootdeployment.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class APIResponse <T>{
    private int status;
    private String message;
    private T data;
}