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

package com.amazonaws.services.rds.model;

import java.io.Serializable;

/**
 * <p>
 * This data type represents the information you need to connect to an Amazon
 * Aurora DB cluster. This data type is used as a response element in the
 * following actions:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>CreateDBClusterEndpoint</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DescribeDBClusterEndpoints</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ModifyDBClusterEndpoint</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DeleteDBClusterEndpoint</code>
 * </p>
 * </li>
 * </ul>
 * <p>
 * For the data structure that represents Amazon RDS DB instance endpoints, see
 * <code>Endpoint</code>.
 * </p>
 */
public class ModifyDBClusterEndpointResult implements Serializable {
    /**
     * <p>
     * The identifier associated with the endpoint. This parameter is stored as
     * a lowercase string.
     * </p>
     */
    private String dBClusterEndpointIdentifier;

    /**
     * <p>
     * The DB cluster identifier of the DB cluster associated with the endpoint.
     * This parameter is stored as a lowercase string.
     * </p>
     */
    private String dBClusterIdentifier;

    /**
     * <p>
     * A unique system-generated identifier for an endpoint. It remains the same
     * for the whole life of the endpoint.
     * </p>
     */
    private String dBClusterEndpointResourceIdentifier;

    /**
     * <p>
     * The DNS address of the endpoint.
     * </p>
     */
    private String endpoint;

    /**
     * <p>
     * The current status of the endpoint. One of: <code>creating</code>,
     * <code>available</code>, <code>deleting</code>, <code>modifying</code>.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The type of the endpoint. One of: <code>READER</code>,
     * <code>WRITER</code>, <code>CUSTOM</code>.
     * </p>
     */
    private String endpointType;

    /**
     * <p>
     * The type associated with a custom endpoint. One of: <code>READER</code>,
     * <code>WRITER</code>, <code>ANY</code>.
     * </p>
     */
    private String customEndpointType;

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
     * The Amazon Resource Name (ARN) for the endpoint.
     * </p>
     */
    private String dBClusterEndpointArn;

    /**
     * <p>
     * The identifier associated with the endpoint. This parameter is stored as
     * a lowercase string.
     * </p>
     *
     * @return <p>
     *         The identifier associated with the endpoint. This parameter is
     *         stored as a lowercase string.
     *         </p>
     */
    public String getDBClusterEndpointIdentifier() {
        return dBClusterEndpointIdentifier;
    }

    /**
     * <p>
     * The identifier associated with the endpoint. This parameter is stored as
     * a lowercase string.
     * </p>
     *
     * @param dBClusterEndpointIdentifier <p>
     *            The identifier associated with the endpoint. This parameter is
     *            stored as a lowercase string.
     *            </p>
     */
    public void setDBClusterEndpointIdentifier(String dBClusterEndpointIdentifier) {
        this.dBClusterEndpointIdentifier = dBClusterEndpointIdentifier;
    }

    /**
     * <p>
     * The identifier associated with the endpoint. This parameter is stored as
     * a lowercase string.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBClusterEndpointIdentifier <p>
     *            The identifier associated with the endpoint. This parameter is
     *            stored as a lowercase string.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyDBClusterEndpointResult withDBClusterEndpointIdentifier(
            String dBClusterEndpointIdentifier) {
        this.dBClusterEndpointIdentifier = dBClusterEndpointIdentifier;
        return this;
    }

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
    public ModifyDBClusterEndpointResult withDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
        return this;
    }

    /**
     * <p>
     * A unique system-generated identifier for an endpoint. It remains the same
     * for the whole life of the endpoint.
     * </p>
     *
     * @return <p>
     *         A unique system-generated identifier for an endpoint. It remains
     *         the same for the whole life of the endpoint.
     *         </p>
     */
    public String getDBClusterEndpointResourceIdentifier() {
        return dBClusterEndpointResourceIdentifier;
    }

    /**
     * <p>
     * A unique system-generated identifier for an endpoint. It remains the same
     * for the whole life of the endpoint.
     * </p>
     *
     * @param dBClusterEndpointResourceIdentifier <p>
     *            A unique system-generated identifier for an endpoint. It
     *            remains the same for the whole life of the endpoint.
     *            </p>
     */
    public void setDBClusterEndpointResourceIdentifier(String dBClusterEndpointResourceIdentifier) {
        this.dBClusterEndpointResourceIdentifier = dBClusterEndpointResourceIdentifier;
    }

    /**
     * <p>
     * A unique system-generated identifier for an endpoint. It remains the same
     * for the whole life of the endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBClusterEndpointResourceIdentifier <p>
     *            A unique system-generated identifier for an endpoint. It
     *            remains the same for the whole life of the endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyDBClusterEndpointResult withDBClusterEndpointResourceIdentifier(
            String dBClusterEndpointResourceIdentifier) {
        this.dBClusterEndpointResourceIdentifier = dBClusterEndpointResourceIdentifier;
        return this;
    }

    /**
     * <p>
     * The DNS address of the endpoint.
     * </p>
     *
     * @return <p>
     *         The DNS address of the endpoint.
     *         </p>
     */
    public String getEndpoint() {
        return endpoint;
    }

    /**
     * <p>
     * The DNS address of the endpoint.
     * </p>
     *
     * @param endpoint <p>
     *            The DNS address of the endpoint.
     *            </p>
     */
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * The DNS address of the endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endpoint <p>
     *            The DNS address of the endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyDBClusterEndpointResult withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * <p>
     * The current status of the endpoint. One of: <code>creating</code>,
     * <code>available</code>, <code>deleting</code>, <code>modifying</code>.
     * </p>
     *
     * @return <p>
     *         The current status of the endpoint. One of: <code>creating</code>, <code>available</code>, <code>deleting</code>,
     *         <code>modifying</code>.
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The current status of the endpoint. One of: <code>creating</code>,
     * <code>available</code>, <code>deleting</code>, <code>modifying</code>.
     * </p>
     *
     * @param status <p>
     *            The current status of the endpoint. One of:
     *            <code>creating</code>, <code>available</code>,
     *            <code>deleting</code>, <code>modifying</code>.
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the endpoint. One of: <code>creating</code>,
     * <code>available</code>, <code>deleting</code>, <code>modifying</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The current status of the endpoint. One of:
     *            <code>creating</code>, <code>available</code>,
     *            <code>deleting</code>, <code>modifying</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyDBClusterEndpointResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The type of the endpoint. One of: <code>READER</code>,
     * <code>WRITER</code>, <code>CUSTOM</code>.
     * </p>
     *
     * @return <p>
     *         The type of the endpoint. One of: <code>READER</code>,
     *         <code>WRITER</code>, <code>CUSTOM</code>.
     *         </p>
     */
    public String getEndpointType() {
        return endpointType;
    }

    /**
     * <p>
     * The type of the endpoint. One of: <code>READER</code>,
     * <code>WRITER</code>, <code>CUSTOM</code>.
     * </p>
     *
     * @param endpointType <p>
     *            The type of the endpoint. One of: <code>READER</code>,
     *            <code>WRITER</code>, <code>CUSTOM</code>.
     *            </p>
     */
    public void setEndpointType(String endpointType) {
        this.endpointType = endpointType;
    }

    /**
     * <p>
     * The type of the endpoint. One of: <code>READER</code>,
     * <code>WRITER</code>, <code>CUSTOM</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endpointType <p>
     *            The type of the endpoint. One of: <code>READER</code>,
     *            <code>WRITER</code>, <code>CUSTOM</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyDBClusterEndpointResult withEndpointType(String endpointType) {
        this.endpointType = endpointType;
        return this;
    }

    /**
     * <p>
     * The type associated with a custom endpoint. One of: <code>READER</code>,
     * <code>WRITER</code>, <code>ANY</code>.
     * </p>
     *
     * @return <p>
     *         The type associated with a custom endpoint. One of:
     *         <code>READER</code>, <code>WRITER</code>, <code>ANY</code>.
     *         </p>
     */
    public String getCustomEndpointType() {
        return customEndpointType;
    }

    /**
     * <p>
     * The type associated with a custom endpoint. One of: <code>READER</code>,
     * <code>WRITER</code>, <code>ANY</code>.
     * </p>
     *
     * @param customEndpointType <p>
     *            The type associated with a custom endpoint. One of:
     *            <code>READER</code>, <code>WRITER</code>, <code>ANY</code>.
     *            </p>
     */
    public void setCustomEndpointType(String customEndpointType) {
        this.customEndpointType = customEndpointType;
    }

    /**
     * <p>
     * The type associated with a custom endpoint. One of: <code>READER</code>,
     * <code>WRITER</code>, <code>ANY</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customEndpointType <p>
     *            The type associated with a custom endpoint. One of:
     *            <code>READER</code>, <code>WRITER</code>, <code>ANY</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyDBClusterEndpointResult withCustomEndpointType(String customEndpointType) {
        this.customEndpointType = customEndpointType;
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
    public ModifyDBClusterEndpointResult withStaticMembers(String... staticMembers) {
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
    public ModifyDBClusterEndpointResult withStaticMembers(
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
    public ModifyDBClusterEndpointResult withExcludedMembers(String... excludedMembers) {
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
    public ModifyDBClusterEndpointResult withExcludedMembers(
            java.util.Collection<String> excludedMembers) {
        setExcludedMembers(excludedMembers);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the endpoint.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for the endpoint.
     *         </p>
     */
    public String getDBClusterEndpointArn() {
        return dBClusterEndpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the endpoint.
     * </p>
     *
     * @param dBClusterEndpointArn <p>
     *            The Amazon Resource Name (ARN) for the endpoint.
     *            </p>
     */
    public void setDBClusterEndpointArn(String dBClusterEndpointArn) {
        this.dBClusterEndpointArn = dBClusterEndpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBClusterEndpointArn <p>
     *            The Amazon Resource Name (ARN) for the endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyDBClusterEndpointResult withDBClusterEndpointArn(String dBClusterEndpointArn) {
        this.dBClusterEndpointArn = dBClusterEndpointArn;
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
        if (getDBClusterEndpointIdentifier() != null)
            sb.append("DBClusterEndpointIdentifier: " + getDBClusterEndpointIdentifier() + ",");
        if (getDBClusterIdentifier() != null)
            sb.append("DBClusterIdentifier: " + getDBClusterIdentifier() + ",");
        if (getDBClusterEndpointResourceIdentifier() != null)
            sb.append("DBClusterEndpointResourceIdentifier: "
                    + getDBClusterEndpointResourceIdentifier() + ",");
        if (getEndpoint() != null)
            sb.append("Endpoint: " + getEndpoint() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getEndpointType() != null)
            sb.append("EndpointType: " + getEndpointType() + ",");
        if (getCustomEndpointType() != null)
            sb.append("CustomEndpointType: " + getCustomEndpointType() + ",");
        if (getStaticMembers() != null)
            sb.append("StaticMembers: " + getStaticMembers() + ",");
        if (getExcludedMembers() != null)
            sb.append("ExcludedMembers: " + getExcludedMembers() + ",");
        if (getDBClusterEndpointArn() != null)
            sb.append("DBClusterEndpointArn: " + getDBClusterEndpointArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDBClusterEndpointIdentifier() == null) ? 0
                        : getDBClusterEndpointIdentifier().hashCode());
        hashCode = prime * hashCode
                + ((getDBClusterIdentifier() == null) ? 0 : getDBClusterIdentifier().hashCode());
        hashCode = prime
                * hashCode
                + ((getDBClusterEndpointResourceIdentifier() == null) ? 0
                        : getDBClusterEndpointResourceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getEndpointType() == null) ? 0 : getEndpointType().hashCode());
        hashCode = prime * hashCode
                + ((getCustomEndpointType() == null) ? 0 : getCustomEndpointType().hashCode());
        hashCode = prime * hashCode
                + ((getStaticMembers() == null) ? 0 : getStaticMembers().hashCode());
        hashCode = prime * hashCode
                + ((getExcludedMembers() == null) ? 0 : getExcludedMembers().hashCode());
        hashCode = prime * hashCode
                + ((getDBClusterEndpointArn() == null) ? 0 : getDBClusterEndpointArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyDBClusterEndpointResult == false)
            return false;
        ModifyDBClusterEndpointResult other = (ModifyDBClusterEndpointResult) obj;

        if (other.getDBClusterEndpointIdentifier() == null
                ^ this.getDBClusterEndpointIdentifier() == null)
            return false;
        if (other.getDBClusterEndpointIdentifier() != null
                && other.getDBClusterEndpointIdentifier().equals(
                        this.getDBClusterEndpointIdentifier()) == false)
            return false;
        if (other.getDBClusterIdentifier() == null ^ this.getDBClusterIdentifier() == null)
            return false;
        if (other.getDBClusterIdentifier() != null
                && other.getDBClusterIdentifier().equals(this.getDBClusterIdentifier()) == false)
            return false;
        if (other.getDBClusterEndpointResourceIdentifier() == null
                ^ this.getDBClusterEndpointResourceIdentifier() == null)
            return false;
        if (other.getDBClusterEndpointResourceIdentifier() != null
                && other.getDBClusterEndpointResourceIdentifier().equals(
                        this.getDBClusterEndpointResourceIdentifier()) == false)
            return false;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getEndpointType() == null ^ this.getEndpointType() == null)
            return false;
        if (other.getEndpointType() != null
                && other.getEndpointType().equals(this.getEndpointType()) == false)
            return false;
        if (other.getCustomEndpointType() == null ^ this.getCustomEndpointType() == null)
            return false;
        if (other.getCustomEndpointType() != null
                && other.getCustomEndpointType().equals(this.getCustomEndpointType()) == false)
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
        if (other.getDBClusterEndpointArn() == null ^ this.getDBClusterEndpointArn() == null)
            return false;
        if (other.getDBClusterEndpointArn() != null
                && other.getDBClusterEndpointArn().equals(this.getDBClusterEndpointArn()) == false)
            return false;
        return true;
    }
}
