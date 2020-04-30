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

package com.amazonaws.services.awselementalmediaconvert.model.transform;

import com.amazonaws.services.awselementalmediaconvert.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ContainerSettings
 */
class ContainerSettingsJsonUnmarshaller implements
        Unmarshaller<ContainerSettings, JsonUnmarshallerContext> {

    public ContainerSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ContainerSettings containerSettings = new ContainerSettings();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("CmfcSettings")) {
                containerSettings.setCmfcSettings(CmfcSettingsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Container")) {
                containerSettings.setContainer(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("F4vSettings")) {
                containerSettings.setF4vSettings(F4vSettingsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("M2tsSettings")) {
                containerSettings.setM2tsSettings(M2tsSettingsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("M3u8Settings")) {
                containerSettings.setM3u8Settings(M3u8SettingsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MovSettings")) {
                containerSettings.setMovSettings(MovSettingsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Mp4Settings")) {
                containerSettings.setMp4Settings(Mp4SettingsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MpdSettings")) {
                containerSettings.setMpdSettings(MpdSettingsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MxfSettings")) {
                containerSettings.setMxfSettings(MxfSettingsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return containerSettings;
    }

    private static ContainerSettingsJsonUnmarshaller instance;

    public static ContainerSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ContainerSettingsJsonUnmarshaller();
        return instance;
    }
}
