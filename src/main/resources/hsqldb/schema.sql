
CREATE TABLE  vets (
  id INT(4) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
first_name VARCHAR(30),
last_name VARCHAR(30),
INDEX(last_name)
);

CREATE TABLE  specialties (
  id INT(4) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(80),
INDEX(name)
);

CREATE TABLE  vet_specialties (
  vet_id INT(4) UNSIGNED NOT NULL,
specialty_id INT(4) UNSIGNED NOT NULL,
FOREIGN KEY (vet_id) REFERENCES vets(id),
FOREIGN KEY (specialty_id) REFERENCES specialties(id),
UNIQUE (vet_id,specialty_id)
);