/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ProjectPolicy
 */
class ProjectPolicyJsonUnmarshaller implements Unmarshaller<ProjectPolicy, JsonUnmarshallerContext> {

    public ProjectPolicy unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ProjectPolicy projectPolicy = new ProjectPolicy();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ProjectArn")) {
                projectPolicy.setProjectArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PolicyName")) {
                projectPolicy.setPolicyName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PolicyRevisionId")) {
                projectPolicy.setPolicyRevisionId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PolicyDocument")) {
                projectPolicy.setPolicyDocument(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTimestamp")) {
                projectPolicy.setCreationTimestamp(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastUpdatedTimestamp")) {
                projectPolicy.setLastUpdatedTimestamp(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return projectPolicy;
    }

    private static ProjectPolicyJsonUnmarshaller instance;

    public static ProjectPolicyJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ProjectPolicyJsonUnmarshaller();
        return instance;
    }
}
