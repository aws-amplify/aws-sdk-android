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
 * JSON unmarshaller for POJO PackagingGroup
 */
class PackagingGroupJsonUnmarshaller implements Unmarshaller<PackagingGroup, JsonUnmarshallerContext> {

    public PackagingGroup unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        PackagingGroup packagingGroup = new PackagingGroup();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Arn")) {
                packagingGroup.setArn(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Authorization")) {
                packagingGroup.setAuthorization(AuthorizationJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("DomainName")) {
                packagingGroup.setDomainName(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Id")) {
                packagingGroup.setId(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Tags")) {
                packagingGroup.setTags(new MapUnmarshaller<String>(StringJsonUnmarshaller.getInstance()
)
.unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return packagingGroup;
    }

    private static PackagingGroupJsonUnmarshaller instance;
    public static PackagingGroupJsonUnmarshaller getInstance() {
        if (instance == null) instance = new PackagingGroupJsonUnmarshaller();
        return instance;
    }
}
