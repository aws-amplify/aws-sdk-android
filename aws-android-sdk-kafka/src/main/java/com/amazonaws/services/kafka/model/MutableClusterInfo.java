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
 * Information about cluster attributes that can be updated via update APIs.
 * </p>
 */
public class MutableClusterInfo implements Serializable {
    /**
     * 
     <p>
     * Specifies the size of the EBS volume and the ID of the associated broker.
     * </p>
     */
    private java.util.List<BrokerEBSVolumeInfo> brokerEBSVolumeInfo;

    /**
     * 
     <p>
     * Information about the changes in the configuration of the brokers.
     * </p>
     */
    private ConfigurationInfo configurationInfo;

    /**
     * 
     <p>
     * The number of broker nodes in the cluster.
     * </p>
     */
    private Integer numberOfBrokerNodes;

    /**
     * 
     <p>
     * Specifies which Apache Kafka metrics Amazon MSK gathers and sends to
     * Amazon CloudWatch for this cluster.
     * </p> <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, PER_BROKER, PER_TOPIC_PER_BROKER
     */
    private String enhancedMonitoring;

    /**
     * 
     <p>
     * The settings for open monitoring.
     * </p>
     */
    private OpenMonitoring openMonitoring;

    /**
     * 
     <p>
     * The Kafka version.
     * </p>
     */
    private String kafkaVersion;

    /**
     * The new value for the loggingInfo property for this object.
     */
    private LoggingInfo loggingInfo;

    /**
     * 
     <p>
     * Specifies the size of the EBS volume and the ID of the associated broker.
     * </p>
     * 
     * @return <p>
     *         Specifies the size of the EBS volume and the ID of the associated
     *         broker.
     *         </p>
     */
    public java.util.List<BrokerEBSVolumeInfo> getBrokerEBSVolumeInfo() {
        return brokerEBSVolumeInfo;
    }

    /**
     * 
     <p>
     * Specifies the size of the EBS volume and the ID of the associated broker.
     * </p>
     * 
     * @param brokerEBSVolumeInfo <p>
     *            Specifies the size of the EBS volume and the ID of the
     *            associated broker.
     *            </p>
     */
    public void setBrokerEBSVolumeInfo(java.util.Collection<BrokerEBSVolumeInfo> brokerEBSVolumeInfo) {
        if (brokerEBSVolumeInfo == null) {
            this.brokerEBSVolumeInfo = null;
            return;
        }

        this.brokerEBSVolumeInfo = new java.util.ArrayList<BrokerEBSVolumeInfo>(brokerEBSVolumeInfo);
    }

    /**
     * 
     <p>
     * Specifies the size of the EBS volume and the ID of the associated broker.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param brokerEBSVolumeInfo <p>
     *            Specifies the size of the EBS volume and the ID of the
     *            associated broker.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MutableClusterInfo withBrokerEBSVolumeInfo(BrokerEBSVolumeInfo... brokerEBSVolumeInfo) {
        if (getBrokerEBSVolumeInfo() == null) {
            this.brokerEBSVolumeInfo = new java.util.ArrayList<BrokerEBSVolumeInfo>(
                    brokerEBSVolumeInfo.length);
        }
        for (BrokerEBSVolumeInfo value : brokerEBSVolumeInfo) {
            this.brokerEBSVolumeInfo.add(value);
        }
        return this;
    }

    /**
     * 
     <p>
     * Specifies the size of the EBS volume and the ID of the associated broker.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param brokerEBSVolumeInfo <p>
     *            Specifies the size of the EBS volume and the ID of the
     *            associated broker.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MutableClusterInfo withBrokerEBSVolumeInfo(
            java.util.Collection<BrokerEBSVolumeInfo> brokerEBSVolumeInfo) {
        setBrokerEBSVolumeInfo(brokerEBSVolumeInfo);
        return this;
    }

    /**
     * 
     <p>
     * Information about the changes in the configuration of the brokers.
     * </p>
     * 
     * @return <p>
     *         Information about the changes in the configuration of the
     *         brokers.
     *         </p>
     */
    public ConfigurationInfo getConfigurationInfo() {
        return configurationInfo;
    }

    /**
     * 
     <p>
     * Information about the changes in the configuration of the brokers.
     * </p>
     * 
     * @param configurationInfo <p>
     *            Information about the changes in the configuration of the
     *            brokers.
     *            </p>
     */
    public void setConfigurationInfo(ConfigurationInfo configurationInfo) {
        this.configurationInfo = configurationInfo;
    }

    /**
     * 
     <p>
     * Information about the changes in the configuration of the brokers.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param configurationInfo <p>
     *            Information about the changes in the configuration of the
     *            brokers.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MutableClusterInfo withConfigurationInfo(ConfigurationInfo configurationInfo) {
        this.configurationInfo = configurationInfo;
        return this;
    }

    /**
     * 
     <p>
     * The number of broker nodes in the cluster.
     * </p>
     * 
     * @return <p>
     *         The number of broker nodes in the cluster.
     *         </p>
     */
    public Integer getNumberOfBrokerNodes() {
        return numberOfBrokerNodes;
    }

    /**
     * 
     <p>
     * The number of broker nodes in the cluster.
     * </p>
     * 
     * @param numberOfBrokerNodes <p>
     *            The number of broker nodes in the cluster.
     *            </p>
     */
    public void setNumberOfBrokerNodes(Integer numberOfBrokerNodes) {
        this.numberOfBrokerNodes = numberOfBrokerNodes;
    }

    /**
     * 
     <p>
     * The number of broker nodes in the cluster.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param numberOfBrokerNodes <p>
     *            The number of broker nodes in the cluster.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MutableClusterInfo withNumberOfBrokerNodes(Integer numberOfBrokerNodes) {
        this.numberOfBrokerNodes = numberOfBrokerNodes;
        return this;
    }

    /**
     * 
     <p>
     * Specifies which Apache Kafka metrics Amazon MSK gathers and sends to
     * Amazon CloudWatch for this cluster.
     * </p> <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, PER_BROKER, PER_TOPIC_PER_BROKER
     *
     * @return <p>
     *         Specifies which Apache Kafka metrics Amazon MSK gathers and sends
     *         to Amazon CloudWatch for this cluster.
     *         </p> @see EnhancedMonitoring
     */
    public String getEnhancedMonitoring() {
        return enhancedMonitoring;
    }

    /**
     * 
     <p>
     * Specifies which Apache Kafka metrics Amazon MSK gathers and sends to
     * Amazon CloudWatch for this cluster.
     * </p> <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, PER_BROKER, PER_TOPIC_PER_BROKER
     *
     * @param enhancedMonitoring <p>
     *            Specifies which Apache Kafka metrics Amazon MSK gathers and
     *            sends to Amazon CloudWatch for this cluster.
     *            </p> @see EnhancedMonitoring
     */
    public void setEnhancedMonitoring(String enhancedMonitoring) {
        this.enhancedMonitoring = enhancedMonitoring;
    }

    /**
     * 
     <p>
     * Specifies which Apache Kafka metrics Amazon MSK gathers and sends to
     * Amazon CloudWatch for this cluster.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, PER_BROKER, PER_TOPIC_PER_BROKER
     *
     * @param enhancedMonitoring <p>
     *            Specifies which Apache Kafka metrics Amazon MSK gathers and
     *            sends to Amazon CloudWatch for this cluster.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EnhancedMonitoring
     */
    public MutableClusterInfo withEnhancedMonitoring(String enhancedMonitoring) {
        this.enhancedMonitoring = enhancedMonitoring;
        return this;
    }

    /**
     * 
     <p>
     * Specifies which Apache Kafka metrics Amazon MSK gathers and sends to
     * Amazon CloudWatch for this cluster.
     * </p> <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, PER_BROKER, PER_TOPIC_PER_BROKER
     *
     * @param enhancedMonitoring <p>
     *            Specifies which Apache Kafka metrics Amazon MSK gathers and
     *            sends to Amazon CloudWatch for this cluster.
     *            </p> @see EnhancedMonitoring
     */
    public void setEnhancedMonitoring(EnhancedMonitoring enhancedMonitoring) {
        this.enhancedMonitoring = enhancedMonitoring.toString();
    }

    /**
     * 
     <p>
     * Specifies which Apache Kafka metrics Amazon MSK gathers and sends to
     * Amazon CloudWatch for this cluster.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, PER_BROKER, PER_TOPIC_PER_BROKER
     *
     * @param enhancedMonitoring <p>
     *            Specifies which Apache Kafka metrics Amazon MSK gathers and
     *            sends to Amazon CloudWatch for this cluster.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EnhancedMonitoring
     */
    public MutableClusterInfo withEnhancedMonitoring(EnhancedMonitoring enhancedMonitoring) {
        this.enhancedMonitoring = enhancedMonitoring.toString();
        return this;
    }

    /**
     * 
     <p>
     * The settings for open monitoring.
     * </p>
     * 
     * @return <p>
     *         The settings for open monitoring.
     *         </p>
     */
    public OpenMonitoring getOpenMonitoring() {
        return openMonitoring;
    }

    /**
     * 
     <p>
     * The settings for open monitoring.
     * </p>
     * 
     * @param openMonitoring <p>
     *            The settings for open monitoring.
     *            </p>
     */
    public void setOpenMonitoring(OpenMonitoring openMonitoring) {
        this.openMonitoring = openMonitoring;
    }

    /**
     * 
     <p>
     * The settings for open monitoring.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param openMonitoring <p>
     *            The settings for open monitoring.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MutableClusterInfo withOpenMonitoring(OpenMonitoring openMonitoring) {
        this.openMonitoring = openMonitoring;
        return this;
    }

    /**
     * 
     <p>
     * The Kafka version.
     * </p>
     * 
     * @return <p>
     *         The Kafka version.
     *         </p>
     */
    public String getKafkaVersion() {
        return kafkaVersion;
    }

    /**
     * 
     <p>
     * The Kafka version.
     * </p>
     * 
     * @param kafkaVersion <p>
     *            The Kafka version.
     *            </p>
     */
    public void setKafkaVersion(String kafkaVersion) {
        this.kafkaVersion = kafkaVersion;
    }

    /**
     * 
     <p>
     * The Kafka version.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kafkaVersion <p>
     *            The Kafka version.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MutableClusterInfo withKafkaVersion(String kafkaVersion) {
        this.kafkaVersion = kafkaVersion;
        return this;
    }

    /**
     * Returns the value of the loggingInfo property for this object.
     *
     * @return The value of the loggingInfo property for this object.
     */
    public LoggingInfo getLoggingInfo() {
        return loggingInfo;
    }

    /**
     * Sets the value of loggingInfo
     *
     * @param loggingInfo The new value for the loggingInfo property for this
     *            object.
     */
    public void setLoggingInfo(LoggingInfo loggingInfo) {
        this.loggingInfo = loggingInfo;
    }

    /**
     * Sets the value of the loggingInfo property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loggingInfo The new value for the loggingInfo property for this
     *            object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MutableClusterInfo withLoggingInfo(LoggingInfo loggingInfo) {
        this.loggingInfo = loggingInfo;
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
        if (getBrokerEBSVolumeInfo() != null)
            sb.append("BrokerEBSVolumeInfo: " + getBrokerEBSVolumeInfo() + ",");
        if (getConfigurationInfo() != null)
            sb.append("ConfigurationInfo: " + getConfigurationInfo() + ",");
        if (getNumberOfBrokerNodes() != null)
            sb.append("NumberOfBrokerNodes: " + getNumberOfBrokerNodes() + ",");
        if (getEnhancedMonitoring() != null)
            sb.append("EnhancedMonitoring: " + getEnhancedMonitoring() + ",");
        if (getOpenMonitoring() != null)
            sb.append("OpenMonitoring: " + getOpenMonitoring() + ",");
        if (getKafkaVersion() != null)
            sb.append("KafkaVersion: " + getKafkaVersion() + ",");
        if (getLoggingInfo() != null)
            sb.append("LoggingInfo: " + getLoggingInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBrokerEBSVolumeInfo() == null) ? 0 : getBrokerEBSVolumeInfo().hashCode());
        hashCode = prime * hashCode
                + ((getConfigurationInfo() == null) ? 0 : getConfigurationInfo().hashCode());
        hashCode = prime * hashCode
                + ((getNumberOfBrokerNodes() == null) ? 0 : getNumberOfBrokerNodes().hashCode());
        hashCode = prime * hashCode
                + ((getEnhancedMonitoring() == null) ? 0 : getEnhancedMonitoring().hashCode());
        hashCode = prime * hashCode
                + ((getOpenMonitoring() == null) ? 0 : getOpenMonitoring().hashCode());
        hashCode = prime * hashCode
                + ((getKafkaVersion() == null) ? 0 : getKafkaVersion().hashCode());
        hashCode = prime * hashCode
                + ((getLoggingInfo() == null) ? 0 : getLoggingInfo().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MutableClusterInfo == false)
            return false;
        MutableClusterInfo other = (MutableClusterInfo) obj;

        if (other.getBrokerEBSVolumeInfo() == null ^ this.getBrokerEBSVolumeInfo() == null)
            return false;
        if (other.getBrokerEBSVolumeInfo() != null
                && other.getBrokerEBSVolumeInfo().equals(this.getBrokerEBSVolumeInfo()) == false)
            return false;
        if (other.getConfigurationInfo() == null ^ this.getConfigurationInfo() == null)
            return false;
        if (other.getConfigurationInfo() != null
                && other.getConfigurationInfo().equals(this.getConfigurationInfo()) == false)
            return false;
        if (other.getNumberOfBrokerNodes() == null ^ this.getNumberOfBrokerNodes() == null)
            return false;
        if (other.getNumberOfBrokerNodes() != null
                && other.getNumberOfBrokerNodes().equals(this.getNumberOfBrokerNodes()) == false)
            return false;
        if (other.getEnhancedMonitoring() == null ^ this.getEnhancedMonitoring() == null)
            return false;
        if (other.getEnhancedMonitoring() != null
                && other.getEnhancedMonitoring().equals(this.getEnhancedMonitoring()) == false)
            return false;
        if (other.getOpenMonitoring() == null ^ this.getOpenMonitoring() == null)
            return false;
        if (other.getOpenMonitoring() != null
                && other.getOpenMonitoring().equals(this.getOpenMonitoring()) == false)
            return false;
        if (other.getKafkaVersion() == null ^ this.getKafkaVersion() == null)
            return false;
        if (other.getKafkaVersion() != null
                && other.getKafkaVersion().equals(this.getKafkaVersion()) == false)
            return false;
        if (other.getLoggingInfo() == null ^ this.getLoggingInfo() == null)
            return false;
        if (other.getLoggingInfo() != null
                && other.getLoggingInfo().equals(this.getLoggingInfo()) == false)
            return false;
        return true;
    }
}
