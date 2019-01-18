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

package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO NotifyEmailType
 */
class NotifyEmailTypeJsonMarshaller {

    public void marshall(NotifyEmailType notifyEmailType, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (notifyEmailType.getSubject() != null) {
            String subject = notifyEmailType.getSubject();
            jsonWriter.name("Subject");
            jsonWriter.value(subject);
        }
        if (notifyEmailType.getHtmlBody() != null) {
            String htmlBody = notifyEmailType.getHtmlBody();
            jsonWriter.name("HtmlBody");
            jsonWriter.value(htmlBody);
        }
        if (notifyEmailType.getTextBody() != null) {
            String textBody = notifyEmailType.getTextBody();
            jsonWriter.name("TextBody");
            jsonWriter.value(textBody);
        }
        jsonWriter.endObject();
    }

    private static NotifyEmailTypeJsonMarshaller instance;

    public static NotifyEmailTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NotifyEmailTypeJsonMarshaller();
        return instance;
    }
}
