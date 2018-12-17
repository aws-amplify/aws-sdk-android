/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.idresolver;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.AnalyticsContext;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.system.Preferences;

import java.util.UUID;

/**
 * @deprecated The Amazon Mobile Analytics SDK for Android is deprecated as of release 2.9.0. Please use the Amazon Pinpoint SDK for Android along with Amazon Pinpoint service instead.
 */
@Deprecated
public class SharedPrefsUniqueIdService implements UniqueIdService {

    private static final String TAG = "SharedPrefsUniqueIdService";
    protected static final String PREFS_NAME = SharedPrefsUniqueIdService.class.getName();
    protected static final String UNIQUE_ID_KEY = "UniqueId";
    private String appId = null;
    private Context applicationContext = null;

    /**
     * Uses Shared prefs to recall and store the unique ID
     *
     * @param generator used to create new unique id's
     */
    public SharedPrefsUniqueIdService(String appId, Context applicationContext) {
        this.appId = appId;
        this.applicationContext = applicationContext;
    }

    @Override
    public Id getUniqueId(AnalyticsContext context) {
        if (context == null || context.getSystem() == null
                || context.getSystem().getPreferences() == null) {
            Log.d(TAG, "Unable to generate unique id, context has not been fully initialized");
            return Id.getEmptyId();
        }

        Id uniqueId = getIdFromPreferences(context.getSystem().getPreferences());
        if (uniqueId == Id.getEmptyId()) {
            // an id doesn't exist for this context, create one and persist it
            uniqueId = new Id(UUID.randomUUID().toString());
            storeUniqueId(context.getSystem().getPreferences(), uniqueId);
        }

        return uniqueId;
    }

    private Id getIdFromPreferences(Preferences preferences) {
        Id uniqueId = Id.getEmptyId();

        if (getLegacyId() != Id.getEmptyId()) {
            return getLegacyId();
        }
        String uniqueIdString = preferences.getString(UNIQUE_ID_KEY, null);
        if (uniqueIdString != null) {
            // create an id object from the stored string
            uniqueId = new Id(uniqueIdString);
        }

        return uniqueId;
    }

    private Id getLegacyId() {
        if (appId == null || applicationContext == null) {
            return Id.getEmptyId();
        }
        SharedPreferences legacyPreferences = applicationContext.getSharedPreferences(appId,
                Context.MODE_PRIVATE);
        String legacyId = legacyPreferences.getString(UNIQUE_ID_KEY, null);
        if (legacyId != null) {
            return new Id(legacyId);
        } else {
            return Id.getEmptyId();
        }
    }

    private void storeUniqueId(Preferences preferences, Id uniqueId) {
        try {
            preferences.putString(UNIQUE_ID_KEY, uniqueId.getValue());
        } catch (Exception ex) {
            Log.e(TAG,
                    "There was an exception when trying to store the unique id into the Preferences",
                    ex);
        }
    }
}
