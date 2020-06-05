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
 * Describes a recipe.
 * </p>
 * <p>
 * A recipe contains three items:
 * </p>
 * <ul>
 * <li>
 * <p>
 * An algorithm that trains a model.
 * </p>
 * </li>
 * <li>
 * <p>
 * Hyperparameters that govern the training.
 * </p>
 * </li>
 * <li>
 * <p>
 * Feature transformation information for modifying the input data before
 * training.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Amazon Personalize provides a set of predefined recipes. You specify a recipe
 * when you create a solution with the <a>CreateSolution</a> API.
 * <code>CreateSolution</code> trains a model by using the algorithm in the
 * specified recipe and a training dataset. The solution, when deployed as a
 * campaign, can provide recommendations using the <a href=
 * "https://docs.aws.amazon.com/personalize/latest/dg/API_RS_GetRecommendations.html"
 * >GetRecommendations</a> API.
 * </p>
 */
public class DescribeRecipeRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recipe to describe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     */
    private String recipeArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recipe to describe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the recipe to describe.
     *         </p>
     */
    public String getRecipeArn() {
        return recipeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recipe to describe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param recipeArn <p>
     *            The Amazon Resource Name (ARN) of the recipe to describe.
     *            </p>
     */
    public void setRecipeArn(String recipeArn) {
        this.recipeArn = recipeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recipe to describe.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param recipeArn <p>
     *            The Amazon Resource Name (ARN) of the recipe to describe.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeRecipeRequest withRecipeArn(String recipeArn) {
        this.recipeArn = recipeArn;
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
        if (getRecipeArn() != null)
            sb.append("recipeArn: " + getRecipeArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecipeArn() == null) ? 0 : getRecipeArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeRecipeRequest == false)
            return false;
        DescribeRecipeRequest other = (DescribeRecipeRequest) obj;

        if (other.getRecipeArn() == null ^ this.getRecipeArn() == null)
            return false;
        if (other.getRecipeArn() != null
                && other.getRecipeArn().equals(this.getRecipeArn()) == false)
            return false;
        return true;
    }
}
