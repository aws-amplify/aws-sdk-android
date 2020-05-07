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

package com.amazonaws.services.route53.model;

import java.io.Serializable;

public class CreateReusableDelegationSetResult implements Serializable {
    /**
     * <p>
     * A complex type that contains name server information.
     * </p>
     */
    private DelegationSet delegationSet;

    /**
     * <p>
     * The unique URL representing the new reusable delegation set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String location;

    /**
     * <p>
     * A complex type that contains name server information.
     * </p>
     *
     * @return <p>
     *         A complex type that contains name server information.
     *         </p>
     */
    public DelegationSet getDelegationSet() {
        return delegationSet;
    }

    /**
     * <p>
     * A complex type that contains name server information.
     * </p>
     *
     * @param delegationSet <p>
     *            A complex type that contains name server information.
     *            </p>
     */
    public void setDelegationSet(DelegationSet delegationSet) {
        this.delegationSet = delegationSet;
    }

    /**
     * <p>
     * A complex type that contains name server information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param delegationSet <p>
     *            A complex type that contains name server information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReusableDelegationSetResult withDelegationSet(DelegationSet delegationSet) {
        this.delegationSet = delegationSet;
        return this;
    }

    /**
     * <p>
     * The unique URL representing the new reusable delegation set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         The unique URL representing the new reusable delegation set.
     *         </p>
     */
    public String getLocation() {
        return location;
    }

    /**
     * <p>
     * The unique URL representing the new reusable delegation set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param location <p>
     *            The unique URL representing the new reusable delegation set.
     *            </p>
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The unique URL representing the new reusable delegation set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param location <p>
     *            The unique URL representing the new reusable delegation set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReusableDelegationSetResult withLocation(String location) {
        this.location = location;
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
        if (getDelegationSet() != null)
            sb.append("DelegationSet: " + getDelegationSet() + ",");
        if (getLocation() != null)
            sb.append("Location: " + getLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDelegationSet() == null) ? 0 : getDelegationSet().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateReusableDelegationSetResult == false)
            return false;
        CreateReusableDelegationSetResult other = (CreateReusableDelegationSetResult) obj;

        if (other.getDelegationSet() == null ^ this.getDelegationSet() == null)
            return false;
        if (other.getDelegationSet() != null
                && other.getDelegationSet().equals(this.getDelegationSet()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        return true;
    }
}
