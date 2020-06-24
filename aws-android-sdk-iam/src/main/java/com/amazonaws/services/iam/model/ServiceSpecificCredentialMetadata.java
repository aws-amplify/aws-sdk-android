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

package com.amazonaws.services.iam.model;

import java.io.Serializable;

/**
 * <p>
 * Contains additional details about a service-specific credential.
 * </p>
 */
public class ServiceSpecificCredentialMetadata implements Serializable {
    /**
     * <p>
     * The name of the IAM user associated with the service-specific credential.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     */
    private String userName;

    /**
     * <p>
     * The status of the service-specific credential. <code>Active</code> means
     * that the key is valid for API calls, while <code>Inactive</code> means it
     * is not.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     */
    private String status;

    /**
     * <p>
     * The generated user name for the service-specific credential.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>17 - 200<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     */
    private String serviceUserName;

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a>, when the service-specific credential were created.
     * </p>
     */
    private java.util.Date createDate;

    /**
     * <p>
     * The unique identifier for the service-specific credential.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     */
    private String serviceSpecificCredentialId;

    /**
     * <p>
     * The name of the service associated with the service-specific credential.
     * </p>
     */
    private String serviceName;

    /**
     * <p>
     * The name of the IAM user associated with the service-specific credential.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @return <p>
     *         The name of the IAM user associated with the service-specific
     *         credential.
     *         </p>
     */
    public String getUserName() {
        return userName;
    }

    /**
     * <p>
     * The name of the IAM user associated with the service-specific credential.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param userName <p>
     *            The name of the IAM user associated with the service-specific
     *            credential.
     *            </p>
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The name of the IAM user associated with the service-specific credential.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param userName <p>
     *            The name of the IAM user associated with the service-specific
     *            credential.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceSpecificCredentialMetadata withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * <p>
     * The status of the service-specific credential. <code>Active</code> means
     * that the key is valid for API calls, while <code>Inactive</code> means it
     * is not.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     *
     * @return <p>
     *         The status of the service-specific credential.
     *         <code>Active</code> means that the key is valid for API calls,
     *         while <code>Inactive</code> means it is not.
     *         </p>
     * @see StatusType
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the service-specific credential. <code>Active</code> means
     * that the key is valid for API calls, while <code>Inactive</code> means it
     * is not.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     *
     * @param status <p>
     *            The status of the service-specific credential.
     *            <code>Active</code> means that the key is valid for API calls,
     *            while <code>Inactive</code> means it is not.
     *            </p>
     * @see StatusType
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the service-specific credential. <code>Active</code> means
     * that the key is valid for API calls, while <code>Inactive</code> means it
     * is not.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     *
     * @param status <p>
     *            The status of the service-specific credential.
     *            <code>Active</code> means that the key is valid for API calls,
     *            while <code>Inactive</code> means it is not.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StatusType
     */
    public ServiceSpecificCredentialMetadata withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the service-specific credential. <code>Active</code> means
     * that the key is valid for API calls, while <code>Inactive</code> means it
     * is not.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     *
     * @param status <p>
     *            The status of the service-specific credential.
     *            <code>Active</code> means that the key is valid for API calls,
     *            while <code>Inactive</code> means it is not.
     *            </p>
     * @see StatusType
     */
    public void setStatus(StatusType status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the service-specific credential. <code>Active</code> means
     * that the key is valid for API calls, while <code>Inactive</code> means it
     * is not.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     *
     * @param status <p>
     *            The status of the service-specific credential.
     *            <code>Active</code> means that the key is valid for API calls,
     *            while <code>Inactive</code> means it is not.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StatusType
     */
    public ServiceSpecificCredentialMetadata withStatus(StatusType status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The generated user name for the service-specific credential.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>17 - 200<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @return <p>
     *         The generated user name for the service-specific credential.
     *         </p>
     */
    public String getServiceUserName() {
        return serviceUserName;
    }

    /**
     * <p>
     * The generated user name for the service-specific credential.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>17 - 200<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param serviceUserName <p>
     *            The generated user name for the service-specific credential.
     *            </p>
     */
    public void setServiceUserName(String serviceUserName) {
        this.serviceUserName = serviceUserName;
    }

    /**
     * <p>
     * The generated user name for the service-specific credential.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>17 - 200<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param serviceUserName <p>
     *            The generated user name for the service-specific credential.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceSpecificCredentialMetadata withServiceUserName(String serviceUserName) {
        this.serviceUserName = serviceUserName;
        return this;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a>, when the service-specific credential were created.
     * </p>
     *
     * @return <p>
     *         The date and time, in <a
     *         href="http://www.iso.org/iso/iso8601">ISO 8601 date-time
     *         format</a>, when the service-specific credential were created.
     *         </p>
     */
    public java.util.Date getCreateDate() {
        return createDate;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a>, when the service-specific credential were created.
     * </p>
     *
     * @param createDate <p>
     *            The date and time, in <a
     *            href="http://www.iso.org/iso/iso8601">ISO 8601 date-time
     *            format</a>, when the service-specific credential were created.
     *            </p>
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601
     * date-time format</a>, when the service-specific credential were created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createDate <p>
     *            The date and time, in <a
     *            href="http://www.iso.org/iso/iso8601">ISO 8601 date-time
     *            format</a>, when the service-specific credential were created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceSpecificCredentialMetadata withCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the service-specific credential.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     *
     * @return <p>
     *         The unique identifier for the service-specific credential.
     *         </p>
     */
    public String getServiceSpecificCredentialId() {
        return serviceSpecificCredentialId;
    }

    /**
     * <p>
     * The unique identifier for the service-specific credential.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     *
     * @param serviceSpecificCredentialId <p>
     *            The unique identifier for the service-specific credential.
     *            </p>
     */
    public void setServiceSpecificCredentialId(String serviceSpecificCredentialId) {
        this.serviceSpecificCredentialId = serviceSpecificCredentialId;
    }

    /**
     * <p>
     * The unique identifier for the service-specific credential.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     *
     * @param serviceSpecificCredentialId <p>
     *            The unique identifier for the service-specific credential.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceSpecificCredentialMetadata withServiceSpecificCredentialId(
            String serviceSpecificCredentialId) {
        this.serviceSpecificCredentialId = serviceSpecificCredentialId;
        return this;
    }

    /**
     * <p>
     * The name of the service associated with the service-specific credential.
     * </p>
     *
     * @return <p>
     *         The name of the service associated with the service-specific
     *         credential.
     *         </p>
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * <p>
     * The name of the service associated with the service-specific credential.
     * </p>
     *
     * @param serviceName <p>
     *            The name of the service associated with the service-specific
     *            credential.
     *            </p>
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The name of the service associated with the service-specific credential.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceName <p>
     *            The name of the service associated with the service-specific
     *            credential.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ServiceSpecificCredentialMetadata withServiceName(String serviceName) {
        this.serviceName = serviceName;
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
        if (getUserName() != null)
            sb.append("UserName: " + getUserName() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getServiceUserName() != null)
            sb.append("ServiceUserName: " + getServiceUserName() + ",");
        if (getCreateDate() != null)
            sb.append("CreateDate: " + getCreateDate() + ",");
        if (getServiceSpecificCredentialId() != null)
            sb.append("ServiceSpecificCredentialId: " + getServiceSpecificCredentialId() + ",");
        if (getServiceName() != null)
            sb.append("ServiceName: " + getServiceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getServiceUserName() == null) ? 0 : getServiceUserName().hashCode());
        hashCode = prime * hashCode + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        hashCode = prime
                * hashCode
                + ((getServiceSpecificCredentialId() == null) ? 0
                        : getServiceSpecificCredentialId().hashCode());
        hashCode = prime * hashCode
                + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceSpecificCredentialMetadata == false)
            return false;
        ServiceSpecificCredentialMetadata other = (ServiceSpecificCredentialMetadata) obj;

        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getServiceUserName() == null ^ this.getServiceUserName() == null)
            return false;
        if (other.getServiceUserName() != null
                && other.getServiceUserName().equals(this.getServiceUserName()) == false)
            return false;
        if (other.getCreateDate() == null ^ this.getCreateDate() == null)
            return false;
        if (other.getCreateDate() != null
                && other.getCreateDate().equals(this.getCreateDate()) == false)
            return false;
        if (other.getServiceSpecificCredentialId() == null
                ^ this.getServiceSpecificCredentialId() == null)
            return false;
        if (other.getServiceSpecificCredentialId() != null
                && other.getServiceSpecificCredentialId().equals(
                        this.getServiceSpecificCredentialId()) == false)
            return false;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null
                && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        return true;
    }
}
