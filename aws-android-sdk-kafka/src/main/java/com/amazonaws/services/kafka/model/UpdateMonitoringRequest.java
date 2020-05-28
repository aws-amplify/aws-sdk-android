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
 * Updates the monitoring settings for the cluster. You can use this operation
 * to specify which Apache Kafka metrics you want Amazon MSK to send to Amazon
 * CloudWatch. You can also specify settings for open monitoring with
 * Prometheus.
 * </p>
 */
public class UpdateMonitoringRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The version of the MSK cluster to update. Cluster versions aren't simple
     * numbers. You can describe an MSK cluster to find its version. When this
     * update operation is successful, it generates a new cluster version.
     * </p>
     */
    private String currentVersion;

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
    private OpenMonitoringInfo openMonitoring;

    /**
     * The new value for the loggingInfo property for this object.
     */
    private LoggingInfo loggingInfo;

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
    public UpdateMonitoringRequest withClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
        return this;
    }

    /**
     * 
     <p>
     * The version of the MSK cluster to update. Cluster versions aren't simple
     * numbers. You can describe an MSK cluster to find its version. When this
     * update operation is successful, it generates a new cluster version.
     * </p>
     * 
     * @return <p>
     *         The version of the MSK cluster to update. Cluster versions aren't
     *         simple numbers. You can describe an MSK cluster to find its
     *         version. When this update operation is successful, it generates a
     *         new cluster version.
     *         </p>
     */
    public String getCurrentVersion() {
        return currentVersion;
    }

    /**
     * 
     <p>
     * The version of the MSK cluster to update. Cluster versions aren't simple
     * numbers. You can describe an MSK cluster to find its version. When this
     * update operation is successful, it generates a new cluster version.
     * </p>
     * 
     * @param currentVersion <p>
     *            The version of the MSK cluster to update. Cluster versions
     *            aren't simple numbers. You can describe an MSK cluster to find
     *            its version. When this update operation is successful, it
     *            generates a new cluster version.
     *            </p>
     */
    public void setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
    }

    /**
     * 
     <p>
     * The version of the MSK cluster to update. Cluster versions aren't simple
     * numbers. You can describe an MSK cluster to find its version. When this
     * update operation is successful, it generates a new cluster version.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param currentVersion <p>
     *            The version of the MSK cluster to update. Cluster versions
     *            aren't simple numbers. You can describe an MSK cluster to find
     *            its version. When this update operation is successful, it
     *            generates a new cluster version.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateMonitoringRequest withCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
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
    public UpdateMonitoringRequest withEnhancedMonitoring(String enhancedMonitoring) {
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
    public UpdateMonitoringRequest withEnhancedMonitoring(EnhancedMonitoring enhancedMonitoring) {
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
    public UpdateMonitoringRequest withOpenMonitoring(OpenMonitoringInfo openMonitoring) {
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
    public UpdateMonitoringRequest withLoggingInfo(LoggingInfo loggingInfo) {
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
        if (getClusterArn() != null)
            sb.append("ClusterArn: " + getClusterArn() + ",");
        if (getCurrentVersion() != null)
            sb.append("CurrentVersion: " + getCurrentVersion() + ",");
        if (getEnhancedMonitoring() != null)
            sb.append("EnhancedMonitoring: " + getEnhancedMonitoring() + ",");
        if (getOpenMonitoring() != null)
            sb.append("OpenMonitoring: " + getOpenMonitoring() + ",");
        if (getLoggingInfo() != null)
            sb.append("LoggingInfo: " + getLoggingInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterArn() == null) ? 0 : getClusterArn().hashCode());
        hashCode = prime * hashCode
                + ((getCurrentVersion() == null) ? 0 : getCurrentVersion().hashCode());
        hashCode = prime * hashCode
                + ((getEnhancedMonitoring() == null) ? 0 : getEnhancedMonitoring().hashCode());
        hashCode = prime * hashCode
                + ((getOpenMonitoring() == null) ? 0 : getOpenMonitoring().hashCode());
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

        if (obj instanceof UpdateMonitoringRequest == false)
            return false;
        UpdateMonitoringRequest other = (UpdateMonitoringRequest) obj;

        if (other.getClusterArn() == null ^ this.getClusterArn() == null)
            return false;
        if (other.getClusterArn() != null
                && other.getClusterArn().equals(this.getClusterArn()) == false)
            return false;
        if (other.getCurrentVersion() == null ^ this.getCurrentVersion() == null)
            return false;
        if (other.getCurrentVersion() != null
                && other.getCurrentVersion().equals(this.getCurrentVersion()) == false)
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
        return true;
    }
}
