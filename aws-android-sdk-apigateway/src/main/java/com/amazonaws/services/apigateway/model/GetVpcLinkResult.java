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

/**
 * <p>
 * An API Gateway VPC link for a <a>RestApi</a> to access resources in an Amazon
 * Virtual Private Cloud (VPC).
 * </p>
 * <div class="remarks">
 * <p>
 * <p>
 * To enable access to a resource in an Amazon Virtual Private Cloud through
 * Amazon API Gateway, you, as an API developer, create a <a>VpcLink</a>
 * resource targeted for one or more network load balancers of the VPC and then
 * integrate an API method with a private integration that uses the
 * <a>VpcLink</a>. The private integration has an integration type of
 * <code>HTTP</code> or <code>HTTP_PROXY</code> and has a connection type of
 * <code>VPC_LINK</code>. The integration uses the <code>connectionId</code>
 * property to identify the <a>VpcLink</a> used.
 * </p>
 * </p> </div>
 */
public class GetVpcLinkResult implements Serializable {
    /**
     * <p>
     * The identifier of the <a>VpcLink</a>. It is used in an <a>Integration</a>
     * to reference this <a>VpcLink</a>.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The name used to label and identify the VPC link.
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
     * The ARN of the network load balancer of the VPC targeted by the VPC link.
     * The network load balancer must be owned by the same AWS account of the
     * API owner.
     * </p>
     */
    private java.util.List<String> targetArns;

    /**
     * <p>
     * The status of the VPC link. The valid values are <code>AVAILABLE</code>,
     * <code>PENDING</code>, <code>DELETING</code>, or <code>FAILED</code>.
     * Deploying an API will wait if the status is <code>PENDING</code> and will
     * fail if the status is <code>DELETING</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, PENDING, DELETING, FAILED
     */
    private String status;

    /**
     * <p>
     * A description about the VPC link status.
     * </p>
     */
    private String statusMessage;

    /**
     * <p>
     * The collection of tags. Each tag element is associated with a given
     * resource.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The identifier of the <a>VpcLink</a>. It is used in an <a>Integration</a>
     * to reference this <a>VpcLink</a>.
     * </p>
     *
     * @return <p>
     *         The identifier of the <a>VpcLink</a>. It is used in an
     *         <a>Integration</a> to reference this <a>VpcLink</a>.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The identifier of the <a>VpcLink</a>. It is used in an <a>Integration</a>
     * to reference this <a>VpcLink</a>.
     * </p>
     *
     * @param id <p>
     *            The identifier of the <a>VpcLink</a>. It is used in an
     *            <a>Integration</a> to reference this <a>VpcLink</a>.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the <a>VpcLink</a>. It is used in an <a>Integration</a>
     * to reference this <a>VpcLink</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The identifier of the <a>VpcLink</a>. It is used in an
     *            <a>Integration</a> to reference this <a>VpcLink</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetVpcLinkResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The name used to label and identify the VPC link.
     * </p>
     *
     * @return <p>
     *         The name used to label and identify the VPC link.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name used to label and identify the VPC link.
     * </p>
     *
     * @param name <p>
     *            The name used to label and identify the VPC link.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name used to label and identify the VPC link.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name used to label and identify the VPC link.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetVpcLinkResult withName(String name) {
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
    public GetVpcLinkResult withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The ARN of the network load balancer of the VPC targeted by the VPC link.
     * The network load balancer must be owned by the same AWS account of the
     * API owner.
     * </p>
     *
     * @return <p>
     *         The ARN of the network load balancer of the VPC targeted by the
     *         VPC link. The network load balancer must be owned by the same AWS
     *         account of the API owner.
     *         </p>
     */
    public java.util.List<String> getTargetArns() {
        return targetArns;
    }

    /**
     * <p>
     * The ARN of the network load balancer of the VPC targeted by the VPC link.
     * The network load balancer must be owned by the same AWS account of the
     * API owner.
     * </p>
     *
     * @param targetArns <p>
     *            The ARN of the network load balancer of the VPC targeted by
     *            the VPC link. The network load balancer must be owned by the
     *            same AWS account of the API owner.
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
     * The ARN of the network load balancer of the VPC targeted by the VPC link.
     * The network load balancer must be owned by the same AWS account of the
     * API owner.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetArns <p>
     *            The ARN of the network load balancer of the VPC targeted by
     *            the VPC link. The network load balancer must be owned by the
     *            same AWS account of the API owner.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetVpcLinkResult withTargetArns(String... targetArns) {
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
     * The ARN of the network load balancer of the VPC targeted by the VPC link.
     * The network load balancer must be owned by the same AWS account of the
     * API owner.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetArns <p>
     *            The ARN of the network load balancer of the VPC targeted by
     *            the VPC link. The network load balancer must be owned by the
     *            same AWS account of the API owner.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetVpcLinkResult withTargetArns(java.util.Collection<String> targetArns) {
        setTargetArns(targetArns);
        return this;
    }

    /**
     * <p>
     * The status of the VPC link. The valid values are <code>AVAILABLE</code>,
     * <code>PENDING</code>, <code>DELETING</code>, or <code>FAILED</code>.
     * Deploying an API will wait if the status is <code>PENDING</code> and will
     * fail if the status is <code>DELETING</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, PENDING, DELETING, FAILED
     *
     * @return <p>
     *         The status of the VPC link. The valid values are
     *         <code>AVAILABLE</code>, <code>PENDING</code>,
     *         <code>DELETING</code>, or <code>FAILED</code>. Deploying an API
     *         will wait if the status is <code>PENDING</code> and will fail if
     *         the status is <code>DELETING</code>.
     *         </p>
     * @see VpcLinkStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the VPC link. The valid values are <code>AVAILABLE</code>,
     * <code>PENDING</code>, <code>DELETING</code>, or <code>FAILED</code>.
     * Deploying an API will wait if the status is <code>PENDING</code> and will
     * fail if the status is <code>DELETING</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, PENDING, DELETING, FAILED
     *
     * @param status <p>
     *            The status of the VPC link. The valid values are
     *            <code>AVAILABLE</code>, <code>PENDING</code>,
     *            <code>DELETING</code>, or <code>FAILED</code>. Deploying an
     *            API will wait if the status is <code>PENDING</code> and will
     *            fail if the status is <code>DELETING</code>.
     *            </p>
     * @see VpcLinkStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the VPC link. The valid values are <code>AVAILABLE</code>,
     * <code>PENDING</code>, <code>DELETING</code>, or <code>FAILED</code>.
     * Deploying an API will wait if the status is <code>PENDING</code> and will
     * fail if the status is <code>DELETING</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, PENDING, DELETING, FAILED
     *
     * @param status <p>
     *            The status of the VPC link. The valid values are
     *            <code>AVAILABLE</code>, <code>PENDING</code>,
     *            <code>DELETING</code>, or <code>FAILED</code>. Deploying an
     *            API will wait if the status is <code>PENDING</code> and will
     *            fail if the status is <code>DELETING</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VpcLinkStatus
     */
    public GetVpcLinkResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the VPC link. The valid values are <code>AVAILABLE</code>,
     * <code>PENDING</code>, <code>DELETING</code>, or <code>FAILED</code>.
     * Deploying an API will wait if the status is <code>PENDING</code> and will
     * fail if the status is <code>DELETING</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, PENDING, DELETING, FAILED
     *
     * @param status <p>
     *            The status of the VPC link. The valid values are
     *            <code>AVAILABLE</code>, <code>PENDING</code>,
     *            <code>DELETING</code>, or <code>FAILED</code>. Deploying an
     *            API will wait if the status is <code>PENDING</code> and will
     *            fail if the status is <code>DELETING</code>.
     *            </p>
     * @see VpcLinkStatus
     */
    public void setStatus(VpcLinkStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the VPC link. The valid values are <code>AVAILABLE</code>,
     * <code>PENDING</code>, <code>DELETING</code>, or <code>FAILED</code>.
     * Deploying an API will wait if the status is <code>PENDING</code> and will
     * fail if the status is <code>DELETING</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, PENDING, DELETING, FAILED
     *
     * @param status <p>
     *            The status of the VPC link. The valid values are
     *            <code>AVAILABLE</code>, <code>PENDING</code>,
     *            <code>DELETING</code>, or <code>FAILED</code>. Deploying an
     *            API will wait if the status is <code>PENDING</code> and will
     *            fail if the status is <code>DELETING</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VpcLinkStatus
     */
    public GetVpcLinkResult withStatus(VpcLinkStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A description about the VPC link status.
     * </p>
     *
     * @return <p>
     *         A description about the VPC link status.
     *         </p>
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    /**
     * <p>
     * A description about the VPC link status.
     * </p>
     *
     * @param statusMessage <p>
     *            A description about the VPC link status.
     *            </p>
     */
    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * A description about the VPC link status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statusMessage <p>
     *            A description about the VPC link status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetVpcLinkResult withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    /**
     * <p>
     * The collection of tags. Each tag element is associated with a given
     * resource.
     * </p>
     *
     * @return <p>
     *         The collection of tags. Each tag element is associated with a
     *         given resource.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The collection of tags. Each tag element is associated with a given
     * resource.
     * </p>
     *
     * @param tags <p>
     *            The collection of tags. Each tag element is associated with a
     *            given resource.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The collection of tags. Each tag element is associated with a given
     * resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The collection of tags. Each tag element is associated with a
     *            given resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetVpcLinkResult withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * The collection of tags. Each tag element is associated with a given
     * resource.
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
    public GetVpcLinkResult addtagsEntry(String key, String value) {
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
    public GetVpcLinkResult cleartagsEntries() {
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
        if (getId() != null)
            sb.append("id: " + getId() + ",");
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getTargetArns() != null)
            sb.append("targetArns: " + getTargetArns() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getStatusMessage() != null)
            sb.append("statusMessage: " + getStatusMessage() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTargetArns() == null) ? 0 : getTargetArns().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetVpcLinkResult == false)
            return false;
        GetVpcLinkResult other = (GetVpcLinkResult) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
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
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null
                && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
