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
 * JSON marshaller for POJO ResourcePolicy
 */
class ResourcePolicyJsonMarshaller {

    public void marshall(ResourcePolicy resourcePolicy, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (resourcePolicy.getResourceArn() != null) {
            String resourceArn = resourcePolicy.getResourceArn();
            jsonWriter.name("resourceArn");
            jsonWriter.value(resourceArn);
        }
        if (resourcePolicy.getRevision() != null) {
            String revision = resourcePolicy.getRevision();
            jsonWriter.name("revision");
            jsonWriter.value(revision);
        }
        if (resourcePolicy.getDocument() != null) {
            String document = resourcePolicy.getDocument();
            jsonWriter.name("document");
            jsonWriter.value(document);
        }
        jsonWriter.endObject();
    }

    private static ResourcePolicyJsonMarshaller instance;

    public static ResourcePolicyJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ResourcePolicyJsonMarshaller();
        return instance;
    }
}
