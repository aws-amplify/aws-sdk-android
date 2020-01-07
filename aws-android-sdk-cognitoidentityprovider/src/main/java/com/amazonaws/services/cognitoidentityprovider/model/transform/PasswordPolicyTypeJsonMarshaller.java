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

package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO PasswordPolicyType
 */
class PasswordPolicyTypeJsonMarshaller {

    public void marshall(PasswordPolicyType passwordPolicyType, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (passwordPolicyType.getMinimumLength() != null) {
            Integer minimumLength = passwordPolicyType.getMinimumLength();
            jsonWriter.name("MinimumLength");
            jsonWriter.value(minimumLength);
        }
        if (passwordPolicyType.getRequireUppercase() != null) {
            Boolean requireUppercase = passwordPolicyType.getRequireUppercase();
            jsonWriter.name("RequireUppercase");
            jsonWriter.value(requireUppercase);
        }
        if (passwordPolicyType.getRequireLowercase() != null) {
            Boolean requireLowercase = passwordPolicyType.getRequireLowercase();
            jsonWriter.name("RequireLowercase");
            jsonWriter.value(requireLowercase);
        }
        if (passwordPolicyType.getRequireNumbers() != null) {
            Boolean requireNumbers = passwordPolicyType.getRequireNumbers();
            jsonWriter.name("RequireNumbers");
            jsonWriter.value(requireNumbers);
        }
        if (passwordPolicyType.getRequireSymbols() != null) {
            Boolean requireSymbols = passwordPolicyType.getRequireSymbols();
            jsonWriter.name("RequireSymbols");
            jsonWriter.value(requireSymbols);
        }
        if (passwordPolicyType.getTemporaryPasswordValidityDays() != null) {
            Integer temporaryPasswordValidityDays = passwordPolicyType
                    .getTemporaryPasswordValidityDays();
            jsonWriter.name("TemporaryPasswordValidityDays");
            jsonWriter.value(temporaryPasswordValidityDays);
        }
        jsonWriter.endObject();
    }

    private static PasswordPolicyTypeJsonMarshaller instance;

    public static PasswordPolicyTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PasswordPolicyTypeJsonMarshaller();
        return instance;
    }
}
