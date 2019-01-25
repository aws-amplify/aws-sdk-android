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
    public static final String COLUMN_HEADER_EXPIRE = "header_expire";

    /**
     * If the object requires the requester to pay
     */
    public static final String COLUMN_IS_REQUESTER_PAYS = "is_requester_pays";

    /**
     * User specified content Type
     */
    public static final String COLUMN_HEADER_CONTENT_TYPE = "header_content_type";

    /**
     * User specified content language
     */
    public static final String COLUMN_HEADER_CONTENT_LANGUAGE = "header_content_language";

    /**
     * User specified content disposition
     */
    public static final String COLUMN_HEADER_CONTENT_DISPOSITION = "header_content_disposition";

    /**
     * User specified content encoding
     */
    public static final String COLUMN_HEADER_CONTENT_ENCODING = "header_content_encoding";

    /**
     * User specified cache control
     */
    public static final String COLUMN_HEADER_CACHE_CONTROL = "header_cache_control";

    /**
     * User specified storage class
     */
    public static final String COLUMN_HEADER_STORAGE_CLASS = "header_storage_class";

    /**
     * ============ Below added in 2.2.6 for support for metadata ============
     */

    /**
     * User specified lifecycle configuration expiration time rule id
     */
    public static final String COLUMN_EXPIRATION_TIME_RULE_ID = "expiration_time_rule_id";

    /**
     * User specified lifecycle configuration expiration time rule id
     */
    public static final String COLUMN_HTTP_EXPIRES_DATE = "http_expires_date";

    /**
     * User specified server side encryption algorithm
     */
    public static final String COLUMN_SSE_ALGORITHM = "sse_algorithm";

    /**
     * User specified content MD5
     */
    public static final String COLUMN_CONTENT_MD5 = "content_md5";

    /**
     * Json serialization of user metadata to store with the Object
     */
    public static final String COLUMN_USER_METADATA = "user_metadata";

    /**
     * ============ Below added in 2.2.11 for support for KMS ============
     */

    /**
     * User specified KMS key for server side encryption
     */
    public static final String COLUMN_SSE_KMS_KEY = "kms_key";

    /**
     * Canned ACL of this upload.
     */
    public static final String COLUMN_CANNED_ACL = "canned_acl";

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
    public static void onCreate(SQLiteDatabase database, int version) {
        database.execSQL(DATABASE_CREATE);
        onUpgrade(database, 1, version);
    }

    private static final int TABLE_VERSION_2 = 2;
    private static final int TABLE_VERSION_3 = 3;
    private static final int TABLE_VERSION_4 = 4;
    private static final int TABLE_VERSION_5 = 5;

    /**
     * Upgrades the database.
     *
     * @param database An SQLiteDatabase instance.
     * @param oldVersion The old version of the database.
     * @param newVersion The new version of the database.
     */
    public static void onUpgrade(SQLiteDatabase database, int oldVersion,
            int newVersion) {

        if (oldVersion < TABLE_VERSION_2 && newVersion >= TABLE_VERSION_2) {
            addVersion2Columns(database);
        }
        if (oldVersion < TABLE_VERSION_3 && newVersion >= TABLE_VERSION_3) {
            addVersion3Columns(database);
        }
        if (oldVersion < TABLE_VERSION_4 && newVersion >= TABLE_VERSION_4) {
            addVersion4Columns(database);
        }
        if (oldVersion < TABLE_VERSION_5 && newVersion >= TABLE_VERSION_5) {
            addVersion5Columns(database);
        }
    }

    /**
     * Adds columns that were introduced in version 2 to the database
     */
    private static void addVersion2Columns(SQLiteDatabase database) {
        final String addUserMetadata = "ALTER TABLE " + TABLE_TRANSFER +
                " ADD COLUMN " + COLUMN_USER_METADATA + " text;";
        final String addExpirationTimeRuleId = "ALTER TABLE " + TABLE_TRANSFER +
                " ADD COLUMN " + COLUMN_EXPIRATION_TIME_RULE_ID + " text;";
        final String addHttpExpires = "ALTER TABLE " + TABLE_TRANSFER +
                " ADD COLUMN " + COLUMN_HTTP_EXPIRES_DATE + " text;";
        final String addSSEAlgorithm = "ALTER TABLE " + TABLE_TRANSFER +
                " ADD COLUMN " + COLUMN_SSE_ALGORITHM + " text;";
        final String addContentMD5 = "ALTER TABLE " + TABLE_TRANSFER +
                " ADD COLUMN " + COLUMN_CONTENT_MD5 + " text;";
        database.execSQL(addUserMetadata);
        database.execSQL(addExpirationTimeRuleId);
        database.execSQL(addHttpExpires);
        database.execSQL(addSSEAlgorithm);
        database.execSQL(addContentMD5);
    }

    /**
     * Adds columns that were introduced in version 3 to the database
     */
    private static void addVersion3Columns(SQLiteDatabase database) {
        final String addKMSKey = "ALTER TABLE " + TABLE_TRANSFER +
                " ADD COLUMN " + COLUMN_SSE_KMS_KEY + " text;";
        database.execSQL(addKMSKey);
    }

    /**
     * Adds columns that were introduced in version 4 to the database
     */
    private static void addVersion4Columns(SQLiteDatabase database) {
        final String addCannedAcl = "ALTER TABLE " + TABLE_TRANSFER +
                " ADD COLUMN " + COLUMN_CANNED_ACL + " text;";
        database.execSQL(addCannedAcl);
    }

    /**
     * Adds columns that were introduced in version 5 to the database
     */
    private static void addVersion5Columns(SQLiteDatabase database) {
        final String addStorageClass = "ALTER TABLE " + TABLE_TRANSFER +
                " ADD COLUMN " + COLUMN_HEADER_STORAGE_CLASS + " text;";
        database.execSQL(addStorageClass);
    }
}
