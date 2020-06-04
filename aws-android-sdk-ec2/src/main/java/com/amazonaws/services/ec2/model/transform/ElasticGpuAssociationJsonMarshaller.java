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
 * JSON marshaller for POJO ElasticGpuAssociation
 */
class ElasticGpuAssociationJsonMarshaller {

    public void marshall(ElasticGpuAssociation elasticGpuAssociation, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (elasticGpuAssociation.getElasticGpuId() != null) {
            String elasticGpuId = elasticGpuAssociation.getElasticGpuId();
            jsonWriter.name("ElasticGpuId");
            jsonWriter.value(elasticGpuId);
        }
        if (elasticGpuAssociation.getElasticGpuAssociationId() != null) {
            String elasticGpuAssociationId = elasticGpuAssociation.getElasticGpuAssociationId();
            jsonWriter.name("ElasticGpuAssociationId");
            jsonWriter.value(elasticGpuAssociationId);
        }
        if (elasticGpuAssociation.getElasticGpuAssociationState() != null) {
            String elasticGpuAssociationState = elasticGpuAssociation
                    .getElasticGpuAssociationState();
            jsonWriter.name("ElasticGpuAssociationState");
            jsonWriter.value(elasticGpuAssociationState);
        }
        if (elasticGpuAssociation.getElasticGpuAssociationTime() != null) {
            String elasticGpuAssociationTime = elasticGpuAssociation.getElasticGpuAssociationTime();
            jsonWriter.name("ElasticGpuAssociationTime");
            jsonWriter.value(elasticGpuAssociationTime);
        }
        jsonWriter.endObject();
    }

    private static ElasticGpuAssociationJsonMarshaller instance;

    public static ElasticGpuAssociationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ElasticGpuAssociationJsonMarshaller();
        return instance;
    }
}
