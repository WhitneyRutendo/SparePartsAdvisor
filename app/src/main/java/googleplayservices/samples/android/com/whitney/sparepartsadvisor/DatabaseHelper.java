package googleplayservices.samples.android.com.whitney.sparepartsadvisor;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.EditText;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "registration.db";
    public static final String TABLE_NAME = "registration";
    public static final String COLUMN_FARMERID = "farmerid";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_USERNAME = "username";
    public static final String COLUMN_EMAIL = "email";
    SQLiteDatabase db;


    public DatabaseHelper (Context context)
    {
        super(context, DATABASE_NAME, null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME +"(farmerid integer primary key autoincrement, name text, username text, email text)");
        this.db = db;

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    db.execSQL( "DROP TABLE IF EXISTS "+TABLE_NAME);
    }
    public boolean insertData(EditText name, EditText username, EditText email){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COLUMN_NAME, String.valueOf(name));
        contentValues.put(COLUMN_USERNAME, String.valueOf(username));
        contentValues.put(COLUMN_EMAIL, String.valueOf(email));
       long result  = db.insert(TABLE_NAME, null,contentValues);
       db.close();

       //To check Whether Data is Inserted in Database
        if (result ==1){
            return false;
        }else{
            return true;
        }
    }
}
