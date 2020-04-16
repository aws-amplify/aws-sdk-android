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
 * JSON unmarshaller for POJO M3u8Settings
 */
class M3u8SettingsJsonUnmarshaller implements Unmarshaller<M3u8Settings, JsonUnmarshallerContext> {

    public M3u8Settings unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        M3u8Settings m3u8Settings = new M3u8Settings();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AudioFramesPerPes")) {
                m3u8Settings.setAudioFramesPerPes(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AudioPids")) {
                m3u8Settings.setAudioPids(new ListUnmarshaller<Integer>(IntegerJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NielsenId3")) {
                m3u8Settings.setNielsenId3(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PatInterval")) {
                m3u8Settings.setPatInterval(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PcrControl")) {
                m3u8Settings.setPcrControl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PcrPid")) {
                m3u8Settings.setPcrPid(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PmtInterval")) {
                m3u8Settings.setPmtInterval(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PmtPid")) {
                m3u8Settings.setPmtPid(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PrivateMetadataPid")) {
                m3u8Settings.setPrivateMetadataPid(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProgramNumber")) {
                m3u8Settings.setProgramNumber(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Scte35Pid")) {
                m3u8Settings.setScte35Pid(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Scte35Source")) {
                m3u8Settings.setScte35Source(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TimedMetadata")) {
                m3u8Settings.setTimedMetadata(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TimedMetadataPid")) {
                m3u8Settings.setTimedMetadataPid(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TransportStreamId")) {
                m3u8Settings.setTransportStreamId(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VideoPid")) {
                m3u8Settings.setVideoPid(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return m3u8Settings;
    }

    private static M3u8SettingsJsonUnmarshaller instance;

    public static M3u8SettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new M3u8SettingsJsonUnmarshaller();
        return instance;
    }
}
