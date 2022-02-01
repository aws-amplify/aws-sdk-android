/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AdminCreateUserConfigType
 */
class AdminCreateUserConfigTypeJsonMarshaller {

    public void marshall(AdminCreateUserConfigType adminCreateUserConfigType,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (adminCreateUserConfigType.getAllowAdminCreateUserOnly() != null) {
            Boolean allowAdminCreateUserOnly = adminCreateUserConfigType
                    .getAllowAdminCreateUserOnly();
            jsonWriter.name("AllowAdminCreateUserOnly");
            jsonWriter.value(allowAdminCreateUserOnly);
        }
        if (adminCreateUserConfigType.getUnusedAccountValidityDays() != null) {
            Integer unusedAccountValidityDays = adminCreateUserConfigType
                    .getUnusedAccountValidityDays();
            jsonWriter.name("UnusedAccountValidityDays");
            jsonWriter.value(unusedAccountValidityDays);
        }
        if (adminCreateUserConfigType.getInviteMessageTemplate() != null) {
            MessageTemplateType inviteMessageTemplate = adminCreateUserConfigType
                    .getInviteMessageTemplate();
            jsonWriter.name("InviteMessageTemplate");
            MessageTemplateTypeJsonMarshaller.getInstance().marshall(inviteMessageTemplate,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static AdminCreateUserConfigTypeJsonMarshaller instance;

    public static AdminCreateUserConfigTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AdminCreateUserConfigTypeJsonMarshaller();
        return instance;
    }
}
