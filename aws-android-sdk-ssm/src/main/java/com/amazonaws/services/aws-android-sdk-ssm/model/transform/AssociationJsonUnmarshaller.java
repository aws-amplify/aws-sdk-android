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
 * JSON unmarshaller for POJO Association
 */
class AssociationJsonUnmarshaller implements Unmarshaller<Association, JsonUnmarshallerContext> {

    public Association unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Association association = new Association();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Name")) {
                association.setName(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("InstanceId")) {
                association.setInstanceId(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("AssociationId")) {
                association.setAssociationId(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("AssociationVersion")) {
                association.setAssociationVersion(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("DocumentVersion")) {
                association.setDocumentVersion(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Targets")) {
                association.setTargets(new ListUnmarshaller<Target>(TargetJsonUnmarshaller.getInstance()
)
.unmarshall(context));
            } else if (name.equals("LastExecutionDate")) {
                association.setLastExecutionDate(DateJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Overview")) {
                association.setOverview(AssociationOverviewJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("ScheduleExpression")) {
                association.setScheduleExpression(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("AssociationName")) {
                association.setAssociationName(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return association;
    }

    private static AssociationJsonUnmarshaller instance;
    public static AssociationJsonUnmarshaller getInstance() {
        if (instance == null) instance = new AssociationJsonUnmarshaller();
        return instance;
    }
}
