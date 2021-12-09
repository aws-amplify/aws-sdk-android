/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connectparticipant.model.transform;

import com.amazonaws.services.connectparticipant.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO UploadMetadata
 */
class UploadMetadataJsonMarshaller {

    public void marshall(UploadMetadata uploadMetadata, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (uploadMetadata.getUrl() != null) {
            String url = uploadMetadata.getUrl();
            jsonWriter.name("Url");
            jsonWriter.value(url);
        }
        if (uploadMetadata.getUrlExpiry() != null) {
            String urlExpiry = uploadMetadata.getUrlExpiry();
            jsonWriter.name("UrlExpiry");
            jsonWriter.value(urlExpiry);
        }
        if (uploadMetadata.getHeadersToInclude() != null) {
            java.util.Map<String, String> headersToInclude = uploadMetadata.getHeadersToInclude();
            jsonWriter.name("HeadersToInclude");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> headersToIncludeEntry : headersToInclude
                    .entrySet()) {
                String headersToIncludeValue = headersToIncludeEntry.getValue();
                if (headersToIncludeValue != null) {
                    jsonWriter.name(headersToIncludeEntry.getKey());
                    jsonWriter.value(headersToIncludeValue);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static UploadMetadataJsonMarshaller instance;

    public static UploadMetadataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UploadMetadataJsonMarshaller();
        return instance;
    }
}
