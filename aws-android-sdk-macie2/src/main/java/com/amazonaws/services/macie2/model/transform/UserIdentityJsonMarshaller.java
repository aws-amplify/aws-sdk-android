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

package com.amazonaws.services.macie2.model.transform;

import com.amazonaws.services.macie2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO UserIdentity
 */
class UserIdentityJsonMarshaller {

    public void marshall(UserIdentity userIdentity, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (userIdentity.getAssumedRole() != null) {
            AssumedRole assumedRole = userIdentity.getAssumedRole();
            jsonWriter.name("assumedRole");
            AssumedRoleJsonMarshaller.getInstance().marshall(assumedRole, jsonWriter);
        }
        if (userIdentity.getAwsAccount() != null) {
            AwsAccount awsAccount = userIdentity.getAwsAccount();
            jsonWriter.name("awsAccount");
            AwsAccountJsonMarshaller.getInstance().marshall(awsAccount, jsonWriter);
        }
        if (userIdentity.getAwsService() != null) {
            AwsService awsService = userIdentity.getAwsService();
            jsonWriter.name("awsService");
            AwsServiceJsonMarshaller.getInstance().marshall(awsService, jsonWriter);
        }
        if (userIdentity.getFederatedUser() != null) {
            FederatedUser federatedUser = userIdentity.getFederatedUser();
            jsonWriter.name("federatedUser");
            FederatedUserJsonMarshaller.getInstance().marshall(federatedUser, jsonWriter);
        }
        if (userIdentity.getIamUser() != null) {
            IamUser iamUser = userIdentity.getIamUser();
            jsonWriter.name("iamUser");
            IamUserJsonMarshaller.getInstance().marshall(iamUser, jsonWriter);
        }
        if (userIdentity.getRoot() != null) {
            UserIdentityRoot root = userIdentity.getRoot();
            jsonWriter.name("root");
            UserIdentityRootJsonMarshaller.getInstance().marshall(root, jsonWriter);
        }
        if (userIdentity.getType() != null) {
            String type = userIdentity.getType();
            jsonWriter.name("type");
            jsonWriter.value(type);
        }
        jsonWriter.endObject();
    }

    private static UserIdentityJsonMarshaller instance;

    public static UserIdentityJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UserIdentityJsonMarshaller();
        return instance;
    }
}
