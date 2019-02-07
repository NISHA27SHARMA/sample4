create table department(
    -> dept_id int not null primary key,
    -> dept_name varchar(100)
    -> );
    
    create table authentication(
    -> emp_id int,
    -> username varchar(255),
    -> password varchar(15),
    -> user_type varchar(50),
    -> FOREIGN KEY(emp_id) REFERENCES empDetails (emp_id));
    
    create table leave_mgmt(
    -> emp_id int,
    -> leave_title varchar(255),
    -> apply_dt date,
    -> end_dt date,
    -> no_of_days int,
    -> FOREIGN KEY(emp_id) REFERENCES empDetails (emp_id));
