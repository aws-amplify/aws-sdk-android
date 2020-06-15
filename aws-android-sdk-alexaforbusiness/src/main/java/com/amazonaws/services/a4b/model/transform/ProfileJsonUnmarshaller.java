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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO Profile
 */
class ProfileJsonUnmarshaller implements Unmarshaller<Profile, JsonUnmarshallerContext> {

    public Profile unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Profile profile = new Profile();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ProfileArn")) {
                profile.setProfileArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProfileName")) {
                profile.setProfileName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IsDefault")) {
                profile.setIsDefault(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Address")) {
                profile.setAddress(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Timezone")) {
                profile.setTimezone(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DistanceUnit")) {
                profile.setDistanceUnit(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TemperatureUnit")) {
                profile.setTemperatureUnit(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("WakeWord")) {
                profile.setWakeWord(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Locale")) {
                profile.setLocale(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SetupModeDisabled")) {
                profile.setSetupModeDisabled(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MaxVolumeLimit")) {
                profile.setMaxVolumeLimit(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PSTNEnabled")) {
                profile.setPSTNEnabled(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AddressBookArn")) {
                profile.setAddressBookArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MeetingRoomConfiguration")) {
                profile.setMeetingRoomConfiguration(MeetingRoomConfigurationJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return profile;
    }

    private static ProfileJsonUnmarshaller instance;

    public static ProfileJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ProfileJsonUnmarshaller();
        return instance;
    }
}
