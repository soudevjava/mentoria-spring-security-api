INSERT INTO papel_permissoes (papel_id, permissao_id, data_de_criacao, estado)
SELECT 
    (SELECT id FROM papeis WHERE nome = 'ROOT'),
    permissao_id,
    NOW(),
    TRUE
FROM permissoes;

INSERT INTO papel_permissoes (papel_id, permissao_id, data_de_criacao, estado)
VALUES 
  ((SELECT id FROM papeis WHERE nome = 'ADMIN'), (SELECT id FROM permissoes WHERE nome = 'USUARIO_CRIAR'), NOW(), TRUE),
  ((SELECT id FROM papeis WHERE nome = 'ADMIN'), (SELECT id FROM permissoes WHERE nome = 'USUARIO_LISTAR'), NOW(), TRUE),
  ((SELECT id FROM papeis WHERE nome = 'ADMIN'), (SELECT id FROM permissoes WHERE nome = 'USUARIO_ATUALIZAR'), NOW(), TRUE),
  ((SELECT id FROM papeis WHERE nome = 'ADMIN'), (SELECT id FROM permissoes WHERE nome = 'USUARIO_REMOVER'), NOW(), TRUE),

  ((SELECT id FROM papeis WHERE nome = 'ADMIN'), (SELECT id FROM permissoes WHERE nome = 'PAPEL_CRIAR'), NOW(), TRUE),
  ((SELECT id FROM papeis WHERE nome = 'ADMIN'), (SELECT id FROM permissoes WHERE nome = 'PAPEL_LISTAR'), NOW(), TRUE),

  ((SELECT id FROM papeis WHERE nome = 'ADMIN'), (SELECT id FROM permissoes WHERE nome = 'PERMISSAO_CRIAR'), NOW(), TRUE),
  ((SELECT id FROM papeis WHERE nome = 'ADMIN'), (SELECT id FROM permissoes WHERE nome = 'PERMISSAO_LISTAR'), NOW(), TRUE),

  ((SELECT id FROM papeis WHERE nome = 'ADMIN'), (SELECT id FROM permissoes WHERE nome = 'ATRIBUIR_PAPEL_A_USUARIO'), NOW(), TRUE),
  ((SELECT id FROM papeis WHERE nome = 'ADMIN'), (SELECT id FROM permissoes WHERE nome = 'REMOVER_PAPEL_DE_USUARIO'), NOW(), TRUE);

INSERT INTO papel_permissoes (papel_id, permissao_id, data_de_criacao, estado)
VALUES 
  ((SELECT id FROM papeis WHERE nome = 'REGULAR'), (SELECT id FROM permissoes WHERE nome = 'USUARIO_LISTAR'), NOW(), TRUE);