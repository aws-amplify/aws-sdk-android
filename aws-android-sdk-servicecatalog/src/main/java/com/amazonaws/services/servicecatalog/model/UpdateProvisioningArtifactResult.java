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

package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;

public class UpdateProvisioningArtifactResult implements Serializable {
    /**
     * <p>
     * Information about the provisioning artifact.
     * </p>
     */
    private ProvisioningArtifactDetail provisioningArtifactDetail;

    /**
     * <p>
     * The URL of the CloudFormation template in Amazon S3.
     * </p>
     */
    private java.util.Map<String, String> info;

    /**
     * <p>
     * The status of the current request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, CREATING, FAILED
     */
    private String status;

    /**
     * <p>
     * Information about the provisioning artifact.
     * </p>
     *
     * @return <p>
     *         Information about the provisioning artifact.
     *         </p>
     */
    public ProvisioningArtifactDetail getProvisioningArtifactDetail() {
        return provisioningArtifactDetail;
    }

    /**
     * <p>
     * Information about the provisioning artifact.
     * </p>
     *
     * @param provisioningArtifactDetail <p>
     *            Information about the provisioning artifact.
     *            </p>
     */
    public void setProvisioningArtifactDetail(ProvisioningArtifactDetail provisioningArtifactDetail) {
        this.provisioningArtifactDetail = provisioningArtifactDetail;
    }

    /**
     * <p>
     * Information about the provisioning artifact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param provisioningArtifactDetail <p>
     *            Information about the provisioning artifact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateProvisioningArtifactResult withProvisioningArtifactDetail(
            ProvisioningArtifactDetail provisioningArtifactDetail) {
        this.provisioningArtifactDetail = provisioningArtifactDetail;
        return this;
    }

    /**
     * <p>
     * The URL of the CloudFormation template in Amazon S3.
     * </p>
     *
     * @return <p>
     *         The URL of the CloudFormation template in Amazon S3.
     *         </p>
     */
    public java.util.Map<String, String> getInfo() {
        return info;
    }

    /**
     * <p>
     * The URL of the CloudFormation template in Amazon S3.
     * </p>
     *
     * @param info <p>
     *            The URL of the CloudFormation template in Amazon S3.
     *            </p>
     */
    public void setInfo(java.util.Map<String, String> info) {
        this.info = info;
    }

    /**
     * <p>
     * The URL of the CloudFormation template in Amazon S3.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param info <p>
     *            The URL of the CloudFormation template in Amazon S3.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateProvisioningArtifactResult withInfo(java.util.Map<String, String> info) {
        this.info = info;
        return this;
    }

    /**
     * <p>
     * The URL of the CloudFormation template in Amazon S3.
     * </p>
     * <p>
     * The method adds a new key-value pair into Info parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Info.
     * @param value The corresponding value of the entry to be added into Info.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateProvisioningArtifactResult addInfoEntry(String key, String value) {
        if (null == this.info) {
            this.info = new java.util.HashMap<String, String>();
        }
        if (this.info.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.info.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Info.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public UpdateProvisioningArtifactResult clearInfoEntries() {
        this.info = null;
        return this;
    }

    /**
     * <p>
     * The status of the current request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, CREATING, FAILED
     *
     * @return <p>
     *         The status of the current request.
     *         </p>
     * @see Status
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the current request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, CREATING, FAILED
     *
     * @param status <p>
     *            The status of the current request.
     *            </p>
     * @see Status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the current request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, CREATING, FAILED
     *
     * @param status <p>
     *            The status of the current request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Status
     */
    public UpdateProvisioningArtifactResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the current request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, CREATING, FAILED
     *
     * @param status <p>
     *            The status of the current request.
     *            </p>
     * @see Status
     */
    public void setStatus(Status status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the current request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, CREATING, FAILED
     *
     * @param status <p>
     *            The status of the current request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Status
     */
    public UpdateProvisioningArtifactResult withStatus(Status status) {
        this.status = status.toString();
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
        if (getProvisioningArtifactDetail() != null)
            sb.append("ProvisioningArtifactDetail: " + getProvisioningArtifactDetail() + ",");
        if (getInfo() != null)
            sb.append("Info: " + getInfo() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getProvisioningArtifactDetail() == null) ? 0 : getProvisioningArtifactDetail()
                        .hashCode());
        hashCode = prime * hashCode + ((getInfo() == null) ? 0 : getInfo().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateProvisioningArtifactResult == false)
            return false;
        UpdateProvisioningArtifactResult other = (UpdateProvisioningArtifactResult) obj;

        if (other.getProvisioningArtifactDetail() == null
                ^ this.getProvisioningArtifactDetail() == null)
            return false;
        if (other.getProvisioningArtifactDetail() != null
                && other.getProvisioningArtifactDetail().equals(
                        this.getProvisioningArtifactDetail()) == false)
            return false;
        if (other.getInfo() == null ^ this.getInfo() == null)
            return false;
        if (other.getInfo() != null && other.getInfo().equals(this.getInfo()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
