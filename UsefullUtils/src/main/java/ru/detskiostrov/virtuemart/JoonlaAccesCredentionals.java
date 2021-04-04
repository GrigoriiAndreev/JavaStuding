/*
 *  Description
 *  Author: Grigorii Andreev
 *  Date: 29.03.2021
 */

package ru.detskiostrov.virtuemart;

public class JoonlaAccesCredentionals {

    // Be careful to store secure and private data
    static final String shopDBAdminLogin = "";
    static final String shopDBAdminPassword = "";
    static final String shopDBIP = "";
    static final String shopDBName = "db1029682_integ2";
    static final String dbTableName = "orszw_users";
    static final String extractedDataFolder = "D:/JavaStudy/UsefullUtils/src/main/resources/resultfolder/";
    static final String extractedDataExcelFileName = "db_" + shopDBName + "users_list.xls";
    static final String dbSQLQueryToGetUsersList = "select * from orszw_users";
    static final String shopDBUrl = "jdbc:mysql://" + shopDBIP + ":3306/" + shopDBName;

}
