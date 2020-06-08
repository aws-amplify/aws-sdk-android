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

package com.amazonaws.services.servicediscovery.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a public namespace based on DNS, which will be visible on the
 * internet. The namespace defines your service naming scheme. For example, if
 * you name your namespace <code>example.com</code> and name your service
 * <code>backend</code>, the resulting DNS name for the service will be
 * <code>backend.example.com</code>. For the current limit on the number of
 * namespaces that you can create using the same AWS account, see <a href=
 * "https://docs.aws.amazon.com/cloud-map/latest/dg/cloud-map-limits.html">AWS
 * Cloud Map Limits</a> in the <i>AWS Cloud Map Developer Guide</i>.
 * </p>
 */
public class CreatePublicDnsNamespaceRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name that you want to assign to this namespace.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String name;

    /**
     * <p>
     * A unique string that identifies the request and that allows failed
     * <code>CreatePublicDnsNamespace</code> requests to be retried without the
     * risk of executing the operation twice. <code>CreatorRequestId</code> can
     * be any unique string, for example, a date/time stamp.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     */
    private String creatorRequestId;

    /**
     * <p>
     * A description for the namespace.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String description;

    /**
     * <p>
     * The tags to add to the namespace. Each tag consists of a key and an
     * optional value, both of which you define. Tag keys can have a maximum
     * character length of 128 characters, and tag values can have a maximum
     * length of 256 characters.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name that you want to assign to this namespace.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         The name that you want to assign to this namespace.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name that you want to assign to this namespace.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param name <p>
     *            The name that you want to assign to this namespace.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name that you want to assign to this namespace.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param name <p>
     *            The name that you want to assign to this namespace.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePublicDnsNamespaceRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * A unique string that identifies the request and that allows failed
     * <code>CreatePublicDnsNamespace</code> requests to be retried without the
     * risk of executing the operation twice. <code>CreatorRequestId</code> can
     * be any unique string, for example, a date/time stamp.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @return <p>
     *         A unique string that identifies the request and that allows
     *         failed <code>CreatePublicDnsNamespace</code> requests to be
     *         retried without the risk of executing the operation twice.
     *         <code>CreatorRequestId</code> can be any unique string, for
     *         example, a date/time stamp.
     *         </p>
     */
    public String getCreatorRequestId() {
        return creatorRequestId;
    }

    /**
     * <p>
     * A unique string that identifies the request and that allows failed
     * <code>CreatePublicDnsNamespace</code> requests to be retried without the
     * risk of executing the operation twice. <code>CreatorRequestId</code> can
     * be any unique string, for example, a date/time stamp.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @param creatorRequestId <p>
     *            A unique string that identifies the request and that allows
     *            failed <code>CreatePublicDnsNamespace</code> requests to be
     *            retried without the risk of executing the operation twice.
     *            <code>CreatorRequestId</code> can be any unique string, for
     *            example, a date/time stamp.
     *            </p>
     */
    public void setCreatorRequestId(String creatorRequestId) {
        this.creatorRequestId = creatorRequestId;
    }

    /**
     * <p>
     * A unique string that identifies the request and that allows failed
     * <code>CreatePublicDnsNamespace</code> requests to be retried without the
     * risk of executing the operation twice. <code>CreatorRequestId</code> can
     * be any unique string, for example, a date/time stamp.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @param creatorRequestId <p>
     *            A unique string that identifies the request and that allows
     *            failed <code>CreatePublicDnsNamespace</code> requests to be
     *            retried without the risk of executing the operation twice.
     *            <code>CreatorRequestId</code> can be any unique string, for
     *            example, a date/time stamp.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePublicDnsNamespaceRequest withCreatorRequestId(String creatorRequestId) {
        this.creatorRequestId = creatorRequestId;
        return this;
    }

    /**
     * <p>
     * A description for the namespace.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         A description for the namespace.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description for the namespace.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param description <p>
     *            A description for the namespace.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the namespace.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param description <p>
     *            A description for the namespace.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePublicDnsNamespaceRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The tags to add to the namespace. Each tag consists of a key and an
     * optional value, both of which you define. Tag keys can have a maximum
     * character length of 128 characters, and tag values can have a maximum
     * length of 256 characters.
     * </p>
     *
     * @return <p>
     *         The tags to add to the namespace. Each tag consists of a key and
     *         an optional value, both of which you define. Tag keys can have a
     *         maximum character length of 128 characters, and tag values can
     *         have a maximum length of 256 characters.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to add to the namespace. Each tag consists of a key and an
     * optional value, both of which you define. Tag keys can have a maximum
     * character length of 128 characters, and tag values can have a maximum
     * length of 256 characters.
     * </p>
     *
     * @param tags <p>
     *            The tags to add to the namespace. Each tag consists of a key
     *            and an optional value, both of which you define. Tag keys can
     *            have a maximum character length of 128 characters, and tag
     *            values can have a maximum length of 256 characters.
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
     * The tags to add to the namespace. Each tag consists of a key and an
     * optional value, both of which you define. Tag keys can have a maximum
     * character length of 128 characters, and tag values can have a maximum
     * length of 256 characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags to add to the namespace. Each tag consists of a key
     *            and an optional value, both of which you define. Tag keys can
     *            have a maximum character length of 128 characters, and tag
     *            values can have a maximum length of 256 characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePublicDnsNamespaceRequest withTags(Tag... tags) {
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
     * The tags to add to the namespace. Each tag consists of a key and an
     * optional value, both of which you define. Tag keys can have a maximum
     * character length of 128 characters, and tag values can have a maximum
     * length of 256 characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags to add to the namespace. Each tag consists of a key
     *            and an optional value, both of which you define. Tag keys can
     *            have a maximum character length of 128 characters, and tag
     *            values can have a maximum length of 256 characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePublicDnsNamespaceRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getCreatorRequestId() != null)
            sb.append("CreatorRequestId: " + getCreatorRequestId() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getCreatorRequestId() == null) ? 0 : getCreatorRequestId().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePublicDnsNamespaceRequest == false)
            return false;
        CreatePublicDnsNamespaceRequest other = (CreatePublicDnsNamespaceRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCreatorRequestId() == null ^ this.getCreatorRequestId() == null)
            return false;
        if (other.getCreatorRequestId() != null
                && other.getCreatorRequestId().equals(this.getCreatorRequestId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
