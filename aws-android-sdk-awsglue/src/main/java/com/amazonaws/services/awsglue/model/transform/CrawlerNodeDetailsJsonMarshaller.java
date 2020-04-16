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
 * JSON marshaller for POJO CrawlerNodeDetails
 */
class CrawlerNodeDetailsJsonMarshaller {

    public void marshall(CrawlerNodeDetails crawlerNodeDetails, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (crawlerNodeDetails.getCrawls() != null) {
            java.util.List<Crawl> crawls = crawlerNodeDetails.getCrawls();
            jsonWriter.name("Crawls");
            jsonWriter.beginArray();
            for (Crawl crawlsItem : crawls) {
                if (crawlsItem != null) {
                    CrawlJsonMarshaller.getInstance().marshall(crawlsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static CrawlerNodeDetailsJsonMarshaller instance;

    public static CrawlerNodeDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CrawlerNodeDetailsJsonMarshaller();
        return instance;
    }
}
