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
 * JSON marshaller for POJO LaunchTemplateInstanceMetadataOptions
 */
class LaunchTemplateInstanceMetadataOptionsJsonMarshaller {

    public void marshall(
            LaunchTemplateInstanceMetadataOptions launchTemplateInstanceMetadataOptions,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (launchTemplateInstanceMetadataOptions.getState() != null) {
            String state = launchTemplateInstanceMetadataOptions.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (launchTemplateInstanceMetadataOptions.getHttpTokens() != null) {
            String httpTokens = launchTemplateInstanceMetadataOptions.getHttpTokens();
            jsonWriter.name("HttpTokens");
            jsonWriter.value(httpTokens);
        }
        if (launchTemplateInstanceMetadataOptions.getHttpPutResponseHopLimit() != null) {
            Integer httpPutResponseHopLimit = launchTemplateInstanceMetadataOptions
                    .getHttpPutResponseHopLimit();
            jsonWriter.name("HttpPutResponseHopLimit");
            jsonWriter.value(httpPutResponseHopLimit);
        }
        if (launchTemplateInstanceMetadataOptions.getHttpEndpoint() != null) {
            String httpEndpoint = launchTemplateInstanceMetadataOptions.getHttpEndpoint();
            jsonWriter.name("HttpEndpoint");
            jsonWriter.value(httpEndpoint);
        }
        jsonWriter.endObject();
    }

    private static LaunchTemplateInstanceMetadataOptionsJsonMarshaller instance;

    public static LaunchTemplateInstanceMetadataOptionsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LaunchTemplateInstanceMetadataOptionsJsonMarshaller();
        return instance;
    }
}
