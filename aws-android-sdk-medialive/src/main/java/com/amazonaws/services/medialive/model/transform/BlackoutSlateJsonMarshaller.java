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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO BlackoutSlate
 */
class BlackoutSlateJsonMarshaller {

    public void marshall(BlackoutSlate blackoutSlate, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (blackoutSlate.getBlackoutSlateImage() != null) {
            InputLocation blackoutSlateImage = blackoutSlate.getBlackoutSlateImage();
            jsonWriter.name("BlackoutSlateImage");
            InputLocationJsonMarshaller.getInstance().marshall(blackoutSlateImage, jsonWriter);
        }
        if (blackoutSlate.getNetworkEndBlackout() != null) {
            String networkEndBlackout = blackoutSlate.getNetworkEndBlackout();
            jsonWriter.name("NetworkEndBlackout");
            jsonWriter.value(networkEndBlackout);
        }
        if (blackoutSlate.getNetworkEndBlackoutImage() != null) {
            InputLocation networkEndBlackoutImage = blackoutSlate.getNetworkEndBlackoutImage();
            jsonWriter.name("NetworkEndBlackoutImage");
            InputLocationJsonMarshaller.getInstance().marshall(networkEndBlackoutImage, jsonWriter);
        }
        if (blackoutSlate.getNetworkId() != null) {
            String networkId = blackoutSlate.getNetworkId();
            jsonWriter.name("NetworkId");
            jsonWriter.value(networkId);
        }
        if (blackoutSlate.getState() != null) {
            String state = blackoutSlate.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        jsonWriter.endObject();
    }

    private static BlackoutSlateJsonMarshaller instance;

    public static BlackoutSlateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BlackoutSlateJsonMarshaller();
        return instance;
    }
}
