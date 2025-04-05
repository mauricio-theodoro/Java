DROP TABLE IF EXISTS produto;

CREATE TABLE produto (
    id VARCHAR(36) PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    descricao VARCHAR(255),
    preco FLOAT NOT NULL
);

INSERT INTO produto (id, nome, descricao, preco) VALUES
(UUID(), 'Notebook Lenovo', 'Notebook Lenovo com 16GB RAM e SSD 512GB', 4500.00),
(UUID(), 'Mouse Logitech', 'Mouse sem fio Logitech M185', 120.50),
(UUID(), 'Teclado Mecânico', 'Teclado Mecânico RGB com switches azuis', 299.99),
(UUID(), 'Monitor LG', 'Monitor LG 24 polegadas Full HD', 899.90),
(UUID(), 'Fone de Ouvido JBL', 'Fone Bluetooth JBL com cancelamento de ruído', 350.00);
