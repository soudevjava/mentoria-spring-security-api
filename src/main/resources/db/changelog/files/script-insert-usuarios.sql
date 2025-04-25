INSERT INTO usuarios (nome, email, senha, data_de_criacao, estado)
VALUES 
  ('Jose Julai', 'ritsure.julai.jose@gmail.com', '{bcrypt}$2a$12$4Z0E3TrKrdu35rDbsS7mNOF/eEgqFgPoziX7JpqAf8BDU5JCDh/Oa', NOW(), 1),
  ('Ana Silva', 'ana.silva@example.com', '{bcrypt}$2a$12$GGECMeL3IBcFRtSLlYFxOuDg6JtYfGOQfvKB7AYjsolq/cwZPeUdu', NOW(), 1),
  ('João Pedro', 'joao.pedro@example.com', '{bcrypt}$2a$12$kBHpC6C7w8Pdsgw7s8tq8Oli639EVaVO.mqImrUXCT2MYPKtxkVtu', NOW(), 1);
