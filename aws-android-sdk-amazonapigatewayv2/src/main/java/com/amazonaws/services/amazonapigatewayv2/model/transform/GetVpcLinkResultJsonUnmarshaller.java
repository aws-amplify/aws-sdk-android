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
 * JSON unmarshaller for response GetVpcLinkResult
 */
public class GetVpcLinkResultJsonUnmarshaller implements
        Unmarshaller<GetVpcLinkResult, JsonUnmarshallerContext> {

    public GetVpcLinkResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetVpcLinkResult getVpcLinkResult = new GetVpcLinkResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("CreatedDate")) {
                getVpcLinkResult.setCreatedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                getVpcLinkResult.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SecurityGroupIds")) {
                getVpcLinkResult.setSecurityGroupIds(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("SubnetIds")) {
                getVpcLinkResult.setSubnetIds(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Tags")) {
                getVpcLinkResult.setTags(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("VpcLinkId")) {
                getVpcLinkResult.setVpcLinkId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VpcLinkStatus")) {
                getVpcLinkResult.setVpcLinkStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VpcLinkStatusMessage")) {
                getVpcLinkResult.setVpcLinkStatusMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VpcLinkVersion")) {
                getVpcLinkResult.setVpcLinkVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getVpcLinkResult;
    }

    private static GetVpcLinkResultJsonUnmarshaller instance;

    public static GetVpcLinkResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetVpcLinkResultJsonUnmarshaller();
        return instance;
    }
}
