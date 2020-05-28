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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response SendCommandResult
 */
public class SendCommandResultJsonUnmarshaller implements
        Unmarshaller<SendCommandResult, JsonUnmarshallerContext> {

    public SendCommandResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        SendCommandResult sendCommandResult = new SendCommandResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("StartSession")) {
                sendCommandResult.setStartSession(StartSessionResultJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StartTransaction")) {
                sendCommandResult.setStartTransaction(StartTransactionResultJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("EndSession")) {
                sendCommandResult.setEndSession(EndSessionResultJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CommitTransaction")) {
                sendCommandResult.setCommitTransaction(CommitTransactionResultJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("AbortTransaction")) {
                sendCommandResult.setAbortTransaction(AbortTransactionResultJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ExecuteStatement")) {
                sendCommandResult.setExecuteStatement(ExecuteStatementResultJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("FetchPage")) {
                sendCommandResult.setFetchPage(FetchPageResultJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return sendCommandResult;
    }

    private static SendCommandResultJsonUnmarshaller instance;

    public static SendCommandResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SendCommandResultJsonUnmarshaller();
        return instance;
    }
}
