CREATE TABLE WEATHER_API(
	INSERT_TIME DATETIME NOT NULL PRIMARY KEY,
	BASE_DATE CHAR(8) NOT NULL,
	BASE_TIME CHAR(4) NOT NULL,
	T3H CHAR(8),
	REH CHAR(8)
);

CREATE TABLE VILLAGE_WEATHER(
	INSERT_TIME DATETIME NOT NULL PRIMARY KEY,
	BASE_DATE CHAR(8) NOT NULL,
	BASE_TIME CHAR(4) NOT NULL,
	T3H CHAR(8),
	REH CHAR(8)
);

INSERT INTO village_weather VALUES(getDate(),'20020111','2300','00','20');

SELECT * FROM VILLAGE_WEATHER;