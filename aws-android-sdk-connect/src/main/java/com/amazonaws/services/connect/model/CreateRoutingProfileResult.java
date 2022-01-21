/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

public class CreateRoutingProfileResult implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the routing profile.
     * </p>
     */
    private String routingProfileArn;

    /**
     * <p>
     * The identifier of the routing profile.
     * </p>
     */
    private String routingProfileId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the routing profile.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the routing profile.
     *         </p>
     */
    public String getRoutingProfileArn() {
        return routingProfileArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the routing profile.
     * </p>
     *
     * @param routingProfileArn <p>
     *            The Amazon Resource Name (ARN) of the routing profile.
     *            </p>
     */
    public void setRoutingProfileArn(String routingProfileArn) {
        this.routingProfileArn = routingProfileArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the routing profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param routingProfileArn <p>
     *            The Amazon Resource Name (ARN) of the routing profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRoutingProfileResult withRoutingProfileArn(String routingProfileArn) {
        this.routingProfileArn = routingProfileArn;
        return this;
    }

    /**
     * <p>
     * The identifier of the routing profile.
     * </p>
     *
     * @return <p>
     *         The identifier of the routing profile.
     *         </p>
     */
    public String getRoutingProfileId() {
        return routingProfileId;
    }

    /**
     * <p>
     * The identifier of the routing profile.
     * </p>
     *
     * @param routingProfileId <p>
     *            The identifier of the routing profile.
     *            </p>
     */
    public void setRoutingProfileId(String routingProfileId) {
        this.routingProfileId = routingProfileId;
    }

    /**
     * <p>
     * The identifier of the routing profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param routingProfileId <p>
     *            The identifier of the routing profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRoutingProfileResult withRoutingProfileId(String routingProfileId) {
        this.routingProfileId = routingProfileId;
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
        if (getRoutingProfileArn() != null)
            sb.append("RoutingProfileArn: " + getRoutingProfileArn() + ",");
        if (getRoutingProfileId() != null)
            sb.append("RoutingProfileId: " + getRoutingProfileId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRoutingProfileArn() == null) ? 0 : getRoutingProfileArn().hashCode());
        hashCode = prime * hashCode
                + ((getRoutingProfileId() == null) ? 0 : getRoutingProfileId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRoutingProfileResult == false)
            return false;
        CreateRoutingProfileResult other = (CreateRoutingProfileResult) obj;

        if (other.getRoutingProfileArn() == null ^ this.getRoutingProfileArn() == null)
            return false;
        if (other.getRoutingProfileArn() != null
                && other.getRoutingProfileArn().equals(this.getRoutingProfileArn()) == false)
            return false;
        if (other.getRoutingProfileId() == null ^ this.getRoutingProfileId() == null)
            return false;
        if (other.getRoutingProfileId() != null
                && other.getRoutingProfileId().equals(this.getRoutingProfileId()) == false)
            return false;
        return true;
    }
}
