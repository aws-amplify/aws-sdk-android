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

package com.amazonaws.services.awssecurityhub.model.transform;

import com.amazonaws.services.awssecurityhub.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Standard
 */
class StandardJsonMarshaller {

    public void marshall(Standard standard, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (standard.getStandardsArn() != null) {
            String standardsArn = standard.getStandardsArn();
            jsonWriter.name("StandardsArn");
            jsonWriter.value(standardsArn);
        }
        if (standard.getName() != null) {
            String name = standard.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (standard.getDescription() != null) {
            String description = standard.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (standard.getEnabledByDefault() != null) {
            Boolean enabledByDefault = standard.getEnabledByDefault();
            jsonWriter.name("EnabledByDefault");
            jsonWriter.value(enabledByDefault);
        }
        jsonWriter.endObject();
    }

    private static StandardJsonMarshaller instance;

    public static StandardJsonMarshaller getInstance() {
        if (instance == null)
            instance = new StandardJsonMarshaller();
        return instance;
    }
}
