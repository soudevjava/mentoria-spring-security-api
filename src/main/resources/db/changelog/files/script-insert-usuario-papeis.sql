INSERT INTO usuario_papeis (usuario_id, papel_id, data_de_criacao, estado)
SELECT 
    (SELECT id FROM usuarios WHERE email = 'ritsure.julai.jose@gmail.com'), 
    (SELECT id FROM papeis WHERE nome = 'ROOT'), 
    NOW(),
    TRUE;

INSERT INTO usuario_papeis (usuario_id, papel_id, data_de_criacao, estado)
SELECT 
    (SELECT id FROM usuarios WHERE email = 'ana.silva@example.com'), 
    (SELECT id FROM papeis WHERE nome = 'ADMIN'), 
    NOW(),
    TRUE;

INSERT INTO usuario_papeis (usuario_id, papel_id, data_de_criacao, estado)
SELECT 
    (SELECT id FROM usuarios WHERE email = 'joao.pedro@example.com'), 
    (SELECT id FROM papeis WHERE nome = 'REGULAR'), 
    NOW(),
    TRUE;
