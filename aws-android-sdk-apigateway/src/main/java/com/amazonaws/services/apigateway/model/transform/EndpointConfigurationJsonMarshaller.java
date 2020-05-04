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

package com.amazonaws.services.apigateway.model.transform;

import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO EndpointConfiguration
 */
class EndpointConfigurationJsonMarshaller {

    public void marshall(EndpointConfiguration endpointConfiguration, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (endpointConfiguration.getTypes() != null) {
            java.util.List<String> types = endpointConfiguration.getTypes();
            jsonWriter.name("types");
            jsonWriter.beginArray();
            for (String typesItem : types) {
                if (typesItem != null) {
                    jsonWriter.value(typesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (endpointConfiguration.getVpcEndpointIds() != null) {
            java.util.List<String> vpcEndpointIds = endpointConfiguration.getVpcEndpointIds();
            jsonWriter.name("vpcEndpointIds");
            jsonWriter.beginArray();
            for (String vpcEndpointIdsItem : vpcEndpointIds) {
                if (vpcEndpointIdsItem != null) {
                    jsonWriter.value(vpcEndpointIdsItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static EndpointConfigurationJsonMarshaller instance;

    public static EndpointConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EndpointConfigurationJsonMarshaller();
        return instance;
    }
}
