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

package com.amazonaws.services.amazonsagemakerservice.model.transform;

import com.amazonaws.services.amazonsagemakerservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO EndpointInput
 */
class EndpointInputJsonMarshaller {

    public void marshall(EndpointInput endpointInput, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (endpointInput.getEndpointName() != null) {
            String endpointName = endpointInput.getEndpointName();
            jsonWriter.name("EndpointName");
            jsonWriter.value(endpointName);
        }
        if (endpointInput.getLocalPath() != null) {
            String localPath = endpointInput.getLocalPath();
            jsonWriter.name("LocalPath");
            jsonWriter.value(localPath);
        }
        if (endpointInput.getS3InputMode() != null) {
            String s3InputMode = endpointInput.getS3InputMode();
            jsonWriter.name("S3InputMode");
            jsonWriter.value(s3InputMode);
        }
        if (endpointInput.getS3DataDistributionType() != null) {
            String s3DataDistributionType = endpointInput.getS3DataDistributionType();
            jsonWriter.name("S3DataDistributionType");
            jsonWriter.value(s3DataDistributionType);
        }
        jsonWriter.endObject();
    }

    private static EndpointInputJsonMarshaller instance;

    public static EndpointInputJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EndpointInputJsonMarshaller();
        return instance;
    }
}
