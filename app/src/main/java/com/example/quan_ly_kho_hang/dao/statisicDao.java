package com.example.quan_ly_kho_hang.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.quan_ly_kho_hang.database.dbHelper;
import com.example.quan_ly_kho_hang.model.Product;

import java.util.ArrayList;

public class statisicDao {
    private final dbHelper  dbHelper;

    public statisicDao(Context context) {
        dbHelper = new dbHelper(context);
    }
    public ArrayList<Product> getTop10() {
        ArrayList<Product> list = new ArrayList<>();
        SQLiteDatabase database = dbHelper.getReadableDatabase();
        try {
            Cursor cursor = database.rawQuery("SELECT id, name AS ProductName, quantity, price FROM Product ORDER BY (CAST(quantity AS INTEGER) * CAST(price AS INTEGER)) DESC LIMIT 10", null);
            if (cursor.getCount() > 0) {
                cursor.moveToFirst();
                while (!cursor.isAfterLast()) {
                    Product product = new Product();
                    product.setId(cursor.getInt(cursor.getColumnIndex("id")));
                    product.setName(cursor.getString(cursor.getColumnIndex("ProductName")));
                    product.setQuantity(cursor.getString(cursor.getColumnIndex("quantity")));
                    product.setPrice(cursor.getString(cursor.getColumnIndex("price")));
                    list.add(product);
                    cursor.moveToNext();
                }
            }
            cursor.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            database.close();
        }
        return list;
    }

}
