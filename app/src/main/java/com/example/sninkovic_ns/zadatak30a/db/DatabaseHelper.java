package com.example.sninkovic_ns.zadatak30a.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.sninkovic_ns.zadatak30a.db.model.Glumac;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;

/**
 * Created by SNinkovic_ns on 12.3.2017.
 */

public class DatabaseHelper extends OrmLiteSqliteOpenHelper {

    private static final String DATABASE_NAME= "ormlite.db";
    private static final int DATABASE_VERSION= 1;

    private Dao<Glumac, Integer> mGlumacDao=null;

    private DatabaseHelper(Context context){
        super(context,DATABASE_NAME, null, DATABASE_VERSION );
    }

    @Override
    public void onCreate(SQLiteDatabase database, ConnectionSource connectionSource) {
        try {
            TableUtils.createTable(connectionSource,Glumac.class);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource, int oldVersion, int newVersion) {
        try {
            TableUtils.dropTable(connectionSource,Glumac.class,true);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        onCreate(database,connectionSource);
    }

    public Dao<Glumac,Integer> getmGlumacDao() throws SQLException {
        if(mGlumacDao==null){
            mGlumacDao=getDao(Glumac.class);
        }  return mGlumacDao;
    }

    public void close(){
        mGlumacDao=null;
        super.close();
    }

}
