CREATE TABLE `pt_user` (
	`pt_num`	int	not null auto_increment primary key,
	`pt_id`	varchar(200)	NOT NULL,
	`pt_pass`	varchar(200)	NOT NULL,
	`pt_gender`	int	NOT NULL	COMMENT '0 : 남성 1 : 여성',
	`pt_year`	int	NOT NULL,
	`pt_mon`	int	NOT NULL,
	`pt_day`	int not null,
	`pt_auth`	int	NOT NULL	DEFAULT 0	COMMENT '회원 : 0, 관리자 : 3'
);
select * from pt_user;
delete from pt_user ;
CREATE TABLE `pt_test` (
	`pt_testnum`	int	NOT NULL,
	`pt_score`	int	NOT NULL,
	`pt_count`	int	NOT NULL
);

CREATE TABLE `pt_result` (
	`pt_num`	int	NOT NULL,
	`pt_testnum`	int	NOT NULL,
	`pt_test`	varchar(200)	NOT NULL,
	`pt_point`	int	NOT NULL,
	`pt_1`	int	NULL,
	`pt_2`	int	NULL,
	`pt_3`	int	NULL,
	`pt_4`	int	NULL
);

CREATE TABLE `pt_review` (
	`pt_num`	int	NOT NULL,
	`pt_rnum`	int	NOT NULL,
	`pt_rtitle`	varchar(200)	NOT NULL,
	`pt_rcontent`	varchar(3000)	NOT NULL,
	`pt_rdate`	timestamp	NOT NULL,
	`pt_rviewcnt`	int	NOT NULL	DEFAULT 0
);

ALTER TABLE `pt_user` ADD CONSTRAINT `PK_PT_USER` PRIMARY KEY (
	`pt_num`
);

ALTER TABLE `pt_test` ADD CONSTRAINT `PK_PT_TEST` PRIMARY KEY (
	`pt_testnum`
);

ALTER TABLE `pt_result` ADD CONSTRAINT `PK_PT_RESULT` PRIMARY KEY (
	`pt_num`,
	`pt_testnum`
);

ALTER TABLE `pt_review` ADD CONSTRAINT `PK_PT_REVIEW` PRIMARY KEY (
	`pt_num`
);

ALTER TABLE `pt_result` ADD CONSTRAINT `FK_pt_user_TO_pt_result_1` FOREIGN KEY (
	`pt_num`
)
REFERENCES `pt_user` (
	`pt_num`
);

ALTER TABLE `pt_result` ADD CONSTRAINT `FK_pt_test_TO_pt_result_1` FOREIGN KEY (
	`pt_testnum`
)
REFERENCES `pt_test` (
	`pt_testnum`
);

ALTER TABLE `pt_review` ADD CONSTRAINT `FK_pt_user_TO_pt_review_1` FOREIGN KEY (
	`pt_num`
)
REFERENCES `pt_user` (
	`pt_num`
);

