package com.infinityproject.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConf {
	// Librera de MySQL
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";

    // Nombre de la base de datos
    private final String DB_NAME = "Infinity"; //NOMBRE DE NUESTRA BASE DE DATOS

    // Host
    private final String HOSTNAME = "localhost";

    // Puerto
    public final String PORT = "3306";

    // Ruta de nuestra base de datos (desactivamos el uso de SSL con "?useSSL=false")
    public final String url = "jdbc:mysql://" + HOSTNAME + ":" + PORT + "/" + DB_NAME + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

    // Nombre de usuario
    public final String USER_NAME = "root";

    // Clave de usuario
    public final String PASSWORD = "";

    //LULU - TENES QUE HACER UN USUARIO
   // public String username = "root";

    // Clave de usuario
   // public String password = "";

    public Connection conectarMySQL() {
        Connection conn = null;

        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(url, USER_NAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }
}
