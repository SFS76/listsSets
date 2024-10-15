package service;

import mod.Empoyee;

import java.util.Collection;

public interface EmployeeService {
    Empoyee add(String firstNane, String lastName);
    Empoyee find(String firstNane, String lastName);
    Empoyee remove(String firstNane, String lastName);

    Collection<Empoyee> findAll();
}
