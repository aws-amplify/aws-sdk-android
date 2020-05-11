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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ElasticGpus
 */
class ElasticGpusJsonMarshaller {

    public void marshall(ElasticGpus elasticGpus, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (elasticGpus.getElasticGpuId() != null) {
            String elasticGpuId = elasticGpus.getElasticGpuId();
            jsonWriter.name("ElasticGpuId");
            jsonWriter.value(elasticGpuId);
        }
        if (elasticGpus.getAvailabilityZone() != null) {
            String availabilityZone = elasticGpus.getAvailabilityZone();
            jsonWriter.name("AvailabilityZone");
            jsonWriter.value(availabilityZone);
        }
        if (elasticGpus.getElasticGpuType() != null) {
            String elasticGpuType = elasticGpus.getElasticGpuType();
            jsonWriter.name("ElasticGpuType");
            jsonWriter.value(elasticGpuType);
        }
        if (elasticGpus.getElasticGpuHealth() != null) {
            ElasticGpuHealth elasticGpuHealth = elasticGpus.getElasticGpuHealth();
            jsonWriter.name("ElasticGpuHealth");
            ElasticGpuHealthJsonMarshaller.getInstance().marshall(elasticGpuHealth, jsonWriter);
        }
        if (elasticGpus.getElasticGpuState() != null) {
            String elasticGpuState = elasticGpus.getElasticGpuState();
            jsonWriter.name("ElasticGpuState");
            jsonWriter.value(elasticGpuState);
        }
        if (elasticGpus.getInstanceId() != null) {
            String instanceId = elasticGpus.getInstanceId();
            jsonWriter.name("InstanceId");
            jsonWriter.value(instanceId);
        }
        if (elasticGpus.getTags() != null) {
            java.util.List<Tag> tags = elasticGpus.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ElasticGpusJsonMarshaller instance;

    public static ElasticGpusJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ElasticGpusJsonMarshaller();
        return instance;
    }
}
