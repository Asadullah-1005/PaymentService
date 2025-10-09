CREATE TABLE PAYMENT(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    orderId BIGINT NOT NULL ,
    paymentMode VARCHAR(50) NOT NULL ,
    referenceNumber VARCHAR(100).
    paymentDate TIMESTAMP NULL,
    paymentStatus VARCHAR(50),
    amount BIGINT NOT NULL
)