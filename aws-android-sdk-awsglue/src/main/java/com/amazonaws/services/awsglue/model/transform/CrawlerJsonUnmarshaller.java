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
 * JSON unmarshaller for POJO Crawler
 */
class CrawlerJsonUnmarshaller implements Unmarshaller<Crawler, JsonUnmarshallerContext> {

    public Crawler unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Crawler crawler = new Crawler();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Name")) {
                crawler.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Role")) {
                crawler.setRole(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Targets")) {
                crawler.setTargets(CrawlerTargetsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DatabaseName")) {
                crawler.setDatabaseName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                crawler.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Classifiers")) {
                crawler.setClassifiers(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("SchemaChangePolicy")) {
                crawler.setSchemaChangePolicy(SchemaChangePolicyJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("State")) {
                crawler.setState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TablePrefix")) {
                crawler.setTablePrefix(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Schedule")) {
                crawler.setSchedule(ScheduleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CrawlElapsedTime")) {
                crawler.setCrawlElapsedTime(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                crawler.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastUpdated")) {
                crawler.setLastUpdated(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastCrawl")) {
                crawler.setLastCrawl(LastCrawlInfoJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Version")) {
                crawler.setVersion(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Configuration")) {
                crawler.setConfiguration(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CrawlerSecurityConfiguration")) {
                crawler.setCrawlerSecurityConfiguration(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return crawler;
    }

    private static CrawlerJsonUnmarshaller instance;

    public static CrawlerJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CrawlerJsonUnmarshaller();
        return instance;
    }
}
