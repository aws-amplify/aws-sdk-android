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
package com.amazonaws.services.compute-optimizer.model.transform;

import com.amazonaws.services.compute-optimizer.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ExportDestination
 */
class ExportDestinationJsonMarshaller {

    public void marshall(ExportDestination exportDestination, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (exportDestination.getS3() != null) {
            S3Destination s3 = exportDestination.getS3();
            jsonWriter.name("s3");
            S3DestinationJsonMarshaller.getInstance().marshall(s3, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ExportDestinationJsonMarshaller instance;
    public static ExportDestinationJsonMarshaller getInstance() {
        if (instance == null) instance = new ExportDestinationJsonMarshaller();
        return instance;
    }
}
