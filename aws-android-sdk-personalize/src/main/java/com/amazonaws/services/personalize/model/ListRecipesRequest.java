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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns a list of available recipes. The response provides the properties for
 * each recipe, including the recipe's Amazon Resource Name (ARN).
 * </p>
 */
public class ListRecipesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The default is <code>SERVICE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE
     */
    private String recipeProvider;

    /**
     * <p>
     * A token returned from the previous call to <code>ListRecipes</code> for
     * getting the next set of recipes (if they exist).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1300<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of recipes to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The default is <code>SERVICE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE
     *
     * @return <p>
     *         The default is <code>SERVICE</code>.
     *         </p>
     * @see RecipeProvider
     */
    public String getRecipeProvider() {
        return recipeProvider;
    }

    /**
     * <p>
     * The default is <code>SERVICE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE
     *
     * @param recipeProvider <p>
     *            The default is <code>SERVICE</code>.
     *            </p>
     * @see RecipeProvider
     */
    public void setRecipeProvider(String recipeProvider) {
        this.recipeProvider = recipeProvider;
    }

    /**
     * <p>
     * The default is <code>SERVICE</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE
     *
     * @param recipeProvider <p>
     *            The default is <code>SERVICE</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RecipeProvider
     */
    public ListRecipesRequest withRecipeProvider(String recipeProvider) {
        this.recipeProvider = recipeProvider;
        return this;
    }

    /**
     * <p>
     * The default is <code>SERVICE</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE
     *
     * @param recipeProvider <p>
     *            The default is <code>SERVICE</code>.
     *            </p>
     * @see RecipeProvider
     */
    public void setRecipeProvider(RecipeProvider recipeProvider) {
        this.recipeProvider = recipeProvider.toString();
    }

    /**
     * <p>
     * The default is <code>SERVICE</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE
     *
     * @param recipeProvider <p>
     *            The default is <code>SERVICE</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RecipeProvider
     */
    public ListRecipesRequest withRecipeProvider(RecipeProvider recipeProvider) {
        this.recipeProvider = recipeProvider.toString();
        return this;
    }

    /**
     * <p>
     * A token returned from the previous call to <code>ListRecipes</code> for
     * getting the next set of recipes (if they exist).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1300<br/>
     *
     * @return <p>
     *         A token returned from the previous call to
     *         <code>ListRecipes</code> for getting the next set of recipes (if
     *         they exist).
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A token returned from the previous call to <code>ListRecipes</code> for
     * getting the next set of recipes (if they exist).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1300<br/>
     *
     * @param nextToken <p>
     *            A token returned from the previous call to
     *            <code>ListRecipes</code> for getting the next set of recipes
     *            (if they exist).
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token returned from the previous call to <code>ListRecipes</code> for
     * getting the next set of recipes (if they exist).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1300<br/>
     *
     * @param nextToken <p>
     *            A token returned from the previous call to
     *            <code>ListRecipes</code> for getting the next set of recipes
     *            (if they exist).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRecipesRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of recipes to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>
     *         The maximum number of recipes to return.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of recipes to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of recipes to return.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of recipes to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of recipes to return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRecipesRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
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
        if (getRecipeProvider() != null)
            sb.append("recipeProvider: " + getRecipeProvider() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("maxResults: " + getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRecipeProvider() == null) ? 0 : getRecipeProvider().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRecipesRequest == false)
            return false;
        ListRecipesRequest other = (ListRecipesRequest) obj;

        if (other.getRecipeProvider() == null ^ this.getRecipeProvider() == null)
            return false;
        if (other.getRecipeProvider() != null
                && other.getRecipeProvider().equals(this.getRecipeProvider()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }
}
