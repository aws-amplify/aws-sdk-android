/**
 * Copyright 2015-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.mobileconnectors.s3.transferutility;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

class TransferDatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "awss3transfertable.db";
    private static final int DATABASE_VERSION = 5;

    private int version;

    public TransferDatabaseHelper(Context context) {
        this(context, DATABASE_VERSION);
    }

    public TransferDatabaseHelper(Context context, int version) {
        super(context, DATABASE_NAME, null, version);
        this.version = version;
    }

    @Override
    public void onCreate(SQLiteDatabase database) {
        TransferTable.onCreate(database, version);
    }

    @Override
    public void onUpgrade(SQLiteDatabase database, int oldVersion, int newVersion) {
        TransferTable.onUpgrade(database, oldVersion, newVersion);
    }

}
