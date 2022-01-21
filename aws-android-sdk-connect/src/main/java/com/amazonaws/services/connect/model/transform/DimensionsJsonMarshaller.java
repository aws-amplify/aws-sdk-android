/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Dimensions
 */
class DimensionsJsonMarshaller {

    public void marshall(Dimensions dimensions, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (dimensions.getQueue() != null) {
            QueueReference queue = dimensions.getQueue();
            jsonWriter.name("Queue");
            QueueReferenceJsonMarshaller.getInstance().marshall(queue, jsonWriter);
        }
        if (dimensions.getChannel() != null) {
            String channel = dimensions.getChannel();
            jsonWriter.name("Channel");
            jsonWriter.value(channel);
        }
        jsonWriter.endObject();
    }

    private static DimensionsJsonMarshaller instance;

    public static DimensionsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DimensionsJsonMarshaller();
        return instance;
    }
}
