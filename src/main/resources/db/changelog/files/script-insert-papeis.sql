-- Inserção de papéis: ROOT, ADMIN, REGULAR
INSERT INTO papeis (nome, data_de_criacao, estado)
VALUES 
  ('ROOT', NOW(), TRUE),
  ('ADMIN', NOW(), TRUE),
  ('REGULAR', NOW(), TRUE);