CREATE TABLE IF NOT EXISTS hero_mission (
    id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    heroid int NOT NULL,
    missionid int NOT NULL,
    CONSTRAINT FK_Hero FOREIGN KEY (heroid) REFERENCES Hero(id),
    CONSTRAINT FK_Mission FOREIGN KEY (missionid) REFERENCES Mission(id)
);


