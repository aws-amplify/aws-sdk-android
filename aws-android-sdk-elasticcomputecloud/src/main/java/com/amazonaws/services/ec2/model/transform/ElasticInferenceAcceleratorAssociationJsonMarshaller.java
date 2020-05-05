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
 * JSON marshaller for POJO ElasticInferenceAcceleratorAssociation
 */
class ElasticInferenceAcceleratorAssociationJsonMarshaller {

    public void marshall(
            ElasticInferenceAcceleratorAssociation elasticInferenceAcceleratorAssociation,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (elasticInferenceAcceleratorAssociation.getElasticInferenceAcceleratorArn() != null) {
            String elasticInferenceAcceleratorArn = elasticInferenceAcceleratorAssociation
                    .getElasticInferenceAcceleratorArn();
            jsonWriter.name("ElasticInferenceAcceleratorArn");
            jsonWriter.value(elasticInferenceAcceleratorArn);
        }
        if (elasticInferenceAcceleratorAssociation.getElasticInferenceAcceleratorAssociationId() != null) {
            String elasticInferenceAcceleratorAssociationId = elasticInferenceAcceleratorAssociation
                    .getElasticInferenceAcceleratorAssociationId();
            jsonWriter.name("ElasticInferenceAcceleratorAssociationId");
            jsonWriter.value(elasticInferenceAcceleratorAssociationId);
        }
        if (elasticInferenceAcceleratorAssociation.getElasticInferenceAcceleratorAssociationState() != null) {
            String elasticInferenceAcceleratorAssociationState = elasticInferenceAcceleratorAssociation
                    .getElasticInferenceAcceleratorAssociationState();
            jsonWriter.name("ElasticInferenceAcceleratorAssociationState");
            jsonWriter.value(elasticInferenceAcceleratorAssociationState);
        }
        if (elasticInferenceAcceleratorAssociation.getElasticInferenceAcceleratorAssociationTime() != null) {
            java.util.Date elasticInferenceAcceleratorAssociationTime = elasticInferenceAcceleratorAssociation
                    .getElasticInferenceAcceleratorAssociationTime();
            jsonWriter.name("ElasticInferenceAcceleratorAssociationTime");
            jsonWriter.value(elasticInferenceAcceleratorAssociationTime);
        }
        jsonWriter.endObject();
    }

    private static ElasticInferenceAcceleratorAssociationJsonMarshaller instance;

    public static ElasticInferenceAcceleratorAssociationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ElasticInferenceAcceleratorAssociationJsonMarshaller();
        return instance;
    }
}
