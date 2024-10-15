package service;

import exception.EmployeeAlredyAddedException;
import exception.EmployeeNotFoundException;
import mod.Empoyee;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final List<Empoyee> empoyeeList;

    public EmployeeServiceImpl() {
        this.empoyeeList = new ArrayList<>();
    }

    @Override
    public Empoyee add(String firstNane, String lastName) {
        Empoyee empoyee = new Empoyee(firstNane, lastName);
        if (empoyeeList.contains(empoyee)) {
            throw new EmployeeAlredyAddedException();
        }
        empoyeeList.add(empoyee);
        return empoyee;
    }

    @Override
    public Empoyee find(String firstNane, String lastName) {
        Empoyee empoyee = new Empoyee(firstNane, lastName);
        if (empoyeeList.contains(empoyee)) {
            return empoyee;
        }
        throw new EmployeeNotFoundException();
    }

    @Override
    public Empoyee remove(String firstNane, String lastName) {
        Empoyee empoyee = new Empoyee(firstNane, lastName);
        if (empoyeeList.contains(empoyee)) {
            empoyeeList.remove(empoyee);
            return empoyee;
        }
        throw new EmployeeNotFoundException();
    }

    @Override
    public Collection<Empoyee> findAll() {
        return Collections.unmodifiableList(empoyeeList);
    }
}
