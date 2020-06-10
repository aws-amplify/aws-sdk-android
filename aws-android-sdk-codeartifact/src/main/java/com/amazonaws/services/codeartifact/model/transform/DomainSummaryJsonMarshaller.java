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

package com.amazonaws.services.codeartifact.model.transform;

import com.amazonaws.services.codeartifact.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DomainSummary
 */
class DomainSummaryJsonMarshaller {

    public void marshall(DomainSummary domainSummary, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (domainSummary.getName() != null) {
            String name = domainSummary.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (domainSummary.getOwner() != null) {
            String owner = domainSummary.getOwner();
            jsonWriter.name("owner");
            jsonWriter.value(owner);
        }
        if (domainSummary.getArn() != null) {
            String arn = domainSummary.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (domainSummary.getStatus() != null) {
            String status = domainSummary.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (domainSummary.getCreatedTime() != null) {
            java.util.Date createdTime = domainSummary.getCreatedTime();
            jsonWriter.name("createdTime");
            jsonWriter.value(createdTime);
        }
        if (domainSummary.getEncryptionKey() != null) {
            String encryptionKey = domainSummary.getEncryptionKey();
            jsonWriter.name("encryptionKey");
            jsonWriter.value(encryptionKey);
        }
        jsonWriter.endObject();
    }

    private static DomainSummaryJsonMarshaller instance;

    public static DomainSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DomainSummaryJsonMarshaller();
        return instance;
    }
}
