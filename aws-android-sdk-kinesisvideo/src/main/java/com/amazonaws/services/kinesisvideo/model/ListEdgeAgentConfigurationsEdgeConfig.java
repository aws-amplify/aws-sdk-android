/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;

/**
 * <p>
 * A description of a single stream's edge configuration.
 * </p>
 */
public class ListEdgeAgentConfigurationsEdgeConfig implements Serializable {
    /**
     * <p>
     * The name of the stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String streamName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:[a-z\d-]+:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-
     * Z0-9_.-]+/[0-9]+<br/>
     */
    private String streamARN;

    /**
     * <p>
     * The timestamp when the stream first created the edge config.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The timestamp when the stream last updated the edge config.
     * </p>
     */
    private java.util.Date lastUpdatedTime;

    /**
     * <p>
     * The current sync status of the stream's edge configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SYNCING, ACKNOWLEDGED, IN_SYNC, SYNC_FAILED,
     * DELETING, DELETE_FAILED, DELETING_ACKNOWLEDGED
     */
    private String syncStatus;

    /**
     * <p>
     * A description of the generated failure status.
     * </p>
     */
    private String failedStatusDetails;

    /**
     * <p>
     * A description of the stream's edge configuration that will be used to
     * sync with the Edge Agent IoT Greengrass component. The Edge Agent
     * component will run on an IoT Hub Device setup at your premise.
     * </p>
     */
    private EdgeConfig edgeConfig;

    /**
     * <p>
     * The name of the stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The name of the stream.
     *         </p>
     */
    public String getStreamName() {
        return streamName;
    }

    /**
     * <p>
     * The name of the stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName <p>
     *            The name of the stream.
     *            </p>
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name of the stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName <p>
     *            The name of the stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListEdgeAgentConfigurationsEdgeConfig withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:[a-z\d-]+:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-
     * Z0-9_.-]+/[0-9]+<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the stream.
     *         </p>
     */
    public String getStreamARN() {
        return streamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:[a-z\d-]+:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-
     * Z0-9_.-]+/[0-9]+<br/>
     *
     * @param streamARN <p>
     *            The Amazon Resource Name (ARN) of the stream.
     *            </p>
     */
    public void setStreamARN(String streamARN) {
        this.streamARN = streamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:[a-z\d-]+:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-
     * Z0-9_.-]+/[0-9]+<br/>
     *
     * @param streamARN <p>
     *            The Amazon Resource Name (ARN) of the stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListEdgeAgentConfigurationsEdgeConfig withStreamARN(String streamARN) {
        this.streamARN = streamARN;
        return this;
    }

    /**
     * <p>
     * The timestamp when the stream first created the edge config.
     * </p>
     *
     * @return <p>
     *         The timestamp when the stream first created the edge config.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * The timestamp when the stream first created the edge config.
     * </p>
     *
     * @param creationTime <p>
     *            The timestamp when the stream first created the edge config.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The timestamp when the stream first created the edge config.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            The timestamp when the stream first created the edge config.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListEdgeAgentConfigurationsEdgeConfig withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * The timestamp when the stream last updated the edge config.
     * </p>
     *
     * @return <p>
     *         The timestamp when the stream last updated the edge config.
     *         </p>
     */
    public java.util.Date getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    /**
     * <p>
     * The timestamp when the stream last updated the edge config.
     * </p>
     *
     * @param lastUpdatedTime <p>
     *            The timestamp when the stream last updated the edge config.
     *            </p>
     */
    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The timestamp when the stream last updated the edge config.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdatedTime <p>
     *            The timestamp when the stream last updated the edge config.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListEdgeAgentConfigurationsEdgeConfig withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
        return this;
    }

    /**
     * <p>
     * The current sync status of the stream's edge configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SYNCING, ACKNOWLEDGED, IN_SYNC, SYNC_FAILED,
     * DELETING, DELETE_FAILED, DELETING_ACKNOWLEDGED
     *
     * @return <p>
     *         The current sync status of the stream's edge configuration.
     *         </p>
     * @see SyncStatus
     */
    public String getSyncStatus() {
        return syncStatus;
    }

    /**
     * <p>
     * The current sync status of the stream's edge configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SYNCING, ACKNOWLEDGED, IN_SYNC, SYNC_FAILED,
     * DELETING, DELETE_FAILED, DELETING_ACKNOWLEDGED
     *
     * @param syncStatus <p>
     *            The current sync status of the stream's edge configuration.
     *            </p>
     * @see SyncStatus
     */
    public void setSyncStatus(String syncStatus) {
        this.syncStatus = syncStatus;
    }

    /**
     * <p>
     * The current sync status of the stream's edge configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SYNCING, ACKNOWLEDGED, IN_SYNC, SYNC_FAILED,
     * DELETING, DELETE_FAILED, DELETING_ACKNOWLEDGED
     *
     * @param syncStatus <p>
     *            The current sync status of the stream's edge configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SyncStatus
     */
    public ListEdgeAgentConfigurationsEdgeConfig withSyncStatus(String syncStatus) {
        this.syncStatus = syncStatus;
        return this;
    }

    /**
     * <p>
     * The current sync status of the stream's edge configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SYNCING, ACKNOWLEDGED, IN_SYNC, SYNC_FAILED,
     * DELETING, DELETE_FAILED, DELETING_ACKNOWLEDGED
     *
     * @param syncStatus <p>
     *            The current sync status of the stream's edge configuration.
     *            </p>
     * @see SyncStatus
     */
    public void setSyncStatus(SyncStatus syncStatus) {
        this.syncStatus = syncStatus.toString();
    }

    /**
     * <p>
     * The current sync status of the stream's edge configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SYNCING, ACKNOWLEDGED, IN_SYNC, SYNC_FAILED,
     * DELETING, DELETE_FAILED, DELETING_ACKNOWLEDGED
     *
     * @param syncStatus <p>
     *            The current sync status of the stream's edge configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SyncStatus
     */
    public ListEdgeAgentConfigurationsEdgeConfig withSyncStatus(SyncStatus syncStatus) {
        this.syncStatus = syncStatus.toString();
        return this;
    }

    /**
     * <p>
     * A description of the generated failure status.
     * </p>
     *
     * @return <p>
     *         A description of the generated failure status.
     *         </p>
     */
    public String getFailedStatusDetails() {
        return failedStatusDetails;
    }

    /**
     * <p>
     * A description of the generated failure status.
     * </p>
     *
     * @param failedStatusDetails <p>
     *            A description of the generated failure status.
     *            </p>
     */
    public void setFailedStatusDetails(String failedStatusDetails) {
        this.failedStatusDetails = failedStatusDetails;
    }

    /**
     * <p>
     * A description of the generated failure status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failedStatusDetails <p>
     *            A description of the generated failure status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListEdgeAgentConfigurationsEdgeConfig withFailedStatusDetails(String failedStatusDetails) {
        this.failedStatusDetails = failedStatusDetails;
        return this;
    }

    /**
     * <p>
     * A description of the stream's edge configuration that will be used to
     * sync with the Edge Agent IoT Greengrass component. The Edge Agent
     * component will run on an IoT Hub Device setup at your premise.
     * </p>
     *
     * @return <p>
     *         A description of the stream's edge configuration that will be
     *         used to sync with the Edge Agent IoT Greengrass component. The
     *         Edge Agent component will run on an IoT Hub Device setup at your
     *         premise.
     *         </p>
     */
    public EdgeConfig getEdgeConfig() {
        return edgeConfig;
    }

    /**
     * <p>
     * A description of the stream's edge configuration that will be used to
     * sync with the Edge Agent IoT Greengrass component. The Edge Agent
     * component will run on an IoT Hub Device setup at your premise.
     * </p>
     *
     * @param edgeConfig <p>
     *            A description of the stream's edge configuration that will be
     *            used to sync with the Edge Agent IoT Greengrass component. The
     *            Edge Agent component will run on an IoT Hub Device setup at
     *            your premise.
     *            </p>
     */
    public void setEdgeConfig(EdgeConfig edgeConfig) {
        this.edgeConfig = edgeConfig;
    }

    /**
     * <p>
     * A description of the stream's edge configuration that will be used to
     * sync with the Edge Agent IoT Greengrass component. The Edge Agent
     * component will run on an IoT Hub Device setup at your premise.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param edgeConfig <p>
     *            A description of the stream's edge configuration that will be
     *            used to sync with the Edge Agent IoT Greengrass component. The
     *            Edge Agent component will run on an IoT Hub Device setup at
     *            your premise.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListEdgeAgentConfigurationsEdgeConfig withEdgeConfig(EdgeConfig edgeConfig) {
        this.edgeConfig = edgeConfig;
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
        if (getStreamARN() != null)
            sb.append("StreamARN: " + getStreamARN() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: " + getLastUpdatedTime() + ",");
        if (getSyncStatus() != null)
            sb.append("SyncStatus: " + getSyncStatus() + ",");
        if (getFailedStatusDetails() != null)
            sb.append("FailedStatusDetails: " + getFailedStatusDetails() + ",");
        if (getEdgeConfig() != null)
            sb.append("EdgeConfig: " + getEdgeConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        hashCode = prime * hashCode + ((getStreamARN() == null) ? 0 : getStreamARN().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getSyncStatus() == null) ? 0 : getSyncStatus().hashCode());
        hashCode = prime * hashCode
                + ((getFailedStatusDetails() == null) ? 0 : getFailedStatusDetails().hashCode());
        hashCode = prime * hashCode + ((getEdgeConfig() == null) ? 0 : getEdgeConfig().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListEdgeAgentConfigurationsEdgeConfig == false)
            return false;
        ListEdgeAgentConfigurationsEdgeConfig other = (ListEdgeAgentConfigurationsEdgeConfig) obj;

        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null
                && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        if (other.getStreamARN() == null ^ this.getStreamARN() == null)
            return false;
        if (other.getStreamARN() != null
                && other.getStreamARN().equals(this.getStreamARN()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null
                && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getSyncStatus() == null ^ this.getSyncStatus() == null)
            return false;
        if (other.getSyncStatus() != null
                && other.getSyncStatus().equals(this.getSyncStatus()) == false)
            return false;
        if (other.getFailedStatusDetails() == null ^ this.getFailedStatusDetails() == null)
            return false;
        if (other.getFailedStatusDetails() != null
                && other.getFailedStatusDetails().equals(this.getFailedStatusDetails()) == false)
            return false;
        if (other.getEdgeConfig() == null ^ this.getEdgeConfig() == null)
            return false;
        if (other.getEdgeConfig() != null
                && other.getEdgeConfig().equals(this.getEdgeConfig()) == false)
            return false;
        return true;
    }
}
