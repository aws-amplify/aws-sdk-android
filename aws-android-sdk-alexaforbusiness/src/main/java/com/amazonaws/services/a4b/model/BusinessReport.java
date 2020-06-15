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

package com.amazonaws.services.a4b.model;

import java.io.Serializable;

/**
 * <p>
 * Usage report with specified parameters.
 * </p>
 */
public class BusinessReport implements Serializable {
    /**
     * <p>
     * The status of the report generation execution (RUNNING, SUCCEEDED, or
     * FAILED).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUNNING, SUCCEEDED, FAILED
     */
    private String status;

    /**
     * <p>
     * The failure code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCESS_DENIED, NO_SUCH_BUCKET, INTERNAL_FAILURE
     */
    private String failureCode;

    /**
     * <p>
     * The S3 location of the output reports.
     * </p>
     */
    private BusinessReportS3Location s3Location;

    /**
     * <p>
     * The time of report delivery.
     * </p>
     */
    private java.util.Date deliveryTime;

    /**
     * <p>
     * The download link where a user can download the report.
     * </p>
     */
    private String downloadUrl;

    /**
     * <p>
     * The status of the report generation execution (RUNNING, SUCCEEDED, or
     * FAILED).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUNNING, SUCCEEDED, FAILED
     *
     * @return <p>
     *         The status of the report generation execution (RUNNING,
     *         SUCCEEDED, or FAILED).
     *         </p>
     * @see BusinessReportStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the report generation execution (RUNNING, SUCCEEDED, or
     * FAILED).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUNNING, SUCCEEDED, FAILED
     *
     * @param status <p>
     *            The status of the report generation execution (RUNNING,
     *            SUCCEEDED, or FAILED).
     *            </p>
     * @see BusinessReportStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the report generation execution (RUNNING, SUCCEEDED, or
     * FAILED).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUNNING, SUCCEEDED, FAILED
     *
     * @param status <p>
     *            The status of the report generation execution (RUNNING,
     *            SUCCEEDED, or FAILED).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BusinessReportStatus
     */
    public BusinessReport withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the report generation execution (RUNNING, SUCCEEDED, or
     * FAILED).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUNNING, SUCCEEDED, FAILED
     *
     * @param status <p>
     *            The status of the report generation execution (RUNNING,
     *            SUCCEEDED, or FAILED).
     *            </p>
     * @see BusinessReportStatus
     */
    public void setStatus(BusinessReportStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the report generation execution (RUNNING, SUCCEEDED, or
     * FAILED).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RUNNING, SUCCEEDED, FAILED
     *
     * @param status <p>
     *            The status of the report generation execution (RUNNING,
     *            SUCCEEDED, or FAILED).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BusinessReportStatus
     */
    public BusinessReport withStatus(BusinessReportStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The failure code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCESS_DENIED, NO_SUCH_BUCKET, INTERNAL_FAILURE
     *
     * @return <p>
     *         The failure code.
     *         </p>
     * @see BusinessReportFailureCode
     */
    public String getFailureCode() {
        return failureCode;
    }

    /**
     * <p>
     * The failure code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCESS_DENIED, NO_SUCH_BUCKET, INTERNAL_FAILURE
     *
     * @param failureCode <p>
     *            The failure code.
     *            </p>
     * @see BusinessReportFailureCode
     */
    public void setFailureCode(String failureCode) {
        this.failureCode = failureCode;
    }

    /**
     * <p>
     * The failure code.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCESS_DENIED, NO_SUCH_BUCKET, INTERNAL_FAILURE
     *
     * @param failureCode <p>
     *            The failure code.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BusinessReportFailureCode
     */
    public BusinessReport withFailureCode(String failureCode) {
        this.failureCode = failureCode;
        return this;
    }

    /**
     * <p>
     * The failure code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCESS_DENIED, NO_SUCH_BUCKET, INTERNAL_FAILURE
     *
     * @param failureCode <p>
     *            The failure code.
     *            </p>
     * @see BusinessReportFailureCode
     */
    public void setFailureCode(BusinessReportFailureCode failureCode) {
        this.failureCode = failureCode.toString();
    }

    /**
     * <p>
     * The failure code.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCESS_DENIED, NO_SUCH_BUCKET, INTERNAL_FAILURE
     *
     * @param failureCode <p>
     *            The failure code.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BusinessReportFailureCode
     */
    public BusinessReport withFailureCode(BusinessReportFailureCode failureCode) {
        this.failureCode = failureCode.toString();
        return this;
    }

    /**
     * <p>
     * The S3 location of the output reports.
     * </p>
     *
     * @return <p>
     *         The S3 location of the output reports.
     *         </p>
     */
    public BusinessReportS3Location getS3Location() {
        return s3Location;
    }

    /**
     * <p>
     * The S3 location of the output reports.
     * </p>
     *
     * @param s3Location <p>
     *            The S3 location of the output reports.
     *            </p>
     */
    public void setS3Location(BusinessReportS3Location s3Location) {
        this.s3Location = s3Location;
    }

    /**
     * <p>
     * The S3 location of the output reports.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3Location <p>
     *            The S3 location of the output reports.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BusinessReport withS3Location(BusinessReportS3Location s3Location) {
        this.s3Location = s3Location;
        return this;
    }

    /**
     * <p>
     * The time of report delivery.
     * </p>
     *
     * @return <p>
     *         The time of report delivery.
     *         </p>
     */
    public java.util.Date getDeliveryTime() {
        return deliveryTime;
    }

    /**
     * <p>
     * The time of report delivery.
     * </p>
     *
     * @param deliveryTime <p>
     *            The time of report delivery.
     *            </p>
     */
    public void setDeliveryTime(java.util.Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    /**
     * <p>
     * The time of report delivery.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deliveryTime <p>
     *            The time of report delivery.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BusinessReport withDeliveryTime(java.util.Date deliveryTime) {
        this.deliveryTime = deliveryTime;
        return this;
    }

    /**
     * <p>
     * The download link where a user can download the report.
     * </p>
     *
     * @return <p>
     *         The download link where a user can download the report.
     *         </p>
     */
    public String getDownloadUrl() {
        return downloadUrl;
    }

    /**
     * <p>
     * The download link where a user can download the report.
     * </p>
     *
     * @param downloadUrl <p>
     *            The download link where a user can download the report.
     *            </p>
     */
    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    /**
     * <p>
     * The download link where a user can download the report.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param downloadUrl <p>
     *            The download link where a user can download the report.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BusinessReport withDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
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
        if (getFailureCode() != null)
            sb.append("FailureCode: " + getFailureCode() + ",");
        if (getS3Location() != null)
            sb.append("S3Location: " + getS3Location() + ",");
        if (getDeliveryTime() != null)
            sb.append("DeliveryTime: " + getDeliveryTime() + ",");
        if (getDownloadUrl() != null)
            sb.append("DownloadUrl: " + getDownloadUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getFailureCode() == null) ? 0 : getFailureCode().hashCode());
        hashCode = prime * hashCode + ((getS3Location() == null) ? 0 : getS3Location().hashCode());
        hashCode = prime * hashCode
                + ((getDeliveryTime() == null) ? 0 : getDeliveryTime().hashCode());
        hashCode = prime * hashCode
                + ((getDownloadUrl() == null) ? 0 : getDownloadUrl().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BusinessReport == false)
            return false;
        BusinessReport other = (BusinessReport) obj;

        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getFailureCode() == null ^ this.getFailureCode() == null)
            return false;
        if (other.getFailureCode() != null
                && other.getFailureCode().equals(this.getFailureCode()) == false)
            return false;
        if (other.getS3Location() == null ^ this.getS3Location() == null)
            return false;
        if (other.getS3Location() != null
                && other.getS3Location().equals(this.getS3Location()) == false)
            return false;
        if (other.getDeliveryTime() == null ^ this.getDeliveryTime() == null)
            return false;
        if (other.getDeliveryTime() != null
                && other.getDeliveryTime().equals(this.getDeliveryTime()) == false)
            return false;
        if (other.getDownloadUrl() == null ^ this.getDownloadUrl() == null)
            return false;
        if (other.getDownloadUrl() != null
                && other.getDownloadUrl().equals(this.getDownloadUrl()) == false)
            return false;
        return true;
    }
}
