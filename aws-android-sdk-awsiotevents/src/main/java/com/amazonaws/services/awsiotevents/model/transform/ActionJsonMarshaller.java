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

package com.amazonaws.services.awsiotevents.model.transform;

import com.amazonaws.services.awsiotevents.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Action
 */
class ActionJsonMarshaller {

    public void marshall(Action action, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (action.getSetVariable() != null) {
            SetVariableAction setVariable = action.getSetVariable();
            jsonWriter.name("setVariable");
            SetVariableActionJsonMarshaller.getInstance().marshall(setVariable, jsonWriter);
        }
        if (action.getSns() != null) {
            SNSTopicPublishAction sns = action.getSns();
            jsonWriter.name("sns");
            SNSTopicPublishActionJsonMarshaller.getInstance().marshall(sns, jsonWriter);
        }
        if (action.getIotTopicPublish() != null) {
            IotTopicPublishAction iotTopicPublish = action.getIotTopicPublish();
            jsonWriter.name("iotTopicPublish");
            IotTopicPublishActionJsonMarshaller.getInstance().marshall(iotTopicPublish, jsonWriter);
        }
        if (action.getSetTimer() != null) {
            SetTimerAction setTimer = action.getSetTimer();
            jsonWriter.name("setTimer");
            SetTimerActionJsonMarshaller.getInstance().marshall(setTimer, jsonWriter);
        }
        if (action.getClearTimer() != null) {
            ClearTimerAction clearTimer = action.getClearTimer();
            jsonWriter.name("clearTimer");
            ClearTimerActionJsonMarshaller.getInstance().marshall(clearTimer, jsonWriter);
        }
        if (action.getResetTimer() != null) {
            ResetTimerAction resetTimer = action.getResetTimer();
            jsonWriter.name("resetTimer");
            ResetTimerActionJsonMarshaller.getInstance().marshall(resetTimer, jsonWriter);
        }
        if (action.getLambda() != null) {
            LambdaAction lambda = action.getLambda();
            jsonWriter.name("lambda");
            LambdaActionJsonMarshaller.getInstance().marshall(lambda, jsonWriter);
        }
        if (action.getIotEvents() != null) {
            IotEventsAction iotEvents = action.getIotEvents();
            jsonWriter.name("iotEvents");
            IotEventsActionJsonMarshaller.getInstance().marshall(iotEvents, jsonWriter);
        }
        if (action.getSqs() != null) {
            SqsAction sqs = action.getSqs();
            jsonWriter.name("sqs");
            SqsActionJsonMarshaller.getInstance().marshall(sqs, jsonWriter);
        }
        if (action.getFirehose() != null) {
            FirehoseAction firehose = action.getFirehose();
            jsonWriter.name("firehose");
            FirehoseActionJsonMarshaller.getInstance().marshall(firehose, jsonWriter);
        }
        if (action.getDynamoDB() != null) {
            DynamoDBAction dynamoDB = action.getDynamoDB();
            jsonWriter.name("dynamoDB");
            DynamoDBActionJsonMarshaller.getInstance().marshall(dynamoDB, jsonWriter);
        }
        if (action.getDynamoDBv2() != null) {
            DynamoDBv2Action dynamoDBv2 = action.getDynamoDBv2();
            jsonWriter.name("dynamoDBv2");
            DynamoDBv2ActionJsonMarshaller.getInstance().marshall(dynamoDBv2, jsonWriter);
        }
        if (action.getIotSiteWise() != null) {
            IotSiteWiseAction iotSiteWise = action.getIotSiteWise();
            jsonWriter.name("iotSiteWise");
            IotSiteWiseActionJsonMarshaller.getInstance().marshall(iotSiteWise, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ActionJsonMarshaller instance;

    public static ActionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ActionJsonMarshaller();
        return instance;
    }
}
