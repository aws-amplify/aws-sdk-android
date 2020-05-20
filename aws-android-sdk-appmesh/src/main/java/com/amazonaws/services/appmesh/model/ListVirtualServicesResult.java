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

package com.amazonaws.services.appmesh.model;

import java.io.Serializable;

/**
 * 
 */
public class ListVirtualServicesResult implements Serializable {
    /**
     * <p>
     * The <code>nextToken</code> value to include in a future
     * <code>ListVirtualServices</code> request. When the results of a
     * <code>ListVirtualServices</code> request exceed <code>limit</code>, you
     * can use this value to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of existing virtual services for the specified service mesh.
     * </p>
     */
    private java.util.List<VirtualServiceRef> virtualServices;

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future
     * <code>ListVirtualServices</code> request. When the results of a
     * <code>ListVirtualServices</code> request exceed <code>limit</code>, you
     * can use this value to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     *
     * @return <p>
     *         The <code>nextToken</code> value to include in a future
     *         <code>ListVirtualServices</code> request. When the results of a
     *         <code>ListVirtualServices</code> request exceed
     *         <code>limit</code>, you can use this value to retrieve the next
     *         page of results. This value is <code>null</code> when there are
     *         no more results to return.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future
     * <code>ListVirtualServices</code> request. When the results of a
     * <code>ListVirtualServices</code> request exceed <code>limit</code>, you
     * can use this value to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     *
     * @param nextToken <p>
     *            The <code>nextToken</code> value to include in a future
     *            <code>ListVirtualServices</code> request. When the results of
     *            a <code>ListVirtualServices</code> request exceed
     *            <code>limit</code>, you can use this value to retrieve the
     *            next page of results. This value is <code>null</code> when
     *            there are no more results to return.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future
     * <code>ListVirtualServices</code> request. When the results of a
     * <code>ListVirtualServices</code> request exceed <code>limit</code>, you
     * can use this value to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The <code>nextToken</code> value to include in a future
     *            <code>ListVirtualServices</code> request. When the results of
     *            a <code>ListVirtualServices</code> request exceed
     *            <code>limit</code>, you can use this value to retrieve the
     *            next page of results. This value is <code>null</code> when
     *            there are no more results to return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListVirtualServicesResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The list of existing virtual services for the specified service mesh.
     * </p>
     *
     * @return <p>
     *         The list of existing virtual services for the specified service
     *         mesh.
     *         </p>
     */
    public java.util.List<VirtualServiceRef> getVirtualServices() {
        return virtualServices;
    }

    /**
     * <p>
     * The list of existing virtual services for the specified service mesh.
     * </p>
     *
     * @param virtualServices <p>
     *            The list of existing virtual services for the specified
     *            service mesh.
     *            </p>
     */
    public void setVirtualServices(java.util.Collection<VirtualServiceRef> virtualServices) {
        if (virtualServices == null) {
            this.virtualServices = null;
            return;
        }

        this.virtualServices = new java.util.ArrayList<VirtualServiceRef>(virtualServices);
    }

    /**
     * <p>
     * The list of existing virtual services for the specified service mesh.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param virtualServices <p>
     *            The list of existing virtual services for the specified
     *            service mesh.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListVirtualServicesResult withVirtualServices(VirtualServiceRef... virtualServices) {
        if (getVirtualServices() == null) {
            this.virtualServices = new java.util.ArrayList<VirtualServiceRef>(
                    virtualServices.length);
        }
        for (VirtualServiceRef value : virtualServices) {
            this.virtualServices.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of existing virtual services for the specified service mesh.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param virtualServices <p>
     *            The list of existing virtual services for the specified
     *            service mesh.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListVirtualServicesResult withVirtualServices(
            java.util.Collection<VirtualServiceRef> virtualServices) {
        setVirtualServices(virtualServices);
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
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken() + ",");
        if (getVirtualServices() != null)
            sb.append("virtualServices: " + getVirtualServices());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getVirtualServices() == null) ? 0 : getVirtualServices().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListVirtualServicesResult == false)
            return false;
        ListVirtualServicesResult other = (ListVirtualServicesResult) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getVirtualServices() == null ^ this.getVirtualServices() == null)
            return false;
        if (other.getVirtualServices() != null
                && other.getVirtualServices().equals(this.getVirtualServices()) == false)
            return false;
        return true;
    }
}
