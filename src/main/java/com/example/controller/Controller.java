package com.example.controller;

import com.example.entity.Emp;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin("http://localhost:5173/")
@RequestMapping("/Ui")
public class Controller
{
    @GetMapping("/get")
    public List<Emp> getAllDetails()
    {
        Emp emp1 = new Emp();
        emp1.setEmpId(1);
        emp1.setName("ramu");
        emp1.setAddress("Hyd");

        Emp emp2 = new Emp();
        emp2.setEmpId(2);
        emp2.setName("hari");
        emp2.setAddress("Sec");

        Emp emp3 = new Emp();
        emp3.setEmpId(3);
        emp3.setName("sai");
        emp3.setAddress("KPHB");



        ArrayList<Emp> al = new ArrayList<>();
        al.add(emp1);
        al.add(emp2);
        al.add(emp3);

        return al;

    }
}