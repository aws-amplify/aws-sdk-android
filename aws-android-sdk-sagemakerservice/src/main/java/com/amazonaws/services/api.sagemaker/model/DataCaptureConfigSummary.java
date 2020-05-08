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

package com.amazonaws.services.api.sagemaker.model;

import java.io.Serializable;

/**
 * <p/>
 */
public class DataCaptureConfigSummary implements Serializable {
    /**
     * <p/>
     */
    private Boolean enableCapture;

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Started, Stopped
     */
    private String captureStatus;

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     */
    private Integer currentSamplingPercentage;

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 512<br/>
     * <b>Pattern: </b>^(https|s3)://([^/])/?(.*)$<br/>
     */
    private String destinationS3Uri;

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String kmsKeyId;

    /**
     * <p/>
     *
     * @return <p/>
     */
    public Boolean isEnableCapture() {
        return enableCapture;
    }

    /**
     * <p/>
     *
     * @return <p/>
     */
    public Boolean getEnableCapture() {
        return enableCapture;
    }

    /**
     * <p/>
     *
     * @param enableCapture <p/>
     */
    public void setEnableCapture(Boolean enableCapture) {
        this.enableCapture = enableCapture;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enableCapture <p/>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataCaptureConfigSummary withEnableCapture(Boolean enableCapture) {
        this.enableCapture = enableCapture;
        return this;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Started, Stopped
     *
     * @return <p/>
     * @see CaptureStatus
     */
    public String getCaptureStatus() {
        return captureStatus;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Started, Stopped
     *
     * @param captureStatus <p/>
     * @see CaptureStatus
     */
    public void setCaptureStatus(String captureStatus) {
        this.captureStatus = captureStatus;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Started, Stopped
     *
     * @param captureStatus <p/>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CaptureStatus
     */
    public DataCaptureConfigSummary withCaptureStatus(String captureStatus) {
        this.captureStatus = captureStatus;
        return this;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Started, Stopped
     *
     * @param captureStatus <p/>
     * @see CaptureStatus
     */
    public void setCaptureStatus(CaptureStatus captureStatus) {
        this.captureStatus = captureStatus.toString();
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Started, Stopped
     *
     * @param captureStatus <p/>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CaptureStatus
     */
    public DataCaptureConfigSummary withCaptureStatus(CaptureStatus captureStatus) {
        this.captureStatus = captureStatus.toString();
        return this;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @return <p/>
     */
    public Integer getCurrentSamplingPercentage() {
        return currentSamplingPercentage;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param currentSamplingPercentage <p/>
     */
    public void setCurrentSamplingPercentage(Integer currentSamplingPercentage) {
        this.currentSamplingPercentage = currentSamplingPercentage;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param currentSamplingPercentage <p/>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataCaptureConfigSummary withCurrentSamplingPercentage(Integer currentSamplingPercentage) {
        this.currentSamplingPercentage = currentSamplingPercentage;
        return this;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 512<br/>
     * <b>Pattern: </b>^(https|s3)://([^/])/?(.*)$<br/>
     *
     * @return <p/>
     */
    public String getDestinationS3Uri() {
        return destinationS3Uri;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 512<br/>
     * <b>Pattern: </b>^(https|s3)://([^/])/?(.*)$<br/>
     *
     * @param destinationS3Uri <p/>
     */
    public void setDestinationS3Uri(String destinationS3Uri) {
        this.destinationS3Uri = destinationS3Uri;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 512<br/>
     * <b>Pattern: </b>^(https|s3)://([^/])/?(.*)$<br/>
     *
     * @param destinationS3Uri <p/>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataCaptureConfigSummary withDestinationS3Uri(String destinationS3Uri) {
        this.destinationS3Uri = destinationS3Uri;
        return this;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p/>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param kmsKeyId <p/>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param kmsKeyId <p/>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataCaptureConfigSummary withKmsKeyId(String kmsKeyId) {
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
        if (getEnableCapture() != null)
            sb.append("EnableCapture: " + getEnableCapture() + ",");
        if (getCaptureStatus() != null)
            sb.append("CaptureStatus: " + getCaptureStatus() + ",");
        if (getCurrentSamplingPercentage() != null)
            sb.append("CurrentSamplingPercentage: " + getCurrentSamplingPercentage() + ",");
        if (getDestinationS3Uri() != null)
            sb.append("DestinationS3Uri: " + getDestinationS3Uri() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEnableCapture() == null) ? 0 : getEnableCapture().hashCode());
        hashCode = prime * hashCode
                + ((getCaptureStatus() == null) ? 0 : getCaptureStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getCurrentSamplingPercentage() == null) ? 0 : getCurrentSamplingPercentage()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getDestinationS3Uri() == null) ? 0 : getDestinationS3Uri().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataCaptureConfigSummary == false)
            return false;
        DataCaptureConfigSummary other = (DataCaptureConfigSummary) obj;

        if (other.getEnableCapture() == null ^ this.getEnableCapture() == null)
            return false;
        if (other.getEnableCapture() != null
                && other.getEnableCapture().equals(this.getEnableCapture()) == false)
            return false;
        if (other.getCaptureStatus() == null ^ this.getCaptureStatus() == null)
            return false;
        if (other.getCaptureStatus() != null
                && other.getCaptureStatus().equals(this.getCaptureStatus()) == false)
            return false;
        if (other.getCurrentSamplingPercentage() == null
                ^ this.getCurrentSamplingPercentage() == null)
            return false;
        if (other.getCurrentSamplingPercentage() != null
                && other.getCurrentSamplingPercentage().equals(this.getCurrentSamplingPercentage()) == false)
            return false;
        if (other.getDestinationS3Uri() == null ^ this.getDestinationS3Uri() == null)
            return false;
        if (other.getDestinationS3Uri() != null
                && other.getDestinationS3Uri().equals(this.getDestinationS3Uri()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        return true;
    }
}
