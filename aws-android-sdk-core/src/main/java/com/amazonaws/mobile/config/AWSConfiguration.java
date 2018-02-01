/*
 * Copyright 2017-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.mobile.config;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * A container for the JSONObject representation of SDK configuration.
 */
public class AWSConfiguration {
    private static final String DEFAULT = "Default";
    private static final String DEFAULT_IDENTIFIER = "awsconfiguration";

    private JSONObject mJSONObject;
    private String configName; // "Default" or something else like "Backup"


    /**
     * This method will search for the name provided in the json and unwrap the
     * configuration specified by {@link #setConfiguration(String)}.
     * 
     * Example:
     * {
     *     "S3TransferUtility": {
     *         "Default": {
     *             "Bucket": "waterBucket",
     *             "Region": "us-west-2"
     *         }
     *     }
     * }
     * 
     * When name is "S3TransferUtility" and setConfiguration is "Default",
     * The value return is:
     * {
     *     "Bucket": "waterBucket",
     *     "Region": "us-west-2"
     * }
     * 
     * Certain keys do not have a configuration (i.e. "Default") and 
     * when this happens the value for the key is directly returned.
     * 
     * @param key used to search for in JSON map
     * @return an immutable copy of the value mapped by {@code name} if it
     *         exists and is a {@code JSONObject}, or null otherwise.
     */
    public JSONObject optJsonObject(String key) {
        try {
            JSONObject value = this.mJSONObject.getJSONObject(key);
            
            if (value.has(this.configName)) {
                value = value.getJSONObject(this.configName);
            }
            
            return new JSONObject(value.toString());
        } catch (JSONException je) {
            return null;
        }
    }
    
    /**
     * @return The user agent specified in the configuration file.
     */
    public String getUserAgent() {
        try {
            return this.mJSONObject.getString("UserAgent");
        } catch (JSONException je) {
            return "";
        }
    }

    /**
     * Change the settings that are being read in. This is "Default" by default.
     * 
     * @param configurationName the key used to differentiate between configuration settings
     */
    public void setConfiguration(String configurationName) {
        this.configName = configurationName;
    }

    /**
     * 
     * @return the configuration This is "Default" by default.
     */
    public String getConfiguration() {
        return this.configName;
    }

    @Override
    public String toString() {
        return mJSONObject.toString();
    }
}
