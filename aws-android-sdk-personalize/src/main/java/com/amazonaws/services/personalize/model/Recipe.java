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
 * Provides information about a recipe. Each recipe provides an algorithm that
 * Amazon Personalize uses in model training when you use the
 * <a>CreateSolution</a> operation.
 * </p>
 */
public class Recipe implements Serializable {
    /**
     * <p>
     * The name of the recipe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9][a-zA-Z0-9\-_]*<br/>
     */
    private String name;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recipe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     */
    private String recipeArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the algorithm that Amazon Personalize
     * uses to train the model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     */
    private String algorithmArn;

    /**
     * <p>
     * The ARN of the FeatureTransformation object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     */
    private String featureTransformationArn;

    /**
     * <p>
     * The status of the recipe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     */
    private String status;

    /**
     * <p>
     * The description of the recipe.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The date and time (in Unix format) that the recipe was created.
     * </p>
     */
    private java.util.Date creationDateTime;

    /**
     * <p>
     * One of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PERSONALIZED_RANKING
     * </p>
     * </li>
     * <li>
     * <p>
     * RELATED_ITEMS
     * </p>
     * </li>
     * <li>
     * <p>
     * USER_PERSONALIZATION
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     */
    private String recipeType;

    /**
     * <p>
     * The date and time (in Unix format) that the recipe was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedDateTime;

    /**
     * <p>
     * The name of the recipe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9][a-zA-Z0-9\-_]*<br/>
     *
     * @return <p>
     *         The name of the recipe.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the recipe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9][a-zA-Z0-9\-_]*<br/>
     *
     * @param name <p>
     *            The name of the recipe.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the recipe.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9][a-zA-Z0-9\-_]*<br/>
     *
     * @param name <p>
     *            The name of the recipe.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Recipe withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recipe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the recipe.
     *         </p>
     */
    public String getRecipeArn() {
        return recipeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recipe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param recipeArn <p>
     *            The Amazon Resource Name (ARN) of the recipe.
     *            </p>
     */
    public void setRecipeArn(String recipeArn) {
        this.recipeArn = recipeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recipe.
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
     *            The Amazon Resource Name (ARN) of the recipe.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Recipe withRecipeArn(String recipeArn) {
        this.recipeArn = recipeArn;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the algorithm that Amazon Personalize
     * uses to train the model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the algorithm that Amazon
     *         Personalize uses to train the model.
     *         </p>
     */
    public String getAlgorithmArn() {
        return algorithmArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the algorithm that Amazon Personalize
     * uses to train the model.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param algorithmArn <p>
     *            The Amazon Resource Name (ARN) of the algorithm that Amazon
     *            Personalize uses to train the model.
     *            </p>
     */
    public void setAlgorithmArn(String algorithmArn) {
        this.algorithmArn = algorithmArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the algorithm that Amazon Personalize
     * uses to train the model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param algorithmArn <p>
     *            The Amazon Resource Name (ARN) of the algorithm that Amazon
     *            Personalize uses to train the model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Recipe withAlgorithmArn(String algorithmArn) {
        this.algorithmArn = algorithmArn;
        return this;
    }

    /**
     * <p>
     * The ARN of the FeatureTransformation object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @return <p>
     *         The ARN of the FeatureTransformation object.
     *         </p>
     */
    public String getFeatureTransformationArn() {
        return featureTransformationArn;
    }

    /**
     * <p>
     * The ARN of the FeatureTransformation object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param featureTransformationArn <p>
     *            The ARN of the FeatureTransformation object.
     *            </p>
     */
    public void setFeatureTransformationArn(String featureTransformationArn) {
        this.featureTransformationArn = featureTransformationArn;
    }

    /**
     * <p>
     * The ARN of the FeatureTransformation object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param featureTransformationArn <p>
     *            The ARN of the FeatureTransformation object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Recipe withFeatureTransformationArn(String featureTransformationArn) {
        this.featureTransformationArn = featureTransformationArn;
        return this;
    }

    /**
     * <p>
     * The status of the recipe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @return <p>
     *         The status of the recipe.
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the recipe.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param status <p>
     *            The status of the recipe.
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the recipe.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param status <p>
     *            The status of the recipe.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Recipe withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The description of the recipe.
     * </p>
     *
     * @return <p>
     *         The description of the recipe.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the recipe.
     * </p>
     *
     * @param description <p>
     *            The description of the recipe.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the recipe.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The description of the recipe.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Recipe withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The date and time (in Unix format) that the recipe was created.
     * </p>
     *
     * @return <p>
     *         The date and time (in Unix format) that the recipe was created.
     *         </p>
     */
    public java.util.Date getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * <p>
     * The date and time (in Unix format) that the recipe was created.
     * </p>
     *
     * @param creationDateTime <p>
     *            The date and time (in Unix format) that the recipe was
     *            created.
     *            </p>
     */
    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The date and time (in Unix format) that the recipe was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDateTime <p>
     *            The date and time (in Unix format) that the recipe was
     *            created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Recipe withCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
        return this;
    }

    /**
     * <p>
     * One of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PERSONALIZED_RANKING
     * </p>
     * </li>
     * <li>
     * <p>
     * RELATED_ITEMS
     * </p>
     * </li>
     * <li>
     * <p>
     * USER_PERSONALIZATION
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @return <p>
     *         One of the following values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         PERSONALIZED_RANKING
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         RELATED_ITEMS
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         USER_PERSONALIZATION
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getRecipeType() {
        return recipeType;
    }

    /**
     * <p>
     * One of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PERSONALIZED_RANKING
     * </p>
     * </li>
     * <li>
     * <p>
     * RELATED_ITEMS
     * </p>
     * </li>
     * <li>
     * <p>
     * USER_PERSONALIZATION
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param recipeType <p>
     *            One of the following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            PERSONALIZED_RANKING
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            RELATED_ITEMS
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            USER_PERSONALIZATION
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setRecipeType(String recipeType) {
        this.recipeType = recipeType;
    }

    /**
     * <p>
     * One of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PERSONALIZED_RANKING
     * </p>
     * </li>
     * <li>
     * <p>
     * RELATED_ITEMS
     * </p>
     * </li>
     * <li>
     * <p>
     * USER_PERSONALIZATION
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param recipeType <p>
     *            One of the following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            PERSONALIZED_RANKING
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            RELATED_ITEMS
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            USER_PERSONALIZATION
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Recipe withRecipeType(String recipeType) {
        this.recipeType = recipeType;
        return this;
    }

    /**
     * <p>
     * The date and time (in Unix format) that the recipe was last updated.
     * </p>
     *
     * @return <p>
     *         The date and time (in Unix format) that the recipe was last
     *         updated.
     *         </p>
     */
    public java.util.Date getLastUpdatedDateTime() {
        return lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time (in Unix format) that the recipe was last updated.
     * </p>
     *
     * @param lastUpdatedDateTime <p>
     *            The date and time (in Unix format) that the recipe was last
     *            updated.
     *            </p>
     */
    public void setLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time (in Unix format) that the recipe was last updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdatedDateTime <p>
     *            The date and time (in Unix format) that the recipe was last
     *            updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Recipe withLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
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
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getRecipeArn() != null)
            sb.append("recipeArn: " + getRecipeArn() + ",");
        if (getAlgorithmArn() != null)
            sb.append("algorithmArn: " + getAlgorithmArn() + ",");
        if (getFeatureTransformationArn() != null)
            sb.append("featureTransformationArn: " + getFeatureTransformationArn() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getCreationDateTime() != null)
            sb.append("creationDateTime: " + getCreationDateTime() + ",");
        if (getRecipeType() != null)
            sb.append("recipeType: " + getRecipeType() + ",");
        if (getLastUpdatedDateTime() != null)
            sb.append("lastUpdatedDateTime: " + getLastUpdatedDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRecipeArn() == null) ? 0 : getRecipeArn().hashCode());
        hashCode = prime * hashCode
                + ((getAlgorithmArn() == null) ? 0 : getAlgorithmArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getFeatureTransformationArn() == null) ? 0 : getFeatureTransformationArn()
                        .hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getRecipeType() == null) ? 0 : getRecipeType().hashCode());
        hashCode = prime * hashCode
                + ((getLastUpdatedDateTime() == null) ? 0 : getLastUpdatedDateTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Recipe == false)
            return false;
        Recipe other = (Recipe) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRecipeArn() == null ^ this.getRecipeArn() == null)
            return false;
        if (other.getRecipeArn() != null
                && other.getRecipeArn().equals(this.getRecipeArn()) == false)
            return false;
        if (other.getAlgorithmArn() == null ^ this.getAlgorithmArn() == null)
            return false;
        if (other.getAlgorithmArn() != null
                && other.getAlgorithmArn().equals(this.getAlgorithmArn()) == false)
            return false;
        if (other.getFeatureTransformationArn() == null
                ^ this.getFeatureTransformationArn() == null)
            return false;
        if (other.getFeatureTransformationArn() != null
                && other.getFeatureTransformationArn().equals(this.getFeatureTransformationArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null
                && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getRecipeType() == null ^ this.getRecipeType() == null)
            return false;
        if (other.getRecipeType() != null
                && other.getRecipeType().equals(this.getRecipeType()) == false)
            return false;
        if (other.getLastUpdatedDateTime() == null ^ this.getLastUpdatedDateTime() == null)
            return false;
        if (other.getLastUpdatedDateTime() != null
                && other.getLastUpdatedDateTime().equals(this.getLastUpdatedDateTime()) == false)
            return false;
        return true;
    }
}
