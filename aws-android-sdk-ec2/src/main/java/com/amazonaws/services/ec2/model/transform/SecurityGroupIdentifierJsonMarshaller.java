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
 * JSON marshaller for POJO SecurityGroupIdentifier
 */
class SecurityGroupIdentifierJsonMarshaller {

    public void marshall(SecurityGroupIdentifier securityGroupIdentifier, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (securityGroupIdentifier.getGroupId() != null) {
            String groupId = securityGroupIdentifier.getGroupId();
            jsonWriter.name("GroupId");
            jsonWriter.value(groupId);
        }
        if (securityGroupIdentifier.getGroupName() != null) {
            String groupName = securityGroupIdentifier.getGroupName();
            jsonWriter.name("GroupName");
            jsonWriter.value(groupName);
        }
        jsonWriter.endObject();
    }

    private static SecurityGroupIdentifierJsonMarshaller instance;

    public static SecurityGroupIdentifierJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SecurityGroupIdentifierJsonMarshaller();
        return instance;
    }
}
