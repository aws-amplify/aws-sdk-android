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

/**
 * <p>
 * The skill store category that is shown. Alexa skills are assigned a specific
 * skill category during creation, such as News, Social, and Sports.
 * </p>
 */
public class Category implements Serializable {
    /**
     * <p>
     * The ID of the skill store category.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Long categoryId;

    /**
     * <p>
     * The name of the skill store category.
     * </p>
     */
    private String categoryName;

    /**
     * <p>
     * The ID of the skill store category.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The ID of the skill store category.
     *         </p>
     */
    public Long getCategoryId() {
        return categoryId;
    }

    /**
     * <p>
     * The ID of the skill store category.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param categoryId <p>
     *            The ID of the skill store category.
     *            </p>
     */
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * <p>
     * The ID of the skill store category.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param categoryId <p>
     *            The ID of the skill store category.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Category withCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    /**
     * <p>
     * The name of the skill store category.
     * </p>
     *
     * @return <p>
     *         The name of the skill store category.
     *         </p>
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * <p>
     * The name of the skill store category.
     * </p>
     *
     * @param categoryName <p>
     *            The name of the skill store category.
     *            </p>
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * <p>
     * The name of the skill store category.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param categoryName <p>
     *            The name of the skill store category.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Category withCategoryName(String categoryName) {
        this.categoryName = categoryName;
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
        if (getCategoryId() != null)
            sb.append("CategoryId: " + getCategoryId() + ",");
        if (getCategoryName() != null)
            sb.append("CategoryName: " + getCategoryName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCategoryId() == null) ? 0 : getCategoryId().hashCode());
        hashCode = prime * hashCode
                + ((getCategoryName() == null) ? 0 : getCategoryName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Category == false)
            return false;
        Category other = (Category) obj;

        if (other.getCategoryId() == null ^ this.getCategoryId() == null)
            return false;
        if (other.getCategoryId() != null
                && other.getCategoryId().equals(this.getCategoryId()) == false)
            return false;
        if (other.getCategoryName() == null ^ this.getCategoryName() == null)
            return false;
        if (other.getCategoryName() != null
                && other.getCategoryName().equals(this.getCategoryName()) == false)
            return false;
        return true;
    }
}
