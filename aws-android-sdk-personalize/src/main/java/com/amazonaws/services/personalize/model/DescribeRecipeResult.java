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

package com.amazonaws.services.personalize.model;

import java.io.Serializable;

public class DescribeRecipeResult implements Serializable {
    /**
     * <p>
     * An object that describes the recipe.
     * </p>
     */
    private Recipe recipe;

    /**
     * <p>
     * An object that describes the recipe.
     * </p>
     *
     * @return <p>
     *         An object that describes the recipe.
     *         </p>
     */
    public Recipe getRecipe() {
        return recipe;
    }

    /**
     * <p>
     * An object that describes the recipe.
     * </p>
     *
     * @param recipe <p>
     *            An object that describes the recipe.
     *            </p>
     */
    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    /**
     * <p>
     * An object that describes the recipe.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recipe <p>
     *            An object that describes the recipe.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeRecipeResult withRecipe(Recipe recipe) {
        this.recipe = recipe;
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
        if (getRecipe() != null)
            sb.append("recipe: " + getRecipe());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecipe() == null) ? 0 : getRecipe().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeRecipeResult == false)
            return false;
        DescribeRecipeResult other = (DescribeRecipeResult) obj;

        if (other.getRecipe() == null ^ this.getRecipe() == null)
            return false;
        if (other.getRecipe() != null && other.getRecipe().equals(this.getRecipe()) == false)
            return false;
        return true;
    }
}
