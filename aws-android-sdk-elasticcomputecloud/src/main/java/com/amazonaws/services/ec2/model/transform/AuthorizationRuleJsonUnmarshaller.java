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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO AuthorizationRule
 */
class AuthorizationRuleJsonUnmarshaller implements
        Unmarshaller<AuthorizationRule, JsonUnmarshallerContext> {

    public AuthorizationRule unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AuthorizationRule authorizationRule = new AuthorizationRule();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ClientVpnEndpointId")) {
                authorizationRule.setClientVpnEndpointId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                authorizationRule.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("GroupId")) {
                authorizationRule.setGroupId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AccessAll")) {
                authorizationRule.setAccessAll(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DestinationCidr")) {
                authorizationRule.setDestinationCidr(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                authorizationRule.setStatus(ClientVpnAuthorizationRuleStatusJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return authorizationRule;
    }

    private static AuthorizationRuleJsonUnmarshaller instance;

    public static AuthorizationRuleJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AuthorizationRuleJsonUnmarshaller();
        return instance;
    }
}
