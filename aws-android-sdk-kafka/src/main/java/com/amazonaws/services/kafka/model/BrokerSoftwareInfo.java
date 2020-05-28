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

package com.amazonaws.services.kafka.model;

import java.io.Serializable;

/**
 * 
 <p>
 * Information about the current software installed on the cluster.
 * </p>
 */
public class BrokerSoftwareInfo implements Serializable {
    /**
     * 
     <p>
     * The Amazon Resource Name (ARN) of the configuration used for the cluster.
     * This field isn't visible in this preview release.
     * </p>
     */
    private String configurationArn;

    /**
     * 
     <p>
     * The revision of the configuration to use. This field isn't visible in
     * this preview release.
     * </p>
     */
    private Long configurationRevision;

    /**
     * 
     <p>
     * The version of Apache Kafka.
     * </p>
     */
    private String kafkaVersion;

    /**
     * 
     <p>
     * The Amazon Resource Name (ARN) of the configuration used for the cluster.
     * This field isn't visible in this preview release.
     * </p>
     * 
     * @return <p>
     *         The Amazon Resource Name (ARN) of the configuration used for the
     *         cluster. This field isn't visible in this preview release.
     *         </p>
     */
    public String getConfigurationArn() {
        return configurationArn;
    }

    /**
     * 
     <p>
     * The Amazon Resource Name (ARN) of the configuration used for the cluster.
     * This field isn't visible in this preview release.
     * </p>
     * 
     * @param configurationArn <p>
     *            The Amazon Resource Name (ARN) of the configuration used for
     *            the cluster. This field isn't visible in this preview release.
     *            </p>
     */
    public void setConfigurationArn(String configurationArn) {
        this.configurationArn = configurationArn;
    }

    /**
     * 
     <p>
     * The Amazon Resource Name (ARN) of the configuration used for the cluster.
     * This field isn't visible in this preview release.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param configurationArn <p>
     *            The Amazon Resource Name (ARN) of the configuration used for
     *            the cluster. This field isn't visible in this preview release.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BrokerSoftwareInfo withConfigurationArn(String configurationArn) {
        this.configurationArn = configurationArn;
        return this;
    }

    /**
     * 
     <p>
     * The revision of the configuration to use. This field isn't visible in
     * this preview release.
     * </p>
     * 
     * @return <p>
     *         The revision of the configuration to use. This field isn't
     *         visible in this preview release.
     *         </p>
     */
    public Long getConfigurationRevision() {
        return configurationRevision;
    }

    /**
     * 
     <p>
     * The revision of the configuration to use. This field isn't visible in
     * this preview release.
     * </p>
     * 
     * @param configurationRevision <p>
     *            The revision of the configuration to use. This field isn't
     *            visible in this preview release.
     *            </p>
     */
    public void setConfigurationRevision(Long configurationRevision) {
        this.configurationRevision = configurationRevision;
    }

    /**
     * 
     <p>
     * The revision of the configuration to use. This field isn't visible in
     * this preview release.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param configurationRevision <p>
     *            The revision of the configuration to use. This field isn't
     *            visible in this preview release.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BrokerSoftwareInfo withConfigurationRevision(Long configurationRevision) {
        this.configurationRevision = configurationRevision;
        return this;
    }

    /**
     * 
     <p>
     * The version of Apache Kafka.
     * </p>
     * 
     * @return <p>
     *         The version of Apache Kafka.
     *         </p>
     */
    public String getKafkaVersion() {
        return kafkaVersion;
    }

    /**
     * 
     <p>
     * The version of Apache Kafka.
     * </p>
     * 
     * @param kafkaVersion <p>
     *            The version of Apache Kafka.
     *            </p>
     */
    public void setKafkaVersion(String kafkaVersion) {
        this.kafkaVersion = kafkaVersion;
    }

    /**
     * 
     <p>
     * The version of Apache Kafka.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kafkaVersion <p>
     *            The version of Apache Kafka.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BrokerSoftwareInfo withKafkaVersion(String kafkaVersion) {
        this.kafkaVersion = kafkaVersion;
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
        if (getConfigurationArn() != null)
            sb.append("ConfigurationArn: " + getConfigurationArn() + ",");
        if (getConfigurationRevision() != null)
            sb.append("ConfigurationRevision: " + getConfigurationRevision() + ",");
        if (getKafkaVersion() != null)
            sb.append("KafkaVersion: " + getKafkaVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getConfigurationArn() == null) ? 0 : getConfigurationArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getConfigurationRevision() == null) ? 0 : getConfigurationRevision().hashCode());
        hashCode = prime * hashCode
                + ((getKafkaVersion() == null) ? 0 : getKafkaVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BrokerSoftwareInfo == false)
            return false;
        BrokerSoftwareInfo other = (BrokerSoftwareInfo) obj;

        if (other.getConfigurationArn() == null ^ this.getConfigurationArn() == null)
            return false;
        if (other.getConfigurationArn() != null
                && other.getConfigurationArn().equals(this.getConfigurationArn()) == false)
            return false;
        if (other.getConfigurationRevision() == null ^ this.getConfigurationRevision() == null)
            return false;
        if (other.getConfigurationRevision() != null
                && other.getConfigurationRevision().equals(this.getConfigurationRevision()) == false)
            return false;
        if (other.getKafkaVersion() == null ^ this.getKafkaVersion() == null)
            return false;
        if (other.getKafkaVersion() != null
                && other.getKafkaVersion().equals(this.getKafkaVersion()) == false)
            return false;
        return true;
    }
}
