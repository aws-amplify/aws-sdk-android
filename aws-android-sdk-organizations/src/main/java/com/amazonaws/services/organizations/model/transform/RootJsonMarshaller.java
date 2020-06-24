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

package com.amazonaws.services.organizations.model.transform;

import com.amazonaws.services.organizations.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Root
 */
class RootJsonMarshaller {

    public void marshall(Root root, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (root.getId() != null) {
            String id = root.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (root.getArn() != null) {
            String arn = root.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (root.getName() != null) {
            String name = root.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (root.getPolicyTypes() != null) {
            java.util.List<PolicyTypeSummary> policyTypes = root.getPolicyTypes();
            jsonWriter.name("PolicyTypes");
            jsonWriter.beginArray();
            for (PolicyTypeSummary policyTypesItem : policyTypes) {
                if (policyTypesItem != null) {
                    PolicyTypeSummaryJsonMarshaller.getInstance().marshall(policyTypesItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static RootJsonMarshaller instance;

    public static RootJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RootJsonMarshaller();
        return instance;
    }
}
