DROP TABLE IF EXISTS produto;

CREATE TABLE produto (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    descricao VARCHAR(255),
    preco FLOAT NOT NULL
);

INSERT INTO produto (nome, descricao, preco) VALUES
('Notebook Lenovo', 'Notebook Lenovo com 16GB RAM e SSD 512GB', 4500.00),
('Mouse Logitech', 'Mouse sem fio Logitech M185', 120.50),
('Teclado Mecânico', 'Teclado Mecânico RGB com switches azuis', 299.99),
('Monitor LG', 'Monitor LG 24 polegadas Full HD', 899.90),
('Fone de Ouvido JBL', 'Fone Bluetooth JBL com cancelamento de ruído', 350.00);
