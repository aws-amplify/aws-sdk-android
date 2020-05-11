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

package com.amazonaws.services.kendra.model.transform;

import com.amazonaws.services.kendra.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Document
 */
class DocumentJsonMarshaller {

    public void marshall(Document document, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (document.getId() != null) {
            String id = document.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (document.getTitle() != null) {
            String title = document.getTitle();
            jsonWriter.name("Title");
            jsonWriter.value(title);
        }
        if (document.getBlob() != null) {
            java.nio.ByteBuffer blob = document.getBlob();
            jsonWriter.name("Blob");
            jsonWriter.value(blob);
        }
        if (document.getS3Path() != null) {
            S3Path s3Path = document.getS3Path();
            jsonWriter.name("S3Path");
            S3PathJsonMarshaller.getInstance().marshall(s3Path, jsonWriter);
        }
        if (document.getAttributes() != null) {
            java.util.List<DocumentAttribute> attributes = document.getAttributes();
            jsonWriter.name("Attributes");
            jsonWriter.beginArray();
            for (DocumentAttribute attributesItem : attributes) {
                if (attributesItem != null) {
                    DocumentAttributeJsonMarshaller.getInstance().marshall(attributesItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (document.getAccessControlList() != null) {
            java.util.List<Principal> accessControlList = document.getAccessControlList();
            jsonWriter.name("AccessControlList");
            jsonWriter.beginArray();
            for (Principal accessControlListItem : accessControlList) {
                if (accessControlListItem != null) {
                    PrincipalJsonMarshaller.getInstance().marshall(accessControlListItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (document.getContentType() != null) {
            String contentType = document.getContentType();
            jsonWriter.name("ContentType");
            jsonWriter.value(contentType);
        }
        jsonWriter.endObject();
    }

    private static DocumentJsonMarshaller instance;

    public static DocumentJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DocumentJsonMarshaller();
        return instance;
    }
}
