/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Send messages to an Amazon Managed Streaming for Apache Kafka (Amazon MSK) or
 * self-managed Apache Kafka cluster.
 * </p>
 */
public class KafkaAction implements Serializable {
    /**
     * <p>
     * The ARN of Kafka action's VPC <code>TopicRuleDestination</code>.
     * </p>
     */
    private String destinationArn;

    /**
     * <p>
     * The Kafka topic for messages to be sent to the Kafka broker.
     * </p>
     */
    private String topic;

    /**
     * <p>
     * The Kafka message key.
     * </p>
     */
    private String key;

    /**
     * <p>
     * The Kafka message partition.
     * </p>
     */
    private String partition;

    /**
     * <p>
     * Properties of the Apache Kafka producer client.
     * </p>
     */
    private java.util.Map<String, String> clientProperties;

    /**
     * <p>
     * The ARN of Kafka action's VPC <code>TopicRuleDestination</code>.
     * </p>
     *
     * @return <p>
     *         The ARN of Kafka action's VPC <code>TopicRuleDestination</code>.
     *         </p>
     */
    public String getDestinationArn() {
        return destinationArn;
    }

    /**
     * <p>
     * The ARN of Kafka action's VPC <code>TopicRuleDestination</code>.
     * </p>
     *
     * @param destinationArn <p>
     *            The ARN of Kafka action's VPC
     *            <code>TopicRuleDestination</code>.
     *            </p>
     */
    public void setDestinationArn(String destinationArn) {
        this.destinationArn = destinationArn;
    }

    /**
     * <p>
     * The ARN of Kafka action's VPC <code>TopicRuleDestination</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationArn <p>
     *            The ARN of Kafka action's VPC
     *            <code>TopicRuleDestination</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KafkaAction withDestinationArn(String destinationArn) {
        this.destinationArn = destinationArn;
        return this;
    }

    /**
     * <p>
     * The Kafka topic for messages to be sent to the Kafka broker.
     * </p>
     *
     * @return <p>
     *         The Kafka topic for messages to be sent to the Kafka broker.
     *         </p>
     */
    public String getTopic() {
        return topic;
    }

    /**
     * <p>
     * The Kafka topic for messages to be sent to the Kafka broker.
     * </p>
     *
     * @param topic <p>
     *            The Kafka topic for messages to be sent to the Kafka broker.
     *            </p>
     */
    public void setTopic(String topic) {
        this.topic = topic;
    }

    /**
     * <p>
     * The Kafka topic for messages to be sent to the Kafka broker.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param topic <p>
     *            The Kafka topic for messages to be sent to the Kafka broker.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KafkaAction withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
     * <p>
     * The Kafka message key.
     * </p>
     *
     * @return <p>
     *         The Kafka message key.
     *         </p>
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>
     * The Kafka message key.
     * </p>
     *
     * @param key <p>
     *            The Kafka message key.
     *            </p>
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The Kafka message key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key <p>
     *            The Kafka message key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KafkaAction withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>
     * The Kafka message partition.
     * </p>
     *
     * @return <p>
     *         The Kafka message partition.
     *         </p>
     */
    public String getPartition() {
        return partition;
    }

    /**
     * <p>
     * The Kafka message partition.
     * </p>
     *
     * @param partition <p>
     *            The Kafka message partition.
     *            </p>
     */
    public void setPartition(String partition) {
        this.partition = partition;
    }

    /**
     * <p>
     * The Kafka message partition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param partition <p>
     *            The Kafka message partition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KafkaAction withPartition(String partition) {
        this.partition = partition;
        return this;
    }

    /**
     * <p>
     * Properties of the Apache Kafka producer client.
     * </p>
     *
     * @return <p>
     *         Properties of the Apache Kafka producer client.
     *         </p>
     */
    public java.util.Map<String, String> getClientProperties() {
        return clientProperties;
    }

    /**
     * <p>
     * Properties of the Apache Kafka producer client.
     * </p>
     *
     * @param clientProperties <p>
     *            Properties of the Apache Kafka producer client.
     *            </p>
     */
    public void setClientProperties(java.util.Map<String, String> clientProperties) {
        this.clientProperties = clientProperties;
    }

    /**
     * <p>
     * Properties of the Apache Kafka producer client.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientProperties <p>
     *            Properties of the Apache Kafka producer client.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KafkaAction withClientProperties(java.util.Map<String, String> clientProperties) {
        this.clientProperties = clientProperties;
        return this;
    }

    /**
     * <p>
     * Properties of the Apache Kafka producer client.
     * </p>
     * <p>
     * The method adds a new key-value pair into clientProperties parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into clientProperties.
     * @param value The corresponding value of the entry to be added into
     *            clientProperties.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KafkaAction addclientPropertiesEntry(String key, String value) {
        if (null == this.clientProperties) {
            this.clientProperties = new java.util.HashMap<String, String>();
        }
        if (this.clientProperties.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.clientProperties.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into clientProperties.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public KafkaAction clearclientPropertiesEntries() {
        this.clientProperties = null;
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
        if (getDestinationArn() != null)
            sb.append("destinationArn: " + getDestinationArn() + ",");
        if (getTopic() != null)
            sb.append("topic: " + getTopic() + ",");
        if (getKey() != null)
            sb.append("key: " + getKey() + ",");
        if (getPartition() != null)
            sb.append("partition: " + getPartition() + ",");
        if (getClientProperties() != null)
            sb.append("clientProperties: " + getClientProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDestinationArn() == null) ? 0 : getDestinationArn().hashCode());
        hashCode = prime * hashCode + ((getTopic() == null) ? 0 : getTopic().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getPartition() == null) ? 0 : getPartition().hashCode());
        hashCode = prime * hashCode
                + ((getClientProperties() == null) ? 0 : getClientProperties().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KafkaAction == false)
            return false;
        KafkaAction other = (KafkaAction) obj;

        if (other.getDestinationArn() == null ^ this.getDestinationArn() == null)
            return false;
        if (other.getDestinationArn() != null
                && other.getDestinationArn().equals(this.getDestinationArn()) == false)
            return false;
        if (other.getTopic() == null ^ this.getTopic() == null)
            return false;
        if (other.getTopic() != null && other.getTopic().equals(this.getTopic()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getPartition() == null ^ this.getPartition() == null)
            return false;
        if (other.getPartition() != null
                && other.getPartition().equals(this.getPartition()) == false)
            return false;
        if (other.getClientProperties() == null ^ this.getClientProperties() == null)
            return false;
        if (other.getClientProperties() != null
                && other.getClientProperties().equals(this.getClientProperties()) == false)
            return false;
        return true;
    }
}
