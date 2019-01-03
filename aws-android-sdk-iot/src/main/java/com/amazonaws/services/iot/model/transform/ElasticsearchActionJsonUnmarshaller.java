/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ElasticsearchAction
 */
class ElasticsearchActionJsonUnmarshaller implements
        Unmarshaller<ElasticsearchAction, JsonUnmarshallerContext> {

    public ElasticsearchAction unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ElasticsearchAction elasticsearchAction = new ElasticsearchAction();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("roleArn")) {
                elasticsearchAction.setRoleArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("endpoint")) {
                elasticsearchAction.setEndpoint(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("index")) {
                elasticsearchAction.setIndex(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("type")) {
                elasticsearchAction.setType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("id")) {
                elasticsearchAction.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return elasticsearchAction;
    }

    private static ElasticsearchActionJsonUnmarshaller instance;

    public static ElasticsearchActionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ElasticsearchActionJsonUnmarshaller();
        return instance;
    }
}
