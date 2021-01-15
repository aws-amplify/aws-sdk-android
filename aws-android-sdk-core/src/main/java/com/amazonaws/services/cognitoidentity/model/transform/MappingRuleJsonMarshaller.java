/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.services.cognitoidentity.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO MappingRule
 */
class MappingRuleJsonMarshaller {

    public void marshall(MappingRule mappingRule, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (mappingRule.getClaim() != null) {
            String claim = mappingRule.getClaim();
            jsonWriter.name("Claim");
            jsonWriter.value(claim);
        }
        if (mappingRule.getMatchType() != null) {
            String matchType = mappingRule.getMatchType();
            jsonWriter.name("MatchType");
            jsonWriter.value(matchType);
        }
        if (mappingRule.getValue() != null) {
            String value = mappingRule.getValue();
            jsonWriter.name("Value");
            jsonWriter.value(value);
        }
        if (mappingRule.getRoleARN() != null) {
            String roleARN = mappingRule.getRoleARN();
            jsonWriter.name("RoleARN");
            jsonWriter.value(roleARN);
        }
        jsonWriter.endObject();
    }

    private static MappingRuleJsonMarshaller instance;

    public static MappingRuleJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MappingRuleJsonMarshaller();
        return instance;
    }
}
