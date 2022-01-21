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

package com.amazonaws.services.geo.model.transform;

import com.amazonaws.services.geo.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response BatchPutGeofenceResult
 */
public class BatchPutGeofenceResultJsonUnmarshaller implements
        Unmarshaller<BatchPutGeofenceResult, JsonUnmarshallerContext> {

    public BatchPutGeofenceResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        BatchPutGeofenceResult batchPutGeofenceResult = new BatchPutGeofenceResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Errors")) {
                batchPutGeofenceResult.setErrors(new ListUnmarshaller<BatchPutGeofenceError>(
                        BatchPutGeofenceErrorJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Successes")) {
                batchPutGeofenceResult.setSuccesses(new ListUnmarshaller<BatchPutGeofenceSuccess>(
                        BatchPutGeofenceSuccessJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return batchPutGeofenceResult;
    }

    private static BatchPutGeofenceResultJsonUnmarshaller instance;

    public static BatchPutGeofenceResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BatchPutGeofenceResultJsonUnmarshaller();
        return instance;
    }
}
