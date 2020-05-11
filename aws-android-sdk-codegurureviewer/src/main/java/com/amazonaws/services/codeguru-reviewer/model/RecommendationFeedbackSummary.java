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
package com.amazonaws.services.codeguru-reviewer.model;

import java.io.Serializable;


/**
 * <p> Information about recommendation feedback summaries. </p>
 */
public class RecommendationFeedbackSummary implements Serializable {
    /**
     * <p> The recommendation ID that can be used to track the provided recommendations. Later on it can be used to collect the feedback. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String recommendationId;

    /**
     * <p> List for storing reactions. Reactions are utf-8 text code for emojis. </p>
     */
    private java.util.List<String> reactions;

    /**
     * <p> The identifier for the user that gave the feedback. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String userId;

    /**
     * <p> The recommendation ID that can be used to track the provided recommendations. Later on it can be used to collect the feedback. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p> The recommendation ID that can be used to track the provided recommendations. Later on it can be used to collect the feedback. </p>
     */
    public String getRecommendationId() {
        return recommendationId;
    }

    /**
     * <p> The recommendation ID that can be used to track the provided recommendations. Later on it can be used to collect the feedback. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param recommendationId <p> The recommendation ID that can be used to track the provided recommendations. Later on it can be used to collect the feedback. </p>
     */
    public void setRecommendationId(String recommendationId) {
        this.recommendationId = recommendationId;
    }

    /**
     * <p> The recommendation ID that can be used to track the provided recommendations. Later on it can be used to collect the feedback. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param recommendationId <p> The recommendation ID that can be used to track the provided recommendations. Later on it can be used to collect the feedback. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public RecommendationFeedbackSummary withRecommendationId(String recommendationId) {
        this.recommendationId = recommendationId;
        return this;
    }

    /**
     * <p> List for storing reactions. Reactions are utf-8 text code for emojis. </p>
     *
     * @return <p> List for storing reactions. Reactions are utf-8 text code for emojis. </p>
     */
    public java.util.List<String> getReactions() {
        return reactions;
    }

    /**
     * <p> List for storing reactions. Reactions are utf-8 text code for emojis. </p>
     *
     * @param reactions <p> List for storing reactions. Reactions are utf-8 text code for emojis. </p>
     */
    public void setReactions(java.util.Collection<String> reactions) {
        if (reactions == null) {
            this.reactions = null;
            return;
        }

        this.reactions = new java.util.ArrayList<String>(reactions);
    }

    /**
     * <p> List for storing reactions. Reactions are utf-8 text code for emojis. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reactions <p> List for storing reactions. Reactions are utf-8 text code for emojis. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public RecommendationFeedbackSummary withReactions(String... reactions) {
        if (getReactions() == null) {
            this.reactions = new java.util.ArrayList<String>(reactions.length);
        }
        for (String value : reactions) {
            this.reactions.add(value);
        }
        return this;
    }

    /**
     * <p> List for storing reactions. Reactions are utf-8 text code for emojis. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reactions <p> List for storing reactions. Reactions are utf-8 text code for emojis. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public RecommendationFeedbackSummary withReactions(java.util.Collection<String> reactions) {
        setReactions(reactions);
        return this;
    }

    /**
     * <p> The identifier for the user that gave the feedback. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p> The identifier for the user that gave the feedback. </p>
     */
    public String getUserId() {
        return userId;
    }

    /**
     * <p> The identifier for the user that gave the feedback. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param userId <p> The identifier for the user that gave the feedback. </p>
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p> The identifier for the user that gave the feedback. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param userId <p> The identifier for the user that gave the feedback. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public RecommendationFeedbackSummary withUserId(String userId) {
        this.userId = userId;
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
        if (getRecommendationId() != null) sb.append("RecommendationId: " + getRecommendationId() + ",");
        if (getReactions() != null) sb.append("Reactions: " + getReactions() + ",");
        if (getUserId() != null) sb.append("UserId: " + getUserId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecommendationId() == null) ? 0 : getRecommendationId().hashCode());
        hashCode = prime * hashCode + ((getReactions() == null) ? 0 : getReactions().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RecommendationFeedbackSummary == false) return false;
        RecommendationFeedbackSummary other = (RecommendationFeedbackSummary)obj;

        if (other.getRecommendationId() == null ^ this.getRecommendationId() == null) return false;
        if (other.getRecommendationId() != null && other.getRecommendationId().equals(this.getRecommendationId()) == false) return false;
        if (other.getReactions() == null ^ this.getReactions() == null) return false;
        if (other.getReactions() != null && other.getReactions().equals(this.getReactions()) == false) return false;
        if (other.getUserId() == null ^ this.getUserId() == null) return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false) return false;
        return true;
    }
}
