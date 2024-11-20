CREATE TABLE IF NOT EXISTS activity (
    id SERIAL PRIMARY KEY,
    activity_name VARCHAR(255) NOT NULL,
    description TEXT
    );

CREATE TABLE IF NOT EXISTS lead (
    id SERIAL PRIMARY KEY,
    activity_name VARCHAR(255) NOT NULL,
    description TEXT,
    phone VARCHAR(255),
    address VARCHAR(255),
    activity_id INT,
    CONSTRAINT fk_activity
    FOREIGN KEY(activity_id)
    REFERENCES activity(id)
    );