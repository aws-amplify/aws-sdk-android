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

package com.amazonaws.services.tagging.model;

import java.io.Serializable;

/**
 * <p>
 * A count of noncompliant resources.
 * </p>
 */
public class Summary implements Serializable {
    /**
     * <p>
     * The timestamp that shows when this summary was generated in this Region.
     * </p>
     */
    private String lastUpdated;

    /**
     * <p>
     * The account identifier or the root identifier of the organization. If you
     * don't know the root ID, you can call the AWS Organizations <a href=
     * "http://docs.aws.amazon.com/organizations/latest/APIReference/API_ListRoots.html"
     * >ListRoots</a> API.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 68<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     */
    private String targetId;

    /**
     * <p>
     * Whether the target is an account, an OU, or the organization root.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCOUNT, OU, ROOT
     */
    private String targetIdType;

    /**
     * <p>
     * The AWS Region that the summary applies to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     */
    private String region;

    /**
     * <p>
     * The AWS resource type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     */
    private String resourceType;

    /**
     * <p>
     * The count of noncompliant resources.
     * </p>
     */
    private Long nonCompliantResources;

    /**
     * <p>
     * The timestamp that shows when this summary was generated in this Region.
     * </p>
     *
     * @return <p>
     *         The timestamp that shows when this summary was generated in this
     *         Region.
     *         </p>
     */
    public String getLastUpdated() {
        return lastUpdated;
    }

    /**
     * <p>
     * The timestamp that shows when this summary was generated in this Region.
     * </p>
     *
     * @param lastUpdated <p>
     *            The timestamp that shows when this summary was generated in
     *            this Region.
     *            </p>
     */
    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * <p>
     * The timestamp that shows when this summary was generated in this Region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdated <p>
     *            The timestamp that shows when this summary was generated in
     *            this Region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Summary withLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
        return this;
    }

    /**
     * <p>
     * The account identifier or the root identifier of the organization. If you
     * don't know the root ID, you can call the AWS Organizations <a href=
     * "http://docs.aws.amazon.com/organizations/latest/APIReference/API_ListRoots.html"
     * >ListRoots</a> API.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 68<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @return <p>
     *         The account identifier or the root identifier of the
     *         organization. If you don't know the root ID, you can call the AWS
     *         Organizations <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/APIReference/API_ListRoots.html"
     *         >ListRoots</a> API.
     *         </p>
     */
    public String getTargetId() {
        return targetId;
    }

    /**
     * <p>
     * The account identifier or the root identifier of the organization. If you
     * don't know the root ID, you can call the AWS Organizations <a href=
     * "http://docs.aws.amazon.com/organizations/latest/APIReference/API_ListRoots.html"
     * >ListRoots</a> API.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 68<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @param targetId <p>
     *            The account identifier or the root identifier of the
     *            organization. If you don't know the root ID, you can call the
     *            AWS Organizations <a href=
     *            "http://docs.aws.amazon.com/organizations/latest/APIReference/API_ListRoots.html"
     *            >ListRoots</a> API.
     *            </p>
     */
    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    /**
     * <p>
     * The account identifier or the root identifier of the organization. If you
     * don't know the root ID, you can call the AWS Organizations <a href=
     * "http://docs.aws.amazon.com/organizations/latest/APIReference/API_ListRoots.html"
     * >ListRoots</a> API.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 68<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @param targetId <p>
     *            The account identifier or the root identifier of the
     *            organization. If you don't know the root ID, you can call the
     *            AWS Organizations <a href=
     *            "http://docs.aws.amazon.com/organizations/latest/APIReference/API_ListRoots.html"
     *            >ListRoots</a> API.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Summary withTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }

    /**
     * <p>
     * Whether the target is an account, an OU, or the organization root.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCOUNT, OU, ROOT
     *
     * @return <p>
     *         Whether the target is an account, an OU, or the organization
     *         root.
     *         </p>
     * @see TargetIdType
     */
    public String getTargetIdType() {
        return targetIdType;
    }

    /**
     * <p>
     * Whether the target is an account, an OU, or the organization root.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCOUNT, OU, ROOT
     *
     * @param targetIdType <p>
     *            Whether the target is an account, an OU, or the organization
     *            root.
     *            </p>
     * @see TargetIdType
     */
    public void setTargetIdType(String targetIdType) {
        this.targetIdType = targetIdType;
    }

    /**
     * <p>
     * Whether the target is an account, an OU, or the organization root.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCOUNT, OU, ROOT
     *
     * @param targetIdType <p>
     *            Whether the target is an account, an OU, or the organization
     *            root.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TargetIdType
     */
    public Summary withTargetIdType(String targetIdType) {
        this.targetIdType = targetIdType;
        return this;
    }

    /**
     * <p>
     * Whether the target is an account, an OU, or the organization root.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCOUNT, OU, ROOT
     *
     * @param targetIdType <p>
     *            Whether the target is an account, an OU, or the organization
     *            root.
     *            </p>
     * @see TargetIdType
     */
    public void setTargetIdType(TargetIdType targetIdType) {
        this.targetIdType = targetIdType.toString();
    }

    /**
     * <p>
     * Whether the target is an account, an OU, or the organization root.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCOUNT, OU, ROOT
     *
     * @param targetIdType <p>
     *            Whether the target is an account, an OU, or the organization
     *            root.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TargetIdType
     */
    public Summary withTargetIdType(TargetIdType targetIdType) {
        this.targetIdType = targetIdType.toString();
        return this;
    }

    /**
     * <p>
     * The AWS Region that the summary applies to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @return <p>
     *         The AWS Region that the summary applies to.
     *         </p>
     */
    public String getRegion() {
        return region;
    }

    /**
     * <p>
     * The AWS Region that the summary applies to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @param region <p>
     *            The AWS Region that the summary applies to.
     *            </p>
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The AWS Region that the summary applies to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @param region <p>
     *            The AWS Region that the summary applies to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Summary withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * <p>
     * The AWS resource type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @return <p>
     *         The AWS resource type.
     *         </p>
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * The AWS resource type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @param resourceType <p>
     *            The AWS resource type.
     *            </p>
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The AWS resource type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @param resourceType <p>
     *            The AWS resource type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Summary withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * <p>
     * The count of noncompliant resources.
     * </p>
     *
     * @return <p>
     *         The count of noncompliant resources.
     *         </p>
     */
    public Long getNonCompliantResources() {
        return nonCompliantResources;
    }

    /**
     * <p>
     * The count of noncompliant resources.
     * </p>
     *
     * @param nonCompliantResources <p>
     *            The count of noncompliant resources.
     *            </p>
     */
    public void setNonCompliantResources(Long nonCompliantResources) {
        this.nonCompliantResources = nonCompliantResources;
    }

    /**
     * <p>
     * The count of noncompliant resources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nonCompliantResources <p>
     *            The count of noncompliant resources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Summary withNonCompliantResources(Long nonCompliantResources) {
        this.nonCompliantResources = nonCompliantResources;
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
        if (getLastUpdated() != null)
            sb.append("LastUpdated: " + getLastUpdated() + ",");
        if (getTargetId() != null)
            sb.append("TargetId: " + getTargetId() + ",");
        if (getTargetIdType() != null)
            sb.append("TargetIdType: " + getTargetIdType() + ",");
        if (getRegion() != null)
            sb.append("Region: " + getRegion() + ",");
        if (getResourceType() != null)
            sb.append("ResourceType: " + getResourceType() + ",");
        if (getNonCompliantResources() != null)
            sb.append("NonCompliantResources: " + getNonCompliantResources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLastUpdated() == null) ? 0 : getLastUpdated().hashCode());
        hashCode = prime * hashCode + ((getTargetId() == null) ? 0 : getTargetId().hashCode());
        hashCode = prime * hashCode
                + ((getTargetIdType() == null) ? 0 : getTargetIdType().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode
                + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime
                * hashCode
                + ((getNonCompliantResources() == null) ? 0 : getNonCompliantResources().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Summary == false)
            return false;
        Summary other = (Summary) obj;

        if (other.getLastUpdated() == null ^ this.getLastUpdated() == null)
            return false;
        if (other.getLastUpdated() != null
                && other.getLastUpdated().equals(this.getLastUpdated()) == false)
            return false;
        if (other.getTargetId() == null ^ this.getTargetId() == null)
            return false;
        if (other.getTargetId() != null && other.getTargetId().equals(this.getTargetId()) == false)
            return false;
        if (other.getTargetIdType() == null ^ this.getTargetIdType() == null)
            return false;
        if (other.getTargetIdType() != null
                && other.getTargetIdType().equals(this.getTargetIdType()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null
                && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getNonCompliantResources() == null ^ this.getNonCompliantResources() == null)
            return false;
        if (other.getNonCompliantResources() != null
                && other.getNonCompliantResources().equals(this.getNonCompliantResources()) == false)
            return false;
        return true;
    }
}
