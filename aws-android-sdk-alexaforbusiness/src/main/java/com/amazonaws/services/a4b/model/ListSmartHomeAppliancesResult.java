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

package com.amazonaws.services.a4b.model;

import java.io.Serializable;

public class ListSmartHomeAppliancesResult implements Serializable {
    /**
     * <p>
     * The smart home appliances.
     * </p>
     */
    private java.util.List<SmartHomeAppliance> smartHomeAppliances;

    /**
     * <p>
     * The tokens used for pagination.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1100<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The smart home appliances.
     * </p>
     *
     * @return <p>
     *         The smart home appliances.
     *         </p>
     */
    public java.util.List<SmartHomeAppliance> getSmartHomeAppliances() {
        return smartHomeAppliances;
    }

    /**
     * <p>
     * The smart home appliances.
     * </p>
     *
     * @param smartHomeAppliances <p>
     *            The smart home appliances.
     *            </p>
     */
    public void setSmartHomeAppliances(java.util.Collection<SmartHomeAppliance> smartHomeAppliances) {
        if (smartHomeAppliances == null) {
            this.smartHomeAppliances = null;
            return;
        }

        this.smartHomeAppliances = new java.util.ArrayList<SmartHomeAppliance>(smartHomeAppliances);
    }

    /**
     * <p>
     * The smart home appliances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param smartHomeAppliances <p>
     *            The smart home appliances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListSmartHomeAppliancesResult withSmartHomeAppliances(
            SmartHomeAppliance... smartHomeAppliances) {
        if (getSmartHomeAppliances() == null) {
            this.smartHomeAppliances = new java.util.ArrayList<SmartHomeAppliance>(
                    smartHomeAppliances.length);
        }
        for (SmartHomeAppliance value : smartHomeAppliances) {
            this.smartHomeAppliances.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The smart home appliances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param smartHomeAppliances <p>
     *            The smart home appliances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListSmartHomeAppliancesResult withSmartHomeAppliances(
            java.util.Collection<SmartHomeAppliance> smartHomeAppliances) {
        setSmartHomeAppliances(smartHomeAppliances);
        return this;
    }

    /**
     * <p>
     * The tokens used for pagination.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1100<br/>
     *
     * @return <p>
     *         The tokens used for pagination.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The tokens used for pagination.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1100<br/>
     *
     * @param nextToken <p>
     *            The tokens used for pagination.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The tokens used for pagination.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1100<br/>
     *
     * @param nextToken <p>
     *            The tokens used for pagination.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListSmartHomeAppliancesResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getSmartHomeAppliances() != null)
            sb.append("SmartHomeAppliances: " + getSmartHomeAppliances() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSmartHomeAppliances() == null) ? 0 : getSmartHomeAppliances().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSmartHomeAppliancesResult == false)
            return false;
        ListSmartHomeAppliancesResult other = (ListSmartHomeAppliancesResult) obj;

        if (other.getSmartHomeAppliances() == null ^ this.getSmartHomeAppliances() == null)
            return false;
        if (other.getSmartHomeAppliances() != null
                && other.getSmartHomeAppliances().equals(this.getSmartHomeAppliances()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
