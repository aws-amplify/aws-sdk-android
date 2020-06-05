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
 * Summary information about a product path for a user.
 * </p>
 */
public class LaunchPathSummary implements Serializable {
    /**
     * <p>
     * The identifier of the product path.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     */
    private String id;

    /**
     * <p>
     * The constraints on the portfolio-product relationship.
     * </p>
     */
    private java.util.List<ConstraintSummary> constraintSummaries;

    /**
     * <p>
     * The tags associated with this product path.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the portfolio to which the user was assigned.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The identifier of the product path.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @return <p>
     *         The identifier of the product path.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The identifier of the product path.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param id <p>
     *            The identifier of the product path.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the product path.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param id <p>
     *            The identifier of the product path.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchPathSummary withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The constraints on the portfolio-product relationship.
     * </p>
     *
     * @return <p>
     *         The constraints on the portfolio-product relationship.
     *         </p>
     */
    public java.util.List<ConstraintSummary> getConstraintSummaries() {
        return constraintSummaries;
    }

    /**
     * <p>
     * The constraints on the portfolio-product relationship.
     * </p>
     *
     * @param constraintSummaries <p>
     *            The constraints on the portfolio-product relationship.
     *            </p>
     */
    public void setConstraintSummaries(java.util.Collection<ConstraintSummary> constraintSummaries) {
        if (constraintSummaries == null) {
            this.constraintSummaries = null;
            return;
        }

        this.constraintSummaries = new java.util.ArrayList<ConstraintSummary>(constraintSummaries);
    }

    /**
     * <p>
     * The constraints on the portfolio-product relationship.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param constraintSummaries <p>
     *            The constraints on the portfolio-product relationship.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchPathSummary withConstraintSummaries(ConstraintSummary... constraintSummaries) {
        if (getConstraintSummaries() == null) {
            this.constraintSummaries = new java.util.ArrayList<ConstraintSummary>(
                    constraintSummaries.length);
        }
        for (ConstraintSummary value : constraintSummaries) {
            this.constraintSummaries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The constraints on the portfolio-product relationship.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param constraintSummaries <p>
     *            The constraints on the portfolio-product relationship.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchPathSummary withConstraintSummaries(
            java.util.Collection<ConstraintSummary> constraintSummaries) {
        setConstraintSummaries(constraintSummaries);
        return this;
    }

    /**
     * <p>
     * The tags associated with this product path.
     * </p>
     *
     * @return <p>
     *         The tags associated with this product path.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags associated with this product path.
     * </p>
     *
     * @param tags <p>
     *            The tags associated with this product path.
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
     * The tags associated with this product path.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags associated with this product path.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchPathSummary withTags(Tag... tags) {
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
     * The tags associated with this product path.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags associated with this product path.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchPathSummary withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The name of the portfolio to which the user was assigned.
     * </p>
     *
     * @return <p>
     *         The name of the portfolio to which the user was assigned.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the portfolio to which the user was assigned.
     * </p>
     *
     * @param name <p>
     *            The name of the portfolio to which the user was assigned.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the portfolio to which the user was assigned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the portfolio to which the user was assigned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchPathSummary withName(String name) {
        this.name = name;
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getConstraintSummaries() != null)
            sb.append("ConstraintSummaries: " + getConstraintSummaries() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getName() != null)
            sb.append("Name: " + getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode
                + ((getConstraintSummaries() == null) ? 0 : getConstraintSummaries().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LaunchPathSummary == false)
            return false;
        LaunchPathSummary other = (LaunchPathSummary) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getConstraintSummaries() == null ^ this.getConstraintSummaries() == null)
            return false;
        if (other.getConstraintSummaries() != null
                && other.getConstraintSummaries().equals(this.getConstraintSummaries()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }
}
