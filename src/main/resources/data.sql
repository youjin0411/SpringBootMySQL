-- 게시판, 댓글 만들기
INSERT INTO article (id, writer, title, content) VALUES (1, "Writer 1", "Hello
1", "Content 1");
INSERT INTO article (id, writer, title, content) VALUES (2, "Writer 2", "Hello
2", "Content 2");
INSERT INTO article (id, writer, title, content) VALUES (3, "Writer 3", "Hello
3", "Content 3");
INSERT INTO article (id, writer, title, content) VALUES (4, "Writer 4", "Hello
4", "Content 4");
INSERT INTO article (id, writer, title, content) VALUES (5, "Writer 5", "Hello
5", "Content 5");
INSERT INTO article (id, writer, title, content) VALUES (6, "Writer 6", "Hello
6", "Content 6");
INSERT INTO article (id, writer, title, content) VALUES (7, "Writer 7", "Hello
7", "Content 7");
INSERT INTO article (id, writer, title, content) VALUES (8, "Writer 8", "Hello
8", "Content 8");
INSERT INTO article (id, writer, title, content) VALUES (9, "Writer 9", "Hello
9", "Content 9");
INSERT INTO article (id, writer, title, content) VALUES (10, "Writer 10", "Hello
10", "Content 10");
INSERT INTO article (id, writer, title, content) VALUES (11, "Writer 11", "Hello
11", "Content 11");
INSERT INTO article (id, writer, title, content) VALUES (12, "Writer 12", "Hello
12", "Content 12");
INSERT INTO article (id, writer, title, content) VALUES (13, "Writer 13", "Hello
13", "Content 13");
INSERT INTO comment (writer, content, article_id) VALUES("writer 1", "Hello 1
comment 1", 1);
INSERT INTO comment (writer, content, article_id) VALUES("writer 1", "Hello 1
comment 2", 1);
INSERT INTO comment (writer, content, article_id) VALUES("writer 2", "Hello 1
comment 3", 1);
INSERT INTO comment (writer, content, article_id) VALUES("writer 2", "Hello 2
comment 1", 2);
INSERT INTO comment (writer, content, article_id) VALUES("writer 1", "Hello 2
comment 2", 2);