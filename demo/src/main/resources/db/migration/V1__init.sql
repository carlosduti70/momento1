CREATE TABLE IF NOT EXISTS conference (
    id SERIAL,
    title VARCHAR(100) NOT NULL,
    description VARCHAR(100) NOT NULL,
    city VARCHAR(100) NOT NULL,
    total_assistants INT,
    PRIMARY KEY (id)
    );

CREATE TABLE IF NOT EXISTS assistant (
    id SERIAL,
    full_name VARCHAR(100) NOT NULL,
    rols VARCHAR(100) NOT NULL,
    age INT,
    conference_id INT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (conference_id ) REFERENCES conference(id)
    );