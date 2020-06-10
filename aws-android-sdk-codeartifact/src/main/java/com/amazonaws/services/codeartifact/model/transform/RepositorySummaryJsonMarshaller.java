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
 * JSON marshaller for POJO RepositorySummary
 */
class RepositorySummaryJsonMarshaller {

    public void marshall(RepositorySummary repositorySummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (repositorySummary.getName() != null) {
            String name = repositorySummary.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (repositorySummary.getAdministratorAccount() != null) {
            String administratorAccount = repositorySummary.getAdministratorAccount();
            jsonWriter.name("administratorAccount");
            jsonWriter.value(administratorAccount);
        }
        if (repositorySummary.getDomainName() != null) {
            String domainName = repositorySummary.getDomainName();
            jsonWriter.name("domainName");
            jsonWriter.value(domainName);
        }
        if (repositorySummary.getDomainOwner() != null) {
            String domainOwner = repositorySummary.getDomainOwner();
            jsonWriter.name("domainOwner");
            jsonWriter.value(domainOwner);
        }
        if (repositorySummary.getArn() != null) {
            String arn = repositorySummary.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (repositorySummary.getDescription() != null) {
            String description = repositorySummary.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        jsonWriter.endObject();
    }

    private static RepositorySummaryJsonMarshaller instance;

    public static RepositorySummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RepositorySummaryJsonMarshaller();
        return instance;
    }
}
