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

package com.amazonaws.services.tagging.model.transform;

import com.amazonaws.services.tagging.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ComplianceDetails
 */
class ComplianceDetailsJsonMarshaller {

    public void marshall(ComplianceDetails complianceDetails, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (complianceDetails.getNoncompliantKeys() != null) {
            java.util.List<String> noncompliantKeys = complianceDetails.getNoncompliantKeys();
            jsonWriter.name("NoncompliantKeys");
            jsonWriter.beginArray();
            for (String noncompliantKeysItem : noncompliantKeys) {
                if (noncompliantKeysItem != null) {
                    jsonWriter.value(noncompliantKeysItem);
                }
            }
            jsonWriter.endArray();
        }
        if (complianceDetails.getKeysWithNoncompliantValues() != null) {
            java.util.List<String> keysWithNoncompliantValues = complianceDetails
                    .getKeysWithNoncompliantValues();
            jsonWriter.name("KeysWithNoncompliantValues");
            jsonWriter.beginArray();
            for (String keysWithNoncompliantValuesItem : keysWithNoncompliantValues) {
                if (keysWithNoncompliantValuesItem != null) {
                    jsonWriter.value(keysWithNoncompliantValuesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (complianceDetails.getComplianceStatus() != null) {
            Boolean complianceStatus = complianceDetails.getComplianceStatus();
            jsonWriter.name("ComplianceStatus");
            jsonWriter.value(complianceStatus);
        }
        jsonWriter.endObject();
    }

    private static ComplianceDetailsJsonMarshaller instance;

    public static ComplianceDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ComplianceDetailsJsonMarshaller();
        return instance;
    }
}
