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
 * <a>CreateSolution</a>), specifies the recipe that best optimized the
 * specified metric.
 * </p>
 */
public class AutoMLResult implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the best recipe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     */
    private String bestRecipeArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the best recipe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the best recipe.
     *         </p>
     */
    public String getBestRecipeArn() {
        return bestRecipeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the best recipe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param bestRecipeArn <p>
     *            The Amazon Resource Name (ARN) of the best recipe.
     *            </p>
     */
    public void setBestRecipeArn(String bestRecipeArn) {
        this.bestRecipeArn = bestRecipeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the best recipe.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param bestRecipeArn <p>
     *            The Amazon Resource Name (ARN) of the best recipe.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoMLResult withBestRecipeArn(String bestRecipeArn) {
        this.bestRecipeArn = bestRecipeArn;
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
        if (getBestRecipeArn() != null)
            sb.append("bestRecipeArn: " + getBestRecipeArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBestRecipeArn() == null) ? 0 : getBestRecipeArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoMLResult == false)
            return false;
        AutoMLResult other = (AutoMLResult) obj;

        if (other.getBestRecipeArn() == null ^ this.getBestRecipeArn() == null)
            return false;
        if (other.getBestRecipeArn() != null
                && other.getBestRecipeArn().equals(this.getBestRecipeArn()) == false)
            return false;
        return true;
    }
}
