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
 * JSON unmarshaller for POJO CmafGroupSettings
 */
class CmafGroupSettingsJsonUnmarshaller implements
        Unmarshaller<CmafGroupSettings, JsonUnmarshallerContext> {

    public CmafGroupSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        CmafGroupSettings cmafGroupSettings = new CmafGroupSettings();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AdditionalManifests")) {
                cmafGroupSettings
                        .setAdditionalManifests(new ListUnmarshaller<CmafAdditionalManifest>(
                                CmafAdditionalManifestJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("BaseUrl")) {
                cmafGroupSettings.setBaseUrl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ClientCache")) {
                cmafGroupSettings.setClientCache(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CodecSpecification")) {
                cmafGroupSettings.setCodecSpecification(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Destination")) {
                cmafGroupSettings.setDestination(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DestinationSettings")) {
                cmafGroupSettings.setDestinationSettings(DestinationSettingsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Encryption")) {
                cmafGroupSettings.setEncryption(CmafEncryptionSettingsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("FragmentLength")) {
                cmafGroupSettings.setFragmentLength(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ManifestCompression")) {
                cmafGroupSettings.setManifestCompression(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ManifestDurationFormat")) {
                cmafGroupSettings.setManifestDurationFormat(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MinBufferTime")) {
                cmafGroupSettings.setMinBufferTime(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MinFinalSegmentLength")) {
                cmafGroupSettings.setMinFinalSegmentLength(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MpdProfile")) {
                cmafGroupSettings.setMpdProfile(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SegmentControl")) {
                cmafGroupSettings.setSegmentControl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SegmentLength")) {
                cmafGroupSettings.setSegmentLength(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StreamInfResolution")) {
                cmafGroupSettings.setStreamInfResolution(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("WriteDashManifest")) {
                cmafGroupSettings.setWriteDashManifest(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("WriteHlsManifest")) {
                cmafGroupSettings.setWriteHlsManifest(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("WriteSegmentTimelineInRepresentation")) {
                cmafGroupSettings.setWriteSegmentTimelineInRepresentation(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return cmafGroupSettings;
    }

    private static CmafGroupSettingsJsonUnmarshaller instance;

    public static CmafGroupSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CmafGroupSettingsJsonUnmarshaller();
        return instance;
    }
}
