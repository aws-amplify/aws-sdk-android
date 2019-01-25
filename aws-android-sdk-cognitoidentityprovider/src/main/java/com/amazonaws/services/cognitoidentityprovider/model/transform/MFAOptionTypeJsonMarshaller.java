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
 * JSON marshaller for POJO MFAOptionType
 */
class MFAOptionTypeJsonMarshaller {

    public void marshall(MFAOptionType mFAOptionType, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (mFAOptionType.getDeliveryMedium() != null) {
            String deliveryMedium = mFAOptionType.getDeliveryMedium();
            jsonWriter.name("DeliveryMedium");
            jsonWriter.value(deliveryMedium);
        }
        if (mFAOptionType.getAttributeName() != null) {
            String attributeName = mFAOptionType.getAttributeName();
            jsonWriter.name("AttributeName");
            jsonWriter.value(attributeName);
        }
        jsonWriter.endObject();
    }

    private static MFAOptionTypeJsonMarshaller instance;

    public static MFAOptionTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MFAOptionTypeJsonMarshaller();
        return instance;
    }
}
