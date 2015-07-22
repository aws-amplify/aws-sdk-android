/**
 * Copyright 2015-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import android.database.sqlite.SQLiteDatabase;

class TransferTable {

    /**
     * Database table name
     */
    public static final String TABLE_TRANSFER = "awstransfer";

    /**
     * A unique id of the transfer record
     */
    public static final String COLUMN_ID = "_id";

    /**
     * For upload part record only, the transfer id of the main record of the
     * part record.
     */
    public static final String COLUMN_MAIN_UPLOAD_ID = "main_upload_id";

    /**
     * Transfer type, can be whether "upload" or "download"
     */
    public static final String COLUMN_TYPE = "type";

    /**
     * The current state of the transfer, values of all states are in
     * <code>TransferConstants</code>.
     */
    public static final String COLUMN_STATE = "state";

    /**
     * The name of the bucket.
     */
    public static final String COLUMN_BUCKET_NAME = "bucket_name";

    /**
     * A key in the bucket.
     */
    public static final String COLUMN_KEY = "key";

    /**
     * The total bytes to transfer.
     */
    public static final String COLUMN_BYTES_TOTAL = "bytes_total";

    /**
     * The bytes currently transferred.
     */
    public static final String COLUMN_BYTES_CURRENT = "bytes_current";

    /**
     * The path of the file to transfer.
     */
    public static final String COLUMN_FILE = "file";

    /**
     * The bytes offset of the file.
     */
    public static final String COLUMN_FILE_OFFSET = "file_offset";

    /**
     * Whether the transfer is a multi-part transfer.
     */
    public static final String COLUMN_IS_MULTIPART = "is_multipart";

    /**
     * Whether the part is the last part of the file.
     */
    public static final String COLUMN_IS_LAST_PART = "is_last_part";

    /**
     * The number of the part in the transfer.
     */
    public static final String COLUMN_PART_NUM = "part_num";

    /**
     * The multipart upload id.
     */
    public static final String COLUMN_MULTIPART_ID = "multipart_id";

    /**
     * The Etag of the transfer
     */
    public static final String COLUMN_ETAG = "etag";

    /**
     * The range's start index in the file.
     */
    public static final String COLUMN_DATA_RANGE_START = "range_start";

    /**
     * The range's end index in the file.
     */
    public static final String COLUMN_DATA_RANGE_LAST = "range_last";

    /**
     * Whether the transfer is encrypted.
     */
    public static final String COLUMN_IS_ENCRYPTED = "is_encrypted";

    /*
     * the following columns are not used yet
     */
    public static final String COLUMN_SPEED = "speed";
    public static final String COLUMN_VERSION_ID = "version_id";
    public static final String COLUMN_IS_REQUESTER_PAYS = "is_requester_pays";
    public static final String COLUMN_HEADER_CONTENT_TYPE = "header_content_type";
    public static final String COLUMN_HEADER_CONTENT_LANGUAGE = "header_content_language";
    public static final String COLUMN_HEADER_CONTENT_DISPOSITION = "header_content_disposition";
    public static final String COLUMN_HEADER_CONTENT_ENCODING = "header_content_encoding";
    public static final String COLUMN_HEADER_CACHE_CONTROL = "header_cache_control";
    public static final String COLUMN_HEADER_EXPIRE = "header_expire";

    /*
     * Database creation SQL statement
     */
    private static final String DATABASE_CREATE = "create table "
            + TABLE_TRANSFER
            + "("
            + COLUMN_ID + " integer primary key autoincrement, "
            + COLUMN_MAIN_UPLOAD_ID + " integer, "
            + COLUMN_TYPE + " text not null, "
            + COLUMN_STATE + " text not null, "
            + COLUMN_BUCKET_NAME + " text not null, "
            + COLUMN_KEY + " text not null, "
            + COLUMN_VERSION_ID + " text, "
            + COLUMN_BYTES_TOTAL + " bigint, "
            + COLUMN_BYTES_CURRENT + " bigint, "
            + COLUMN_SPEED + " bigint, "
            + COLUMN_IS_REQUESTER_PAYS + " integer, "
            + COLUMN_IS_ENCRYPTED + " integer, "
            + COLUMN_FILE + " text not null, "
            + COLUMN_FILE_OFFSET + " bigint, "
            + COLUMN_IS_MULTIPART + " int, "
            + COLUMN_PART_NUM + " int not null, "
            + COLUMN_IS_LAST_PART + " integer, "
            + COLUMN_MULTIPART_ID + " text, "
            + COLUMN_ETAG + " text, "
            + COLUMN_DATA_RANGE_START + " bigint, "
            + COLUMN_DATA_RANGE_LAST + " bigint, "
            + COLUMN_HEADER_CONTENT_TYPE + " text, "
            + COLUMN_HEADER_CONTENT_LANGUAGE + " text, "
            + COLUMN_HEADER_CONTENT_DISPOSITION + " text, "
            + COLUMN_HEADER_CONTENT_ENCODING + " text, "
            + COLUMN_HEADER_CACHE_CONTROL + " text, "
            + COLUMN_HEADER_EXPIRE + " text"
            + ");";

    /**
     * Creates the database.
     *
     * @param database An SQLiteDatabase instance.
     */
    public static void onCreate(SQLiteDatabase database) {
        database.execSQL(DATABASE_CREATE);
    }

    /**
     * Upgrades the database.
     *
     * @param database An SQLiteDatabase instance.
     * @param oldVersion The old version of the database.
     * @param newVersion The new version of the database.
     */
    public static void onUpgrade(SQLiteDatabase database, int oldVersion,
            int newVersion) {
        database.execSQL("drop table if exists " + TABLE_TRANSFER);
        onCreate(database);
    }
}
