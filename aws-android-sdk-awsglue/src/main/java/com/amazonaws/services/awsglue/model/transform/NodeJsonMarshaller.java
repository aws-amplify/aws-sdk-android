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
 * JSON marshaller for POJO Node
 */
class NodeJsonMarshaller {

    public void marshall(Node node, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (node.getType() != null) {
            String type = node.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (node.getName() != null) {
            String name = node.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (node.getUniqueId() != null) {
            String uniqueId = node.getUniqueId();
            jsonWriter.name("UniqueId");
            jsonWriter.value(uniqueId);
        }
        if (node.getTriggerDetails() != null) {
            TriggerNodeDetails triggerDetails = node.getTriggerDetails();
            jsonWriter.name("TriggerDetails");
            TriggerNodeDetailsJsonMarshaller.getInstance().marshall(triggerDetails, jsonWriter);
        }
        if (node.getJobDetails() != null) {
            JobNodeDetails jobDetails = node.getJobDetails();
            jsonWriter.name("JobDetails");
            JobNodeDetailsJsonMarshaller.getInstance().marshall(jobDetails, jsonWriter);
        }
        if (node.getCrawlerDetails() != null) {
            CrawlerNodeDetails crawlerDetails = node.getCrawlerDetails();
            jsonWriter.name("CrawlerDetails");
            CrawlerNodeDetailsJsonMarshaller.getInstance().marshall(crawlerDetails, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static NodeJsonMarshaller instance;

    public static NodeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NodeJsonMarshaller();
        return instance;
    }
}
