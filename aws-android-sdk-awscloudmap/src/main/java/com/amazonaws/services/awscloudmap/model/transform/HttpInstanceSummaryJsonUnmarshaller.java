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

package com.amazonaws.services.awscloudmap.model.transform;

import com.amazonaws.services.awscloudmap.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO HttpInstanceSummary
 */
class HttpInstanceSummaryJsonUnmarshaller implements
        Unmarshaller<HttpInstanceSummary, JsonUnmarshallerContext> {

    public HttpInstanceSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        HttpInstanceSummary httpInstanceSummary = new HttpInstanceSummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("InstanceId")) {
                httpInstanceSummary.setInstanceId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NamespaceName")) {
                httpInstanceSummary.setNamespaceName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ServiceName")) {
                httpInstanceSummary.setServiceName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("HealthStatus")) {
                httpInstanceSummary.setHealthStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Attributes")) {
                httpInstanceSummary.setAttributes(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return httpInstanceSummary;
    }

    private static HttpInstanceSummaryJsonUnmarshaller instance;

    public static HttpInstanceSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new HttpInstanceSummaryJsonUnmarshaller();
        return instance;
    }
}
