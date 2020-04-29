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

package com.amazonaws.services.awsiotsitewise.model.transform;

import com.amazonaws.services.awsiotsitewise.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DescribePortalResult
 */
public class DescribePortalResultJsonUnmarshaller implements
        Unmarshaller<DescribePortalResult, JsonUnmarshallerContext> {

    public DescribePortalResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribePortalResult describePortalResult = new DescribePortalResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("portalId")) {
                describePortalResult.setPortalId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("portalArn")) {
                describePortalResult.setPortalArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("portalName")) {
                describePortalResult.setPortalName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("portalDescription")) {
                describePortalResult.setPortalDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("portalClientId")) {
                describePortalResult.setPortalClientId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("portalStartUrl")) {
                describePortalResult.setPortalStartUrl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("portalContactEmail")) {
                describePortalResult.setPortalContactEmail(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("portalStatus")) {
                describePortalResult.setPortalStatus(PortalStatusJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("portalCreationDate")) {
                describePortalResult.setPortalCreationDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("portalLastUpdateDate")) {
                describePortalResult.setPortalLastUpdateDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("portalLogoImage")) {
                describePortalResult.setPortalLogoImage(ImageJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("roleArn")) {
                describePortalResult.setRoleArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describePortalResult;
    }

    private static DescribePortalResultJsonUnmarshaller instance;

    public static DescribePortalResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribePortalResultJsonUnmarshaller();
        return instance;
    }
}
