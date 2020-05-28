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
 * Returns information about a cluster.
 * </p>
 */
public class ClusterInfo implements Serializable {
    /**
     * 
     <p>
     * Arn of active cluster operation.
     * </p>
     */
    private String activeOperationArn;

    /**
     * 
     <p>
     * Information about the broker nodes.
     * </p>
     */
    private BrokerNodeGroupInfo brokerNodeGroupInfo;

    /**
     * 
     <p>
     * Includes all client authentication information.
     * </p>
     */
    private ClientAuthentication clientAuthentication;

    /**
     * 
     <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the cluster.
     * </p>
     */
    private String clusterArn;

    /**
     * 
     <p>
     * The name of the cluster.
     * </p>
     */
    private String clusterName;

    /**
     * 
     <p>
     * The time when the cluster was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * 
     <p>
     * Information about the version of software currently deployed on the Kafka
     * brokers in the cluster.
     * </p>
     */
    private BrokerSoftwareInfo currentBrokerSoftwareInfo;

    /**
     * 
     <p>
     * The current version of the MSK cluster.
     * </p>
     */
    private String currentVersion;

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
     * Specifies which metrics are gathered for the MSK cluster. This property
     * has three possible values: DEFAULT, PER_BROKER, and PER_TOPIC_PER_BROKER.
     * For a list of the metrics associated with each of these three levels of
     * monitoring, see <a href=
     * "https://docs.aws.amazon.com/msk/latest/developerguide/monitoring.html"
     * >Monitoring</a>.
     * </p> <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, PER_BROKER, PER_TOPIC_PER_BROKER
     */
    private String enhancedMonitoring;

    /**
     * 
     <p>
     * Settings for open monitoring using Prometheus.
     * </p>
     */
    private OpenMonitoring openMonitoring;

    /**
     * The new value for the loggingInfo property for this object.
     */
    private LoggingInfo loggingInfo;

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
     * The state of the cluster. The possible states are CREATING, ACTIVE, and
     * FAILED.
     * </p> <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, CREATING, UPDATING, DELETING, FAILED
     */
    private String state;

    /**
     * The new value for the stateInfo property for this object.
     */
    private StateInfo stateInfo;

    /**
     * 
     <p>
     * Tags attached to the cluster.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * 
     <p>
     * The connection string to use to connect to the Apache ZooKeeper cluster.
     * </p>
     */
    private String zookeeperConnectString;

    /**
     * 
     <p>
     * Arn of active cluster operation.
     * </p>
     * 
     * @return <p>
     *         Arn of active cluster operation.
     *         </p>
     */
    public String getActiveOperationArn() {
        return activeOperationArn;
    }

    /**
     * 
     <p>
     * Arn of active cluster operation.
     * </p>
     * 
     * @param activeOperationArn <p>
     *            Arn of active cluster operation.
     *            </p>
     */
    public void setActiveOperationArn(String activeOperationArn) {
        this.activeOperationArn = activeOperationArn;
    }

    /**
     * 
     <p>
     * Arn of active cluster operation.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param activeOperationArn <p>
     *            Arn of active cluster operation.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterInfo withActiveOperationArn(String activeOperationArn) {
        this.activeOperationArn = activeOperationArn;
        return this;
    }

    /**
     * 
     <p>
     * Information about the broker nodes.
     * </p>
     * 
     * @return <p>
     *         Information about the broker nodes.
     *         </p>
     */
    public BrokerNodeGroupInfo getBrokerNodeGroupInfo() {
        return brokerNodeGroupInfo;
    }

    /**
     * 
     <p>
     * Information about the broker nodes.
     * </p>
     * 
     * @param brokerNodeGroupInfo <p>
     *            Information about the broker nodes.
     *            </p>
     */
    public void setBrokerNodeGroupInfo(BrokerNodeGroupInfo brokerNodeGroupInfo) {
        this.brokerNodeGroupInfo = brokerNodeGroupInfo;
    }

    /**
     * 
     <p>
     * Information about the broker nodes.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param brokerNodeGroupInfo <p>
     *            Information about the broker nodes.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterInfo withBrokerNodeGroupInfo(BrokerNodeGroupInfo brokerNodeGroupInfo) {
        this.brokerNodeGroupInfo = brokerNodeGroupInfo;
        return this;
    }

    /**
     * 
     <p>
     * Includes all client authentication information.
     * </p>
     * 
     * @return <p>
     *         Includes all client authentication information.
     *         </p>
     */
    public ClientAuthentication getClientAuthentication() {
        return clientAuthentication;
    }

    /**
     * 
     <p>
     * Includes all client authentication information.
     * </p>
     * 
     * @param clientAuthentication <p>
     *            Includes all client authentication information.
     *            </p>
     */
    public void setClientAuthentication(ClientAuthentication clientAuthentication) {
        this.clientAuthentication = clientAuthentication;
    }

    /**
     * 
     <p>
     * Includes all client authentication information.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientAuthentication <p>
     *            Includes all client authentication information.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterInfo withClientAuthentication(ClientAuthentication clientAuthentication) {
        this.clientAuthentication = clientAuthentication;
        return this;
    }

    /**
     * 
     <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the cluster.
     * </p>
     * 
     * @return <p>
     *         The Amazon Resource Name (ARN) that uniquely identifies the
     *         cluster.
     *         </p>
     */
    public String getClusterArn() {
        return clusterArn;
    }

    /**
     * 
     <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the cluster.
     * </p>
     * 
     * @param clusterArn <p>
     *            The Amazon Resource Name (ARN) that uniquely identifies the
     *            cluster.
     *            </p>
     */
    public void setClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
    }

    /**
     * 
     <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the cluster.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterArn <p>
     *            The Amazon Resource Name (ARN) that uniquely identifies the
     *            cluster.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterInfo withClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
        return this;
    }

    /**
     * 
     <p>
     * The name of the cluster.
     * </p>
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
     * </p>
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
     *
     * @param clusterName <p>
     *            The name of the cluster.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterInfo withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * 
     <p>
     * The time when the cluster was created.
     * </p>
     * 
     * @return <p>
     *         The time when the cluster was created.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * 
     <p>
     * The time when the cluster was created.
     * </p>
     * 
     * @param creationTime <p>
     *            The time when the cluster was created.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * 
     <p>
     * The time when the cluster was created.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            The time when the cluster was created.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterInfo withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * 
     <p>
     * Information about the version of software currently deployed on the Kafka
     * brokers in the cluster.
     * </p>
     * 
     * @return <p>
     *         Information about the version of software currently deployed on
     *         the Kafka brokers in the cluster.
     *         </p>
     */
    public BrokerSoftwareInfo getCurrentBrokerSoftwareInfo() {
        return currentBrokerSoftwareInfo;
    }

    /**
     * 
     <p>
     * Information about the version of software currently deployed on the Kafka
     * brokers in the cluster.
     * </p>
     * 
     * @param currentBrokerSoftwareInfo <p>
     *            Information about the version of software currently deployed
     *            on the Kafka brokers in the cluster.
     *            </p>
     */
    public void setCurrentBrokerSoftwareInfo(BrokerSoftwareInfo currentBrokerSoftwareInfo) {
        this.currentBrokerSoftwareInfo = currentBrokerSoftwareInfo;
    }

    /**
     * 
     <p>
     * Information about the version of software currently deployed on the Kafka
     * brokers in the cluster.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param currentBrokerSoftwareInfo <p>
     *            Information about the version of software currently deployed
     *            on the Kafka brokers in the cluster.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterInfo withCurrentBrokerSoftwareInfo(BrokerSoftwareInfo currentBrokerSoftwareInfo) {
        this.currentBrokerSoftwareInfo = currentBrokerSoftwareInfo;
        return this;
    }

    /**
     * 
     <p>
     * The current version of the MSK cluster.
     * </p>
     * 
     * @return <p>
     *         The current version of the MSK cluster.
     *         </p>
     */
    public String getCurrentVersion() {
        return currentVersion;
    }

    /**
     * 
     <p>
     * The current version of the MSK cluster.
     * </p>
     * 
     * @param currentVersion <p>
     *            The current version of the MSK cluster.
     *            </p>
     */
    public void setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
    }

    /**
     * 
     <p>
     * The current version of the MSK cluster.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param currentVersion <p>
     *            The current version of the MSK cluster.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterInfo withCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
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
    public ClusterInfo withEncryptionInfo(EncryptionInfo encryptionInfo) {
        this.encryptionInfo = encryptionInfo;
        return this;
    }

    /**
     * 
     <p>
     * Specifies which metrics are gathered for the MSK cluster. This property
     * has three possible values: DEFAULT, PER_BROKER, and PER_TOPIC_PER_BROKER.
     * For a list of the metrics associated with each of these three levels of
     * monitoring, see <a href=
     * "https://docs.aws.amazon.com/msk/latest/developerguide/monitoring.html"
     * >Monitoring</a>.
     * </p> <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, PER_BROKER, PER_TOPIC_PER_BROKER
     *
     * @return <p>
     *         Specifies which metrics are gathered for the MSK cluster. This
     *         property has three possible values: DEFAULT, PER_BROKER, and
     *         PER_TOPIC_PER_BROKER. For a list of the metrics associated with
     *         each of these three levels of monitoring, see <a href=
     *         "https://docs.aws.amazon.com/msk/latest/developerguide/monitoring.html"
     *         >Monitoring</a>.
     *         </p> @see EnhancedMonitoring
     */
    public String getEnhancedMonitoring() {
        return enhancedMonitoring;
    }

    /**
     * 
     <p>
     * Specifies which metrics are gathered for the MSK cluster. This property
     * has three possible values: DEFAULT, PER_BROKER, and PER_TOPIC_PER_BROKER.
     * For a list of the metrics associated with each of these three levels of
     * monitoring, see <a href=
     * "https://docs.aws.amazon.com/msk/latest/developerguide/monitoring.html"
     * >Monitoring</a>.
     * </p> <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, PER_BROKER, PER_TOPIC_PER_BROKER
     *
     * @param enhancedMonitoring <p>
     *            Specifies which metrics are gathered for the MSK cluster. This
     *            property has three possible values: DEFAULT, PER_BROKER, and
     *            PER_TOPIC_PER_BROKER. For a list of the metrics associated
     *            with each of these three levels of monitoring, see <a href=
     *            "https://docs.aws.amazon.com/msk/latest/developerguide/monitoring.html"
     *            >Monitoring</a>.
     *            </p> @see EnhancedMonitoring
     */
    public void setEnhancedMonitoring(String enhancedMonitoring) {
        this.enhancedMonitoring = enhancedMonitoring;
    }

    /**
     * 
     <p>
     * Specifies which metrics are gathered for the MSK cluster. This property
     * has three possible values: DEFAULT, PER_BROKER, and PER_TOPIC_PER_BROKER.
     * For a list of the metrics associated with each of these three levels of
     * monitoring, see <a href=
     * "https://docs.aws.amazon.com/msk/latest/developerguide/monitoring.html"
     * >Monitoring</a>.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, PER_BROKER, PER_TOPIC_PER_BROKER
     *
     * @param enhancedMonitoring <p>
     *            Specifies which metrics are gathered for the MSK cluster. This
     *            property has three possible values: DEFAULT, PER_BROKER, and
     *            PER_TOPIC_PER_BROKER. For a list of the metrics associated
     *            with each of these three levels of monitoring, see <a href=
     *            "https://docs.aws.amazon.com/msk/latest/developerguide/monitoring.html"
     *            >Monitoring</a>.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EnhancedMonitoring
     */
    public ClusterInfo withEnhancedMonitoring(String enhancedMonitoring) {
        this.enhancedMonitoring = enhancedMonitoring;
        return this;
    }

    /**
     * 
     <p>
     * Specifies which metrics are gathered for the MSK cluster. This property
     * has three possible values: DEFAULT, PER_BROKER, and PER_TOPIC_PER_BROKER.
     * For a list of the metrics associated with each of these three levels of
     * monitoring, see <a href=
     * "https://docs.aws.amazon.com/msk/latest/developerguide/monitoring.html"
     * >Monitoring</a>.
     * </p> <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, PER_BROKER, PER_TOPIC_PER_BROKER
     *
     * @param enhancedMonitoring <p>
     *            Specifies which metrics are gathered for the MSK cluster. This
     *            property has three possible values: DEFAULT, PER_BROKER, and
     *            PER_TOPIC_PER_BROKER. For a list of the metrics associated
     *            with each of these three levels of monitoring, see <a href=
     *            "https://docs.aws.amazon.com/msk/latest/developerguide/monitoring.html"
     *            >Monitoring</a>.
     *            </p> @see EnhancedMonitoring
     */
    public void setEnhancedMonitoring(EnhancedMonitoring enhancedMonitoring) {
        this.enhancedMonitoring = enhancedMonitoring.toString();
    }

    /**
     * 
     <p>
     * Specifies which metrics are gathered for the MSK cluster. This property
     * has three possible values: DEFAULT, PER_BROKER, and PER_TOPIC_PER_BROKER.
     * For a list of the metrics associated with each of these three levels of
     * monitoring, see <a href=
     * "https://docs.aws.amazon.com/msk/latest/developerguide/monitoring.html"
     * >Monitoring</a>.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, PER_BROKER, PER_TOPIC_PER_BROKER
     *
     * @param enhancedMonitoring <p>
     *            Specifies which metrics are gathered for the MSK cluster. This
     *            property has three possible values: DEFAULT, PER_BROKER, and
     *            PER_TOPIC_PER_BROKER. For a list of the metrics associated
     *            with each of these three levels of monitoring, see <a href=
     *            "https://docs.aws.amazon.com/msk/latest/developerguide/monitoring.html"
     *            >Monitoring</a>.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EnhancedMonitoring
     */
    public ClusterInfo withEnhancedMonitoring(EnhancedMonitoring enhancedMonitoring) {
        this.enhancedMonitoring = enhancedMonitoring.toString();
        return this;
    }

    /**
     * 
     <p>
     * Settings for open monitoring using Prometheus.
     * </p>
     * 
     * @return <p>
     *         Settings for open monitoring using Prometheus.
     *         </p>
     */
    public OpenMonitoring getOpenMonitoring() {
        return openMonitoring;
    }

    /**
     * 
     <p>
     * Settings for open monitoring using Prometheus.
     * </p>
     * 
     * @param openMonitoring <p>
     *            Settings for open monitoring using Prometheus.
     *            </p>
     */
    public void setOpenMonitoring(OpenMonitoring openMonitoring) {
        this.openMonitoring = openMonitoring;
    }

    /**
     * 
     <p>
     * Settings for open monitoring using Prometheus.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param openMonitoring <p>
     *            Settings for open monitoring using Prometheus.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterInfo withOpenMonitoring(OpenMonitoring openMonitoring) {
        this.openMonitoring = openMonitoring;
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
    public ClusterInfo withLoggingInfo(LoggingInfo loggingInfo) {
        this.loggingInfo = loggingInfo;
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
    public ClusterInfo withNumberOfBrokerNodes(Integer numberOfBrokerNodes) {
        this.numberOfBrokerNodes = numberOfBrokerNodes;
        return this;
    }

    /**
     * 
     <p>
     * The state of the cluster. The possible states are CREATING, ACTIVE, and
     * FAILED.
     * </p> <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, CREATING, UPDATING, DELETING, FAILED
     *
     * @return <p>
     *         The state of the cluster. The possible states are CREATING,
     *         ACTIVE, and FAILED.
     *         </p> @see ClusterState
     */
    public String getState() {
        return state;
    }

    /**
     * 
     <p>
     * The state of the cluster. The possible states are CREATING, ACTIVE, and
     * FAILED.
     * </p> <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, CREATING, UPDATING, DELETING, FAILED
     *
     * @param state <p>
     *            The state of the cluster. The possible states are CREATING,
     *            ACTIVE, and FAILED.
     *            </p> @see ClusterState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * 
     <p>
     * The state of the cluster. The possible states are CREATING, ACTIVE, and
     * FAILED.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, CREATING, UPDATING, DELETING, FAILED
     *
     * @param state <p>
     *            The state of the cluster. The possible states are CREATING,
     *            ACTIVE, and FAILED.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ClusterState
     */
    public ClusterInfo withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 
     <p>
     * The state of the cluster. The possible states are CREATING, ACTIVE, and
     * FAILED.
     * </p> <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, CREATING, UPDATING, DELETING, FAILED
     *
     * @param state <p>
     *            The state of the cluster. The possible states are CREATING,
     *            ACTIVE, and FAILED.
     *            </p> @see ClusterState
     */
    public void setState(ClusterState state) {
        this.state = state.toString();
    }

    /**
     * 
     <p>
     * The state of the cluster. The possible states are CREATING, ACTIVE, and
     * FAILED.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, CREATING, UPDATING, DELETING, FAILED
     *
     * @param state <p>
     *            The state of the cluster. The possible states are CREATING,
     *            ACTIVE, and FAILED.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ClusterState
     */
    public ClusterInfo withState(ClusterState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * Returns the value of the stateInfo property for this object.
     *
     * @return The value of the stateInfo property for this object.
     */
    public StateInfo getStateInfo() {
        return stateInfo;
    }

    /**
     * Sets the value of stateInfo
     *
     * @param stateInfo The new value for the stateInfo property for this
     *            object.
     */
    public void setStateInfo(StateInfo stateInfo) {
        this.stateInfo = stateInfo;
    }

    /**
     * Sets the value of the stateInfo property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stateInfo The new value for the stateInfo property for this
     *            object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterInfo withStateInfo(StateInfo stateInfo) {
        this.stateInfo = stateInfo;
        return this;
    }

    /**
     * 
     <p>
     * Tags attached to the cluster.
     * </p>
     * 
     * @return <p>
     *         Tags attached to the cluster.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * 
     <p>
     * Tags attached to the cluster.
     * </p>
     * 
     * @param tags <p>
     *            Tags attached to the cluster.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * 
     <p>
     * Tags attached to the cluster.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Tags attached to the cluster.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterInfo withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * 
     <p>
     * Tags attached to the cluster.
     * </p> <p>
     * The method adds a new key-value pair into Tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Tags.
     * @param value The corresponding value of the entry to be added into Tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterInfo addTagsEntry(String key, String value) {
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
    public ClusterInfo clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * 
     <p>
     * The connection string to use to connect to the Apache ZooKeeper cluster.
     * </p>
     * 
     * @return <p>
     *         The connection string to use to connect to the Apache ZooKeeper
     *         cluster.
     *         </p>
     */
    public String getZookeeperConnectString() {
        return zookeeperConnectString;
    }

    /**
     * 
     <p>
     * The connection string to use to connect to the Apache ZooKeeper cluster.
     * </p>
     * 
     * @param zookeeperConnectString <p>
     *            The connection string to use to connect to the Apache
     *            ZooKeeper cluster.
     *            </p>
     */
    public void setZookeeperConnectString(String zookeeperConnectString) {
        this.zookeeperConnectString = zookeeperConnectString;
    }

    /**
     * 
     <p>
     * The connection string to use to connect to the Apache ZooKeeper cluster.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param zookeeperConnectString <p>
     *            The connection string to use to connect to the Apache
     *            ZooKeeper cluster.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClusterInfo withZookeeperConnectString(String zookeeperConnectString) {
        this.zookeeperConnectString = zookeeperConnectString;
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
        if (getActiveOperationArn() != null)
            sb.append("ActiveOperationArn: " + getActiveOperationArn() + ",");
        if (getBrokerNodeGroupInfo() != null)
            sb.append("BrokerNodeGroupInfo: " + getBrokerNodeGroupInfo() + ",");
        if (getClientAuthentication() != null)
            sb.append("ClientAuthentication: " + getClientAuthentication() + ",");
        if (getClusterArn() != null)
            sb.append("ClusterArn: " + getClusterArn() + ",");
        if (getClusterName() != null)
            sb.append("ClusterName: " + getClusterName() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getCurrentBrokerSoftwareInfo() != null)
            sb.append("CurrentBrokerSoftwareInfo: " + getCurrentBrokerSoftwareInfo() + ",");
        if (getCurrentVersion() != null)
            sb.append("CurrentVersion: " + getCurrentVersion() + ",");
        if (getEncryptionInfo() != null)
            sb.append("EncryptionInfo: " + getEncryptionInfo() + ",");
        if (getEnhancedMonitoring() != null)
            sb.append("EnhancedMonitoring: " + getEnhancedMonitoring() + ",");
        if (getOpenMonitoring() != null)
            sb.append("OpenMonitoring: " + getOpenMonitoring() + ",");
        if (getLoggingInfo() != null)
            sb.append("LoggingInfo: " + getLoggingInfo() + ",");
        if (getNumberOfBrokerNodes() != null)
            sb.append("NumberOfBrokerNodes: " + getNumberOfBrokerNodes() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getStateInfo() != null)
            sb.append("StateInfo: " + getStateInfo() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getZookeeperConnectString() != null)
            sb.append("ZookeeperConnectString: " + getZookeeperConnectString());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getActiveOperationArn() == null) ? 0 : getActiveOperationArn().hashCode());
        hashCode = prime * hashCode
                + ((getBrokerNodeGroupInfo() == null) ? 0 : getBrokerNodeGroupInfo().hashCode());
        hashCode = prime * hashCode
                + ((getClientAuthentication() == null) ? 0 : getClientAuthentication().hashCode());
        hashCode = prime * hashCode + ((getClusterArn() == null) ? 0 : getClusterArn().hashCode());
        hashCode = prime * hashCode
                + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime
                * hashCode
                + ((getCurrentBrokerSoftwareInfo() == null) ? 0 : getCurrentBrokerSoftwareInfo()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getCurrentVersion() == null) ? 0 : getCurrentVersion().hashCode());
        hashCode = prime * hashCode
                + ((getEncryptionInfo() == null) ? 0 : getEncryptionInfo().hashCode());
        hashCode = prime * hashCode
                + ((getEnhancedMonitoring() == null) ? 0 : getEnhancedMonitoring().hashCode());
        hashCode = prime * hashCode
                + ((getOpenMonitoring() == null) ? 0 : getOpenMonitoring().hashCode());
        hashCode = prime * hashCode
                + ((getLoggingInfo() == null) ? 0 : getLoggingInfo().hashCode());
        hashCode = prime * hashCode
                + ((getNumberOfBrokerNodes() == null) ? 0 : getNumberOfBrokerNodes().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStateInfo() == null) ? 0 : getStateInfo().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime
                * hashCode
                + ((getZookeeperConnectString() == null) ? 0 : getZookeeperConnectString()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClusterInfo == false)
            return false;
        ClusterInfo other = (ClusterInfo) obj;

        if (other.getActiveOperationArn() == null ^ this.getActiveOperationArn() == null)
            return false;
        if (other.getActiveOperationArn() != null
                && other.getActiveOperationArn().equals(this.getActiveOperationArn()) == false)
            return false;
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
        if (other.getClusterArn() == null ^ this.getClusterArn() == null)
            return false;
        if (other.getClusterArn() != null
                && other.getClusterArn().equals(this.getClusterArn()) == false)
            return false;
        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null
                && other.getClusterName().equals(this.getClusterName()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getCurrentBrokerSoftwareInfo() == null
                ^ this.getCurrentBrokerSoftwareInfo() == null)
            return false;
        if (other.getCurrentBrokerSoftwareInfo() != null
                && other.getCurrentBrokerSoftwareInfo().equals(this.getCurrentBrokerSoftwareInfo()) == false)
            return false;
        if (other.getCurrentVersion() == null ^ this.getCurrentVersion() == null)
            return false;
        if (other.getCurrentVersion() != null
                && other.getCurrentVersion().equals(this.getCurrentVersion()) == false)
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
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStateInfo() == null ^ this.getStateInfo() == null)
            return false;
        if (other.getStateInfo() != null
                && other.getStateInfo().equals(this.getStateInfo()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getZookeeperConnectString() == null ^ this.getZookeeperConnectString() == null)
            return false;
        if (other.getZookeeperConnectString() != null
                && other.getZookeeperConnectString().equals(this.getZookeeperConnectString()) == false)
            return false;
        return true;
    }
}
