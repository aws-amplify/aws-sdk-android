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
 * JSON unmarshaller for POJO CrawlerMetrics
 */
class CrawlerMetricsJsonUnmarshaller implements
        Unmarshaller<CrawlerMetrics, JsonUnmarshallerContext> {

    public CrawlerMetrics unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        CrawlerMetrics crawlerMetrics = new CrawlerMetrics();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("CrawlerName")) {
                crawlerMetrics.setCrawlerName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TimeLeftSeconds")) {
                crawlerMetrics.setTimeLeftSeconds(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StillEstimating")) {
                crawlerMetrics.setStillEstimating(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastRuntimeSeconds")) {
                crawlerMetrics.setLastRuntimeSeconds(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MedianRuntimeSeconds")) {
                crawlerMetrics.setMedianRuntimeSeconds(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TablesCreated")) {
                crawlerMetrics.setTablesCreated(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TablesUpdated")) {
                crawlerMetrics.setTablesUpdated(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TablesDeleted")) {
                crawlerMetrics.setTablesDeleted(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return crawlerMetrics;
    }

    private static CrawlerMetricsJsonUnmarshaller instance;

    public static CrawlerMetricsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CrawlerMetricsJsonUnmarshaller();
        return instance;
    }
}
