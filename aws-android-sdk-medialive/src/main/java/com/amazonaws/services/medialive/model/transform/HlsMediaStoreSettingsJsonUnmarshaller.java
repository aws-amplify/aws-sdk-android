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

package com.amazonaws.services.medialive.model.transform;

import com.amazonaws.services.medialive.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO HlsMediaStoreSettings
 */
class HlsMediaStoreSettingsJsonUnmarshaller implements
        Unmarshaller<HlsMediaStoreSettings, JsonUnmarshallerContext> {

    public HlsMediaStoreSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        HlsMediaStoreSettings hlsMediaStoreSettings = new HlsMediaStoreSettings();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ConnectionRetryInterval")) {
                hlsMediaStoreSettings.setConnectionRetryInterval(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("FilecacheDuration")) {
                hlsMediaStoreSettings.setFilecacheDuration(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MediaStoreStorageClass")) {
                hlsMediaStoreSettings.setMediaStoreStorageClass(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("NumRetries")) {
                hlsMediaStoreSettings.setNumRetries(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RestartDelay")) {
                hlsMediaStoreSettings.setRestartDelay(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return hlsMediaStoreSettings;
    }

    private static HlsMediaStoreSettingsJsonUnmarshaller instance;

    public static HlsMediaStoreSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new HlsMediaStoreSettingsJsonUnmarshaller();
        return instance;
    }
}
