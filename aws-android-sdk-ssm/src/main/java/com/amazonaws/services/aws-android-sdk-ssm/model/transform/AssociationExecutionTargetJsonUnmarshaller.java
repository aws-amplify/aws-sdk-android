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
package com.amazonaws.services.aws-android-sdk-ssm.model.transform;

import com.amazonaws.services.aws-android-sdk-ssm.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;


/**
 * JSON unmarshaller for POJO AssociationExecutionTarget
 */
class AssociationExecutionTargetJsonUnmarshaller implements Unmarshaller<AssociationExecutionTarget, JsonUnmarshallerContext> {

    public AssociationExecutionTarget unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AssociationExecutionTarget associationExecutionTarget = new AssociationExecutionTarget();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AssociationId")) {
                associationExecutionTarget.setAssociationId(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("AssociationVersion")) {
                associationExecutionTarget.setAssociationVersion(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("ExecutionId")) {
                associationExecutionTarget.setExecutionId(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("ResourceId")) {
                associationExecutionTarget.setResourceId(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("ResourceType")) {
                associationExecutionTarget.setResourceType(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Status")) {
                associationExecutionTarget.setStatus(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("DetailedStatus")) {
                associationExecutionTarget.setDetailedStatus(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("LastExecutionDate")) {
                associationExecutionTarget.setLastExecutionDate(DateJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("OutputSource")) {
                associationExecutionTarget.setOutputSource(OutputSourceJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return associationExecutionTarget;
    }

    private static AssociationExecutionTargetJsonUnmarshaller instance;
    public static AssociationExecutionTargetJsonUnmarshaller getInstance() {
        if (instance == null) instance = new AssociationExecutionTargetJsonUnmarshaller();
        return instance;
    }
}
