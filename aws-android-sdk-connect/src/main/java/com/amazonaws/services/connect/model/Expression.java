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
 * A tagged union to specify expression for a routing step.
 * </p>
 */
public class Expression implements Serializable {
    /**
     * <p>
     * An object to specify the predefined attribute condition.
     * </p>
     */
    private AttributeCondition attributeCondition;

    /**
     * <p>
     * List of routing expressions which will be AND-ed together.
     * </p>
     */
    private java.util.List<Expression> andExpression;

    /**
     * <p>
     * List of routing expressions which will be OR-ed together.
     * </p>
     */
    private java.util.List<Expression> orExpression;

    /**
     * <p>
     * An object to specify the predefined attribute condition.
     * </p>
     *
     * @return <p>
     *         An object to specify the predefined attribute condition.
     *         </p>
     */
    public AttributeCondition getAttributeCondition() {
        return attributeCondition;
    }

    /**
     * <p>
     * An object to specify the predefined attribute condition.
     * </p>
     *
     * @param attributeCondition <p>
     *            An object to specify the predefined attribute condition.
     *            </p>
     */
    public void setAttributeCondition(AttributeCondition attributeCondition) {
        this.attributeCondition = attributeCondition;
    }

    /**
     * <p>
     * An object to specify the predefined attribute condition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributeCondition <p>
     *            An object to specify the predefined attribute condition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Expression withAttributeCondition(AttributeCondition attributeCondition) {
        this.attributeCondition = attributeCondition;
        return this;
    }

    /**
     * <p>
     * List of routing expressions which will be AND-ed together.
     * </p>
     *
     * @return <p>
     *         List of routing expressions which will be AND-ed together.
     *         </p>
     */
    public java.util.List<Expression> getAndExpression() {
        return andExpression;
    }

    /**
     * <p>
     * List of routing expressions which will be AND-ed together.
     * </p>
     *
     * @param andExpression <p>
     *            List of routing expressions which will be AND-ed together.
     *            </p>
     */
    public void setAndExpression(java.util.Collection<Expression> andExpression) {
        if (andExpression == null) {
            this.andExpression = null;
            return;
        }

        this.andExpression = new java.util.ArrayList<Expression>(andExpression);
    }

    /**
     * <p>
     * List of routing expressions which will be AND-ed together.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param andExpression <p>
     *            List of routing expressions which will be AND-ed together.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Expression withAndExpression(Expression... andExpression) {
        if (getAndExpression() == null) {
            this.andExpression = new java.util.ArrayList<Expression>(andExpression.length);
        }
        for (Expression value : andExpression) {
            this.andExpression.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of routing expressions which will be AND-ed together.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param andExpression <p>
     *            List of routing expressions which will be AND-ed together.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Expression withAndExpression(java.util.Collection<Expression> andExpression) {
        setAndExpression(andExpression);
        return this;
    }

    /**
     * <p>
     * List of routing expressions which will be OR-ed together.
     * </p>
     *
     * @return <p>
     *         List of routing expressions which will be OR-ed together.
     *         </p>
     */
    public java.util.List<Expression> getOrExpression() {
        return orExpression;
    }

    /**
     * <p>
     * List of routing expressions which will be OR-ed together.
     * </p>
     *
     * @param orExpression <p>
     *            List of routing expressions which will be OR-ed together.
     *            </p>
     */
    public void setOrExpression(java.util.Collection<Expression> orExpression) {
        if (orExpression == null) {
            this.orExpression = null;
            return;
        }

        this.orExpression = new java.util.ArrayList<Expression>(orExpression);
    }

    /**
     * <p>
     * List of routing expressions which will be OR-ed together.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param orExpression <p>
     *            List of routing expressions which will be OR-ed together.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Expression withOrExpression(Expression... orExpression) {
        if (getOrExpression() == null) {
            this.orExpression = new java.util.ArrayList<Expression>(orExpression.length);
        }
        for (Expression value : orExpression) {
            this.orExpression.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of routing expressions which will be OR-ed together.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param orExpression <p>
     *            List of routing expressions which will be OR-ed together.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Expression withOrExpression(java.util.Collection<Expression> orExpression) {
        setOrExpression(orExpression);
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
        if (getAttributeCondition() != null)
            sb.append("AttributeCondition: " + getAttributeCondition() + ",");
        if (getAndExpression() != null)
            sb.append("AndExpression: " + getAndExpression() + ",");
        if (getOrExpression() != null)
            sb.append("OrExpression: " + getOrExpression());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAttributeCondition() == null) ? 0 : getAttributeCondition().hashCode());
        hashCode = prime * hashCode
                + ((getAndExpression() == null) ? 0 : getAndExpression().hashCode());
        hashCode = prime * hashCode
                + ((getOrExpression() == null) ? 0 : getOrExpression().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Expression == false)
            return false;
        Expression other = (Expression) obj;

        if (other.getAttributeCondition() == null ^ this.getAttributeCondition() == null)
            return false;
        if (other.getAttributeCondition() != null
                && other.getAttributeCondition().equals(this.getAttributeCondition()) == false)
            return false;
        if (other.getAndExpression() == null ^ this.getAndExpression() == null)
            return false;
        if (other.getAndExpression() != null
                && other.getAndExpression().equals(this.getAndExpression()) == false)
            return false;
        if (other.getOrExpression() == null ^ this.getOrExpression() == null)
            return false;
        if (other.getOrExpression() != null
                && other.getOrExpression().equals(this.getOrExpression()) == false)
            return false;
        return true;
    }
}
