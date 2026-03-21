package com.shop.config;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public final class DatabaseConnectionFactory {
    private static final String PROPERTIES_FILE = "db.properties";

    private DatabaseConnectionFactory() {
    }

    public static Connection openConnection() throws IOException, SQLException {
        Properties properties = new Properties();

        try (InputStream inputStream = DatabaseConnectionFactory.class
                .getClassLoader()
                .getResourceAsStream(PROPERTIES_FILE)) {
            if (inputStream == null) {
                throw new IOException("Could not find " + PROPERTIES_FILE);
            }
            properties.load(inputStream);
        }

        return DriverManager.getConnection(
                properties.getProperty("db.url"),
                properties.getProperty("db.username"),
                properties.getProperty("db.password"));
    }
}
