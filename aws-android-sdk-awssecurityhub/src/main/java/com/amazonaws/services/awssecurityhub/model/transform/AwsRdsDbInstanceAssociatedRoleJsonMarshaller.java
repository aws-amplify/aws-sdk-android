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
 * JSON marshaller for POJO AwsRdsDbInstanceAssociatedRole
 */
class AwsRdsDbInstanceAssociatedRoleJsonMarshaller {

    public void marshall(AwsRdsDbInstanceAssociatedRole awsRdsDbInstanceAssociatedRole,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (awsRdsDbInstanceAssociatedRole.getRoleArn() != null) {
            String roleArn = awsRdsDbInstanceAssociatedRole.getRoleArn();
            jsonWriter.name("RoleArn");
            jsonWriter.value(roleArn);
        }
        if (awsRdsDbInstanceAssociatedRole.getFeatureName() != null) {
            String featureName = awsRdsDbInstanceAssociatedRole.getFeatureName();
            jsonWriter.name("FeatureName");
            jsonWriter.value(featureName);
        }
        if (awsRdsDbInstanceAssociatedRole.getStatus() != null) {
            String status = awsRdsDbInstanceAssociatedRole.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        jsonWriter.endObject();
    }

    private static AwsRdsDbInstanceAssociatedRoleJsonMarshaller instance;

    public static AwsRdsDbInstanceAssociatedRoleJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AwsRdsDbInstanceAssociatedRoleJsonMarshaller();
        return instance;
    }
}
