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

package com.amazonaws.services.worklink.model;

import java.io.Serializable;

/**
 * <p>
 * The summary of the domain.
 * </p>
 */
public class DomainSummary implements Serializable {
    /**
     * <p>
     * The name of the domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 253<br/>
     * <b>Pattern:
     * </b>^[a-zA-Z0-9]?((?!-)([A-Za-z0-9-]*[A-Za-z0-9])\.)+[a-zA-Z0-9]+$<br/>
     */
    private String domainName;

    /**
     * <p>
     * The name to display.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     */
    private String displayName;

    /**
     * <p>
     * The time that the domain was created.
     * </p>
     */
    private java.util.Date createdTime;

    /**
     * <p>
     * The status of the domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING_VALIDATION, ASSOCIATING, ACTIVE, INACTIVE,
     * DISASSOCIATING, DISASSOCIATED, FAILED_TO_ASSOCIATE,
     * FAILED_TO_DISASSOCIATE
     */
    private String domainStatus;

    /**
     * <p>
     * The name of the domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 253<br/>
     * <b>Pattern:
     * </b>^[a-zA-Z0-9]?((?!-)([A-Za-z0-9-]*[A-Za-z0-9])\.)+[a-zA-Z0-9]+$<br/>
     *
     * @return <p>
     *         The name of the domain.
     *         </p>
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * <p>
     * The name of the domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 253<br/>
     * <b>Pattern:
     * </b>^[a-zA-Z0-9]?((?!-)([A-Za-z0-9-]*[A-Za-z0-9])\.)+[a-zA-Z0-9]+$<br/>
     *
     * @param domainName <p>
     *            The name of the domain.
     *            </p>
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of the domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 253<br/>
     * <b>Pattern:
     * </b>^[a-zA-Z0-9]?((?!-)([A-Za-z0-9-]*[A-Za-z0-9])\.)+[a-zA-Z0-9]+$<br/>
     *
     * @param domainName <p>
     *            The name of the domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainSummary withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * <p>
     * The name to display.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     *
     * @return <p>
     *         The name to display.
     *         </p>
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * <p>
     * The name to display.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     *
     * @param displayName <p>
     *            The name to display.
     *            </p>
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The name to display.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     *
     * @param displayName <p>
     *            The name to display.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainSummary withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * <p>
     * The time that the domain was created.
     * </p>
     *
     * @return <p>
     *         The time that the domain was created.
     *         </p>
     */
    public java.util.Date getCreatedTime() {
        return createdTime;
    }

    /**
     * <p>
     * The time that the domain was created.
     * </p>
     *
     * @param createdTime <p>
     *            The time that the domain was created.
     *            </p>
     */
    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The time that the domain was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdTime <p>
     *            The time that the domain was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainSummary withCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * <p>
     * The status of the domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING_VALIDATION, ASSOCIATING, ACTIVE, INACTIVE,
     * DISASSOCIATING, DISASSOCIATED, FAILED_TO_ASSOCIATE,
     * FAILED_TO_DISASSOCIATE
     *
     * @return <p>
     *         The status of the domain.
     *         </p>
     * @see DomainStatus
     */
    public String getDomainStatus() {
        return domainStatus;
    }

    /**
     * <p>
     * The status of the domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING_VALIDATION, ASSOCIATING, ACTIVE, INACTIVE,
     * DISASSOCIATING, DISASSOCIATED, FAILED_TO_ASSOCIATE,
     * FAILED_TO_DISASSOCIATE
     *
     * @param domainStatus <p>
     *            The status of the domain.
     *            </p>
     * @see DomainStatus
     */
    public void setDomainStatus(String domainStatus) {
        this.domainStatus = domainStatus;
    }

    /**
     * <p>
     * The status of the domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING_VALIDATION, ASSOCIATING, ACTIVE, INACTIVE,
     * DISASSOCIATING, DISASSOCIATED, FAILED_TO_ASSOCIATE,
     * FAILED_TO_DISASSOCIATE
     *
     * @param domainStatus <p>
     *            The status of the domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DomainStatus
     */
    public DomainSummary withDomainStatus(String domainStatus) {
        this.domainStatus = domainStatus;
        return this;
    }

    /**
     * <p>
     * The status of the domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING_VALIDATION, ASSOCIATING, ACTIVE, INACTIVE,
     * DISASSOCIATING, DISASSOCIATED, FAILED_TO_ASSOCIATE,
     * FAILED_TO_DISASSOCIATE
     *
     * @param domainStatus <p>
     *            The status of the domain.
     *            </p>
     * @see DomainStatus
     */
    public void setDomainStatus(DomainStatus domainStatus) {
        this.domainStatus = domainStatus.toString();
    }

    /**
     * <p>
     * The status of the domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING_VALIDATION, ASSOCIATING, ACTIVE, INACTIVE,
     * DISASSOCIATING, DISASSOCIATED, FAILED_TO_ASSOCIATE,
     * FAILED_TO_DISASSOCIATE
     *
     * @param domainStatus <p>
     *            The status of the domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DomainStatus
     */
    public DomainSummary withDomainStatus(DomainStatus domainStatus) {
        this.domainStatus = domainStatus.toString();
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
        if (getDisplayName() != null)
            sb.append("DisplayName: " + getDisplayName() + ",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: " + getCreatedTime() + ",");
        if (getDomainStatus() != null)
            sb.append("DomainStatus: " + getDomainStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode
                + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode
                + ((getDomainStatus() == null) ? 0 : getDomainStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DomainSummary == false)
            return false;
        DomainSummary other = (DomainSummary) obj;

        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null
                && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null
                && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null
                && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getDomainStatus() == null ^ this.getDomainStatus() == null)
            return false;
        if (other.getDomainStatus() != null
                && other.getDomainStatus().equals(this.getDomainStatus()) == false)
            return false;
        return true;
    }
}
