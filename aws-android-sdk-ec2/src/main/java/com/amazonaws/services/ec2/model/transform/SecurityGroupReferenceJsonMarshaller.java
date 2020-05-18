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
 * JSON marshaller for POJO SecurityGroupReference
 */
class SecurityGroupReferenceJsonMarshaller {

    public void marshall(SecurityGroupReference securityGroupReference, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (securityGroupReference.getGroupId() != null) {
            String groupId = securityGroupReference.getGroupId();
            jsonWriter.name("GroupId");
            jsonWriter.value(groupId);
        }
        if (securityGroupReference.getReferencingVpcId() != null) {
            String referencingVpcId = securityGroupReference.getReferencingVpcId();
            jsonWriter.name("ReferencingVpcId");
            jsonWriter.value(referencingVpcId);
        }
        if (securityGroupReference.getVpcPeeringConnectionId() != null) {
            String vpcPeeringConnectionId = securityGroupReference.getVpcPeeringConnectionId();
            jsonWriter.name("VpcPeeringConnectionId");
            jsonWriter.value(vpcPeeringConnectionId);
        }
        jsonWriter.endObject();
    }

    private static SecurityGroupReferenceJsonMarshaller instance;

    public static SecurityGroupReferenceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SecurityGroupReferenceJsonMarshaller();
        return instance;
    }
}
