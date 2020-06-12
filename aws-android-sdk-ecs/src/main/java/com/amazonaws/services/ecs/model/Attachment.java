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

package com.amazonaws.services.ecs.model;

import java.io.Serializable;

/**
 * <p>
 * An object representing a container instance or task attachment.
 * </p>
 */
public class Attachment implements Serializable {
    /**
     * <p>
     * The unique identifier for the attachment.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The type of the attachment, such as <code>ElasticNetworkInterface</code>.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The status of the attachment. Valid values are <code>PRECREATED</code>,
     * <code>CREATED</code>, <code>ATTACHING</code>, <code>ATTACHED</code>,
     * <code>DETACHING</code>, <code>DETACHED</code>, and <code>DELETED</code>.
     * </p>
     */
    private String status;

    /**
     * <p>
     * Details of the attachment. For elastic network interfaces, this includes
     * the network interface ID, the MAC address, the subnet ID, and the private
     * IPv4 address.
     * </p>
     */
    private java.util.List<KeyValuePair> details;

    /**
     * <p>
     * The unique identifier for the attachment.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the attachment.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The unique identifier for the attachment.
     * </p>
     *
     * @param id <p>
     *            The unique identifier for the attachment.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the attachment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The unique identifier for the attachment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Attachment withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The type of the attachment, such as <code>ElasticNetworkInterface</code>.
     * </p>
     *
     * @return <p>
     *         The type of the attachment, such as
     *         <code>ElasticNetworkInterface</code>.
     *         </p>
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of the attachment, such as <code>ElasticNetworkInterface</code>.
     * </p>
     *
     * @param type <p>
     *            The type of the attachment, such as
     *            <code>ElasticNetworkInterface</code>.
     *            </p>
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the attachment, such as <code>ElasticNetworkInterface</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param type <p>
     *            The type of the attachment, such as
     *            <code>ElasticNetworkInterface</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Attachment withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The status of the attachment. Valid values are <code>PRECREATED</code>,
     * <code>CREATED</code>, <code>ATTACHING</code>, <code>ATTACHED</code>,
     * <code>DETACHING</code>, <code>DETACHED</code>, and <code>DELETED</code>.
     * </p>
     *
     * @return <p>
     *         The status of the attachment. Valid values are
     *         <code>PRECREATED</code>, <code>CREATED</code>,
     *         <code>ATTACHING</code>, <code>ATTACHED</code>,
     *         <code>DETACHING</code>, <code>DETACHED</code>, and
     *         <code>DELETED</code>.
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the attachment. Valid values are <code>PRECREATED</code>,
     * <code>CREATED</code>, <code>ATTACHING</code>, <code>ATTACHED</code>,
     * <code>DETACHING</code>, <code>DETACHED</code>, and <code>DELETED</code>.
     * </p>
     *
     * @param status <p>
     *            The status of the attachment. Valid values are
     *            <code>PRECREATED</code>, <code>CREATED</code>,
     *            <code>ATTACHING</code>, <code>ATTACHED</code>,
     *            <code>DETACHING</code>, <code>DETACHED</code>, and
     *            <code>DELETED</code>.
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the attachment. Valid values are <code>PRECREATED</code>,
     * <code>CREATED</code>, <code>ATTACHING</code>, <code>ATTACHED</code>,
     * <code>DETACHING</code>, <code>DETACHED</code>, and <code>DELETED</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The status of the attachment. Valid values are
     *            <code>PRECREATED</code>, <code>CREATED</code>,
     *            <code>ATTACHING</code>, <code>ATTACHED</code>,
     *            <code>DETACHING</code>, <code>DETACHED</code>, and
     *            <code>DELETED</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Attachment withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * Details of the attachment. For elastic network interfaces, this includes
     * the network interface ID, the MAC address, the subnet ID, and the private
     * IPv4 address.
     * </p>
     *
     * @return <p>
     *         Details of the attachment. For elastic network interfaces, this
     *         includes the network interface ID, the MAC address, the subnet
     *         ID, and the private IPv4 address.
     *         </p>
     */
    public java.util.List<KeyValuePair> getDetails() {
        return details;
    }

    /**
     * <p>
     * Details of the attachment. For elastic network interfaces, this includes
     * the network interface ID, the MAC address, the subnet ID, and the private
     * IPv4 address.
     * </p>
     *
     * @param details <p>
     *            Details of the attachment. For elastic network interfaces,
     *            this includes the network interface ID, the MAC address, the
     *            subnet ID, and the private IPv4 address.
     *            </p>
     */
    public void setDetails(java.util.Collection<KeyValuePair> details) {
        if (details == null) {
            this.details = null;
            return;
        }

        this.details = new java.util.ArrayList<KeyValuePair>(details);
    }

    /**
     * <p>
     * Details of the attachment. For elastic network interfaces, this includes
     * the network interface ID, the MAC address, the subnet ID, and the private
     * IPv4 address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param details <p>
     *            Details of the attachment. For elastic network interfaces,
     *            this includes the network interface ID, the MAC address, the
     *            subnet ID, and the private IPv4 address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Attachment withDetails(KeyValuePair... details) {
        if (getDetails() == null) {
            this.details = new java.util.ArrayList<KeyValuePair>(details.length);
        }
        for (KeyValuePair value : details) {
            this.details.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Details of the attachment. For elastic network interfaces, this includes
     * the network interface ID, the MAC address, the subnet ID, and the private
     * IPv4 address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param details <p>
     *            Details of the attachment. For elastic network interfaces,
     *            this includes the network interface ID, the MAC address, the
     *            subnet ID, and the private IPv4 address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Attachment withDetails(java.util.Collection<KeyValuePair> details) {
        setDetails(details);
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
        if (getType() != null)
            sb.append("type: " + getType() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getDetails() != null)
            sb.append("details: " + getDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Attachment == false)
            return false;
        Attachment other = (Attachment) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDetails() == null ^ this.getDetails() == null)
            return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false)
            return false;
        return true;
    }
}
