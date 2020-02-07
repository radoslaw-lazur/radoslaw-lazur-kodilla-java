package com.kodilla.jdbc;

import org.junit.Before;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.Assert.assertEquals;

public class StoredProcTestSuite {
    private Statement statement;
    private String sqlUpdate;

    @Before
    public void init() throws SQLException {
        DbManager dbManager = DbManager.getInstance();
        statement = dbManager.getConnection().createStatement();
    }

    @Test
    public void testUpdateVipLevels() throws SQLException {
        //Given
        sqlUpdate = "UPDATE READERS SET VIP_LEVEL=\"Not set\"";
        statement.executeUpdate(sqlUpdate);
        //When
        String sqlProcedureCall = "CALL UpdateVipLevels()";
        statement.execute(sqlProcedureCall);
        //Then
        String sqlCheckTable = "SELECT COUNT(*) AS HOW_MANY FROM READERS WHERE VIP_LEVEL=\"Not Set\"";
        ResultSet resultSet = statement.executeQuery(sqlCheckTable);
        int howMany = -1;
        if (resultSet.next()) {
            howMany = resultSet.getInt("HOW_MANY");
        }
        //assertEquals(0, howMany);
    }

    @Test
    public void testUpdateBestsellers() throws SQLException {
        //Given
        sqlUpdate = "UPDATE BOOKS SET BESTSELLER=0";
        statement.executeUpdate(sqlUpdate);
        //When
        String sqlProcedureCall = "CALL UpdateBestsellers()";
        statement.execute(sqlProcedureCall);
        //Then
        String sqlCheckTableTrue = "SELECT COUNT(*) AS HOW_MANY FROM BOOKS WHERE BESTSELLER=1";
        ResultSet resultSetTrue = statement.executeQuery(sqlCheckTableTrue);
        int howMany = -1;
        if (resultSetTrue.next()) {
            howMany = resultSetTrue.getInt("HOW_MANY");
        }
        //assertEquals(4, howMany);
    }
}
