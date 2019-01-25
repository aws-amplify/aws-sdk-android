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

package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CodeDeliveryDetailsType
 */
class CodeDeliveryDetailsTypeJsonMarshaller {

    public void marshall(CodeDeliveryDetailsType codeDeliveryDetailsType, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (codeDeliveryDetailsType.getDestination() != null) {
            String destination = codeDeliveryDetailsType.getDestination();
            jsonWriter.name("Destination");
            jsonWriter.value(destination);
        }
        if (codeDeliveryDetailsType.getDeliveryMedium() != null) {
            String deliveryMedium = codeDeliveryDetailsType.getDeliveryMedium();
            jsonWriter.name("DeliveryMedium");
            jsonWriter.value(deliveryMedium);
        }
        if (codeDeliveryDetailsType.getAttributeName() != null) {
            String attributeName = codeDeliveryDetailsType.getAttributeName();
            jsonWriter.name("AttributeName");
            jsonWriter.value(attributeName);
        }
        jsonWriter.endObject();
    }

    private static CodeDeliveryDetailsTypeJsonMarshaller instance;

    public static CodeDeliveryDetailsTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CodeDeliveryDetailsTypeJsonMarshaller();
        return instance;
    }
}
