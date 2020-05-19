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

package com.amazonaws.services.health.model.transform;

import com.amazonaws.services.health.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO AffectedEntity
 */
class AffectedEntityJsonUnmarshaller implements
        Unmarshaller<AffectedEntity, JsonUnmarshallerContext> {

    public AffectedEntity unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AffectedEntity affectedEntity = new AffectedEntity();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("entityArn")) {
                affectedEntity.setEntityArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("eventArn")) {
                affectedEntity.setEventArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("entityValue")) {
                affectedEntity.setEntityValue(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("entityUrl")) {
                affectedEntity.setEntityUrl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("awsAccountId")) {
                affectedEntity.setAwsAccountId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastUpdatedTime")) {
                affectedEntity.setLastUpdatedTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("statusCode")) {
                affectedEntity.setStatusCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("tags")) {
                affectedEntity.setTags(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return affectedEntity;
    }

    private static AffectedEntityJsonUnmarshaller instance;

    public static AffectedEntityJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AffectedEntityJsonUnmarshaller();
        return instance;
    }
}
