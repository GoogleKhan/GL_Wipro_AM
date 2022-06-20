package com.wipro;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import com.mysql.cj.jdbc.Driver;

public class Main {

	private static final String URL = "jdbc:mysql://localhost:3306/spring_jdbc_db";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "root";

	static JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {

		// Spring will use DataSource to connect with Database
		jdbcTemplate = new JdbcTemplate(getDataSource());

		// Employee emp = new Employee(102, "Shad", 999.12);

		// insertRecord(emp);
		// editRecord(emp);

		List<Employee> allEmployees = getAllRecords();
		System.out.println(allEmployees);

		deleteRecords(101);

		List<Employee> allEmployees2 = getAllRecords();
		System.out.println(allEmployees2);

	}

	private static List<Employee> getAllRecords() {

		String sql = "SELECT * FROM employee";

		List<Employee> allEmps = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Employee.class));
		return allEmps;
	}

	static private void insertRecord(Employee emp) {

		String sql = "INSERT INTO employee VALUES (?, ?, ?)";
		jdbcTemplate.update(sql, emp.getId(), emp.getName(), emp.getSalary());

		System.out.println("Values inserted successfully");

	}

	static private void editRecord(Employee emp) {

		String sql = "UPDATE employee SET name=?, salary=? WHERE id=?";
		jdbcTemplate.update(sql, emp.getName(), emp.getSalary(), emp.getId());

		System.out.println("Values updated successfully");

	}

	private static void deleteRecords(int id) {
		String sql = "DELETE FROM employee WHERE id=?";
		jdbcTemplate.update(sql, id);

		System.out.println("Record deleted successfully");
	}

	// Establish a connection with DB Server(MySQL server)
	private static DataSource getDataSource() {

		SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
		dataSource.setDriverClass(Driver.class);
		dataSource.setUrl(URL);
		dataSource.setUsername(USER_NAME);
		dataSource.setPassword(PASSWORD);

		return dataSource;
	}

}
