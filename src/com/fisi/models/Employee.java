/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fisi.models;

/**
 *
 * @author cristian
 */
public class Employee extends User {

    private Integer idEmployee;
    private Integer age;
    private String genre;
    private String healthCondition;

    public Employee() {
    }

    public Employee(Integer idEmployee, Integer age, String genre, String healthCondition, Integer idUser, String firstname, String lastname, String password, String email, Integer dni, String direccion) {
        super(idUser, firstname, lastname, password, email, dni, direccion);
        this.idEmployee = idEmployee;
        this.age = age;
        this.genre = genre;
        this.healthCondition = healthCondition;
    }

    @Override
    public boolean match(String tipo) {
        return tipo.equalsIgnoreCase("EMPLOYEE");
    }

    @Override
    public User returner(String tipo) {
        if (match(tipo)) {
            return new Employee();
        } else {
            return null;
        }
    }

    public Integer getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(Integer idEmployee) {
        this.idEmployee = idEmployee;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getHealthCondition() {
        return healthCondition;
    }

    public void setHealthCondition(String healthCondition) {
        this.healthCondition = healthCondition;
    }

}
