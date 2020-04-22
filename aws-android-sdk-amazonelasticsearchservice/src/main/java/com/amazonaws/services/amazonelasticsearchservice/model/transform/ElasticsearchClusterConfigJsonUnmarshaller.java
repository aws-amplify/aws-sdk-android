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

package com.amazonaws.services.amazonelasticsearchservice.model.transform;

import com.amazonaws.services.amazonelasticsearchservice.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ElasticsearchClusterConfig
 */
class ElasticsearchClusterConfigJsonUnmarshaller implements
        Unmarshaller<ElasticsearchClusterConfig, JsonUnmarshallerContext> {

    public ElasticsearchClusterConfig unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ElasticsearchClusterConfig elasticsearchClusterConfig = new ElasticsearchClusterConfig();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("InstanceType")) {
                elasticsearchClusterConfig.setInstanceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceCount")) {
                elasticsearchClusterConfig.setInstanceCount(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DedicatedMasterEnabled")) {
                elasticsearchClusterConfig.setDedicatedMasterEnabled(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ZoneAwarenessEnabled")) {
                elasticsearchClusterConfig.setZoneAwarenessEnabled(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ZoneAwarenessConfig")) {
                elasticsearchClusterConfig
                        .setZoneAwarenessConfig(ZoneAwarenessConfigJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("DedicatedMasterType")) {
                elasticsearchClusterConfig.setDedicatedMasterType(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("DedicatedMasterCount")) {
                elasticsearchClusterConfig.setDedicatedMasterCount(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("WarmEnabled")) {
                elasticsearchClusterConfig.setWarmEnabled(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("WarmType")) {
                elasticsearchClusterConfig.setWarmType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("WarmCount")) {
                elasticsearchClusterConfig.setWarmCount(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return elasticsearchClusterConfig;
    }

    private static ElasticsearchClusterConfigJsonUnmarshaller instance;

    public static ElasticsearchClusterConfigJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ElasticsearchClusterConfigJsonUnmarshaller();
        return instance;
    }
}
