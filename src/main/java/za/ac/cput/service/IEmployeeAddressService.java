package za.ac.cput.service;
/*  IEmployeeAddressService.Java
 *  Entity for IEmployeeAddressService
 *  Author: Yasmeen Nel (219250553)
 *  Date: 14 June 2022
 * */
import za.ac.cput.domain.employee.EmployeeAddress;

import java.util.List;

public interface IEmployeeAddressService extends IService<EmployeeAddress, String>{
    List<EmployeeAddress> getAll();
}
