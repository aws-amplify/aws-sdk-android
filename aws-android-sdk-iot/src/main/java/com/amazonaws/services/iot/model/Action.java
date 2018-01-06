/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the actions associated with a rule.
 * </p>
 */
public class Action implements Serializable {
    /**
     * <p>
     * Write to a DynamoDB table.
     * </p>
     */
    private DynamoDBAction dynamoDB;

    /**
     * <p>
     * Write to a DynamoDB table. This is a new version of the DynamoDB action.
     * It allows you to write each attribute in an MQTT message payload into a
     * separate DynamoDB column.
     * </p>
     */
    private DynamoDBv2Action dynamoDBv2;

    /**
     * <p>
     * Invoke a Lambda function.
     * </p>
     */
    private LambdaAction lambda;

    /**
     * <p>
     * Publish to an Amazon SNS topic.
     * </p>
     */
    private SnsAction sns;

    /**
     * <p>
     * Publish to an Amazon SQS queue.
     * </p>
     */
    private SqsAction sqs;

    /**
     * <p>
     * Write data to an Amazon Kinesis stream.
     * </p>
     */
    private KinesisAction kinesis;

    /**
     * <p>
     * Publish to another MQTT topic.
     * </p>
     */
    private RepublishAction republish;

    /**
     * <p>
     * Write to an Amazon S3 bucket.
     * </p>
     */
    private S3Action s3;

    /**
     * <p>
     * Write to an Amazon Kinesis Firehose stream.
     * </p>
     */
    private FirehoseAction firehose;

    /**
     * <p>
     * Capture a CloudWatch metric.
     * </p>
     */
    private CloudwatchMetricAction cloudwatchMetric;

    /**
     * <p>
     * Change the state of a CloudWatch alarm.
     * </p>
     */
    private CloudwatchAlarmAction cloudwatchAlarm;

    /**
     * <p>
     * Write data to an Amazon Elasticsearch Service domain.
     * </p>
     */
    private ElasticsearchAction elasticsearch;

    /**
     * <p>
     * Write to a DynamoDB table.
     * </p>
     *
     * @return <p>
     *         Write to a DynamoDB table.
     *         </p>
     */
    public DynamoDBAction getDynamoDB() {
        return dynamoDB;
    }

    /**
     * <p>
     * Write to a DynamoDB table.
     * </p>
     *
     * @param dynamoDB <p>
     *            Write to a DynamoDB table.
     *            </p>
     */
    public void setDynamoDB(DynamoDBAction dynamoDB) {
        this.dynamoDB = dynamoDB;
    }

    /**
     * <p>
     * Write to a DynamoDB table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dynamoDB <p>
     *            Write to a DynamoDB table.
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
     * Write to a DynamoDB table. This is a new version of the DynamoDB action.
     * It allows you to write each attribute in an MQTT message payload into a
     * separate DynamoDB column.
     * </p>
     *
     * @return <p>
     *         Write to a DynamoDB table. This is a new version of the DynamoDB
     *         action. It allows you to write each attribute in an MQTT message
     *         payload into a separate DynamoDB column.
     *         </p>
     */
    public DynamoDBv2Action getDynamoDBv2() {
        return dynamoDBv2;
    }

    /**
     * <p>
     * Write to a DynamoDB table. This is a new version of the DynamoDB action.
     * It allows you to write each attribute in an MQTT message payload into a
     * separate DynamoDB column.
     * </p>
     *
     * @param dynamoDBv2 <p>
     *            Write to a DynamoDB table. This is a new version of the
     *            DynamoDB action. It allows you to write each attribute in an
     *            MQTT message payload into a separate DynamoDB column.
     *            </p>
     */
    public void setDynamoDBv2(DynamoDBv2Action dynamoDBv2) {
        this.dynamoDBv2 = dynamoDBv2;
    }

    /**
     * <p>
     * Write to a DynamoDB table. This is a new version of the DynamoDB action.
     * It allows you to write each attribute in an MQTT message payload into a
     * separate DynamoDB column.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dynamoDBv2 <p>
     *            Write to a DynamoDB table. This is a new version of the
     *            DynamoDB action. It allows you to write each attribute in an
     *            MQTT message payload into a separate DynamoDB column.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Action withDynamoDBv2(DynamoDBv2Action dynamoDBv2) {
        this.dynamoDBv2 = dynamoDBv2;
        return this;
    }

    /**
     * <p>
     * Invoke a Lambda function.
     * </p>
     *
     * @return <p>
     *         Invoke a Lambda function.
     *         </p>
     */
    public LambdaAction getLambda() {
        return lambda;
    }

    /**
     * <p>
     * Invoke a Lambda function.
     * </p>
     *
     * @param lambda <p>
     *            Invoke a Lambda function.
     *            </p>
     */
    public void setLambda(LambdaAction lambda) {
        this.lambda = lambda;
    }

    /**
     * <p>
     * Invoke a Lambda function.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lambda <p>
     *            Invoke a Lambda function.
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
     * Publish to an Amazon SNS topic.
     * </p>
     *
     * @return <p>
     *         Publish to an Amazon SNS topic.
     *         </p>
     */
    public SnsAction getSns() {
        return sns;
    }

    /**
     * <p>
     * Publish to an Amazon SNS topic.
     * </p>
     *
     * @param sns <p>
     *            Publish to an Amazon SNS topic.
     *            </p>
     */
    public void setSns(SnsAction sns) {
        this.sns = sns;
    }

    /**
     * <p>
     * Publish to an Amazon SNS topic.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sns <p>
     *            Publish to an Amazon SNS topic.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Action withSns(SnsAction sns) {
        this.sns = sns;
        return this;
    }

    /**
     * <p>
     * Publish to an Amazon SQS queue.
     * </p>
     *
     * @return <p>
     *         Publish to an Amazon SQS queue.
     *         </p>
     */
    public SqsAction getSqs() {
        return sqs;
    }

    /**
     * <p>
     * Publish to an Amazon SQS queue.
     * </p>
     *
     * @param sqs <p>
     *            Publish to an Amazon SQS queue.
     *            </p>
     */
    public void setSqs(SqsAction sqs) {
        this.sqs = sqs;
    }

    /**
     * <p>
     * Publish to an Amazon SQS queue.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sqs <p>
     *            Publish to an Amazon SQS queue.
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
     * Write data to an Amazon Kinesis stream.
     * </p>
     *
     * @return <p>
     *         Write data to an Amazon Kinesis stream.
     *         </p>
     */
    public KinesisAction getKinesis() {
        return kinesis;
    }

    /**
     * <p>
     * Write data to an Amazon Kinesis stream.
     * </p>
     *
     * @param kinesis <p>
     *            Write data to an Amazon Kinesis stream.
     *            </p>
     */
    public void setKinesis(KinesisAction kinesis) {
        this.kinesis = kinesis;
    }

    /**
     * <p>
     * Write data to an Amazon Kinesis stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kinesis <p>
     *            Write data to an Amazon Kinesis stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Action withKinesis(KinesisAction kinesis) {
        this.kinesis = kinesis;
        return this;
    }

    /**
     * <p>
     * Publish to another MQTT topic.
     * </p>
     *
     * @return <p>
     *         Publish to another MQTT topic.
     *         </p>
     */
    public RepublishAction getRepublish() {
        return republish;
    }

    /**
     * <p>
     * Publish to another MQTT topic.
     * </p>
     *
     * @param republish <p>
     *            Publish to another MQTT topic.
     *            </p>
     */
    public void setRepublish(RepublishAction republish) {
        this.republish = republish;
    }

    /**
     * <p>
     * Publish to another MQTT topic.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param republish <p>
     *            Publish to another MQTT topic.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Action withRepublish(RepublishAction republish) {
        this.republish = republish;
        return this;
    }

    /**
     * <p>
     * Write to an Amazon S3 bucket.
     * </p>
     *
     * @return <p>
     *         Write to an Amazon S3 bucket.
     *         </p>
     */
    public S3Action getS3() {
        return s3;
    }

    /**
     * <p>
     * Write to an Amazon S3 bucket.
     * </p>
     *
     * @param s3 <p>
     *            Write to an Amazon S3 bucket.
     *            </p>
     */
    public void setS3(S3Action s3) {
        this.s3 = s3;
    }

    /**
     * <p>
     * Write to an Amazon S3 bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3 <p>
     *            Write to an Amazon S3 bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Action withS3(S3Action s3) {
        this.s3 = s3;
        return this;
    }

    /**
     * <p>
     * Write to an Amazon Kinesis Firehose stream.
     * </p>
     *
     * @return <p>
     *         Write to an Amazon Kinesis Firehose stream.
     *         </p>
     */
    public FirehoseAction getFirehose() {
        return firehose;
    }

    /**
     * <p>
     * Write to an Amazon Kinesis Firehose stream.
     * </p>
     *
     * @param firehose <p>
     *            Write to an Amazon Kinesis Firehose stream.
     *            </p>
     */
    public void setFirehose(FirehoseAction firehose) {
        this.firehose = firehose;
    }

    /**
     * <p>
     * Write to an Amazon Kinesis Firehose stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param firehose <p>
     *            Write to an Amazon Kinesis Firehose stream.
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
     * Capture a CloudWatch metric.
     * </p>
     *
     * @return <p>
     *         Capture a CloudWatch metric.
     *         </p>
     */
    public CloudwatchMetricAction getCloudwatchMetric() {
        return cloudwatchMetric;
    }

    /**
     * <p>
     * Capture a CloudWatch metric.
     * </p>
     *
     * @param cloudwatchMetric <p>
     *            Capture a CloudWatch metric.
     *            </p>
     */
    public void setCloudwatchMetric(CloudwatchMetricAction cloudwatchMetric) {
        this.cloudwatchMetric = cloudwatchMetric;
    }

    /**
     * <p>
     * Capture a CloudWatch metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cloudwatchMetric <p>
     *            Capture a CloudWatch metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Action withCloudwatchMetric(CloudwatchMetricAction cloudwatchMetric) {
        this.cloudwatchMetric = cloudwatchMetric;
        return this;
    }

    /**
     * <p>
     * Change the state of a CloudWatch alarm.
     * </p>
     *
     * @return <p>
     *         Change the state of a CloudWatch alarm.
     *         </p>
     */
    public CloudwatchAlarmAction getCloudwatchAlarm() {
        return cloudwatchAlarm;
    }

    /**
     * <p>
     * Change the state of a CloudWatch alarm.
     * </p>
     *
     * @param cloudwatchAlarm <p>
     *            Change the state of a CloudWatch alarm.
     *            </p>
     */
    public void setCloudwatchAlarm(CloudwatchAlarmAction cloudwatchAlarm) {
        this.cloudwatchAlarm = cloudwatchAlarm;
    }

    /**
     * <p>
     * Change the state of a CloudWatch alarm.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cloudwatchAlarm <p>
     *            Change the state of a CloudWatch alarm.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Action withCloudwatchAlarm(CloudwatchAlarmAction cloudwatchAlarm) {
        this.cloudwatchAlarm = cloudwatchAlarm;
        return this;
    }

    /**
     * <p>
     * Write data to an Amazon Elasticsearch Service domain.
     * </p>
     *
     * @return <p>
     *         Write data to an Amazon Elasticsearch Service domain.
     *         </p>
     */
    public ElasticsearchAction getElasticsearch() {
        return elasticsearch;
    }

    /**
     * <p>
     * Write data to an Amazon Elasticsearch Service domain.
     * </p>
     *
     * @param elasticsearch <p>
     *            Write data to an Amazon Elasticsearch Service domain.
     *            </p>
     */
    public void setElasticsearch(ElasticsearchAction elasticsearch) {
        this.elasticsearch = elasticsearch;
    }

    /**
     * <p>
     * Write data to an Amazon Elasticsearch Service domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param elasticsearch <p>
     *            Write data to an Amazon Elasticsearch Service domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Action withElasticsearch(ElasticsearchAction elasticsearch) {
        this.elasticsearch = elasticsearch;
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
        if (getDynamoDB() != null)
            sb.append("dynamoDB: " + getDynamoDB() + ",");
        if (getDynamoDBv2() != null)
            sb.append("dynamoDBv2: " + getDynamoDBv2() + ",");
        if (getLambda() != null)
            sb.append("lambda: " + getLambda() + ",");
        if (getSns() != null)
            sb.append("sns: " + getSns() + ",");
        if (getSqs() != null)
            sb.append("sqs: " + getSqs() + ",");
        if (getKinesis() != null)
            sb.append("kinesis: " + getKinesis() + ",");
        if (getRepublish() != null)
            sb.append("republish: " + getRepublish() + ",");
        if (getS3() != null)
            sb.append("s3: " + getS3() + ",");
        if (getFirehose() != null)
            sb.append("firehose: " + getFirehose() + ",");
        if (getCloudwatchMetric() != null)
            sb.append("cloudwatchMetric: " + getCloudwatchMetric() + ",");
        if (getCloudwatchAlarm() != null)
            sb.append("cloudwatchAlarm: " + getCloudwatchAlarm() + ",");
        if (getElasticsearch() != null)
            sb.append("elasticsearch: " + getElasticsearch());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDynamoDB() == null) ? 0 : getDynamoDB().hashCode());
        hashCode = prime * hashCode + ((getDynamoDBv2() == null) ? 0 : getDynamoDBv2().hashCode());
        hashCode = prime * hashCode + ((getLambda() == null) ? 0 : getLambda().hashCode());
        hashCode = prime * hashCode + ((getSns() == null) ? 0 : getSns().hashCode());
        hashCode = prime * hashCode + ((getSqs() == null) ? 0 : getSqs().hashCode());
        hashCode = prime * hashCode + ((getKinesis() == null) ? 0 : getKinesis().hashCode());
        hashCode = prime * hashCode + ((getRepublish() == null) ? 0 : getRepublish().hashCode());
        hashCode = prime * hashCode + ((getS3() == null) ? 0 : getS3().hashCode());
        hashCode = prime * hashCode + ((getFirehose() == null) ? 0 : getFirehose().hashCode());
        hashCode = prime * hashCode
                + ((getCloudwatchMetric() == null) ? 0 : getCloudwatchMetric().hashCode());
        hashCode = prime * hashCode
                + ((getCloudwatchAlarm() == null) ? 0 : getCloudwatchAlarm().hashCode());
        hashCode = prime * hashCode
                + ((getElasticsearch() == null) ? 0 : getElasticsearch().hashCode());
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

        if (other.getDynamoDB() == null ^ this.getDynamoDB() == null)
            return false;
        if (other.getDynamoDB() != null && other.getDynamoDB().equals(this.getDynamoDB()) == false)
            return false;
        if (other.getDynamoDBv2() == null ^ this.getDynamoDBv2() == null)
            return false;
        if (other.getDynamoDBv2() != null
                && other.getDynamoDBv2().equals(this.getDynamoDBv2()) == false)
            return false;
        if (other.getLambda() == null ^ this.getLambda() == null)
            return false;
        if (other.getLambda() != null && other.getLambda().equals(this.getLambda()) == false)
            return false;
        if (other.getSns() == null ^ this.getSns() == null)
            return false;
        if (other.getSns() != null && other.getSns().equals(this.getSns()) == false)
            return false;
        if (other.getSqs() == null ^ this.getSqs() == null)
            return false;
        if (other.getSqs() != null && other.getSqs().equals(this.getSqs()) == false)
            return false;
        if (other.getKinesis() == null ^ this.getKinesis() == null)
            return false;
        if (other.getKinesis() != null && other.getKinesis().equals(this.getKinesis()) == false)
            return false;
        if (other.getRepublish() == null ^ this.getRepublish() == null)
            return false;
        if (other.getRepublish() != null
                && other.getRepublish().equals(this.getRepublish()) == false)
            return false;
        if (other.getS3() == null ^ this.getS3() == null)
            return false;
        if (other.getS3() != null && other.getS3().equals(this.getS3()) == false)
            return false;
        if (other.getFirehose() == null ^ this.getFirehose() == null)
            return false;
        if (other.getFirehose() != null && other.getFirehose().equals(this.getFirehose()) == false)
            return false;
        if (other.getCloudwatchMetric() == null ^ this.getCloudwatchMetric() == null)
            return false;
        if (other.getCloudwatchMetric() != null
                && other.getCloudwatchMetric().equals(this.getCloudwatchMetric()) == false)
            return false;
        if (other.getCloudwatchAlarm() == null ^ this.getCloudwatchAlarm() == null)
            return false;
        if (other.getCloudwatchAlarm() != null
                && other.getCloudwatchAlarm().equals(this.getCloudwatchAlarm()) == false)
            return false;
        if (other.getElasticsearch() == null ^ this.getElasticsearch() == null)
            return false;
        if (other.getElasticsearch() != null
                && other.getElasticsearch().equals(this.getElasticsearch()) == false)
            return false;
        return true;
    }
}
