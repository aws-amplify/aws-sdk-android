/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO JobProcessDetails
 */
class JobProcessDetailsJsonUnmarshaller implements
        Unmarshaller<JobProcessDetails, JsonUnmarshallerContext> {

    public JobProcessDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        JobProcessDetails jobProcessDetails = new JobProcessDetails();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("processingTargets")) {
                jobProcessDetails.setProcessingTargets(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("numberOfCanceledThings")) {
                jobProcessDetails.setNumberOfCanceledThings(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("numberOfSucceededThings")) {
                jobProcessDetails.setNumberOfSucceededThings(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("numberOfFailedThings")) {
                jobProcessDetails.setNumberOfFailedThings(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("numberOfRejectedThings")) {
                jobProcessDetails.setNumberOfRejectedThings(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("numberOfQueuedThings")) {
                jobProcessDetails.setNumberOfQueuedThings(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("numberOfInProgressThings")) {
                jobProcessDetails.setNumberOfInProgressThings(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("numberOfRemovedThings")) {
                jobProcessDetails.setNumberOfRemovedThings(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("numberOfTimedOutThings")) {
                jobProcessDetails.setNumberOfTimedOutThings(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return jobProcessDetails;
    }

    private static JobProcessDetailsJsonUnmarshaller instance;

    public static JobProcessDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new JobProcessDetailsJsonUnmarshaller();
        return instance;
    }
}
