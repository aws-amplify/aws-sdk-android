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

package com.amazonaws.services.awsdatabasemigrationservice.model;

import java.io.Serializable;

/**
 * <p>
 * Provides information that describes an Apache Kafka endpoint. This
 * information includes the output format of records applied to the endpoint and
 * details of transaction and control table data information.
 * </p>
 */
public class KafkaSettings implements Serializable {
    /**
     * <p>
     * The broker location and port of the Kafka broker that hosts your Kafka
     * instance. Specify the broker in the form
     * <code> <i>broker-hostname-or-ip</i>:<i>port</i> </code>. For example,
     * <code>"ec2-12-345-678-901.compute-1.amazonaws.com:2345"</code>.
     * </p>
     */
    private String broker;

    /**
     * <p>
     * The topic to which you migrate the data. If you don't specify a topic,
     * AWS DMS specifies <code>"kafka-default-topic"</code> as the migration
     * topic.
     * </p>
     */
    private String topic;

    /**
     * <p>
     * The broker location and port of the Kafka broker that hosts your Kafka
     * instance. Specify the broker in the form
     * <code> <i>broker-hostname-or-ip</i>:<i>port</i> </code>. For example,
     * <code>"ec2-12-345-678-901.compute-1.amazonaws.com:2345"</code>.
     * </p>
     *
     * @return <p>
     *         The broker location and port of the Kafka broker that hosts your
     *         Kafka instance. Specify the broker in the form
     *         <code> <i>broker-hostname-or-ip</i>:<i>port</i> </code>. For
     *         example,
     *         <code>"ec2-12-345-678-901.compute-1.amazonaws.com:2345"</code>.
     *         </p>
     */
    public String getBroker() {
        return broker;
    }

    /**
     * <p>
     * The broker location and port of the Kafka broker that hosts your Kafka
     * instance. Specify the broker in the form
     * <code> <i>broker-hostname-or-ip</i>:<i>port</i> </code>. For example,
     * <code>"ec2-12-345-678-901.compute-1.amazonaws.com:2345"</code>.
     * </p>
     *
     * @param broker <p>
     *            The broker location and port of the Kafka broker that hosts
     *            your Kafka instance. Specify the broker in the form
     *            <code> <i>broker-hostname-or-ip</i>:<i>port</i> </code>. For
     *            example,
     *            <code>"ec2-12-345-678-901.compute-1.amazonaws.com:2345"</code>
     *            .
     *            </p>
     */
    public void setBroker(String broker) {
        this.broker = broker;
    }

    /**
     * <p>
     * The broker location and port of the Kafka broker that hosts your Kafka
     * instance. Specify the broker in the form
     * <code> <i>broker-hostname-or-ip</i>:<i>port</i> </code>. For example,
     * <code>"ec2-12-345-678-901.compute-1.amazonaws.com:2345"</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param broker <p>
     *            The broker location and port of the Kafka broker that hosts
     *            your Kafka instance. Specify the broker in the form
     *            <code> <i>broker-hostname-or-ip</i>:<i>port</i> </code>. For
     *            example,
     *            <code>"ec2-12-345-678-901.compute-1.amazonaws.com:2345"</code>
     *            .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KafkaSettings withBroker(String broker) {
        this.broker = broker;
        return this;
    }

    /**
     * <p>
     * The topic to which you migrate the data. If you don't specify a topic,
     * AWS DMS specifies <code>"kafka-default-topic"</code> as the migration
     * topic.
     * </p>
     *
     * @return <p>
     *         The topic to which you migrate the data. If you don't specify a
     *         topic, AWS DMS specifies <code>"kafka-default-topic"</code> as
     *         the migration topic.
     *         </p>
     */
    public String getTopic() {
        return topic;
    }

    /**
     * <p>
     * The topic to which you migrate the data. If you don't specify a topic,
     * AWS DMS specifies <code>"kafka-default-topic"</code> as the migration
     * topic.
     * </p>
     *
     * @param topic <p>
     *            The topic to which you migrate the data. If you don't specify
     *            a topic, AWS DMS specifies <code>"kafka-default-topic"</code>
     *            as the migration topic.
     *            </p>
     */
    public void setTopic(String topic) {
        this.topic = topic;
    }

    /**
     * <p>
     * The topic to which you migrate the data. If you don't specify a topic,
     * AWS DMS specifies <code>"kafka-default-topic"</code> as the migration
     * topic.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param topic <p>
     *            The topic to which you migrate the data. If you don't specify
     *            a topic, AWS DMS specifies <code>"kafka-default-topic"</code>
     *            as the migration topic.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KafkaSettings withTopic(String topic) {
        this.topic = topic;
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
        if (getBroker() != null)
            sb.append("Broker: " + getBroker() + ",");
        if (getTopic() != null)
            sb.append("Topic: " + getTopic());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBroker() == null) ? 0 : getBroker().hashCode());
        hashCode = prime * hashCode + ((getTopic() == null) ? 0 : getTopic().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KafkaSettings == false)
            return false;
        KafkaSettings other = (KafkaSettings) obj;

        if (other.getBroker() == null ^ this.getBroker() == null)
            return false;
        if (other.getBroker() != null && other.getBroker().equals(this.getBroker()) == false)
            return false;
        if (other.getTopic() == null ^ this.getTopic() == null)
            return false;
        if (other.getTopic() != null && other.getTopic().equals(this.getTopic()) == false)
            return false;
        return true;
    }
}
