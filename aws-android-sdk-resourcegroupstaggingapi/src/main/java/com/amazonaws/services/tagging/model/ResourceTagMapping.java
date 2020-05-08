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
 * A list of resource ARNs and the tags (keys and values) that are associated
 * with each.
 * </p>
 */
public class ResourceTagMapping implements Serializable {
    /**
     * <p>
     * The ARN of the resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1011<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     */
    private String resourceARN;

    /**
     * <p>
     * The tags that have been applied to one or more AWS resources.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Information that shows whether a resource is compliant with the effective
     * tag policy, including details on any noncompliant tag keys.
     * </p>
     */
    private ComplianceDetails complianceDetails;

    /**
     * <p>
     * The ARN of the resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1011<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @return <p>
     *         The ARN of the resource.
     *         </p>
     */
    public String getResourceARN() {
        return resourceARN;
    }

    /**
     * <p>
     * The ARN of the resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1011<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @param resourceARN <p>
     *            The ARN of the resource.
     *            </p>
     */
    public void setResourceARN(String resourceARN) {
        this.resourceARN = resourceARN;
    }

    /**
     * <p>
     * The ARN of the resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1011<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @param resourceARN <p>
     *            The ARN of the resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceTagMapping withResourceARN(String resourceARN) {
        this.resourceARN = resourceARN;
        return this;
    }

    /**
     * <p>
     * The tags that have been applied to one or more AWS resources.
     * </p>
     *
     * @return <p>
     *         The tags that have been applied to one or more AWS resources.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags that have been applied to one or more AWS resources.
     * </p>
     *
     * @param tags <p>
     *            The tags that have been applied to one or more AWS resources.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tags that have been applied to one or more AWS resources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags that have been applied to one or more AWS resources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceTagMapping withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The tags that have been applied to one or more AWS resources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags that have been applied to one or more AWS resources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceTagMapping withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Information that shows whether a resource is compliant with the effective
     * tag policy, including details on any noncompliant tag keys.
     * </p>
     *
     * @return <p>
     *         Information that shows whether a resource is compliant with the
     *         effective tag policy, including details on any noncompliant tag
     *         keys.
     *         </p>
     */
    public ComplianceDetails getComplianceDetails() {
        return complianceDetails;
    }

    /**
     * <p>
     * Information that shows whether a resource is compliant with the effective
     * tag policy, including details on any noncompliant tag keys.
     * </p>
     *
     * @param complianceDetails <p>
     *            Information that shows whether a resource is compliant with
     *            the effective tag policy, including details on any
     *            noncompliant tag keys.
     *            </p>
     */
    public void setComplianceDetails(ComplianceDetails complianceDetails) {
        this.complianceDetails = complianceDetails;
    }

    /**
     * <p>
     * Information that shows whether a resource is compliant with the effective
     * tag policy, including details on any noncompliant tag keys.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param complianceDetails <p>
     *            Information that shows whether a resource is compliant with
     *            the effective tag policy, including details on any
     *            noncompliant tag keys.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceTagMapping withComplianceDetails(ComplianceDetails complianceDetails) {
        this.complianceDetails = complianceDetails;
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
        if (getResourceARN() != null)
            sb.append("ResourceARN: " + getResourceARN() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getComplianceDetails() != null)
            sb.append("ComplianceDetails: " + getComplianceDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getResourceARN() == null) ? 0 : getResourceARN().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getComplianceDetails() == null) ? 0 : getComplianceDetails().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceTagMapping == false)
            return false;
        ResourceTagMapping other = (ResourceTagMapping) obj;

        if (other.getResourceARN() == null ^ this.getResourceARN() == null)
            return false;
        if (other.getResourceARN() != null
                && other.getResourceARN().equals(this.getResourceARN()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getComplianceDetails() == null ^ this.getComplianceDetails() == null)
            return false;
        if (other.getComplianceDetails() != null
                && other.getComplianceDetails().equals(this.getComplianceDetails()) == false)
            return false;
        return true;
    }
}
