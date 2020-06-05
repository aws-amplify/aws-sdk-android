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

/**
 * <p>
 * When the solution performs AutoML (<code>performAutoML</code> is true in
 * <a>CreateSolution</a>), Amazon Personalize determines which recipe, from the
 * specified list, optimizes the given metric. Amazon Personalize then uses that
 * recipe for the solution.
 * </p>
 */
public class AutoMLConfig implements Serializable {
    /**
     * <p>
     * The metric to optimize.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     */
    private String metricName;

    /**
     * <p>
     * The list of candidate recipes.
     * </p>
     */
    private java.util.List<String> recipeList;

    /**
     * <p>
     * The metric to optimize.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @return <p>
     *         The metric to optimize.
     *         </p>
     */
    public String getMetricName() {
        return metricName;
    }

    /**
     * <p>
     * The metric to optimize.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param metricName <p>
     *            The metric to optimize.
     *            </p>
     */
    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The metric to optimize.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param metricName <p>
     *            The metric to optimize.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoMLConfig withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * <p>
     * The list of candidate recipes.
     * </p>
     *
     * @return <p>
     *         The list of candidate recipes.
     *         </p>
     */
    public java.util.List<String> getRecipeList() {
        return recipeList;
    }

    /**
     * <p>
     * The list of candidate recipes.
     * </p>
     *
     * @param recipeList <p>
     *            The list of candidate recipes.
     *            </p>
     */
    public void setRecipeList(java.util.Collection<String> recipeList) {
        if (recipeList == null) {
            this.recipeList = null;
            return;
        }

        this.recipeList = new java.util.ArrayList<String>(recipeList);
    }

    /**
     * <p>
     * The list of candidate recipes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recipeList <p>
     *            The list of candidate recipes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoMLConfig withRecipeList(String... recipeList) {
        if (getRecipeList() == null) {
            this.recipeList = new java.util.ArrayList<String>(recipeList.length);
        }
        for (String value : recipeList) {
            this.recipeList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of candidate recipes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recipeList <p>
     *            The list of candidate recipes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoMLConfig withRecipeList(java.util.Collection<String> recipeList) {
        setRecipeList(recipeList);
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
        if (getMetricName() != null)
            sb.append("metricName: " + getMetricName() + ",");
        if (getRecipeList() != null)
            sb.append("recipeList: " + getRecipeList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getRecipeList() == null) ? 0 : getRecipeList().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoMLConfig == false)
            return false;
        AutoMLConfig other = (AutoMLConfig) obj;

        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null
                && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getRecipeList() == null ^ this.getRecipeList() == null)
            return false;
        if (other.getRecipeList() != null
                && other.getRecipeList().equals(this.getRecipeList()) == false)
            return false;
        return true;
    }
}
