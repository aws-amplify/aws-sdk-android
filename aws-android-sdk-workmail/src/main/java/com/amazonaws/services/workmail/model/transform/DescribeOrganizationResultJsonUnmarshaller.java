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

package com.amazonaws.services.workmail.model.transform;

import com.amazonaws.services.workmail.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DescribeOrganizationResult
 */
public class DescribeOrganizationResultJsonUnmarshaller implements
        Unmarshaller<DescribeOrganizationResult, JsonUnmarshallerContext> {

    public DescribeOrganizationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeOrganizationResult describeOrganizationResult = new DescribeOrganizationResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("OrganizationId")) {
                describeOrganizationResult.setOrganizationId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Alias")) {
                describeOrganizationResult.setAlias(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("State")) {
                describeOrganizationResult.setState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DirectoryId")) {
                describeOrganizationResult.setDirectoryId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DirectoryType")) {
                describeOrganizationResult.setDirectoryType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DefaultMailDomain")) {
                describeOrganizationResult.setDefaultMailDomain(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("CompletedDate")) {
                describeOrganizationResult.setCompletedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ErrorMessage")) {
                describeOrganizationResult.setErrorMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ARN")) {
                describeOrganizationResult.setARN(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeOrganizationResult;
    }

    private static DescribeOrganizationResultJsonUnmarshaller instance;

    public static DescribeOrganizationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeOrganizationResultJsonUnmarshaller();
        return instance;
    }
}
