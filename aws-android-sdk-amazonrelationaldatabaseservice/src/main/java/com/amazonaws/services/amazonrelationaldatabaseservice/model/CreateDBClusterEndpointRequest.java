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

package com.amazonaws.services.amazonrelationaldatabaseservice.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a new custom endpoint and associates it with an Amazon Aurora DB
 * cluster.
 * </p>
 * <note>
 * <p>
 * This action only applies to Aurora DB clusters.
 * </p>
 * </note>
 */
public class CreateDBClusterEndpointRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The DB cluster identifier of the DB cluster associated with the endpoint.
     * This parameter is stored as a lowercase string.
     * </p>
     */
    private String dBClusterIdentifier;

    /**
     * <p>
     * The identifier to use for the new endpoint. This parameter is stored as a
     * lowercase string.
     * </p>
     */
    private String dBClusterEndpointIdentifier;

    /**
     * <p>
     * The type of the endpoint. One of: <code>READER</code>,
     * <code>WRITER</code>, <code>ANY</code>.
     * </p>
     */
    private String endpointType;

    /**
     * <p>
     * List of DB instance identifiers that are part of the custom endpoint
     * group.
     * </p>
     */
    private java.util.List<String> staticMembers;

    /**
     * <p>
     * List of DB instance identifiers that aren't part of the custom endpoint
     * group. All other eligible instances are reachable through the custom
     * endpoint. Only relevant if the list of static members is empty.
     * </p>
     */
    private java.util.List<String> excludedMembers;

    /**
     * <p>
     * The tags to be assigned to the Amazon RDS resource.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The DB cluster identifier of the DB cluster associated with the endpoint.
     * This parameter is stored as a lowercase string.
     * </p>
     *
     * @return <p>
     *         The DB cluster identifier of the DB cluster associated with the
     *         endpoint. This parameter is stored as a lowercase string.
     *         </p>
     */
    public String getDBClusterIdentifier() {
        return dBClusterIdentifier;
    }

    /**
     * <p>
     * The DB cluster identifier of the DB cluster associated with the endpoint.
     * This parameter is stored as a lowercase string.
     * </p>
     *
     * @param dBClusterIdentifier <p>
     *            The DB cluster identifier of the DB cluster associated with
     *            the endpoint. This parameter is stored as a lowercase string.
     *            </p>
     */
    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }

    /**
     * <p>
     * The DB cluster identifier of the DB cluster associated with the endpoint.
     * This parameter is stored as a lowercase string.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBClusterIdentifier <p>
     *            The DB cluster identifier of the DB cluster associated with
     *            the endpoint. This parameter is stored as a lowercase string.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBClusterEndpointRequest withDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
        return this;
    }

    /**
     * <p>
     * The identifier to use for the new endpoint. This parameter is stored as a
     * lowercase string.
     * </p>
     *
     * @return <p>
     *         The identifier to use for the new endpoint. This parameter is
     *         stored as a lowercase string.
     *         </p>
     */
    public String getDBClusterEndpointIdentifier() {
        return dBClusterEndpointIdentifier;
    }

    /**
     * <p>
     * The identifier to use for the new endpoint. This parameter is stored as a
     * lowercase string.
     * </p>
     *
     * @param dBClusterEndpointIdentifier <p>
     *            The identifier to use for the new endpoint. This parameter is
     *            stored as a lowercase string.
     *            </p>
     */
    public void setDBClusterEndpointIdentifier(String dBClusterEndpointIdentifier) {
        this.dBClusterEndpointIdentifier = dBClusterEndpointIdentifier;
    }

    /**
     * <p>
     * The identifier to use for the new endpoint. This parameter is stored as a
     * lowercase string.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBClusterEndpointIdentifier <p>
     *            The identifier to use for the new endpoint. This parameter is
     *            stored as a lowercase string.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBClusterEndpointRequest withDBClusterEndpointIdentifier(
            String dBClusterEndpointIdentifier) {
        this.dBClusterEndpointIdentifier = dBClusterEndpointIdentifier;
        return this;
    }

    /**
     * <p>
     * The type of the endpoint. One of: <code>READER</code>,
     * <code>WRITER</code>, <code>ANY</code>.
     * </p>
     *
     * @return <p>
     *         The type of the endpoint. One of: <code>READER</code>,
     *         <code>WRITER</code>, <code>ANY</code>.
     *         </p>
     */
    public String getEndpointType() {
        return endpointType;
    }

    /**
     * <p>
     * The type of the endpoint. One of: <code>READER</code>,
     * <code>WRITER</code>, <code>ANY</code>.
     * </p>
     *
     * @param endpointType <p>
     *            The type of the endpoint. One of: <code>READER</code>,
     *            <code>WRITER</code>, <code>ANY</code>.
     *            </p>
     */
    public void setEndpointType(String endpointType) {
        this.endpointType = endpointType;
    }

    /**
     * <p>
     * The type of the endpoint. One of: <code>READER</code>,
     * <code>WRITER</code>, <code>ANY</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endpointType <p>
     *            The type of the endpoint. One of: <code>READER</code>,
     *            <code>WRITER</code>, <code>ANY</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBClusterEndpointRequest withEndpointType(String endpointType) {
        this.endpointType = endpointType;
        return this;
    }

    /**
     * <p>
     * List of DB instance identifiers that are part of the custom endpoint
     * group.
     * </p>
     *
     * @return <p>
     *         List of DB instance identifiers that are part of the custom
     *         endpoint group.
     *         </p>
     */
    public java.util.List<String> getStaticMembers() {
        return staticMembers;
    }

    /**
     * <p>
     * List of DB instance identifiers that are part of the custom endpoint
     * group.
     * </p>
     *
     * @param staticMembers <p>
     *            List of DB instance identifiers that are part of the custom
     *            endpoint group.
     *            </p>
     */
    public void setStaticMembers(java.util.Collection<String> staticMembers) {
        if (staticMembers == null) {
            this.staticMembers = null;
            return;
        }

        this.staticMembers = new java.util.ArrayList<String>(staticMembers);
    }

    /**
     * <p>
     * List of DB instance identifiers that are part of the custom endpoint
     * group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param staticMembers <p>
     *            List of DB instance identifiers that are part of the custom
     *            endpoint group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBClusterEndpointRequest withStaticMembers(String... staticMembers) {
        if (getStaticMembers() == null) {
            this.staticMembers = new java.util.ArrayList<String>(staticMembers.length);
        }
        for (String value : staticMembers) {
            this.staticMembers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of DB instance identifiers that are part of the custom endpoint
     * group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param staticMembers <p>
     *            List of DB instance identifiers that are part of the custom
     *            endpoint group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBClusterEndpointRequest withStaticMembers(
            java.util.Collection<String> staticMembers) {
        setStaticMembers(staticMembers);
        return this;
    }

    /**
     * <p>
     * List of DB instance identifiers that aren't part of the custom endpoint
     * group. All other eligible instances are reachable through the custom
     * endpoint. Only relevant if the list of static members is empty.
     * </p>
     *
     * @return <p>
     *         List of DB instance identifiers that aren't part of the custom
     *         endpoint group. All other eligible instances are reachable
     *         through the custom endpoint. Only relevant if the list of static
     *         members is empty.
     *         </p>
     */
    public java.util.List<String> getExcludedMembers() {
        return excludedMembers;
    }

    /**
     * <p>
     * List of DB instance identifiers that aren't part of the custom endpoint
     * group. All other eligible instances are reachable through the custom
     * endpoint. Only relevant if the list of static members is empty.
     * </p>
     *
     * @param excludedMembers <p>
     *            List of DB instance identifiers that aren't part of the custom
     *            endpoint group. All other eligible instances are reachable
     *            through the custom endpoint. Only relevant if the list of
     *            static members is empty.
     *            </p>
     */
    public void setExcludedMembers(java.util.Collection<String> excludedMembers) {
        if (excludedMembers == null) {
            this.excludedMembers = null;
            return;
        }

        this.excludedMembers = new java.util.ArrayList<String>(excludedMembers);
    }

    /**
     * <p>
     * List of DB instance identifiers that aren't part of the custom endpoint
     * group. All other eligible instances are reachable through the custom
     * endpoint. Only relevant if the list of static members is empty.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param excludedMembers <p>
     *            List of DB instance identifiers that aren't part of the custom
     *            endpoint group. All other eligible instances are reachable
     *            through the custom endpoint. Only relevant if the list of
     *            static members is empty.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBClusterEndpointRequest withExcludedMembers(String... excludedMembers) {
        if (getExcludedMembers() == null) {
            this.excludedMembers = new java.util.ArrayList<String>(excludedMembers.length);
        }
        for (String value : excludedMembers) {
            this.excludedMembers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of DB instance identifiers that aren't part of the custom endpoint
     * group. All other eligible instances are reachable through the custom
     * endpoint. Only relevant if the list of static members is empty.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param excludedMembers <p>
     *            List of DB instance identifiers that aren't part of the custom
     *            endpoint group. All other eligible instances are reachable
     *            through the custom endpoint. Only relevant if the list of
     *            static members is empty.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBClusterEndpointRequest withExcludedMembers(
            java.util.Collection<String> excludedMembers) {
        setExcludedMembers(excludedMembers);
        return this;
    }

    /**
     * <p>
     * The tags to be assigned to the Amazon RDS resource.
     * </p>
     *
     * @return <p>
     *         The tags to be assigned to the Amazon RDS resource.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to be assigned to the Amazon RDS resource.
     * </p>
     *
     * @param tags <p>
     *            The tags to be assigned to the Amazon RDS resource.
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
     * The tags to be assigned to the Amazon RDS resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags to be assigned to the Amazon RDS resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBClusterEndpointRequest withTags(Tag... tags) {
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
     * The tags to be assigned to the Amazon RDS resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags to be assigned to the Amazon RDS resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBClusterEndpointRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getDBClusterIdentifier() != null)
            sb.append("DBClusterIdentifier: " + getDBClusterIdentifier() + ",");
        if (getDBClusterEndpointIdentifier() != null)
            sb.append("DBClusterEndpointIdentifier: " + getDBClusterEndpointIdentifier() + ",");
        if (getEndpointType() != null)
            sb.append("EndpointType: " + getEndpointType() + ",");
        if (getStaticMembers() != null)
            sb.append("StaticMembers: " + getStaticMembers() + ",");
        if (getExcludedMembers() != null)
            sb.append("ExcludedMembers: " + getExcludedMembers() + ",");
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
                + ((getDBClusterIdentifier() == null) ? 0 : getDBClusterIdentifier().hashCode());
        hashCode = prime
                * hashCode
                + ((getDBClusterEndpointIdentifier() == null) ? 0
                        : getDBClusterEndpointIdentifier().hashCode());
        hashCode = prime * hashCode
                + ((getEndpointType() == null) ? 0 : getEndpointType().hashCode());
        hashCode = prime * hashCode
                + ((getStaticMembers() == null) ? 0 : getStaticMembers().hashCode());
        hashCode = prime * hashCode
                + ((getExcludedMembers() == null) ? 0 : getExcludedMembers().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDBClusterEndpointRequest == false)
            return false;
        CreateDBClusterEndpointRequest other = (CreateDBClusterEndpointRequest) obj;

        if (other.getDBClusterIdentifier() == null ^ this.getDBClusterIdentifier() == null)
            return false;
        if (other.getDBClusterIdentifier() != null
                && other.getDBClusterIdentifier().equals(this.getDBClusterIdentifier()) == false)
            return false;
        if (other.getDBClusterEndpointIdentifier() == null
                ^ this.getDBClusterEndpointIdentifier() == null)
            return false;
        if (other.getDBClusterEndpointIdentifier() != null
                && other.getDBClusterEndpointIdentifier().equals(
                        this.getDBClusterEndpointIdentifier()) == false)
            return false;
        if (other.getEndpointType() == null ^ this.getEndpointType() == null)
            return false;
        if (other.getEndpointType() != null
                && other.getEndpointType().equals(this.getEndpointType()) == false)
            return false;
        if (other.getStaticMembers() == null ^ this.getStaticMembers() == null)
            return false;
        if (other.getStaticMembers() != null
                && other.getStaticMembers().equals(this.getStaticMembers()) == false)
            return false;
        if (other.getExcludedMembers() == null ^ this.getExcludedMembers() == null)
            return false;
        if (other.getExcludedMembers() != null
                && other.getExcludedMembers().equals(this.getExcludedMembers()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
