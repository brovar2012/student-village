CREATE TABLE IF NOT EXISTS students
(
    student_id       UUID PRIMARY KEY DEFAULT NOT NULL,
    name             VARCHAR(128) NOT NULL,
    last_name        VARCHAR(128) NOT NULL
);