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
 * JSON marshaller for POJO UserProfileDetails
 */
class UserProfileDetailsJsonMarshaller {

    public void marshall(UserProfileDetails userProfileDetails, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (userProfileDetails.getDomainId() != null) {
            String domainId = userProfileDetails.getDomainId();
            jsonWriter.name("DomainId");
            jsonWriter.value(domainId);
        }
        if (userProfileDetails.getUserProfileName() != null) {
            String userProfileName = userProfileDetails.getUserProfileName();
            jsonWriter.name("UserProfileName");
            jsonWriter.value(userProfileName);
        }
        if (userProfileDetails.getStatus() != null) {
            String status = userProfileDetails.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (userProfileDetails.getCreationTime() != null) {
            java.util.Date creationTime = userProfileDetails.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (userProfileDetails.getLastModifiedTime() != null) {
            java.util.Date lastModifiedTime = userProfileDetails.getLastModifiedTime();
            jsonWriter.name("LastModifiedTime");
            jsonWriter.value(lastModifiedTime);
        }
        jsonWriter.endObject();
    }

    private static UserProfileDetailsJsonMarshaller instance;

    public static UserProfileDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UserProfileDetailsJsonMarshaller();
        return instance;
    }
}
