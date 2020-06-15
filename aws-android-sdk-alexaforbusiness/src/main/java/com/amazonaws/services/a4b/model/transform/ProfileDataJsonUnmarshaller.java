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
 * JSON unmarshaller for POJO ProfileData
 */
class ProfileDataJsonUnmarshaller implements Unmarshaller<ProfileData, JsonUnmarshallerContext> {

    public ProfileData unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ProfileData profileData = new ProfileData();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ProfileArn")) {
                profileData.setProfileArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProfileName")) {
                profileData.setProfileName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IsDefault")) {
                profileData.setIsDefault(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Address")) {
                profileData.setAddress(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Timezone")) {
                profileData.setTimezone(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DistanceUnit")) {
                profileData.setDistanceUnit(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TemperatureUnit")) {
                profileData.setTemperatureUnit(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("WakeWord")) {
                profileData.setWakeWord(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Locale")) {
                profileData.setLocale(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return profileData;
    }

    private static ProfileDataJsonUnmarshaller instance;

    public static ProfileDataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ProfileDataJsonUnmarshaller();
        return instance;
    }
}
