/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.repository;

import com.example.payroll.Employee;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by amanadhikari on 7/16/17.
 */
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
