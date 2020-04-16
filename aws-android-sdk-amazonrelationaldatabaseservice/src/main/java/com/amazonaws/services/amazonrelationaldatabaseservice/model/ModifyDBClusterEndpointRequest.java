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
 * Modifies the properties of an endpoint in an Amazon Aurora DB cluster.
 * </p>
 * <note>
 * <p>
 * This action only applies to Aurora DB clusters.
 * </p>
 * </note>
 */
public class ModifyDBClusterEndpointRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier of the endpoint to modify. This parameter is stored as a
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
     * The identifier of the endpoint to modify. This parameter is stored as a
     * lowercase string.
     * </p>
     *
     * @return <p>
     *         The identifier of the endpoint to modify. This parameter is
     *         stored as a lowercase string.
     *         </p>
     */
    public String getDBClusterEndpointIdentifier() {
        return dBClusterEndpointIdentifier;
    }

    /**
     * <p>
     * The identifier of the endpoint to modify. This parameter is stored as a
     * lowercase string.
     * </p>
     *
     * @param dBClusterEndpointIdentifier <p>
     *            The identifier of the endpoint to modify. This parameter is
     *            stored as a lowercase string.
     *            </p>
     */
    public void setDBClusterEndpointIdentifier(String dBClusterEndpointIdentifier) {
        this.dBClusterEndpointIdentifier = dBClusterEndpointIdentifier;
    }

    /**
     * <p>
     * The identifier of the endpoint to modify. This parameter is stored as a
     * lowercase string.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBClusterEndpointIdentifier <p>
     *            The identifier of the endpoint to modify. This parameter is
     *            stored as a lowercase string.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyDBClusterEndpointRequest withDBClusterEndpointIdentifier(
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
    public ModifyDBClusterEndpointRequest withEndpointType(String endpointType) {
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
    public ModifyDBClusterEndpointRequest withStaticMembers(String... staticMembers) {
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
    public ModifyDBClusterEndpointRequest withStaticMembers(
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
    public ModifyDBClusterEndpointRequest withExcludedMembers(String... excludedMembers) {
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
    public ModifyDBClusterEndpointRequest withExcludedMembers(
            java.util.Collection<String> excludedMembers) {
        setExcludedMembers(excludedMembers);
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
        if (getEndpointType() != null)
            sb.append("EndpointType: " + getEndpointType() + ",");
        if (getStaticMembers() != null)
            sb.append("StaticMembers: " + getStaticMembers() + ",");
        if (getExcludedMembers() != null)
            sb.append("ExcludedMembers: " + getExcludedMembers());
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
                + ((getEndpointType() == null) ? 0 : getEndpointType().hashCode());
        hashCode = prime * hashCode
                + ((getStaticMembers() == null) ? 0 : getStaticMembers().hashCode());
        hashCode = prime * hashCode
                + ((getExcludedMembers() == null) ? 0 : getExcludedMembers().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyDBClusterEndpointRequest == false)
            return false;
        ModifyDBClusterEndpointRequest other = (ModifyDBClusterEndpointRequest) obj;

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
        return true;
    }
}
