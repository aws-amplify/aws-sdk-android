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

package com.amazonaws.mobileconnectors.pinpoint.internal.core.idresolver;

import java.util.UUID;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.PinpointContext;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.system.AndroidPreferences;
import android.content.Context;
import android.content.SharedPreferences;

public class SharedPrefsUniqueIdService {

    protected static final String UNIQUE_ID_KEY = "UniqueId";
    private static final Log log =
            LogFactory.getLog(SharedPrefsUniqueIdService.class);
    private String appId = null;
    private Context applicationContext = null;

    /**
     * Uses Shared prefs to recall and store the unique ID
     *
     * @param appId              used as the shared preferences file name
     * @param applicationContext the application pinpointContext.
     */
    public SharedPrefsUniqueIdService(String appId,
                                             Context applicationContext) {
        this.appId = appId;
        this.applicationContext = applicationContext;
    }

    /**
     * Get the Id based on the passed in pinpointContext
     *
     * @param context The Analytics pinpointContext to use when looking up the id
     * @return the Id of Analytics pinpointContext
     */
    public String getUniqueId(PinpointContext context) {
        if (context == null || context.getSystem() == null
                    || context.getSystem().getPreferences() == null) {
            log.debug("Unable to generate unique id, pinpointContext has not been fully initialized.");
            return "";
        }

        String uniqueId = getIdFromPreferences(context.getSystem()
                                                       .getPreferences());
        if (uniqueId == null || uniqueId == "") {
            // an id doesn't exist for this pinpointContext, create one and persist it
            uniqueId = UUID.randomUUID().toString();
            storeUniqueId(context.getSystem().getPreferences(), uniqueId);
        }

        return uniqueId;
    }

    private String getIdFromPreferences(AndroidPreferences preferences) {
        if (getLegacyId() != "") {
            return getLegacyId();
        }
        return preferences.getString(UNIQUE_ID_KEY, null);
    }

    private String getLegacyId() {
        if (appId == null || applicationContext == null) {
            return "";
        }
        SharedPreferences legacyPreferences = applicationContext
                                                      .getSharedPreferences(appId,
                                                                                   Context.MODE_PRIVATE);
        String legacyId = legacyPreferences.getString(UNIQUE_ID_KEY, null);
        if (legacyId != null) {
            return legacyId;
        } else {
            return "";
        }
    }

    private void storeUniqueId(AndroidPreferences preferences,
                                      String uniqueId) {
        try {
            preferences.putString(UNIQUE_ID_KEY, uniqueId);
        } catch (Exception ex) {
            // Do not log ex due to potentially sensitive information
            log.error("There was an exception when trying to store the unique id into the Preferences.");
        }
    }
}
