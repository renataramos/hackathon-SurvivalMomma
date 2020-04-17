USE survivor;

DELETE FROM videos;
INSERT INTO videos (ID, CREATIONTIME, UPDATETIME, VERSION, PATH, USER_ID) VALUES
(1, TIMESTAMP '2017-10-10 08:45:56.468', TIMESTAMP '2017-10-10 08:45:56.468', 0, 'https://youtu.be/yg88Tw8oAbk', 1),
(2, TIMESTAMP '2017-10-10 08:45:56.481', TIMESTAMP '2017-10-10 08:45:56.481', 0, 'https://youtu.be/CVD5KFB7478', 1),
(3, TIMESTAMP '2017-10-10 08:45:56.483', TIMESTAMP '2017-10-10 08:45:56.483', 0, 'https://youtu.be/uyI7qOcBOK0', 2),
(4, TIMESTAMP '2017-10-10 08:45:56.480', TIMESTAMP '2017-10-10 08:45:56.480', 0, 'https://youtu.be/0_4JKywBom0', 3),
(5, TIMESTAMP '2017-10-10 08:45:56.467', TIMESTAMP '2017-10-10 08:45:56.467', 0, 'https://youtu.be/_a1FU_ncz48', 4);

DELETE FROM client;
INSERT into user(ID, CREATIONTIME, UPDATETIME, VERSION, FIRSTNAME, LASTNAME, BIRTHYEAR, PASSWORD, EMAIL, PHONE, RANKING) VALUES
(1, TIMESTAMP '2017-10-10 08:45:56.468', TIMESTAMP '2017-10-10 08:45:56.468', 0, 'Mariana', 'Dias', 1980 , '1234' ,'mariana@gmail.com', '961578087', 9),
(2, TIMESTAMP '2017-10-10 08:45:56.481', TIMESTAMP '2017-10-10 08:45:56.481', 0, 'Filipe', 'Santos', 1986 , '1234' ,'filipe@gmail.com', '961578087', 20),
(3, TIMESTAMP '2017-10-10 08:45:56.483', TIMESTAMP '2017-10-10 08:45:56.483', 0, 'Sara', 'Lopes', 1998 ,'1234' ,'sara@gmail.com', '961578087', 10),
(4, TIMESTAMP '2017-10-10 08:45:56.480', TIMESTAMP '2017-10-10 08:45:56.480', 0, 'Fernando', 'Abreu', 1984 , '1234' ,'fernando@gmail.com', '961578087', 30),
(5, TIMESTAMP '2017-10-10 08:45:56.467', TIMESTAMP '2017-10-10 08:45:56.467', 0, 'Seringas', 'rHashtafari', 1996 , '1234' ,'seringas@gmail.com', '961578087', 7);


DELETE FROM lessons;
INSERT INTO lessons (ID, CREATIONTIME, UPDATETIME, VERSION, OPTION1, OPTION2, OPTION3, OPTION4, QUESTION, PATHIMAGE, TITLE) VALUES
(1, TIMESTAMP '2017-10-10 08:45:56.468', TIMESTAMP '2017-10-10 08:45:56.468', 0, 'Grab some fresh leaves and light it with a match' ,'Use a magnifying lense next to dry natural fibers', 'Grab some logs and light it with a match',
'Use a wood board and a stick and spin, next to dry natural fibers', 'Lost and cold in a Forest, in the middle of the night, how do you start a fire','image1' , 'How to start a fire'),
(2, TIMESTAMP '2017-10-10 08:45:56.481', TIMESTAMP '2017-10-10 08:45:56.481', 0, 'Creeks where hills meet', 'Sounds of animals', 'Dig a hole to see if the soil is damp','All of the above',
'Remember the flow of water if you are in a high terrain. What should you look for, if you want to find fresh water', 'image2', 'How to find and purify water'),
(3, TIMESTAMP '2017-10-10 08:45:56.483', TIMESTAMP '2017-10-10 08:45:56.483', 0, 'Lean To','Round lodge','Dune Paradise','No shelter is the best protection',
'Which temporary shelter type offers best protection','image3', 'Build a temporary shelter');