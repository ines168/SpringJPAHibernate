INSERT INTO TYPE (name) VALUES
    ('CPU'), ('GPU'), ('MBO'), ('RAM'), ('STORAGE'), ('OTHER');

INSERT INTO HARDWARE (code, name, type_id, stock, price) VALUES
        ('1234561', 'Asus TUF RTX 3080', 1, 0, 1599.00),
        ('1234562', 'EVGA XC3 RTX 3070 Ti', 1, 0, 1299.00),
        ('1234563', 'AMD Ryzen 5950X', 2, 0, 899.00),
        ('1234564', 'Samsung 980 PRO SSD 1TB', 3, 0, 299.00),
        ('1234565', 'Kingston FURY Beast DDR5 32GB', 4, 0, 699.00);