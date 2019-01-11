/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kinesis.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the output for <a>EnableEnhancedMonitoring</a> and
 * <a>DisableEnhancedMonitoring</a>.
 * </p>
 */
public class EnableEnhancedMonitoringResult implements Serializable {
    /**
     * <p>
     * The name of the Kinesis data stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String streamName;

    /**
     * <p>
     * Represents the current state of the metrics that are in the enhanced
     * state before the operation.
     * </p>
     */
    private java.util.List<String> currentShardLevelMetrics = new java.util.ArrayList<String>();

    /**
     * <p>
     * Represents the list of all the metrics that would be in the enhanced
     * state after the operation.
     * </p>
     */
    private java.util.List<String> desiredShardLevelMetrics = new java.util.ArrayList<String>();

    /**
     * <p>
     * The name of the Kinesis data stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The name of the Kinesis data stream.
     *         </p>
     */
    public String getStreamName() {
        return streamName;
    }

    /**
     * <p>
     * The name of the Kinesis data stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName <p>
     *            The name of the Kinesis data stream.
     *            </p>
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name of the Kinesis data stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName <p>
     *            The name of the Kinesis data stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EnableEnhancedMonitoringResult withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * <p>
     * Represents the current state of the metrics that are in the enhanced
     * state before the operation.
     * </p>
     *
     * @return <p>
     *         Represents the current state of the metrics that are in the
     *         enhanced state before the operation.
     *         </p>
     */
    public java.util.List<String> getCurrentShardLevelMetrics() {
        return currentShardLevelMetrics;
    }

    /**
     * <p>
     * Represents the current state of the metrics that are in the enhanced
     * state before the operation.
     * </p>
     *
     * @param currentShardLevelMetrics <p>
     *            Represents the current state of the metrics that are in the
     *            enhanced state before the operation.
     *            </p>
     */
    public void setCurrentShardLevelMetrics(java.util.Collection<String> currentShardLevelMetrics) {
        if (currentShardLevelMetrics == null) {
            this.currentShardLevelMetrics = null;
            return;
        }

        this.currentShardLevelMetrics = new java.util.ArrayList<String>(currentShardLevelMetrics);
    }

    /**
     * <p>
     * Represents the current state of the metrics that are in the enhanced
     * state before the operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param currentShardLevelMetrics <p>
     *            Represents the current state of the metrics that are in the
     *            enhanced state before the operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EnableEnhancedMonitoringResult withCurrentShardLevelMetrics(
            String... currentShardLevelMetrics) {
        if (getCurrentShardLevelMetrics() == null) {
            this.currentShardLevelMetrics = new java.util.ArrayList<String>(
                    currentShardLevelMetrics.length);
        }
        for (String value : currentShardLevelMetrics) {
            this.currentShardLevelMetrics.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Represents the current state of the metrics that are in the enhanced
     * state before the operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param currentShardLevelMetrics <p>
     *            Represents the current state of the metrics that are in the
     *            enhanced state before the operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EnableEnhancedMonitoringResult withCurrentShardLevelMetrics(
            java.util.Collection<String> currentShardLevelMetrics) {
        setCurrentShardLevelMetrics(currentShardLevelMetrics);
        return this;
    }

    /**
     * <p>
     * Represents the list of all the metrics that would be in the enhanced
     * state after the operation.
     * </p>
     *
     * @return <p>
     *         Represents the list of all the metrics that would be in the
     *         enhanced state after the operation.
     *         </p>
     */
    public java.util.List<String> getDesiredShardLevelMetrics() {
        return desiredShardLevelMetrics;
    }

    /**
     * <p>
     * Represents the list of all the metrics that would be in the enhanced
     * state after the operation.
     * </p>
     *
     * @param desiredShardLevelMetrics <p>
     *            Represents the list of all the metrics that would be in the
     *            enhanced state after the operation.
     *            </p>
     */
    public void setDesiredShardLevelMetrics(java.util.Collection<String> desiredShardLevelMetrics) {
        if (desiredShardLevelMetrics == null) {
            this.desiredShardLevelMetrics = null;
            return;
        }

        this.desiredShardLevelMetrics = new java.util.ArrayList<String>(desiredShardLevelMetrics);
    }

    /**
     * <p>
     * Represents the list of all the metrics that would be in the enhanced
     * state after the operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param desiredShardLevelMetrics <p>
     *            Represents the list of all the metrics that would be in the
     *            enhanced state after the operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EnableEnhancedMonitoringResult withDesiredShardLevelMetrics(
            String... desiredShardLevelMetrics) {
        if (getDesiredShardLevelMetrics() == null) {
            this.desiredShardLevelMetrics = new java.util.ArrayList<String>(
                    desiredShardLevelMetrics.length);
        }
        for (String value : desiredShardLevelMetrics) {
            this.desiredShardLevelMetrics.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Represents the list of all the metrics that would be in the enhanced
     * state after the operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param desiredShardLevelMetrics <p>
     *            Represents the list of all the metrics that would be in the
     *            enhanced state after the operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EnableEnhancedMonitoringResult withDesiredShardLevelMetrics(
            java.util.Collection<String> desiredShardLevelMetrics) {
        setDesiredShardLevelMetrics(desiredShardLevelMetrics);
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
        if (getStreamName() != null)
            sb.append("StreamName: " + getStreamName() + ",");
        if (getCurrentShardLevelMetrics() != null)
            sb.append("CurrentShardLevelMetrics: " + getCurrentShardLevelMetrics() + ",");
        if (getDesiredShardLevelMetrics() != null)
            sb.append("DesiredShardLevelMetrics: " + getDesiredShardLevelMetrics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        hashCode = prime
                * hashCode
                + ((getCurrentShardLevelMetrics() == null) ? 0 : getCurrentShardLevelMetrics()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getDesiredShardLevelMetrics() == null) ? 0 : getDesiredShardLevelMetrics()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnableEnhancedMonitoringResult == false)
            return false;
        EnableEnhancedMonitoringResult other = (EnableEnhancedMonitoringResult) obj;

        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null
                && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        if (other.getCurrentShardLevelMetrics() == null
                ^ this.getCurrentShardLevelMetrics() == null)
            return false;
        if (other.getCurrentShardLevelMetrics() != null
                && other.getCurrentShardLevelMetrics().equals(this.getCurrentShardLevelMetrics()) == false)
            return false;
        if (other.getDesiredShardLevelMetrics() == null
                ^ this.getDesiredShardLevelMetrics() == null)
            return false;
        if (other.getDesiredShardLevelMetrics() != null
                && other.getDesiredShardLevelMetrics().equals(this.getDesiredShardLevelMetrics()) == false)
            return false;
        return true;
    }
}
