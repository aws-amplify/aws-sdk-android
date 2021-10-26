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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO AppInstanceUserEndpointSummary
 */
class AppInstanceUserEndpointSummaryJsonUnmarshaller implements
        Unmarshaller<AppInstanceUserEndpointSummary, JsonUnmarshallerContext> {

    public AppInstanceUserEndpointSummary unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AppInstanceUserEndpointSummary appInstanceUserEndpointSummary = new AppInstanceUserEndpointSummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AppInstanceUserArn")) {
                appInstanceUserEndpointSummary.setAppInstanceUserArn(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("EndpointId")) {
                appInstanceUserEndpointSummary.setEndpointId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                appInstanceUserEndpointSummary.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Type")) {
                appInstanceUserEndpointSummary.setType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AllowMessages")) {
                appInstanceUserEndpointSummary.setAllowMessages(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("EndpointState")) {
                appInstanceUserEndpointSummary.setEndpointState(EndpointStateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return appInstanceUserEndpointSummary;
    }

    private static AppInstanceUserEndpointSummaryJsonUnmarshaller instance;

    public static AppInstanceUserEndpointSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AppInstanceUserEndpointSummaryJsonUnmarshaller();
        return instance;
    }
}
