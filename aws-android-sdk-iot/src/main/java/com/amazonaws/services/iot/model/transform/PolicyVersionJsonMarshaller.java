/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO PolicyVersion
 */
class PolicyVersionJsonMarshaller {

    public void marshall(PolicyVersion policyVersion, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (policyVersion.getVersionId() != null) {
            String versionId = policyVersion.getVersionId();
            jsonWriter.name("versionId");
            jsonWriter.value(versionId);
        }
        if (policyVersion.getIsDefaultVersion() != null) {
            Boolean isDefaultVersion = policyVersion.getIsDefaultVersion();
            jsonWriter.name("isDefaultVersion");
            jsonWriter.value(isDefaultVersion);
        }
        if (policyVersion.getCreateDate() != null) {
            java.util.Date createDate = policyVersion.getCreateDate();
            jsonWriter.name("createDate");
            jsonWriter.value(createDate);
        }
        jsonWriter.endObject();
    }

    private static PolicyVersionJsonMarshaller instance;

    public static PolicyVersionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PolicyVersionJsonMarshaller();
        return instance;
    }
}
