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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO HopDestination
 */
class HopDestinationJsonMarshaller {

    public void marshall(HopDestination hopDestination, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (hopDestination.getPriority() != null) {
            Integer priority = hopDestination.getPriority();
            jsonWriter.name("Priority");
            jsonWriter.value(priority);
        }
        if (hopDestination.getQueue() != null) {
            String queue = hopDestination.getQueue();
            jsonWriter.name("Queue");
            jsonWriter.value(queue);
        }
        if (hopDestination.getWaitMinutes() != null) {
            Integer waitMinutes = hopDestination.getWaitMinutes();
            jsonWriter.name("WaitMinutes");
            jsonWriter.value(waitMinutes);
        }
        jsonWriter.endObject();
    }

    private static HopDestinationJsonMarshaller instance;

    public static HopDestinationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HopDestinationJsonMarshaller();
        return instance;
    }
}
