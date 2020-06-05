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
 * JSON marshaller for POJO ShareDetails
 */
class ShareDetailsJsonMarshaller {

    public void marshall(ShareDetails shareDetails, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (shareDetails.getSuccessfulShares() != null) {
            java.util.List<String> successfulShares = shareDetails.getSuccessfulShares();
            jsonWriter.name("SuccessfulShares");
            jsonWriter.beginArray();
            for (String successfulSharesItem : successfulShares) {
                if (successfulSharesItem != null) {
                    jsonWriter.value(successfulSharesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (shareDetails.getShareErrors() != null) {
            java.util.List<ShareError> shareErrors = shareDetails.getShareErrors();
            jsonWriter.name("ShareErrors");
            jsonWriter.beginArray();
            for (ShareError shareErrorsItem : shareErrors) {
                if (shareErrorsItem != null) {
                    ShareErrorJsonMarshaller.getInstance().marshall(shareErrorsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ShareDetailsJsonMarshaller instance;

    public static ShareDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ShareDetailsJsonMarshaller();
        return instance;
    }
}
