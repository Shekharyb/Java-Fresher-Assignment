# HR Portal (JSP + Spring MVC)

A JSP-based Spring MVC web app with tabbed navigation. It has five module tabs
(Employee, Department, Project, Attendance, Payroll) plus a read-only **Summary**
tab that shows one key field from each module.

## Tech stack

- Spring Boot 2.7.x (Spring MVC), Java 17
- JSP + JSTL views (`src/main/webapp/WEB-INF/jsp`)
- In-memory sample data in the service layer (no database required)

## Architecture

```
controller/   thin @Controller classes, return JSP view names
service/      interfaces + service/impl/ implementations (business logic, sample data)
model/        domain models (Employee, Department, Project, Attendance, Payroll)
dto/          SummaryDTO  (read-only view model for the Summary tab)
webapp/WEB-INF/jsp/   one JSP per tab + fragments/navtabs.jsp (shared tab bar)
```

The Summary flow: `SummaryController` -> `SummaryService` -> `SummaryDTO` -> `summary.jsp`.
`SummaryService` calls each module service to collect its key field, so the
controller stays thin and the view never touches the domain models directly.

## Run

```bash
mvn spring-boot:run
# or
mvn clean package && java -jar target/hr-portal-jsp.war
```

Then open http://localhost:8080/ and click through the tabs. The **Summary** tab
is at http://localhost:8080/summary.

## Test

```bash
mvn test
```
