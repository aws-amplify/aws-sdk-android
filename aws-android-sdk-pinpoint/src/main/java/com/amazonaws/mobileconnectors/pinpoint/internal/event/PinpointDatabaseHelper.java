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

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class PinpointDatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "awspinpoint.db";
    private static final int DATABASE_VERSION = 1;

    private int version;

    public PinpointDatabaseHelper(final Context context) {
        this(context, DATABASE_VERSION);
    }

    public PinpointDatabaseHelper(final Context context, final int version) {
        super(context, DATABASE_NAME, null, version);
        this.version = version;
    }

    public void onConfigure(final SQLiteDatabase database) {
        database.execSQL("PRAGMA auto_vacuum = FULL");
    }

    /**
     * Creates the database.
     *
     * @param database An SQLiteDatabase instance.
     */
    @Override
    public void onCreate(final SQLiteDatabase database) {
        EventTable.onCreate(database, version);
    }

    /**
     * Upgrades the database.
     *
     * @param database   An SQLiteDatabase instance.
     * @param oldVersion The old version of the database.
     * @param newVersion The new version of the database.
     */
    @Override
    public void onUpgrade(final SQLiteDatabase database, final int oldVersion, final int newVersion) {
        EventTable.onUpgrade(database, oldVersion, newVersion);
    }
}
