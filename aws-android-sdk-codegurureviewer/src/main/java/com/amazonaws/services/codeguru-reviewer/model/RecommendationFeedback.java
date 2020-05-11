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
 * <p> Information about the recommendation feedback. </p>
 */
public class RecommendationFeedback implements Serializable {
    /**
     * <p> The Amazon Resource Name (ARN) that identifies the code review. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>^arn:aws[^:\s]*:codeguru-reviewer:[^:\s]+:[\d]{12}:[a-z-]+:[\w-]+$<br/>
     */
    private String codeReviewArn;

    /**
     * <p> The recommendation ID that can be used to track the provided recommendations. Later on it can be used to collect the feedback. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String recommendationId;

    /**
     * <p> List for storing reactions. Reactions are utf-8 text code for emojis. You can send an empty list to clear off all your feedback. </p>
     */
    private java.util.List<String> reactions;

    /**
     * <p> The user principal that made the API call. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String userId;

    /**
     * <p> The time at which the feedback was created. </p>
     */
    private java.util.Date createdTimeStamp;

    /**
     * <p> The time at which the feedback was last updated. </p>
     */
    private java.util.Date lastUpdatedTimeStamp;

    /**
     * <p> The Amazon Resource Name (ARN) that identifies the code review. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>^arn:aws[^:\s]*:codeguru-reviewer:[^:\s]+:[\d]{12}:[a-z-]+:[\w-]+$<br/>
     *
     * @return <p> The Amazon Resource Name (ARN) that identifies the code review. </p>
     */
    public String getCodeReviewArn() {
        return codeReviewArn;
    }

    /**
     * <p> The Amazon Resource Name (ARN) that identifies the code review. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>^arn:aws[^:\s]*:codeguru-reviewer:[^:\s]+:[\d]{12}:[a-z-]+:[\w-]+$<br/>
     *
     * @param codeReviewArn <p> The Amazon Resource Name (ARN) that identifies the code review. </p>
     */
    public void setCodeReviewArn(String codeReviewArn) {
        this.codeReviewArn = codeReviewArn;
    }

    /**
     * <p> The Amazon Resource Name (ARN) that identifies the code review. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>^arn:aws[^:\s]*:codeguru-reviewer:[^:\s]+:[\d]{12}:[a-z-]+:[\w-]+$<br/>
     *
     * @param codeReviewArn <p> The Amazon Resource Name (ARN) that identifies the code review. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public RecommendationFeedback withCodeReviewArn(String codeReviewArn) {
        this.codeReviewArn = codeReviewArn;
        return this;
    }

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
    public RecommendationFeedback withRecommendationId(String recommendationId) {
        this.recommendationId = recommendationId;
        return this;
    }

    /**
     * <p> List for storing reactions. Reactions are utf-8 text code for emojis. You can send an empty list to clear off all your feedback. </p>
     *
     * @return <p> List for storing reactions. Reactions are utf-8 text code for emojis. You can send an empty list to clear off all your feedback. </p>
     */
    public java.util.List<String> getReactions() {
        return reactions;
    }

    /**
     * <p> List for storing reactions. Reactions are utf-8 text code for emojis. You can send an empty list to clear off all your feedback. </p>
     *
     * @param reactions <p> List for storing reactions. Reactions are utf-8 text code for emojis. You can send an empty list to clear off all your feedback. </p>
     */
    public void setReactions(java.util.Collection<String> reactions) {
        if (reactions == null) {
            this.reactions = null;
            return;
        }

        this.reactions = new java.util.ArrayList<String>(reactions);
    }

    /**
     * <p> List for storing reactions. Reactions are utf-8 text code for emojis. You can send an empty list to clear off all your feedback. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reactions <p> List for storing reactions. Reactions are utf-8 text code for emojis. You can send an empty list to clear off all your feedback. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public RecommendationFeedback withReactions(String... reactions) {
        if (getReactions() == null) {
            this.reactions = new java.util.ArrayList<String>(reactions.length);
        }
        for (String value : reactions) {
            this.reactions.add(value);
        }
        return this;
    }

    /**
     * <p> List for storing reactions. Reactions are utf-8 text code for emojis. You can send an empty list to clear off all your feedback. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reactions <p> List for storing reactions. Reactions are utf-8 text code for emojis. You can send an empty list to clear off all your feedback. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public RecommendationFeedback withReactions(java.util.Collection<String> reactions) {
        setReactions(reactions);
        return this;
    }

    /**
     * <p> The user principal that made the API call. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p> The user principal that made the API call. </p>
     */
    public String getUserId() {
        return userId;
    }

    /**
     * <p> The user principal that made the API call. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param userId <p> The user principal that made the API call. </p>
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p> The user principal that made the API call. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param userId <p> The user principal that made the API call. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public RecommendationFeedback withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * <p> The time at which the feedback was created. </p>
     *
     * @return <p> The time at which the feedback was created. </p>
     */
    public java.util.Date getCreatedTimeStamp() {
        return createdTimeStamp;
    }

    /**
     * <p> The time at which the feedback was created. </p>
     *
     * @param createdTimeStamp <p> The time at which the feedback was created. </p>
     */
    public void setCreatedTimeStamp(java.util.Date createdTimeStamp) {
        this.createdTimeStamp = createdTimeStamp;
    }

    /**
     * <p> The time at which the feedback was created. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createdTimeStamp <p> The time at which the feedback was created. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public RecommendationFeedback withCreatedTimeStamp(java.util.Date createdTimeStamp) {
        this.createdTimeStamp = createdTimeStamp;
        return this;
    }

    /**
     * <p> The time at which the feedback was last updated. </p>
     *
     * @return <p> The time at which the feedback was last updated. </p>
     */
    public java.util.Date getLastUpdatedTimeStamp() {
        return lastUpdatedTimeStamp;
    }

    /**
     * <p> The time at which the feedback was last updated. </p>
     *
     * @param lastUpdatedTimeStamp <p> The time at which the feedback was last updated. </p>
     */
    public void setLastUpdatedTimeStamp(java.util.Date lastUpdatedTimeStamp) {
        this.lastUpdatedTimeStamp = lastUpdatedTimeStamp;
    }

    /**
     * <p> The time at which the feedback was last updated. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastUpdatedTimeStamp <p> The time at which the feedback was last updated. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public RecommendationFeedback withLastUpdatedTimeStamp(java.util.Date lastUpdatedTimeStamp) {
        this.lastUpdatedTimeStamp = lastUpdatedTimeStamp;
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
        if (getCodeReviewArn() != null) sb.append("CodeReviewArn: " + getCodeReviewArn() + ",");
        if (getRecommendationId() != null) sb.append("RecommendationId: " + getRecommendationId() + ",");
        if (getReactions() != null) sb.append("Reactions: " + getReactions() + ",");
        if (getUserId() != null) sb.append("UserId: " + getUserId() + ",");
        if (getCreatedTimeStamp() != null) sb.append("CreatedTimeStamp: " + getCreatedTimeStamp() + ",");
        if (getLastUpdatedTimeStamp() != null) sb.append("LastUpdatedTimeStamp: " + getLastUpdatedTimeStamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCodeReviewArn() == null) ? 0 : getCodeReviewArn().hashCode());
        hashCode = prime * hashCode + ((getRecommendationId() == null) ? 0 : getRecommendationId().hashCode());
        hashCode = prime * hashCode + ((getReactions() == null) ? 0 : getReactions().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimeStamp() == null) ? 0 : getCreatedTimeStamp().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTimeStamp() == null) ? 0 : getLastUpdatedTimeStamp().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RecommendationFeedback == false) return false;
        RecommendationFeedback other = (RecommendationFeedback)obj;

        if (other.getCodeReviewArn() == null ^ this.getCodeReviewArn() == null) return false;
        if (other.getCodeReviewArn() != null && other.getCodeReviewArn().equals(this.getCodeReviewArn()) == false) return false;
        if (other.getRecommendationId() == null ^ this.getRecommendationId() == null) return false;
        if (other.getRecommendationId() != null && other.getRecommendationId().equals(this.getRecommendationId()) == false) return false;
        if (other.getReactions() == null ^ this.getReactions() == null) return false;
        if (other.getReactions() != null && other.getReactions().equals(this.getReactions()) == false) return false;
        if (other.getUserId() == null ^ this.getUserId() == null) return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false) return false;
        if (other.getCreatedTimeStamp() == null ^ this.getCreatedTimeStamp() == null) return false;
        if (other.getCreatedTimeStamp() != null && other.getCreatedTimeStamp().equals(this.getCreatedTimeStamp()) == false) return false;
        if (other.getLastUpdatedTimeStamp() == null ^ this.getLastUpdatedTimeStamp() == null) return false;
        if (other.getLastUpdatedTimeStamp() != null && other.getLastUpdatedTimeStamp().equals(this.getLastUpdatedTimeStamp()) == false) return false;
        return true;
    }
}
