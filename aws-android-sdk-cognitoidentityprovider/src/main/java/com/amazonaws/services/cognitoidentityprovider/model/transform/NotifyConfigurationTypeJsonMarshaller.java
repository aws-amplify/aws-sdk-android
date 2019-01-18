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
 * JSON marshaller for POJO NotifyConfigurationType
 */
class NotifyConfigurationTypeJsonMarshaller {

    public void marshall(NotifyConfigurationType notifyConfigurationType, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (notifyConfigurationType.getFrom() != null) {
            String from = notifyConfigurationType.getFrom();
            jsonWriter.name("From");
            jsonWriter.value(from);
        }
        if (notifyConfigurationType.getReplyTo() != null) {
            String replyTo = notifyConfigurationType.getReplyTo();
            jsonWriter.name("ReplyTo");
            jsonWriter.value(replyTo);
        }
        if (notifyConfigurationType.getSourceArn() != null) {
            String sourceArn = notifyConfigurationType.getSourceArn();
            jsonWriter.name("SourceArn");
            jsonWriter.value(sourceArn);
        }
        if (notifyConfigurationType.getBlockEmail() != null) {
            NotifyEmailType blockEmail = notifyConfigurationType.getBlockEmail();
            jsonWriter.name("BlockEmail");
            NotifyEmailTypeJsonMarshaller.getInstance().marshall(blockEmail, jsonWriter);
        }
        if (notifyConfigurationType.getNoActionEmail() != null) {
            NotifyEmailType noActionEmail = notifyConfigurationType.getNoActionEmail();
            jsonWriter.name("NoActionEmail");
            NotifyEmailTypeJsonMarshaller.getInstance().marshall(noActionEmail, jsonWriter);
        }
        if (notifyConfigurationType.getMfaEmail() != null) {
            NotifyEmailType mfaEmail = notifyConfigurationType.getMfaEmail();
            jsonWriter.name("MfaEmail");
            NotifyEmailTypeJsonMarshaller.getInstance().marshall(mfaEmail, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static NotifyConfigurationTypeJsonMarshaller instance;

    public static NotifyConfigurationTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NotifyConfigurationTypeJsonMarshaller();
        return instance;
    }
}
