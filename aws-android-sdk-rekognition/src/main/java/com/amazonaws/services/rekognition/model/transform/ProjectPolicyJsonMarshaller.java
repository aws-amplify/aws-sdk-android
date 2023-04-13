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
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ProjectPolicy
 */
class ProjectPolicyJsonMarshaller {

    public void marshall(ProjectPolicy projectPolicy, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (projectPolicy.getProjectArn() != null) {
            String projectArn = projectPolicy.getProjectArn();
            jsonWriter.name("ProjectArn");
            jsonWriter.value(projectArn);
        }
        if (projectPolicy.getPolicyName() != null) {
            String policyName = projectPolicy.getPolicyName();
            jsonWriter.name("PolicyName");
            jsonWriter.value(policyName);
        }
        if (projectPolicy.getPolicyRevisionId() != null) {
            String policyRevisionId = projectPolicy.getPolicyRevisionId();
            jsonWriter.name("PolicyRevisionId");
            jsonWriter.value(policyRevisionId);
        }
        if (projectPolicy.getPolicyDocument() != null) {
            String policyDocument = projectPolicy.getPolicyDocument();
            jsonWriter.name("PolicyDocument");
            jsonWriter.value(policyDocument);
        }
        if (projectPolicy.getCreationTimestamp() != null) {
            java.util.Date creationTimestamp = projectPolicy.getCreationTimestamp();
            jsonWriter.name("CreationTimestamp");
            jsonWriter.value(creationTimestamp);
        }
        if (projectPolicy.getLastUpdatedTimestamp() != null) {
            java.util.Date lastUpdatedTimestamp = projectPolicy.getLastUpdatedTimestamp();
            jsonWriter.name("LastUpdatedTimestamp");
            jsonWriter.value(lastUpdatedTimestamp);
        }
        jsonWriter.endObject();
    }

    private static ProjectPolicyJsonMarshaller instance;

    public static ProjectPolicyJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ProjectPolicyJsonMarshaller();
        return instance;
    }
}
