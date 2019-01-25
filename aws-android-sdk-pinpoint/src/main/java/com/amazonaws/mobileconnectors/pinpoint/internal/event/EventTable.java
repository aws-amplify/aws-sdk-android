/**
 * Copyright 2016-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.mobileconnectors.pinpoint.internal.event;

import android.database.sqlite.SQLiteDatabase;

public class EventTable {

    /**
     * Database table name
     */
    public static final String TABLE_EVENT = "pinpointevent";
    /**
     * A unique id of the pinpoint event
     */
    public static final String COLUMN_ID = "event_id";
    public static final String COLUMN_JSON = "event_json";
    public static final String COLUMN_SIZE = "event_size";
    /*
     * Database creation SQL statement
     */
    private static final String DATABASE_CREATE =
        "create table if not exists " + TABLE_EVENT + "(" + COLUMN_ID + " integer primary key autoincrement, " + COLUMN_SIZE
        + " INTEGER NOT NULL," + COLUMN_JSON + " TEXT NOT NULL" + ");";

    /**
     * Creates the database.
     *
     * @param database An SQLiteDatabase instance.
     */
    public static void onCreate(final SQLiteDatabase database, final int version) {
        database.execSQL(DATABASE_CREATE);
        onUpgrade(database, 1, version);
    }

    /**
     * Upgrades the database.
     *
     * @param database   An SQLiteDatabase instance.
     * @param oldVersion The old version of the database.
     * @param newVersion The new version of the database.
     */
    public static void onUpgrade(final SQLiteDatabase database, final int oldVersion, final int newVersion) {

    }

    public static enum COLUMN_INDEX {
        ID(0), SIZE(1), JSON(2);

        private final int value;

        private COLUMN_INDEX(final int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

}
