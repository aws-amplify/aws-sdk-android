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

package com.amazonaws.services.codebuild.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates a report group.
 * </p>
 */
public class UpdateReportGroupRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ARN of the report group to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String arn;

    /**
     * <p>
     * Used to specify an updated export type. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>S3</code>: The report results are exported to an S3 bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO_EXPORT</code>: The report results are not exported.
     * </p>
     * </li>
     * </ul>
     */
    private ReportExportConfig exportConfig;

    /**
     * <p>
     * The ARN of the report group to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The ARN of the report group to update.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The ARN of the report group to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param arn <p>
     *            The ARN of the report group to update.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the report group to update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param arn <p>
     *            The ARN of the report group to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateReportGroupRequest withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * Used to specify an updated export type. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>S3</code>: The report results are exported to an S3 bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO_EXPORT</code>: The report results are not exported.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Used to specify an updated export type. Valid values are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>S3</code>: The report results are exported to an S3 bucket.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NO_EXPORT</code>: The report results are not exported.
     *         </p>
     *         </li>
     *         </ul>
     */
    public ReportExportConfig getExportConfig() {
        return exportConfig;
    }

    /**
     * <p>
     * Used to specify an updated export type. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>S3</code>: The report results are exported to an S3 bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO_EXPORT</code>: The report results are not exported.
     * </p>
     * </li>
     * </ul>
     *
     * @param exportConfig <p>
     *            Used to specify an updated export type. Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>S3</code>: The report results are exported to an S3
     *            bucket.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NO_EXPORT</code>: The report results are not exported.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setExportConfig(ReportExportConfig exportConfig) {
        this.exportConfig = exportConfig;
    }

    /**
     * <p>
     * Used to specify an updated export type. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>S3</code>: The report results are exported to an S3 bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NO_EXPORT</code>: The report results are not exported.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exportConfig <p>
     *            Used to specify an updated export type. Valid values are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>S3</code>: The report results are exported to an S3
     *            bucket.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NO_EXPORT</code>: The report results are not exported.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateReportGroupRequest withExportConfig(ReportExportConfig exportConfig) {
        this.exportConfig = exportConfig;
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
        if (getArn() != null)
            sb.append("arn: " + getArn() + ",");
        if (getExportConfig() != null)
            sb.append("exportConfig: " + getExportConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode
                + ((getExportConfig() == null) ? 0 : getExportConfig().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateReportGroupRequest == false)
            return false;
        UpdateReportGroupRequest other = (UpdateReportGroupRequest) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getExportConfig() == null ^ this.getExportConfig() == null)
            return false;
        if (other.getExportConfig() != null
                && other.getExportConfig().equals(this.getExportConfig()) == false)
            return false;
        return true;
    }
}
