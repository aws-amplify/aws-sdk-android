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

package com.amazonaws.services.ssm.model.transform;

import com.amazonaws.services.ssm.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO InstanceAssociation
 */
class InstanceAssociationJsonMarshaller {

    public void marshall(InstanceAssociation instanceAssociation, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (instanceAssociation.getAssociationId() != null) {
            String associationId = instanceAssociation.getAssociationId();
            jsonWriter.name("AssociationId");
            jsonWriter.value(associationId);
        }
        if (instanceAssociation.getInstanceId() != null) {
            String instanceId = instanceAssociation.getInstanceId();
            jsonWriter.name("InstanceId");
            jsonWriter.value(instanceId);
        }
        if (instanceAssociation.getContent() != null) {
            String content = instanceAssociation.getContent();
            jsonWriter.name("Content");
            jsonWriter.value(content);
        }
        if (instanceAssociation.getAssociationVersion() != null) {
            String associationVersion = instanceAssociation.getAssociationVersion();
            jsonWriter.name("AssociationVersion");
            jsonWriter.value(associationVersion);
        }
        jsonWriter.endObject();
    }

    private static InstanceAssociationJsonMarshaller instance;

    public static InstanceAssociationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceAssociationJsonMarshaller();
        return instance;
    }
}
