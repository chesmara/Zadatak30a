package com.example.sninkovic_ns.zadatak30a.db.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by SNinkovic_ns on 12.3.2017.
 */
@DatabaseTable(tableName = Glumac.TABLE_NAME_GLUMAC)
public class Glumac {

public static final String TABLE_NAME_GLUMAC = "glumci";

    public static final String FIELD_NAME_ID = "id";
    public static final String FIELD_NAME_NAME ="name";
    public static final String FIELD_NAME_DESCRIBE ="describe";
    public static final String FIELD_NAME_YEAR = "year";
    public static final String FIELD_NAME_RATE = "rate";

    @DatabaseField(columnName = FIELD_NAME_ID,generatedId = true)
    private int mId;
    @DatabaseField(columnName = FIELD_NAME_NAME)
    private String mName;
    @DatabaseField(columnName = FIELD_NAME_DESCRIBE )
    private String mDescribe;
    @DatabaseField(columnName = FIELD_NAME_YEAR)
    private String mYear;
    @DatabaseField(columnName = FIELD_NAME_RATE)
    private String mRate;

    public Glumac(){}     // Prazan konstruktor

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmDescribe() {
        return mDescribe;
    }

    public void setmDescribe(String mDescribe) {
        this.mDescribe = mDescribe;
    }

    public String getmYear() {
        return mYear;
    }

    public void setmYear(String mYear) {
        this.mYear = mYear;
    }

    public String getmRate() {
        return mRate;
    }

    public void setmRate(String mRate) {
        this.mRate = mRate;
    }

    @Override
    public String toString() {
        return mName;
    }
}
