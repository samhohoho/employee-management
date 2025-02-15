CREATE TABLE Department (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL
);

CREATE TABLE Employee (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    department_id INT NOT NULL UNIQUE,

    CONSTRAINT fk_department FOREIGN KEY(department_id) REFERENCES Department(id)
);

CREATE TABLE Project (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    employee_id INT REFERENCES Employee(id)
);
