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
 * JSON marshaller for POJO LaunchTemplateInstanceMetadataOptionsRequest
 */
class LaunchTemplateInstanceMetadataOptionsRequestJsonMarshaller {

    public void marshall(
            LaunchTemplateInstanceMetadataOptionsRequest launchTemplateInstanceMetadataOptionsRequest,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (launchTemplateInstanceMetadataOptionsRequest.getHttpTokens() != null) {
            String httpTokens = launchTemplateInstanceMetadataOptionsRequest.getHttpTokens();
            jsonWriter.name("HttpTokens");
            jsonWriter.value(httpTokens);
        }
        if (launchTemplateInstanceMetadataOptionsRequest.getHttpPutResponseHopLimit() != null) {
            Integer httpPutResponseHopLimit = launchTemplateInstanceMetadataOptionsRequest
                    .getHttpPutResponseHopLimit();
            jsonWriter.name("HttpPutResponseHopLimit");
            jsonWriter.value(httpPutResponseHopLimit);
        }
        if (launchTemplateInstanceMetadataOptionsRequest.getHttpEndpoint() != null) {
            String httpEndpoint = launchTemplateInstanceMetadataOptionsRequest.getHttpEndpoint();
            jsonWriter.name("HttpEndpoint");
            jsonWriter.value(httpEndpoint);
        }
        jsonWriter.endObject();
    }

    private static LaunchTemplateInstanceMetadataOptionsRequestJsonMarshaller instance;

    public static LaunchTemplateInstanceMetadataOptionsRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LaunchTemplateInstanceMetadataOptionsRequestJsonMarshaller();
        return instance;
    }
}
