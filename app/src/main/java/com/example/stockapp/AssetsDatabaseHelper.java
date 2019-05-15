package com.example.stockapp;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

public class AssetsDatabaseHelper extends SQLiteAssetHelper {

    public AssetsDatabaseHelper(Context context, String name) {
        super(context, name, null, 1);
    }


    public Product getProductSwords(int id){
        Cursor cursor = null;
        String sqliteTables = "products_swords";
        try {
            SQLiteDatabase readableDatabase = getReadableDatabase();

            String query = "SELECT *" +
                    " FROM " + sqliteTables +
                    " WHERE prodId = "+ id+ ";";

            cursor = readableDatabase.rawQuery(query, null);

            if (cursor != null) {
                cursor.moveToFirst();
                int prodId = cursor.getInt(cursor.getColumnIndex("prodId"));
                String description = cursor.getString(cursor.getColumnIndex("description"));
                int small = cursor.getInt(cursor.getColumnIndex("small"));
                int medium = cursor.getInt(cursor.getColumnIndex("medium"));
                int large = cursor.getInt(cursor.getColumnIndex("large"));
                int xlarge = cursor.getInt(cursor.getColumnIndex("xlarge"));

                return new Product(prodId, description, small, medium, large, xlarge);
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if(cursor != null)
                cursor.close();
        }

        return null;
    }

    public Product getProductBlanch(int id){
        Cursor cursor = null;
        String sqliteTables = "products_blanch";
        try {
            SQLiteDatabase readableDatabase = getReadableDatabase();

            String query = "SELECT *" +
                    " FROM " + sqliteTables +
                    " WHERE prodId = "+ id+ ";";

            cursor = readableDatabase.rawQuery(query, null);

            if (cursor != null) {
                cursor.moveToFirst();
                int prodId = cursor.getInt(cursor.getColumnIndex("prodId"));
                String description = cursor.getString(cursor.getColumnIndex("description"));
                int small = cursor.getInt(cursor.getColumnIndex("small"));
                int medium = cursor.getInt(cursor.getColumnIndex("medium"));
                int large = cursor.getInt(cursor.getColumnIndex("large"));
                int xlarge = cursor.getInt(cursor.getColumnIndex("xlarge"));

                return new Product(prodId, description, small, medium, large, xlarge);
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if(cursor != null)
                cursor.close();
        }

        return null;
    }
    public Product getProductHenry(int id){
        Cursor cursor = null;
        String sqliteTables = "products_henry";
        try {
            SQLiteDatabase readableDatabase = getReadableDatabase();

            String query = "SELECT *" +
                    " FROM " + sqliteTables +
                    " WHERE prodId = "+ id+ ";";

            cursor = readableDatabase.rawQuery(query, null);

            if (cursor != null) {
                cursor.moveToFirst();
                int prodId = cursor.getInt(cursor.getColumnIndex("prodId"));
                String description = cursor.getString(cursor.getColumnIndex("description"));
                int small = cursor.getInt(cursor.getColumnIndex("small"));
                int medium = cursor.getInt(cursor.getColumnIndex("medium"));
                int large = cursor.getInt(cursor.getColumnIndex("large"));
                int xlarge = cursor.getInt(cursor.getColumnIndex("xlarge"));

                return new Product(prodId, description, small, medium, large, xlarge);
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if(cursor != null)
                cursor.close();
        }

        return null;
    }

    public Product getProductCollege(int id){
        Cursor cursor = null;
        String sqliteTables = "products_collegegreen";
        try {
            SQLiteDatabase readableDatabase = getReadableDatabase();

            String query = "SELECT *" +
                    " FROM " + sqliteTables +
                    " WHERE prodId = "+ id+ ";";

            cursor = readableDatabase.rawQuery(query, null);

            if (cursor != null) {
                cursor.moveToFirst();
                int prodId = cursor.getInt(cursor.getColumnIndex("prodId"));
                String description = cursor.getString(cursor.getColumnIndex("description"));
                int small = cursor.getInt(cursor.getColumnIndex("small"));
                int medium = cursor.getInt(cursor.getColumnIndex("medium"));
                int large = cursor.getInt(cursor.getColumnIndex("large"));
                int xlarge = cursor.getInt(cursor.getColumnIndex("xlarge"));

                return new Product(prodId, description, small, medium, large, xlarge);
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if(cursor != null)
                cursor.close();
        }

        return null;
    }
}


