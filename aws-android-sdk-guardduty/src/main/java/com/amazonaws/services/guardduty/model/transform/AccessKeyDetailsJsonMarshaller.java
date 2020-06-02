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

package com.amazonaws.services.guardduty.model.transform;

import com.amazonaws.services.guardduty.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AccessKeyDetails
 */
class AccessKeyDetailsJsonMarshaller {

    public void marshall(AccessKeyDetails accessKeyDetails, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (accessKeyDetails.getAccessKeyId() != null) {
            String accessKeyId = accessKeyDetails.getAccessKeyId();
            jsonWriter.name("AccessKeyId");
            jsonWriter.value(accessKeyId);
        }
        if (accessKeyDetails.getPrincipalId() != null) {
            String principalId = accessKeyDetails.getPrincipalId();
            jsonWriter.name("PrincipalId");
            jsonWriter.value(principalId);
        }
        if (accessKeyDetails.getUserName() != null) {
            String userName = accessKeyDetails.getUserName();
            jsonWriter.name("UserName");
            jsonWriter.value(userName);
        }
        if (accessKeyDetails.getUserType() != null) {
            String userType = accessKeyDetails.getUserType();
            jsonWriter.name("UserType");
            jsonWriter.value(userType);
        }
        jsonWriter.endObject();
    }

    private static AccessKeyDetailsJsonMarshaller instance;

    public static AccessKeyDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AccessKeyDetailsJsonMarshaller();
        return instance;
    }
}
