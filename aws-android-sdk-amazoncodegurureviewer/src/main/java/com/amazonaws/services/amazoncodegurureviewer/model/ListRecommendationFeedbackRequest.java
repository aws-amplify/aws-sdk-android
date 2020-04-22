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

package com.amazonaws.services.amazoncodegurureviewer.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists the customer feedback for a CodeGuru Reviewer recommendation for all
 * users. This API will be used from the console to extract the previously given
 * feedback by the user to pre-populate the feedback emojis for all
 * recommendations.
 * </p>
 */
public class ListRecommendationFeedbackRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * If nextToken is returned, there are more results available. The value of
     * nextToken is a unique pagination token for each page. Make the call again
     * using the returned token to retrieve the next page. Keep all other
     * arguments unchanged.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of results that are returned per call. The default is
     * 100.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the code review.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern:
     * </b>^arn:aws[^:\s]*:codeguru-reviewer:[^:\s]+:[\d]{12}:[a-z-]+:[\w-]+$
     * <br/>
     */
    private String codeReviewArn;

    /**
     * <p>
     * Filter on userIds that need to be applied before displaying the result.
     * This can be used to query all the recommendation feedback for a code
     * review from a given user.
     * </p>
     */
    private java.util.List<String> userIds;

    /**
     * <p>
     * Filter on recommendationIds that need to be applied before displaying the
     * result. This can be used to query all the recommendation feedback for a
     * given recommendation.
     * </p>
     */
    private java.util.List<String> recommendationIds;

    /**
     * <p>
     * If nextToken is returned, there are more results available. The value of
     * nextToken is a unique pagination token for each page. Make the call again
     * using the returned token to retrieve the next page. Keep all other
     * arguments unchanged.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         If nextToken is returned, there are more results available. The
     *         value of nextToken is a unique pagination token for each page.
     *         Make the call again using the returned token to retrieve the next
     *         page. Keep all other arguments unchanged.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If nextToken is returned, there are more results available. The value of
     * nextToken is a unique pagination token for each page. Make the call again
     * using the returned token to retrieve the next page. Keep all other
     * arguments unchanged.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param nextToken <p>
     *            If nextToken is returned, there are more results available.
     *            The value of nextToken is a unique pagination token for each
     *            page. Make the call again using the returned token to retrieve
     *            the next page. Keep all other arguments unchanged.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If nextToken is returned, there are more results available. The value of
     * nextToken is a unique pagination token for each page. Make the call again
     * using the returned token to retrieve the next page. Keep all other
     * arguments unchanged.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param nextToken <p>
     *            If nextToken is returned, there are more results available.
     *            The value of nextToken is a unique pagination token for each
     *            page. Make the call again using the returned token to retrieve
     *            the next page. Keep all other arguments unchanged.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRecommendationFeedbackRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of results that are returned per call. The default is
     * 100.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>
     *         The maximum number of results that are returned per call. The
     *         default is 100.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results that are returned per call. The default is
     * 100.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results that are returned per call. The
     *            default is 100.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results that are returned per call. The default is
     * 100.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results that are returned per call. The
     *            default is 100.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRecommendationFeedbackRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the code review.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern:
     * </b>^arn:aws[^:\s]*:codeguru-reviewer:[^:\s]+:[\d]{12}:[a-z-]+:[\w-]+$
     * <br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) that identifies the code review.
     *         </p>
     */
    public String getCodeReviewArn() {
        return codeReviewArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the code review.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern:
     * </b>^arn:aws[^:\s]*:codeguru-reviewer:[^:\s]+:[\d]{12}:[a-z-]+:[\w-]+$
     * <br/>
     *
     * @param codeReviewArn <p>
     *            The Amazon Resource Name (ARN) that identifies the code
     *            review.
     *            </p>
     */
    public void setCodeReviewArn(String codeReviewArn) {
        this.codeReviewArn = codeReviewArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the code review.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern:
     * </b>^arn:aws[^:\s]*:codeguru-reviewer:[^:\s]+:[\d]{12}:[a-z-]+:[\w-]+$
     * <br/>
     *
     * @param codeReviewArn <p>
     *            The Amazon Resource Name (ARN) that identifies the code
     *            review.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRecommendationFeedbackRequest withCodeReviewArn(String codeReviewArn) {
        this.codeReviewArn = codeReviewArn;
        return this;
    }

    /**
     * <p>
     * Filter on userIds that need to be applied before displaying the result.
     * This can be used to query all the recommendation feedback for a code
     * review from a given user.
     * </p>
     *
     * @return <p>
     *         Filter on userIds that need to be applied before displaying the
     *         result. This can be used to query all the recommendation feedback
     *         for a code review from a given user.
     *         </p>
     */
    public java.util.List<String> getUserIds() {
        return userIds;
    }

    /**
     * <p>
     * Filter on userIds that need to be applied before displaying the result.
     * This can be used to query all the recommendation feedback for a code
     * review from a given user.
     * </p>
     *
     * @param userIds <p>
     *            Filter on userIds that need to be applied before displaying
     *            the result. This can be used to query all the recommendation
     *            feedback for a code review from a given user.
     *            </p>
     */
    public void setUserIds(java.util.Collection<String> userIds) {
        if (userIds == null) {
            this.userIds = null;
            return;
        }

        this.userIds = new java.util.ArrayList<String>(userIds);
    }

    /**
     * <p>
     * Filter on userIds that need to be applied before displaying the result.
     * This can be used to query all the recommendation feedback for a code
     * review from a given user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userIds <p>
     *            Filter on userIds that need to be applied before displaying
     *            the result. This can be used to query all the recommendation
     *            feedback for a code review from a given user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRecommendationFeedbackRequest withUserIds(String... userIds) {
        if (getUserIds() == null) {
            this.userIds = new java.util.ArrayList<String>(userIds.length);
        }
        for (String value : userIds) {
            this.userIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Filter on userIds that need to be applied before displaying the result.
     * This can be used to query all the recommendation feedback for a code
     * review from a given user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userIds <p>
     *            Filter on userIds that need to be applied before displaying
     *            the result. This can be used to query all the recommendation
     *            feedback for a code review from a given user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRecommendationFeedbackRequest withUserIds(java.util.Collection<String> userIds) {
        setUserIds(userIds);
        return this;
    }

    /**
     * <p>
     * Filter on recommendationIds that need to be applied before displaying the
     * result. This can be used to query all the recommendation feedback for a
     * given recommendation.
     * </p>
     *
     * @return <p>
     *         Filter on recommendationIds that need to be applied before
     *         displaying the result. This can be used to query all the
     *         recommendation feedback for a given recommendation.
     *         </p>
     */
    public java.util.List<String> getRecommendationIds() {
        return recommendationIds;
    }

    /**
     * <p>
     * Filter on recommendationIds that need to be applied before displaying the
     * result. This can be used to query all the recommendation feedback for a
     * given recommendation.
     * </p>
     *
     * @param recommendationIds <p>
     *            Filter on recommendationIds that need to be applied before
     *            displaying the result. This can be used to query all the
     *            recommendation feedback for a given recommendation.
     *            </p>
     */
    public void setRecommendationIds(java.util.Collection<String> recommendationIds) {
        if (recommendationIds == null) {
            this.recommendationIds = null;
            return;
        }

        this.recommendationIds = new java.util.ArrayList<String>(recommendationIds);
    }

    /**
     * <p>
     * Filter on recommendationIds that need to be applied before displaying the
     * result. This can be used to query all the recommendation feedback for a
     * given recommendation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recommendationIds <p>
     *            Filter on recommendationIds that need to be applied before
     *            displaying the result. This can be used to query all the
     *            recommendation feedback for a given recommendation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRecommendationFeedbackRequest withRecommendationIds(String... recommendationIds) {
        if (getRecommendationIds() == null) {
            this.recommendationIds = new java.util.ArrayList<String>(recommendationIds.length);
        }
        for (String value : recommendationIds) {
            this.recommendationIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Filter on recommendationIds that need to be applied before displaying the
     * result. This can be used to query all the recommendation feedback for a
     * given recommendation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recommendationIds <p>
     *            Filter on recommendationIds that need to be applied before
     *            displaying the result. This can be used to query all the
     *            recommendation feedback for a given recommendation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRecommendationFeedbackRequest withRecommendationIds(
            java.util.Collection<String> recommendationIds) {
        setRecommendationIds(recommendationIds);
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
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getCodeReviewArn() != null)
            sb.append("CodeReviewArn: " + getCodeReviewArn() + ",");
        if (getUserIds() != null)
            sb.append("UserIds: " + getUserIds() + ",");
        if (getRecommendationIds() != null)
            sb.append("RecommendationIds: " + getRecommendationIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode
                + ((getCodeReviewArn() == null) ? 0 : getCodeReviewArn().hashCode());
        hashCode = prime * hashCode + ((getUserIds() == null) ? 0 : getUserIds().hashCode());
        hashCode = prime * hashCode
                + ((getRecommendationIds() == null) ? 0 : getRecommendationIds().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRecommendationFeedbackRequest == false)
            return false;
        ListRecommendationFeedbackRequest other = (ListRecommendationFeedbackRequest) obj;

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
        if (other.getCodeReviewArn() == null ^ this.getCodeReviewArn() == null)
            return false;
        if (other.getCodeReviewArn() != null
                && other.getCodeReviewArn().equals(this.getCodeReviewArn()) == false)
            return false;
        if (other.getUserIds() == null ^ this.getUserIds() == null)
            return false;
        if (other.getUserIds() != null && other.getUserIds().equals(this.getUserIds()) == false)
            return false;
        if (other.getRecommendationIds() == null ^ this.getRecommendationIds() == null)
            return false;
        if (other.getRecommendationIds() != null
                && other.getRecommendationIds().equals(this.getRecommendationIds()) == false)
            return false;
        return true;
    }
}
