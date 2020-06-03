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

package com.amazonaws.services.es.model.transform;

import com.amazonaws.services.es.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ElasticsearchClusterConfig
 */
class ElasticsearchClusterConfigJsonMarshaller {

    public void marshall(ElasticsearchClusterConfig elasticsearchClusterConfig,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (elasticsearchClusterConfig.getInstanceType() != null) {
            String instanceType = elasticsearchClusterConfig.getInstanceType();
            jsonWriter.name("InstanceType");
            jsonWriter.value(instanceType);
        }
        if (elasticsearchClusterConfig.getInstanceCount() != null) {
            Integer instanceCount = elasticsearchClusterConfig.getInstanceCount();
            jsonWriter.name("InstanceCount");
            jsonWriter.value(instanceCount);
        }
        if (elasticsearchClusterConfig.getDedicatedMasterEnabled() != null) {
            Boolean dedicatedMasterEnabled = elasticsearchClusterConfig.getDedicatedMasterEnabled();
            jsonWriter.name("DedicatedMasterEnabled");
            jsonWriter.value(dedicatedMasterEnabled);
        }
        if (elasticsearchClusterConfig.getZoneAwarenessEnabled() != null) {
            Boolean zoneAwarenessEnabled = elasticsearchClusterConfig.getZoneAwarenessEnabled();
            jsonWriter.name("ZoneAwarenessEnabled");
            jsonWriter.value(zoneAwarenessEnabled);
        }
        if (elasticsearchClusterConfig.getZoneAwarenessConfig() != null) {
            ZoneAwarenessConfig zoneAwarenessConfig = elasticsearchClusterConfig
                    .getZoneAwarenessConfig();
            jsonWriter.name("ZoneAwarenessConfig");
            ZoneAwarenessConfigJsonMarshaller.getInstance().marshall(zoneAwarenessConfig,
                    jsonWriter);
        }
        if (elasticsearchClusterConfig.getDedicatedMasterType() != null) {
            String dedicatedMasterType = elasticsearchClusterConfig.getDedicatedMasterType();
            jsonWriter.name("DedicatedMasterType");
            jsonWriter.value(dedicatedMasterType);
        }
        if (elasticsearchClusterConfig.getDedicatedMasterCount() != null) {
            Integer dedicatedMasterCount = elasticsearchClusterConfig.getDedicatedMasterCount();
            jsonWriter.name("DedicatedMasterCount");
            jsonWriter.value(dedicatedMasterCount);
        }
        if (elasticsearchClusterConfig.getWarmEnabled() != null) {
            Boolean warmEnabled = elasticsearchClusterConfig.getWarmEnabled();
            jsonWriter.name("WarmEnabled");
            jsonWriter.value(warmEnabled);
        }
        if (elasticsearchClusterConfig.getWarmType() != null) {
            String warmType = elasticsearchClusterConfig.getWarmType();
            jsonWriter.name("WarmType");
            jsonWriter.value(warmType);
        }
        if (elasticsearchClusterConfig.getWarmCount() != null) {
            Integer warmCount = elasticsearchClusterConfig.getWarmCount();
            jsonWriter.name("WarmCount");
            jsonWriter.value(warmCount);
        }
        jsonWriter.endObject();
    }

    private static ElasticsearchClusterConfigJsonMarshaller instance;

    public static ElasticsearchClusterConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ElasticsearchClusterConfigJsonMarshaller();
        return instance;
    }
}
