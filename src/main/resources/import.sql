
INSERT INTO "Kaffee"(type, price)
	VALUES ('capuccino', 3.5);
INSERT INTO "Kaffee"(type, price)
	VALUES ('machiatto', 4);
INSERT INTO "Kaffee"(type, price)
	VALUES ('espresso', 2.95);

INSERT INTO "Role"(name)
	VALUES ('admin');
INSERT INTO "Role"(name)
	VALUES ('mitglied');

INSERT INTO "User"(email, nachname, password, vorname, role_id)
	VALUES ('and@bat.com', 'and', 'and', 'Jon', 1);
INSERT INTO "User"(email, nachname, password, vorname, role_id)
	VALUES ('max@muster.com','muster', 'max123', 'max', 2);
INSERT INTO "User"(email, nachname, password, vorname, role_id)
	VALUES ('test@test.com','test', 'test', 'test', 2);

INSERT INTO kaffe_user(
	kaffee_id, user_id)
	VALUES (1, 1);
INSERT INTO kaffe_user(
	kaffee_id, user_id)
	VALUES (2, 1);
INSERT INTO kaffe_user(
	kaffee_id, user_id)
	VALUES (3, 1);

INSERT INTO "Selecta"(name, price)
    VALUES('Eistee', 2.5);
INSERT INTO "Selecta"(name, price)
    VALUES('Cola', 3);
INSERT INTO "Selecta"(name, price)
    VALUES('Schokolade', 1.5);

INSERT INTO selecta_user(
	selecta_id, user_id)
	VALUES (1, 1);
INSERT INTO selecta_user(
	selecta_id, user_id)
	VALUES (2, 2);
INSERT INTO selecta_user(
	selecta_id, user_id)
	VALUES (3, 3);

INSERT INTO "Bereiche"(category, "isFree", name)
    VALUES ('Präsentation', TRUE, 'presentYourStaff');
INSERT INTO "Bereiche"(category, "isFree", name)
    VALUES ('Meeting', FALSE, 'Scrum');

INSERT INTO "Buchung"(date, "halfDay", "status", bereiche_id, user_id)
    VALUES ('2022-03-05', TRUE, FALSE, 1, 1);
INSERT INTO "Buchung"(date, "halfDay", "status", bereiche_id, user_id)
    VALUES ('2022-03-05', TRUE, TRUE, 2, 2);
INSERT INTO "Buchung"(date, "halfDay", "status", bereiche_id, user_id)
    VALUES ('2022-03-05', FALSE, FALSE, 1, 3);
    