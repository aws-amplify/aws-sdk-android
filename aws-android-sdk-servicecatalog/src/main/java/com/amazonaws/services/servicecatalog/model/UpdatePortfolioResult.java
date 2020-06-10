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

public class UpdatePortfolioResult implements Serializable {
    /**
     * <p>
     * Information about the portfolio.
     * </p>
     */
    private PortfolioDetail portfolioDetail;

    /**
     * <p>
     * Information about the tags associated with the portfolio.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Information about the portfolio.
     * </p>
     *
     * @return <p>
     *         Information about the portfolio.
     *         </p>
     */
    public PortfolioDetail getPortfolioDetail() {
        return portfolioDetail;
    }

    /**
     * <p>
     * Information about the portfolio.
     * </p>
     *
     * @param portfolioDetail <p>
     *            Information about the portfolio.
     *            </p>
     */
    public void setPortfolioDetail(PortfolioDetail portfolioDetail) {
        this.portfolioDetail = portfolioDetail;
    }

    /**
     * <p>
     * Information about the portfolio.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param portfolioDetail <p>
     *            Information about the portfolio.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdatePortfolioResult withPortfolioDetail(PortfolioDetail portfolioDetail) {
        this.portfolioDetail = portfolioDetail;
        return this;
    }

    /**
     * <p>
     * Information about the tags associated with the portfolio.
     * </p>
     *
     * @return <p>
     *         Information about the tags associated with the portfolio.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Information about the tags associated with the portfolio.
     * </p>
     *
     * @param tags <p>
     *            Information about the tags associated with the portfolio.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Information about the tags associated with the portfolio.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Information about the tags associated with the portfolio.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdatePortfolioResult withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the tags associated with the portfolio.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Information about the tags associated with the portfolio.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdatePortfolioResult withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getPortfolioDetail() != null)
            sb.append("PortfolioDetail: " + getPortfolioDetail() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPortfolioDetail() == null) ? 0 : getPortfolioDetail().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePortfolioResult == false)
            return false;
        UpdatePortfolioResult other = (UpdatePortfolioResult) obj;

        if (other.getPortfolioDetail() == null ^ this.getPortfolioDetail() == null)
            return false;
        if (other.getPortfolioDetail() != null
                && other.getPortfolioDetail().equals(this.getPortfolioDetail()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
