/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kms.model.transform;

import com.amazonaws.services.kms.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO XksProxyConfigurationType
 */
class XksProxyConfigurationTypeJsonMarshaller {

    public void marshall(XksProxyConfigurationType xksProxyConfigurationType,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (xksProxyConfigurationType.getConnectivity() != null) {
            String connectivity = xksProxyConfigurationType.getConnectivity();
            jsonWriter.name("Connectivity");
            jsonWriter.value(connectivity);
        }
        if (xksProxyConfigurationType.getAccessKeyId() != null) {
            String accessKeyId = xksProxyConfigurationType.getAccessKeyId();
            jsonWriter.name("AccessKeyId");
            jsonWriter.value(accessKeyId);
        }
        if (xksProxyConfigurationType.getUriEndpoint() != null) {
            String uriEndpoint = xksProxyConfigurationType.getUriEndpoint();
            jsonWriter.name("UriEndpoint");
            jsonWriter.value(uriEndpoint);
        }
        if (xksProxyConfigurationType.getUriPath() != null) {
            String uriPath = xksProxyConfigurationType.getUriPath();
            jsonWriter.name("UriPath");
            jsonWriter.value(uriPath);
        }
        if (xksProxyConfigurationType.getVpcEndpointServiceName() != null) {
            String vpcEndpointServiceName = xksProxyConfigurationType.getVpcEndpointServiceName();
            jsonWriter.name("VpcEndpointServiceName");
            jsonWriter.value(vpcEndpointServiceName);
        }
        jsonWriter.endObject();
    }

    private static XksProxyConfigurationTypeJsonMarshaller instance;

    public static XksProxyConfigurationTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new XksProxyConfigurationTypeJsonMarshaller();
        return instance;
    }
}
