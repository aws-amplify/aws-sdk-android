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
 * Creates an import job for an application.
 * </p>
 */
public class CreateImportJobRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique identifier for the application. This identifier is displayed
     * as the <b>Project ID</b> on the Amazon Pinpoint console.
     * </p>
     */
    private String applicationId;

    /**
     * <p>
     * Specifies the settings for a job that imports endpoint definitions from
     * an Amazon Simple Storage Service (Amazon S3) bucket.
     * </p>
     */
    private ImportJobRequest importJobRequest;

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
    public CreateImportJobRequest withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * <p>
     * Specifies the settings for a job that imports endpoint definitions from
     * an Amazon Simple Storage Service (Amazon S3) bucket.
     * </p>
     *
     * @return <p>
     *         Specifies the settings for a job that imports endpoint
     *         definitions from an Amazon Simple Storage Service (Amazon S3)
     *         bucket.
     *         </p>
     */
    public ImportJobRequest getImportJobRequest() {
        return importJobRequest;
    }

    /**
     * <p>
     * Specifies the settings for a job that imports endpoint definitions from
     * an Amazon Simple Storage Service (Amazon S3) bucket.
     * </p>
     *
     * @param importJobRequest <p>
     *            Specifies the settings for a job that imports endpoint
     *            definitions from an Amazon Simple Storage Service (Amazon S3)
     *            bucket.
     *            </p>
     */
    public void setImportJobRequest(ImportJobRequest importJobRequest) {
        this.importJobRequest = importJobRequest;
    }

    /**
     * <p>
     * Specifies the settings for a job that imports endpoint definitions from
     * an Amazon Simple Storage Service (Amazon S3) bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param importJobRequest <p>
     *            Specifies the settings for a job that imports endpoint
     *            definitions from an Amazon Simple Storage Service (Amazon S3)
     *            bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateImportJobRequest withImportJobRequest(ImportJobRequest importJobRequest) {
        this.importJobRequest = importJobRequest;
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
        if (getImportJobRequest() != null)
            sb.append("ImportJobRequest: " + getImportJobRequest());
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
                + ((getImportJobRequest() == null) ? 0 : getImportJobRequest().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateImportJobRequest == false)
            return false;
        CreateImportJobRequest other = (CreateImportJobRequest) obj;

        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null
                && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getImportJobRequest() == null ^ this.getImportJobRequest() == null)
            return false;
        if (other.getImportJobRequest() != null
                && other.getImportJobRequest().equals(this.getImportJobRequest()) == false)
            return false;
        return true;
    }
}
