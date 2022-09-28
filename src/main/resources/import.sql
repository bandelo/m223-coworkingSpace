
INSERT INTO "Kaffee"(
	id, type, price)
	VALUES (1,'capuccino', 3.5);
INSERT INTO "Kaffee"(
	id, type, price)
	VALUES (2,'machiatto', 4);
INSERT INTO "Kaffee"(
	id, type, price)
	VALUES (3,'espresso', 2.95);

INSERT INTO "Role"(
	id, name)
	VALUES (1, 'admin');
INSERT INTO "Role"(
	id, name)
	VALUES (2, 'mitglied');

INSERT INTO "User"(id, email, nachname, password, vorname, role_id)
	VALUES (1, 'and@bat.com', 'and', 'and', 'Jon', 1);
INSERT INTO "User"(id, email, nachname, password, vorname, role_id)
	VALUES (2, 'max@muster','muster', 'max123', 'max', 2);
INSERT INTO "User"(id, email, nachname, password, vorname, role_id)
	VALUES (3, 'test@test','test', 'test', 'test', 2);

INSERT INTO kaffe_user(
	kaffee_id, user_id)
	VALUES (1, 1);
INSERT INTO kaffe_user(
	kaffee_id, user_id)
	VALUES (2, 1);
INSERT INTO kaffe_user(
	kaffee_id, user_id)
	VALUES (3, 1);

INSERT INTO "Selecta"(id, name, price)
    VALUES(1, 'Eistee', 2.5);
INSERT INTO "Selecta"(id, name, price)
    VALUES(2, 'Cola', 3);
INSERT INTO "Selecta"(id, name, price)
    VALUES(3, 'Schokolade', 1.5);

INSERT INTO selecta_user(
	selecta_id, user_id)
	VALUES (1, 1);
INSERT INTO selecta_user(
	selecta_id, user_id)
	VALUES (2, 2);
INSERT INTO selecta_user(
	selecta_id, user_id)
	VALUES (3, 3);

INSERT INTO "Bereiche"(id, category, "isFree", name)
    VALUES (1, 'Präsentation', TRUE, 'presentYourStaff');
INSERT INTO "Bereiche"(id, category, "isFree", name)
    VALUES (2, 'Meeting', FALSE, 'Scrum');

INSERT INTO "Buchung"(id, date, "halfDay", "status", bereiche_id, user_id)
    VALUES (1, '2022-03-05', TRUE, FALSE, 1, 1);
INSERT INTO "Buchung"(id, date, "halfDay", "status", bereiche_id, user_id)
    VALUES (2, '2022-03-05', TRUE, TRUE, 2, 2);
INSERT INTO "Buchung"(id, date, "halfDay", "status", bereiche_id, user_id)
    VALUES (3, '2022-03-05', FALSE, FALSE, 1, 3);
    