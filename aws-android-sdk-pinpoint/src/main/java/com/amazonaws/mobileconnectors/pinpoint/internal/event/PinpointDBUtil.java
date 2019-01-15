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

import com.amazonaws.mobileconnectors.pinpoint.analytics.AnalyticsEvent;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

import static com.amazonaws.mobileconnectors.pinpoint.internal.event.EventTable.COLUMN_ID;
import static com.amazonaws.mobileconnectors.pinpoint.internal.event.EventTable.COLUMN_SIZE;

/**
 * Provides methods to conveniently perform database operations.
 */
public class PinpointDBUtil {

    /**
     * pinpointDBBase is a basic helper for accessing the database
     */
    private PinpointDBBase pinpointDBBase;

    /**
     * Constructs a PinpointDBUtil with the given Context.
     *
     * @param context An instance of Context.
     */
    public PinpointDBUtil(final Context context) {
        if (pinpointDBBase == null) {
            pinpointDBBase = new PinpointDBBase(context);
        }
    }

    /**
     * Closes the DB Connection
     */
    public void closeDB() {
        if (pinpointDBBase != null) {
            pinpointDBBase.closeDBHelper();
        }
    }

    /**
     * Saves an event into the database.
     *
     * @param event The AnalyticsEvent to be saved.
     * @return An Uri of the record inserted.
     */
    public Uri saveEvent(final AnalyticsEvent event) {
        return pinpointDBBase.insert(pinpointDBBase.getContentUri(), generateContentValuesFromEvent(event));
    }

    private ContentValues generateContentValuesFromEvent(final AnalyticsEvent event) {
        ContentValues values = new ContentValues();
        String json = event.toJSONObject().toString();
        values.put(EventTable.COLUMN_JSON, json);
        values.put(COLUMN_SIZE, json.length());
        return values;
    }

    /**
     * Queries all the events.
     *
     * @return A Cursor pointing to records in the database.
     */
    public Cursor queryAllEvents() {
        return pinpointDBBase.query(pinpointDBBase.getContentUri(), null, null, null, null, null);
    }

    /**
     * Queries all events from oldest. Does not include JSON.
     *
     * @return A Cursor pointing to records in the database.
     */
    public Cursor queryOldestEvents(final int limit) {
        return pinpointDBBase.query(pinpointDBBase.getContentUri(), new String[] { COLUMN_ID, COLUMN_SIZE }, null, null, null,
                                    Integer.toString(limit));
    }

    /**
     * Queries the event record specified by id.
     *
     * @param id The id of the event.
     * @return The result Cursor of the query.
     */
    public Cursor queryEventById(final int id) {
        return pinpointDBBase.query(getEventUri(id), null, null, null, null, null);
    }

    /**
     * Deletes the event with the given id.
     *
     * @param id   The id of the event to be deleted.
     * @param size Known size of event.
     * @return Number of rows deleted.
     */
    public int deleteEvent(final int id, final Integer size) {
        return pinpointDBBase.delete(getEventUri(id), null, null, size);
    }

    /**
     * Gets the Uri of the event table.
     *
     * @return The Uri of a table.
     */
    public Uri getContentUri() {
        return pinpointDBBase.getContentUri();
    }

    /**
     * Gets the Uri of an event.
     *
     * @param id The id of the event.
     * @return The Uri of the event specified by the id.
     */
    public Uri getEventUri(final int id) {
        return Uri.parse(pinpointDBBase.getContentUri() + "/" + id);
    }

    public long getTotalSize() {
        return pinpointDBBase.getTotalSize();
    }
}
