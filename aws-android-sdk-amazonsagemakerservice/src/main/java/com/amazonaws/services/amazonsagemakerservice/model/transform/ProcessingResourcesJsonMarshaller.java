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

package com.amazonaws.services.amazonsagemakerservice.model.transform;

import com.amazonaws.services.amazonsagemakerservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ProcessingResources
 */
class ProcessingResourcesJsonMarshaller {

    public void marshall(ProcessingResources processingResources, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (processingResources.getClusterConfig() != null) {
            ProcessingClusterConfig clusterConfig = processingResources.getClusterConfig();
            jsonWriter.name("ClusterConfig");
            ProcessingClusterConfigJsonMarshaller.getInstance().marshall(clusterConfig, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ProcessingResourcesJsonMarshaller instance;

    public static ProcessingResourcesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ProcessingResourcesJsonMarshaller();
        return instance;
    }
}
