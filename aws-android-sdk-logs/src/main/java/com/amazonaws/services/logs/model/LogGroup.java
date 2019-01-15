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

package com.amazonaws.services.logs.model;

import java.io.Serializable;

/**
 * <p>
 * Represents a log group.
 * </p>
 */
public class LogGroup implements Serializable {
    /**
     * <p>
     * The name of the log group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     */
    private String logGroupName;

    /**
     * <p>
     * The creation time of the log group, expressed as the number of
     * milliseconds after Jan 1, 1970 00:00:00 UTC.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long creationTime;

    /**
     * <p>
     * The number of days to retain the log events in the specified log group.
     * Possible values are: 1, 3, 5, 7, 14, 30, 60, 90, 120, 150, 180, 365, 400,
     * 545, 731, 1827, and 3653.
     * </p>
     */
    private Integer retentionInDays;

    /**
     * <p>
     * The number of metric filters.
     * </p>
     */
    private Integer metricFilterCount;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the log group.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The number of bytes stored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long storedBytes;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CMK to use when encrypting log
     * data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     */
    private String kmsKeyId;

    /**
     * <p>
     * The name of the log group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @return <p>
     *         The name of the log group.
     *         </p>
     */
    public String getLogGroupName() {
        return logGroupName;
    }

    /**
     * <p>
     * The name of the log group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @param logGroupName <p>
     *            The name of the log group.
     *            </p>
     */
    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    /**
     * <p>
     * The name of the log group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @param logGroupName <p>
     *            The name of the log group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LogGroup withLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
        return this;
    }

    /**
     * <p>
     * The creation time of the log group, expressed as the number of
     * milliseconds after Jan 1, 1970 00:00:00 UTC.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The creation time of the log group, expressed as the number of
     *         milliseconds after Jan 1, 1970 00:00:00 UTC.
     *         </p>
     */
    public Long getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * The creation time of the log group, expressed as the number of
     * milliseconds after Jan 1, 1970 00:00:00 UTC.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param creationTime <p>
     *            The creation time of the log group, expressed as the number of
     *            milliseconds after Jan 1, 1970 00:00:00 UTC.
     *            </p>
     */
    public void setCreationTime(Long creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The creation time of the log group, expressed as the number of
     * milliseconds after Jan 1, 1970 00:00:00 UTC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param creationTime <p>
     *            The creation time of the log group, expressed as the number of
     *            milliseconds after Jan 1, 1970 00:00:00 UTC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LogGroup withCreationTime(Long creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * The number of days to retain the log events in the specified log group.
     * Possible values are: 1, 3, 5, 7, 14, 30, 60, 90, 120, 150, 180, 365, 400,
     * 545, 731, 1827, and 3653.
     * </p>
     *
     * @return <p>
     *         The number of days to retain the log events in the specified log
     *         group. Possible values are: 1, 3, 5, 7, 14, 30, 60, 90, 120, 150,
     *         180, 365, 400, 545, 731, 1827, and 3653.
     *         </p>
     */
    public Integer getRetentionInDays() {
        return retentionInDays;
    }

    /**
     * <p>
     * The number of days to retain the log events in the specified log group.
     * Possible values are: 1, 3, 5, 7, 14, 30, 60, 90, 120, 150, 180, 365, 400,
     * 545, 731, 1827, and 3653.
     * </p>
     *
     * @param retentionInDays <p>
     *            The number of days to retain the log events in the specified
     *            log group. Possible values are: 1, 3, 5, 7, 14, 30, 60, 90,
     *            120, 150, 180, 365, 400, 545, 731, 1827, and 3653.
     *            </p>
     */
    public void setRetentionInDays(Integer retentionInDays) {
        this.retentionInDays = retentionInDays;
    }

    /**
     * <p>
     * The number of days to retain the log events in the specified log group.
     * Possible values are: 1, 3, 5, 7, 14, 30, 60, 90, 120, 150, 180, 365, 400,
     * 545, 731, 1827, and 3653.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param retentionInDays <p>
     *            The number of days to retain the log events in the specified
     *            log group. Possible values are: 1, 3, 5, 7, 14, 30, 60, 90,
     *            120, 150, 180, 365, 400, 545, 731, 1827, and 3653.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LogGroup withRetentionInDays(Integer retentionInDays) {
        this.retentionInDays = retentionInDays;
        return this;
    }

    /**
     * <p>
     * The number of metric filters.
     * </p>
     *
     * @return <p>
     *         The number of metric filters.
     *         </p>
     */
    public Integer getMetricFilterCount() {
        return metricFilterCount;
    }

    /**
     * <p>
     * The number of metric filters.
     * </p>
     *
     * @param metricFilterCount <p>
     *            The number of metric filters.
     *            </p>
     */
    public void setMetricFilterCount(Integer metricFilterCount) {
        this.metricFilterCount = metricFilterCount;
    }

    /**
     * <p>
     * The number of metric filters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metricFilterCount <p>
     *            The number of metric filters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LogGroup withMetricFilterCount(Integer metricFilterCount) {
        this.metricFilterCount = metricFilterCount;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the log group.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the log group.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the log group.
     * </p>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the log group.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the log group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the log group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LogGroup withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The number of bytes stored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The number of bytes stored.
     *         </p>
     */
    public Long getStoredBytes() {
        return storedBytes;
    }

    /**
     * <p>
     * The number of bytes stored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param storedBytes <p>
     *            The number of bytes stored.
     *            </p>
     */
    public void setStoredBytes(Long storedBytes) {
        this.storedBytes = storedBytes;
    }

    /**
     * <p>
     * The number of bytes stored.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param storedBytes <p>
     *            The number of bytes stored.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LogGroup withStoredBytes(Long storedBytes) {
        this.storedBytes = storedBytes;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CMK to use when encrypting log
     * data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the CMK to use when encrypting
     *         log data.
     *         </p>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CMK to use when encrypting log
     * data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param kmsKeyId <p>
     *            The Amazon Resource Name (ARN) of the CMK to use when
     *            encrypting log data.
     *            </p>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CMK to use when encrypting log
     * data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param kmsKeyId <p>
     *            The Amazon Resource Name (ARN) of the CMK to use when
     *            encrypting log data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LogGroup withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
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
        if (getLogGroupName() != null)
            sb.append("logGroupName: " + getLogGroupName() + ",");
        if (getCreationTime() != null)
            sb.append("creationTime: " + getCreationTime() + ",");
        if (getRetentionInDays() != null)
            sb.append("retentionInDays: " + getRetentionInDays() + ",");
        if (getMetricFilterCount() != null)
            sb.append("metricFilterCount: " + getMetricFilterCount() + ",");
        if (getArn() != null)
            sb.append("arn: " + getArn() + ",");
        if (getStoredBytes() != null)
            sb.append("storedBytes: " + getStoredBytes() + ",");
        if (getKmsKeyId() != null)
            sb.append("kmsKeyId: " + getKmsKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLogGroupName() == null) ? 0 : getLogGroupName().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode
                + ((getRetentionInDays() == null) ? 0 : getRetentionInDays().hashCode());
        hashCode = prime * hashCode
                + ((getMetricFilterCount() == null) ? 0 : getMetricFilterCount().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode
                + ((getStoredBytes() == null) ? 0 : getStoredBytes().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LogGroup == false)
            return false;
        LogGroup other = (LogGroup) obj;

        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null)
            return false;
        if (other.getLogGroupName() != null
                && other.getLogGroupName().equals(this.getLogGroupName()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getRetentionInDays() == null ^ this.getRetentionInDays() == null)
            return false;
        if (other.getRetentionInDays() != null
                && other.getRetentionInDays().equals(this.getRetentionInDays()) == false)
            return false;
        if (other.getMetricFilterCount() == null ^ this.getMetricFilterCount() == null)
            return false;
        if (other.getMetricFilterCount() != null
                && other.getMetricFilterCount().equals(this.getMetricFilterCount()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getStoredBytes() == null ^ this.getStoredBytes() == null)
            return false;
        if (other.getStoredBytes() != null
                && other.getStoredBytes().equals(this.getStoredBytes()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        return true;
    }
}
