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

package com.amazonaws.services.accessanalyzer.model.transform;

import com.amazonaws.services.accessanalyzer.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO AnalyzedResource
 */
class AnalyzedResourceJsonUnmarshaller implements
        Unmarshaller<AnalyzedResource, JsonUnmarshallerContext> {

    public AnalyzedResource unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AnalyzedResource analyzedResource = new AnalyzedResource();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("actions")) {
                analyzedResource.setActions(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("analyzedAt")) {
                analyzedResource.setAnalyzedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("createdAt")) {
                analyzedResource.setCreatedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("error")) {
                analyzedResource.setError(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("isPublic")) {
                analyzedResource.setIsPublic(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("resourceArn")) {
                analyzedResource.setResourceArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("resourceOwnerAccount")) {
                analyzedResource.setResourceOwnerAccount(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("resourceType")) {
                analyzedResource.setResourceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("sharedVia")) {
                analyzedResource.setSharedVia(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("status")) {
                analyzedResource.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("updatedAt")) {
                analyzedResource.setUpdatedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return analyzedResource;
    }

    private static AnalyzedResourceJsonUnmarshaller instance;

    public static AnalyzedResourceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AnalyzedResourceJsonUnmarshaller();
        return instance;
    }
}
