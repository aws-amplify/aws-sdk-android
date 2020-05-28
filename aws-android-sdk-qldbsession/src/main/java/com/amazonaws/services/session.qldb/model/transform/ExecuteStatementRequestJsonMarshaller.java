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

package com.amazonaws.services.session.qldb.model.transform;

import com.amazonaws.services.session.qldb.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ExecuteStatementRequest
 */
class ExecuteStatementRequestJsonMarshaller {

    public void marshall(ExecuteStatementRequest executeStatementRequest, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (executeStatementRequest.getTransactionId() != null) {
            String transactionId = executeStatementRequest.getTransactionId();
            jsonWriter.name("TransactionId");
            jsonWriter.value(transactionId);
        }
        if (executeStatementRequest.getStatement() != null) {
            String statement = executeStatementRequest.getStatement();
            jsonWriter.name("Statement");
            jsonWriter.value(statement);
        }
        if (executeStatementRequest.getParameters() != null) {
            java.util.List<ValueHolder> parameters = executeStatementRequest.getParameters();
            jsonWriter.name("Parameters");
            jsonWriter.beginArray();
            for (ValueHolder parametersItem : parameters) {
                if (parametersItem != null) {
                    ValueHolderJsonMarshaller.getInstance().marshall(parametersItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ExecuteStatementRequestJsonMarshaller instance;

    public static ExecuteStatementRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ExecuteStatementRequestJsonMarshaller();
        return instance;
    }
}
