insert into categories(name)
values ('Футболка'),
       ('Кепка'),
       ('Свитер'),
       ('Куртка'),
       ('Эко сумки');

insert into genders(name)
values ('Мужской'),
       ('Женский'),
       ('Универсал');

insert into colors(name)
values ('Красный'),
       ('Серый'),
       ('Черный'),
       ('Синий'),
       ('Белый'),
       ('Зеленый');

insert into clothes(category_id, color_id, gender_id, size, price, photo_name, is_sold)
VALUES (1, 3, 1, 'L', 1200,'blacktshir.jpg' , false), -- Футболка черный мужской
       (1, 5, 2, 'S', 900, 'whitetshor.jpg', false), -- футболка белый женский
       (1, 2, 3, 'M', 1200, 'greytshirt.jpg', false), -- футболка серый унисекс
       (2, 4, 1, 'M', 800, 'CAPBLUE.jpg', false),  -- Кепка, Синий, Мужской
       (2, 1, 2, 'L', 700, 'CAPRED.jpg', false),  -- Кепка, Красный, Женский
       (3, 6, 3, 'XL', 2500, 'greensweatshot.jpg', false),-- Свитер, Зеленый, Универсал
       (4, 3, 1, 'M', 3500, 'blackrickowens.jpeg', true),  -- Куртка, Черный, Мужской
       (4, 5, 2, 'S', 3400, 'whitejacket.jpeg', false), -- Куртка, Белый, Женский
       (5, 2, 3, 'L', 500, 'greypacket.jpeg', false),  -- Эко сумка, Серый, Универсал
       (5, 6, 1, 'M', 600, 'greenpacket.jpeg', true);   -- Эко сумка, Зеленый, Мужской