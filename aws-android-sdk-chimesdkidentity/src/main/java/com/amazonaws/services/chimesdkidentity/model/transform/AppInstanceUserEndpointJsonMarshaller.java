/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.chimesdkidentity.model.transform;

import com.amazonaws.services.chimesdkidentity.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AppInstanceUserEndpoint
 */
class AppInstanceUserEndpointJsonMarshaller {

    public void marshall(AppInstanceUserEndpoint appInstanceUserEndpoint, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (appInstanceUserEndpoint.getAppInstanceUserArn() != null) {
            String appInstanceUserArn = appInstanceUserEndpoint.getAppInstanceUserArn();
            jsonWriter.name("AppInstanceUserArn");
            jsonWriter.value(appInstanceUserArn);
        }
        if (appInstanceUserEndpoint.getEndpointId() != null) {
            String endpointId = appInstanceUserEndpoint.getEndpointId();
            jsonWriter.name("EndpointId");
            jsonWriter.value(endpointId);
        }
        if (appInstanceUserEndpoint.getName() != null) {
            String name = appInstanceUserEndpoint.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (appInstanceUserEndpoint.getType() != null) {
            String type = appInstanceUserEndpoint.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (appInstanceUserEndpoint.getResourceArn() != null) {
            String resourceArn = appInstanceUserEndpoint.getResourceArn();
            jsonWriter.name("ResourceArn");
            jsonWriter.value(resourceArn);
        }
        if (appInstanceUserEndpoint.getEndpointAttributes() != null) {
            EndpointAttributes endpointAttributes = appInstanceUserEndpoint.getEndpointAttributes();
            jsonWriter.name("EndpointAttributes");
            EndpointAttributesJsonMarshaller.getInstance().marshall(endpointAttributes, jsonWriter);
        }
        if (appInstanceUserEndpoint.getCreatedTimestamp() != null) {
            java.util.Date createdTimestamp = appInstanceUserEndpoint.getCreatedTimestamp();
            jsonWriter.name("CreatedTimestamp");
            jsonWriter.value(createdTimestamp);
        }
        if (appInstanceUserEndpoint.getLastUpdatedTimestamp() != null) {
            java.util.Date lastUpdatedTimestamp = appInstanceUserEndpoint.getLastUpdatedTimestamp();
            jsonWriter.name("LastUpdatedTimestamp");
            jsonWriter.value(lastUpdatedTimestamp);
        }
        if (appInstanceUserEndpoint.getAllowMessages() != null) {
            String allowMessages = appInstanceUserEndpoint.getAllowMessages();
            jsonWriter.name("AllowMessages");
            jsonWriter.value(allowMessages);
        }
        if (appInstanceUserEndpoint.getEndpointState() != null) {
            EndpointState endpointState = appInstanceUserEndpoint.getEndpointState();
            jsonWriter.name("EndpointState");
            EndpointStateJsonMarshaller.getInstance().marshall(endpointState, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static AppInstanceUserEndpointJsonMarshaller instance;

    public static AppInstanceUserEndpointJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AppInstanceUserEndpointJsonMarshaller();
        return instance;
    }
}
