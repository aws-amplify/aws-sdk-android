/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Step signifies the criteria to be used for routing to an agent
 * </p>
 */
public class Step implements Serializable {
    /**
     * <p>
     * An object to specify the expiration of a routing step.
     * </p>
     */
    private Expiry expiry;

    /**
     * <p>
     * A tagged union to specify expression for a routing step.
     * </p>
     */
    private Expression expression;

    /**
     * <p>
     * Represents status of the Routing step.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE, JOINED, EXPIRED
     */
    private String status;

    /**
     * <p>
     * An object to specify the expiration of a routing step.
     * </p>
     *
     * @return <p>
     *         An object to specify the expiration of a routing step.
     *         </p>
     */
    public Expiry getExpiry() {
        return expiry;
    }

    /**
     * <p>
     * An object to specify the expiration of a routing step.
     * </p>
     *
     * @param expiry <p>
     *            An object to specify the expiration of a routing step.
     *            </p>
     */
    public void setExpiry(Expiry expiry) {
        this.expiry = expiry;
    }

    /**
     * <p>
     * An object to specify the expiration of a routing step.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param expiry <p>
     *            An object to specify the expiration of a routing step.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Step withExpiry(Expiry expiry) {
        this.expiry = expiry;
        return this;
    }

    /**
     * <p>
     * A tagged union to specify expression for a routing step.
     * </p>
     *
     * @return <p>
     *         A tagged union to specify expression for a routing step.
     *         </p>
     */
    public Expression getExpression() {
        return expression;
    }

    /**
     * <p>
     * A tagged union to specify expression for a routing step.
     * </p>
     *
     * @param expression <p>
     *            A tagged union to specify expression for a routing step.
     *            </p>
     */
    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    /**
     * <p>
     * A tagged union to specify expression for a routing step.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param expression <p>
     *            A tagged union to specify expression for a routing step.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Step withExpression(Expression expression) {
        this.expression = expression;
        return this;
    }

    /**
     * <p>
     * Represents status of the Routing step.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE, JOINED, EXPIRED
     *
     * @return <p>
     *         Represents status of the Routing step.
     *         </p>
     * @see RoutingCriteriaStepStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * Represents status of the Routing step.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE, JOINED, EXPIRED
     *
     * @param status <p>
     *            Represents status of the Routing step.
     *            </p>
     * @see RoutingCriteriaStepStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Represents status of the Routing step.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE, JOINED, EXPIRED
     *
     * @param status <p>
     *            Represents status of the Routing step.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RoutingCriteriaStepStatus
     */
    public Step withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * Represents status of the Routing step.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE, JOINED, EXPIRED
     *
     * @param status <p>
     *            Represents status of the Routing step.
     *            </p>
     * @see RoutingCriteriaStepStatus
     */
    public void setStatus(RoutingCriteriaStepStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * Represents status of the Routing step.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, INACTIVE, JOINED, EXPIRED
     *
     * @param status <p>
     *            Represents status of the Routing step.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RoutingCriteriaStepStatus
     */
    public Step withStatus(RoutingCriteriaStepStatus status) {
        this.status = status.toString();
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
        if (getExpiry() != null)
            sb.append("Expiry: " + getExpiry() + ",");
        if (getExpression() != null)
            sb.append("Expression: " + getExpression() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExpiry() == null) ? 0 : getExpiry().hashCode());
        hashCode = prime * hashCode + ((getExpression() == null) ? 0 : getExpression().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Step == false)
            return false;
        Step other = (Step) obj;

        if (other.getExpiry() == null ^ this.getExpiry() == null)
            return false;
        if (other.getExpiry() != null && other.getExpiry().equals(this.getExpiry()) == false)
            return false;
        if (other.getExpression() == null ^ this.getExpression() == null)
            return false;
        if (other.getExpression() != null
                && other.getExpression().equals(this.getExpression()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
