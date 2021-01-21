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
 * JSON marshaller for POJO RoleMapping
 */
class RoleMappingJsonMarshaller {

    public void marshall(RoleMapping roleMapping, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (roleMapping.getType() != null) {
            String type = roleMapping.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (roleMapping.getAmbiguousRoleResolution() != null) {
            String ambiguousRoleResolution = roleMapping.getAmbiguousRoleResolution();
            jsonWriter.name("AmbiguousRoleResolution");
            jsonWriter.value(ambiguousRoleResolution);
        }
        if (roleMapping.getRulesConfiguration() != null) {
            RulesConfigurationType rulesConfiguration = roleMapping.getRulesConfiguration();
            jsonWriter.name("RulesConfiguration");
            RulesConfigurationTypeJsonMarshaller.getInstance().marshall(rulesConfiguration,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static RoleMappingJsonMarshaller instance;

    public static RoleMappingJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RoleMappingJsonMarshaller();
        return instance;
    }
}
