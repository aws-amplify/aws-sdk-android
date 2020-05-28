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

package com.amazonaws.services.workmail.model;

import java.io.Serializable;

public class DescribeOrganizationResult implements Serializable {
    /**
     * <p>
     * The identifier of an organization.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^m-[0-9a-f]{32}$<br/>
     */
    private String organizationId;

    /**
     * <p>
     * The alias for an organization.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 62<br/>
     * <b>Pattern: </b>^(?!d-)([\da-zA-Z]+)([-]*[\da-zA-Z])*<br/>
     */
    private String alias;

    /**
     * <p>
     * The state of an organization.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     */
    private String state;

    /**
     * <p>
     * The identifier for the directory associated with an Amazon WorkMail
     * organization.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     */
    private String directoryId;

    /**
     * <p>
     * The type of directory associated with the WorkMail organization.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     */
    private String directoryType;

    /**
     * <p>
     * The default mail domain associated with the organization.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     */
    private String defaultMailDomain;

    /**
     * <p>
     * The date at which the organization became usable in the WorkMail context,
     * in UNIX epoch time format.
     * </p>
     */
    private java.util.Date completedDate;

    /**
     * <p>
     * (Optional) The error message indicating if unexpected behavior was
     * encountered with regards to the organization.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     */
    private String errorMessage;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the organization.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1011<br/>
     */
    private String aRN;

    /**
     * <p>
     * The identifier of an organization.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^m-[0-9a-f]{32}$<br/>
     *
     * @return <p>
     *         The identifier of an organization.
     *         </p>
     */
    public String getOrganizationId() {
        return organizationId;
    }

    /**
     * <p>
     * The identifier of an organization.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^m-[0-9a-f]{32}$<br/>
     *
     * @param organizationId <p>
     *            The identifier of an organization.
     *            </p>
     */
    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * <p>
     * The identifier of an organization.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^m-[0-9a-f]{32}$<br/>
     *
     * @param organizationId <p>
     *            The identifier of an organization.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeOrganizationResult withOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }

    /**
     * <p>
     * The alias for an organization.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 62<br/>
     * <b>Pattern: </b>^(?!d-)([\da-zA-Z]+)([-]*[\da-zA-Z])*<br/>
     *
     * @return <p>
     *         The alias for an organization.
     *         </p>
     */
    public String getAlias() {
        return alias;
    }

    /**
     * <p>
     * The alias for an organization.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 62<br/>
     * <b>Pattern: </b>^(?!d-)([\da-zA-Z]+)([-]*[\da-zA-Z])*<br/>
     *
     * @param alias <p>
     *            The alias for an organization.
     *            </p>
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * <p>
     * The alias for an organization.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 62<br/>
     * <b>Pattern: </b>^(?!d-)([\da-zA-Z]+)([-]*[\da-zA-Z])*<br/>
     *
     * @param alias <p>
     *            The alias for an organization.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeOrganizationResult withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    /**
     * <p>
     * The state of an organization.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @return <p>
     *         The state of an organization.
     *         </p>
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The state of an organization.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param state <p>
     *            The state of an organization.
     *            </p>
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of an organization.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param state <p>
     *            The state of an organization.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeOrganizationResult withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The identifier for the directory associated with an Amazon WorkMail
     * organization.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @return <p>
     *         The identifier for the directory associated with an Amazon
     *         WorkMail organization.
     *         </p>
     */
    public String getDirectoryId() {
        return directoryId;
    }

    /**
     * <p>
     * The identifier for the directory associated with an Amazon WorkMail
     * organization.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param directoryId <p>
     *            The identifier for the directory associated with an Amazon
     *            WorkMail organization.
     *            </p>
     */
    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * The identifier for the directory associated with an Amazon WorkMail
     * organization.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param directoryId <p>
     *            The identifier for the directory associated with an Amazon
     *            WorkMail organization.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeOrganizationResult withDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }

    /**
     * <p>
     * The type of directory associated with the WorkMail organization.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @return <p>
     *         The type of directory associated with the WorkMail organization.
     *         </p>
     */
    public String getDirectoryType() {
        return directoryType;
    }

    /**
     * <p>
     * The type of directory associated with the WorkMail organization.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param directoryType <p>
     *            The type of directory associated with the WorkMail
     *            organization.
     *            </p>
     */
    public void setDirectoryType(String directoryType) {
        this.directoryType = directoryType;
    }

    /**
     * <p>
     * The type of directory associated with the WorkMail organization.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param directoryType <p>
     *            The type of directory associated with the WorkMail
     *            organization.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeOrganizationResult withDirectoryType(String directoryType) {
        this.directoryType = directoryType;
        return this;
    }

    /**
     * <p>
     * The default mail domain associated with the organization.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @return <p>
     *         The default mail domain associated with the organization.
     *         </p>
     */
    public String getDefaultMailDomain() {
        return defaultMailDomain;
    }

    /**
     * <p>
     * The default mail domain associated with the organization.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param defaultMailDomain <p>
     *            The default mail domain associated with the organization.
     *            </p>
     */
    public void setDefaultMailDomain(String defaultMailDomain) {
        this.defaultMailDomain = defaultMailDomain;
    }

    /**
     * <p>
     * The default mail domain associated with the organization.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param defaultMailDomain <p>
     *            The default mail domain associated with the organization.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeOrganizationResult withDefaultMailDomain(String defaultMailDomain) {
        this.defaultMailDomain = defaultMailDomain;
        return this;
    }

    /**
     * <p>
     * The date at which the organization became usable in the WorkMail context,
     * in UNIX epoch time format.
     * </p>
     *
     * @return <p>
     *         The date at which the organization became usable in the WorkMail
     *         context, in UNIX epoch time format.
     *         </p>
     */
    public java.util.Date getCompletedDate() {
        return completedDate;
    }

    /**
     * <p>
     * The date at which the organization became usable in the WorkMail context,
     * in UNIX epoch time format.
     * </p>
     *
     * @param completedDate <p>
     *            The date at which the organization became usable in the
     *            WorkMail context, in UNIX epoch time format.
     *            </p>
     */
    public void setCompletedDate(java.util.Date completedDate) {
        this.completedDate = completedDate;
    }

    /**
     * <p>
     * The date at which the organization became usable in the WorkMail context,
     * in UNIX epoch time format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param completedDate <p>
     *            The date at which the organization became usable in the
     *            WorkMail context, in UNIX epoch time format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeOrganizationResult withCompletedDate(java.util.Date completedDate) {
        this.completedDate = completedDate;
        return this;
    }

    /**
     * <p>
     * (Optional) The error message indicating if unexpected behavior was
     * encountered with regards to the organization.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @return <p>
     *         (Optional) The error message indicating if unexpected behavior
     *         was encountered with regards to the organization.
     *         </p>
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * <p>
     * (Optional) The error message indicating if unexpected behavior was
     * encountered with regards to the organization.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param errorMessage <p>
     *            (Optional) The error message indicating if unexpected behavior
     *            was encountered with regards to the organization.
     *            </p>
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * (Optional) The error message indicating if unexpected behavior was
     * encountered with regards to the organization.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param errorMessage <p>
     *            (Optional) The error message indicating if unexpected behavior
     *            was encountered with regards to the organization.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeOrganizationResult withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the organization.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1011<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the organization.
     *         </p>
     */
    public String getARN() {
        return aRN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the organization.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1011<br/>
     *
     * @param aRN <p>
     *            The Amazon Resource Name (ARN) of the organization.
     *            </p>
     */
    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the organization.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1011<br/>
     *
     * @param aRN <p>
     *            The Amazon Resource Name (ARN) of the organization.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeOrganizationResult withARN(String aRN) {
        this.aRN = aRN;
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
        if (getOrganizationId() != null)
            sb.append("OrganizationId: " + getOrganizationId() + ",");
        if (getAlias() != null)
            sb.append("Alias: " + getAlias() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getDirectoryId() != null)
            sb.append("DirectoryId: " + getDirectoryId() + ",");
        if (getDirectoryType() != null)
            sb.append("DirectoryType: " + getDirectoryType() + ",");
        if (getDefaultMailDomain() != null)
            sb.append("DefaultMailDomain: " + getDefaultMailDomain() + ",");
        if (getCompletedDate() != null)
            sb.append("CompletedDate: " + getCompletedDate() + ",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: " + getErrorMessage() + ",");
        if (getARN() != null)
            sb.append("ARN: " + getARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getOrganizationId() == null) ? 0 : getOrganizationId().hashCode());
        hashCode = prime * hashCode + ((getAlias() == null) ? 0 : getAlias().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode
                + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        hashCode = prime * hashCode
                + ((getDirectoryType() == null) ? 0 : getDirectoryType().hashCode());
        hashCode = prime * hashCode
                + ((getDefaultMailDomain() == null) ? 0 : getDefaultMailDomain().hashCode());
        hashCode = prime * hashCode
                + ((getCompletedDate() == null) ? 0 : getCompletedDate().hashCode());
        hashCode = prime * hashCode
                + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getARN() == null) ? 0 : getARN().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeOrganizationResult == false)
            return false;
        DescribeOrganizationResult other = (DescribeOrganizationResult) obj;

        if (other.getOrganizationId() == null ^ this.getOrganizationId() == null)
            return false;
        if (other.getOrganizationId() != null
                && other.getOrganizationId().equals(this.getOrganizationId()) == false)
            return false;
        if (other.getAlias() == null ^ this.getAlias() == null)
            return false;
        if (other.getAlias() != null && other.getAlias().equals(this.getAlias()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null
                && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getDirectoryType() == null ^ this.getDirectoryType() == null)
            return false;
        if (other.getDirectoryType() != null
                && other.getDirectoryType().equals(this.getDirectoryType()) == false)
            return false;
        if (other.getDefaultMailDomain() == null ^ this.getDefaultMailDomain() == null)
            return false;
        if (other.getDefaultMailDomain() != null
                && other.getDefaultMailDomain().equals(this.getDefaultMailDomain()) == false)
            return false;
        if (other.getCompletedDate() == null ^ this.getCompletedDate() == null)
            return false;
        if (other.getCompletedDate() != null
                && other.getCompletedDate().equals(this.getCompletedDate()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null
                && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getARN() == null ^ this.getARN() == null)
            return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false)
            return false;
        return true;
    }
}
