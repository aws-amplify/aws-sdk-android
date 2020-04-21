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

package com.amazonaws.services.amazonelasticmapreduce.model.transform;

import com.amazonaws.services.amazonelasticmapreduce.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ClusterSummary
 */
class ClusterSummaryJsonMarshaller {

    public void marshall(ClusterSummary clusterSummary, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (clusterSummary.getId() != null) {
            String id = clusterSummary.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (clusterSummary.getName() != null) {
            String name = clusterSummary.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (clusterSummary.getStatus() != null) {
            ClusterStatus status = clusterSummary.getStatus();
            jsonWriter.name("Status");
            ClusterStatusJsonMarshaller.getInstance().marshall(status, jsonWriter);
        }
        if (clusterSummary.getNormalizedInstanceHours() != null) {
            Integer normalizedInstanceHours = clusterSummary.getNormalizedInstanceHours();
            jsonWriter.name("NormalizedInstanceHours");
            jsonWriter.value(normalizedInstanceHours);
        }
        if (clusterSummary.getClusterArn() != null) {
            String clusterArn = clusterSummary.getClusterArn();
            jsonWriter.name("ClusterArn");
            jsonWriter.value(clusterArn);
        }
        if (clusterSummary.getOutpostArn() != null) {
            String outpostArn = clusterSummary.getOutpostArn();
            jsonWriter.name("OutpostArn");
            jsonWriter.value(outpostArn);
        }
        jsonWriter.endObject();
    }

    private static ClusterSummaryJsonMarshaller instance;

    public static ClusterSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ClusterSummaryJsonMarshaller();
        return instance;
    }
}
