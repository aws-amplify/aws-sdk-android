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

package com.amazonaws.services.glue.model.transform;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CrawlerMetrics
 */
class CrawlerMetricsJsonMarshaller {

    public void marshall(CrawlerMetrics crawlerMetrics, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (crawlerMetrics.getCrawlerName() != null) {
            String crawlerName = crawlerMetrics.getCrawlerName();
            jsonWriter.name("CrawlerName");
            jsonWriter.value(crawlerName);
        }
        if (crawlerMetrics.getTimeLeftSeconds() != null) {
            Double timeLeftSeconds = crawlerMetrics.getTimeLeftSeconds();
            jsonWriter.name("TimeLeftSeconds");
            jsonWriter.value(timeLeftSeconds);
        }
        if (crawlerMetrics.getStillEstimating() != null) {
            Boolean stillEstimating = crawlerMetrics.getStillEstimating();
            jsonWriter.name("StillEstimating");
            jsonWriter.value(stillEstimating);
        }
        if (crawlerMetrics.getLastRuntimeSeconds() != null) {
            Double lastRuntimeSeconds = crawlerMetrics.getLastRuntimeSeconds();
            jsonWriter.name("LastRuntimeSeconds");
            jsonWriter.value(lastRuntimeSeconds);
        }
        if (crawlerMetrics.getMedianRuntimeSeconds() != null) {
            Double medianRuntimeSeconds = crawlerMetrics.getMedianRuntimeSeconds();
            jsonWriter.name("MedianRuntimeSeconds");
            jsonWriter.value(medianRuntimeSeconds);
        }
        if (crawlerMetrics.getTablesCreated() != null) {
            Integer tablesCreated = crawlerMetrics.getTablesCreated();
            jsonWriter.name("TablesCreated");
            jsonWriter.value(tablesCreated);
        }
        if (crawlerMetrics.getTablesUpdated() != null) {
            Integer tablesUpdated = crawlerMetrics.getTablesUpdated();
            jsonWriter.name("TablesUpdated");
            jsonWriter.value(tablesUpdated);
        }
        if (crawlerMetrics.getTablesDeleted() != null) {
            Integer tablesDeleted = crawlerMetrics.getTablesDeleted();
            jsonWriter.name("TablesDeleted");
            jsonWriter.value(tablesDeleted);
        }
        jsonWriter.endObject();
    }

    private static CrawlerMetricsJsonMarshaller instance;

    public static CrawlerMetricsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CrawlerMetricsJsonMarshaller();
        return instance;
    }
}
