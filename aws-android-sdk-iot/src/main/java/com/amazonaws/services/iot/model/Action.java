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
package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the actions associated with a rule.
 * </p>
 */
public class Action implements Serializable {

    /**
     * Write to a DynamoDB table.
     */
    private DynamoDBAction dynamoDB;

    /**
     * Invoke a Lambda function.
     */
    private LambdaAction lambda;

    /**
     * Publish to an Amazon SNS topic.
     */
    private SnsAction sns;

    /**
     * Publish to an Amazon SQS queue.
     */
    private SqsAction sqs;

    /**
     * Write data to an Amazon Kinesis stream.
     */
    private KinesisAction kinesis;

    /**
     * Publish to another MQTT topic.
     */
    private RepublishAction republish;

    /**
     * Write to an Amazon S3 bucket.
     */
    private S3Action s3;

    /**
     * Write to an Amazon Kinesis Firehose stream.
     */
    private FirehoseAction firehose;

    /**
     * Capture a CloudWatch metric.
     */
    private CloudwatchMetricAction cloudwatchMetric;

    /**
     * Change the state of a CloudWatch alarm.
     */
    private CloudwatchAlarmAction cloudwatchAlarm;

    /**
     * Write data to an Amazon Elasticsearch Service; domain.
     */
    private ElasticsearchAction elasticsearch;

    /**
     * Write to a DynamoDB table.
     *
     * @return Write to a DynamoDB table.
     */
    public DynamoDBAction getDynamoDB() {
        return dynamoDB;
    }
    
    /**
     * Write to a DynamoDB table.
     *
     * @param dynamoDB Write to a DynamoDB table.
     */
    public void setDynamoDB(DynamoDBAction dynamoDB) {
        this.dynamoDB = dynamoDB;
    }
    
    /**
     * Write to a DynamoDB table.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dynamoDB Write to a DynamoDB table.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Action withDynamoDB(DynamoDBAction dynamoDB) {
        this.dynamoDB = dynamoDB;
        return this;
    }

    /**
     * Invoke a Lambda function.
     *
     * @return Invoke a Lambda function.
     */
    public LambdaAction getLambda() {
        return lambda;
    }
    
    /**
     * Invoke a Lambda function.
     *
     * @param lambda Invoke a Lambda function.
     */
    public void setLambda(LambdaAction lambda) {
        this.lambda = lambda;
    }
    
    /**
     * Invoke a Lambda function.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lambda Invoke a Lambda function.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Action withLambda(LambdaAction lambda) {
        this.lambda = lambda;
        return this;
    }

    /**
     * Publish to an Amazon SNS topic.
     *
     * @return Publish to an Amazon SNS topic.
     */
    public SnsAction getSns() {
        return sns;
    }
    
    /**
     * Publish to an Amazon SNS topic.
     *
     * @param sns Publish to an Amazon SNS topic.
     */
    public void setSns(SnsAction sns) {
        this.sns = sns;
    }
    
    /**
     * Publish to an Amazon SNS topic.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sns Publish to an Amazon SNS topic.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Action withSns(SnsAction sns) {
        this.sns = sns;
        return this;
    }

    /**
     * Publish to an Amazon SQS queue.
     *
     * @return Publish to an Amazon SQS queue.
     */
    public SqsAction getSqs() {
        return sqs;
    }
    
    /**
     * Publish to an Amazon SQS queue.
     *
     * @param sqs Publish to an Amazon SQS queue.
     */
    public void setSqs(SqsAction sqs) {
        this.sqs = sqs;
    }
    
    /**
     * Publish to an Amazon SQS queue.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sqs Publish to an Amazon SQS queue.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Action withSqs(SqsAction sqs) {
        this.sqs = sqs;
        return this;
    }

    /**
     * Write data to an Amazon Kinesis stream.
     *
     * @return Write data to an Amazon Kinesis stream.
     */
    public KinesisAction getKinesis() {
        return kinesis;
    }
    
    /**
     * Write data to an Amazon Kinesis stream.
     *
     * @param kinesis Write data to an Amazon Kinesis stream.
     */
    public void setKinesis(KinesisAction kinesis) {
        this.kinesis = kinesis;
    }
    
    /**
     * Write data to an Amazon Kinesis stream.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param kinesis Write data to an Amazon Kinesis stream.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Action withKinesis(KinesisAction kinesis) {
        this.kinesis = kinesis;
        return this;
    }

    /**
     * Publish to another MQTT topic.
     *
     * @return Publish to another MQTT topic.
     */
    public RepublishAction getRepublish() {
        return republish;
    }
    
    /**
     * Publish to another MQTT topic.
     *
     * @param republish Publish to another MQTT topic.
     */
    public void setRepublish(RepublishAction republish) {
        this.republish = republish;
    }
    
    /**
     * Publish to another MQTT topic.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param republish Publish to another MQTT topic.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Action withRepublish(RepublishAction republish) {
        this.republish = republish;
        return this;
    }

    /**
     * Write to an Amazon S3 bucket.
     *
     * @return Write to an Amazon S3 bucket.
     */
    public S3Action getS3() {
        return s3;
    }
    
    /**
     * Write to an Amazon S3 bucket.
     *
     * @param s3 Write to an Amazon S3 bucket.
     */
    public void setS3(S3Action s3) {
        this.s3 = s3;
    }
    
    /**
     * Write to an Amazon S3 bucket.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param s3 Write to an Amazon S3 bucket.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Action withS3(S3Action s3) {
        this.s3 = s3;
        return this;
    }

    /**
     * Write to an Amazon Kinesis Firehose stream.
     *
     * @return Write to an Amazon Kinesis Firehose stream.
     */
    public FirehoseAction getFirehose() {
        return firehose;
    }
    
    /**
     * Write to an Amazon Kinesis Firehose stream.
     *
     * @param firehose Write to an Amazon Kinesis Firehose stream.
     */
    public void setFirehose(FirehoseAction firehose) {
        this.firehose = firehose;
    }
    
    /**
     * Write to an Amazon Kinesis Firehose stream.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param firehose Write to an Amazon Kinesis Firehose stream.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Action withFirehose(FirehoseAction firehose) {
        this.firehose = firehose;
        return this;
    }

    /**
     * Capture a CloudWatch metric.
     *
     * @return Capture a CloudWatch metric.
     */
    public CloudwatchMetricAction getCloudwatchMetric() {
        return cloudwatchMetric;
    }
    
    /**
     * Capture a CloudWatch metric.
     *
     * @param cloudwatchMetric Capture a CloudWatch metric.
     */
    public void setCloudwatchMetric(CloudwatchMetricAction cloudwatchMetric) {
        this.cloudwatchMetric = cloudwatchMetric;
    }
    
    /**
     * Capture a CloudWatch metric.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cloudwatchMetric Capture a CloudWatch metric.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Action withCloudwatchMetric(CloudwatchMetricAction cloudwatchMetric) {
        this.cloudwatchMetric = cloudwatchMetric;
        return this;
    }

    /**
     * Change the state of a CloudWatch alarm.
     *
     * @return Change the state of a CloudWatch alarm.
     */
    public CloudwatchAlarmAction getCloudwatchAlarm() {
        return cloudwatchAlarm;
    }
    
    /**
     * Change the state of a CloudWatch alarm.
     *
     * @param cloudwatchAlarm Change the state of a CloudWatch alarm.
     */
    public void setCloudwatchAlarm(CloudwatchAlarmAction cloudwatchAlarm) {
        this.cloudwatchAlarm = cloudwatchAlarm;
    }
    
    /**
     * Change the state of a CloudWatch alarm.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cloudwatchAlarm Change the state of a CloudWatch alarm.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Action withCloudwatchAlarm(CloudwatchAlarmAction cloudwatchAlarm) {
        this.cloudwatchAlarm = cloudwatchAlarm;
        return this;
    }

    /**
     * Write data to an Amazon Elasticsearch Service; domain.
     *
     * @return Write data to an Amazon Elasticsearch Service; domain.
     */
    public ElasticsearchAction getElasticsearch() {
        return elasticsearch;
    }
    
    /**
     * Write data to an Amazon Elasticsearch Service; domain.
     *
     * @param elasticsearch Write data to an Amazon Elasticsearch Service; domain.
     */
    public void setElasticsearch(ElasticsearchAction elasticsearch) {
        this.elasticsearch = elasticsearch;
    }
    
    /**
     * Write data to an Amazon Elasticsearch Service; domain.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param elasticsearch Write data to an Amazon Elasticsearch Service; domain.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
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
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDynamoDB() != null) sb.append("DynamoDB: " + getDynamoDB() + ",");
        if (getLambda() != null) sb.append("Lambda: " + getLambda() + ",");
        if (getSns() != null) sb.append("Sns: " + getSns() + ",");
        if (getSqs() != null) sb.append("Sqs: " + getSqs() + ",");
        if (getKinesis() != null) sb.append("Kinesis: " + getKinesis() + ",");
        if (getRepublish() != null) sb.append("Republish: " + getRepublish() + ",");
        if (getS3() != null) sb.append("S3: " + getS3() + ",");
        if (getFirehose() != null) sb.append("Firehose: " + getFirehose() + ",");
        if (getCloudwatchMetric() != null) sb.append("CloudwatchMetric: " + getCloudwatchMetric() + ",");
        if (getCloudwatchAlarm() != null) sb.append("CloudwatchAlarm: " + getCloudwatchAlarm() + ",");
        if (getElasticsearch() != null) sb.append("Elasticsearch: " + getElasticsearch() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDynamoDB() == null) ? 0 : getDynamoDB().hashCode()); 
        hashCode = prime * hashCode + ((getLambda() == null) ? 0 : getLambda().hashCode()); 
        hashCode = prime * hashCode + ((getSns() == null) ? 0 : getSns().hashCode()); 
        hashCode = prime * hashCode + ((getSqs() == null) ? 0 : getSqs().hashCode()); 
        hashCode = prime * hashCode + ((getKinesis() == null) ? 0 : getKinesis().hashCode()); 
        hashCode = prime * hashCode + ((getRepublish() == null) ? 0 : getRepublish().hashCode()); 
        hashCode = prime * hashCode + ((getS3() == null) ? 0 : getS3().hashCode()); 
        hashCode = prime * hashCode + ((getFirehose() == null) ? 0 : getFirehose().hashCode()); 
        hashCode = prime * hashCode + ((getCloudwatchMetric() == null) ? 0 : getCloudwatchMetric().hashCode()); 
        hashCode = prime * hashCode + ((getCloudwatchAlarm() == null) ? 0 : getCloudwatchAlarm().hashCode()); 
        hashCode = prime * hashCode + ((getElasticsearch() == null) ? 0 : getElasticsearch().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Action == false) return false;
        Action other = (Action)obj;
        
        if (other.getDynamoDB() == null ^ this.getDynamoDB() == null) return false;
        if (other.getDynamoDB() != null && other.getDynamoDB().equals(this.getDynamoDB()) == false) return false; 
        if (other.getLambda() == null ^ this.getLambda() == null) return false;
        if (other.getLambda() != null && other.getLambda().equals(this.getLambda()) == false) return false; 
        if (other.getSns() == null ^ this.getSns() == null) return false;
        if (other.getSns() != null && other.getSns().equals(this.getSns()) == false) return false; 
        if (other.getSqs() == null ^ this.getSqs() == null) return false;
        if (other.getSqs() != null && other.getSqs().equals(this.getSqs()) == false) return false; 
        if (other.getKinesis() == null ^ this.getKinesis() == null) return false;
        if (other.getKinesis() != null && other.getKinesis().equals(this.getKinesis()) == false) return false; 
        if (other.getRepublish() == null ^ this.getRepublish() == null) return false;
        if (other.getRepublish() != null && other.getRepublish().equals(this.getRepublish()) == false) return false; 
        if (other.getS3() == null ^ this.getS3() == null) return false;
        if (other.getS3() != null && other.getS3().equals(this.getS3()) == false) return false; 
        if (other.getFirehose() == null ^ this.getFirehose() == null) return false;
        if (other.getFirehose() != null && other.getFirehose().equals(this.getFirehose()) == false) return false; 
        if (other.getCloudwatchMetric() == null ^ this.getCloudwatchMetric() == null) return false;
        if (other.getCloudwatchMetric() != null && other.getCloudwatchMetric().equals(this.getCloudwatchMetric()) == false) return false; 
        if (other.getCloudwatchAlarm() == null ^ this.getCloudwatchAlarm() == null) return false;
        if (other.getCloudwatchAlarm() != null && other.getCloudwatchAlarm().equals(this.getCloudwatchAlarm()) == false) return false; 
        if (other.getElasticsearch() == null ^ this.getElasticsearch() == null) return false;
        if (other.getElasticsearch() != null && other.getElasticsearch().equals(this.getElasticsearch()) == false) return false; 
        return true;
    }
    
}
    