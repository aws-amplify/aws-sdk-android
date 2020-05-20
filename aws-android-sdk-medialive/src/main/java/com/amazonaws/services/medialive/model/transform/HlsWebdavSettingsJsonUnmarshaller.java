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
 * JSON unmarshaller for POJO HlsWebdavSettings
 */
class HlsWebdavSettingsJsonUnmarshaller implements
        Unmarshaller<HlsWebdavSettings, JsonUnmarshallerContext> {

    public HlsWebdavSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        HlsWebdavSettings hlsWebdavSettings = new HlsWebdavSettings();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ConnectionRetryInterval")) {
                hlsWebdavSettings.setConnectionRetryInterval(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FilecacheDuration")) {
                hlsWebdavSettings.setFilecacheDuration(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("HttpTransferMode")) {
                hlsWebdavSettings.setHttpTransferMode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NumRetries")) {
                hlsWebdavSettings.setNumRetries(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RestartDelay")) {
                hlsWebdavSettings.setRestartDelay(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return hlsWebdavSettings;
    }

    private static HlsWebdavSettingsJsonUnmarshaller instance;

    public static HlsWebdavSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new HlsWebdavSettingsJsonUnmarshaller();
        return instance;
    }
}
