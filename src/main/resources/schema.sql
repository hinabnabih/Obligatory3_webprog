CREATE TABLE IF NOT EXISTS  Booke (
    id INTEGER AUTO_INCREMENT NOT NULL,
    film VARCHAR(255),
    kvantitet VARCHAR(225) NOT NULL,
    fornavn VARCHAR(255),
    etternavn VARCHAR(255),
    telefonnummer VARCHAR(255),
    email VARCHAR(255),
    primary key (id)
);