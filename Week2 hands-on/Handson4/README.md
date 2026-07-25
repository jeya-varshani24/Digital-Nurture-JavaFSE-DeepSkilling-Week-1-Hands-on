# Hands-on 4: Difference Between JPA, Hibernate and Spring Data JPA

## Java Persistence API (JPA)

- JPA stands for Java Persistence API.
- It is a specification (JSR 338).
- It defines how Java objects are mapped to database tables.
- It does not provide an implementation.
- Hibernate is one of the implementations of JPA.
- 

## Hibernate

- Hibernate is an ORM framework.
- It implements JPA.
- It automatically converts Java objects into database tables.
- It generates SQL queries and manages persistence.


## Spring Data JPA

- Spring Data JPA is a Spring module.
- It works on top of Hibernate.
- It reduces boilerplate code.
- It provides JpaRepository for CRUD operations.


## Hibernate Example

```java
Session session = factory.openSession();
Transaction tx = session.beginTransaction();

session.save(employee);

tx.commit();

session.close();
```

## Spring Data JPA Example

```java
@Repository
public interface EmployeeRepository
        extends JpaRepository<Employee, Integer> {

}

```java
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Transactional
    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
    }
}

## Comparison

| JPA | Hibernate | Spring Data JPA |
|-----|-----------|-----------------|
| Specification | ORM Framework | Spring Module |
| No implementation | Implements JPA | Uses Hibernate |
| Defines standards | Generates SQL | Reduces boilerplate code |
| Database independent | ORM Tool | Repository support |

## Conclusion

- JPA defines the rules.
- Hibernate implements those rules.
- Spring Data JPA simplifies database programming.
