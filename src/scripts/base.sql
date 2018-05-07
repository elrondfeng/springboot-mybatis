-- naming convention:
--    1. ALL NAMES ( including table names and columns ) are lower case. try to avoid naming problem between different os.
--    2. words in names are separated by _.
-- NOTE: the order of this sql matters when run the whole scripts.

DROP DATABASE base;
CREATE DATABASE base
  DEFAULT CHARACTER SET utf8;
USE base;

DROP TABLE IF EXISTS user;
create table user (
id INT(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(255) NOT NULL,
age INT(11) NOT NULL
)
  ENGINE =InnoDB
  DEFAULT CHARSET =utf8;