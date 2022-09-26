insert into Role (id, name) values (1, 'Admin');
insert into Role (id, name) values (2, 'Mitglied');
insert into Role (id, name) values (3, 'Besucher');

insert into User (id, vorname, nachname, email, password, role_id) values (1, 'Melonie', 'Kanwell', 'mkanwell0@g.co', '2dgVQqA4VGkS', 1);
insert into User (id, vorname, nachname, email, password, role_id) values (2, 'Caspar', 'Clappison', 'cclappison1@gizmodo.com', '858DWH7kWe', 2);
insert into User (id, vorname, nachname, email, password, role_id) values (3, 'Far', 'Cowan', 'fcowan2@msu.edu', '881xqXf', 2);
insert into User (id, vorname, nachname, email, password, role_id) values (4, 'Norina', 'Osan', 'nosan3@wikia.com', '71vMu4H', 2);
insert into User (id, vorname, nachname, email, password, role_id) values (5, 'Bob', 'Boutflour', 'bboutflour4@wp.com', 'PyJWaoLE1FJu', 2);
insert into User (id, vorname, nachname, email, password, role_id) values (6, 'Frayda', 'Cazereau', 'fcazereau5@etsy.com', 'gNQs1MpH7', 2);
insert into User (id, vorname, nachname, email, password, role_id) values (7, 'Genevra', 'Morales', 'gmorales6@cloudflare.com', '2c2oeXcwm7', 2);
insert into User (id, vorname, nachname, email, password, role_id) values (8, 'Gale', 'Weeke', 'gweeke7@live.com', 'DRcginrm6R', 2);
insert into User (id, vorname, nachname, email, password, role_id) values (9, 'Eward', 'Burner', 'eburner8@smugmug.com', '7odSPz', 2);
insert into User (id, vorname, nachname, email, password, role_id) values (10, 'Krishna', 'Duff', 'kduff9@wikipedia.org', 'KFuCiLJXKol', 2);
insert into User (id, vorname, nachname, email, password, role_id) values (11, 'Brenna', 'Gyde', 'bgydea@sbwire.com', '0mK6AOqH', 2);
insert into User (id, vorname, nachname, email, password, role_id) values (12, 'Timmy', 'Yellep', 'tyellepb@dropbox.com', 'fcBWSCC0', 2);
insert into User (id, vorname, nachname, email, password, role_id) values (13, 'Raleigh', 'Poultney', 'rpoultneyc@guardian.co.uk', 'XJtvbMLbfda', 2);
insert into User (id, vorname, nachname, email, password, role_id) values (14, 'Sarene', 'Capstack', 'scapstackd@berkeley.edu', 'tu66bSe', 3);
insert into User (id, vorname, nachname, email, password, role_id) values (15, 'Rosemary', 'Nunns', 'rnunnse@cyberchimps.com', 'lGP1lVl4Fmqe', 3);
insert into User (id, vorname, nachname, email, password, role_id) values (16, 'Frants', 'Dedman', 'fdedmanf@psu.edu', 'lQ0I0M', 3);
insert into User (id, vorname, nachname, email, password, role_id) values (17, 'Venus', 'Dearnley', 'vdearnleyg@tumblr.com', '4Fll1yfNADO', 3);
insert into User (id, vorname, nachname, email, password, role_id) values (18, 'Gabbi', 'O''Lochan', 'golochanh@netscape.com', 'QwYAzmkQj6', 3);
insert into User (id, vorname, nachname, email, password, role_id) values (19, 'Reeba', 'Renner', 'rrenneri@i2i.jp', 'NuC9ZEmXjm', 3);
insert into User (id, vorname, nachname, email, password, role_id) values (20, 'Almire', 'Kembery', 'akemberyj@mozilla.org', 'BtVXbpagxttW', 3);


insert into Kaffee (id, type, price) values (1, 'CHERRY', 1);
insert into Kaffee (id, type, price) values (2, 'Promethazine Hydrochloride and Dextromethorphan Hydrobromide', 1);
insert into Kaffee (id, type, price) values (3, 'Petroleum Skin Protectant', 1);
insert into Kaffee (id, type, price) values (4, 'Cefdinir', 1);
insert into Kaffee (id, type, price) values (5, 'healthy accents stomach relief', 1);
insert into Kaffee (id, type, price) values (6, 'Mirvaso', 2);
insert into Kaffee (id, type, price) values (7, 'Clear Proof Acne Treatment', 2);
insert into Kaffee (id, type, price) values (8, 'Ear Wax Treatment', 1);
insert into Kaffee (id, type, price) values (9, 'Treatment Set TS332229', 1);
insert into Kaffee (id, type, price) values (10, 'Lovastatin', 3);

insert into kaffee_user (user_id, kaffee_id) values (1, 1);
insert into kaffee_user (user_id, kaffee_id) values (2, 2);
insert into kaffee_user (user_id, kaffee_id) values (3, 3);
insert into kaffee_user (user_id, kaffee_id) values (4, 4);
insert into kaffee_user (user_id, kaffee_id) values (5, 5);

insert into Selecta (id, name, price) values (1, 'Pastrami', 2);
insert into Selecta (id, name, price) values (2, 'Sugar - Cubes', 5);
insert into Selecta (id, name, price) values (3, 'Kippers - Smoked', 5);
insert into Selecta (id, name, price) values (4, 'Appetizer - Tarragon Chicken', 5);
insert into Selecta (id, name, price) values (5, 'Table Cloth 62x120 White', 3);
insert into Selecta (id, name, price) values (6, 'Bag Stand', 1);
insert into Selecta (id, name, price) values (7, 'Wine - Saint Emilion Calvet', 3);
insert into Selecta (id, name, price) values (8, 'Fish - Halibut, Cold Smoked', 1);
insert into Selecta (id, name, price) values (9, 'Veal - Round, Eye Of', 2);
insert into Selecta (id, name, price) values (10, 'Spic And Span All Purpose', 1);

insert into selecta_user (user_id, selecta_id) values (1, 1);
insert into selecta_user (user_id, selecta_id) values (2, 2);
insert into selecta_user (user_id, selecta_id) values (3, 3);
insert into selecta_user (user_id, selecta_id) values (4, 4);
insert into selecta_user (user_id, selecta_id) values (5, 5);

insert into Bereiche (id, name, category) values (1, 'Huels, O''Hara and Moore', 'Shield Lichen');
insert into Bereiche (id, name, category) values (2, 'Rogahn-Grant', 'Spidergrass');
insert into Bereiche (id, name, category) values (3, 'Stracke and Sons', 'Bristle Berry');
insert into Bereiche (id, name, category) values (4, 'DuBuque, Altenwerth and O''Keefe', 'Idaho Hawksbeard');
insert into Bereiche (id, name, category) values (5, 'Baumbach-Barton', 'Ivy');
insert into Bereiche (id, name, category) values (6, 'Bogan LLC', 'Laguna Mountain Jewelflower');
insert into Bereiche (id, name, category) values (7, 'Deckow-Hintz', 'Orthotrichum Moss');
insert into Bereiche (id, name, category) values (8, 'Dooley, Haley and Jakubowski', 'Siskiyou Mountain Ragwort');
insert into Bereiche (id, name, category) values (9, 'Grant-Fay', 'Blue Spikemoss');
insert into Bereiche (id, name, category) values (10, 'Dickens-Fritsch', 'Stream-bed Cyanea');

insert into Buchung (id, status, halfDay, user_id, bereiche_id) values (1, false, true, 1, 1);
insert into Buchung (id, status, halfDay, user_id, bereiche_id) values (2, false, false, 2, 2);
insert into Buchung (id, status, halfDay, user_id, bereiche_id) values (3, false, true, 3, 3);
insert into Buchung (id, status, halfDay, user_id, bereiche_id) values (4, false, false, 4, 4);
insert into Buchung (id, status, halfDay, user_id, bereiche_id) values (5, false, false, 5, 5);
insert into Buchung (id, status, halfDay, user_id, bereiche_id) values (6, false, true, 6, 6);
insert into Buchung (id, status, halfDay, user_id, bereiche_id) values (7, false, false, 7, 7);
insert into Buchung (id, status, halfDay, user_id, bereiche_id) values (8, false, true, 8, 8);
insert into Buchung (id, status, halfDay, user_id, bereiche_id) values (9, true, false, 9, 9);
insert into Buchung (id, status, halfDay, user_id, bereiche_id) values (10, true, false, 10, 10);
