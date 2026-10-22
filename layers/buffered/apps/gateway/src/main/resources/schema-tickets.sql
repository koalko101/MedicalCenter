DROP TABLE IF EXISTS schedule;
DROP TABLE IF EXISTS tickets;
DROP TABLE IF EXISTS staff;
DROP TABLE IF EXISTS users;


CREATE TABLE users(
    user_id SERIAL PRIMARY KEY,
    full_name VARCHAR(100) NOT NULL,
    sex CHAR(1) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    phone_number VARCHAR(20) NOT NULL UNIQUE,
    registered_address VARCHAR(255) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP

);

CREATE TABLE staff (
    staff_id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    specialization VARCHAR(100) NOT NULL,
    room_number VARCHAR(4) NOT NULL,
    category VARCHAR(50) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE tickets(
    ticket_id SERIAL PRIMARY KEY,
    user_id NOT NULL,
    staff_id NOT NULL,
    specialization VARCHAR(100) NOT NULL,
    name VARCHAR(100) NOT NULL,
    appointment_datetime TIMESTAMP NOT NULL,
    record_status VARCHAR(20) NOT NULL,
    CONSTRAINT fk_tickets_users FOREIGN KEY (user_id) 
        REFERENCES users(user_id) ON DELETE CASCADE,
    CONSTRAINT fk_tickets_staff FOREIGN KEY (staff_id) 
        REFERENCES staff(staff_id) ON DELETE RESTRICT,
        CONSTRAINT uq_staff_datetime UNIQUE (staff_id, appointment_datetime)
);

CREATE TABLE schedule (
    ticket_id INT PRIMARY KEY,
    CONSTRAINT fk_schedule_tickets FOREIGN KEY (ticket_id) 
        REFERENCES tickets(ticket_id) ON DELETE CASCADE
);


CREATE INDEX idx_tickets_user_id ON tickets(user_id);
CREATE INDEX idx_tickets_staff_id ON tickets(staff_id);
CREATE INDEX idx_tickets_staff_datetime ON tickets(staff_id, appointment_datetime);