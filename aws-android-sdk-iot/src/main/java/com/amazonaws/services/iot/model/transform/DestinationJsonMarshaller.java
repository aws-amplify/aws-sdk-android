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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Destination
 */
class DestinationJsonMarshaller {

    public void marshall(Destination destination, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (destination.getS3Destination() != null) {
            S3Destination s3Destination = destination.getS3Destination();
            jsonWriter.name("s3Destination");
            S3DestinationJsonMarshaller.getInstance().marshall(s3Destination, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static DestinationJsonMarshaller instance;

    public static DestinationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DestinationJsonMarshaller();
        return instance;
    }
}
