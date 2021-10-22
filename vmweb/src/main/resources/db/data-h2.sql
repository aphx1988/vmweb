DELETE FROM video;

INSERT INTO video (id, name, path,rate, width, height, duration) VALUES
(1,'MY VIDEO1', '/file/3/','720', 1280,720,'00:30:00'),
(2,'测试视频02', '/file/3/','720', 720,1280,'01:00:07'),
(3,'MY VIDEO3', '/file/3/','360', 360,480,'00:11:00'),
(4,'随便起个名字', '/file/3/','720', 720,1280,'00:07:14'),
(5,'MY VIDEO5', '/file/3/','1080', 1080,1920,'00:30:15'),
(6,'MY VIDEO6', '/file/3/','900', 900,1400,'02:30:00');