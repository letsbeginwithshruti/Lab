USE shifa_schema;
create table EMPLOYEELAB(
EMPLOYEE_ID int (6),
LAST_NAME varchar(25),
JOB_ID varchar(10),
SALARY double (8,2),
COMM_PCT double (4,2),
MGR_ID int (6),
DEPARTMENT_ID int (4));
insert EMPLOYEELAB values
(198,'Connell','SH_CLERK',2600,2.5,124,50),
(199,'grant','SH_CLERK',2600,2.2,124,50),
(200,'Whalen','AD_ASST',4400,1.3,101,10),
(201,'Hartstein','IT_PROG',6000,null,100,20),
(202,'Fay','AC_MGR',6500,null,210,20),
(203,'Mavris','AD_VP',7500,null,101,40),
(204,'Baer','AD_PRES',3500,1.5,101,90),
(205,'Higgins','AC_MGR',2300,null,101,60),
(206,'Gitz','IT_PROG',5000,null,103,60),
(100,'King','AD_ASST',8956,0.3,108,100),
(101,'Kochar','SH_CLERK',3400,1.3,118,30);
#3. Display last_name, job_id, employee_id for 
#each employee with employee_id appearing first.
select EMPLOYEE_ID,LAST_NAME,JOB_ID from EMPLOYEELAB;
#4. Display the details of all employees of department 60.
select * from EMPLOYEELAB where DEPARTMENT_ID = 60;
#5. Display the employee details of the employee who’s last_name is King.
select * from EMPLOYEELAB where LAST_NAME ='King';
#6. Display unique job_id from EMPLOYEE table. Give alias name to the column as JOB_TITLE.
select job_id from EMPLOYEELAB;
alter table EMPLOYEELAB rename column JOB_ID to JOB_TITLE;
#7. Display last_name, salary and salary increase of Rs300. 
#Give the new column name as ‘Increased Salary’.
select LAST_NAME, SALARY,Salary+300 as 'Increased_salary' from EmployeeLAB;
#8. Display last_name, salary and annual compensation of all employees, plus a
#onetime bonus of Rs 100. Give an alias name to the column displaying annual compensation.
select LAST_NAME,SALARY,salary+100 as 'Annual compensation' from EMPLOYEELAB;
#9. Display the details of those employees who get commission.
select  *  from EmployeeLAB where COMM_PCT is not null;
#10.Display the details of those employees who do not get commission.
select * from EMPLOYEELAB where COMM_PCT is null;
#11. Display the Employee_id, Department_id and Salary all employees whose salary is
#greater than 5000.
select EMPLOYEE_ID,DEPARTMENT_ID,SALARY from EMPLOYEELAB where SALARY>5000;
#12. Display the Last_Name and Salary of all employees whose salary is between 4000
#and 7000.
select LAST_NAME,SALARY from EMPLOYEELAB where SALARY>4000 and SALARY<7000;
#13. Display the details of all employees whose salary is either 6000 or 6500 or 7000.
select * from EMPLOYEELAB where Salary = 6000 or SALARY = 6500 or SALARY = 7000;
#14.Display the details of all those employees who work either in department 10 or 20 or 30 or 50.
select * from EMPLOYEELAB where Department_id=10 or Department_id=20 or Department_id= 30 or Department_id= 50;
#15.Display the details of all employees whose salary is not equal to 5000.
select * from EMPLOYEELAB where salary !=5000;
#16. Display the details of all the CLERKS working in the organization
select * from EMPLOYEELAB where JOB_ID= 'SH_ClERK';
#17. Update the job_id’s of the employees who earn more than 5000 to Grade_A.
update EMPLOYEELAB set job_id='Grade-A' where salary>5000;
#Display the table EMPLOYEE after updating.
select * from EMPLOYEELAB;
#18. Display the details of all those employees who are either CLERK or
#PROGRAMMER or ASSISTANT.
select * from EMPLOYEELAB where JOB_ID ='SH_CLERK' or 'IT_PROG' or 'AD_ASST';
#19. Display those employees from the EMPLOYEE table whose designation is
#CLERK and salary is less than 3000.
select * from EMPLOYEELAB where JOB_ID='SH_CLERK' and SALARY<3000;
#20. Display those employees Last_Name, Mgr_id from the EMPLOYEE table whose
#salary is above 3000 and work under Manager 101.
select LAST_NAME,MGR_ID from EMPLOYEELAB where SALARY>3000 and MGR_ID = 101;
