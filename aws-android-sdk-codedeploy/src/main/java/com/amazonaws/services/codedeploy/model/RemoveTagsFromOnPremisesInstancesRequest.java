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

package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Removes one or more tags from one or more on-premises instances.
 * </p>
 */
public class RemoveTagsFromOnPremisesInstancesRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The tag key-value pairs to remove from the on-premises instances.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The names of the on-premises instances from which to remove tags.
     * </p>
     */
    private java.util.List<String> instanceNames;

    /**
     * <p>
     * The tag key-value pairs to remove from the on-premises instances.
     * </p>
     *
     * @return <p>
     *         The tag key-value pairs to remove from the on-premises instances.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tag key-value pairs to remove from the on-premises instances.
     * </p>
     *
     * @param tags <p>
     *            The tag key-value pairs to remove from the on-premises
     *            instances.
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
     * The tag key-value pairs to remove from the on-premises instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tag key-value pairs to remove from the on-premises
     *            instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RemoveTagsFromOnPremisesInstancesRequest withTags(Tag... tags) {
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
     * The tag key-value pairs to remove from the on-premises instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tag key-value pairs to remove from the on-premises
     *            instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RemoveTagsFromOnPremisesInstancesRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The names of the on-premises instances from which to remove tags.
     * </p>
     *
     * @return <p>
     *         The names of the on-premises instances from which to remove tags.
     *         </p>
     */
    public java.util.List<String> getInstanceNames() {
        return instanceNames;
    }

    /**
     * <p>
     * The names of the on-premises instances from which to remove tags.
     * </p>
     *
     * @param instanceNames <p>
     *            The names of the on-premises instances from which to remove
     *            tags.
     *            </p>
     */
    public void setInstanceNames(java.util.Collection<String> instanceNames) {
        if (instanceNames == null) {
            this.instanceNames = null;
            return;
        }

        this.instanceNames = new java.util.ArrayList<String>(instanceNames);
    }

    /**
     * <p>
     * The names of the on-premises instances from which to remove tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceNames <p>
     *            The names of the on-premises instances from which to remove
     *            tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RemoveTagsFromOnPremisesInstancesRequest withInstanceNames(String... instanceNames) {
        if (getInstanceNames() == null) {
            this.instanceNames = new java.util.ArrayList<String>(instanceNames.length);
        }
        for (String value : instanceNames) {
            this.instanceNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The names of the on-premises instances from which to remove tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceNames <p>
     *            The names of the on-premises instances from which to remove
     *            tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RemoveTagsFromOnPremisesInstancesRequest withInstanceNames(
            java.util.Collection<String> instanceNames) {
        setInstanceNames(instanceNames);
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
        if (getTags() != null)
            sb.append("tags: " + getTags() + ",");
        if (getInstanceNames() != null)
            sb.append("instanceNames: " + getInstanceNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceNames() == null) ? 0 : getInstanceNames().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemoveTagsFromOnPremisesInstancesRequest == false)
            return false;
        RemoveTagsFromOnPremisesInstancesRequest other = (RemoveTagsFromOnPremisesInstancesRequest) obj;

        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getInstanceNames() == null ^ this.getInstanceNames() == null)
            return false;
        if (other.getInstanceNames() != null
                && other.getInstanceNames().equals(this.getInstanceNames()) == false)
            return false;
        return true;
    }
}
