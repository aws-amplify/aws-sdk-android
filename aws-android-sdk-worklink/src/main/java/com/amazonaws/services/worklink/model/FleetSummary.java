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
 * The summary of the fleet.
 * </p>
 */
public class FleetSummary implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the fleet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String fleetArn;

    /**
     * <p>
     * The time when the fleet was created.
     * </p>
     */
    private java.util.Date createdTime;

    /**
     * <p>
     * The time when the fleet was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;

    /**
     * <p>
     * The name of the fleet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 48<br/>
     * <b>Pattern: </b>^[a-z0-9](?:[a-z0-9\-]{0,46}[a-z0-9])?$<br/>
     */
    private String fleetName;

    /**
     * <p>
     * The name of the fleet to display.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     */
    private String displayName;

    /**
     * <p>
     * The identifier used by users to sign into the Amazon WorkLink app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     */
    private String companyCode;

    /**
     * <p>
     * The status of the fleet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, ACTIVE, DELETING, DELETED,
     * FAILED_TO_CREATE, FAILED_TO_DELETE
     */
    private String fleetStatus;

    /**
     * <p>
     * The tags attached to the resource. A tag is a key-value pair.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the fleet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the fleet.
     *         </p>
     */
    public String getFleetArn() {
        return fleetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the fleet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param fleetArn <p>
     *            The Amazon Resource Name (ARN) of the fleet.
     *            </p>
     */
    public void setFleetArn(String fleetArn) {
        this.fleetArn = fleetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the fleet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param fleetArn <p>
     *            The Amazon Resource Name (ARN) of the fleet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FleetSummary withFleetArn(String fleetArn) {
        this.fleetArn = fleetArn;
        return this;
    }

    /**
     * <p>
     * The time when the fleet was created.
     * </p>
     *
     * @return <p>
     *         The time when the fleet was created.
     *         </p>
     */
    public java.util.Date getCreatedTime() {
        return createdTime;
    }

    /**
     * <p>
     * The time when the fleet was created.
     * </p>
     *
     * @param createdTime <p>
     *            The time when the fleet was created.
     *            </p>
     */
    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The time when the fleet was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdTime <p>
     *            The time when the fleet was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FleetSummary withCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * <p>
     * The time when the fleet was last updated.
     * </p>
     *
     * @return <p>
     *         The time when the fleet was last updated.
     *         </p>
     */
    public java.util.Date getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    /**
     * <p>
     * The time when the fleet was last updated.
     * </p>
     *
     * @param lastUpdatedTime <p>
     *            The time when the fleet was last updated.
     *            </p>
     */
    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The time when the fleet was last updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdatedTime <p>
     *            The time when the fleet was last updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FleetSummary withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
        return this;
    }

    /**
     * <p>
     * The name of the fleet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 48<br/>
     * <b>Pattern: </b>^[a-z0-9](?:[a-z0-9\-]{0,46}[a-z0-9])?$<br/>
     *
     * @return <p>
     *         The name of the fleet.
     *         </p>
     */
    public String getFleetName() {
        return fleetName;
    }

    /**
     * <p>
     * The name of the fleet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 48<br/>
     * <b>Pattern: </b>^[a-z0-9](?:[a-z0-9\-]{0,46}[a-z0-9])?$<br/>
     *
     * @param fleetName <p>
     *            The name of the fleet.
     *            </p>
     */
    public void setFleetName(String fleetName) {
        this.fleetName = fleetName;
    }

    /**
     * <p>
     * The name of the fleet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 48<br/>
     * <b>Pattern: </b>^[a-z0-9](?:[a-z0-9\-]{0,46}[a-z0-9])?$<br/>
     *
     * @param fleetName <p>
     *            The name of the fleet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FleetSummary withFleetName(String fleetName) {
        this.fleetName = fleetName;
        return this;
    }

    /**
     * <p>
     * The name of the fleet to display.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     *
     * @return <p>
     *         The name of the fleet to display.
     *         </p>
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * <p>
     * The name of the fleet to display.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     *
     * @param displayName <p>
     *            The name of the fleet to display.
     *            </p>
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The name of the fleet to display.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     *
     * @param displayName <p>
     *            The name of the fleet to display.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FleetSummary withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * <p>
     * The identifier used by users to sign into the Amazon WorkLink app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     *
     * @return <p>
     *         The identifier used by users to sign into the Amazon WorkLink
     *         app.
     *         </p>
     */
    public String getCompanyCode() {
        return companyCode;
    }

    /**
     * <p>
     * The identifier used by users to sign into the Amazon WorkLink app.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     *
     * @param companyCode <p>
     *            The identifier used by users to sign into the Amazon WorkLink
     *            app.
     *            </p>
     */
    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    /**
     * <p>
     * The identifier used by users to sign into the Amazon WorkLink app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     *
     * @param companyCode <p>
     *            The identifier used by users to sign into the Amazon WorkLink
     *            app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FleetSummary withCompanyCode(String companyCode) {
        this.companyCode = companyCode;
        return this;
    }

    /**
     * <p>
     * The status of the fleet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, ACTIVE, DELETING, DELETED,
     * FAILED_TO_CREATE, FAILED_TO_DELETE
     *
     * @return <p>
     *         The status of the fleet.
     *         </p>
     * @see FleetStatus
     */
    public String getFleetStatus() {
        return fleetStatus;
    }

    /**
     * <p>
     * The status of the fleet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, ACTIVE, DELETING, DELETED,
     * FAILED_TO_CREATE, FAILED_TO_DELETE
     *
     * @param fleetStatus <p>
     *            The status of the fleet.
     *            </p>
     * @see FleetStatus
     */
    public void setFleetStatus(String fleetStatus) {
        this.fleetStatus = fleetStatus;
    }

    /**
     * <p>
     * The status of the fleet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, ACTIVE, DELETING, DELETED,
     * FAILED_TO_CREATE, FAILED_TO_DELETE
     *
     * @param fleetStatus <p>
     *            The status of the fleet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FleetStatus
     */
    public FleetSummary withFleetStatus(String fleetStatus) {
        this.fleetStatus = fleetStatus;
        return this;
    }

    /**
     * <p>
     * The status of the fleet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, ACTIVE, DELETING, DELETED,
     * FAILED_TO_CREATE, FAILED_TO_DELETE
     *
     * @param fleetStatus <p>
     *            The status of the fleet.
     *            </p>
     * @see FleetStatus
     */
    public void setFleetStatus(FleetStatus fleetStatus) {
        this.fleetStatus = fleetStatus.toString();
    }

    /**
     * <p>
     * The status of the fleet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, ACTIVE, DELETING, DELETED,
     * FAILED_TO_CREATE, FAILED_TO_DELETE
     *
     * @param fleetStatus <p>
     *            The status of the fleet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FleetStatus
     */
    public FleetSummary withFleetStatus(FleetStatus fleetStatus) {
        this.fleetStatus = fleetStatus.toString();
        return this;
    }

    /**
     * <p>
     * The tags attached to the resource. A tag is a key-value pair.
     * </p>
     *
     * @return <p>
     *         The tags attached to the resource. A tag is a key-value pair.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags attached to the resource. A tag is a key-value pair.
     * </p>
     *
     * @param tags <p>
     *            The tags attached to the resource. A tag is a key-value pair.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags attached to the resource. A tag is a key-value pair.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags attached to the resource. A tag is a key-value pair.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FleetSummary withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * The tags attached to the resource. A tag is a key-value pair.
     * </p>
     * <p>
     * The method adds a new key-value pair into Tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Tags.
     * @param value The corresponding value of the entry to be added into Tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FleetSummary addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public FleetSummary clearTagsEntries() {
        this.tags = null;
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
        if (getFleetArn() != null)
            sb.append("FleetArn: " + getFleetArn() + ",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: " + getCreatedTime() + ",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: " + getLastUpdatedTime() + ",");
        if (getFleetName() != null)
            sb.append("FleetName: " + getFleetName() + ",");
        if (getDisplayName() != null)
            sb.append("DisplayName: " + getDisplayName() + ",");
        if (getCompanyCode() != null)
            sb.append("CompanyCode: " + getCompanyCode() + ",");
        if (getFleetStatus() != null)
            sb.append("FleetStatus: " + getFleetStatus() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFleetArn() == null) ? 0 : getFleetArn().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getFleetName() == null) ? 0 : getFleetName().hashCode());
        hashCode = prime * hashCode
                + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode
                + ((getCompanyCode() == null) ? 0 : getCompanyCode().hashCode());
        hashCode = prime * hashCode
                + ((getFleetStatus() == null) ? 0 : getFleetStatus().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FleetSummary == false)
            return false;
        FleetSummary other = (FleetSummary) obj;

        if (other.getFleetArn() == null ^ this.getFleetArn() == null)
            return false;
        if (other.getFleetArn() != null && other.getFleetArn().equals(this.getFleetArn()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null
                && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null
                && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getFleetName() == null ^ this.getFleetName() == null)
            return false;
        if (other.getFleetName() != null
                && other.getFleetName().equals(this.getFleetName()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null
                && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getCompanyCode() == null ^ this.getCompanyCode() == null)
            return false;
        if (other.getCompanyCode() != null
                && other.getCompanyCode().equals(this.getCompanyCode()) == false)
            return false;
        if (other.getFleetStatus() == null ^ this.getFleetStatus() == null)
            return false;
        if (other.getFleetStatus() != null
                && other.getFleetStatus().equals(this.getFleetStatus()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
