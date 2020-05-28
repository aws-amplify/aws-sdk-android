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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 <p>
 * Creates a new MSK cluster.
 * </p>
 */
public class CreateClusterRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * 
     <p>
     * Information about the broker nodes in the cluster.
     * </p>
     */
    private BrokerNodeGroupInfo brokerNodeGroupInfo;

    /**
     * 
     <p>
     * Includes all client authentication related information.
     * </p>
     */
    private ClientAuthentication clientAuthentication;

    /**
     * 
     <p>
     * The name of the cluster.
     * </p> <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String clusterName;

    /**
     * 
     <p>
     * Represents the configuration that you want MSK to use for the brokers in
     * a cluster.
     * </p>
     */
    private ConfigurationInfo configurationInfo;

    /**
     * 
     <p>
     * Includes all encryption-related information.
     * </p>
     */
    private EncryptionInfo encryptionInfo;

    /**
     * 
     <p>
     * Specifies the level of monitoring for the MSK cluster. The possible
     * values are DEFAULT, PER_BROKER, and PER_TOPIC_PER_BROKER.
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
    private OpenMonitoringInfo openMonitoring;

    /**
     * 
     <p>
     * The version of Apache Kafka.
     * </p> <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String kafkaVersion;

    /**
     * The new value for the loggingInfo property for this object.
     */
    private LoggingInfo loggingInfo;

    /**
     * 
     <p>
     * The number of broker nodes in the cluster.
     * </p> <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 15<br/>
     */
    private Integer numberOfBrokerNodes;

    /**
     * 
     <p>
     * Create tags when creating the cluster.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * 
     <p>
     * Information about the broker nodes in the cluster.
     * </p>
     * 
     * @return <p>
     *         Information about the broker nodes in the cluster.
     *         </p>
     */
    public BrokerNodeGroupInfo getBrokerNodeGroupInfo() {
        return brokerNodeGroupInfo;
    }

    /**
     * 
     <p>
     * Information about the broker nodes in the cluster.
     * </p>
     * 
     * @param brokerNodeGroupInfo <p>
     *            Information about the broker nodes in the cluster.
     *            </p>
     */
    public void setBrokerNodeGroupInfo(BrokerNodeGroupInfo brokerNodeGroupInfo) {
        this.brokerNodeGroupInfo = brokerNodeGroupInfo;
    }

    /**
     * 
     <p>
     * Information about the broker nodes in the cluster.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param brokerNodeGroupInfo <p>
     *            Information about the broker nodes in the cluster.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClusterRequest withBrokerNodeGroupInfo(BrokerNodeGroupInfo brokerNodeGroupInfo) {
        this.brokerNodeGroupInfo = brokerNodeGroupInfo;
        return this;
    }

    /**
     * 
     <p>
     * Includes all client authentication related information.
     * </p>
     * 
     * @return <p>
     *         Includes all client authentication related information.
     *         </p>
     */
    public ClientAuthentication getClientAuthentication() {
        return clientAuthentication;
    }

    /**
     * 
     <p>
     * Includes all client authentication related information.
     * </p>
     * 
     * @param clientAuthentication <p>
     *            Includes all client authentication related information.
     *            </p>
     */
    public void setClientAuthentication(ClientAuthentication clientAuthentication) {
        this.clientAuthentication = clientAuthentication;
    }

    /**
     * 
     <p>
     * Includes all client authentication related information.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientAuthentication <p>
     *            Includes all client authentication related information.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClusterRequest withClientAuthentication(ClientAuthentication clientAuthentication) {
        this.clientAuthentication = clientAuthentication;
        return this;
    }

    /**
     * 
     <p>
     * The name of the cluster.
     * </p> <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>
     *         The name of the cluster.
     *         </p>
     */
    public String getClusterName() {
        return clusterName;
    }

    /**
     * 
     <p>
     * The name of the cluster.
     * </p> <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param clusterName <p>
     *            The name of the cluster.
     *            </p>
     */
    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * 
     <p>
     * The name of the cluster.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param clusterName <p>
     *            The name of the cluster.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClusterRequest withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * 
     <p>
     * Represents the configuration that you want MSK to use for the brokers in
     * a cluster.
     * </p>
     * 
     * @return <p>
     *         Represents the configuration that you want MSK to use for the
     *         brokers in a cluster.
     *         </p>
     */
    public ConfigurationInfo getConfigurationInfo() {
        return configurationInfo;
    }

    /**
     * 
     <p>
     * Represents the configuration that you want MSK to use for the brokers in
     * a cluster.
     * </p>
     * 
     * @param configurationInfo <p>
     *            Represents the configuration that you want MSK to use for the
     *            brokers in a cluster.
     *            </p>
     */
    public void setConfigurationInfo(ConfigurationInfo configurationInfo) {
        this.configurationInfo = configurationInfo;
    }

    /**
     * 
     <p>
     * Represents the configuration that you want MSK to use for the brokers in
     * a cluster.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param configurationInfo <p>
     *            Represents the configuration that you want MSK to use for the
     *            brokers in a cluster.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClusterRequest withConfigurationInfo(ConfigurationInfo configurationInfo) {
        this.configurationInfo = configurationInfo;
        return this;
    }

    /**
     * 
     <p>
     * Includes all encryption-related information.
     * </p>
     * 
     * @return <p>
     *         Includes all encryption-related information.
     *         </p>
     */
    public EncryptionInfo getEncryptionInfo() {
        return encryptionInfo;
    }

    /**
     * 
     <p>
     * Includes all encryption-related information.
     * </p>
     * 
     * @param encryptionInfo <p>
     *            Includes all encryption-related information.
     *            </p>
     */
    public void setEncryptionInfo(EncryptionInfo encryptionInfo) {
        this.encryptionInfo = encryptionInfo;
    }

    /**
     * 
     <p>
     * Includes all encryption-related information.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encryptionInfo <p>
     *            Includes all encryption-related information.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClusterRequest withEncryptionInfo(EncryptionInfo encryptionInfo) {
        this.encryptionInfo = encryptionInfo;
        return this;
    }

    /**
     * 
     <p>
     * Specifies the level of monitoring for the MSK cluster. The possible
     * values are DEFAULT, PER_BROKER, and PER_TOPIC_PER_BROKER.
     * </p> <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, PER_BROKER, PER_TOPIC_PER_BROKER
     *
     * @return <p>
     *         Specifies the level of monitoring for the MSK cluster. The
     *         possible values are DEFAULT, PER_BROKER, and
     *         PER_TOPIC_PER_BROKER.
     *         </p> @see EnhancedMonitoring
     */
    public String getEnhancedMonitoring() {
        return enhancedMonitoring;
    }

    /**
     * 
     <p>
     * Specifies the level of monitoring for the MSK cluster. The possible
     * values are DEFAULT, PER_BROKER, and PER_TOPIC_PER_BROKER.
     * </p> <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, PER_BROKER, PER_TOPIC_PER_BROKER
     *
     * @param enhancedMonitoring <p>
     *            Specifies the level of monitoring for the MSK cluster. The
     *            possible values are DEFAULT, PER_BROKER, and
     *            PER_TOPIC_PER_BROKER.
     *            </p> @see EnhancedMonitoring
     */
    public void setEnhancedMonitoring(String enhancedMonitoring) {
        this.enhancedMonitoring = enhancedMonitoring;
    }

    /**
     * 
     <p>
     * Specifies the level of monitoring for the MSK cluster. The possible
     * values are DEFAULT, PER_BROKER, and PER_TOPIC_PER_BROKER.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, PER_BROKER, PER_TOPIC_PER_BROKER
     *
     * @param enhancedMonitoring <p>
     *            Specifies the level of monitoring for the MSK cluster. The
     *            possible values are DEFAULT, PER_BROKER, and
     *            PER_TOPIC_PER_BROKER.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EnhancedMonitoring
     */
    public CreateClusterRequest withEnhancedMonitoring(String enhancedMonitoring) {
        this.enhancedMonitoring = enhancedMonitoring;
        return this;
    }

    /**
     * 
     <p>
     * Specifies the level of monitoring for the MSK cluster. The possible
     * values are DEFAULT, PER_BROKER, and PER_TOPIC_PER_BROKER.
     * </p> <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, PER_BROKER, PER_TOPIC_PER_BROKER
     *
     * @param enhancedMonitoring <p>
     *            Specifies the level of monitoring for the MSK cluster. The
     *            possible values are DEFAULT, PER_BROKER, and
     *            PER_TOPIC_PER_BROKER.
     *            </p> @see EnhancedMonitoring
     */
    public void setEnhancedMonitoring(EnhancedMonitoring enhancedMonitoring) {
        this.enhancedMonitoring = enhancedMonitoring.toString();
    }

    /**
     * 
     <p>
     * Specifies the level of monitoring for the MSK cluster. The possible
     * values are DEFAULT, PER_BROKER, and PER_TOPIC_PER_BROKER.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, PER_BROKER, PER_TOPIC_PER_BROKER
     *
     * @param enhancedMonitoring <p>
     *            Specifies the level of monitoring for the MSK cluster. The
     *            possible values are DEFAULT, PER_BROKER, and
     *            PER_TOPIC_PER_BROKER.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EnhancedMonitoring
     */
    public CreateClusterRequest withEnhancedMonitoring(EnhancedMonitoring enhancedMonitoring) {
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
    public OpenMonitoringInfo getOpenMonitoring() {
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
    public void setOpenMonitoring(OpenMonitoringInfo openMonitoring) {
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
    public CreateClusterRequest withOpenMonitoring(OpenMonitoringInfo openMonitoring) {
        this.openMonitoring = openMonitoring;
        return this;
    }

    /**
     * 
     <p>
     * The version of Apache Kafka.
     * </p> <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
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
     * </p> <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param kafkaVersion <p>
     *            The version of Apache Kafka.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClusterRequest withKafkaVersion(String kafkaVersion) {
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
    public CreateClusterRequest withLoggingInfo(LoggingInfo loggingInfo) {
        this.loggingInfo = loggingInfo;
        return this;
    }

    /**
     * 
     <p>
     * The number of broker nodes in the cluster.
     * </p> <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 15<br/>
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
     * </p> <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 15<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 15<br/>
     *
     * @param numberOfBrokerNodes <p>
     *            The number of broker nodes in the cluster.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClusterRequest withNumberOfBrokerNodes(Integer numberOfBrokerNodes) {
        this.numberOfBrokerNodes = numberOfBrokerNodes;
        return this;
    }

    /**
     * 
     <p>
     * Create tags when creating the cluster.
     * </p>
     * 
     * @return <p>
     *         Create tags when creating the cluster.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * 
     <p>
     * Create tags when creating the cluster.
     * </p>
     * 
     * @param tags <p>
     *            Create tags when creating the cluster.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * 
     <p>
     * Create tags when creating the cluster.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Create tags when creating the cluster.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClusterRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * 
     <p>
     * Create tags when creating the cluster.
     * </p> <p>
     * The method adds a new key-value pair into Tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Tags.
     * @param value The corresponding value of the entry to be added into Tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateClusterRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateClusterRequest clearTagsEntries() {
        this.tags = null;
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
        if (getBrokerNodeGroupInfo() != null)
            sb.append("BrokerNodeGroupInfo: " + getBrokerNodeGroupInfo() + ",");
        if (getClientAuthentication() != null)
            sb.append("ClientAuthentication: " + getClientAuthentication() + ",");
        if (getClusterName() != null)
            sb.append("ClusterName: " + getClusterName() + ",");
        if (getConfigurationInfo() != null)
            sb.append("ConfigurationInfo: " + getConfigurationInfo() + ",");
        if (getEncryptionInfo() != null)
            sb.append("EncryptionInfo: " + getEncryptionInfo() + ",");
        if (getEnhancedMonitoring() != null)
            sb.append("EnhancedMonitoring: " + getEnhancedMonitoring() + ",");
        if (getOpenMonitoring() != null)
            sb.append("OpenMonitoring: " + getOpenMonitoring() + ",");
        if (getKafkaVersion() != null)
            sb.append("KafkaVersion: " + getKafkaVersion() + ",");
        if (getLoggingInfo() != null)
            sb.append("LoggingInfo: " + getLoggingInfo() + ",");
        if (getNumberOfBrokerNodes() != null)
            sb.append("NumberOfBrokerNodes: " + getNumberOfBrokerNodes() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBrokerNodeGroupInfo() == null) ? 0 : getBrokerNodeGroupInfo().hashCode());
        hashCode = prime * hashCode
                + ((getClientAuthentication() == null) ? 0 : getClientAuthentication().hashCode());
        hashCode = prime * hashCode
                + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        hashCode = prime * hashCode
                + ((getConfigurationInfo() == null) ? 0 : getConfigurationInfo().hashCode());
        hashCode = prime * hashCode
                + ((getEncryptionInfo() == null) ? 0 : getEncryptionInfo().hashCode());
        hashCode = prime * hashCode
                + ((getEnhancedMonitoring() == null) ? 0 : getEnhancedMonitoring().hashCode());
        hashCode = prime * hashCode
                + ((getOpenMonitoring() == null) ? 0 : getOpenMonitoring().hashCode());
        hashCode = prime * hashCode
                + ((getKafkaVersion() == null) ? 0 : getKafkaVersion().hashCode());
        hashCode = prime * hashCode
                + ((getLoggingInfo() == null) ? 0 : getLoggingInfo().hashCode());
        hashCode = prime * hashCode
                + ((getNumberOfBrokerNodes() == null) ? 0 : getNumberOfBrokerNodes().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateClusterRequest == false)
            return false;
        CreateClusterRequest other = (CreateClusterRequest) obj;

        if (other.getBrokerNodeGroupInfo() == null ^ this.getBrokerNodeGroupInfo() == null)
            return false;
        if (other.getBrokerNodeGroupInfo() != null
                && other.getBrokerNodeGroupInfo().equals(this.getBrokerNodeGroupInfo()) == false)
            return false;
        if (other.getClientAuthentication() == null ^ this.getClientAuthentication() == null)
            return false;
        if (other.getClientAuthentication() != null
                && other.getClientAuthentication().equals(this.getClientAuthentication()) == false)
            return false;
        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null
                && other.getClusterName().equals(this.getClusterName()) == false)
            return false;
        if (other.getConfigurationInfo() == null ^ this.getConfigurationInfo() == null)
            return false;
        if (other.getConfigurationInfo() != null
                && other.getConfigurationInfo().equals(this.getConfigurationInfo()) == false)
            return false;
        if (other.getEncryptionInfo() == null ^ this.getEncryptionInfo() == null)
            return false;
        if (other.getEncryptionInfo() != null
                && other.getEncryptionInfo().equals(this.getEncryptionInfo()) == false)
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
        if (other.getNumberOfBrokerNodes() == null ^ this.getNumberOfBrokerNodes() == null)
            return false;
        if (other.getNumberOfBrokerNodes() != null
                && other.getNumberOfBrokerNodes().equals(this.getNumberOfBrokerNodes()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
