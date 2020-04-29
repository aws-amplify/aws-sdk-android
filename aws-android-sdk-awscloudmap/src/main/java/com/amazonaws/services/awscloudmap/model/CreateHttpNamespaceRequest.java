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

package com.amazonaws.services.awscloudmap.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates an HTTP namespace. Service instances that you register using an HTTP
 * namespace can be discovered using a <code>DiscoverInstances</code> request
 * but can't be discovered using DNS.
 * </p>
 * <p>
 * For the current limit on the number of namespaces that you can create using
 * the same AWS account, see <a href=
 * "https://docs.aws.amazon.com/cloud-map/latest/dg/cloud-map-limits.html">AWS
 * Cloud Map Limits</a> in the <i>AWS Cloud Map Developer Guide</i>.
 * </p>
 */
public class CreateHttpNamespaceRequest extends AmazonWebServiceRequest implements Serializable {
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
     * <code>CreateHttpNamespace</code> requests to be retried without the risk
     * of executing the operation twice. <code>CreatorRequestId</code> can be
     * any unique string, for example, a date/time stamp.
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
    public CreateHttpNamespaceRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * A unique string that identifies the request and that allows failed
     * <code>CreateHttpNamespace</code> requests to be retried without the risk
     * of executing the operation twice. <code>CreatorRequestId</code> can be
     * any unique string, for example, a date/time stamp.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @return <p>
     *         A unique string that identifies the request and that allows
     *         failed <code>CreateHttpNamespace</code> requests to be retried
     *         without the risk of executing the operation twice.
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
     * <code>CreateHttpNamespace</code> requests to be retried without the risk
     * of executing the operation twice. <code>CreatorRequestId</code> can be
     * any unique string, for example, a date/time stamp.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @param creatorRequestId <p>
     *            A unique string that identifies the request and that allows
     *            failed <code>CreateHttpNamespace</code> requests to be retried
     *            without the risk of executing the operation twice.
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
     * <code>CreateHttpNamespace</code> requests to be retried without the risk
     * of executing the operation twice. <code>CreatorRequestId</code> can be
     * any unique string, for example, a date/time stamp.
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
     *            failed <code>CreateHttpNamespace</code> requests to be retried
     *            without the risk of executing the operation twice.
     *            <code>CreatorRequestId</code> can be any unique string, for
     *            example, a date/time stamp.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateHttpNamespaceRequest withCreatorRequestId(String creatorRequestId) {
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
    public CreateHttpNamespaceRequest withDescription(String description) {
        this.description = description;
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
            sb.append("Description: " + getDescription());
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
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateHttpNamespaceRequest == false)
            return false;
        CreateHttpNamespaceRequest other = (CreateHttpNamespaceRequest) obj;

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
        return true;
    }
}
