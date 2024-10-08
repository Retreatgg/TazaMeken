INSERT INTO users(username, email, password, enabled, avatar)
VALUES
    ('арген', 'retreatpm@example.com', '$2a$12$WB2YUbFcCN0tm44SBcKUjua9yiFBsfB3vW02IjuwzY7HGtlQIKzy2', true, 'argen.jpg'),
    ('канат', 'john@example.com', '$2a$12$WB2YUbFcCN0tm44SBcKUjua9yiFBsfB3vW02IjuwzY7HGtlQIKzy2', true, 'default.jpg'),
    ('алия', 'jane@example.com', '$2a$12$WB2YUbFcCN0tm44SBcKUjua9yiFBsfB3vW02IjuwzY7HGtlQIKzy2', true, 'default.jpg'),
    ('айэлина', 'michael@example.com', '$2a$12$WB2YUbFcCN0tm44SBcKUjua9yiFBsfB3vW02IjuwzY7HGtlQIKzy2', true, 'default.jpg'),
    ('эмир', 'emma@example.com', '$2a$12$WB2YUbFcCN0tm44SBcKUjua9yiFBsfB3vW02IjuwzY7HGtlQIKzy2', true, 'default.jpg'),
    ('искендер', 'oliver@example.com', '$2a$12$WB2YUbFcCN0tm44SBcKUjua9yiFBsfB3vW02IjuwzY7HGtlQIKzy2', true, 'default.jpg'),
    ('нариман', 'ava@example.com', '$2a$12$WB2YUbFcCN0tm44SBcKUjua9yiFBsfB3vW02IjuwzY7HGtlQIKzy2', true, 'default.jpg');


INSERT INTO user_answers(user_id, answer_id, answered_date)
VALUES
    -- Экологические проблемы Кыргызстана (правильные ответы)
    (5, 1, '2024-09-15'),
    (5, 5, '2024-09-15'),
    (5, 9, '2024-09-15'),

    -- Охрана природных ресурсов в Кыргызстане (правильные ответы)
    (5, 13, '2024-09-15'),
    (5, 17, '2024-09-15'),
    (5, 19, '2024-09-15'),

    -- Изменение климата в Центральной Азии (правильные ответы)
    (5, 21, '2024-09-15'),
    (5, 25, '2024-09-15'),
    (5, 29, '2024-09-15'),

    -- Проблема утилизации отходов в Кыргызстане (правильные ответы)
    (5, 33, '2024-09-15'),
    (5, 37, '2024-09-15'),
    (5, 41, '2024-09-15'),

    -- Возобновляемая энергия и её будущее в Кыргызстане (правильные ответы)
    (5, 45, '2024-09-15'),
    (5, 49, '2024-09-15'),
    (5, 53, '2024-09-15');



-- Пользователь john_doe
INSERT INTO user_answers(user_id, answer_id, answered_date)
VALUES
    (6, 1, '2024-09-15'),
    (6, 6, '2024-09-15'),
    (6, 10, '2024-09-15'),
    (6, 14, '2024-09-15'),
    (6, 18, '2024-09-15'),
    (6, 20, '2024-09-15'),
    (6, 22, '2024-09-15'),
    (6, 26, '2024-09-15'),
    (6, 30, '2024-09-15');

-- Пользователь jane_smith
INSERT INTO user_answers(user_id, answer_id, answered_date)
VALUES
    (7, 2, '2024-09-15'),
    (7, 5, '2024-09-15'),
    (7, 9, '2024-09-15'),
    (7, 13, '2024-09-15'),
    (7, 16, '2024-09-15'),
    (7, 19, '2024-09-15'),
    (7, 23, '2024-09-15'),
    (7, 27, '2024-09-15'),
    (7, 31, '2024-09-15');

-- Пользователь michael_jones
INSERT INTO user_answers(user_id, answer_id, answered_date)
VALUES
    (8, 3, '2024-09-15'),
    (8, 7, '2024-09-15'),
    (8, 11, '2024-09-15'),
    (8, 15, '2024-09-15'),
    (8, 19, '2024-09-15'),
    (8, 21, '2024-09-15'),
    (8, 25, '2024-09-15'),
    (8, 29, '2024-09-15'),
    (8, 33, '2024-09-15');

-- Пользователь emma_wilson
INSERT INTO user_answers(user_id, answer_id, answered_date)
VALUES
    (9, 1, '2024-09-15'),
    (9, 5, '2024-09-15'),
    (9, 9, '2024-09-15'),
    (9, 13, '2024-09-15'),
    (9, 17, '2024-09-15'),
    (9, 20, '2024-09-15'),
    (9, 24, '2024-09-15'),
    (9, 28, '2024-09-15'),
    (9, 32, '2024-09-15');

-- Пользователь oliver_brown
INSERT INTO user_answers(user_id, answer_id, answered_date)
VALUES
    (10, 2, '2024-09-15'),  -- Экологические проблемы Кыргызстана (неправильный ответ)
    (10, 5, '2024-09-15'),  -- Экологические проблемы Кыргызстана (правильный ответ)
    (10, 10, '2024-09-15'), -- Экологические проблемы Кыргызстана (неправильный ответ)
    (10, 13, '2024-09-15'), -- Охрана природных ресурсов в Кыргызстане (правильный ответ)
    (10, 16, '2024-09-15'), -- Охрана природных ресурсов в Кыргызстане (неправильный ответ)
    (10, 19, '2024-09-15'), -- Охрана природных ресурсов в Кыргызстане (правильный ответ)
    (10, 21, '2024-09-15'), -- Изменение климата в Центральной Азии (правильный ответ)
    (10, 24, '2024-09-15'), -- Изменение климата в Центральной Азии (неправильный ответ)
    (10, 28, '2024-09-15'), -- Изменение климата в Центральной Азии (неправильный ответ)
    (10, 33, '2024-09-15'), -- Проблема утилизации отходов в Кыргызстане (правильный ответ)
    (10, 36, '2024-09-15'), -- Проблема утилизации отходов в Кыргызстане (неправильный ответ)
    (10, 41, '2024-09-15'); -- Проблема утилизации отходов в Кыргызстане (правильный ответ)

-- Пользователь ava_davis
INSERT INTO user_answers(user_id, answer_id, answered_date)
VALUES
    (11, 3, '2024-09-15'),  -- Экологические проблемы Кыргызстана (неправильный ответ)
    (11, 5, '2024-09-15'),  -- Экологические проблемы Кыргызстана (правильный ответ)
    (11, 9, '2024-09-15'),  -- Экологические проблемы Кыргызстана (правильный ответ)
    (11, 14, '2024-09-15'), -- Охрана природных ресурсов в Кыргызстане (неправильный ответ)
    (11, 17, '2024-09-15'), -- Охрана природных ресурсов в Кыргызстане (правильный ответ)
    (11, 19, '2024-09-15'), -- Охрана природных ресурсов в Кыргызстане (правильный ответ)
    (11, 22, '2024-09-15'), -- Изменение климата в Центральной Азии (неправильный ответ)
    (11, 25, '2024-09-15'), -- Изменение климата в Центральной Азии (правильный ответ)
    (11, 29, '2024-09-15'), -- Изменение климата в Центральной Азии (правильный ответ)
    (11, 34, '2024-09-15'), -- Проблема утилизации отходов в Кыргызстане (неправильный ответ)
    (11, 37, '2024-09-15'), -- Проблема утилизации отходов в Кыргызстане (правильный ответ)
    (11, 41, '2024-09-15'); -- Проблема утилизации отходов в Кыргызстане (правильный ответ)
