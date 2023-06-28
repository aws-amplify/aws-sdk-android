/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.chimesdkidentity.model.transform;

import com.amazonaws.services.chimesdkidentity.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO LexConfiguration
 */
class LexConfigurationJsonMarshaller {

    public void marshall(LexConfiguration lexConfiguration, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (lexConfiguration.getRespondsTo() != null) {
            String respondsTo = lexConfiguration.getRespondsTo();
            jsonWriter.name("RespondsTo");
            jsonWriter.value(respondsTo);
        }
        if (lexConfiguration.getInvokedBy() != null) {
            InvokedBy invokedBy = lexConfiguration.getInvokedBy();
            jsonWriter.name("InvokedBy");
            InvokedByJsonMarshaller.getInstance().marshall(invokedBy, jsonWriter);
        }
        if (lexConfiguration.getLexBotAliasArn() != null) {
            String lexBotAliasArn = lexConfiguration.getLexBotAliasArn();
            jsonWriter.name("LexBotAliasArn");
            jsonWriter.value(lexBotAliasArn);
        }
        if (lexConfiguration.getLocaleId() != null) {
            String localeId = lexConfiguration.getLocaleId();
            jsonWriter.name("LocaleId");
            jsonWriter.value(localeId);
        }
        if (lexConfiguration.getWelcomeIntent() != null) {
            String welcomeIntent = lexConfiguration.getWelcomeIntent();
            jsonWriter.name("WelcomeIntent");
            jsonWriter.value(welcomeIntent);
        }
        jsonWriter.endObject();
    }

    private static LexConfigurationJsonMarshaller instance;

    public static LexConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LexConfigurationJsonMarshaller();
        return instance;
    }
}
