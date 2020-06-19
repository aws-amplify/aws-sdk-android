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
 * JSON unmarshaller for POJO RtmpOutputSettings
 */
class RtmpOutputSettingsJsonUnmarshaller implements
        Unmarshaller<RtmpOutputSettings, JsonUnmarshallerContext> {

    public RtmpOutputSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        RtmpOutputSettings rtmpOutputSettings = new RtmpOutputSettings();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("CertificateMode")) {
                rtmpOutputSettings.setCertificateMode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ConnectionRetryInterval")) {
                rtmpOutputSettings.setConnectionRetryInterval(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Destination")) {
                rtmpOutputSettings.setDestination(OutputLocationRefJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NumRetries")) {
                rtmpOutputSettings.setNumRetries(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return rtmpOutputSettings;
    }

    private static RtmpOutputSettingsJsonUnmarshaller instance;

    public static RtmpOutputSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RtmpOutputSettingsJsonUnmarshaller();
        return instance;
    }
}
