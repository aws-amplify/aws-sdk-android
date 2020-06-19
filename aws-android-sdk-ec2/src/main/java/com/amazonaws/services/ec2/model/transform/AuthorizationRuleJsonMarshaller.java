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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AuthorizationRule
 */
class AuthorizationRuleJsonMarshaller {

    public void marshall(AuthorizationRule authorizationRule, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (authorizationRule.getClientVpnEndpointId() != null) {
            String clientVpnEndpointId = authorizationRule.getClientVpnEndpointId();
            jsonWriter.name("ClientVpnEndpointId");
            jsonWriter.value(clientVpnEndpointId);
        }
        if (authorizationRule.getDescription() != null) {
            String description = authorizationRule.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (authorizationRule.getGroupId() != null) {
            String groupId = authorizationRule.getGroupId();
            jsonWriter.name("GroupId");
            jsonWriter.value(groupId);
        }
        if (authorizationRule.getAccessAll() != null) {
            Boolean accessAll = authorizationRule.getAccessAll();
            jsonWriter.name("AccessAll");
            jsonWriter.value(accessAll);
        }
        if (authorizationRule.getDestinationCidr() != null) {
            String destinationCidr = authorizationRule.getDestinationCidr();
            jsonWriter.name("DestinationCidr");
            jsonWriter.value(destinationCidr);
        }
        if (authorizationRule.getStatus() != null) {
            ClientVpnAuthorizationRuleStatus status = authorizationRule.getStatus();
            jsonWriter.name("Status");
            ClientVpnAuthorizationRuleStatusJsonMarshaller.getInstance().marshall(status,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static AuthorizationRuleJsonMarshaller instance;

    public static AuthorizationRuleJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AuthorizationRuleJsonMarshaller();
        return instance;
    }
}
