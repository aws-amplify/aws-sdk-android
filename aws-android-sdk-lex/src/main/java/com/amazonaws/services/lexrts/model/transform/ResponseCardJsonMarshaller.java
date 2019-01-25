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

package com.amazonaws.services.lexrts.model.transform;

import com.amazonaws.services.lexrts.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ResponseCard
 */
class ResponseCardJsonMarshaller {

    public void marshall(ResponseCard responseCard, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (responseCard.getVersion() != null) {
            String version = responseCard.getVersion();
            jsonWriter.name("version");
            jsonWriter.value(version);
        }
        if (responseCard.getContentType() != null) {
            String contentType = responseCard.getContentType();
            jsonWriter.name("contentType");
            jsonWriter.value(contentType);
        }
        if (responseCard.getGenericAttachments() != null) {
            java.util.List<GenericAttachment> genericAttachments = responseCard
                    .getGenericAttachments();
            jsonWriter.name("genericAttachments");
            jsonWriter.beginArray();
            for (GenericAttachment genericAttachmentsItem : genericAttachments) {
                if (genericAttachmentsItem != null) {
                    GenericAttachmentJsonMarshaller.getInstance().marshall(genericAttachmentsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ResponseCardJsonMarshaller instance;

    public static ResponseCardJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ResponseCardJsonMarshaller();
        return instance;
    }
}
