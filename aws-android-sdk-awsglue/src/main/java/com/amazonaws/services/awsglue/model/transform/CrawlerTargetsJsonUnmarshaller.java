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

package com.amazonaws.services.awsglue.model.transform;

import com.amazonaws.services.awsglue.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO CrawlerTargets
 */
class CrawlerTargetsJsonUnmarshaller implements
        Unmarshaller<CrawlerTargets, JsonUnmarshallerContext> {

    public CrawlerTargets unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        CrawlerTargets crawlerTargets = new CrawlerTargets();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("S3Targets")) {
                crawlerTargets.setS3Targets(new ListUnmarshaller<S3Target>(S3TargetJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("JdbcTargets")) {
                crawlerTargets.setJdbcTargets(new ListUnmarshaller<JdbcTarget>(
                        JdbcTargetJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("DynamoDBTargets")) {
                crawlerTargets.setDynamoDBTargets(new ListUnmarshaller<DynamoDBTarget>(
                        DynamoDBTargetJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("CatalogTargets")) {
                crawlerTargets.setCatalogTargets(new ListUnmarshaller<CatalogTarget>(
                        CatalogTargetJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return crawlerTargets;
    }

    private static CrawlerTargetsJsonUnmarshaller instance;

    public static CrawlerTargetsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CrawlerTargetsJsonUnmarshaller();
        return instance;
    }
}
