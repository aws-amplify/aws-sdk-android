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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response GetHostReservationPurchasePreviewResult
 */
public class GetHostReservationPurchasePreviewResultJsonUnmarshaller implements
        Unmarshaller<GetHostReservationPurchasePreviewResult, JsonUnmarshallerContext> {

    public GetHostReservationPurchasePreviewResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        GetHostReservationPurchasePreviewResult getHostReservationPurchasePreviewResult = new GetHostReservationPurchasePreviewResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("CurrencyCode")) {
                getHostReservationPurchasePreviewResult.setCurrencyCode(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Purchase")) {
                getHostReservationPurchasePreviewResult.setPurchase(new ListUnmarshaller<Purchase>(
                        PurchaseJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("TotalHourlyPrice")) {
                getHostReservationPurchasePreviewResult.setTotalHourlyPrice(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("TotalUpfrontPrice")) {
                getHostReservationPurchasePreviewResult.setTotalUpfrontPrice(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getHostReservationPurchasePreviewResult;
    }

    private static GetHostReservationPurchasePreviewResultJsonUnmarshaller instance;

    public static GetHostReservationPurchasePreviewResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetHostReservationPurchasePreviewResultJsonUnmarshaller();
        return instance;
    }
}
