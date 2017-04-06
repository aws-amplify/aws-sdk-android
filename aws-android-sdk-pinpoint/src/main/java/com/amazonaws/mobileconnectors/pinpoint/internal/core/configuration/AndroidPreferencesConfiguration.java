/**
 * Copyright 2016-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.mobileconnectors.pinpoint.internal.core.configuration;

import static com.amazonaws.mobileconnectors.pinpoint.internal.core.util.Preconditions.checkNotNull;

import com.amazonaws.mobileconnectors.pinpoint.internal.core.PinpointContext;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.system.AndroidPreferences;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class AndroidPreferencesConfiguration  {

    private static final Log log =
            LogFactory.getLog(AndroidPreferencesConfiguration.class);

    private static final String CONFIG_KEY = "configuration";

    private final PinpointContext context;

    private Map<String, String> properties = new ConcurrentHashMap<String, String>();

    public static AndroidPreferencesConfiguration newInstance(final PinpointContext context) {
        return new AndroidPreferencesConfiguration(context);
    }

    AndroidPreferencesConfiguration(final PinpointContext context) {
        checkNotNull(context);

        this.context = context;

        // load the configuration
        JSONObject configJson = null;

        final AndroidPreferences preferences = getContext().getSystem().getPreferences();
        if (preferences != null) {

            // load our serialized prefs
            String configurationJsonString = preferences.getString(CONFIG_KEY, null);
            if (configurationJsonString != null) {
                try {
                    configJson = new JSONObject(configurationJsonString);
                } catch (final JSONException e) {
                    log.error("Could not create Json object of Config", e);
                }
            }
        }

        // initialize the internal mappings
        updateMappings(configJson);
    }

    public Long getLong(String propertyName) {
        Long value = null;
        String valueString = properties.get(propertyName);

        if (valueString != null) {
            try {
                value = Long.decode(valueString);
            } catch (Exception ex) {
                log.error(String.format("Could not get Long for propertyName: %s", propertyName), ex);
            }
        }

        return value;
    }

    public String getString(String propertyName) {

        String value = properties.get(propertyName);

        return value;
    }

    public Integer getInt(String propertyName) {
        Integer value = null;
        String valueString = properties.get(propertyName);

        if (valueString != null) {
            try {
                value = Integer.decode(valueString);
            } catch (Exception ex) {
                log.error(String.format("Could not get Integer for propertyName: %s", propertyName), ex);
            }
        }

        return value;
    }

    public Double getDouble(String propertyName) {
        Double value = null;
        String valueString = properties.get(propertyName);

        if (valueString != null) {
            try {
                value = Double.parseDouble(valueString);
            } catch (Exception ex) {
                log.error(String.format("Could not get Double for propertyName: %s", propertyName), ex);
            }
        }

        return value;
    }

    public Boolean getBoolean(String propertyName) {
        Boolean value = null;
        String valueString = properties.get(propertyName);

        if (valueString != null) {
            try {
                value = Boolean.parseBoolean(valueString);
            } catch (Exception ex) {
                log.error(String.format("Could not get Boolean for propertyName: %s", propertyName), ex);
            }
        }

        return value;
    }

    public Short getShort(String propertyName) {
        Short value = null;
        String valueString = properties.get(propertyName);

        if (valueString != null) {
            try {
                if (properties.containsKey(propertyName)) {
                    value = Short.decode(valueString);
                }
            } catch (Exception ex) {
                log.error(String.format("Could not get Short for propertyName: %s", propertyName), ex);
            }
        }

        return value;
    }

    public Long optLong(String propertyName, Long optValue) {
        Long value = this.getLong(propertyName);
        return (value != null) ? value : optValue;
    }

    public String optString(String propertyName, String optValue) {
        String value = this.getString(propertyName);
        return (value != null) ? value : optValue;
    }

    public Integer optInt(String propertyName, Integer optValue) {
        Integer value = this.getInt(propertyName);
        return (value != null) ? value : optValue;
    }

    public Short optShort(String propertyName, Short optValue) {
        Short value = this.getShort(propertyName);
        return (value != null) ? value : optValue;
    }

    public Double optDouble(String propertyName, Double optValue) {
        Double value = this.getDouble(propertyName);
        return (value != null) ? value : optValue;
    }

    public Boolean optBoolean(String propertyName, Boolean optValue) {
        Boolean value = this.getBoolean(propertyName);
        return (value != null) ? value : optValue;
    }

    /**
     * Update the property map with the JSON key value pairs
     *
     * @param configJson The Json to add to the map. If null, the internal map
     *            is empty
     */
    private void updateMappings(JSONObject configJson) {
        HashMap<String, String> newProperties = new HashMap<String, String>();

        if (configJson != null) {
            Iterator<?> keys = configJson.keys();

            while (keys.hasNext()) {
                String key = (String) keys.next();
                try {
                    String value = configJson.getString(key);
                    newProperties.put(key, value);
                } catch (JSONException e) {
                    log.error("Could not update property mappings", e);
                }
            }
        }

        // put all new properties in our map
        properties.putAll(newProperties);

    }

    private PinpointContext getContext() {
        return this.context;
    }

}
