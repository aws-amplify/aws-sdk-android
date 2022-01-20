/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * Configuration information of a Kinesis video stream.
 * </p>
 */
public class KinesisVideoStreamConfig implements Serializable {
    /**
     * <p>
     * The prefix of the video stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String prefix;

    /**
     * <p>
     * The number of hours data is retained in the stream. Kinesis Video Streams
     * retains the data in a data store that is associated with the stream.
     * </p>
     * <p>
     * The default value is 0, indicating that the stream does not persist data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 87600<br/>
     */
    private Integer retentionPeriodHours;

    /**
     * <p>
     * The encryption configuration.
     * </p>
     */
    private EncryptionConfig encryptionConfig;

    /**
     * <p>
     * The prefix of the video stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         The prefix of the video stream.
     *         </p>
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * <p>
     * The prefix of the video stream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param prefix <p>
     *            The prefix of the video stream.
     *            </p>
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * The prefix of the video stream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param prefix <p>
     *            The prefix of the video stream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KinesisVideoStreamConfig withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * <p>
     * The number of hours data is retained in the stream. Kinesis Video Streams
     * retains the data in a data store that is associated with the stream.
     * </p>
     * <p>
     * The default value is 0, indicating that the stream does not persist data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 87600<br/>
     *
     * @return <p>
     *         The number of hours data is retained in the stream. Kinesis Video
     *         Streams retains the data in a data store that is associated with
     *         the stream.
     *         </p>
     *         <p>
     *         The default value is 0, indicating that the stream does not
     *         persist data.
     *         </p>
     */
    public Integer getRetentionPeriodHours() {
        return retentionPeriodHours;
    }

    /**
     * <p>
     * The number of hours data is retained in the stream. Kinesis Video Streams
     * retains the data in a data store that is associated with the stream.
     * </p>
     * <p>
     * The default value is 0, indicating that the stream does not persist data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 87600<br/>
     *
     * @param retentionPeriodHours <p>
     *            The number of hours data is retained in the stream. Kinesis
     *            Video Streams retains the data in a data store that is
     *            associated with the stream.
     *            </p>
     *            <p>
     *            The default value is 0, indicating that the stream does not
     *            persist data.
     *            </p>
     */
    public void setRetentionPeriodHours(Integer retentionPeriodHours) {
        this.retentionPeriodHours = retentionPeriodHours;
    }

    /**
     * <p>
     * The number of hours data is retained in the stream. Kinesis Video Streams
     * retains the data in a data store that is associated with the stream.
     * </p>
     * <p>
     * The default value is 0, indicating that the stream does not persist data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 87600<br/>
     *
     * @param retentionPeriodHours <p>
     *            The number of hours data is retained in the stream. Kinesis
     *            Video Streams retains the data in a data store that is
     *            associated with the stream.
     *            </p>
     *            <p>
     *            The default value is 0, indicating that the stream does not
     *            persist data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KinesisVideoStreamConfig withRetentionPeriodHours(Integer retentionPeriodHours) {
        this.retentionPeriodHours = retentionPeriodHours;
        return this;
    }

    /**
     * <p>
     * The encryption configuration.
     * </p>
     *
     * @return <p>
     *         The encryption configuration.
     *         </p>
     */
    public EncryptionConfig getEncryptionConfig() {
        return encryptionConfig;
    }

    /**
     * <p>
     * The encryption configuration.
     * </p>
     *
     * @param encryptionConfig <p>
     *            The encryption configuration.
     *            </p>
     */
    public void setEncryptionConfig(EncryptionConfig encryptionConfig) {
        this.encryptionConfig = encryptionConfig;
    }

    /**
     * <p>
     * The encryption configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encryptionConfig <p>
     *            The encryption configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KinesisVideoStreamConfig withEncryptionConfig(EncryptionConfig encryptionConfig) {
        this.encryptionConfig = encryptionConfig;
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
        if (getPrefix() != null)
            sb.append("Prefix: " + getPrefix() + ",");
        if (getRetentionPeriodHours() != null)
            sb.append("RetentionPeriodHours: " + getRetentionPeriodHours() + ",");
        if (getEncryptionConfig() != null)
            sb.append("EncryptionConfig: " + getEncryptionConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        hashCode = prime * hashCode
                + ((getRetentionPeriodHours() == null) ? 0 : getRetentionPeriodHours().hashCode());
        hashCode = prime * hashCode
                + ((getEncryptionConfig() == null) ? 0 : getEncryptionConfig().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KinesisVideoStreamConfig == false)
            return false;
        KinesisVideoStreamConfig other = (KinesisVideoStreamConfig) obj;

        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        if (other.getRetentionPeriodHours() == null ^ this.getRetentionPeriodHours() == null)
            return false;
        if (other.getRetentionPeriodHours() != null
                && other.getRetentionPeriodHours().equals(this.getRetentionPeriodHours()) == false)
            return false;
        if (other.getEncryptionConfig() == null ^ this.getEncryptionConfig() == null)
            return false;
        if (other.getEncryptionConfig() != null
                && other.getEncryptionConfig().equals(this.getEncryptionConfig()) == false)
            return false;
        return true;
    }
}
