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
 * JSON marshaller for POJO SecurityProfileTargetMapping
 */
class SecurityProfileTargetMappingJsonMarshaller {

    public void marshall(SecurityProfileTargetMapping securityProfileTargetMapping,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (securityProfileTargetMapping.getSecurityProfileIdentifier() != null) {
            SecurityProfileIdentifier securityProfileIdentifier = securityProfileTargetMapping
                    .getSecurityProfileIdentifier();
            jsonWriter.name("securityProfileIdentifier");
            SecurityProfileIdentifierJsonMarshaller.getInstance().marshall(
                    securityProfileIdentifier, jsonWriter);
        }
        if (securityProfileTargetMapping.getTarget() != null) {
            SecurityProfileTarget target = securityProfileTargetMapping.getTarget();
            jsonWriter.name("target");
            SecurityProfileTargetJsonMarshaller.getInstance().marshall(target, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static SecurityProfileTargetMappingJsonMarshaller instance;

    public static SecurityProfileTargetMappingJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SecurityProfileTargetMappingJsonMarshaller();
        return instance;
    }
}
