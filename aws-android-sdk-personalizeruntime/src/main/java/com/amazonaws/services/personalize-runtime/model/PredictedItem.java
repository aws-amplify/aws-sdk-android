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
package com.amazonaws.services.personalize-runtime.model;

import java.io.Serializable;


/**
 * <p>An object that identifies an item.</p> <p>The and APIs return a list of <code>PredictedItem</code>s.</p>
 */
public class PredictedItem implements Serializable {
    /**
     * <p>The recommended item ID.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     */
    private String itemId;

    /**
     * <p>A numeric representation of the model's certainty that the item will be the next user selection. For more information on scoring logic, see <a>how-scores-work</a>.</p>
     */
    private Double score;

    /**
     * <p>The recommended item ID.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @return <p>The recommended item ID.</p>
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * <p>The recommended item ID.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param itemId <p>The recommended item ID.</p>
     */
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    /**
     * <p>The recommended item ID.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param itemId <p>The recommended item ID.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public PredictedItem withItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }

    /**
     * <p>A numeric representation of the model's certainty that the item will be the next user selection. For more information on scoring logic, see <a>how-scores-work</a>.</p>
     *
     * @return <p>A numeric representation of the model's certainty that the item will be the next user selection. For more information on scoring logic, see <a>how-scores-work</a>.</p>
     */
    public Double getScore() {
        return score;
    }

    /**
     * <p>A numeric representation of the model's certainty that the item will be the next user selection. For more information on scoring logic, see <a>how-scores-work</a>.</p>
     *
     * @param score <p>A numeric representation of the model's certainty that the item will be the next user selection. For more information on scoring logic, see <a>how-scores-work</a>.</p>
     */
    public void setScore(Double score) {
        this.score = score;
    }

    /**
     * <p>A numeric representation of the model's certainty that the item will be the next user selection. For more information on scoring logic, see <a>how-scores-work</a>.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param score <p>A numeric representation of the model's certainty that the item will be the next user selection. For more information on scoring logic, see <a>how-scores-work</a>.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public PredictedItem withScore(Double score) {
        this.score = score;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getItemId() != null) sb.append("itemId: " + getItemId() + ",");
        if (getScore() != null) sb.append("score: " + getScore());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getItemId() == null) ? 0 : getItemId().hashCode());
        hashCode = prime * hashCode + ((getScore() == null) ? 0 : getScore().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PredictedItem == false) return false;
        PredictedItem other = (PredictedItem)obj;

        if (other.getItemId() == null ^ this.getItemId() == null) return false;
        if (other.getItemId() != null && other.getItemId().equals(this.getItemId()) == false) return false;
        if (other.getScore() == null ^ this.getScore() == null) return false;
        if (other.getScore() != null && other.getScore().equals(this.getScore()) == false) return false;
        return true;
    }
}
