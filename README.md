# CST-339 Spring Boot N-Layer Application

**General Requirements:**
1. Implement a user registration module and a login module.
2. Use an N-Layer architecture with distinct presentation, business services, and persistence components.
3. Adhere to best practices in exception and error handling, as informed by lectures, readings, or peer reviews.

**Presentation Layer:**
- Spring MVC for Views, Models, and Controllers.
- Spring Core for Business and Data Services.
- Spring Data JDBC for Persistence.
- Spring REST Services for APIs.
- Bootstrap for Responsive Design.
- Spring Boot Embedded Tomcat (as a JAR).
- MySQL for the Relational Database.

**Specific Pages:**
- A page listing all "products" in a tabular report.
- A page for creating a new "product."
- A page for displaying details of a "product."
- A page for updating an existing "product."
- A page for deleting an existing "product."

**Application Features:**
- Entirely Spring MVC compliant pages using Thymeleaf templates.
- Data validation for all form data entry fields.
- Responsive design using Bootstrap.
- No business logic/rules in Spring MVC views, models, or controllers.
- Implement all CRUD methods for the business domain.

**Database and Persistence:**
- Use of relational database (MySQL or PostgreSQL).
- Potential porting to MongoDB post-Topic 5 with instructor's permission.
- Database access via Spring JDBC or Spring Data JDBC.

**Business and Persistence Services:**
- Implementation using Spring Beans.
- Declarative Spring annotations in all components.
- Dependency injection (DI) for all models, controllers, services, and resources.

**Deployment and Security:**
- Deployment using Spring Boot and embedded Tomcat (version 9.x or later).
- Restricted access to secure pages without login.
- Spring Security for form-based authentication and database security.
- Secured APIs with Spring Security and Basic HTTP Authentication.

**Documentation:**
- Comprehensive JavaDoc format documentation for all classes.

---

**Milestone 1:**
- Project Proposal
- Draft Sitemap
- Draft Division of Work across the team

**Milestone 2:**
- Main Application Module (using Spring MVC)
- Registration Module (using Spring MVC) without a database
- Login Module (using Spring MVC) without a database
- Responsive Design (using Bootstrap Framework)
- Page Layouts using Thymeleaf Layouts
- Design Report
- Screencast running on local development environment

**Milestone 3:**
- Product Creation Module (using Spring MVC and Spring Core)
  - Registration and Login Modules refactored to use Spring Beans and IoC without a database
- Updated Design Report
- Screencast running on local development environment

**Milestone 4:**
- Refactoring:
  - Registration and Login Modules refactored to use Spring JDBC or Spring Data JDBC
  - Product Creation Module refactored to use Spring JDBC or Spring Data JDBC
- Built as a JAR file using Maven
- Updated Design Report
- Screencast running on local development environment

**Milestone 5:**
- Product Display Module (using Spring MVC, Spring JDBC or Spring Data JDBC)
- Product Update/Delete Modules (using Spring MVC, Spring JDBC or Spring Data JDBC)
- Updated Design Report
- Screencast running on local development environment

**Milestone 6:**
- Refactored Login Module (using Spring Security)
  - Use Form-based authentication with a database
  - All pages, except Login and Registration Modules, secured with Spring Security
- Updated Design Report
- Screencast running on local development environment

**Milestone 7:**
- REST APIs:
  - Design using Microsoft Word template or Swagger
  - API 1: Return all products
  - API 2: Return a specific product
  - All APIs secured using Spring Security and Basic HTTP Authentication with a database
- Design and Code Cleanup
- Updated Design Report

**Milestone 8:**
- JavaDoc Generation
- Final Application Code
- Final Project Presentation
- Final Design Report

--- 

## Contributing

Pull requests are welcome. Please open an issue first to discuss proposed changes.
