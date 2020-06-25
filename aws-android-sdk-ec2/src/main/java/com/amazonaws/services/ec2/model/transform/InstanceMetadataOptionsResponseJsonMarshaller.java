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
 * JSON marshaller for POJO InstanceMetadataOptionsResponse
 */
class InstanceMetadataOptionsResponseJsonMarshaller {

    public void marshall(InstanceMetadataOptionsResponse instanceMetadataOptionsResponse,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (instanceMetadataOptionsResponse.getState() != null) {
            String state = instanceMetadataOptionsResponse.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (instanceMetadataOptionsResponse.getHttpTokens() != null) {
            String httpTokens = instanceMetadataOptionsResponse.getHttpTokens();
            jsonWriter.name("HttpTokens");
            jsonWriter.value(httpTokens);
        }
        if (instanceMetadataOptionsResponse.getHttpPutResponseHopLimit() != null) {
            Integer httpPutResponseHopLimit = instanceMetadataOptionsResponse
                    .getHttpPutResponseHopLimit();
            jsonWriter.name("HttpPutResponseHopLimit");
            jsonWriter.value(httpPutResponseHopLimit);
        }
        if (instanceMetadataOptionsResponse.getHttpEndpoint() != null) {
            String httpEndpoint = instanceMetadataOptionsResponse.getHttpEndpoint();
            jsonWriter.name("HttpEndpoint");
            jsonWriter.value(httpEndpoint);
        }
        jsonWriter.endObject();
    }

    private static InstanceMetadataOptionsResponseJsonMarshaller instance;

    public static InstanceMetadataOptionsResponseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceMetadataOptionsResponseJsonMarshaller();
        return instance;
    }
}
