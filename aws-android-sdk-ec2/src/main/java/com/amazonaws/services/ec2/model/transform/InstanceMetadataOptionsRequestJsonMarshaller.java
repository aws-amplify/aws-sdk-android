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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO InstanceMetadataOptionsRequest
 */
class InstanceMetadataOptionsRequestJsonMarshaller {

    public void marshall(InstanceMetadataOptionsRequest instanceMetadataOptionsRequest,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (instanceMetadataOptionsRequest.getHttpTokens() != null) {
            String httpTokens = instanceMetadataOptionsRequest.getHttpTokens();
            jsonWriter.name("HttpTokens");
            jsonWriter.value(httpTokens);
        }
        if (instanceMetadataOptionsRequest.getHttpPutResponseHopLimit() != null) {
            Integer httpPutResponseHopLimit = instanceMetadataOptionsRequest
                    .getHttpPutResponseHopLimit();
            jsonWriter.name("HttpPutResponseHopLimit");
            jsonWriter.value(httpPutResponseHopLimit);
        }
        if (instanceMetadataOptionsRequest.getHttpEndpoint() != null) {
            String httpEndpoint = instanceMetadataOptionsRequest.getHttpEndpoint();
            jsonWriter.name("HttpEndpoint");
            jsonWriter.value(httpEndpoint);
        }
        jsonWriter.endObject();
    }

    private static InstanceMetadataOptionsRequestJsonMarshaller instance;

    public static InstanceMetadataOptionsRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceMetadataOptionsRequestJsonMarshaller();
        return instance;
    }
}
