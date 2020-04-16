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

package com.amazonaws.services.amazonsagemakerservice.model.transform;

import com.amazonaws.services.amazonsagemakerservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO UserContext
 */
class UserContextJsonMarshaller {

    public void marshall(UserContext userContext, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (userContext.getUserProfileArn() != null) {
            String userProfileArn = userContext.getUserProfileArn();
            jsonWriter.name("UserProfileArn");
            jsonWriter.value(userProfileArn);
        }
        if (userContext.getUserProfileName() != null) {
            String userProfileName = userContext.getUserProfileName();
            jsonWriter.name("UserProfileName");
            jsonWriter.value(userProfileName);
        }
        if (userContext.getDomainId() != null) {
            String domainId = userContext.getDomainId();
            jsonWriter.name("DomainId");
            jsonWriter.value(domainId);
        }
        jsonWriter.endObject();
    }

    private static UserContextJsonMarshaller instance;

    public static UserContextJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UserContextJsonMarshaller();
        return instance;
    }
}
