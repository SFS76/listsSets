package service;

import mod.Empoyee;

public interface EmployeeService {
    Empoyee add(String firstNane, String lastName);
    Empoyee find(String firstNane, String lastName);
    Empoyee remove(String firstNane, String lastName);
}
