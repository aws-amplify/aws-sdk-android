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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CrawlerTargets
 */
class CrawlerTargetsJsonMarshaller {

    public void marshall(CrawlerTargets crawlerTargets, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (crawlerTargets.getS3Targets() != null) {
            java.util.List<S3Target> s3Targets = crawlerTargets.getS3Targets();
            jsonWriter.name("S3Targets");
            jsonWriter.beginArray();
            for (S3Target s3TargetsItem : s3Targets) {
                if (s3TargetsItem != null) {
                    S3TargetJsonMarshaller.getInstance().marshall(s3TargetsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (crawlerTargets.getJdbcTargets() != null) {
            java.util.List<JdbcTarget> jdbcTargets = crawlerTargets.getJdbcTargets();
            jsonWriter.name("JdbcTargets");
            jsonWriter.beginArray();
            for (JdbcTarget jdbcTargetsItem : jdbcTargets) {
                if (jdbcTargetsItem != null) {
                    JdbcTargetJsonMarshaller.getInstance().marshall(jdbcTargetsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (crawlerTargets.getDynamoDBTargets() != null) {
            java.util.List<DynamoDBTarget> dynamoDBTargets = crawlerTargets.getDynamoDBTargets();
            jsonWriter.name("DynamoDBTargets");
            jsonWriter.beginArray();
            for (DynamoDBTarget dynamoDBTargetsItem : dynamoDBTargets) {
                if (dynamoDBTargetsItem != null) {
                    DynamoDBTargetJsonMarshaller.getInstance().marshall(dynamoDBTargetsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (crawlerTargets.getCatalogTargets() != null) {
            java.util.List<CatalogTarget> catalogTargets = crawlerTargets.getCatalogTargets();
            jsonWriter.name("CatalogTargets");
            jsonWriter.beginArray();
            for (CatalogTarget catalogTargetsItem : catalogTargets) {
                if (catalogTargetsItem != null) {
                    CatalogTargetJsonMarshaller.getInstance().marshall(catalogTargetsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static CrawlerTargetsJsonMarshaller instance;

    public static CrawlerTargetsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CrawlerTargetsJsonMarshaller();
        return instance;
    }
}
