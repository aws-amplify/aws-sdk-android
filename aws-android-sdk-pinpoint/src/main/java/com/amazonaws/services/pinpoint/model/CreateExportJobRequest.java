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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates an export job for an application.
 * </p>
 */
public class CreateExportJobRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique identifier for the application. This identifier is displayed
     * as the <b>Project ID</b> on the Amazon Pinpoint console.
     * </p>
     */
    private String applicationId;

    /**
     * <p>
     * Specifies the settings for a job that exports endpoint definitions to an
     * Amazon Simple Storage Service (Amazon S3) bucket.
     * </p>
     */
    private ExportJobRequest exportJobRequest;

    /**
     * <p>
     * The unique identifier for the application. This identifier is displayed
     * as the <b>Project ID</b> on the Amazon Pinpoint console.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the application. This identifier is
     *         displayed as the <b>Project ID</b> on the Amazon Pinpoint
     *         console.
     *         </p>
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application. This identifier is displayed
     * as the <b>Project ID</b> on the Amazon Pinpoint console.
     * </p>
     *
     * @param applicationId <p>
     *            The unique identifier for the application. This identifier is
     *            displayed as the <b>Project ID</b> on the Amazon Pinpoint
     *            console.
     *            </p>
     */
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application. This identifier is displayed
     * as the <b>Project ID</b> on the Amazon Pinpoint console.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applicationId <p>
     *            The unique identifier for the application. This identifier is
     *            displayed as the <b>Project ID</b> on the Amazon Pinpoint
     *            console.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateExportJobRequest withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * <p>
     * Specifies the settings for a job that exports endpoint definitions to an
     * Amazon Simple Storage Service (Amazon S3) bucket.
     * </p>
     *
     * @return <p>
     *         Specifies the settings for a job that exports endpoint
     *         definitions to an Amazon Simple Storage Service (Amazon S3)
     *         bucket.
     *         </p>
     */
    public ExportJobRequest getExportJobRequest() {
        return exportJobRequest;
    }

    /**
     * <p>
     * Specifies the settings for a job that exports endpoint definitions to an
     * Amazon Simple Storage Service (Amazon S3) bucket.
     * </p>
     *
     * @param exportJobRequest <p>
     *            Specifies the settings for a job that exports endpoint
     *            definitions to an Amazon Simple Storage Service (Amazon S3)
     *            bucket.
     *            </p>
     */
    public void setExportJobRequest(ExportJobRequest exportJobRequest) {
        this.exportJobRequest = exportJobRequest;
    }

    /**
     * <p>
     * Specifies the settings for a job that exports endpoint definitions to an
     * Amazon Simple Storage Service (Amazon S3) bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exportJobRequest <p>
     *            Specifies the settings for a job that exports endpoint
     *            definitions to an Amazon Simple Storage Service (Amazon S3)
     *            bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateExportJobRequest withExportJobRequest(ExportJobRequest exportJobRequest) {
        this.exportJobRequest = exportJobRequest;
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: " + getApplicationId() + ",");
        if (getExportJobRequest() != null)
            sb.append("ExportJobRequest: " + getExportJobRequest());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode
                + ((getExportJobRequest() == null) ? 0 : getExportJobRequest().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateExportJobRequest == false)
            return false;
        CreateExportJobRequest other = (CreateExportJobRequest) obj;

        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null
                && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getExportJobRequest() == null ^ this.getExportJobRequest() == null)
            return false;
        if (other.getExportJobRequest() != null
                && other.getExportJobRequest().equals(this.getExportJobRequest()) == false)
            return false;
        return true;
    }
}
