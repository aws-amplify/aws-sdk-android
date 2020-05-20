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

package com.amazonaws.services.appmesh.model.transform;

import com.amazonaws.services.appmesh.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AwsCloudMapServiceDiscovery
 */
class AwsCloudMapServiceDiscoveryJsonMarshaller {

    public void marshall(AwsCloudMapServiceDiscovery awsCloudMapServiceDiscovery,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (awsCloudMapServiceDiscovery.getAttributes() != null) {
            java.util.List<AwsCloudMapInstanceAttribute> attributes = awsCloudMapServiceDiscovery
                    .getAttributes();
            jsonWriter.name("attributes");
            jsonWriter.beginArray();
            for (AwsCloudMapInstanceAttribute attributesItem : attributes) {
                if (attributesItem != null) {
                    AwsCloudMapInstanceAttributeJsonMarshaller.getInstance().marshall(
                            attributesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (awsCloudMapServiceDiscovery.getNamespaceName() != null) {
            String namespaceName = awsCloudMapServiceDiscovery.getNamespaceName();
            jsonWriter.name("namespaceName");
            jsonWriter.value(namespaceName);
        }
        if (awsCloudMapServiceDiscovery.getServiceName() != null) {
            String serviceName = awsCloudMapServiceDiscovery.getServiceName();
            jsonWriter.name("serviceName");
            jsonWriter.value(serviceName);
        }
        jsonWriter.endObject();
    }

    private static AwsCloudMapServiceDiscoveryJsonMarshaller instance;

    public static AwsCloudMapServiceDiscoveryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AwsCloudMapServiceDiscoveryJsonMarshaller();
        return instance;
    }
}
