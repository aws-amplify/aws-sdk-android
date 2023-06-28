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
 * A description of the stream's edge configuration that will be used to sync
 * with the Edge Agent IoT Greengrass component. The Edge Agent component will
 * run on an IoT Hub Device setup at your premise.
 * </p>
 */
public class EdgeConfig implements Serializable {
    /**
     * <p>
     * The "<b>Internet of Things (IoT) Thing</b>" Arn of the stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>arn:[a-z\d-]+:iot:[a-z0-9-]+:[0-9]+:thing/[a-zA-Z0-9_.-]+
     * <br/>
     */
    private String hubDeviceArn;

    /**
     * <p>
     * The recorder configuration consists of the local
     * <code>MediaSourceConfig</code> details, that are used as credentials to
     * access the local media files streamed on the camera.
     * </p>
     */
    private RecorderConfig recorderConfig;

    /**
     * <p>
     * The uploader configuration contains the <code>ScheduleExpression</code>
     * details that are used to schedule upload jobs for the recorded media
     * files from the Edge Agent to a Kinesis Video Stream.
     * </p>
     */
    private UploaderConfig uploaderConfig;

    /**
     * <p>
     * The deletion configuration is made up of the retention time (
     * <code>EdgeRetentionInHours</code>) and local size configuration (
     * <code>LocalSizeConfig</code>) details that are used to make the deletion.
     * </p>
     */
    private DeletionConfig deletionConfig;

    /**
     * <p>
     * The "<b>Internet of Things (IoT) Thing</b>" Arn of the stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>arn:[a-z\d-]+:iot:[a-z0-9-]+:[0-9]+:thing/[a-zA-Z0-9_.-]+
     * <br/>
     *
     * @return <p>
     *         The "<b>Internet of Things (IoT) Thing</b>" Arn of the stream.
     *         </p>
     */
    public String getHubDeviceArn() {
        return hubDeviceArn;
    }

    /**
     * <p>
     * The "<b>Internet of Things (IoT) Thing</b>" Arn of the stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>arn:[a-z\d-]+:iot:[a-z0-9-]+:[0-9]+:thing/[a-zA-Z0-9_.-]+
     * <br/>
     *
     * @param hubDeviceArn <p>
     *            The "<b>Internet of Things (IoT) Thing</b>" Arn of the stream.
     *            </p>
     */
    public void setHubDeviceArn(String hubDeviceArn) {
        this.hubDeviceArn = hubDeviceArn;
    }

    /**
     * <p>
     * The "<b>Internet of Things (IoT) Thing</b>" Arn of the stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>arn:[a-z\d-]+:iot:[a-z0-9-]+:[0-9]+:thing/[a-zA-Z0-9_.-]+
     * <br/>
     *
     * @param hubDeviceArn <p>
     *            The "<b>Internet of Things (IoT) Thing</b>" Arn of the stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EdgeConfig withHubDeviceArn(String hubDeviceArn) {
        this.hubDeviceArn = hubDeviceArn;
        return this;
    }

    /**
     * <p>
     * The recorder configuration consists of the local
     * <code>MediaSourceConfig</code> details, that are used as credentials to
     * access the local media files streamed on the camera.
     * </p>
     *
     * @return <p>
     *         The recorder configuration consists of the local
     *         <code>MediaSourceConfig</code> details, that are used as
     *         credentials to access the local media files streamed on the
     *         camera.
     *         </p>
     */
    public RecorderConfig getRecorderConfig() {
        return recorderConfig;
    }

    /**
     * <p>
     * The recorder configuration consists of the local
     * <code>MediaSourceConfig</code> details, that are used as credentials to
     * access the local media files streamed on the camera.
     * </p>
     *
     * @param recorderConfig <p>
     *            The recorder configuration consists of the local
     *            <code>MediaSourceConfig</code> details, that are used as
     *            credentials to access the local media files streamed on the
     *            camera.
     *            </p>
     */
    public void setRecorderConfig(RecorderConfig recorderConfig) {
        this.recorderConfig = recorderConfig;
    }

    /**
     * <p>
     * The recorder configuration consists of the local
     * <code>MediaSourceConfig</code> details, that are used as credentials to
     * access the local media files streamed on the camera.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recorderConfig <p>
     *            The recorder configuration consists of the local
     *            <code>MediaSourceConfig</code> details, that are used as
     *            credentials to access the local media files streamed on the
     *            camera.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EdgeConfig withRecorderConfig(RecorderConfig recorderConfig) {
        this.recorderConfig = recorderConfig;
        return this;
    }

    /**
     * <p>
     * The uploader configuration contains the <code>ScheduleExpression</code>
     * details that are used to schedule upload jobs for the recorded media
     * files from the Edge Agent to a Kinesis Video Stream.
     * </p>
     *
     * @return <p>
     *         The uploader configuration contains the
     *         <code>ScheduleExpression</code> details that are used to schedule
     *         upload jobs for the recorded media files from the Edge Agent to a
     *         Kinesis Video Stream.
     *         </p>
     */
    public UploaderConfig getUploaderConfig() {
        return uploaderConfig;
    }

    /**
     * <p>
     * The uploader configuration contains the <code>ScheduleExpression</code>
     * details that are used to schedule upload jobs for the recorded media
     * files from the Edge Agent to a Kinesis Video Stream.
     * </p>
     *
     * @param uploaderConfig <p>
     *            The uploader configuration contains the
     *            <code>ScheduleExpression</code> details that are used to
     *            schedule upload jobs for the recorded media files from the
     *            Edge Agent to a Kinesis Video Stream.
     *            </p>
     */
    public void setUploaderConfig(UploaderConfig uploaderConfig) {
        this.uploaderConfig = uploaderConfig;
    }

    /**
     * <p>
     * The uploader configuration contains the <code>ScheduleExpression</code>
     * details that are used to schedule upload jobs for the recorded media
     * files from the Edge Agent to a Kinesis Video Stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param uploaderConfig <p>
     *            The uploader configuration contains the
     *            <code>ScheduleExpression</code> details that are used to
     *            schedule upload jobs for the recorded media files from the
     *            Edge Agent to a Kinesis Video Stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EdgeConfig withUploaderConfig(UploaderConfig uploaderConfig) {
        this.uploaderConfig = uploaderConfig;
        return this;
    }

    /**
     * <p>
     * The deletion configuration is made up of the retention time (
     * <code>EdgeRetentionInHours</code>) and local size configuration (
     * <code>LocalSizeConfig</code>) details that are used to make the deletion.
     * </p>
     *
     * @return <p>
     *         The deletion configuration is made up of the retention time (
     *         <code>EdgeRetentionInHours</code>) and local size configuration (
     *         <code>LocalSizeConfig</code>) details that are used to make the
     *         deletion.
     *         </p>
     */
    public DeletionConfig getDeletionConfig() {
        return deletionConfig;
    }

    /**
     * <p>
     * The deletion configuration is made up of the retention time (
     * <code>EdgeRetentionInHours</code>) and local size configuration (
     * <code>LocalSizeConfig</code>) details that are used to make the deletion.
     * </p>
     *
     * @param deletionConfig <p>
     *            The deletion configuration is made up of the retention time (
     *            <code>EdgeRetentionInHours</code>) and local size
     *            configuration (<code>LocalSizeConfig</code>) details that are
     *            used to make the deletion.
     *            </p>
     */
    public void setDeletionConfig(DeletionConfig deletionConfig) {
        this.deletionConfig = deletionConfig;
    }

    /**
     * <p>
     * The deletion configuration is made up of the retention time (
     * <code>EdgeRetentionInHours</code>) and local size configuration (
     * <code>LocalSizeConfig</code>) details that are used to make the deletion.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deletionConfig <p>
     *            The deletion configuration is made up of the retention time (
     *            <code>EdgeRetentionInHours</code>) and local size
     *            configuration (<code>LocalSizeConfig</code>) details that are
     *            used to make the deletion.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EdgeConfig withDeletionConfig(DeletionConfig deletionConfig) {
        this.deletionConfig = deletionConfig;
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
        if (getHubDeviceArn() != null)
            sb.append("HubDeviceArn: " + getHubDeviceArn() + ",");
        if (getRecorderConfig() != null)
            sb.append("RecorderConfig: " + getRecorderConfig() + ",");
        if (getUploaderConfig() != null)
            sb.append("UploaderConfig: " + getUploaderConfig() + ",");
        if (getDeletionConfig() != null)
            sb.append("DeletionConfig: " + getDeletionConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getHubDeviceArn() == null) ? 0 : getHubDeviceArn().hashCode());
        hashCode = prime * hashCode
                + ((getRecorderConfig() == null) ? 0 : getRecorderConfig().hashCode());
        hashCode = prime * hashCode
                + ((getUploaderConfig() == null) ? 0 : getUploaderConfig().hashCode());
        hashCode = prime * hashCode
                + ((getDeletionConfig() == null) ? 0 : getDeletionConfig().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EdgeConfig == false)
            return false;
        EdgeConfig other = (EdgeConfig) obj;

        if (other.getHubDeviceArn() == null ^ this.getHubDeviceArn() == null)
            return false;
        if (other.getHubDeviceArn() != null
                && other.getHubDeviceArn().equals(this.getHubDeviceArn()) == false)
            return false;
        if (other.getRecorderConfig() == null ^ this.getRecorderConfig() == null)
            return false;
        if (other.getRecorderConfig() != null
                && other.getRecorderConfig().equals(this.getRecorderConfig()) == false)
            return false;
        if (other.getUploaderConfig() == null ^ this.getUploaderConfig() == null)
            return false;
        if (other.getUploaderConfig() != null
                && other.getUploaderConfig().equals(this.getUploaderConfig()) == false)
            return false;
        if (other.getDeletionConfig() == null ^ this.getDeletionConfig() == null)
            return false;
        if (other.getDeletionConfig() != null
                && other.getDeletionConfig().equals(this.getDeletionConfig()) == false)
            return false;
        return true;
    }
}
