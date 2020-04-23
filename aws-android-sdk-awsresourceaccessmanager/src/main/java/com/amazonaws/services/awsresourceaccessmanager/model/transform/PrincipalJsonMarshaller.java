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

package com.amazonaws.services.awsresourceaccessmanager.model.transform;

import com.amazonaws.services.awsresourceaccessmanager.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Principal
 */
class PrincipalJsonMarshaller {

    public void marshall(Principal principal, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (principal.getId() != null) {
            String id = principal.getId();
            jsonWriter.name("id");
            jsonWriter.value(id);
        }
        if (principal.getResourceShareArn() != null) {
            String resourceShareArn = principal.getResourceShareArn();
            jsonWriter.name("resourceShareArn");
            jsonWriter.value(resourceShareArn);
        }
        if (principal.getCreationTime() != null) {
            java.util.Date creationTime = principal.getCreationTime();
            jsonWriter.name("creationTime");
            jsonWriter.value(creationTime);
        }
        if (principal.getLastUpdatedTime() != null) {
            java.util.Date lastUpdatedTime = principal.getLastUpdatedTime();
            jsonWriter.name("lastUpdatedTime");
            jsonWriter.value(lastUpdatedTime);
        }
        if (principal.getExternal() != null) {
            Boolean external = principal.getExternal();
            jsonWriter.name("external");
            jsonWriter.value(external);
        }
        jsonWriter.endObject();
    }

    private static PrincipalJsonMarshaller instance;

    public static PrincipalJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PrincipalJsonMarshaller();
        return instance;
    }
}
