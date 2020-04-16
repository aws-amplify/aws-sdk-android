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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

/**
 * <p/>
 */
public class DataCaptureConfig implements Serializable {
    /**
     * <p/>
     */
    private Boolean enableCapture;

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     */
    private Integer initialSamplingPercentage;

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
     */
    private java.util.List<CaptureOption> captureOptions;

    /**
     * <p/>
     */
    private CaptureContentTypeHeader captureContentTypeHeader;

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
    public DataCaptureConfig withEnableCapture(Boolean enableCapture) {
        this.enableCapture = enableCapture;
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
    public Integer getInitialSamplingPercentage() {
        return initialSamplingPercentage;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param initialSamplingPercentage <p/>
     */
    public void setInitialSamplingPercentage(Integer initialSamplingPercentage) {
        this.initialSamplingPercentage = initialSamplingPercentage;
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
     * @param initialSamplingPercentage <p/>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataCaptureConfig withInitialSamplingPercentage(Integer initialSamplingPercentage) {
        this.initialSamplingPercentage = initialSamplingPercentage;
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
    public DataCaptureConfig withDestinationS3Uri(String destinationS3Uri) {
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
    public DataCaptureConfig withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * <p/>
     *
     * @return <p/>
     */
    public java.util.List<CaptureOption> getCaptureOptions() {
        return captureOptions;
    }

    /**
     * <p/>
     *
     * @param captureOptions <p/>
     */
    public void setCaptureOptions(java.util.Collection<CaptureOption> captureOptions) {
        if (captureOptions == null) {
            this.captureOptions = null;
            return;
        }

        this.captureOptions = new java.util.ArrayList<CaptureOption>(captureOptions);
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param captureOptions <p/>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataCaptureConfig withCaptureOptions(CaptureOption... captureOptions) {
        if (getCaptureOptions() == null) {
            this.captureOptions = new java.util.ArrayList<CaptureOption>(captureOptions.length);
        }
        for (CaptureOption value : captureOptions) {
            this.captureOptions.add(value);
        }
        return this;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param captureOptions <p/>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataCaptureConfig withCaptureOptions(java.util.Collection<CaptureOption> captureOptions) {
        setCaptureOptions(captureOptions);
        return this;
    }

    /**
     * <p/>
     *
     * @return <p/>
     */
    public CaptureContentTypeHeader getCaptureContentTypeHeader() {
        return captureContentTypeHeader;
    }

    /**
     * <p/>
     *
     * @param captureContentTypeHeader <p/>
     */
    public void setCaptureContentTypeHeader(CaptureContentTypeHeader captureContentTypeHeader) {
        this.captureContentTypeHeader = captureContentTypeHeader;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param captureContentTypeHeader <p/>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DataCaptureConfig withCaptureContentTypeHeader(
            CaptureContentTypeHeader captureContentTypeHeader) {
        this.captureContentTypeHeader = captureContentTypeHeader;
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
        if (getInitialSamplingPercentage() != null)
            sb.append("InitialSamplingPercentage: " + getInitialSamplingPercentage() + ",");
        if (getDestinationS3Uri() != null)
            sb.append("DestinationS3Uri: " + getDestinationS3Uri() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId() + ",");
        if (getCaptureOptions() != null)
            sb.append("CaptureOptions: " + getCaptureOptions() + ",");
        if (getCaptureContentTypeHeader() != null)
            sb.append("CaptureContentTypeHeader: " + getCaptureContentTypeHeader());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEnableCapture() == null) ? 0 : getEnableCapture().hashCode());
        hashCode = prime
                * hashCode
                + ((getInitialSamplingPercentage() == null) ? 0 : getInitialSamplingPercentage()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getDestinationS3Uri() == null) ? 0 : getDestinationS3Uri().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getCaptureOptions() == null) ? 0 : getCaptureOptions().hashCode());
        hashCode = prime
                * hashCode
                + ((getCaptureContentTypeHeader() == null) ? 0 : getCaptureContentTypeHeader()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataCaptureConfig == false)
            return false;
        DataCaptureConfig other = (DataCaptureConfig) obj;

        if (other.getEnableCapture() == null ^ this.getEnableCapture() == null)
            return false;
        if (other.getEnableCapture() != null
                && other.getEnableCapture().equals(this.getEnableCapture()) == false)
            return false;
        if (other.getInitialSamplingPercentage() == null
                ^ this.getInitialSamplingPercentage() == null)
            return false;
        if (other.getInitialSamplingPercentage() != null
                && other.getInitialSamplingPercentage().equals(this.getInitialSamplingPercentage()) == false)
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
        if (other.getCaptureOptions() == null ^ this.getCaptureOptions() == null)
            return false;
        if (other.getCaptureOptions() != null
                && other.getCaptureOptions().equals(this.getCaptureOptions()) == false)
            return false;
        if (other.getCaptureContentTypeHeader() == null
                ^ this.getCaptureContentTypeHeader() == null)
            return false;
        if (other.getCaptureContentTypeHeader() != null
                && other.getCaptureContentTypeHeader().equals(this.getCaptureContentTypeHeader()) == false)
            return false;
        return true;
    }
}
