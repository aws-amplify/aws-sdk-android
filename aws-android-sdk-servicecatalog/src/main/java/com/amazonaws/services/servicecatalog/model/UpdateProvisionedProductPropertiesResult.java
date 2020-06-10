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

public class UpdateProvisionedProductPropertiesResult implements Serializable {
    /**
     * <p>
     * The provisioned product identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     */
    private String provisionedProductId;

    /**
     * <p>
     * A map that contains the properties updated.
     * </p>
     */
    private java.util.Map<String, String> provisionedProductProperties;

    /**
     * <p>
     * The identifier of the record.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     */
    private String recordId;

    /**
     * <p>
     * The status of the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATED, IN_PROGRESS, IN_PROGRESS_IN_ERROR,
     * SUCCEEDED, FAILED
     */
    private String status;

    /**
     * <p>
     * The provisioned product identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @return <p>
     *         The provisioned product identifier.
     *         </p>
     */
    public String getProvisionedProductId() {
        return provisionedProductId;
    }

    /**
     * <p>
     * The provisioned product identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param provisionedProductId <p>
     *            The provisioned product identifier.
     *            </p>
     */
    public void setProvisionedProductId(String provisionedProductId) {
        this.provisionedProductId = provisionedProductId;
    }

    /**
     * <p>
     * The provisioned product identifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param provisionedProductId <p>
     *            The provisioned product identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateProvisionedProductPropertiesResult withProvisionedProductId(
            String provisionedProductId) {
        this.provisionedProductId = provisionedProductId;
        return this;
    }

    /**
     * <p>
     * A map that contains the properties updated.
     * </p>
     *
     * @return <p>
     *         A map that contains the properties updated.
     *         </p>
     */
    public java.util.Map<String, String> getProvisionedProductProperties() {
        return provisionedProductProperties;
    }

    /**
     * <p>
     * A map that contains the properties updated.
     * </p>
     *
     * @param provisionedProductProperties <p>
     *            A map that contains the properties updated.
     *            </p>
     */
    public void setProvisionedProductProperties(
            java.util.Map<String, String> provisionedProductProperties) {
        this.provisionedProductProperties = provisionedProductProperties;
    }

    /**
     * <p>
     * A map that contains the properties updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param provisionedProductProperties <p>
     *            A map that contains the properties updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateProvisionedProductPropertiesResult withProvisionedProductProperties(
            java.util.Map<String, String> provisionedProductProperties) {
        this.provisionedProductProperties = provisionedProductProperties;
        return this;
    }

    /**
     * <p>
     * A map that contains the properties updated.
     * </p>
     * <p>
     * The method adds a new key-value pair into ProvisionedProductProperties
     * parameter, and returns a reference to this object so that method calls
     * can be chained together.
     *
     * @param key The key of the entry to be added into
     *            ProvisionedProductProperties.
     * @param value The corresponding value of the entry to be added into
     *            ProvisionedProductProperties.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateProvisionedProductPropertiesResult addProvisionedProductPropertiesEntry(
            String key, String value) {
        if (null == this.provisionedProductProperties) {
            this.provisionedProductProperties = new java.util.HashMap<String, String>();
        }
        if (this.provisionedProductProperties.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.provisionedProductProperties.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ProvisionedProductProperties.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public UpdateProvisionedProductPropertiesResult clearProvisionedProductPropertiesEntries() {
        this.provisionedProductProperties = null;
        return this;
    }

    /**
     * <p>
     * The identifier of the record.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @return <p>
     *         The identifier of the record.
     *         </p>
     */
    public String getRecordId() {
        return recordId;
    }

    /**
     * <p>
     * The identifier of the record.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param recordId <p>
     *            The identifier of the record.
     *            </p>
     */
    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    /**
     * <p>
     * The identifier of the record.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param recordId <p>
     *            The identifier of the record.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateProvisionedProductPropertiesResult withRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }

    /**
     * <p>
     * The status of the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATED, IN_PROGRESS, IN_PROGRESS_IN_ERROR,
     * SUCCEEDED, FAILED
     *
     * @return <p>
     *         The status of the request.
     *         </p>
     * @see RecordStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATED, IN_PROGRESS, IN_PROGRESS_IN_ERROR,
     * SUCCEEDED, FAILED
     *
     * @param status <p>
     *            The status of the request.
     *            </p>
     * @see RecordStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATED, IN_PROGRESS, IN_PROGRESS_IN_ERROR,
     * SUCCEEDED, FAILED
     *
     * @param status <p>
     *            The status of the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RecordStatus
     */
    public UpdateProvisionedProductPropertiesResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATED, IN_PROGRESS, IN_PROGRESS_IN_ERROR,
     * SUCCEEDED, FAILED
     *
     * @param status <p>
     *            The status of the request.
     *            </p>
     * @see RecordStatus
     */
    public void setStatus(RecordStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATED, IN_PROGRESS, IN_PROGRESS_IN_ERROR,
     * SUCCEEDED, FAILED
     *
     * @param status <p>
     *            The status of the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RecordStatus
     */
    public UpdateProvisionedProductPropertiesResult withStatus(RecordStatus status) {
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
        if (getProvisionedProductId() != null)
            sb.append("ProvisionedProductId: " + getProvisionedProductId() + ",");
        if (getProvisionedProductProperties() != null)
            sb.append("ProvisionedProductProperties: " + getProvisionedProductProperties() + ",");
        if (getRecordId() != null)
            sb.append("RecordId: " + getRecordId() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getProvisionedProductId() == null) ? 0 : getProvisionedProductId().hashCode());
        hashCode = prime
                * hashCode
                + ((getProvisionedProductProperties() == null) ? 0
                        : getProvisionedProductProperties().hashCode());
        hashCode = prime * hashCode + ((getRecordId() == null) ? 0 : getRecordId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateProvisionedProductPropertiesResult == false)
            return false;
        UpdateProvisionedProductPropertiesResult other = (UpdateProvisionedProductPropertiesResult) obj;

        if (other.getProvisionedProductId() == null ^ this.getProvisionedProductId() == null)
            return false;
        if (other.getProvisionedProductId() != null
                && other.getProvisionedProductId().equals(this.getProvisionedProductId()) == false)
            return false;
        if (other.getProvisionedProductProperties() == null
                ^ this.getProvisionedProductProperties() == null)
            return false;
        if (other.getProvisionedProductProperties() != null
                && other.getProvisionedProductProperties().equals(
                        this.getProvisionedProductProperties()) == false)
            return false;
        if (other.getRecordId() == null ^ this.getRecordId() == null)
            return false;
        if (other.getRecordId() != null && other.getRecordId().equals(this.getRecordId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
