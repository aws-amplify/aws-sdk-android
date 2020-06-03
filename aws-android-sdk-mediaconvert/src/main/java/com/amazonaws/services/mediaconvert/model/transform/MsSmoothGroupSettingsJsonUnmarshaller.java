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

package com.amazonaws.services.mediaconvert.model.transform;

import com.amazonaws.services.mediaconvert.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO MsSmoothGroupSettings
 */
class MsSmoothGroupSettingsJsonUnmarshaller implements
        Unmarshaller<MsSmoothGroupSettings, JsonUnmarshallerContext> {

    public MsSmoothGroupSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        MsSmoothGroupSettings msSmoothGroupSettings = new MsSmoothGroupSettings();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AdditionalManifests")) {
                msSmoothGroupSettings
                        .setAdditionalManifests(new ListUnmarshaller<MsSmoothAdditionalManifest>(
                                MsSmoothAdditionalManifestJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("AudioDeduplication")) {
                msSmoothGroupSettings.setAudioDeduplication(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Destination")) {
                msSmoothGroupSettings.setDestination(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DestinationSettings")) {
                msSmoothGroupSettings.setDestinationSettings(DestinationSettingsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Encryption")) {
                msSmoothGroupSettings.setEncryption(MsSmoothEncryptionSettingsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("FragmentLength")) {
                msSmoothGroupSettings.setFragmentLength(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ManifestEncoding")) {
                msSmoothGroupSettings.setManifestEncoding(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return msSmoothGroupSettings;
    }

    private static MsSmoothGroupSettingsJsonUnmarshaller instance;

    public static MsSmoothGroupSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MsSmoothGroupSettingsJsonUnmarshaller();
        return instance;
    }
}
