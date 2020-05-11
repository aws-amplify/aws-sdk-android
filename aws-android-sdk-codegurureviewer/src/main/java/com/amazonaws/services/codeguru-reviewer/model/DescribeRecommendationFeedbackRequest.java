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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p> Describes the customer feedback for a CodeGuru Reviewer recommendation. </p>
 */
public class DescribeRecommendationFeedbackRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p> The Amazon Resource Name (ARN) that identifies the code review. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>^arn:aws[^:\s]*:codeguru-reviewer:[^:\s]+:[\d]{12}:[a-z-]+:[\w-]+$<br/>
     */
    private String codeReviewArn;

    /**
     * <p> The recommendation ID that can be used to track the provided recommendations and then to collect the feedback. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String recommendationId;

    /**
     * <p> Optional parameter to describe the feedback for a given user. If this is not supplied, it defaults to the user making the request. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String userId;

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
    public DescribeRecommendationFeedbackRequest withCodeReviewArn(String codeReviewArn) {
        this.codeReviewArn = codeReviewArn;
        return this;
    }

    /**
     * <p> The recommendation ID that can be used to track the provided recommendations and then to collect the feedback. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p> The recommendation ID that can be used to track the provided recommendations and then to collect the feedback. </p>
     */
    public String getRecommendationId() {
        return recommendationId;
    }

    /**
     * <p> The recommendation ID that can be used to track the provided recommendations and then to collect the feedback. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param recommendationId <p> The recommendation ID that can be used to track the provided recommendations and then to collect the feedback. </p>
     */
    public void setRecommendationId(String recommendationId) {
        this.recommendationId = recommendationId;
    }

    /**
     * <p> The recommendation ID that can be used to track the provided recommendations and then to collect the feedback. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param recommendationId <p> The recommendation ID that can be used to track the provided recommendations and then to collect the feedback. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeRecommendationFeedbackRequest withRecommendationId(String recommendationId) {
        this.recommendationId = recommendationId;
        return this;
    }

    /**
     * <p> Optional parameter to describe the feedback for a given user. If this is not supplied, it defaults to the user making the request. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p> Optional parameter to describe the feedback for a given user. If this is not supplied, it defaults to the user making the request. </p>
     */
    public String getUserId() {
        return userId;
    }

    /**
     * <p> Optional parameter to describe the feedback for a given user. If this is not supplied, it defaults to the user making the request. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param userId <p> Optional parameter to describe the feedback for a given user. If this is not supplied, it defaults to the user making the request. </p>
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p> Optional parameter to describe the feedback for a given user. If this is not supplied, it defaults to the user making the request. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param userId <p> Optional parameter to describe the feedback for a given user. If this is not supplied, it defaults to the user making the request. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeRecommendationFeedbackRequest withUserId(String userId) {
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
        if (getCodeReviewArn() != null) sb.append("CodeReviewArn: " + getCodeReviewArn() + ",");
        if (getRecommendationId() != null) sb.append("RecommendationId: " + getRecommendationId() + ",");
        if (getUserId() != null) sb.append("UserId: " + getUserId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCodeReviewArn() == null) ? 0 : getCodeReviewArn().hashCode());
        hashCode = prime * hashCode + ((getRecommendationId() == null) ? 0 : getRecommendationId().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeRecommendationFeedbackRequest == false) return false;
        DescribeRecommendationFeedbackRequest other = (DescribeRecommendationFeedbackRequest)obj;

        if (other.getCodeReviewArn() == null ^ this.getCodeReviewArn() == null) return false;
        if (other.getCodeReviewArn() != null && other.getCodeReviewArn().equals(this.getCodeReviewArn()) == false) return false;
        if (other.getRecommendationId() == null ^ this.getRecommendationId() == null) return false;
        if (other.getRecommendationId() != null && other.getRecommendationId().equals(this.getRecommendationId()) == false) return false;
        if (other.getUserId() == null ^ this.getUserId() == null) return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false) return false;
        return true;
    }
}
