/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO UserImportJobType
 */
class UserImportJobTypeJsonUnmarshaller implements
        Unmarshaller<UserImportJobType, JsonUnmarshallerContext> {

    public UserImportJobType unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        UserImportJobType userImportJobType = new UserImportJobType();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("JobName")) {
                userImportJobType.setJobName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("JobId")) {
                userImportJobType.setJobId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("UserPoolId")) {
                userImportJobType.setUserPoolId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PreSignedUrl")) {
                userImportJobType.setPreSignedUrl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationDate")) {
                userImportJobType.setCreationDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StartDate")) {
                userImportJobType.setStartDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CompletionDate")) {
                userImportJobType.setCompletionDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                userImportJobType.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CloudWatchLogsRoleArn")) {
                userImportJobType.setCloudWatchLogsRoleArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ImportedUsers")) {
                userImportJobType.setImportedUsers(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SkippedUsers")) {
                userImportJobType.setSkippedUsers(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FailedUsers")) {
                userImportJobType.setFailedUsers(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CompletionMessage")) {
                userImportJobType.setCompletionMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return userImportJobType;
    }

    private static UserImportJobTypeJsonUnmarshaller instance;

    public static UserImportJobTypeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UserImportJobTypeJsonUnmarshaller();
        return instance;
    }
}
