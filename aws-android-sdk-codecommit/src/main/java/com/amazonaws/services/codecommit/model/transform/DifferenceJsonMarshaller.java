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

package com.amazonaws.services.codecommit.model.transform;

import com.amazonaws.services.codecommit.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Difference
 */
class DifferenceJsonMarshaller {

    public void marshall(Difference difference, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (difference.getBeforeBlob() != null) {
            BlobMetadata beforeBlob = difference.getBeforeBlob();
            jsonWriter.name("beforeBlob");
            BlobMetadataJsonMarshaller.getInstance().marshall(beforeBlob, jsonWriter);
        }
        if (difference.getAfterBlob() != null) {
            BlobMetadata afterBlob = difference.getAfterBlob();
            jsonWriter.name("afterBlob");
            BlobMetadataJsonMarshaller.getInstance().marshall(afterBlob, jsonWriter);
        }
        if (difference.getChangeType() != null) {
            String changeType = difference.getChangeType();
            jsonWriter.name("changeType");
            jsonWriter.value(changeType);
        }
        jsonWriter.endObject();
    }

    private static DifferenceJsonMarshaller instance;

    public static DifferenceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DifferenceJsonMarshaller();
        return instance;
    }
}
