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

package com.amazonaws.services.dataexchange.model;

import java.io.Serializable;

/**
 * An error that occurred with the job request.
 */
public class JobError implements Serializable {
    /**
     * The code for the job error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCESS_DENIED_EXCEPTION,
     * INTERNAL_SERVER_EXCEPTION, MALWARE_DETECTED,
     * RESOURCE_NOT_FOUND_EXCEPTION, SERVICE_QUOTA_EXCEEDED_EXCEPTION,
     * VALIDATION_EXCEPTION, MALWARE_SCAN_ENCRYPTED_FILE
     */
    private String code;

    /**
     * The new value for the details property for this object.
     */
    private Details details;

    /**
     * <p>
     * The name of the limit that was reached.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Assets per revision, Asset size in GB
     */
    private String limitName;

    /**
     * The value of the exceeded limit.
     */
    private Double limitValue;

    /**
     * The message related to the job error.
     */
    private String message;

    /**
     * The unique identifier for the resource related to the error.
     */
    private String resourceId;

    /**
     * The type of resource related to the error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REVISION, ASSET
     */
    private String resourceType;

    /**
     * The code for the job error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCESS_DENIED_EXCEPTION,
     * INTERNAL_SERVER_EXCEPTION, MALWARE_DETECTED,
     * RESOURCE_NOT_FOUND_EXCEPTION, SERVICE_QUOTA_EXCEEDED_EXCEPTION,
     * VALIDATION_EXCEPTION, MALWARE_SCAN_ENCRYPTED_FILE
     *
     * @return The code for the job error.
     * @see Code
     */
    public String getCode() {
        return code;
    }

    /**
     * The code for the job error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCESS_DENIED_EXCEPTION,
     * INTERNAL_SERVER_EXCEPTION, MALWARE_DETECTED,
     * RESOURCE_NOT_FOUND_EXCEPTION, SERVICE_QUOTA_EXCEEDED_EXCEPTION,
     * VALIDATION_EXCEPTION, MALWARE_SCAN_ENCRYPTED_FILE
     *
     * @param code The code for the job error.
     * @see Code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * The code for the job error.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCESS_DENIED_EXCEPTION,
     * INTERNAL_SERVER_EXCEPTION, MALWARE_DETECTED,
     * RESOURCE_NOT_FOUND_EXCEPTION, SERVICE_QUOTA_EXCEEDED_EXCEPTION,
     * VALIDATION_EXCEPTION, MALWARE_SCAN_ENCRYPTED_FILE
     *
     * @param code The code for the job error.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Code
     */
    public JobError withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * The code for the job error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCESS_DENIED_EXCEPTION,
     * INTERNAL_SERVER_EXCEPTION, MALWARE_DETECTED,
     * RESOURCE_NOT_FOUND_EXCEPTION, SERVICE_QUOTA_EXCEEDED_EXCEPTION,
     * VALIDATION_EXCEPTION, MALWARE_SCAN_ENCRYPTED_FILE
     *
     * @param code The code for the job error.
     * @see Code
     */
    public void setCode(Code code) {
        this.code = code.toString();
    }

    /**
     * The code for the job error.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCESS_DENIED_EXCEPTION,
     * INTERNAL_SERVER_EXCEPTION, MALWARE_DETECTED,
     * RESOURCE_NOT_FOUND_EXCEPTION, SERVICE_QUOTA_EXCEEDED_EXCEPTION,
     * VALIDATION_EXCEPTION, MALWARE_SCAN_ENCRYPTED_FILE
     *
     * @param code The code for the job error.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Code
     */
    public JobError withCode(Code code) {
        this.code = code.toString();
        return this;
    }

    /**
     * Returns the value of the details property for this object.
     *
     * @return The value of the details property for this object.
     */
    public Details getDetails() {
        return details;
    }

    /**
     * Sets the value of details
     *
     * @param details The new value for the details property for this object.
     */
    public void setDetails(Details details) {
        this.details = details;
    }

    /**
     * Sets the value of the details property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param details The new value for the details property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobError withDetails(Details details) {
        this.details = details;
        return this;
    }

    /**
     * <p>
     * The name of the limit that was reached.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Assets per revision, Asset size in GB
     *
     * @return <p>
     *         The name of the limit that was reached.
     *         </p>
     * @see JobErrorLimitName
     */
    public String getLimitName() {
        return limitName;
    }

    /**
     * <p>
     * The name of the limit that was reached.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Assets per revision, Asset size in GB
     *
     * @param limitName <p>
     *            The name of the limit that was reached.
     *            </p>
     * @see JobErrorLimitName
     */
    public void setLimitName(String limitName) {
        this.limitName = limitName;
    }

    /**
     * <p>
     * The name of the limit that was reached.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Assets per revision, Asset size in GB
     *
     * @param limitName <p>
     *            The name of the limit that was reached.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobErrorLimitName
     */
    public JobError withLimitName(String limitName) {
        this.limitName = limitName;
        return this;
    }

    /**
     * <p>
     * The name of the limit that was reached.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Assets per revision, Asset size in GB
     *
     * @param limitName <p>
     *            The name of the limit that was reached.
     *            </p>
     * @see JobErrorLimitName
     */
    public void setLimitName(JobErrorLimitName limitName) {
        this.limitName = limitName.toString();
    }

    /**
     * <p>
     * The name of the limit that was reached.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Assets per revision, Asset size in GB
     *
     * @param limitName <p>
     *            The name of the limit that was reached.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobErrorLimitName
     */
    public JobError withLimitName(JobErrorLimitName limitName) {
        this.limitName = limitName.toString();
        return this;
    }

    /**
     * The value of the exceeded limit.
     *
     * @return The value of the exceeded limit.
     */
    public Double getLimitValue() {
        return limitValue;
    }

    /**
     * The value of the exceeded limit.
     *
     * @param limitValue The value of the exceeded limit.
     */
    public void setLimitValue(Double limitValue) {
        this.limitValue = limitValue;
    }

    /**
     * The value of the exceeded limit.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param limitValue The value of the exceeded limit.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobError withLimitValue(Double limitValue) {
        this.limitValue = limitValue;
        return this;
    }

    /**
     * The message related to the job error.
     *
     * @return The message related to the job error.
     */
    public String getMessage() {
        return message;
    }

    /**
     * The message related to the job error.
     *
     * @param message The message related to the job error.
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * The message related to the job error.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param message The message related to the job error.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobError withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * The unique identifier for the resource related to the error.
     *
     * @return The unique identifier for the resource related to the error.
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * The unique identifier for the resource related to the error.
     *
     * @param resourceId The unique identifier for the resource related to the
     *            error.
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * The unique identifier for the resource related to the error.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceId The unique identifier for the resource related to the
     *            error.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobError withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * The type of resource related to the error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REVISION, ASSET
     *
     * @return The type of resource related to the error.
     * @see JobErrorResourceTypes
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * The type of resource related to the error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REVISION, ASSET
     *
     * @param resourceType The type of resource related to the error.
     * @see JobErrorResourceTypes
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * The type of resource related to the error.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REVISION, ASSET
     *
     * @param resourceType The type of resource related to the error.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobErrorResourceTypes
     */
    public JobError withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * The type of resource related to the error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REVISION, ASSET
     *
     * @param resourceType The type of resource related to the error.
     * @see JobErrorResourceTypes
     */
    public void setResourceType(JobErrorResourceTypes resourceType) {
        this.resourceType = resourceType.toString();
    }

    /**
     * The type of resource related to the error.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REVISION, ASSET
     *
     * @param resourceType The type of resource related to the error.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see JobErrorResourceTypes
     */
    public JobError withResourceType(JobErrorResourceTypes resourceType) {
        this.resourceType = resourceType.toString();
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
        if (getCode() != null)
            sb.append("Code: " + getCode() + ",");
        if (getDetails() != null)
            sb.append("Details: " + getDetails() + ",");
        if (getLimitName() != null)
            sb.append("LimitName: " + getLimitName() + ",");
        if (getLimitValue() != null)
            sb.append("LimitValue: " + getLimitValue() + ",");
        if (getMessage() != null)
            sb.append("Message: " + getMessage() + ",");
        if (getResourceId() != null)
            sb.append("ResourceId: " + getResourceId() + ",");
        if (getResourceType() != null)
            sb.append("ResourceType: " + getResourceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode());
        hashCode = prime * hashCode + ((getLimitName() == null) ? 0 : getLimitName().hashCode());
        hashCode = prime * hashCode + ((getLimitValue() == null) ? 0 : getLimitValue().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode
                + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobError == false)
            return false;
        JobError other = (JobError) obj;

        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getDetails() == null ^ this.getDetails() == null)
            return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false)
            return false;
        if (other.getLimitName() == null ^ this.getLimitName() == null)
            return false;
        if (other.getLimitName() != null
                && other.getLimitName().equals(this.getLimitName()) == false)
            return false;
        if (other.getLimitValue() == null ^ this.getLimitValue() == null)
            return false;
        if (other.getLimitValue() != null
                && other.getLimitValue().equals(this.getLimitValue()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null
                && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null
                && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        return true;
    }
}
