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

package com.amazonaws.services.api.sagemaker.model.transform;

import com.amazonaws.services.api.sagemaker.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DomainDetails
 */
class DomainDetailsJsonMarshaller {

    public void marshall(DomainDetails domainDetails, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (domainDetails.getDomainArn() != null) {
            String domainArn = domainDetails.getDomainArn();
            jsonWriter.name("DomainArn");
            jsonWriter.value(domainArn);
        }
        if (domainDetails.getDomainId() != null) {
            String domainId = domainDetails.getDomainId();
            jsonWriter.name("DomainId");
            jsonWriter.value(domainId);
        }
        if (domainDetails.getDomainName() != null) {
            String domainName = domainDetails.getDomainName();
            jsonWriter.name("DomainName");
            jsonWriter.value(domainName);
        }
        if (domainDetails.getStatus() != null) {
            String status = domainDetails.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (domainDetails.getCreationTime() != null) {
            java.util.Date creationTime = domainDetails.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (domainDetails.getLastModifiedTime() != null) {
            java.util.Date lastModifiedTime = domainDetails.getLastModifiedTime();
            jsonWriter.name("LastModifiedTime");
            jsonWriter.value(lastModifiedTime);
        }
        if (domainDetails.getUrl() != null) {
            String url = domainDetails.getUrl();
            jsonWriter.name("Url");
            jsonWriter.value(url);
        }
        jsonWriter.endObject();
    }

    private static DomainDetailsJsonMarshaller instance;

    public static DomainDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DomainDetailsJsonMarshaller();
        return instance;
    }
}
