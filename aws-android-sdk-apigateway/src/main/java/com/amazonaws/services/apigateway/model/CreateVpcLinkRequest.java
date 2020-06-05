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

package com.amazonaws.services.apigateway.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a VPC link, under the caller's account in a selected region, in an
 * asynchronous operation that typically takes 2-4 minutes to complete and
 * become operational. The caller must have permissions to create and update VPC
 * Endpoint services.
 * </p>
 */
public class CreateVpcLinkRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * [Required] The name used to label and identify the VPC link.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The description of the VPC link.
     * </p>
     */
    private String description;

    /**
     * <p>
     * [Required] The ARN of the network load balancer of the VPC targeted by
     * the VPC link. The network load balancer must be owned by the same AWS
     * account of the API owner.
     * </p>
     */
    private java.util.List<String> targetArns;

    /**
     * <p>
     * The key-value map of strings. The valid character set is [a-zA-Z+-=._:/].
     * The tag key can be up to 128 characters and must not start with
     * <code>aws:</code>. The tag value can be up to 256 characters.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * [Required] The name used to label and identify the VPC link.
     * </p>
     *
     * @return <p>
     *         [Required] The name used to label and identify the VPC link.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * [Required] The name used to label and identify the VPC link.
     * </p>
     *
     * @param name <p>
     *            [Required] The name used to label and identify the VPC link.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * [Required] The name used to label and identify the VPC link.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            [Required] The name used to label and identify the VPC link.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVpcLinkRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The description of the VPC link.
     * </p>
     *
     * @return <p>
     *         The description of the VPC link.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the VPC link.
     * </p>
     *
     * @param description <p>
     *            The description of the VPC link.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the VPC link.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The description of the VPC link.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVpcLinkRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * [Required] The ARN of the network load balancer of the VPC targeted by
     * the VPC link. The network load balancer must be owned by the same AWS
     * account of the API owner.
     * </p>
     *
     * @return <p>
     *         [Required] The ARN of the network load balancer of the VPC
     *         targeted by the VPC link. The network load balancer must be owned
     *         by the same AWS account of the API owner.
     *         </p>
     */
    public java.util.List<String> getTargetArns() {
        return targetArns;
    }

    /**
     * <p>
     * [Required] The ARN of the network load balancer of the VPC targeted by
     * the VPC link. The network load balancer must be owned by the same AWS
     * account of the API owner.
     * </p>
     *
     * @param targetArns <p>
     *            [Required] The ARN of the network load balancer of the VPC
     *            targeted by the VPC link. The network load balancer must be
     *            owned by the same AWS account of the API owner.
     *            </p>
     */
    public void setTargetArns(java.util.Collection<String> targetArns) {
        if (targetArns == null) {
            this.targetArns = null;
            return;
        }

        this.targetArns = new java.util.ArrayList<String>(targetArns);
    }

    /**
     * <p>
     * [Required] The ARN of the network load balancer of the VPC targeted by
     * the VPC link. The network load balancer must be owned by the same AWS
     * account of the API owner.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetArns <p>
     *            [Required] The ARN of the network load balancer of the VPC
     *            targeted by the VPC link. The network load balancer must be
     *            owned by the same AWS account of the API owner.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVpcLinkRequest withTargetArns(String... targetArns) {
        if (getTargetArns() == null) {
            this.targetArns = new java.util.ArrayList<String>(targetArns.length);
        }
        for (String value : targetArns) {
            this.targetArns.add(value);
        }
        return this;
    }

    /**
     * <p>
     * [Required] The ARN of the network load balancer of the VPC targeted by
     * the VPC link. The network load balancer must be owned by the same AWS
     * account of the API owner.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetArns <p>
     *            [Required] The ARN of the network load balancer of the VPC
     *            targeted by the VPC link. The network load balancer must be
     *            owned by the same AWS account of the API owner.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVpcLinkRequest withTargetArns(java.util.Collection<String> targetArns) {
        setTargetArns(targetArns);
        return this;
    }

    /**
     * <p>
     * The key-value map of strings. The valid character set is [a-zA-Z+-=._:/].
     * The tag key can be up to 128 characters and must not start with
     * <code>aws:</code>. The tag value can be up to 256 characters.
     * </p>
     *
     * @return <p>
     *         The key-value map of strings. The valid character set is
     *         [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and must
     *         not start with <code>aws:</code>. The tag value can be up to 256
     *         characters.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The key-value map of strings. The valid character set is [a-zA-Z+-=._:/].
     * The tag key can be up to 128 characters and must not start with
     * <code>aws:</code>. The tag value can be up to 256 characters.
     * </p>
     *
     * @param tags <p>
     *            The key-value map of strings. The valid character set is
     *            [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and
     *            must not start with <code>aws:</code>. The tag value can be up
     *            to 256 characters.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The key-value map of strings. The valid character set is [a-zA-Z+-=._:/].
     * The tag key can be up to 128 characters and must not start with
     * <code>aws:</code>. The tag value can be up to 256 characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The key-value map of strings. The valid character set is
     *            [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and
     *            must not start with <code>aws:</code>. The tag value can be up
     *            to 256 characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVpcLinkRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * The key-value map of strings. The valid character set is [a-zA-Z+-=._:/].
     * The tag key can be up to 128 characters and must not start with
     * <code>aws:</code>. The tag value can be up to 256 characters.
     * </p>
     * <p>
     * The method adds a new key-value pair into tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into tags.
     * @param value The corresponding value of the entry to be added into tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateVpcLinkRequest addtagsEntry(String key, String value) {
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
     * Removes all the entries added into tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateVpcLinkRequest cleartagsEntries() {
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
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getTargetArns() != null)
            sb.append("targetArns: " + getTargetArns() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTargetArns() == null) ? 0 : getTargetArns().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateVpcLinkRequest == false)
            return false;
        CreateVpcLinkRequest other = (CreateVpcLinkRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTargetArns() == null ^ this.getTargetArns() == null)
            return false;
        if (other.getTargetArns() != null
                && other.getTargetArns().equals(this.getTargetArns()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
