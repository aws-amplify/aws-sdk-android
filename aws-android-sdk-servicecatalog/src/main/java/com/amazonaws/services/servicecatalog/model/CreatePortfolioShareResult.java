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

public class CreatePortfolioShareResult implements Serializable {
    /**
     * <p>
     * The portfolio share unique identifier. This will only be returned if
     * portfolio is shared to an organization node.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     */
    private String portfolioShareToken;

    /**
     * <p>
     * The portfolio share unique identifier. This will only be returned if
     * portfolio is shared to an organization node.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @return <p>
     *         The portfolio share unique identifier. This will only be returned
     *         if portfolio is shared to an organization node.
     *         </p>
     */
    public String getPortfolioShareToken() {
        return portfolioShareToken;
    }

    /**
     * <p>
     * The portfolio share unique identifier. This will only be returned if
     * portfolio is shared to an organization node.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param portfolioShareToken <p>
     *            The portfolio share unique identifier. This will only be
     *            returned if portfolio is shared to an organization node.
     *            </p>
     */
    public void setPortfolioShareToken(String portfolioShareToken) {
        this.portfolioShareToken = portfolioShareToken;
    }

    /**
     * <p>
     * The portfolio share unique identifier. This will only be returned if
     * portfolio is shared to an organization node.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param portfolioShareToken <p>
     *            The portfolio share unique identifier. This will only be
     *            returned if portfolio is shared to an organization node.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePortfolioShareResult withPortfolioShareToken(String portfolioShareToken) {
        this.portfolioShareToken = portfolioShareToken;
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
        if (getPortfolioShareToken() != null)
            sb.append("PortfolioShareToken: " + getPortfolioShareToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPortfolioShareToken() == null) ? 0 : getPortfolioShareToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePortfolioShareResult == false)
            return false;
        CreatePortfolioShareResult other = (CreatePortfolioShareResult) obj;

        if (other.getPortfolioShareToken() == null ^ this.getPortfolioShareToken() == null)
            return false;
        if (other.getPortfolioShareToken() != null
                && other.getPortfolioShareToken().equals(this.getPortfolioShareToken()) == false)
            return false;
        return true;
    }
}
