CREATE TABLE clients (
  id int NOT NULL,
  name varchar(50) NOT NULL,
  address varchar(100) NOT NULL,
  city varchar(30) NOT NULL,
  phone varchar(20) NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE cards (
  id varchar(16) NOT NULL,
  ccv int NOT NULL,
  type varchar NOT NULL,
  client int,
  PRIMARY KEY (id)
);

CREATE TABLE shopping_history (
  id int NOT NULL,
  date timestamp NOT NULL,
  price float NOT NULL,
  description text NOT NULL,
  card varchar(16) NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE advisers (
  id int NOT NULL,
  name varchar(50) NOT NULL,
  speciality varchar(50) NOT NULL,
  PRIMARY KEY (id)
);



