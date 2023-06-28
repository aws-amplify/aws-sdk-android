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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * An asynchronous API that updates a stream’s existing edge configuration. The
 * Kinesis Video Stream will sync the stream’s edge configuration with the Edge
 * Agent IoT Greengrass component that runs on an IoT Hub Device, setup at your
 * premise. The time to sync can vary and depends on the connectivity of the Hub
 * Device. The <code>SyncStatus</code> will be updated as the edge configuration
 * is acknowledged, and synced with the Edge Agent.
 * </p>
 * <p>
 * If this API is invoked for the first time, a new edge configuration will be
 * created for the stream, and the sync status will be set to
 * <code>SYNCING</code>. You will have to wait for the sync status to reach a
 * terminal state such as: <code>IN_SYNC</code>, or <code>SYNC_FAILED</code>,
 * before using this API again. If you invoke this API during the syncing
 * process, a <code>ResourceInUseException</code> will be thrown. The
 * connectivity of the stream’s edge configuration and the Edge Agent will be
 * retried for 15 minutes. After 15 minutes, the status will transition into the
 * <code>SYNC_FAILED</code> state.
 * </p>
 */
public class StartEdgeConfigurationUpdateRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the stream whose edge configuration you want to update.
     * Specify either the <code>StreamName</code> or the <code>StreamARN</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String streamName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream. Specify either the
     * <code>StreamName</code> or the <code>StreamARN</code>.
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
     * The edge configuration details required to invoke the update process.
     * </p>
     */
    private EdgeConfig edgeConfig;

    /**
     * <p>
     * The name of the stream whose edge configuration you want to update.
     * Specify either the <code>StreamName</code> or the <code>StreamARN</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The name of the stream whose edge configuration you want to
     *         update. Specify either the <code>StreamName</code> or the
     *         <code>StreamARN</code>.
     *         </p>
     */
    public String getStreamName() {
        return streamName;
    }

    /**
     * <p>
     * The name of the stream whose edge configuration you want to update.
     * Specify either the <code>StreamName</code> or the <code>StreamARN</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param streamName <p>
     *            The name of the stream whose edge configuration you want to
     *            update. Specify either the <code>StreamName</code> or the
     *            <code>StreamARN</code>.
     *            </p>
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name of the stream whose edge configuration you want to update.
     * Specify either the <code>StreamName</code> or the <code>StreamARN</code>.
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
     *            The name of the stream whose edge configuration you want to
     *            update. Specify either the <code>StreamName</code> or the
     *            <code>StreamARN</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartEdgeConfigurationUpdateRequest withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream. Specify either the
     * <code>StreamName</code> or the <code>StreamARN</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:[a-z\d-]+:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-
     * Z0-9_.-]+/[0-9]+<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the stream. Specify either the
     *         <code>StreamName</code> or the <code>StreamARN</code>.
     *         </p>
     */
    public String getStreamARN() {
        return streamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream. Specify either the
     * <code>StreamName</code> or the <code>StreamARN</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:[a-z\d-]+:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-
     * Z0-9_.-]+/[0-9]+<br/>
     *
     * @param streamARN <p>
     *            The Amazon Resource Name (ARN) of the stream. Specify either
     *            the <code>StreamName</code> or the <code>StreamARN</code>.
     *            </p>
     */
    public void setStreamARN(String streamARN) {
        this.streamARN = streamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream. Specify either the
     * <code>StreamName</code> or the <code>StreamARN</code>.
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
     *            The Amazon Resource Name (ARN) of the stream. Specify either
     *            the <code>StreamName</code> or the <code>StreamARN</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartEdgeConfigurationUpdateRequest withStreamARN(String streamARN) {
        this.streamARN = streamARN;
        return this;
    }

    /**
     * <p>
     * The edge configuration details required to invoke the update process.
     * </p>
     *
     * @return <p>
     *         The edge configuration details required to invoke the update
     *         process.
     *         </p>
     */
    public EdgeConfig getEdgeConfig() {
        return edgeConfig;
    }

    /**
     * <p>
     * The edge configuration details required to invoke the update process.
     * </p>
     *
     * @param edgeConfig <p>
     *            The edge configuration details required to invoke the update
     *            process.
     *            </p>
     */
    public void setEdgeConfig(EdgeConfig edgeConfig) {
        this.edgeConfig = edgeConfig;
    }

    /**
     * <p>
     * The edge configuration details required to invoke the update process.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param edgeConfig <p>
     *            The edge configuration details required to invoke the update
     *            process.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartEdgeConfigurationUpdateRequest withEdgeConfig(EdgeConfig edgeConfig) {
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
        hashCode = prime * hashCode + ((getEdgeConfig() == null) ? 0 : getEdgeConfig().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartEdgeConfigurationUpdateRequest == false)
            return false;
        StartEdgeConfigurationUpdateRequest other = (StartEdgeConfigurationUpdateRequest) obj;

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
        if (other.getEdgeConfig() == null ^ this.getEdgeConfig() == null)
            return false;
        if (other.getEdgeConfig() != null
                && other.getEdgeConfig().equals(this.getEdgeConfig()) == false)
            return false;
        return true;
    }
}
