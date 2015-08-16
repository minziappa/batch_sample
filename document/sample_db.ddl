/* DROP TABLE sample_user; */

CREATE DATABASE sample_db DEFAULT CHARACTER SET utf8;

CREATE TABLE sample
(
	sample_id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
	sample_name VARCHAR(45) NOT NULL,
	sample_pwd VARCHAR(250) NOT NULL,
	sample_status CHAR(1) NOT NULL,
	insert_date TIMESTAMP NOT NULL,
	update_date TIMESTAMP NOT NULL,
	PRIMARY KEY (sample_id)
) ENGINE=innoDB DEFAULT CHARSET=utf8;

CREATE INDEX sample_idx1 ON sample(sample_name);