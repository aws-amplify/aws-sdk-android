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
 * JSON unmarshaller for response CreatePackagingGroupResult
 */
public class CreatePackagingGroupResultJsonUnmarshaller implements Unmarshaller<CreatePackagingGroupResult, JsonUnmarshallerContext> {

    public CreatePackagingGroupResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreatePackagingGroupResult createPackagingGroupResult = new CreatePackagingGroupResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Arn")) {
                createPackagingGroupResult.setArn(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Authorization")) {
                createPackagingGroupResult.setAuthorization(AuthorizationJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("DomainName")) {
                createPackagingGroupResult.setDomainName(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Id")) {
                createPackagingGroupResult.setId(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Tags")) {
                createPackagingGroupResult.setTags(new MapUnmarshaller<String>(StringJsonUnmarshaller.getInstance()
)
.unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return createPackagingGroupResult;
    }

    private static CreatePackagingGroupResultJsonUnmarshaller instance;
    public static CreatePackagingGroupResultJsonUnmarshaller getInstance() {
        if (instance == null) instance = new CreatePackagingGroupResultJsonUnmarshaller();
        return instance;
    }
}
