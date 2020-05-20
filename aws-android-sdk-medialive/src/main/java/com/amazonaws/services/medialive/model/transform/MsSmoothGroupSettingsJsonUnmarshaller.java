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
            if (name.equals("AcquisitionPointId")) {
                msSmoothGroupSettings.setAcquisitionPointId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AudioOnlyTimecodeControl")) {
                msSmoothGroupSettings.setAudioOnlyTimecodeControl(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("CertificateMode")) {
                msSmoothGroupSettings.setCertificateMode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ConnectionRetryInterval")) {
                msSmoothGroupSettings.setConnectionRetryInterval(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Destination")) {
                msSmoothGroupSettings.setDestination(OutputLocationRefJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("EventId")) {
                msSmoothGroupSettings.setEventId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EventIdMode")) {
                msSmoothGroupSettings.setEventIdMode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EventStopBehavior")) {
                msSmoothGroupSettings.setEventStopBehavior(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FilecacheDuration")) {
                msSmoothGroupSettings.setFilecacheDuration(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FragmentLength")) {
                msSmoothGroupSettings.setFragmentLength(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InputLossAction")) {
                msSmoothGroupSettings.setInputLossAction(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NumRetries")) {
                msSmoothGroupSettings.setNumRetries(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RestartDelay")) {
                msSmoothGroupSettings.setRestartDelay(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SegmentationMode")) {
                msSmoothGroupSettings.setSegmentationMode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SendDelayMs")) {
                msSmoothGroupSettings.setSendDelayMs(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SparseTrackType")) {
                msSmoothGroupSettings.setSparseTrackType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StreamManifestBehavior")) {
                msSmoothGroupSettings.setStreamManifestBehavior(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("TimestampOffset")) {
                msSmoothGroupSettings.setTimestampOffset(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TimestampOffsetMode")) {
                msSmoothGroupSettings.setTimestampOffsetMode(StringJsonUnmarshaller.getInstance()
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
