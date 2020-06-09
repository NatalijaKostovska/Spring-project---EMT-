package com.example.depemp.service;


import com.example.depemp.model.Department;

import java.util.List;

public interface DepartmentService {

    //Gi vrakja site oddeli
    List<Department> findAll();

    //Go bara oddelot sproed id, vo sprotivno frla iskluchok
    Department findById(Long id); //throws DepartmentNotFoundException

    //Zachuvuvanje na oddelot
    Department save(Department department);

    //Brishenje na oddelot. Dokolku ima vraboteni vo ovoj oddel, se frla iskluchok
    void deleteById(Long id); //throws DepartmentIsNotEmptyException


    //Za ovoj metod dovolno e samo da se implementiraat metodite vo service i repository, nema potreba od mapiranje vo kontroler
    //Go vrakja oddelot so dadenoto ime, vo sprotivno frla iskluchok deka ne postoi
    //Pozhelno e da se reshi na nivo na repository
    Department findByName(String name); //throws DepartmentNotFoundException

}
