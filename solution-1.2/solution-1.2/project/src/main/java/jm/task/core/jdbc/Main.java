package jm.task.core.jdbc;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.util.Util;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        System.out.println(Util.getConnection());
        UserDaoJDBCImpl u = new UserDaoJDBCImpl();
        u.createUsersTable();
        u.saveUser("Harry","Potter", (byte) 11);
        u.saveUser("Hermione"," Granger", (byte) 12);
        u.saveUser("Ron","Weasley", (byte) 10);
        u.saveUser("Rubeus","Hagrid", (byte) 62);
        System.out.println(u.getAllUsers());
        u.cleanUsersTable();
        u.dropUsersTable();

    }
}
