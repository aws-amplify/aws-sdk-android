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
package com.amazonaws.services.mediapackage-vod.model.transform;

import com.amazonaws.services.mediapackage-vod.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;


/**
 * JSON unmarshaller for response UpdatePackagingGroupResult
 */
public class UpdatePackagingGroupResultJsonUnmarshaller implements Unmarshaller<UpdatePackagingGroupResult, JsonUnmarshallerContext> {

    public UpdatePackagingGroupResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdatePackagingGroupResult updatePackagingGroupResult = new UpdatePackagingGroupResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Arn")) {
                updatePackagingGroupResult.setArn(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Authorization")) {
                updatePackagingGroupResult.setAuthorization(AuthorizationJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("DomainName")) {
                updatePackagingGroupResult.setDomainName(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Id")) {
                updatePackagingGroupResult.setId(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Tags")) {
                updatePackagingGroupResult.setTags(new MapUnmarshaller<String>(StringJsonUnmarshaller.getInstance()
)
.unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return updatePackagingGroupResult;
    }

    private static UpdatePackagingGroupResultJsonUnmarshaller instance;
    public static UpdatePackagingGroupResultJsonUnmarshaller getInstance() {
        if (instance == null) instance = new UpdatePackagingGroupResultJsonUnmarshaller();
        return instance;
    }
}
