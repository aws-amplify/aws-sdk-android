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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ClientData
 */
class ClientDataJsonMarshaller {

    public void marshall(ClientData clientData, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (clientData.getComment() != null) {
            String comment = clientData.getComment();
            jsonWriter.name("Comment");
            jsonWriter.value(comment);
        }
        if (clientData.getUploadEnd() != null) {
            java.util.Date uploadEnd = clientData.getUploadEnd();
            jsonWriter.name("UploadEnd");
            jsonWriter.value(uploadEnd);
        }
        if (clientData.getUploadSize() != null) {
            Double uploadSize = clientData.getUploadSize();
            jsonWriter.name("UploadSize");
            jsonWriter.value(uploadSize);
        }
        if (clientData.getUploadStart() != null) {
            java.util.Date uploadStart = clientData.getUploadStart();
            jsonWriter.name("UploadStart");
            jsonWriter.value(uploadStart);
        }
        jsonWriter.endObject();
    }

    private static ClientDataJsonMarshaller instance;

    public static ClientDataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ClientDataJsonMarshaller();
        return instance;
    }
}
