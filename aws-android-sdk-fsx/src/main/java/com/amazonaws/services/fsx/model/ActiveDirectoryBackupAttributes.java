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

package com.amazonaws.services.fsx.model;

import java.io.Serializable;

/**
 * <p>
 * The Microsoft AD attributes of the Amazon FSx for Windows File Server file
 * system.
 * </p>
 */
public class ActiveDirectoryBackupAttributes implements Serializable {
    /**
     * <p>
     * The fully qualified domain name of the self-managed AD directory.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^.{1,255}$<br/>
     */
    private String domainName;

    /**
     * <p>
     * The ID of the AWS Managed Microsoft Active Directory instance to which
     * the file system is joined.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^d-[0-9a-f]{10}$<br/>
     */
    private String activeDirectoryId;

    /**
     * <p>
     * The fully qualified domain name of the self-managed AD directory.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^.{1,255}$<br/>
     *
     * @return <p>
     *         The fully qualified domain name of the self-managed AD directory.
     *         </p>
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * <p>
     * The fully qualified domain name of the self-managed AD directory.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^.{1,255}$<br/>
     *
     * @param domainName <p>
     *            The fully qualified domain name of the self-managed AD
     *            directory.
     *            </p>
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The fully qualified domain name of the self-managed AD directory.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^.{1,255}$<br/>
     *
     * @param domainName <p>
     *            The fully qualified domain name of the self-managed AD
     *            directory.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ActiveDirectoryBackupAttributes withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * <p>
     * The ID of the AWS Managed Microsoft Active Directory instance to which
     * the file system is joined.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^d-[0-9a-f]{10}$<br/>
     *
     * @return <p>
     *         The ID of the AWS Managed Microsoft Active Directory instance to
     *         which the file system is joined.
     *         </p>
     */
    public String getActiveDirectoryId() {
        return activeDirectoryId;
    }

    /**
     * <p>
     * The ID of the AWS Managed Microsoft Active Directory instance to which
     * the file system is joined.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^d-[0-9a-f]{10}$<br/>
     *
     * @param activeDirectoryId <p>
     *            The ID of the AWS Managed Microsoft Active Directory instance
     *            to which the file system is joined.
     *            </p>
     */
    public void setActiveDirectoryId(String activeDirectoryId) {
        this.activeDirectoryId = activeDirectoryId;
    }

    /**
     * <p>
     * The ID of the AWS Managed Microsoft Active Directory instance to which
     * the file system is joined.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^d-[0-9a-f]{10}$<br/>
     *
     * @param activeDirectoryId <p>
     *            The ID of the AWS Managed Microsoft Active Directory instance
     *            to which the file system is joined.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ActiveDirectoryBackupAttributes withActiveDirectoryId(String activeDirectoryId) {
        this.activeDirectoryId = activeDirectoryId;
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
        if (getDomainName() != null)
            sb.append("DomainName: " + getDomainName() + ",");
        if (getActiveDirectoryId() != null)
            sb.append("ActiveDirectoryId: " + getActiveDirectoryId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode
                + ((getActiveDirectoryId() == null) ? 0 : getActiveDirectoryId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActiveDirectoryBackupAttributes == false)
            return false;
        ActiveDirectoryBackupAttributes other = (ActiveDirectoryBackupAttributes) obj;

        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null
                && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getActiveDirectoryId() == null ^ this.getActiveDirectoryId() == null)
            return false;
        if (other.getActiveDirectoryId() != null
                && other.getActiveDirectoryId().equals(this.getActiveDirectoryId()) == false)
            return false;
        return true;
    }
}
