/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * Create Topic Rule Request Marshaller
 */
public class CreateTopicRuleRequestMarshaller implements Marshaller<Request<CreateTopicRuleRequest>, CreateTopicRuleRequest> {

    public Request<CreateTopicRuleRequest> marshall(CreateTopicRuleRequest createTopicRuleRequest) {
    if (createTopicRuleRequest == null) {
        throw new AmazonClientException("Invalid argument passed to marshall(...)");
    }

        Request<CreateTopicRuleRequest> request = new DefaultRequest<CreateTopicRuleRequest>(createTopicRuleRequest, "AWSIot");
        String target = "AWSIotService.CreateTopicRule";
        request.addHeader("X-Amz-Target", target);

        request.setHttpMethod(HttpMethodName.POST);
        String uriResourcePath = "/rules/{ruleName}"; 
        uriResourcePath = uriResourcePath.replace("{ruleName}", (createTopicRuleRequest.getRuleName() == null) ? "" : StringUtils.fromString(createTopicRuleRequest.getRuleName())); 

        uriResourcePath = uriResourcePath.replaceAll("//", "/");

        if (uriResourcePath.contains("?")) {
            String queryString = uriResourcePath.substring(uriResourcePath.indexOf("?") + 1);
            uriResourcePath    = uriResourcePath.substring(0, uriResourcePath.indexOf("?"));

            for (String s : queryString.split("[;&]")) {
                String[] nameValuePair = s.split("=");
                if (nameValuePair.length == 2) {
                    if(!(nameValuePair[1].isEmpty()))
                        request.addParameter(nameValuePair[0], nameValuePair[1]);
                }
            }
        }
        request.setResourcePath(uriResourcePath);
        
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);

            TopicRulePayload topicRulePayload = createTopicRuleRequest.getTopicRulePayload();
            if (topicRulePayload != null) {

                jsonWriter.beginObject();

                if (topicRulePayload.getSql() != null) {
                    jsonWriter.name("sql").value(topicRulePayload.getSql());
                }
                if (topicRulePayload.getDescription() != null) {
                    jsonWriter.name("description").value(topicRulePayload.getDescription());
                }

                com.amazonaws.internal.ListWithAutoConstructFlag<Action> actionsList = (com.amazonaws.internal.ListWithAutoConstructFlag<Action>)(topicRulePayload.getActions());
                if (actionsList != null && !(actionsList.isAutoConstruct() && actionsList.isEmpty())) {

                    jsonWriter.name("actions");
                    jsonWriter.beginArray();

                    for (Action actionsListValue : actionsList) {
                        if (actionsListValue != null) {
                            jsonWriter.beginObject();
                            DynamoDBAction dynamoDB = actionsListValue.getDynamoDB();
                            if (dynamoDB != null) {

                                jsonWriter.name("dynamoDB");
                                jsonWriter.beginObject();

                                if (dynamoDB.getTableName() != null) {
                                    jsonWriter.name("tableName").value(dynamoDB.getTableName());
                                }
                                if (dynamoDB.getRoleArn() != null) {
                                    jsonWriter.name("roleArn").value(dynamoDB.getRoleArn());
                                }
                                if (dynamoDB.getHashKeyField() != null) {
                                    jsonWriter.name("hashKeyField").value(dynamoDB.getHashKeyField());
                                }
                                if (dynamoDB.getHashKeyValue() != null) {
                                    jsonWriter.name("hashKeyValue").value(dynamoDB.getHashKeyValue());
                                }
                                if (dynamoDB.getRangeKeyField() != null) {
                                    jsonWriter.name("rangeKeyField").value(dynamoDB.getRangeKeyField());
                                }
                                if (dynamoDB.getRangeKeyValue() != null) {
                                    jsonWriter.name("rangeKeyValue").value(dynamoDB.getRangeKeyValue());
                                }
                                if (dynamoDB.getPayloadField() != null) {
                                    jsonWriter.name("payloadField").value(dynamoDB.getPayloadField());
                                }
                                jsonWriter.endObject();
                            }
                            LambdaAction lambda = actionsListValue.getLambda();
                            if (lambda != null) {

                                jsonWriter.name("lambda");
                                jsonWriter.beginObject();

                                if (lambda.getFunctionArn() != null) {
                                    jsonWriter.name("functionArn").value(lambda.getFunctionArn());
                                }
                                jsonWriter.endObject();
                            }
                            SnsAction sns = actionsListValue.getSns();
                            if (sns != null) {

                                jsonWriter.name("sns");
                                jsonWriter.beginObject();

                                if (sns.getTargetArn() != null) {
                                    jsonWriter.name("targetArn").value(sns.getTargetArn());
                                }
                                if (sns.getRoleArn() != null) {
                                    jsonWriter.name("roleArn").value(sns.getRoleArn());
                                }
                                jsonWriter.endObject();
                            }
                            SqsAction sqs = actionsListValue.getSqs();
                            if (sqs != null) {

                                jsonWriter.name("sqs");
                                jsonWriter.beginObject();

                                if (sqs.getRoleArn() != null) {
                                    jsonWriter.name("roleArn").value(sqs.getRoleArn());
                                }
                                if (sqs.getQueueUrl() != null) {
                                    jsonWriter.name("queueUrl").value(sqs.getQueueUrl());
                                }
                                if (sqs.isUseBase64() != null) {
                                    jsonWriter.name("useBase64").value(sqs.isUseBase64());
                                }
                                jsonWriter.endObject();
                            }
                            KinesisAction kinesis = actionsListValue.getKinesis();
                            if (kinesis != null) {

                                jsonWriter.name("kinesis");
                                jsonWriter.beginObject();

                                if (kinesis.getRoleArn() != null) {
                                    jsonWriter.name("roleArn").value(kinesis.getRoleArn());
                                }
                                if (kinesis.getStreamName() != null) {
                                    jsonWriter.name("streamName").value(kinesis.getStreamName());
                                }
                                if (kinesis.getPartitionKey() != null) {
                                    jsonWriter.name("partitionKey").value(kinesis.getPartitionKey());
                                }
                                jsonWriter.endObject();
                            }
                            RepublishAction republish = actionsListValue.getRepublish();
                            if (republish != null) {

                                jsonWriter.name("republish");
                                jsonWriter.beginObject();

                                if (republish.getRoleArn() != null) {
                                    jsonWriter.name("roleArn").value(republish.getRoleArn());
                                }
                                if (republish.getTopic() != null) {
                                    jsonWriter.name("topic").value(republish.getTopic());
                                }
                                jsonWriter.endObject();
                            }
                            S3Action s3 = actionsListValue.getS3();
                            if (s3 != null) {

                                jsonWriter.name("s3");
                                jsonWriter.beginObject();

                                if (s3.getRoleArn() != null) {
                                    jsonWriter.name("roleArn").value(s3.getRoleArn());
                                }
                                if (s3.getBucketName() != null) {
                                    jsonWriter.name("bucketName").value(s3.getBucketName());
                                }
                                if (s3.getKey() != null) {
                                    jsonWriter.name("key").value(s3.getKey());
                                }
                                jsonWriter.endObject();
                            }
                            FirehoseAction firehose = actionsListValue.getFirehose();
                            if (firehose != null) {

                                jsonWriter.name("firehose");
                                jsonWriter.beginObject();

                                if (firehose.getRoleArn() != null) {
                                    jsonWriter.name("roleArn").value(firehose.getRoleArn());
                                }
                                if (firehose.getDeliveryStreamName() != null) {
                                    jsonWriter.name("deliveryStreamName").value(firehose.getDeliveryStreamName());
                                }
                                jsonWriter.endObject();
                            }
                            jsonWriter.endObject();
                        }
                    }
                    jsonWriter.endArray();
                }
                if (topicRulePayload.isRuleDisabled() != null) {
                    jsonWriter.name("ruleDisabled").value(topicRulePayload.isRuleDisabled());
                }
                jsonWriter.endObject();
            }

            jsonWriter.close();
            String snippet = stringWriter.toString();
            byte[] content = snippet.getBytes(UTF8);
            request.setContent(new StringInputStream(snippet));
            request.addHeader("Content-Length", Integer.toString(content.length));
            request.addHeader("Content-Type", "application/x-amz-json-1.0");
        } catch(Throwable t) {
            throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }
}
