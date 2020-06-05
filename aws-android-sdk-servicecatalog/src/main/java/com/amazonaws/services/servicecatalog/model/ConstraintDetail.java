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

package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;

/**
 * <p>
 * Information about a constraint.
 * </p>
 */
public class ConstraintDetail implements Serializable {
    /**
     * <p>
     * The identifier of the constraint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     */
    private String constraintId;

    /**
     * <p>
     * The type of constraint.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LAUNCH</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOTIFICATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * STACKSET
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TEMPLATE</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String type;

    /**
     * <p>
     * The description of the constraint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2000<br/>
     */
    private String description;

    /**
     * <p>
     * The owner of the constraint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     */
    private String owner;

    /**
     * <p>
     * The identifier of the product the constraint applies to. Note that a
     * constraint applies to a specific instance of a product within a certain
     * portfolio.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     */
    private String productId;

    /**
     * <p>
     * The identifier of the portfolio the product resides in. The constraint
     * applies only to the instance of the product that lives within this
     * portfolio.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     */
    private String portfolioId;

    /**
     * <p>
     * The identifier of the constraint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @return <p>
     *         The identifier of the constraint.
     *         </p>
     */
    public String getConstraintId() {
        return constraintId;
    }

    /**
     * <p>
     * The identifier of the constraint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param constraintId <p>
     *            The identifier of the constraint.
     *            </p>
     */
    public void setConstraintId(String constraintId) {
        this.constraintId = constraintId;
    }

    /**
     * <p>
     * The identifier of the constraint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param constraintId <p>
     *            The identifier of the constraint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConstraintDetail withConstraintId(String constraintId) {
        this.constraintId = constraintId;
        return this;
    }

    /**
     * <p>
     * The type of constraint.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LAUNCH</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOTIFICATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * STACKSET
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TEMPLATE</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The type of constraint.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>LAUNCH</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NOTIFICATION</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         STACKSET
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TEMPLATE</code>
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of constraint.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LAUNCH</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOTIFICATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * STACKSET
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TEMPLATE</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param type <p>
     *            The type of constraint.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>LAUNCH</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NOTIFICATION</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            STACKSET
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>TEMPLATE</code>
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of constraint.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LAUNCH</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOTIFICATION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * STACKSET
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TEMPLATE</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param type <p>
     *            The type of constraint.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>LAUNCH</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NOTIFICATION</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            STACKSET
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>TEMPLATE</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConstraintDetail withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The description of the constraint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2000<br/>
     *
     * @return <p>
     *         The description of the constraint.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the constraint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2000<br/>
     *
     * @param description <p>
     *            The description of the constraint.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the constraint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2000<br/>
     *
     * @param description <p>
     *            The description of the constraint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConstraintDetail withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The owner of the constraint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @return <p>
     *         The owner of the constraint.
     *         </p>
     */
    public String getOwner() {
        return owner;
    }

    /**
     * <p>
     * The owner of the constraint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @param owner <p>
     *            The owner of the constraint.
     *            </p>
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The owner of the constraint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @param owner <p>
     *            The owner of the constraint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConstraintDetail withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * <p>
     * The identifier of the product the constraint applies to. Note that a
     * constraint applies to a specific instance of a product within a certain
     * portfolio.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @return <p>
     *         The identifier of the product the constraint applies to. Note
     *         that a constraint applies to a specific instance of a product
     *         within a certain portfolio.
     *         </p>
     */
    public String getProductId() {
        return productId;
    }

    /**
     * <p>
     * The identifier of the product the constraint applies to. Note that a
     * constraint applies to a specific instance of a product within a certain
     * portfolio.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param productId <p>
     *            The identifier of the product the constraint applies to. Note
     *            that a constraint applies to a specific instance of a product
     *            within a certain portfolio.
     *            </p>
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * <p>
     * The identifier of the product the constraint applies to. Note that a
     * constraint applies to a specific instance of a product within a certain
     * portfolio.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param productId <p>
     *            The identifier of the product the constraint applies to. Note
     *            that a constraint applies to a specific instance of a product
     *            within a certain portfolio.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConstraintDetail withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * <p>
     * The identifier of the portfolio the product resides in. The constraint
     * applies only to the instance of the product that lives within this
     * portfolio.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @return <p>
     *         The identifier of the portfolio the product resides in. The
     *         constraint applies only to the instance of the product that lives
     *         within this portfolio.
     *         </p>
     */
    public String getPortfolioId() {
        return portfolioId;
    }

    /**
     * <p>
     * The identifier of the portfolio the product resides in. The constraint
     * applies only to the instance of the product that lives within this
     * portfolio.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param portfolioId <p>
     *            The identifier of the portfolio the product resides in. The
     *            constraint applies only to the instance of the product that
     *            lives within this portfolio.
     *            </p>
     */
    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    /**
     * <p>
     * The identifier of the portfolio the product resides in. The constraint
     * applies only to the instance of the product that lives within this
     * portfolio.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param portfolioId <p>
     *            The identifier of the portfolio the product resides in. The
     *            constraint applies only to the instance of the product that
     *            lives within this portfolio.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConstraintDetail withPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
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
        if (getConstraintId() != null)
            sb.append("ConstraintId: " + getConstraintId() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getOwner() != null)
            sb.append("Owner: " + getOwner() + ",");
        if (getProductId() != null)
            sb.append("ProductId: " + getProductId() + ",");
        if (getPortfolioId() != null)
            sb.append("PortfolioId: " + getPortfolioId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getConstraintId() == null) ? 0 : getConstraintId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getProductId() == null) ? 0 : getProductId().hashCode());
        hashCode = prime * hashCode
                + ((getPortfolioId() == null) ? 0 : getPortfolioId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConstraintDetail == false)
            return false;
        ConstraintDetail other = (ConstraintDetail) obj;

        if (other.getConstraintId() == null ^ this.getConstraintId() == null)
            return false;
        if (other.getConstraintId() != null
                && other.getConstraintId().equals(this.getConstraintId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getProductId() == null ^ this.getProductId() == null)
            return false;
        if (other.getProductId() != null
                && other.getProductId().equals(this.getProductId()) == false)
            return false;
        if (other.getPortfolioId() == null ^ this.getPortfolioId() == null)
            return false;
        if (other.getPortfolioId() != null
                && other.getPortfolioId().equals(this.getPortfolioId()) == false)
            return false;
        return true;
    }
}
