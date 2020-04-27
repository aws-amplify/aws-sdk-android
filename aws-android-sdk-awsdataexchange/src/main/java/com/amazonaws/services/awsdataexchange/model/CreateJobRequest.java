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

package com.amazonaws.services.awsdataexchange.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * This operation creates a job.
 * </p>
 */
public class CreateJobRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The details for the CreateJob request.
     * </p>
     */
    private RequestDetails details;

    /**
     * <p>
     * The type of job to be created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IMPORT_ASSETS_FROM_S3,
     * IMPORT_ASSET_FROM_SIGNED_URL, EXPORT_ASSETS_TO_S3,
     * EXPORT_ASSET_TO_SIGNED_URL
     */
    private String type;

    /**
     * <p>
     * The details for the CreateJob request.
     * </p>
     *
     * @return <p>
     *         The details for the CreateJob request.
     *         </p>
     */
    public RequestDetails getDetails() {
        return details;
    }

    /**
     * <p>
     * The details for the CreateJob request.
     * </p>
     *
     * @param details <p>
     *            The details for the CreateJob request.
     *            </p>
     */
    public void setDetails(RequestDetails details) {
        this.details = details;
    }

    /**
     * <p>
     * The details for the CreateJob request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param details <p>
     *            The details for the CreateJob request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest withDetails(RequestDetails details) {
        this.details = details;
        return this;
    }

    /**
     * <p>
     * The type of job to be created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IMPORT_ASSETS_FROM_S3,
     * IMPORT_ASSET_FROM_SIGNED_URL, EXPORT_ASSETS_TO_S3,
     * EXPORT_ASSET_TO_SIGNED_URL
     *
     * @return <p>
     *         The type of job to be created.
     *         </p>
     * @see Type
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of job to be created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IMPORT_ASSETS_FROM_S3,
     * IMPORT_ASSET_FROM_SIGNED_URL, EXPORT_ASSETS_TO_S3,
     * EXPORT_ASSET_TO_SIGNED_URL
     *
     * @param type <p>
     *            The type of job to be created.
     *            </p>
     * @see Type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of job to be created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IMPORT_ASSETS_FROM_S3,
     * IMPORT_ASSET_FROM_SIGNED_URL, EXPORT_ASSETS_TO_S3,
     * EXPORT_ASSET_TO_SIGNED_URL
     *
     * @param type <p>
     *            The type of job to be created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Type
     */
    public CreateJobRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of job to be created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IMPORT_ASSETS_FROM_S3,
     * IMPORT_ASSET_FROM_SIGNED_URL, EXPORT_ASSETS_TO_S3,
     * EXPORT_ASSET_TO_SIGNED_URL
     *
     * @param type <p>
     *            The type of job to be created.
     *            </p>
     * @see Type
     */
    public void setType(Type type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of job to be created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IMPORT_ASSETS_FROM_S3,
     * IMPORT_ASSET_FROM_SIGNED_URL, EXPORT_ASSETS_TO_S3,
     * EXPORT_ASSET_TO_SIGNED_URL
     *
     * @param type <p>
     *            The type of job to be created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Type
     */
    public CreateJobRequest withType(Type type) {
        this.type = type.toString();
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
        if (getDetails() != null)
            sb.append("Details: " + getDetails() + ",");
        if (getType() != null)
            sb.append("Type: " + getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateJobRequest == false)
            return false;
        CreateJobRequest other = (CreateJobRequest) obj;

        if (other.getDetails() == null ^ this.getDetails() == null)
            return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }
}
