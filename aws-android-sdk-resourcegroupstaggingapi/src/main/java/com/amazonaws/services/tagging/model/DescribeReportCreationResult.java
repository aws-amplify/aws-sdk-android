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

package com.amazonaws.services.tagging.model;

import java.io.Serializable;

public class DescribeReportCreationResult implements Serializable {
    /**
     * <p>
     * Reports the status of the operation.
     * </p>
     * <p>
     * The operation status can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RUNNING</code> - Report creation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code> - Report creation is complete. You can open the
     * report from the Amazon S3 bucket that you specified when you ran
     * <code>StartReportCreation</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - Report creation timed out or the Amazon S3 bucket
     * is not accessible.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO REPORT</code> - No report was generated in the last 90 days.
     * </p>
     * </li>
     * </ul>
     */
    private String status;

    /**
     * <p>
     * The path to the Amazon S3 bucket where the report was stored on creation.
     * </p>
     */
    private String s3Location;

    /**
     * <p>
     * Details of the common errors that all operations return.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * Reports the status of the operation.
     * </p>
     * <p>
     * The operation status can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RUNNING</code> - Report creation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code> - Report creation is complete. You can open the
     * report from the Amazon S3 bucket that you specified when you ran
     * <code>StartReportCreation</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - Report creation timed out or the Amazon S3 bucket
     * is not accessible.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO REPORT</code> - No report was generated in the last 90 days.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Reports the status of the operation.
     *         </p>
     *         <p>
     *         The operation status can be one of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>RUNNING</code> - Report creation is in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SUCCEEDED</code> - Report creation is complete. You can
     *         open the report from the Amazon S3 bucket that you specified when
     *         you ran <code>StartReportCreation</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code> - Report creation timed out or the Amazon S3
     *         bucket is not accessible.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NO REPORT</code> - No report was generated in the last 90
     *         days.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * Reports the status of the operation.
     * </p>
     * <p>
     * The operation status can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RUNNING</code> - Report creation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code> - Report creation is complete. You can open the
     * report from the Amazon S3 bucket that you specified when you ran
     * <code>StartReportCreation</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - Report creation timed out or the Amazon S3 bucket
     * is not accessible.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO REPORT</code> - No report was generated in the last 90 days.
     * </p>
     * </li>
     * </ul>
     *
     * @param status <p>
     *            Reports the status of the operation.
     *            </p>
     *            <p>
     *            The operation status can be one of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>RUNNING</code> - Report creation is in progress.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SUCCEEDED</code> - Report creation is complete. You can
     *            open the report from the Amazon S3 bucket that you specified
     *            when you ran <code>StartReportCreation</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FAILED</code> - Report creation timed out or the Amazon
     *            S3 bucket is not accessible.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NO REPORT</code> - No report was generated in the last
     *            90 days.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Reports the status of the operation.
     * </p>
     * <p>
     * The operation status can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RUNNING</code> - Report creation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code> - Report creation is complete. You can open the
     * report from the Amazon S3 bucket that you specified when you ran
     * <code>StartReportCreation</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - Report creation timed out or the Amazon S3 bucket
     * is not accessible.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO REPORT</code> - No report was generated in the last 90 days.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            Reports the status of the operation.
     *            </p>
     *            <p>
     *            The operation status can be one of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>RUNNING</code> - Report creation is in progress.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SUCCEEDED</code> - Report creation is complete. You can
     *            open the report from the Amazon S3 bucket that you specified
     *            when you ran <code>StartReportCreation</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>FAILED</code> - Report creation timed out or the Amazon
     *            S3 bucket is not accessible.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NO REPORT</code> - No report was generated in the last
     *            90 days.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReportCreationResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The path to the Amazon S3 bucket where the report was stored on creation.
     * </p>
     *
     * @return <p>
     *         The path to the Amazon S3 bucket where the report was stored on
     *         creation.
     *         </p>
     */
    public String getS3Location() {
        return s3Location;
    }

    /**
     * <p>
     * The path to the Amazon S3 bucket where the report was stored on creation.
     * </p>
     *
     * @param s3Location <p>
     *            The path to the Amazon S3 bucket where the report was stored
     *            on creation.
     *            </p>
     */
    public void setS3Location(String s3Location) {
        this.s3Location = s3Location;
    }

    /**
     * <p>
     * The path to the Amazon S3 bucket where the report was stored on creation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3Location <p>
     *            The path to the Amazon S3 bucket where the report was stored
     *            on creation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReportCreationResult withS3Location(String s3Location) {
        this.s3Location = s3Location;
        return this;
    }

    /**
     * <p>
     * Details of the common errors that all operations return.
     * </p>
     *
     * @return <p>
     *         Details of the common errors that all operations return.
     *         </p>
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * <p>
     * Details of the common errors that all operations return.
     * </p>
     *
     * @param errorMessage <p>
     *            Details of the common errors that all operations return.
     *            </p>
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * Details of the common errors that all operations return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errorMessage <p>
     *            Details of the common errors that all operations return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReportCreationResult withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
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
        if (getS3Location() != null)
            sb.append("S3Location: " + getS3Location() + ",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: " + getErrorMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getS3Location() == null) ? 0 : getS3Location().hashCode());
        hashCode = prime * hashCode
                + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeReportCreationResult == false)
            return false;
        DescribeReportCreationResult other = (DescribeReportCreationResult) obj;

        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getS3Location() == null ^ this.getS3Location() == null)
            return false;
        if (other.getS3Location() != null
                && other.getS3Location().equals(this.getS3Location()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null
                && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        return true;
    }
}
