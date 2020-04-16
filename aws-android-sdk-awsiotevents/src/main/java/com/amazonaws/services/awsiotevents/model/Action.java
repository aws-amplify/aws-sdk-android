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

package com.amazonaws.services.awsiotevents.model;

import java.io.Serializable;

/**
 * <p>
 * An action to be performed when the <code>condition</code> is TRUE.
 * </p>
 */
public class Action implements Serializable {
    /**
     * <p>
     * Sets a variable to a specified value.
     * </p>
     */
    private SetVariableAction setVariable;

    /**
     * <p>
     * Sends an Amazon SNS message.
     * </p>
     */
    private SNSTopicPublishAction sns;

    /**
     * <p>
     * Publishes an MQTT message with the given topic to the AWS IoT message
     * broker.
     * </p>
     */
    private IotTopicPublishAction iotTopicPublish;

    /**
     * <p>
     * Information needed to set the timer.
     * </p>
     */
    private SetTimerAction setTimer;

    /**
     * <p>
     * Information needed to clear the timer.
     * </p>
     */
    private ClearTimerAction clearTimer;

    /**
     * <p>
     * Information needed to reset the timer.
     * </p>
     */
    private ResetTimerAction resetTimer;

    /**
     * <p>
     * Calls a Lambda function, passing in information about the detector model
     * instance and the event that triggered the action.
     * </p>
     */
    private LambdaAction lambda;

    /**
     * <p>
     * Sends AWS IoT Events input, which passes information about the detector
     * model instance and the event that triggered the action.
     * </p>
     */
    private IotEventsAction iotEvents;

    /**
     * <p>
     * Sends information about the detector model instance and the event that
     * triggered the action to an Amazon SQS queue.
     * </p>
     */
    private SqsAction sqs;

    /**
     * <p>
     * Sends information about the detector model instance and the event that
     * triggered the action to an Amazon Kinesis Data Firehose delivery stream.
     * </p>
     */
    private FirehoseAction firehose;

    /**
     * <p>
     * Writes to the DynamoDB table that you created. The default action payload
     * contains all attribute-value pairs that have the information about the
     * detector model instance and the event that triggered the action. You can
     * also customize the <a href=
     * "https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html"
     * >payload</a>. One column of the DynamoDB table receives all
     * attribute-value pairs in the payload that you specify. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-event-actions.html"
     * >Actions</a> in <i>AWS IoT Events Developer Guide</i>.
     * </p>
     */
    private DynamoDBAction dynamoDB;

    /**
     * <p>
     * Writes to the DynamoDB table that you created. The default action payload
     * contains all attribute-value pairs that have the information about the
     * detector model instance and the event that triggered the action. You can
     * also customize the <a href=
     * "https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html"
     * >payload</a>. A separate column of the DynamoDB table receives one
     * attribute-value pair in the payload that you specify. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-event-actions.html"
     * >Actions</a> in <i>AWS IoT Events Developer Guide</i>.
     * </p>
     */
    private DynamoDBv2Action dynamoDBv2;

    /**
     * <p>
     * Sets a variable to a specified value.
     * </p>
     *
     * @return <p>
     *         Sets a variable to a specified value.
     *         </p>
     */
    public SetVariableAction getSetVariable() {
        return setVariable;
    }

    /**
     * <p>
     * Sets a variable to a specified value.
     * </p>
     *
     * @param setVariable <p>
     *            Sets a variable to a specified value.
     *            </p>
     */
    public void setSetVariable(SetVariableAction setVariable) {
        this.setVariable = setVariable;
    }

    /**
     * <p>
     * Sets a variable to a specified value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param setVariable <p>
     *            Sets a variable to a specified value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Action withSetVariable(SetVariableAction setVariable) {
        this.setVariable = setVariable;
        return this;
    }

    /**
     * <p>
     * Sends an Amazon SNS message.
     * </p>
     *
     * @return <p>
     *         Sends an Amazon SNS message.
     *         </p>
     */
    public SNSTopicPublishAction getSns() {
        return sns;
    }

    /**
     * <p>
     * Sends an Amazon SNS message.
     * </p>
     *
     * @param sns <p>
     *            Sends an Amazon SNS message.
     *            </p>
     */
    public void setSns(SNSTopicPublishAction sns) {
        this.sns = sns;
    }

    /**
     * <p>
     * Sends an Amazon SNS message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sns <p>
     *            Sends an Amazon SNS message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Action withSns(SNSTopicPublishAction sns) {
        this.sns = sns;
        return this;
    }

    /**
     * <p>
     * Publishes an MQTT message with the given topic to the AWS IoT message
     * broker.
     * </p>
     *
     * @return <p>
     *         Publishes an MQTT message with the given topic to the AWS IoT
     *         message broker.
     *         </p>
     */
    public IotTopicPublishAction getIotTopicPublish() {
        return iotTopicPublish;
    }

    /**
     * <p>
     * Publishes an MQTT message with the given topic to the AWS IoT message
     * broker.
     * </p>
     *
     * @param iotTopicPublish <p>
     *            Publishes an MQTT message with the given topic to the AWS IoT
     *            message broker.
     *            </p>
     */
    public void setIotTopicPublish(IotTopicPublishAction iotTopicPublish) {
        this.iotTopicPublish = iotTopicPublish;
    }

    /**
     * <p>
     * Publishes an MQTT message with the given topic to the AWS IoT message
     * broker.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iotTopicPublish <p>
     *            Publishes an MQTT message with the given topic to the AWS IoT
     *            message broker.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Action withIotTopicPublish(IotTopicPublishAction iotTopicPublish) {
        this.iotTopicPublish = iotTopicPublish;
        return this;
    }

    /**
     * <p>
     * Information needed to set the timer.
     * </p>
     *
     * @return <p>
     *         Information needed to set the timer.
     *         </p>
     */
    public SetTimerAction getSetTimer() {
        return setTimer;
    }

    /**
     * <p>
     * Information needed to set the timer.
     * </p>
     *
     * @param setTimer <p>
     *            Information needed to set the timer.
     *            </p>
     */
    public void setSetTimer(SetTimerAction setTimer) {
        this.setTimer = setTimer;
    }

    /**
     * <p>
     * Information needed to set the timer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param setTimer <p>
     *            Information needed to set the timer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Action withSetTimer(SetTimerAction setTimer) {
        this.setTimer = setTimer;
        return this;
    }

    /**
     * <p>
     * Information needed to clear the timer.
     * </p>
     *
     * @return <p>
     *         Information needed to clear the timer.
     *         </p>
     */
    public ClearTimerAction getClearTimer() {
        return clearTimer;
    }

    /**
     * <p>
     * Information needed to clear the timer.
     * </p>
     *
     * @param clearTimer <p>
     *            Information needed to clear the timer.
     *            </p>
     */
    public void setClearTimer(ClearTimerAction clearTimer) {
        this.clearTimer = clearTimer;
    }

    /**
     * <p>
     * Information needed to clear the timer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clearTimer <p>
     *            Information needed to clear the timer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Action withClearTimer(ClearTimerAction clearTimer) {
        this.clearTimer = clearTimer;
        return this;
    }

    /**
     * <p>
     * Information needed to reset the timer.
     * </p>
     *
     * @return <p>
     *         Information needed to reset the timer.
     *         </p>
     */
    public ResetTimerAction getResetTimer() {
        return resetTimer;
    }

    /**
     * <p>
     * Information needed to reset the timer.
     * </p>
     *
     * @param resetTimer <p>
     *            Information needed to reset the timer.
     *            </p>
     */
    public void setResetTimer(ResetTimerAction resetTimer) {
        this.resetTimer = resetTimer;
    }

    /**
     * <p>
     * Information needed to reset the timer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resetTimer <p>
     *            Information needed to reset the timer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Action withResetTimer(ResetTimerAction resetTimer) {
        this.resetTimer = resetTimer;
        return this;
    }

    /**
     * <p>
     * Calls a Lambda function, passing in information about the detector model
     * instance and the event that triggered the action.
     * </p>
     *
     * @return <p>
     *         Calls a Lambda function, passing in information about the
     *         detector model instance and the event that triggered the action.
     *         </p>
     */
    public LambdaAction getLambda() {
        return lambda;
    }

    /**
     * <p>
     * Calls a Lambda function, passing in information about the detector model
     * instance and the event that triggered the action.
     * </p>
     *
     * @param lambda <p>
     *            Calls a Lambda function, passing in information about the
     *            detector model instance and the event that triggered the
     *            action.
     *            </p>
     */
    public void setLambda(LambdaAction lambda) {
        this.lambda = lambda;
    }

    /**
     * <p>
     * Calls a Lambda function, passing in information about the detector model
     * instance and the event that triggered the action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lambda <p>
     *            Calls a Lambda function, passing in information about the
     *            detector model instance and the event that triggered the
     *            action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Action withLambda(LambdaAction lambda) {
        this.lambda = lambda;
        return this;
    }

    /**
     * <p>
     * Sends AWS IoT Events input, which passes information about the detector
     * model instance and the event that triggered the action.
     * </p>
     *
     * @return <p>
     *         Sends AWS IoT Events input, which passes information about the
     *         detector model instance and the event that triggered the action.
     *         </p>
     */
    public IotEventsAction getIotEvents() {
        return iotEvents;
    }

    /**
     * <p>
     * Sends AWS IoT Events input, which passes information about the detector
     * model instance and the event that triggered the action.
     * </p>
     *
     * @param iotEvents <p>
     *            Sends AWS IoT Events input, which passes information about the
     *            detector model instance and the event that triggered the
     *            action.
     *            </p>
     */
    public void setIotEvents(IotEventsAction iotEvents) {
        this.iotEvents = iotEvents;
    }

    /**
     * <p>
     * Sends AWS IoT Events input, which passes information about the detector
     * model instance and the event that triggered the action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iotEvents <p>
     *            Sends AWS IoT Events input, which passes information about the
     *            detector model instance and the event that triggered the
     *            action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Action withIotEvents(IotEventsAction iotEvents) {
        this.iotEvents = iotEvents;
        return this;
    }

    /**
     * <p>
     * Sends information about the detector model instance and the event that
     * triggered the action to an Amazon SQS queue.
     * </p>
     *
     * @return <p>
     *         Sends information about the detector model instance and the event
     *         that triggered the action to an Amazon SQS queue.
     *         </p>
     */
    public SqsAction getSqs() {
        return sqs;
    }

    /**
     * <p>
     * Sends information about the detector model instance and the event that
     * triggered the action to an Amazon SQS queue.
     * </p>
     *
     * @param sqs <p>
     *            Sends information about the detector model instance and the
     *            event that triggered the action to an Amazon SQS queue.
     *            </p>
     */
    public void setSqs(SqsAction sqs) {
        this.sqs = sqs;
    }

    /**
     * <p>
     * Sends information about the detector model instance and the event that
     * triggered the action to an Amazon SQS queue.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sqs <p>
     *            Sends information about the detector model instance and the
     *            event that triggered the action to an Amazon SQS queue.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Action withSqs(SqsAction sqs) {
        this.sqs = sqs;
        return this;
    }

    /**
     * <p>
     * Sends information about the detector model instance and the event that
     * triggered the action to an Amazon Kinesis Data Firehose delivery stream.
     * </p>
     *
     * @return <p>
     *         Sends information about the detector model instance and the event
     *         that triggered the action to an Amazon Kinesis Data Firehose
     *         delivery stream.
     *         </p>
     */
    public FirehoseAction getFirehose() {
        return firehose;
    }

    /**
     * <p>
     * Sends information about the detector model instance and the event that
     * triggered the action to an Amazon Kinesis Data Firehose delivery stream.
     * </p>
     *
     * @param firehose <p>
     *            Sends information about the detector model instance and the
     *            event that triggered the action to an Amazon Kinesis Data
     *            Firehose delivery stream.
     *            </p>
     */
    public void setFirehose(FirehoseAction firehose) {
        this.firehose = firehose;
    }

    /**
     * <p>
     * Sends information about the detector model instance and the event that
     * triggered the action to an Amazon Kinesis Data Firehose delivery stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param firehose <p>
     *            Sends information about the detector model instance and the
     *            event that triggered the action to an Amazon Kinesis Data
     *            Firehose delivery stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Action withFirehose(FirehoseAction firehose) {
        this.firehose = firehose;
        return this;
    }

    /**
     * <p>
     * Writes to the DynamoDB table that you created. The default action payload
     * contains all attribute-value pairs that have the information about the
     * detector model instance and the event that triggered the action. You can
     * also customize the <a href=
     * "https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html"
     * >payload</a>. One column of the DynamoDB table receives all
     * attribute-value pairs in the payload that you specify. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-event-actions.html"
     * >Actions</a> in <i>AWS IoT Events Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         Writes to the DynamoDB table that you created. The default action
     *         payload contains all attribute-value pairs that have the
     *         information about the detector model instance and the event that
     *         triggered the action. You can also customize the <a href=
     *         "https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html"
     *         >payload</a>. One column of the DynamoDB table receives all
     *         attribute-value pairs in the payload that you specify. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-event-actions.html"
     *         >Actions</a> in <i>AWS IoT Events Developer Guide</i>.
     *         </p>
     */
    public DynamoDBAction getDynamoDB() {
        return dynamoDB;
    }

    /**
     * <p>
     * Writes to the DynamoDB table that you created. The default action payload
     * contains all attribute-value pairs that have the information about the
     * detector model instance and the event that triggered the action. You can
     * also customize the <a href=
     * "https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html"
     * >payload</a>. One column of the DynamoDB table receives all
     * attribute-value pairs in the payload that you specify. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-event-actions.html"
     * >Actions</a> in <i>AWS IoT Events Developer Guide</i>.
     * </p>
     *
     * @param dynamoDB <p>
     *            Writes to the DynamoDB table that you created. The default
     *            action payload contains all attribute-value pairs that have
     *            the information about the detector model instance and the
     *            event that triggered the action. You can also customize the <a
     *            href=
     *            "https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html"
     *            >payload</a>. One column of the DynamoDB table receives all
     *            attribute-value pairs in the payload that you specify. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-event-actions.html"
     *            >Actions</a> in <i>AWS IoT Events Developer Guide</i>.
     *            </p>
     */
    public void setDynamoDB(DynamoDBAction dynamoDB) {
        this.dynamoDB = dynamoDB;
    }

    /**
     * <p>
     * Writes to the DynamoDB table that you created. The default action payload
     * contains all attribute-value pairs that have the information about the
     * detector model instance and the event that triggered the action. You can
     * also customize the <a href=
     * "https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html"
     * >payload</a>. One column of the DynamoDB table receives all
     * attribute-value pairs in the payload that you specify. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-event-actions.html"
     * >Actions</a> in <i>AWS IoT Events Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dynamoDB <p>
     *            Writes to the DynamoDB table that you created. The default
     *            action payload contains all attribute-value pairs that have
     *            the information about the detector model instance and the
     *            event that triggered the action. You can also customize the <a
     *            href=
     *            "https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html"
     *            >payload</a>. One column of the DynamoDB table receives all
     *            attribute-value pairs in the payload that you specify. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-event-actions.html"
     *            >Actions</a> in <i>AWS IoT Events Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Action withDynamoDB(DynamoDBAction dynamoDB) {
        this.dynamoDB = dynamoDB;
        return this;
    }

    /**
     * <p>
     * Writes to the DynamoDB table that you created. The default action payload
     * contains all attribute-value pairs that have the information about the
     * detector model instance and the event that triggered the action. You can
     * also customize the <a href=
     * "https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html"
     * >payload</a>. A separate column of the DynamoDB table receives one
     * attribute-value pair in the payload that you specify. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-event-actions.html"
     * >Actions</a> in <i>AWS IoT Events Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         Writes to the DynamoDB table that you created. The default action
     *         payload contains all attribute-value pairs that have the
     *         information about the detector model instance and the event that
     *         triggered the action. You can also customize the <a href=
     *         "https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html"
     *         >payload</a>. A separate column of the DynamoDB table receives
     *         one attribute-value pair in the payload that you specify. For
     *         more information, see <a href=
     *         "https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-event-actions.html"
     *         >Actions</a> in <i>AWS IoT Events Developer Guide</i>.
     *         </p>
     */
    public DynamoDBv2Action getDynamoDBv2() {
        return dynamoDBv2;
    }

    /**
     * <p>
     * Writes to the DynamoDB table that you created. The default action payload
     * contains all attribute-value pairs that have the information about the
     * detector model instance and the event that triggered the action. You can
     * also customize the <a href=
     * "https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html"
     * >payload</a>. A separate column of the DynamoDB table receives one
     * attribute-value pair in the payload that you specify. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-event-actions.html"
     * >Actions</a> in <i>AWS IoT Events Developer Guide</i>.
     * </p>
     *
     * @param dynamoDBv2 <p>
     *            Writes to the DynamoDB table that you created. The default
     *            action payload contains all attribute-value pairs that have
     *            the information about the detector model instance and the
     *            event that triggered the action. You can also customize the <a
     *            href=
     *            "https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html"
     *            >payload</a>. A separate column of the DynamoDB table receives
     *            one attribute-value pair in the payload that you specify. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-event-actions.html"
     *            >Actions</a> in <i>AWS IoT Events Developer Guide</i>.
     *            </p>
     */
    public void setDynamoDBv2(DynamoDBv2Action dynamoDBv2) {
        this.dynamoDBv2 = dynamoDBv2;
    }

    /**
     * <p>
     * Writes to the DynamoDB table that you created. The default action payload
     * contains all attribute-value pairs that have the information about the
     * detector model instance and the event that triggered the action. You can
     * also customize the <a href=
     * "https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html"
     * >payload</a>. A separate column of the DynamoDB table receives one
     * attribute-value pair in the payload that you specify. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-event-actions.html"
     * >Actions</a> in <i>AWS IoT Events Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dynamoDBv2 <p>
     *            Writes to the DynamoDB table that you created. The default
     *            action payload contains all attribute-value pairs that have
     *            the information about the detector model instance and the
     *            event that triggered the action. You can also customize the <a
     *            href=
     *            "https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html"
     *            >payload</a>. A separate column of the DynamoDB table receives
     *            one attribute-value pair in the payload that you specify. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-event-actions.html"
     *            >Actions</a> in <i>AWS IoT Events Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Action withDynamoDBv2(DynamoDBv2Action dynamoDBv2) {
        this.dynamoDBv2 = dynamoDBv2;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSetVariable() != null)
            sb.append("setVariable: " + getSetVariable() + ",");
        if (getSns() != null)
            sb.append("sns: " + getSns() + ",");
        if (getIotTopicPublish() != null)
            sb.append("iotTopicPublish: " + getIotTopicPublish() + ",");
        if (getSetTimer() != null)
            sb.append("setTimer: " + getSetTimer() + ",");
        if (getClearTimer() != null)
            sb.append("clearTimer: " + getClearTimer() + ",");
        if (getResetTimer() != null)
            sb.append("resetTimer: " + getResetTimer() + ",");
        if (getLambda() != null)
            sb.append("lambda: " + getLambda() + ",");
        if (getIotEvents() != null)
            sb.append("iotEvents: " + getIotEvents() + ",");
        if (getSqs() != null)
            sb.append("sqs: " + getSqs() + ",");
        if (getFirehose() != null)
            sb.append("firehose: " + getFirehose() + ",");
        if (getDynamoDB() != null)
            sb.append("dynamoDB: " + getDynamoDB() + ",");
        if (getDynamoDBv2() != null)
            sb.append("dynamoDBv2: " + getDynamoDBv2());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSetVariable() == null) ? 0 : getSetVariable().hashCode());
        hashCode = prime * hashCode + ((getSns() == null) ? 0 : getSns().hashCode());
        hashCode = prime * hashCode
                + ((getIotTopicPublish() == null) ? 0 : getIotTopicPublish().hashCode());
        hashCode = prime * hashCode + ((getSetTimer() == null) ? 0 : getSetTimer().hashCode());
        hashCode = prime * hashCode + ((getClearTimer() == null) ? 0 : getClearTimer().hashCode());
        hashCode = prime * hashCode + ((getResetTimer() == null) ? 0 : getResetTimer().hashCode());
        hashCode = prime * hashCode + ((getLambda() == null) ? 0 : getLambda().hashCode());
        hashCode = prime * hashCode + ((getIotEvents() == null) ? 0 : getIotEvents().hashCode());
        hashCode = prime * hashCode + ((getSqs() == null) ? 0 : getSqs().hashCode());
        hashCode = prime * hashCode + ((getFirehose() == null) ? 0 : getFirehose().hashCode());
        hashCode = prime * hashCode + ((getDynamoDB() == null) ? 0 : getDynamoDB().hashCode());
        hashCode = prime * hashCode + ((getDynamoDBv2() == null) ? 0 : getDynamoDBv2().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Action == false)
            return false;
        Action other = (Action) obj;

        if (other.getSetVariable() == null ^ this.getSetVariable() == null)
            return false;
        if (other.getSetVariable() != null
                && other.getSetVariable().equals(this.getSetVariable()) == false)
            return false;
        if (other.getSns() == null ^ this.getSns() == null)
            return false;
        if (other.getSns() != null && other.getSns().equals(this.getSns()) == false)
            return false;
        if (other.getIotTopicPublish() == null ^ this.getIotTopicPublish() == null)
            return false;
        if (other.getIotTopicPublish() != null
                && other.getIotTopicPublish().equals(this.getIotTopicPublish()) == false)
            return false;
        if (other.getSetTimer() == null ^ this.getSetTimer() == null)
            return false;
        if (other.getSetTimer() != null && other.getSetTimer().equals(this.getSetTimer()) == false)
            return false;
        if (other.getClearTimer() == null ^ this.getClearTimer() == null)
            return false;
        if (other.getClearTimer() != null
                && other.getClearTimer().equals(this.getClearTimer()) == false)
            return false;
        if (other.getResetTimer() == null ^ this.getResetTimer() == null)
            return false;
        if (other.getResetTimer() != null
                && other.getResetTimer().equals(this.getResetTimer()) == false)
            return false;
        if (other.getLambda() == null ^ this.getLambda() == null)
            return false;
        if (other.getLambda() != null && other.getLambda().equals(this.getLambda()) == false)
            return false;
        if (other.getIotEvents() == null ^ this.getIotEvents() == null)
            return false;
        if (other.getIotEvents() != null
                && other.getIotEvents().equals(this.getIotEvents()) == false)
            return false;
        if (other.getSqs() == null ^ this.getSqs() == null)
            return false;
        if (other.getSqs() != null && other.getSqs().equals(this.getSqs()) == false)
            return false;
        if (other.getFirehose() == null ^ this.getFirehose() == null)
            return false;
        if (other.getFirehose() != null && other.getFirehose().equals(this.getFirehose()) == false)
            return false;
        if (other.getDynamoDB() == null ^ this.getDynamoDB() == null)
            return false;
        if (other.getDynamoDB() != null && other.getDynamoDB().equals(this.getDynamoDB()) == false)
            return false;
        if (other.getDynamoDBv2() == null ^ this.getDynamoDBv2() == null)
            return false;
        if (other.getDynamoDBv2() != null
                && other.getDynamoDBv2().equals(this.getDynamoDBv2()) == false)
            return false;
        return true;
    }
}
