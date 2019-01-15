/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.elasticloadbalancing.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Removes one or more tags from the specified load balancer.
 * </p>
 */
public class RemoveTagsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the load balancer. You can specify a maximum of one load
     * balancer name.
     * </p>
     */
    private java.util.List<String> loadBalancerNames = new java.util.ArrayList<String>();

    /**
     * <p>
     * The list of tag keys to remove.
     * </p>
     */
    private java.util.List<TagKeyOnly> tags = new java.util.ArrayList<TagKeyOnly>();

    /**
     * <p>
     * The name of the load balancer. You can specify a maximum of one load
     * balancer name.
     * </p>
     *
     * @return <p>
     *         The name of the load balancer. You can specify a maximum of one
     *         load balancer name.
     *         </p>
     */
    public java.util.List<String> getLoadBalancerNames() {
        return loadBalancerNames;
    }

    /**
     * <p>
     * The name of the load balancer. You can specify a maximum of one load
     * balancer name.
     * </p>
     *
     * @param loadBalancerNames <p>
     *            The name of the load balancer. You can specify a maximum of
     *            one load balancer name.
     *            </p>
     */
    public void setLoadBalancerNames(java.util.Collection<String> loadBalancerNames) {
        if (loadBalancerNames == null) {
            this.loadBalancerNames = null;
            return;
        }

        this.loadBalancerNames = new java.util.ArrayList<String>(loadBalancerNames);
    }

    /**
     * <p>
     * The name of the load balancer. You can specify a maximum of one load
     * balancer name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loadBalancerNames <p>
     *            The name of the load balancer. You can specify a maximum of
     *            one load balancer name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RemoveTagsRequest withLoadBalancerNames(String... loadBalancerNames) {
        if (getLoadBalancerNames() == null) {
            this.loadBalancerNames = new java.util.ArrayList<String>(loadBalancerNames.length);
        }
        for (String value : loadBalancerNames) {
            this.loadBalancerNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The name of the load balancer. You can specify a maximum of one load
     * balancer name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loadBalancerNames <p>
     *            The name of the load balancer. You can specify a maximum of
     *            one load balancer name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RemoveTagsRequest withLoadBalancerNames(java.util.Collection<String> loadBalancerNames) {
        setLoadBalancerNames(loadBalancerNames);
        return this;
    }

    /**
     * <p>
     * The list of tag keys to remove.
     * </p>
     *
     * @return <p>
     *         The list of tag keys to remove.
     *         </p>
     */
    public java.util.List<TagKeyOnly> getTags() {
        return tags;
    }

    /**
     * <p>
     * The list of tag keys to remove.
     * </p>
     *
     * @param tags <p>
     *            The list of tag keys to remove.
     *            </p>
     */
    public void setTags(java.util.Collection<TagKeyOnly> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<TagKeyOnly>(tags);
    }

    /**
     * <p>
     * The list of tag keys to remove.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The list of tag keys to remove.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RemoveTagsRequest withTags(TagKeyOnly... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<TagKeyOnly>(tags.length);
        }
        for (TagKeyOnly value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of tag keys to remove.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The list of tag keys to remove.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RemoveTagsRequest withTags(java.util.Collection<TagKeyOnly> tags) {
        setTags(tags);
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
        if (getLoadBalancerNames() != null)
            sb.append("LoadBalancerNames: " + getLoadBalancerNames() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLoadBalancerNames() == null) ? 0 : getLoadBalancerNames().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemoveTagsRequest == false)
            return false;
        RemoveTagsRequest other = (RemoveTagsRequest) obj;

        if (other.getLoadBalancerNames() == null ^ this.getLoadBalancerNames() == null)
            return false;
        if (other.getLoadBalancerNames() != null
                && other.getLoadBalancerNames().equals(this.getLoadBalancerNames()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
