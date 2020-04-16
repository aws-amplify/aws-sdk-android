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
 * JSON marshaller for POJO AwsIamAccessKeyDetails
 */
class AwsIamAccessKeyDetailsJsonMarshaller {

    public void marshall(AwsIamAccessKeyDetails awsIamAccessKeyDetails, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (awsIamAccessKeyDetails.getUserName() != null) {
            String userName = awsIamAccessKeyDetails.getUserName();
            jsonWriter.name("UserName");
            jsonWriter.value(userName);
        }
        if (awsIamAccessKeyDetails.getStatus() != null) {
            String status = awsIamAccessKeyDetails.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (awsIamAccessKeyDetails.getCreatedAt() != null) {
            String createdAt = awsIamAccessKeyDetails.getCreatedAt();
            jsonWriter.name("CreatedAt");
            jsonWriter.value(createdAt);
        }
        if (awsIamAccessKeyDetails.getPrincipalId() != null) {
            String principalId = awsIamAccessKeyDetails.getPrincipalId();
            jsonWriter.name("PrincipalId");
            jsonWriter.value(principalId);
        }
        if (awsIamAccessKeyDetails.getPrincipalType() != null) {
            String principalType = awsIamAccessKeyDetails.getPrincipalType();
            jsonWriter.name("PrincipalType");
            jsonWriter.value(principalType);
        }
        if (awsIamAccessKeyDetails.getPrincipalName() != null) {
            String principalName = awsIamAccessKeyDetails.getPrincipalName();
            jsonWriter.name("PrincipalName");
            jsonWriter.value(principalName);
        }
        jsonWriter.endObject();
    }

    private static AwsIamAccessKeyDetailsJsonMarshaller instance;

    public static AwsIamAccessKeyDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AwsIamAccessKeyDetailsJsonMarshaller();
        return instance;
    }
}
