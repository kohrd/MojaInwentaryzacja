package pl.moja.inwentaryzacja.database.dbUtilities;

import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.logger.Logger;
import com.j256.ormlite.logger.LoggerFactory;
import com.j256.ormlite.support.ConnectionSource;

import java.sql.SQLException;

public class DbManager {


    private static final Logger LOGGER = LoggerFactory.getLogger(DbManager.class);

    private static final String JDBC_DRIVER_HD = "jdbc:h2:./libraryDB";
    private static final String USER = "admin";
    private static final String PASS = "admin";

    private static ConnectionSource connectionSource;

    public static void initDatabase() {
//        createConnectioSource();
//        dropTable();
//        createtable();
//        closeConnectionSource();
    }

    private static void createConnectionSource() {

        try {
            connectionSource = new JdbcConnectionSource(JDBC_DRIVER_HD, USER, PASS) {


            }
        } catch (SQLException e) {
            LOGGER.warn(e.getMessage());
        }
    }

// SKONCZONE NA LEKCJI 32 CZAS 7:37
}
