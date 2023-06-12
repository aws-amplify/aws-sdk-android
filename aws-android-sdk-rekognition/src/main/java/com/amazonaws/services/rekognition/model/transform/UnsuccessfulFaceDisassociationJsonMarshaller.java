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

package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO UnsuccessfulFaceDisassociation
 */
class UnsuccessfulFaceDisassociationJsonMarshaller {

    public void marshall(UnsuccessfulFaceDisassociation unsuccessfulFaceDisassociation,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (unsuccessfulFaceDisassociation.getFaceId() != null) {
            String faceId = unsuccessfulFaceDisassociation.getFaceId();
            jsonWriter.name("FaceId");
            jsonWriter.value(faceId);
        }
        if (unsuccessfulFaceDisassociation.getUserId() != null) {
            String userId = unsuccessfulFaceDisassociation.getUserId();
            jsonWriter.name("UserId");
            jsonWriter.value(userId);
        }
        if (unsuccessfulFaceDisassociation.getReasons() != null) {
            java.util.List<String> reasons = unsuccessfulFaceDisassociation.getReasons();
            jsonWriter.name("Reasons");
            jsonWriter.beginArray();
            for (String reasonsItem : reasons) {
                if (reasonsItem != null) {
                    jsonWriter.value(reasonsItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static UnsuccessfulFaceDisassociationJsonMarshaller instance;

    public static UnsuccessfulFaceDisassociationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UnsuccessfulFaceDisassociationJsonMarshaller();
        return instance;
    }
}
