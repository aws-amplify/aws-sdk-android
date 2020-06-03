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

package com.amazonaws.services.mediaconvert.model.transform;

import com.amazonaws.services.mediaconvert.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO QueueTransition
 */
class QueueTransitionJsonMarshaller {

    public void marshall(QueueTransition queueTransition, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (queueTransition.getDestinationQueue() != null) {
            String destinationQueue = queueTransition.getDestinationQueue();
            jsonWriter.name("DestinationQueue");
            jsonWriter.value(destinationQueue);
        }
        if (queueTransition.getSourceQueue() != null) {
            String sourceQueue = queueTransition.getSourceQueue();
            jsonWriter.name("SourceQueue");
            jsonWriter.value(sourceQueue);
        }
        if (queueTransition.getTimestamp() != null) {
            java.util.Date timestamp = queueTransition.getTimestamp();
            jsonWriter.name("Timestamp");
            jsonWriter.value(timestamp);
        }
        jsonWriter.endObject();
    }

    private static QueueTransitionJsonMarshaller instance;

    public static QueueTransitionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new QueueTransitionJsonMarshaller();
        return instance;
    }
}
