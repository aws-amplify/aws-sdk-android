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

package com.amazonaws.services.awssecurityhub.model.transform;

import com.amazonaws.services.awssecurityhub.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AwsRdsDbInstanceVpcSecurityGroup
 */
class AwsRdsDbInstanceVpcSecurityGroupJsonMarshaller {

    public void marshall(AwsRdsDbInstanceVpcSecurityGroup awsRdsDbInstanceVpcSecurityGroup,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (awsRdsDbInstanceVpcSecurityGroup.getVpcSecurityGroupId() != null) {
            String vpcSecurityGroupId = awsRdsDbInstanceVpcSecurityGroup.getVpcSecurityGroupId();
            jsonWriter.name("VpcSecurityGroupId");
            jsonWriter.value(vpcSecurityGroupId);
        }
        if (awsRdsDbInstanceVpcSecurityGroup.getStatus() != null) {
            String status = awsRdsDbInstanceVpcSecurityGroup.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        jsonWriter.endObject();
    }

    private static AwsRdsDbInstanceVpcSecurityGroupJsonMarshaller instance;

    public static AwsRdsDbInstanceVpcSecurityGroupJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AwsRdsDbInstanceVpcSecurityGroupJsonMarshaller();
        return instance;
    }
}
