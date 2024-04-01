INSERT INTO users VALUES ('userId', 'test@helloai.ink', '123456');

INSERT INTO usedcarsales (id, make, model, year, description, odometer, vehiclecondition, salelocation, salecategory, salvagevehicle, saledate, saleprice, colour, engine, transmission, states, customdate)
VALUES ('1', 'Audi', 'A5', 2016, '8T MY16 S line plus Coupe 2dr S tronic 7sp quattro 2.0T', 82640, 'Above Average', 'Southport (QLD)', 'Dealership', 'No', '2024-03-28', FLOOR(RAND() * (20000 - 10000 + 1)) + 10000, 'Grey', '2.0 Direct Injection Turbo Petrol', '7 S line plus Automatic', 'QLD', 20240328);

UPDATE `preinterview`.`usedcarsales` SET `badges` = '30 TFSI', `bodytype` = 'Hatchback', `fueltype` = 'Petrol', `cylinders` = '3', `seat` = '5', `doors` = '5' WHERE (`id` = '1');

-- Inserting record with ID 2
INSERT INTO usedcarsales (id, make, model, year, description, odometer, vehiclecondition, salelocation, salecategory, salvagevehicle, saledate, saleprice, colour, engine, transmission, states, customdate)
VALUES ('2', 'Audi', 'A5', 2014, '8T MY15 Cabriolet 2dr S tronic 7sp quattro 3.0DT', 73092, 'Excellent', 'Altona North (VIC)', 'Wholesale', 'No', '2024-03-26', FLOOR(RAND() * (20000 - 10000 + 1)) + 10000, 'Black', '3.0 Direct Injection Turbo Diesel', '7 Automatic', 'VIC', 20240326);

-- Inserting record with ID 3
INSERT INTO usedcarsales (id, make, model, year, description, odometer, vehiclecondition, salelocation, salecategory, salvagevehicle, saledate, saleprice, colour, engine, transmission, states, customdate)
VALUES ('3', 'Audi', 'A5', 2015, '8T MY15 Coupe 2dr S tronic 7sp quattro 2.0T', 156251, 'Average', 'Sunshine, Melbourne (VIC)', 'Auction', 'No', '2024-03-25', FLOOR(RAND() * (20000 - 10000 + 1)) + 10000, 'Grey', '2.0 Direct Injection Turbo Petrol', '7 Automatic', 'VIC', 20240325);

-- Inserting record with ID 4
INSERT INTO usedcarsales (id, make, model, year, description, odometer, vehiclecondition, salelocation, salecategory, salvagevehicle, saledate, saleprice, colour, engine, transmission, states, customdate)
VALUES ('4', 'Audi', 'A5', 2010, '8T MY10 Cabriolet 2dr S tronic 7sp quattro 2.0T', 171000, 'Excellent', 'West Footscray (VIC)', 'Dealership', 'No', '2024-03-23', FLOOR(RAND() * (20000 - 10000 + 1)) + 10000, 'Grey', '2.0 Multi-Point Injection Turbo Petrol', '7 Automatic', 'VIC', 20240323);

-- Inserting record with ID 5
INSERT INTO usedcarsales (id, make, model, year, description, odometer, vehiclecondition, salelocation, salecategory, salvagevehicle, saledate, saleprice, colour, engine, transmission, states, customdate)
VALUES ('5', 'Audi', 'A5', 2010, '8T MY10 Sportback 5dr S tronic 7sp quattro 2.0T', 123956, 'Excellent', 'Alphington (VIC)', 'Dealership', 'No', '2024-03-20', FLOOR(RAND() * (20000 - 10000 + 1)) + 10000, 'Red', '2.0 Multi-Point Injection Turbo Petrol', '7 Automatic', 'VIC', 20240320);

-- Inserting record with ID 6
INSERT INTO usedcarsales (id, make, model, year, description, odometer, vehiclecondition, salelocation, salecategory, salvagevehicle, saledate, saleprice, colour, engine, transmission, states, customdate)
VALUES ('6', 'Abarth', '124', 2018, '348 Series 1 Spider Roadster 2dr Man 6sp 1.4T', 51634, 'Excellent', 'New Lambton Heights (NSW)', 'Wholesale', 'No', '2024-03-04', FLOOR(RAND() * (20000 - 10000 + 1)) + 10000, 'White', '1.4 Multi-Point Injection Turbo Petrol', '6 Spider Manual', 'NSW', 20240304);

-- Inserting record with ID 7
INSERT INTO usedcarsales (id, make, model, year, description, odometer, vehiclecondition, salelocation, salecategory, salvagevehicle, saledate, saleprice, colour, engine, transmission, states, customdate)
VALUES ('7', 'Abarth', '124', 2017, '348 Spider Roadster 2dr Man 6sp 1.4T', 32335, 'Average', 'Sunshine, Melbourne (VIC)', 'Auction', 'No', '2024-01-11', FLOOR(RAND() * (20000 - 10000 + 1)) + 10000, 'White', '1.4 Multi-Point Injection Turbo Petrol', '6 Spider Manual', 'VIC', 20240111);
