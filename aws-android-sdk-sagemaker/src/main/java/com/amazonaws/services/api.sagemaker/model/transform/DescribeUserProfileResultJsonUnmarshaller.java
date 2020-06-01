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

package com.amazonaws.services.api.sagemaker.model.transform;

import com.amazonaws.services.api.sagemaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DescribeUserProfileResult
 */
public class DescribeUserProfileResultJsonUnmarshaller implements
        Unmarshaller<DescribeUserProfileResult, JsonUnmarshallerContext> {

    public DescribeUserProfileResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeUserProfileResult describeUserProfileResult = new DescribeUserProfileResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("DomainId")) {
                describeUserProfileResult.setDomainId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("UserProfileArn")) {
                describeUserProfileResult.setUserProfileArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("UserProfileName")) {
                describeUserProfileResult.setUserProfileName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("HomeEfsFileSystemUid")) {
                describeUserProfileResult.setHomeEfsFileSystemUid(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                describeUserProfileResult.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedTime")) {
                describeUserProfileResult.setLastModifiedTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                describeUserProfileResult.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FailureReason")) {
                describeUserProfileResult.setFailureReason(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SingleSignOnUserIdentifier")) {
                describeUserProfileResult.setSingleSignOnUserIdentifier(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("SingleSignOnUserValue")) {
                describeUserProfileResult.setSingleSignOnUserValue(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("UserSettings")) {
                describeUserProfileResult.setUserSettings(UserSettingsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeUserProfileResult;
    }

    private static DescribeUserProfileResultJsonUnmarshaller instance;

    public static DescribeUserProfileResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeUserProfileResultJsonUnmarshaller();
        return instance;
    }
}
