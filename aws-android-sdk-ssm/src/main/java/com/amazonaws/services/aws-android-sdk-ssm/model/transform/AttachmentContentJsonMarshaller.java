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
package com.amazonaws.services.aws-android-sdk-ssm.model.transform;

import com.amazonaws.services.aws-android-sdk-ssm.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AttachmentContent
 */
class AttachmentContentJsonMarshaller {

    public void marshall(AttachmentContent attachmentContent, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (attachmentContent.getName() != null) {
            String name = attachmentContent.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (attachmentContent.getSize() != null) {
            Long size = attachmentContent.getSize();
            jsonWriter.name("Size");
            jsonWriter.value(size);
        }
        if (attachmentContent.getHash() != null) {
            String hash = attachmentContent.getHash();
            jsonWriter.name("Hash");
            jsonWriter.value(hash);
        }
        if (attachmentContent.getHashType() != null) {
            String hashType = attachmentContent.getHashType();
            jsonWriter.name("HashType");
            jsonWriter.value(hashType);
        }
        if (attachmentContent.getUrl() != null) {
            String url = attachmentContent.getUrl();
            jsonWriter.name("Url");
            jsonWriter.value(url);
        }
        jsonWriter.endObject();
    }

    private static AttachmentContentJsonMarshaller instance;
    public static AttachmentContentJsonMarshaller getInstance() {
        if (instance == null) instance = new AttachmentContentJsonMarshaller();
        return instance;
    }
}
