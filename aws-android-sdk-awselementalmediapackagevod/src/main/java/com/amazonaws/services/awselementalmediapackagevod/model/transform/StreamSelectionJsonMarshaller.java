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

package com.amazonaws.services.awselementalmediapackagevod.model.transform;

import com.amazonaws.services.awselementalmediapackagevod.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO StreamSelection
 */
class StreamSelectionJsonMarshaller {

    public void marshall(StreamSelection streamSelection, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (streamSelection.getMaxVideoBitsPerSecond() != null) {
            Integer maxVideoBitsPerSecond = streamSelection.getMaxVideoBitsPerSecond();
            jsonWriter.name("MaxVideoBitsPerSecond");
            jsonWriter.value(maxVideoBitsPerSecond);
        }
        if (streamSelection.getMinVideoBitsPerSecond() != null) {
            Integer minVideoBitsPerSecond = streamSelection.getMinVideoBitsPerSecond();
            jsonWriter.name("MinVideoBitsPerSecond");
            jsonWriter.value(minVideoBitsPerSecond);
        }
        if (streamSelection.getStreamOrder() != null) {
            String streamOrder = streamSelection.getStreamOrder();
            jsonWriter.name("StreamOrder");
            jsonWriter.value(streamOrder);
        }
        jsonWriter.endObject();
    }

    private static StreamSelectionJsonMarshaller instance;

    public static StreamSelectionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new StreamSelectionJsonMarshaller();
        return instance;
    }
}
