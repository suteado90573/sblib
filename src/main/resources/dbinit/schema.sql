-- アカウントテーブル
DROP TABLE IF EXISTS TACCOUNT;
CREATE TABLE TACCOUNT(
	TACCOUNT_ID INT AUTO_INCREMENT,
	MAIL_ADDRESS VARCHAR(256),
	PASSWORD VARCHAR(256),
	IS_DELETED CHAR(1),
	CREATED_BY VARCHAR(256),
	CREATED_AT DATETIME,
	UPDATED_BY VARCHAR(256),
	UPDATED_AT DATETIME,
	PRIMARY KEY(TACCOUNT_ID)
);
