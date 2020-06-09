package com.example.depemp.service;


import com.example.depemp.model.Employee;

import java.time.LocalDateTime;
import java.util.List;

public interface EmployeeService {
    //Gi vrakja site vraboteni
    List<Employee> findAll();

    //Go vrakja vraboteniot so daden username, vo sprotivno frla iskluchok
    Employee findById(String employeeId); //throws EmployeeNotFoundException

    //Go zachuvuva vraboteniot, dokolku vekje postoi vraboten so toj username, se frla iskluchok
    Employee save(Employee employee); //throws EmployeeAlreadyExistsException

    //update na vraboteniot so daden username
    Employee update(String employeeId, Employee employee);

    //Go brishe vraboteniot so daden username.
    void deleteById(String employeeId);

    //Dodavanje na vraboten vo daden oddel, frla iskluchok ako vekje vraboteniot raboti vo ovoj oddel.
    Employee addEmployeeInNewDepartment(String employeeId, Long departmentId); //throws EmployeeAlreadyWorksHereException

    //Brishenje na vraboten od daden oddel, se brishe i vrskata (relacijata) so oddel
    Employee removeEmployeeFromDepartment(String employeeId, Long departmentId);

    //Za ovoj metod dovolno e samo da se implementiraat metodite vo service i repository, nema potreba od mapiranje vo kontroler
    //Gi vrakja site vraboteni koi se vneseni vo sistemot pred datumot koj e praten kako argument vo funkcijata
    //Pozhelno e da se reshi na nivo na repository
    List<Employee> findAllEmployeesCreatedBefore(LocalDateTime localDateTime);
}
