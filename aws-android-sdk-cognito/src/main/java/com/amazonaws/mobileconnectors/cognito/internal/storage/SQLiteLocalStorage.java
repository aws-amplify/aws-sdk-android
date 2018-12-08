/**
 * Copyright 2013-2018 Amazon.com, 
 * Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Amazon Software License (the "License"). 
 * You may not use this file except in compliance with the 
 * License. A copy of the License is located at
 * 
 *     http://aws.amazon.com/asl/
 * 
 * or in the "license" file accompanying this file. This file is 
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR 
 * CONDITIONS OF ANY KIND, express or implied. See the License 
 * for the specific language governing permissions and 
 * limitations under the License.
 */

package com.amazonaws.mobileconnectors.cognito.internal.storage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.amazonaws.mobileconnectors.cognito.Dataset;
import com.amazonaws.mobileconnectors.cognito.DatasetMetadata;
import com.amazonaws.mobileconnectors.cognito.Record;
import com.amazonaws.mobileconnectors.cognito.exceptions.DataStorageException;
import com.amazonaws.mobileconnectors.cognito.internal.util.DatasetUtils;
import com.amazonaws.mobileconnectors.cognito.internal.util.StringUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

/**
 * An SQLite implementation of {@link LocalStorage}. Datasets are stored in a
 * SQLite database. There are two tables: 'datasets' table stores metadata of a
 * dataset; 'records' stores records of a dataset.
 * @deprecated The Amazon Cognito Sync SDK for Android is deprecated as of release 2.9.0. Please use the AWS AppSync SDK for Android along with AWS AppSync service instead.
 */
@Deprecated
public class SQLiteLocalStorage implements LocalStorage {

    private static final String TAG = "SQLiteLocalStorage";

    /**
     * Name of the datasets table. This table stores metadata of a dataset.
     */
    static final String TABLE_DATASETS = "datasets";
    /**
     * Name of the records table. The table keeps a local copy of dataset
     * records.
     */
    static final String TABLE_RECORDS = "records";

    /**
     * A holder for the columns in datasets table.
     */
    static class DatasetColumns {
        static final String IDENTITY_ID = "identity_id";
        static final String DATASET_NAME = "dataset_name";
        static final String CREATION_TIMESTAMP = "creation_timestamp";
        static final String LAST_MODIFIED_TIMESTAMP = "last_modified_timestamp";
        static final String LAST_MODIFIED_BY = "last_modified_by";
        static final String STORAGE_SIZE_BYTES = "storage_size_bytes";
        static final String RECORD_COUNT = "record_count";
        static final String LAST_SYNC_COUNT = "last_sync_count";
        static final String LAST_SYNC_TIMESTAMP = "last_sync_timestamp";
        static final String LAST_SYNC_RESULT = "last_sync_result";

        /**
         * Shortcut for all columns.
         */
        static final String[] ALL = new String[] {
                IDENTITY_ID, DATASET_NAME,
                CREATION_TIMESTAMP, LAST_MODIFIED_TIMESTAMP, LAST_MODIFIED_BY,
                STORAGE_SIZE_BYTES, RECORD_COUNT,
                LAST_SYNC_COUNT, LAST_SYNC_TIMESTAMP, LAST_SYNC_RESULT,
        };
    }

    /**
     * A holder for the columns in records table.
     */
    static class RecordColumns {
        static final String IDENTITY_ID = "identity_id";
        static final String DATASET_NAME = "dataset_name";
        static final String KEY = "key";
        static final String VALUE = "value";
        static final String SYNC_COUNT = "sync_count";
        static final String LAST_MODIFIED_TIMESTAMP = "last_modified_timestamp";
        static final String LAST_MODIFIED_BY = "last_modified_by";
        static final String DEVICE_LAST_MODIFIED_TIMESTAMP = "device_last_modified_timestamp";
        static final String MODIFIED = "modified";

        /**
         * Shortcut for all columns.
         */
        static final String[] ALL = new String[] {
                IDENTITY_ID, DATASET_NAME, KEY, VALUE, SYNC_COUNT, LAST_MODIFIED_TIMESTAMP,
                LAST_MODIFIED_BY, DEVICE_LAST_MODIFIED_TIMESTAMP, MODIFIED
        };
    }

    /**
     * This helper creates two tables per identity id: one to save the meta data
     * of a dataset such as last server sync count and its status; the other to
     * save a local copy of dataset.
     */
    private class DatabaseHelper extends SQLiteOpenHelper {

        private static final int DB_VERSION = 2;

        public DatabaseHelper(Context context, String cognitoId) {
            super(context.getApplicationContext(), cognitoId, null, DB_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            // create datasets table
            db.execSQL("CREATE TABLE " + TABLE_DATASETS + "("
                    + DatasetColumns.IDENTITY_ID + " TEXT NOT NULL,"
                    + DatasetColumns.DATASET_NAME + " TEXT NOT NULL,"
                    + DatasetColumns.CREATION_TIMESTAMP + " INTEGER DEFAULT 0,"
                    + DatasetColumns.LAST_MODIFIED_TIMESTAMP + " INTEGER DEFAULT 0,"
                    + DatasetColumns.LAST_MODIFIED_BY + " TEXT,"
                    + DatasetColumns.STORAGE_SIZE_BYTES + " INTEGER DEFAULT 0,"
                    + DatasetColumns.RECORD_COUNT + " INTEGER DEFAULT 0,"
                    + DatasetColumns.LAST_SYNC_COUNT + " INTEGER NOT NULL DEFAULT 0,"
                    + DatasetColumns.LAST_SYNC_TIMESTAMP + " INTEGER DEFAULT 0,"
                    + DatasetColumns.LAST_SYNC_RESULT + " TEXT,"
                    + "UNIQUE (" + DatasetColumns.IDENTITY_ID + ", "
                    + DatasetColumns.DATASET_NAME + ")"
                    + ")");
            // create records table
            db.execSQL("CREATE TABLE " + TABLE_RECORDS + "("
                    + RecordColumns.IDENTITY_ID + " TEXT NOT NULL,"
                    + RecordColumns.DATASET_NAME + " TEXT NOT NULL,"
                    + RecordColumns.KEY + " TEXT NOT NULL,"
                    + RecordColumns.VALUE + " TEXT,"
                    + RecordColumns.SYNC_COUNT + " INTEGER NOT NULL DEFAULT 0,"
                    + RecordColumns.LAST_MODIFIED_TIMESTAMP + " INTEGER DEFAULT 0,"
                    + RecordColumns.LAST_MODIFIED_BY + " TEXT,"
                    + RecordColumns.DEVICE_LAST_MODIFIED_TIMESTAMP + " INTEGER DEFAULT 0,"
                    + RecordColumns.MODIFIED + " INTEGER NOT NULL DEFAULT 1,"
                    + "UNIQUE (" + RecordColumns.IDENTITY_ID + ", " + RecordColumns.DATASET_NAME
                    + ", " + RecordColumns.KEY + ")"
                    + ")");
        }

        /**
         * Upgrading database will wipe all data. Any changes that haven't been
         * synced will be lost.
         */
        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            Log.w(TAG, "Upgrading database; wiping all data");
            db.execSQL("DROP TABLE IF EXISTS " + TABLE_DATASETS);
            db.execSQL("DROP TABLE IF EXISTS " + TABLE_RECORDS);
            onCreate(db);
        }
    }

    /**
     * A database helper.
     */
    private final DatabaseHelper helper;

    /**
     * Creates a {@link SQLiteLocalStorage} object.
     * 
     * @param context a context of the app
     * @param databaseName name of the database
     */
    public SQLiteLocalStorage(Context context, String databaseName) {
        helper = new DatabaseHelper(context, databaseName);
    }

    /**
     * Creates a new {@link Dataset}. Stores its information in datasets table.
     * Nothing will happen if a dataset with the same name exists. This should
     * be called before any operation related to this dataset name is performed.
     * Otherwise this dataset won't be visible in listDatasets and will result
     * in dangled records.
     * 
     * @param identityId identity id
     * @param datasetName dataset name
     */
    public void createDataset(String identityId, String datasetName) {
        SQLiteDatabase db = helper.getWritableDatabase();
        db.beginTransaction();
        try {
            // check if the dataset exists or not
            DatasetMetadata metadata = getMetadataInternal(db, identityId, datasetName);
            if (metadata == null) {
                // add a new entry if it doesn't exist
                ContentValues values = new ContentValues();
                values.put(DatasetColumns.IDENTITY_ID, identityId);
                values.put(DatasetColumns.DATASET_NAME, datasetName);
                values.put(DatasetColumns.CREATION_TIMESTAMP,
                        String.valueOf(new Date().getTime()));
                values.put(DatasetColumns.LAST_MODIFIED_TIMESTAMP,
                        String.valueOf(new Date().getTime()));
                // use default values for other fields
                long row = db.insert(TABLE_DATASETS, null, values);
                if (row == -1) {
                    Log.e(TAG, String.format("couldn't create dataset %s",
                            datasetName));
                }
            }
            db.setTransactionSuccessful();
        } finally {
            db.endTransaction();
        }
    }

    @Override
    public String getValue(String identityId, String datasetName, String key) {
        Record record = getRecord(identityId, datasetName, key);
        if (record == null) {
            return null;
        } else {
            return record.getValue();
        }
    }

    @Override
    public void putValue(String identityId, String datasetName, String key, String value) {
        SQLiteDatabase db = helper.getWritableDatabase();
        boolean result = putValueInternal(db, identityId, datasetName, key, value);
        if (!result) {
            Log.e(TAG, String.format("failed to put record [%s: %s] into dataset %s",
                    key, value, datasetName));
        } else {
            updateLastModifiedTimestamp(db, identityId, datasetName);
        }
    }

    @Override
    public Map<String, String> getValueMap(String identityId, String datasetName) {
        Map<String, String> values = new HashMap<String, String>();
        List<Record> records = getRecords(identityId, datasetName);
        for (Record record : records) {
            if (!record.isDeleted()) {
                values.put(record.getKey(), record.getValue());
            }
        }
        return values;
    }

    @Override
    public void putAllValues(String identityId, String datasetName, Map<String, String> values) {
        SQLiteDatabase db = helper.getWritableDatabase();
        db.beginTransaction();
        try {
            for (Map.Entry<String, String> entry : values.entrySet()) {
                putValueInternal(db, identityId, datasetName, entry.getKey(), entry.getValue());
            }
            updateLastModifiedTimestamp(db, identityId, datasetName);
            db.setTransactionSuccessful();
        } finally {
            db.endTransaction();
        }
    }

    /**
     * Puts key value into database. If the value is the same as the cached
     * value, nothing will be updated and true is returned.
     * 
     * @param db sqlite database handler
     * @param datasetName dataset name
     * @param key key of record
     * @param value value of record
     * @return true if put successfully, false otherwise
     */
    boolean putValueInternal(SQLiteDatabase db, String identityId, String datasetName,
            String key, String value) {
        Record record = getRecord(identityId, datasetName, key);
        // compares value before putting it in database. If yes, return true.
        if (record != null && StringUtils.equals(record.getValue(), value)) {
            return true;
        }

        ContentValues values = new ContentValues();
        values.put(RecordColumns.IDENTITY_ID, identityId);
        values.put(RecordColumns.DATASET_NAME, datasetName);
        values.put(RecordColumns.KEY, key);
        values.put(RecordColumns.VALUE, value);
        values.put(RecordColumns.MODIFIED, true);
        values.put(RecordColumns.SYNC_COUNT, record == null ? 0 : record.getSyncCount());
        values.put(RecordColumns.DEVICE_LAST_MODIFIED_TIMESTAMP,
                String.valueOf(new Date().getTime()));

        if (record == null) {
            return db.insert(TABLE_RECORDS, null, values) != -1;
        } else {
            return db.update(TABLE_RECORDS, values,
                    RecordColumns.IDENTITY_ID + " = ? AND " + RecordColumns.DATASET_NAME
                            + " = ? AND " + RecordColumns.KEY + " = ?",
                    new String[] {
                            identityId, datasetName, key
                    }) == 1;
        }
    }
    
    @Override
    public List<DatasetMetadata> getDatasets(String identityId) {
        List<DatasetMetadata> datasets = new ArrayList<DatasetMetadata>();

        SQLiteDatabase db = helper.getWritableDatabase();
        Cursor c = db.query(TABLE_DATASETS, DatasetColumns.ALL,
                DatasetColumns.IDENTITY_ID + " = ?",
                new String[] {
                    identityId
                }, null, null, null);
        while (c.moveToNext()) {
            datasets.add(cursorToDatasetMetadata(c));
        }
        c.close();

        return datasets;
    }

    @Override
    public DatasetMetadata getDatasetMetadata(String identityId, String datasetName)
            throws DataStorageException {
        DatasetMetadata dataset = null;

        SQLiteDatabase db = helper.getWritableDatabase();
        Cursor c = db.query(TABLE_DATASETS, DatasetColumns.ALL,
                DatasetColumns.IDENTITY_ID + " = ? AND " + DatasetColumns.DATASET_NAME + " = ?",
                new String[] {
                        identityId, datasetName
                }, null, null, null);
        if (c.moveToFirst()) {
            dataset = cursorToDatasetMetadata(c);
        }
        c.close();

        return dataset;
    }

    DatasetMetadata cursorToDatasetMetadata(Cursor c) {
        String datasetName = c.getString(c.getColumnIndex(DatasetColumns.DATASET_NAME));
        return new DatasetMetadata.Builder(datasetName)
                .creationDate(new Date(c.getLong(
                        c.getColumnIndex(DatasetColumns.CREATION_TIMESTAMP))))
                .lastModifiedDate(new Date(c.getLong(
                        c.getColumnIndex(DatasetColumns.LAST_MODIFIED_TIMESTAMP))))
                .lastModifiedBy(c.getString(c.getColumnIndex(DatasetColumns.LAST_MODIFIED_BY)))
                .storageSizeBytes(c.getLong(c.getColumnIndex(DatasetColumns.STORAGE_SIZE_BYTES)))
                .recordCount(c.getLong(c.getColumnIndex(DatasetColumns.RECORD_COUNT)))
                .build();
    }

    @Override
    public Record getRecord(String identityId, String datasetName, String key) {
        Record record = null;

        SQLiteDatabase db = helper.getWritableDatabase();
        Cursor c = db.query(TABLE_RECORDS, RecordColumns.ALL,
                RecordColumns.IDENTITY_ID + " = ? AND "
                        + RecordColumns.DATASET_NAME + " = ? AND "
                        + RecordColumns.KEY + " = ?",
                new String[] {
                        identityId, datasetName, key
                }, null, null, null);
        if (c.moveToFirst()) {
            record = cursorToRecord(c);
        }
        c.close();

        return record;
    }

    @Override
    public List<Record> getRecords(String identityId, String datasetName) {
        List<Record> records = new ArrayList<Record>();

        SQLiteDatabase db = helper.getWritableDatabase();
        Cursor c = db.query(TABLE_RECORDS, RecordColumns.ALL,
                RecordColumns.IDENTITY_ID + " = ? AND "
                        + RecordColumns.DATASET_NAME + " = ?",
                new String[] {
                        identityId, datasetName
                }, null, null, null);
        while (c.moveToNext()) {
            records.add(cursorToRecord(c));
        }
        c.close();

        return records;
    }

    /**
     * Converts a Cursor object into a Record object. This could potentially
     * throws exception if the stored record has bogus data that fails the
     * constructor.
     * 
     * @param c a Cursor object
     * @return a Record object.
     */
    Record cursorToRecord(Cursor c) {
        return new Record.Builder(c.getString(c.getColumnIndex(RecordColumns.KEY)))
                .value(c.getString(c.getColumnIndex(RecordColumns.VALUE)))
                .syncCount(c.getLong(c.getColumnIndex(RecordColumns.SYNC_COUNT)))
                .deviceLastModifiedDate(
                        new Date(c.getLong(c
                                .getColumnIndex(RecordColumns.DEVICE_LAST_MODIFIED_TIMESTAMP))))
                .lastModifiedDate(
                        new Date(c.getLong(c.getColumnIndex(RecordColumns.LAST_MODIFIED_TIMESTAMP))))
                .lastModifiedBy(c.getString(c.getColumnIndex(RecordColumns.LAST_MODIFIED_BY)))
                .modified(c.getInt(c.getColumnIndex(RecordColumns.MODIFIED)) == 1)
                .build();
    }

    @Override
    public void putRecords(String identityId, String datasetName, List<Record> records) {
        SQLiteDatabase db = helper.getWritableDatabase();
        db.beginTransaction();
        try {
            for (Record record : records) {
                updateOrInsertRecord(db, identityId, datasetName, record);
            }

            db.setTransactionSuccessful();
        } finally {
            db.endTransaction();
        }
    }
    
    @Override
    public void conditionallyPutRecords(String identityId, String datasetName, List<Record> records, 
            List<Record> localRecords) {
        // Build up an easy way to check the records from the snapshot of the db changes taken mid sync
        Map<String, Record> localRecordMap = new HashMap<String, Record>();
        for(Record record : localRecords){
            localRecordMap.put(record.getKey(), record);
        }
        SQLiteDatabase db = helper.getWritableDatabase();
        db.beginTransaction();
        try {
            for (Record record : records) {
                /*
                * Grab an instance of the record from the local store with the remote change's 
                * key and the snapshot version.
                * 1) If both are null the remote change is new and we should save. 
                * 2) If both exist but the values and sync counts have changed, 
                *    it has changed locally and we shouldn't overwrite with the remote changes, 
                *    which will still exist in remote. 
                * 3) If both exist and the values have not changed, we should save the remote change.
                * 4) If the current check exists but it wasn't in the snapshot, we should save.
                */
                Record databaseRecord = getRecord(identityId, datasetName, record.getKey());
                Record oldDatabaseRecord = localRecordMap.get(record.getKey());

                if (databaseRecord != null && oldDatabaseRecord != null
                        && (!StringUtils.equals(databaseRecord.getValue(), oldDatabaseRecord.getValue())
                        || databaseRecord.getSyncCount() != oldDatabaseRecord.getSyncCount()
                        || !StringUtils.equals(databaseRecord.getLastModifiedBy(), oldDatabaseRecord.getLastModifiedBy()))) {
                    continue;
                }
                updateOrInsertRecord(db, identityId, datasetName, record);
            }

            db.setTransactionSuccessful();
        } finally {
            db.endTransaction();
        }
    }

    @Override
    public void deleteDataset(String identityId, String datasetName) {
        // drop dataset table, and update metadata accordingly
        SQLiteDatabase db = helper.getWritableDatabase();
        db.beginTransaction();
        try {
            int rows = db.delete(TABLE_RECORDS,
                    RecordColumns.IDENTITY_ID + " = ? AND " + RecordColumns.DATASET_NAME + " = ?",
                    new String[] {
                            identityId, datasetName
                    });
            Log.i(TAG, String.format("%d records were deleted from dataset %s",
                    rows, datasetName));

            ContentValues values = new ContentValues();
            values.put(DatasetColumns.LAST_MODIFIED_TIMESTAMP, System.currentTimeMillis());
            values.put(DatasetColumns.LAST_SYNC_COUNT, String.valueOf(-1));
            rows = db.update(TABLE_DATASETS, values,
                    DatasetColumns.IDENTITY_ID + " = ? AND "
                            + DatasetColumns.DATASET_NAME + " = ?",
                    new String[] {
                            identityId, datasetName
                    });
            if (rows != 1) {
                Log.e(TAG, String.format("couldn't mark dataset %s deleted",
                        datasetName));
            } else {
                db.setTransactionSuccessful();
            }
        } finally {
            db.endTransaction();
        }

    }

    @Override
    public void purgeDataset(String identityId, String datasetName) {
        deleteDataset(identityId, datasetName);
        SQLiteDatabase db = helper.getWritableDatabase();
        int rows = db.delete(TABLE_DATASETS,
                DatasetColumns.IDENTITY_ID + " = ? AND " + DatasetColumns.DATASET_NAME + " = ?",
                new String[] {
                        identityId, datasetName
                });
        if (rows != 1) {
            Log.e(TAG, String.format("failed to purge dataset %s", datasetName));
        }
    }

    @Override
    public long getLastSyncCount(String identityId, String datasetName) {
        long lastSyncCount = 0;

        SQLiteDatabase db = helper.getWritableDatabase();
        Cursor c = db.query(TABLE_DATASETS, DatasetColumns.ALL,
                DatasetColumns.IDENTITY_ID + " = ? AND " + DatasetColumns.DATASET_NAME + " = ?",
                new String[] {
                        identityId, datasetName
                }, null, null, null);
        if (c.moveToFirst()) {
            lastSyncCount = c.getInt(c.getColumnIndex(DatasetColumns.LAST_SYNC_COUNT));
        } else {
            Log.w(TAG, String.format("couldn't find %s in %s table",
                    datasetName, TABLE_DATASETS));
        }
        c.close();

        return lastSyncCount;
    }

    @Override
    public List<Record> getModifiedRecords(String identityId, String datasetName) {
        List<Record> records = new ArrayList<Record>();

        SQLiteDatabase db = helper.getWritableDatabase();
        Cursor c = db.query(TABLE_RECORDS, RecordColumns.ALL,
                RecordColumns.IDENTITY_ID + " = ? AND " + RecordColumns.DATASET_NAME + " = ? AND "
                        + RecordColumns.MODIFIED + " = ?",
                new String[] {
                        identityId, datasetName,
                        String.valueOf(1)
                }, null, null, null);
        while (c.moveToNext()) {
            records.add(cursorToRecord(c));
        }
        c.close();

        return records;
    }

    /**
     * Close the local storage. Any operation called after this will fail.
     */
    public void close() {
        helper.close();
    }

    @Override
    public void updateLastSyncCount(String identityId, String datasetName, long lastSyncCount) {
        SQLiteDatabase db = helper.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(DatasetColumns.LAST_SYNC_COUNT, lastSyncCount);
        values.put(DatasetColumns.LAST_SYNC_TIMESTAMP, System.currentTimeMillis());
        int rows = db.update(TABLE_DATASETS, values,
                DatasetColumns.IDENTITY_ID + " = ? AND " + DatasetColumns.DATASET_NAME + " = ?",
                new String[] {
                        identityId, datasetName
                });
        if (rows != 1) {
            Log.e(TAG, String.format("failed to update last sync count of dataset %s",
                    datasetName));
        }
    }

    @Override
    public void wipeData() {
        SQLiteDatabase db = helper.getWritableDatabase();
        db.beginTransaction();
        try {
            db.execSQL("DELETE FROM " + TABLE_DATASETS);
            db.execSQL("DELETE FROM " + TABLE_RECORDS);
            db.setTransactionSuccessful();
        } finally {
            db.endTransaction();
        }
    }

    /**
     * Updates last modified timestamp of a record. It's usually updated when a
     * record value is set.
     * 
     * @param datasetName dataset name
     */
    void updateLastModifiedTimestamp(SQLiteDatabase db, String identityId, String datasetName) {
        ContentValues values = new ContentValues();
        values.put(DatasetColumns.LAST_MODIFIED_TIMESTAMP, System.currentTimeMillis());
        int rows = db.update(TABLE_DATASETS, values,
                DatasetColumns.IDENTITY_ID + " = ? AND " + DatasetColumns.DATASET_NAME + " = ?",
                new String[] {
                        identityId, datasetName
                });
        if (rows != 1) {
            Log.w(TAG, String.format("failed to update last modified timestamp of dataset %s",
                    datasetName));
        }
    }

    /**
     * Remove a record from database. It doesn't matter whether the record has
     * local change.
     * 
     * @param db SQLiteDatabase handler
     * @param datasetName dataset name
     * @param record the record to be removed
     */
    void removeRecord(SQLiteDatabase db, String identityId, String datasetName, Record record) {
        int rows = db.delete(TABLE_RECORDS,
                RecordColumns.IDENTITY_ID + " = ? AND " + RecordColumns.DATASET_NAME + " = ? AND "
                        + RecordColumns.KEY + " = ?",
                new String[] {
                        identityId, datasetName, record.getKey()
                });
        if (rows == 0) {
            Log.w(TAG, String.format("failed to delete record %s from dataset %s",
                    record.getKey(), datasetName));
        }
    }
    
    /**
     * Updates dataset with the given record and clears the modified flag. This
     * is used to store remote change into local.
     * 
     * @param db SQLiteDatabase handler
     * @param identityId identity id of the dataset
     * @param datasetName dataset name
     * @param record the record to be updated
     */
    void updateOrInsertRecord(SQLiteDatabase db, String identityId, String datasetName,
            Record record) {
        ContentValues values = new ContentValues();
        values.put(RecordColumns.IDENTITY_ID, identityId);
        values.put(RecordColumns.DATASET_NAME, datasetName);
        values.put(RecordColumns.KEY, record.getKey());
        values.put(RecordColumns.VALUE, record.getValue());
        values.put(RecordColumns.SYNC_COUNT, record.getSyncCount());
        values.put(RecordColumns.MODIFIED, record.isModified());
        values.put(RecordColumns.LAST_MODIFIED_BY, record.getLastModifiedBy());
        if(record.getLastModifiedDate() != null){
            values.put(RecordColumns.LAST_MODIFIED_TIMESTAMP, 
                    String.valueOf(record.getLastModifiedDate().getTime()));
        }
        if(record.getDeviceLastModifiedDate() != null){
            values.put(RecordColumns.DEVICE_LAST_MODIFIED_TIMESTAMP, 
                    String.valueOf(record.getDeviceLastModifiedDate().getTime()));
        }
        long row = db.replace(TABLE_RECORDS, null, values);
        if (row == -1) {
            Log.e(TAG, String.format("failed to store record [%s: %s] into dataset %s",
                    record.getKey(), record.getValue(), datasetName));
        }
    }
    
    /**
     * Checks the metadata of all datasets for one identity id and another to 
     * see if any have the same name.
     *
     * @param oldIdentityId the old identity id, which the user is changing from
     * @param newIdentityId the new identity id, which the user is changing to
     * @return a set of all of the non unique names
     */
    Set<String> getCommonDatasetNames(String oldIdentityId, String newIdentityId){
        Set<String> newNameSet = new HashSet<String>();
        Set<String> oldNameSet = new HashSet<String>();
        if(oldIdentityId != null && newIdentityId != null){
            List<DatasetMetadata> newDatasets = getDatasets(newIdentityId);
            List<DatasetMetadata> oldDatasets = getDatasets(oldIdentityId);
            for(DatasetMetadata oldMetaData : oldDatasets){
                oldNameSet.add(oldMetaData.getDatasetName());
            }
            for(DatasetMetadata newMetaData : newDatasets){
                newNameSet.add(newMetaData.getDatasetName());
            }
            oldNameSet.retainAll(newNameSet);
        }
        return oldNameSet;
    }

    @Override
    public synchronized void changeIdentityId(String oldIdentityId, String newIdentityId) {
        SQLiteDatabase db = helper.getWritableDatabase();
        db.beginTransaction();
        try {
            // if oldIdentityId is unknown, aka the dataset is created prior to
            // having a cognito id, just reparent datasets from unknown to
            // newIdentityId
            if (DatasetUtils.UNKNOWN_IDENTITY_ID.equals(oldIdentityId)) {
                Set<String> commonDatasetNames = getCommonDatasetNames(oldIdentityId, newIdentityId);
                // append UNKNOWN to the name of all non unique datasets
                if(commonDatasetNames.size() > 0){
                    for(String oldDatasetName : commonDatasetNames){
                        db.execSQL("UPDATE " + TABLE_DATASETS
                                + " SET "
                                + DatasetColumns.DATASET_NAME + " = '" + oldDatasetName + "." + oldIdentityId + "'"
                                + " WHERE " + DatasetColumns.IDENTITY_ID + " = ?"
                                + " AND " + DatasetColumns.DATASET_NAME + " = ?",
                                new String[] {
                                    oldIdentityId, 
                                    oldDatasetName
                                });
                        
                        db.execSQL("UPDATE " + TABLE_RECORDS
                                + " SET "
                                + RecordColumns.DATASET_NAME + " = '" + oldDatasetName + "." + oldIdentityId + "'"
                                + " WHERE " + RecordColumns.IDENTITY_ID + " = ?"
                                + " AND " + RecordColumns.DATASET_NAME + " = ?",
                                new String[] {
                                    oldIdentityId,
                                    oldDatasetName
                                });
                    }
                }
                
                // datasets table
                db.execSQL("UPDATE " + TABLE_DATASETS
                        + " SET "
                        + DatasetColumns.IDENTITY_ID + " = '" + newIdentityId + "'"
                        + " WHERE " + DatasetColumns.IDENTITY_ID + " = ?",
                        new String[] {
                            oldIdentityId
                        });
                
                // records table
                db.execSQL("UPDATE " + TABLE_RECORDS
                        + " SET "
                        + RecordColumns.IDENTITY_ID + " = '" + newIdentityId + "'"
                        + " WHERE " + RecordColumns.IDENTITY_ID + " = ?",
                        new String[] {
                            oldIdentityId
                        });
            } else {

                // 1. copy oldIdentityId/dataset to newIdentityId/dataset
                // datasets table
                db.execSQL("INSERT INTO " + TABLE_DATASETS + "("
                        + DatasetColumns.IDENTITY_ID + ","
                        + DatasetColumns.DATASET_NAME + ","
                        + DatasetColumns.CREATION_TIMESTAMP + ","
                        + DatasetColumns.STORAGE_SIZE_BYTES + ","
                        + DatasetColumns.RECORD_COUNT
                        // last sync count is reset to default 0
                        + ")"
                        + " SELECT "
                        + "'" + newIdentityId + "'," // assign new owner
                        + DatasetColumns.DATASET_NAME + ","
                        + DatasetColumns.CREATION_TIMESTAMP + ","
                        + DatasetColumns.STORAGE_SIZE_BYTES + ","
                        + DatasetColumns.RECORD_COUNT
                        + " FROM " + TABLE_DATASETS
                        + " WHERE " + DatasetColumns.IDENTITY_ID + " = ?",
                        new String[] {
                            oldIdentityId
                        });
                // records table
                db.execSQL("INSERT INTO " + TABLE_RECORDS + "("
                        + RecordColumns.IDENTITY_ID + ","
                        + RecordColumns.DATASET_NAME + ","
                        + RecordColumns.KEY + ","
                        + RecordColumns.VALUE + ","
                        // sync count is resset to default 0
                        + RecordColumns.LAST_MODIFIED_TIMESTAMP + ","
                        + RecordColumns.LAST_MODIFIED_BY + ","
                        + RecordColumns.DEVICE_LAST_MODIFIED_TIMESTAMP
                        // modified is reset to default 1 (dirty)
                        + ")"
                        + " SELECT "
                        + "'" + newIdentityId + "'," // assign new owner
                        + RecordColumns.DATASET_NAME + ","
                        + RecordColumns.KEY + ","
                        + RecordColumns.VALUE + ","
                        + RecordColumns.LAST_MODIFIED_TIMESTAMP + ","
                        + RecordColumns.LAST_MODIFIED_BY + ","
                        + RecordColumns.DEVICE_LAST_MODIFIED_TIMESTAMP
                        + " FROM " + TABLE_RECORDS
                        + " WHERE " + RecordColumns.IDENTITY_ID + " = ?",
                        new String[] {
                            oldIdentityId
                        });

                // 2. rename oldIdentityId/dataset to
                // newIdentityId/dataset.oldIdentityId
                // datasets table
                db.execSQL("UPDATE " + TABLE_DATASETS
                        + " SET "
                        + DatasetColumns.IDENTITY_ID + " = '" + newIdentityId + "', "
                        + DatasetColumns.DATASET_NAME + " = "
                        + DatasetColumns.DATASET_NAME + " || '." + oldIdentityId + "'"
                        + " WHERE " + DatasetColumns.IDENTITY_ID + " = ?",
                        new String[] {
                            oldIdentityId
                        });

                // records table
                db.execSQL("UPDATE " + TABLE_RECORDS
                        + " SET "
                        + RecordColumns.IDENTITY_ID + " = '" + newIdentityId + "', "
                        + RecordColumns.DATASET_NAME + " = "
                        + RecordColumns.DATASET_NAME + " || '." + oldIdentityId + "'"
                        + " WHERE " + RecordColumns.IDENTITY_ID + " = ?",
                        new String[] {
                            oldIdentityId
                        });
            }
            db.setTransactionSuccessful();
        } finally {
            db.endTransaction();
        }
    }

    @Override
    public void updateDatasetMetadata(String identityId, List<DatasetMetadata> datasetMetadata) {
        SQLiteDatabase db = helper.getWritableDatabase();
        db.beginTransaction();
        try {
            for (DatasetMetadata metadata : datasetMetadata) {
                if (!updateDatasetMetadataInternal(db, identityId, metadata)) {
                    Log.w(TAG, String.format("couldn't update dataset metadata %s",
                            metadata.getDatasetName()));
                }
            }
            db.setTransactionSuccessful();
        } finally {
            db.endTransaction();
        }
    }

    /**
     * Internal helper function to get dataset metadata
     * 
     * @param db SQLiteDatabase handler
     * @param identityId identity id of the datasets
     * @param datasetName dataset name
     * @return DatasetMetadata if found, or null if not found
     */
    DatasetMetadata getMetadataInternal(SQLiteDatabase db, String identityId, String datasetName) {
        DatasetMetadata metadata = null;

        Cursor c = db.query(TABLE_DATASETS, DatasetColumns.ALL,
                DatasetColumns.IDENTITY_ID + " = ? AND " + DatasetColumns.DATASET_NAME + " = ?",
                new String[] {
                        identityId, datasetName
                }, null, null, null);
        if (c.moveToFirst()) {
            metadata = cursorToDatasetMetadata(c);
        }
        c.close();

        return metadata;
    }

    /**
     * Internal helper function to update one dataset metadata.
     * 
     * @param db SQLiteDatabase handler
     * @param identityId identity id of the datasets
     * @param metadata dataset metadata to update
     * @return true if update successfully, false otherwise
     */
    boolean updateDatasetMetadataInternal(SQLiteDatabase db, String identityId,
            DatasetMetadata metadata) {
        DatasetMetadata local = getMetadataInternal(db, identityId, metadata.getDatasetName());

        ContentValues values = new ContentValues();
        values.put(DatasetColumns.IDENTITY_ID, identityId);
        values.put(DatasetColumns.DATASET_NAME, metadata.getDatasetName());
        values.put(DatasetColumns.CREATION_TIMESTAMP, metadata.getCreationDate().getTime());
        values.put(DatasetColumns.LAST_MODIFIED_TIMESTAMP, metadata.getLastModifiedDate().getTime());
        values.put(DatasetColumns.LAST_MODIFIED_BY, metadata.getLastModifiedBy());
        values.put(DatasetColumns.RECORD_COUNT, metadata.getRecordCount());
        values.put(DatasetColumns.STORAGE_SIZE_BYTES, metadata.getStorageSizeBytes());

        if (local == null) {
            return db.insert(TABLE_DATASETS, null, values) != -1;
        } else {
            return db.update(TABLE_DATASETS, values,
                    DatasetColumns.IDENTITY_ID + " = ? AND "
                            + DatasetColumns.DATASET_NAME + " = ?",
                    new String[] {
                            identityId, metadata.getDatasetName()
                    }) == 1;
        }
    }
}
