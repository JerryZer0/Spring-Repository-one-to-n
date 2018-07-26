CREATE TABLE `employee`(
    `id` BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `name` VARCHAR(32) NOT NULL,
    `company_id` BIGINT,
    `created_date` TIMESTAMP DEFAULT NOW()

)