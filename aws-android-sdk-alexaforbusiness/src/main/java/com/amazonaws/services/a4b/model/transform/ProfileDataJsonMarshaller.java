/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.a4b.model.transform;

import com.amazonaws.services.a4b.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ProfileData
 */
class ProfileDataJsonMarshaller {

    public void marshall(ProfileData profileData, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (profileData.getProfileArn() != null) {
            String profileArn = profileData.getProfileArn();
            jsonWriter.name("ProfileArn");
            jsonWriter.value(profileArn);
        }
        if (profileData.getProfileName() != null) {
            String profileName = profileData.getProfileName();
            jsonWriter.name("ProfileName");
            jsonWriter.value(profileName);
        }
        if (profileData.getIsDefault() != null) {
            Boolean isDefault = profileData.getIsDefault();
            jsonWriter.name("IsDefault");
            jsonWriter.value(isDefault);
        }
        if (profileData.getAddress() != null) {
            String address = profileData.getAddress();
            jsonWriter.name("Address");
            jsonWriter.value(address);
        }
        if (profileData.getTimezone() != null) {
            String timezone = profileData.getTimezone();
            jsonWriter.name("Timezone");
            jsonWriter.value(timezone);
        }
        if (profileData.getDistanceUnit() != null) {
            String distanceUnit = profileData.getDistanceUnit();
            jsonWriter.name("DistanceUnit");
            jsonWriter.value(distanceUnit);
        }
        if (profileData.getTemperatureUnit() != null) {
            String temperatureUnit = profileData.getTemperatureUnit();
            jsonWriter.name("TemperatureUnit");
            jsonWriter.value(temperatureUnit);
        }
        if (profileData.getWakeWord() != null) {
            String wakeWord = profileData.getWakeWord();
            jsonWriter.name("WakeWord");
            jsonWriter.value(wakeWord);
        }
        if (profileData.getLocale() != null) {
            String locale = profileData.getLocale();
            jsonWriter.name("Locale");
            jsonWriter.value(locale);
        }
        jsonWriter.endObject();
    }

    private static ProfileDataJsonMarshaller instance;

    public static ProfileDataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ProfileDataJsonMarshaller();
        return instance;
    }
}
