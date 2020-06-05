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

package com.amazonaws.services.servicecatalog.model.transform;

import com.amazonaws.services.servicecatalog.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ResourceChangeDetail
 */
class ResourceChangeDetailJsonMarshaller {

    public void marshall(ResourceChangeDetail resourceChangeDetail, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (resourceChangeDetail.getTarget() != null) {
            ResourceTargetDefinition target = resourceChangeDetail.getTarget();
            jsonWriter.name("Target");
            ResourceTargetDefinitionJsonMarshaller.getInstance().marshall(target, jsonWriter);
        }
        if (resourceChangeDetail.getEvaluation() != null) {
            String evaluation = resourceChangeDetail.getEvaluation();
            jsonWriter.name("Evaluation");
            jsonWriter.value(evaluation);
        }
        if (resourceChangeDetail.getCausingEntity() != null) {
            String causingEntity = resourceChangeDetail.getCausingEntity();
            jsonWriter.name("CausingEntity");
            jsonWriter.value(causingEntity);
        }
        jsonWriter.endObject();
    }

    private static ResourceChangeDetailJsonMarshaller instance;

    public static ResourceChangeDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ResourceChangeDetailJsonMarshaller();
        return instance;
    }
}
