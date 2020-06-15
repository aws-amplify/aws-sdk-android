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
 * JSON marshaller for POJO Profile
 */
class ProfileJsonMarshaller {

    public void marshall(Profile profile, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (profile.getProfileArn() != null) {
            String profileArn = profile.getProfileArn();
            jsonWriter.name("ProfileArn");
            jsonWriter.value(profileArn);
        }
        if (profile.getProfileName() != null) {
            String profileName = profile.getProfileName();
            jsonWriter.name("ProfileName");
            jsonWriter.value(profileName);
        }
        if (profile.getIsDefault() != null) {
            Boolean isDefault = profile.getIsDefault();
            jsonWriter.name("IsDefault");
            jsonWriter.value(isDefault);
        }
        if (profile.getAddress() != null) {
            String address = profile.getAddress();
            jsonWriter.name("Address");
            jsonWriter.value(address);
        }
        if (profile.getTimezone() != null) {
            String timezone = profile.getTimezone();
            jsonWriter.name("Timezone");
            jsonWriter.value(timezone);
        }
        if (profile.getDistanceUnit() != null) {
            String distanceUnit = profile.getDistanceUnit();
            jsonWriter.name("DistanceUnit");
            jsonWriter.value(distanceUnit);
        }
        if (profile.getTemperatureUnit() != null) {
            String temperatureUnit = profile.getTemperatureUnit();
            jsonWriter.name("TemperatureUnit");
            jsonWriter.value(temperatureUnit);
        }
        if (profile.getWakeWord() != null) {
            String wakeWord = profile.getWakeWord();
            jsonWriter.name("WakeWord");
            jsonWriter.value(wakeWord);
        }
        if (profile.getLocale() != null) {
            String locale = profile.getLocale();
            jsonWriter.name("Locale");
            jsonWriter.value(locale);
        }
        if (profile.getSetupModeDisabled() != null) {
            Boolean setupModeDisabled = profile.getSetupModeDisabled();
            jsonWriter.name("SetupModeDisabled");
            jsonWriter.value(setupModeDisabled);
        }
        if (profile.getMaxVolumeLimit() != null) {
            Integer maxVolumeLimit = profile.getMaxVolumeLimit();
            jsonWriter.name("MaxVolumeLimit");
            jsonWriter.value(maxVolumeLimit);
        }
        if (profile.getPSTNEnabled() != null) {
            Boolean pSTNEnabled = profile.getPSTNEnabled();
            jsonWriter.name("PSTNEnabled");
            jsonWriter.value(pSTNEnabled);
        }
        if (profile.getAddressBookArn() != null) {
            String addressBookArn = profile.getAddressBookArn();
            jsonWriter.name("AddressBookArn");
            jsonWriter.value(addressBookArn);
        }
        if (profile.getMeetingRoomConfiguration() != null) {
            MeetingRoomConfiguration meetingRoomConfiguration = profile
                    .getMeetingRoomConfiguration();
            jsonWriter.name("MeetingRoomConfiguration");
            MeetingRoomConfigurationJsonMarshaller.getInstance().marshall(meetingRoomConfiguration,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ProfileJsonMarshaller instance;

    public static ProfileJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ProfileJsonMarshaller();
        return instance;
    }
}
