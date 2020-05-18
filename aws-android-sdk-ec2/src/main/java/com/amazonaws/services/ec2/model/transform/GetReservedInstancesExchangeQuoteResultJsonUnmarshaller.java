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
 * JSON unmarshaller for response GetReservedInstancesExchangeQuoteResult
 */
public class GetReservedInstancesExchangeQuoteResultJsonUnmarshaller implements
        Unmarshaller<GetReservedInstancesExchangeQuoteResult, JsonUnmarshallerContext> {

    public GetReservedInstancesExchangeQuoteResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        GetReservedInstancesExchangeQuoteResult getReservedInstancesExchangeQuoteResult = new GetReservedInstancesExchangeQuoteResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("CurrencyCode")) {
                getReservedInstancesExchangeQuoteResult.setCurrencyCode(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("IsValidExchange")) {
                getReservedInstancesExchangeQuoteResult.setIsValidExchange(BooleanJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("OutputReservedInstancesWillExpireAt")) {
                getReservedInstancesExchangeQuoteResult
                        .setOutputReservedInstancesWillExpireAt(DateJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("PaymentDue")) {
                getReservedInstancesExchangeQuoteResult.setPaymentDue(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ReservedInstanceValueRollup")) {
                getReservedInstancesExchangeQuoteResult
                        .setReservedInstanceValueRollup(ReservationValueJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("ReservedInstanceValueSet")) {
                getReservedInstancesExchangeQuoteResult
                        .setReservedInstanceValueSet(new ListUnmarshaller<ReservedInstanceReservationValue>(
                                ReservedInstanceReservationValueJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("TargetConfigurationValueRollup")) {
                getReservedInstancesExchangeQuoteResult
                        .setTargetConfigurationValueRollup(ReservationValueJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("TargetConfigurationValueSet")) {
                getReservedInstancesExchangeQuoteResult
                        .setTargetConfigurationValueSet(new ListUnmarshaller<TargetReservationValue>(
                                TargetReservationValueJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ValidationFailureReason")) {
                getReservedInstancesExchangeQuoteResult
                        .setValidationFailureReason(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getReservedInstancesExchangeQuoteResult;
    }

    private static GetReservedInstancesExchangeQuoteResultJsonUnmarshaller instance;

    public static GetReservedInstancesExchangeQuoteResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetReservedInstancesExchangeQuoteResultJsonUnmarshaller();
        return instance;
    }
}
