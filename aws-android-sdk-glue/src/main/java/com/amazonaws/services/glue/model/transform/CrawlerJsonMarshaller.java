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
 * JSON marshaller for POJO Crawler
 */
class CrawlerJsonMarshaller {

    public void marshall(Crawler crawler, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (crawler.getName() != null) {
            String name = crawler.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (crawler.getRole() != null) {
            String role = crawler.getRole();
            jsonWriter.name("Role");
            jsonWriter.value(role);
        }
        if (crawler.getTargets() != null) {
            CrawlerTargets targets = crawler.getTargets();
            jsonWriter.name("Targets");
            CrawlerTargetsJsonMarshaller.getInstance().marshall(targets, jsonWriter);
        }
        if (crawler.getDatabaseName() != null) {
            String databaseName = crawler.getDatabaseName();
            jsonWriter.name("DatabaseName");
            jsonWriter.value(databaseName);
        }
        if (crawler.getDescription() != null) {
            String description = crawler.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (crawler.getClassifiers() != null) {
            java.util.List<String> classifiers = crawler.getClassifiers();
            jsonWriter.name("Classifiers");
            jsonWriter.beginArray();
            for (String classifiersItem : classifiers) {
                if (classifiersItem != null) {
                    jsonWriter.value(classifiersItem);
                }
            }
            jsonWriter.endArray();
        }
        if (crawler.getSchemaChangePolicy() != null) {
            SchemaChangePolicy schemaChangePolicy = crawler.getSchemaChangePolicy();
            jsonWriter.name("SchemaChangePolicy");
            SchemaChangePolicyJsonMarshaller.getInstance().marshall(schemaChangePolicy, jsonWriter);
        }
        if (crawler.getState() != null) {
            String state = crawler.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (crawler.getTablePrefix() != null) {
            String tablePrefix = crawler.getTablePrefix();
            jsonWriter.name("TablePrefix");
            jsonWriter.value(tablePrefix);
        }
        if (crawler.getSchedule() != null) {
            Schedule schedule = crawler.getSchedule();
            jsonWriter.name("Schedule");
            ScheduleJsonMarshaller.getInstance().marshall(schedule, jsonWriter);
        }
        if (crawler.getCrawlElapsedTime() != null) {
            Long crawlElapsedTime = crawler.getCrawlElapsedTime();
            jsonWriter.name("CrawlElapsedTime");
            jsonWriter.value(crawlElapsedTime);
        }
        if (crawler.getCreationTime() != null) {
            java.util.Date creationTime = crawler.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (crawler.getLastUpdated() != null) {
            java.util.Date lastUpdated = crawler.getLastUpdated();
            jsonWriter.name("LastUpdated");
            jsonWriter.value(lastUpdated);
        }
        if (crawler.getLastCrawl() != null) {
            LastCrawlInfo lastCrawl = crawler.getLastCrawl();
            jsonWriter.name("LastCrawl");
            LastCrawlInfoJsonMarshaller.getInstance().marshall(lastCrawl, jsonWriter);
        }
        if (crawler.getVersion() != null) {
            Long version = crawler.getVersion();
            jsonWriter.name("Version");
            jsonWriter.value(version);
        }
        if (crawler.getConfiguration() != null) {
            String configuration = crawler.getConfiguration();
            jsonWriter.name("Configuration");
            jsonWriter.value(configuration);
        }
        if (crawler.getCrawlerSecurityConfiguration() != null) {
            String crawlerSecurityConfiguration = crawler.getCrawlerSecurityConfiguration();
            jsonWriter.name("CrawlerSecurityConfiguration");
            jsonWriter.value(crawlerSecurityConfiguration);
        }
        jsonWriter.endObject();
    }

    private static CrawlerJsonMarshaller instance;

    public static CrawlerJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CrawlerJsonMarshaller();
        return instance;
    }
}
