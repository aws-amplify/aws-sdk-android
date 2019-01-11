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

import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.text.TextUtils;

import static com.amazonaws.mobileconnectors.pinpoint.internal.event.EventTable.COLUMN_SIZE;
import static com.amazonaws.mobileconnectors.pinpoint.internal.event.EventTable.TABLE_EVENT;

/**
 * Provides methods to access database through which applications can interact with tasks.
 */
public class PinpointDBBase {

    private static final int EVENTS = 10;
    private static final int EVENT_ID = 20;
    private static final String BASE_PATH = "events";
    private final Context context;
    private final Uri contentUri;
    private final UriMatcher uriMatcher;
    private final PinpointDatabaseHelper databaseHelper;
    private long totalSize = -1;

    /**
     * Constructs TransferDBBase with the given Context.
     *
     * @param context A Context instance.
     */
    public PinpointDBBase(final Context context) {
        this.context = context;
        final String mAuthority = context.getApplicationContext()
                                         .getPackageName();
        databaseHelper = new PinpointDatabaseHelper(this.context);
        contentUri = Uri.parse("content://" + mAuthority + "/" + BASE_PATH);
        uriMatcher = new UriMatcher(UriMatcher.NO_MATCH);

        /*
         * The Uri of EVENTS is for all records in the Event table.
         */
        uriMatcher.addURI(mAuthority, BASE_PATH, EVENTS);

        /*
         * The Uri of EVENT_ID is for a single event record.
         */
        uriMatcher.addURI(mAuthority, BASE_PATH + "/#", EVENT_ID);
    }

    /**
     * Closes the database helper.
     */
    public void closeDBHelper() {
        databaseHelper.close();
    }

    /**
     * Gets the Uri for the table.
     *
     * @return The Uri for the table.
     */
    public Uri getContentUri() {
        return contentUri;
    }

    /**
     * Inserts a record to the table.
     *
     * @param uri    The Uri of a table.
     * @param values The values of a record.
     * @return The Uri of the inserted record.
     */
    public Uri insert(final Uri uri, final ContentValues values) {
        final int uriType = uriMatcher.match(uri);
        final SQLiteDatabase db = databaseHelper.getWritableDatabase();
        long id = 0;
        switch (uriType) {
            case EVENTS:
                final long size = getTotalSize();
                id = db.insertOrThrow(TABLE_EVENT, null, values);
                totalSize = size + values.getAsLong(COLUMN_SIZE);
                break;
            default:
                throw new IllegalArgumentException("Unknown URI: " + uri);
        }
        return Uri.parse(BASE_PATH + "/" + id);
    }

    /**
     * Get total size of event records.
     *
     * @return Total size.
     */
    public long getTotalSize() {
        Cursor cursor = null;
        try {
            if (totalSize < 0) {
                cursor = databaseHelper.getReadableDatabase().rawQuery("SELECT SUM(" + COLUMN_SIZE + ") FROM " + TABLE_EVENT, null);
                if (!cursor.moveToNext()) {
                    totalSize = 0;
                } else if (cursor.isNull(0)) {
                    totalSize = 0;
                } else {
                    totalSize = cursor.getLong(0);
                }
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
        return totalSize;
    }

    /**
     * Query records from the database.
     *
     * @param uri           A Uri indicating which part of data to query.
     * @param projection    The projection of columns.
     * @param selection     The "where" clause of sql.
     * @param selectionArgs Strings in the "where" clause.
     * @param sortOrder     Sorting order of the query.
     * @param limit         Limit for query.
     * @return A Cursor pointing to records.
     */
    public Cursor query(final Uri uri, final String[] projection, final String selection, final String[] selectionArgs,
                        final String sortOrder, final String limit) {
        final SQLiteQueryBuilder queryBuilder = new SQLiteQueryBuilder();
        // TODO: currently all methods calling this pass null to projection.
        // In the future we want to update projection to be more specific for
        // performance and must handle that here.
        queryBuilder.setTables(TABLE_EVENT);
        final int uriType = uriMatcher.match(uri);
        switch (uriType) {
            case EVENTS:
                break;
            case EVENT_ID:
                queryBuilder.appendWhere(EventTable.COLUMN_ID + "=" + uri.getLastPathSegment());
                break;
            default:
                throw new IllegalArgumentException("Unknown URI: " + uri);
        }
        final SQLiteDatabase db = databaseHelper.getWritableDatabase();
        final Cursor cursor = queryBuilder.query(db, projection, selection, selectionArgs, null, null, sortOrder, limit);
        return cursor;
    }

    /**
     * Updates records in the table synchronously.
     *
     * @param uri         A Uri of the specific record.
     * @param values      The values to update.
     * @param whereClause The "where" clause of sql.
     * @param whereArgs   Strings in the "where" clause.
     * @return Number of rows updated.
     */
    public synchronized int update(final Uri uri, final ContentValues values, final String whereClause, final String[] whereArgs) {
        final int uriType = uriMatcher.match(uri);
        final SQLiteDatabase db = databaseHelper.getWritableDatabase();
        int rowsUpdated = 0;
        switch (uriType) {
            case EVENTS:
                rowsUpdated = db.update(TABLE_EVENT, values, whereClause, whereArgs);
                break;
            case EVENT_ID:
                final String id = uri.getLastPathSegment();
                if (TextUtils.isEmpty(whereClause)) {
                    rowsUpdated = db.update(TABLE_EVENT, values, EventTable.COLUMN_ID + "=" + id, null);
                } else {
                    rowsUpdated = db.update(TABLE_EVENT, values, EventTable.COLUMN_ID + "=" + id + " and " + whereClause, whereArgs);
                }
                break;
            default:
                throw new IllegalArgumentException("Unknown URI: " + uri);
        }
        return rowsUpdated;
    }

    /**
     * Deletes a record in the table.
     *
     * @param uri           A Uri of the specific record.
     * @param selection     The "where" clause of sql.
     * @param selectionArgs Strings in the "where" clause.
     * @param knownSize     Known size (If known).
     * @return Number of rows deleted.
     */
    public int delete(final Uri uri, final String selection, final String[] selectionArgs, final Integer knownSize) {
        final int uriType = uriMatcher.match(uri);
        final SQLiteDatabase db = databaseHelper.getWritableDatabase();
        int rowsDeleted = 0;
        switch (uriType) {
            case EVENTS:
                rowsDeleted = db.delete(TABLE_EVENT, selection, selectionArgs);
                totalSize = -1;
                break;
            case EVENT_ID:
                final String id = uri.getLastPathSegment();
                final long size = getTotalSize();
                if (TextUtils.isEmpty(selection)) {
                    rowsDeleted = db.delete(TABLE_EVENT, EventTable.COLUMN_ID + "=" + id, null);
                } else {
                    rowsDeleted = db.delete(TABLE_EVENT, EventTable.COLUMN_ID + "=" + id + " and " + selection, selectionArgs);
                }
                if (rowsDeleted == 1) {
                    if (knownSize != null) {
                        totalSize = size - knownSize;
                    } else {
                        totalSize = -1;
                    }
                } else {
                    totalSize = -1;
                }
                break;
            default:
                throw new IllegalArgumentException("Unknown URI: " + uri);
        }
        return rowsDeleted;
    }
}
