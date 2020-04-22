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

package com.amazonaws.services.amazonredshift.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the status of a cluster while it is in the process of resizing with
 * an incremental resize.
 * </p>
 */
public class DataTransferProgress implements Serializable {
    /**
     * <p>
     * Describes the status of the cluster. While the transfer is in progress
     * the status is <code>transferringdata</code>.
     * </p>
     */
    private String status;

    /**
     * <p>
     * Describes the data transfer rate in MB's per second.
     * </p>
     */
    private Double currentRateInMegaBytesPerSecond;

    /**
     * <p>
     * Describes the total amount of data to be transfered in megabytes.
     * </p>
     */
    private Long totalDataInMegaBytes;

    /**
     * <p>
     * Describes the total amount of data that has been transfered in MB's.
     * </p>
     */
    private Long dataTransferredInMegaBytes;

    /**
     * <p>
     * Describes the estimated number of seconds remaining to complete the
     * transfer.
     * </p>
     */
    private Long estimatedTimeToCompletionInSeconds;

    /**
     * <p>
     * Describes the number of seconds that have elapsed during the data
     * transfer.
     * </p>
     */
    private Long elapsedTimeInSeconds;

    /**
     * <p>
     * Describes the status of the cluster. While the transfer is in progress
     * the status is <code>transferringdata</code>.
     * </p>
     *
     * @return <p>
     *         Describes the status of the cluster. While the transfer is in
     *         progress the status is <code>transferringdata</code>.
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * Describes the status of the cluster. While the transfer is in progress
     * the status is <code>transferringdata</code>.
     * </p>
     *
     * @param status <p>
     *            Describes the status of the cluster. While the transfer is in
     *            progress the status is <code>transferringdata</code>.
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Describes the status of the cluster. While the transfer is in progress
     * the status is <code>transferringdata</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            Describes the status of the cluster. While the transfer is in
     *            progress the status is <code>transferringdata</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataTransferProgress withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * Describes the data transfer rate in MB's per second.
     * </p>
     *
     * @return <p>
     *         Describes the data transfer rate in MB's per second.
     *         </p>
     */
    public Double getCurrentRateInMegaBytesPerSecond() {
        return currentRateInMegaBytesPerSecond;
    }

    /**
     * <p>
     * Describes the data transfer rate in MB's per second.
     * </p>
     *
     * @param currentRateInMegaBytesPerSecond <p>
     *            Describes the data transfer rate in MB's per second.
     *            </p>
     */
    public void setCurrentRateInMegaBytesPerSecond(Double currentRateInMegaBytesPerSecond) {
        this.currentRateInMegaBytesPerSecond = currentRateInMegaBytesPerSecond;
    }

    /**
     * <p>
     * Describes the data transfer rate in MB's per second.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param currentRateInMegaBytesPerSecond <p>
     *            Describes the data transfer rate in MB's per second.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataTransferProgress withCurrentRateInMegaBytesPerSecond(
            Double currentRateInMegaBytesPerSecond) {
        this.currentRateInMegaBytesPerSecond = currentRateInMegaBytesPerSecond;
        return this;
    }

    /**
     * <p>
     * Describes the total amount of data to be transfered in megabytes.
     * </p>
     *
     * @return <p>
     *         Describes the total amount of data to be transfered in megabytes.
     *         </p>
     */
    public Long getTotalDataInMegaBytes() {
        return totalDataInMegaBytes;
    }

    /**
     * <p>
     * Describes the total amount of data to be transfered in megabytes.
     * </p>
     *
     * @param totalDataInMegaBytes <p>
     *            Describes the total amount of data to be transfered in
     *            megabytes.
     *            </p>
     */
    public void setTotalDataInMegaBytes(Long totalDataInMegaBytes) {
        this.totalDataInMegaBytes = totalDataInMegaBytes;
    }

    /**
     * <p>
     * Describes the total amount of data to be transfered in megabytes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param totalDataInMegaBytes <p>
     *            Describes the total amount of data to be transfered in
     *            megabytes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataTransferProgress withTotalDataInMegaBytes(Long totalDataInMegaBytes) {
        this.totalDataInMegaBytes = totalDataInMegaBytes;
        return this;
    }

    /**
     * <p>
     * Describes the total amount of data that has been transfered in MB's.
     * </p>
     *
     * @return <p>
     *         Describes the total amount of data that has been transfered in
     *         MB's.
     *         </p>
     */
    public Long getDataTransferredInMegaBytes() {
        return dataTransferredInMegaBytes;
    }

    /**
     * <p>
     * Describes the total amount of data that has been transfered in MB's.
     * </p>
     *
     * @param dataTransferredInMegaBytes <p>
     *            Describes the total amount of data that has been transfered in
     *            MB's.
     *            </p>
     */
    public void setDataTransferredInMegaBytes(Long dataTransferredInMegaBytes) {
        this.dataTransferredInMegaBytes = dataTransferredInMegaBytes;
    }

    /**
     * <p>
     * Describes the total amount of data that has been transfered in MB's.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataTransferredInMegaBytes <p>
     *            Describes the total amount of data that has been transfered in
     *            MB's.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataTransferProgress withDataTransferredInMegaBytes(Long dataTransferredInMegaBytes) {
        this.dataTransferredInMegaBytes = dataTransferredInMegaBytes;
        return this;
    }

    /**
     * <p>
     * Describes the estimated number of seconds remaining to complete the
     * transfer.
     * </p>
     *
     * @return <p>
     *         Describes the estimated number of seconds remaining to complete
     *         the transfer.
     *         </p>
     */
    public Long getEstimatedTimeToCompletionInSeconds() {
        return estimatedTimeToCompletionInSeconds;
    }

    /**
     * <p>
     * Describes the estimated number of seconds remaining to complete the
     * transfer.
     * </p>
     *
     * @param estimatedTimeToCompletionInSeconds <p>
     *            Describes the estimated number of seconds remaining to
     *            complete the transfer.
     *            </p>
     */
    public void setEstimatedTimeToCompletionInSeconds(Long estimatedTimeToCompletionInSeconds) {
        this.estimatedTimeToCompletionInSeconds = estimatedTimeToCompletionInSeconds;
    }

    /**
     * <p>
     * Describes the estimated number of seconds remaining to complete the
     * transfer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param estimatedTimeToCompletionInSeconds <p>
     *            Describes the estimated number of seconds remaining to
     *            complete the transfer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataTransferProgress withEstimatedTimeToCompletionInSeconds(
            Long estimatedTimeToCompletionInSeconds) {
        this.estimatedTimeToCompletionInSeconds = estimatedTimeToCompletionInSeconds;
        return this;
    }

    /**
     * <p>
     * Describes the number of seconds that have elapsed during the data
     * transfer.
     * </p>
     *
     * @return <p>
     *         Describes the number of seconds that have elapsed during the data
     *         transfer.
     *         </p>
     */
    public Long getElapsedTimeInSeconds() {
        return elapsedTimeInSeconds;
    }

    /**
     * <p>
     * Describes the number of seconds that have elapsed during the data
     * transfer.
     * </p>
     *
     * @param elapsedTimeInSeconds <p>
     *            Describes the number of seconds that have elapsed during the
     *            data transfer.
     *            </p>
     */
    public void setElapsedTimeInSeconds(Long elapsedTimeInSeconds) {
        this.elapsedTimeInSeconds = elapsedTimeInSeconds;
    }

    /**
     * <p>
     * Describes the number of seconds that have elapsed during the data
     * transfer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param elapsedTimeInSeconds <p>
     *            Describes the number of seconds that have elapsed during the
     *            data transfer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataTransferProgress withElapsedTimeInSeconds(Long elapsedTimeInSeconds) {
        this.elapsedTimeInSeconds = elapsedTimeInSeconds;
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
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getCurrentRateInMegaBytesPerSecond() != null)
            sb.append("CurrentRateInMegaBytesPerSecond: " + getCurrentRateInMegaBytesPerSecond()
                    + ",");
        if (getTotalDataInMegaBytes() != null)
            sb.append("TotalDataInMegaBytes: " + getTotalDataInMegaBytes() + ",");
        if (getDataTransferredInMegaBytes() != null)
            sb.append("DataTransferredInMegaBytes: " + getDataTransferredInMegaBytes() + ",");
        if (getEstimatedTimeToCompletionInSeconds() != null)
            sb.append("EstimatedTimeToCompletionInSeconds: "
                    + getEstimatedTimeToCompletionInSeconds() + ",");
        if (getElapsedTimeInSeconds() != null)
            sb.append("ElapsedTimeInSeconds: " + getElapsedTimeInSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getCurrentRateInMegaBytesPerSecond() == null) ? 0
                        : getCurrentRateInMegaBytesPerSecond().hashCode());
        hashCode = prime * hashCode
                + ((getTotalDataInMegaBytes() == null) ? 0 : getTotalDataInMegaBytes().hashCode());
        hashCode = prime
                * hashCode
                + ((getDataTransferredInMegaBytes() == null) ? 0 : getDataTransferredInMegaBytes()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getEstimatedTimeToCompletionInSeconds() == null) ? 0
                        : getEstimatedTimeToCompletionInSeconds().hashCode());
        hashCode = prime * hashCode
                + ((getElapsedTimeInSeconds() == null) ? 0 : getElapsedTimeInSeconds().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataTransferProgress == false)
            return false;
        DataTransferProgress other = (DataTransferProgress) obj;

        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCurrentRateInMegaBytesPerSecond() == null
                ^ this.getCurrentRateInMegaBytesPerSecond() == null)
            return false;
        if (other.getCurrentRateInMegaBytesPerSecond() != null
                && other.getCurrentRateInMegaBytesPerSecond().equals(
                        this.getCurrentRateInMegaBytesPerSecond()) == false)
            return false;
        if (other.getTotalDataInMegaBytes() == null ^ this.getTotalDataInMegaBytes() == null)
            return false;
        if (other.getTotalDataInMegaBytes() != null
                && other.getTotalDataInMegaBytes().equals(this.getTotalDataInMegaBytes()) == false)
            return false;
        if (other.getDataTransferredInMegaBytes() == null
                ^ this.getDataTransferredInMegaBytes() == null)
            return false;
        if (other.getDataTransferredInMegaBytes() != null
                && other.getDataTransferredInMegaBytes().equals(
                        this.getDataTransferredInMegaBytes()) == false)
            return false;
        if (other.getEstimatedTimeToCompletionInSeconds() == null
                ^ this.getEstimatedTimeToCompletionInSeconds() == null)
            return false;
        if (other.getEstimatedTimeToCompletionInSeconds() != null
                && other.getEstimatedTimeToCompletionInSeconds().equals(
                        this.getEstimatedTimeToCompletionInSeconds()) == false)
            return false;
        if (other.getElapsedTimeInSeconds() == null ^ this.getElapsedTimeInSeconds() == null)
            return false;
        if (other.getElapsedTimeInSeconds() != null
                && other.getElapsedTimeInSeconds().equals(this.getElapsedTimeInSeconds()) == false)
            return false;
        return true;
    }
}
