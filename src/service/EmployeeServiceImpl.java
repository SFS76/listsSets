package service;

import mod.Empoyee;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final List<Empoyee> empoyeeList;

    public EmployeeServiceImpl() {
        this.empoyeeList = new ArrayList<>()empoyeeList;
    }

    @Override
    public Empoyee add(String firstNane, String lastName) {
        Empoyee empoyee = new Empoyee(firstNane, lastName);
        empoyeeList.add(empoyee);
        return empoyee;
    }

    @Override
    public Empoyee find(String firstNane, String lastName) {
        Empoyee empoyee = new Empoyee(firstNane, lastName);
        if (empoyeeList.contains(empoyee)) {
            return empoyee;
        }
        return null;
    }

    @Override
    public Empoyee remove(String firstNane, String lastName) {
        Empoyee empoyee = new Empoyee(firstNane, lastName);
        if (empoyeeList.contains(empoyee)) {
            empoyeeList.remove(empoyee);
            return empoyee;
        }
        return null;
    }
}
