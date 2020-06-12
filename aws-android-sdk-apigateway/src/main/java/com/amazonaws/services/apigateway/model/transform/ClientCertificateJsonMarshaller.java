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

package com.amazonaws.services.apigateway.model.transform;

import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ClientCertificate
 */
class ClientCertificateJsonMarshaller {

    public void marshall(ClientCertificate clientCertificate, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (clientCertificate.getClientCertificateId() != null) {
            String clientCertificateId = clientCertificate.getClientCertificateId();
            jsonWriter.name("clientCertificateId");
            jsonWriter.value(clientCertificateId);
        }
        if (clientCertificate.getDescription() != null) {
            String description = clientCertificate.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        if (clientCertificate.getPemEncodedCertificate() != null) {
            String pemEncodedCertificate = clientCertificate.getPemEncodedCertificate();
            jsonWriter.name("pemEncodedCertificate");
            jsonWriter.value(pemEncodedCertificate);
        }
        if (clientCertificate.getCreatedDate() != null) {
            java.util.Date createdDate = clientCertificate.getCreatedDate();
            jsonWriter.name("createdDate");
            jsonWriter.value(createdDate);
        }
        if (clientCertificate.getExpirationDate() != null) {
            java.util.Date expirationDate = clientCertificate.getExpirationDate();
            jsonWriter.name("expirationDate");
            jsonWriter.value(expirationDate);
        }
        if (clientCertificate.getTags() != null) {
            java.util.Map<String, String> tags = clientCertificate.getTags();
            jsonWriter.name("tags");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> tagsEntry : tags.entrySet()) {
                String tagsValue = tagsEntry.getValue();
                if (tagsValue != null) {
                    jsonWriter.name(tagsEntry.getKey());
                    jsonWriter.value(tagsValue);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static ClientCertificateJsonMarshaller instance;

    public static ClientCertificateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ClientCertificateJsonMarshaller();
        return instance;
    }
}
