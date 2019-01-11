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

package com.amazonaws.services.kms.model.transform;

import com.amazonaws.services.kms.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO GrantListEntry
 */
class GrantListEntryJsonMarshaller {

    public void marshall(GrantListEntry grantListEntry, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (grantListEntry.getKeyId() != null) {
            String keyId = grantListEntry.getKeyId();
            jsonWriter.name("KeyId");
            jsonWriter.value(keyId);
        }
        if (grantListEntry.getGrantId() != null) {
            String grantId = grantListEntry.getGrantId();
            jsonWriter.name("GrantId");
            jsonWriter.value(grantId);
        }
        if (grantListEntry.getName() != null) {
            String name = grantListEntry.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (grantListEntry.getCreationDate() != null) {
            java.util.Date creationDate = grantListEntry.getCreationDate();
            jsonWriter.name("CreationDate");
            jsonWriter.value(creationDate);
        }
        if (grantListEntry.getGranteePrincipal() != null) {
            String granteePrincipal = grantListEntry.getGranteePrincipal();
            jsonWriter.name("GranteePrincipal");
            jsonWriter.value(granteePrincipal);
        }
        if (grantListEntry.getRetiringPrincipal() != null) {
            String retiringPrincipal = grantListEntry.getRetiringPrincipal();
            jsonWriter.name("RetiringPrincipal");
            jsonWriter.value(retiringPrincipal);
        }
        if (grantListEntry.getIssuingAccount() != null) {
            String issuingAccount = grantListEntry.getIssuingAccount();
            jsonWriter.name("IssuingAccount");
            jsonWriter.value(issuingAccount);
        }
        if (grantListEntry.getOperations() != null) {
            java.util.List<String> operations = grantListEntry.getOperations();
            jsonWriter.name("Operations");
            jsonWriter.beginArray();
            for (String operationsItem : operations) {
                if (operationsItem != null) {
                    jsonWriter.value(operationsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (grantListEntry.getConstraints() != null) {
            GrantConstraints constraints = grantListEntry.getConstraints();
            jsonWriter.name("Constraints");
            GrantConstraintsJsonMarshaller.getInstance().marshall(constraints, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static GrantListEntryJsonMarshaller instance;

    public static GrantListEntryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new GrantListEntryJsonMarshaller();
        return instance;
    }
}
