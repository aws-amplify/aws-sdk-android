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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

public class GetCoipPoolUsageResult implements Serializable {
    /**
     * <p>
     * The ID of the customer-owned address pool.
     * </p>
     */
    private String coipPoolId;

    /**
     * <p>
     * Information about the address usage.
     * </p>
     */
    private java.util.List<CoipAddressUsage> coipAddressUsages;

    /**
     * <p>
     * The ID of the local gateway route table.
     * </p>
     */
    private String localGatewayRouteTableId;

    /**
     * <p>
     * The ID of the customer-owned address pool.
     * </p>
     *
     * @return <p>
     *         The ID of the customer-owned address pool.
     *         </p>
     */
    public String getCoipPoolId() {
        return coipPoolId;
    }

    /**
     * <p>
     * The ID of the customer-owned address pool.
     * </p>
     *
     * @param coipPoolId <p>
     *            The ID of the customer-owned address pool.
     *            </p>
     */
    public void setCoipPoolId(String coipPoolId) {
        this.coipPoolId = coipPoolId;
    }

    /**
     * <p>
     * The ID of the customer-owned address pool.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param coipPoolId <p>
     *            The ID of the customer-owned address pool.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCoipPoolUsageResult withCoipPoolId(String coipPoolId) {
        this.coipPoolId = coipPoolId;
        return this;
    }

    /**
     * <p>
     * Information about the address usage.
     * </p>
     *
     * @return <p>
     *         Information about the address usage.
     *         </p>
     */
    public java.util.List<CoipAddressUsage> getCoipAddressUsages() {
        return coipAddressUsages;
    }

    /**
     * <p>
     * Information about the address usage.
     * </p>
     *
     * @param coipAddressUsages <p>
     *            Information about the address usage.
     *            </p>
     */
    public void setCoipAddressUsages(java.util.Collection<CoipAddressUsage> coipAddressUsages) {
        if (coipAddressUsages == null) {
            this.coipAddressUsages = null;
            return;
        }

        this.coipAddressUsages = new java.util.ArrayList<CoipAddressUsage>(coipAddressUsages);
    }

    /**
     * <p>
     * Information about the address usage.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param coipAddressUsages <p>
     *            Information about the address usage.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCoipPoolUsageResult withCoipAddressUsages(CoipAddressUsage... coipAddressUsages) {
        if (getCoipAddressUsages() == null) {
            this.coipAddressUsages = new java.util.ArrayList<CoipAddressUsage>(
                    coipAddressUsages.length);
        }
        for (CoipAddressUsage value : coipAddressUsages) {
            this.coipAddressUsages.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the address usage.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param coipAddressUsages <p>
     *            Information about the address usage.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCoipPoolUsageResult withCoipAddressUsages(
            java.util.Collection<CoipAddressUsage> coipAddressUsages) {
        setCoipAddressUsages(coipAddressUsages);
        return this;
    }

    /**
     * <p>
     * The ID of the local gateway route table.
     * </p>
     *
     * @return <p>
     *         The ID of the local gateway route table.
     *         </p>
     */
    public String getLocalGatewayRouteTableId() {
        return localGatewayRouteTableId;
    }

    /**
     * <p>
     * The ID of the local gateway route table.
     * </p>
     *
     * @param localGatewayRouteTableId <p>
     *            The ID of the local gateway route table.
     *            </p>
     */
    public void setLocalGatewayRouteTableId(String localGatewayRouteTableId) {
        this.localGatewayRouteTableId = localGatewayRouteTableId;
    }

    /**
     * <p>
     * The ID of the local gateway route table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param localGatewayRouteTableId <p>
     *            The ID of the local gateway route table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCoipPoolUsageResult withLocalGatewayRouteTableId(String localGatewayRouteTableId) {
        this.localGatewayRouteTableId = localGatewayRouteTableId;
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
        if (getCoipPoolId() != null)
            sb.append("CoipPoolId: " + getCoipPoolId() + ",");
        if (getCoipAddressUsages() != null)
            sb.append("CoipAddressUsages: " + getCoipAddressUsages() + ",");
        if (getLocalGatewayRouteTableId() != null)
            sb.append("LocalGatewayRouteTableId: " + getLocalGatewayRouteTableId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCoipPoolId() == null) ? 0 : getCoipPoolId().hashCode());
        hashCode = prime * hashCode
                + ((getCoipAddressUsages() == null) ? 0 : getCoipAddressUsages().hashCode());
        hashCode = prime
                * hashCode
                + ((getLocalGatewayRouteTableId() == null) ? 0 : getLocalGatewayRouteTableId()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCoipPoolUsageResult == false)
            return false;
        GetCoipPoolUsageResult other = (GetCoipPoolUsageResult) obj;

        if (other.getCoipPoolId() == null ^ this.getCoipPoolId() == null)
            return false;
        if (other.getCoipPoolId() != null
                && other.getCoipPoolId().equals(this.getCoipPoolId()) == false)
            return false;
        if (other.getCoipAddressUsages() == null ^ this.getCoipAddressUsages() == null)
            return false;
        if (other.getCoipAddressUsages() != null
                && other.getCoipAddressUsages().equals(this.getCoipAddressUsages()) == false)
            return false;
        if (other.getLocalGatewayRouteTableId() == null
                ^ this.getLocalGatewayRouteTableId() == null)
            return false;
        if (other.getLocalGatewayRouteTableId() != null
                && other.getLocalGatewayRouteTableId().equals(this.getLocalGatewayRouteTableId()) == false)
            return false;
        return true;
    }
}
