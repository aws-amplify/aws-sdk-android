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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Action
 */
class ActionJsonMarshaller {

    public void marshall(Action action, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
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
        if (action.getLambda() != null) {
            LambdaAction lambda = action.getLambda();
            jsonWriter.name("lambda");
            LambdaActionJsonMarshaller.getInstance().marshall(lambda, jsonWriter);
        }
        if (action.getSns() != null) {
            SnsAction sns = action.getSns();
            jsonWriter.name("sns");
            SnsActionJsonMarshaller.getInstance().marshall(sns, jsonWriter);
        }
        if (action.getSqs() != null) {
            SqsAction sqs = action.getSqs();
            jsonWriter.name("sqs");
            SqsActionJsonMarshaller.getInstance().marshall(sqs, jsonWriter);
        }
        if (action.getKinesis() != null) {
            KinesisAction kinesis = action.getKinesis();
            jsonWriter.name("kinesis");
            KinesisActionJsonMarshaller.getInstance().marshall(kinesis, jsonWriter);
        }
        if (action.getRepublish() != null) {
            RepublishAction republish = action.getRepublish();
            jsonWriter.name("republish");
            RepublishActionJsonMarshaller.getInstance().marshall(republish, jsonWriter);
        }
        if (action.getS3() != null) {
            S3Action s3 = action.getS3();
            jsonWriter.name("s3");
            S3ActionJsonMarshaller.getInstance().marshall(s3, jsonWriter);
        }
        if (action.getFirehose() != null) {
            FirehoseAction firehose = action.getFirehose();
            jsonWriter.name("firehose");
            FirehoseActionJsonMarshaller.getInstance().marshall(firehose, jsonWriter);
        }
        if (action.getCloudwatchMetric() != null) {
            CloudwatchMetricAction cloudwatchMetric = action.getCloudwatchMetric();
            jsonWriter.name("cloudwatchMetric");
            CloudwatchMetricActionJsonMarshaller.getInstance().marshall(cloudwatchMetric,
                    jsonWriter);
        }
        if (action.getCloudwatchAlarm() != null) {
            CloudwatchAlarmAction cloudwatchAlarm = action.getCloudwatchAlarm();
            jsonWriter.name("cloudwatchAlarm");
            CloudwatchAlarmActionJsonMarshaller.getInstance().marshall(cloudwatchAlarm, jsonWriter);
        }
        if (action.getElasticsearch() != null) {
            ElasticsearchAction elasticsearch = action.getElasticsearch();
            jsonWriter.name("elasticsearch");
            ElasticsearchActionJsonMarshaller.getInstance().marshall(elasticsearch, jsonWriter);
        }
        if (action.getSalesforce() != null) {
            SalesforceAction salesforce = action.getSalesforce();
            jsonWriter.name("salesforce");
            SalesforceActionJsonMarshaller.getInstance().marshall(salesforce, jsonWriter);
        }
        if (action.getIotAnalytics() != null) {
            IotAnalyticsAction iotAnalytics = action.getIotAnalytics();
            jsonWriter.name("iotAnalytics");
            IotAnalyticsActionJsonMarshaller.getInstance().marshall(iotAnalytics, jsonWriter);
        }
        if (action.getIotEvents() != null) {
            IotEventsAction iotEvents = action.getIotEvents();
            jsonWriter.name("iotEvents");
            IotEventsActionJsonMarshaller.getInstance().marshall(iotEvents, jsonWriter);
        }
        if (action.getStepFunctions() != null) {
            StepFunctionsAction stepFunctions = action.getStepFunctions();
            jsonWriter.name("stepFunctions");
            StepFunctionsActionJsonMarshaller.getInstance().marshall(stepFunctions, jsonWriter);
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
