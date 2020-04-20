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

package com.amazonaws.services.amazonapigatewayv2.model.transform;

import com.amazonaws.services.amazonapigatewayv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response CreateVpcLinkResult
 */
public class CreateVpcLinkResultJsonUnmarshaller implements
        Unmarshaller<CreateVpcLinkResult, JsonUnmarshallerContext> {

    public CreateVpcLinkResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateVpcLinkResult createVpcLinkResult = new CreateVpcLinkResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("CreatedDate")) {
                createVpcLinkResult.setCreatedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                createVpcLinkResult.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SecurityGroupIds")) {
                createVpcLinkResult.setSecurityGroupIds(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("SubnetIds")) {
                createVpcLinkResult.setSubnetIds(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Tags")) {
                createVpcLinkResult.setTags(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("VpcLinkId")) {
                createVpcLinkResult.setVpcLinkId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VpcLinkStatus")) {
                createVpcLinkResult.setVpcLinkStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VpcLinkStatusMessage")) {
                createVpcLinkResult.setVpcLinkStatusMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VpcLinkVersion")) {
                createVpcLinkResult.setVpcLinkVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return createVpcLinkResult;
    }

    private static CreateVpcLinkResultJsonUnmarshaller instance;

    public static CreateVpcLinkResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateVpcLinkResultJsonUnmarshaller();
        return instance;
    }
}
