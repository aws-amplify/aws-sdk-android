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

package com.amazonaws.services.servicecatalog.model.transform;

import com.amazonaws.services.servicecatalog.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ShareError
 */
class ShareErrorJsonMarshaller {

    public void marshall(ShareError shareError, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (shareError.getAccounts() != null) {
            java.util.List<String> accounts = shareError.getAccounts();
            jsonWriter.name("Accounts");
            jsonWriter.beginArray();
            for (String accountsItem : accounts) {
                if (accountsItem != null) {
                    jsonWriter.value(accountsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (shareError.getMessage() != null) {
            String message = shareError.getMessage();
            jsonWriter.name("Message");
            jsonWriter.value(message);
        }
        if (shareError.getError() != null) {
            String error = shareError.getError();
            jsonWriter.name("Error");
            jsonWriter.value(error);
        }
        jsonWriter.endObject();
    }

    private static ShareErrorJsonMarshaller instance;

    public static ShareErrorJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ShareErrorJsonMarshaller();
        return instance;
    }
}
