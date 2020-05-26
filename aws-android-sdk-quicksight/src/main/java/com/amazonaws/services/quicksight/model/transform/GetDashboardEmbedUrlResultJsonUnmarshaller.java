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

package com.amazonaws.services.quicksight.model.transform;

import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response GetDashboardEmbedUrlResult
 */
public class GetDashboardEmbedUrlResultJsonUnmarshaller implements
        Unmarshaller<GetDashboardEmbedUrlResult, JsonUnmarshallerContext> {

    public GetDashboardEmbedUrlResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetDashboardEmbedUrlResult getDashboardEmbedUrlResult = new GetDashboardEmbedUrlResult();

        getDashboardEmbedUrlResult.setStatus(context.getHttpResponse().getStatusCode());
        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("EmbedUrl")) {
                getDashboardEmbedUrlResult.setEmbedUrl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                getDashboardEmbedUrlResult.setStatus(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RequestId")) {
                getDashboardEmbedUrlResult.setRequestId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getDashboardEmbedUrlResult;
    }

    private static GetDashboardEmbedUrlResultJsonUnmarshaller instance;

    public static GetDashboardEmbedUrlResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetDashboardEmbedUrlResultJsonUnmarshaller();
        return instance;
    }
}
