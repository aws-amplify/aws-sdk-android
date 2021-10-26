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
 * JSON marshaller for POJO AppInstanceUserEndpointSummary
 */
class AppInstanceUserEndpointSummaryJsonMarshaller {

    public void marshall(AppInstanceUserEndpointSummary appInstanceUserEndpointSummary,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (appInstanceUserEndpointSummary.getAppInstanceUserArn() != null) {
            String appInstanceUserArn = appInstanceUserEndpointSummary.getAppInstanceUserArn();
            jsonWriter.name("AppInstanceUserArn");
            jsonWriter.value(appInstanceUserArn);
        }
        if (appInstanceUserEndpointSummary.getEndpointId() != null) {
            String endpointId = appInstanceUserEndpointSummary.getEndpointId();
            jsonWriter.name("EndpointId");
            jsonWriter.value(endpointId);
        }
        if (appInstanceUserEndpointSummary.getName() != null) {
            String name = appInstanceUserEndpointSummary.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (appInstanceUserEndpointSummary.getType() != null) {
            String type = appInstanceUserEndpointSummary.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (appInstanceUserEndpointSummary.getAllowMessages() != null) {
            String allowMessages = appInstanceUserEndpointSummary.getAllowMessages();
            jsonWriter.name("AllowMessages");
            jsonWriter.value(allowMessages);
        }
        if (appInstanceUserEndpointSummary.getEndpointState() != null) {
            EndpointState endpointState = appInstanceUserEndpointSummary.getEndpointState();
            jsonWriter.name("EndpointState");
            EndpointStateJsonMarshaller.getInstance().marshall(endpointState, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static AppInstanceUserEndpointSummaryJsonMarshaller instance;

    public static AppInstanceUserEndpointSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AppInstanceUserEndpointSummaryJsonMarshaller();
        return instance;
    }
}
