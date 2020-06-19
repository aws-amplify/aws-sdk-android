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

package com.amazonaws.services.elasticache.model;

import java.io.Serializable;

/**
 * <p>
 * The endpoint from which data should be migrated.
 * </p>
 */
public class CustomerNodeEndpoint implements Serializable {
    /**
     * <p>
     * The address of the node endpoint
     * </p>
     */
    private String address;

    /**
     * <p>
     * The port of the node endpoint
     * </p>
     */
    private Integer port;

    /**
     * <p>
     * The address of the node endpoint
     * </p>
     *
     * @return <p>
     *         The address of the node endpoint
     *         </p>
     */
    public String getAddress() {
        return address;
    }

    /**
     * <p>
     * The address of the node endpoint
     * </p>
     *
     * @param address <p>
     *            The address of the node endpoint
     *            </p>
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * <p>
     * The address of the node endpoint
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param address <p>
     *            The address of the node endpoint
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomerNodeEndpoint withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * <p>
     * The port of the node endpoint
     * </p>
     *
     * @return <p>
     *         The port of the node endpoint
     *         </p>
     */
    public Integer getPort() {
        return port;
    }

    /**
     * <p>
     * The port of the node endpoint
     * </p>
     *
     * @param port <p>
     *            The port of the node endpoint
     *            </p>
     */
    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port of the node endpoint
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param port <p>
     *            The port of the node endpoint
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomerNodeEndpoint withPort(Integer port) {
        this.port = port;
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
        if (getAddress() != null)
            sb.append("Address: " + getAddress() + ",");
        if (getPort() != null)
            sb.append("Port: " + getPort());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAddress() == null) ? 0 : getAddress().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomerNodeEndpoint == false)
            return false;
        CustomerNodeEndpoint other = (CustomerNodeEndpoint) obj;

        if (other.getAddress() == null ^ this.getAddress() == null)
            return false;
        if (other.getAddress() != null && other.getAddress().equals(this.getAddress()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        return true;
    }
}
