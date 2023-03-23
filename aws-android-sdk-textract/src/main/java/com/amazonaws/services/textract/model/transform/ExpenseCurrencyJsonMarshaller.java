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

package com.amazonaws.services.textract.model.transform;

import com.amazonaws.services.textract.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ExpenseCurrency
 */
class ExpenseCurrencyJsonMarshaller {

    public void marshall(ExpenseCurrency expenseCurrency, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (expenseCurrency.getCode() != null) {
            String code = expenseCurrency.getCode();
            jsonWriter.name("Code");
            jsonWriter.value(code);
        }
        if (expenseCurrency.getConfidence() != null) {
            Float confidence = expenseCurrency.getConfidence();
            jsonWriter.name("Confidence");
            jsonWriter.value(confidence);
        }
        jsonWriter.endObject();
    }

    private static ExpenseCurrencyJsonMarshaller instance;

    public static ExpenseCurrencyJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ExpenseCurrencyJsonMarshaller();
        return instance;
    }
}
