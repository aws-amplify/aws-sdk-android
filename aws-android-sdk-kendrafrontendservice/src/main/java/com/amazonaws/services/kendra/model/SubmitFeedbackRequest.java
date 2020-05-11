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

package com.amazonaws.services.kendra.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Enables you to provide feedback to Amazon Kendra to improve the performance
 * of the service.
 * </p>
 */
public class SubmitFeedbackRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier of the index that was queried.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9-]*<br/>
     */
    private String indexId;

    /**
     * <p>
     * The identifier of the specific query for which you are submitting
     * feedback. The query ID is returned in the response to the operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     */
    private String queryId;

    /**
     * <p>
     * Tells Amazon Kendra that a particular search result link was chosen by
     * the user.
     * </p>
     */
    private java.util.List<ClickFeedback> clickFeedbackItems;

    /**
     * <p>
     * Provides Amazon Kendra with relevant or not relevant feedback for whether
     * a particular item was relevant to the search.
     * </p>
     */
    private java.util.List<RelevanceFeedback> relevanceFeedbackItems;

    /**
     * <p>
     * The identifier of the index that was queried.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9-]*<br/>
     *
     * @return <p>
     *         The identifier of the index that was queried.
     *         </p>
     */
    public String getIndexId() {
        return indexId;
    }

    /**
     * <p>
     * The identifier of the index that was queried.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9-]*<br/>
     *
     * @param indexId <p>
     *            The identifier of the index that was queried.
     *            </p>
     */
    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    /**
     * <p>
     * The identifier of the index that was queried.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][a-zA-Z0-9-]*<br/>
     *
     * @param indexId <p>
     *            The identifier of the index that was queried.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SubmitFeedbackRequest withIndexId(String indexId) {
        this.indexId = indexId;
        return this;
    }

    /**
     * <p>
     * The identifier of the specific query for which you are submitting
     * feedback. The query ID is returned in the response to the operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     *
     * @return <p>
     *         The identifier of the specific query for which you are submitting
     *         feedback. The query ID is returned in the response to the
     *         operation.
     *         </p>
     */
    public String getQueryId() {
        return queryId;
    }

    /**
     * <p>
     * The identifier of the specific query for which you are submitting
     * feedback. The query ID is returned in the response to the operation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     *
     * @param queryId <p>
     *            The identifier of the specific query for which you are
     *            submitting feedback. The query ID is returned in the response
     *            to the operation.
     *            </p>
     */
    public void setQueryId(String queryId) {
        this.queryId = queryId;
    }

    /**
     * <p>
     * The identifier of the specific query for which you are submitting
     * feedback. The query ID is returned in the response to the operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     *
     * @param queryId <p>
     *            The identifier of the specific query for which you are
     *            submitting feedback. The query ID is returned in the response
     *            to the operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SubmitFeedbackRequest withQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }

    /**
     * <p>
     * Tells Amazon Kendra that a particular search result link was chosen by
     * the user.
     * </p>
     *
     * @return <p>
     *         Tells Amazon Kendra that a particular search result link was
     *         chosen by the user.
     *         </p>
     */
    public java.util.List<ClickFeedback> getClickFeedbackItems() {
        return clickFeedbackItems;
    }

    /**
     * <p>
     * Tells Amazon Kendra that a particular search result link was chosen by
     * the user.
     * </p>
     *
     * @param clickFeedbackItems <p>
     *            Tells Amazon Kendra that a particular search result link was
     *            chosen by the user.
     *            </p>
     */
    public void setClickFeedbackItems(java.util.Collection<ClickFeedback> clickFeedbackItems) {
        if (clickFeedbackItems == null) {
            this.clickFeedbackItems = null;
            return;
        }

        this.clickFeedbackItems = new java.util.ArrayList<ClickFeedback>(clickFeedbackItems);
    }

    /**
     * <p>
     * Tells Amazon Kendra that a particular search result link was chosen by
     * the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clickFeedbackItems <p>
     *            Tells Amazon Kendra that a particular search result link was
     *            chosen by the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SubmitFeedbackRequest withClickFeedbackItems(ClickFeedback... clickFeedbackItems) {
        if (getClickFeedbackItems() == null) {
            this.clickFeedbackItems = new java.util.ArrayList<ClickFeedback>(
                    clickFeedbackItems.length);
        }
        for (ClickFeedback value : clickFeedbackItems) {
            this.clickFeedbackItems.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Tells Amazon Kendra that a particular search result link was chosen by
     * the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clickFeedbackItems <p>
     *            Tells Amazon Kendra that a particular search result link was
     *            chosen by the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SubmitFeedbackRequest withClickFeedbackItems(
            java.util.Collection<ClickFeedback> clickFeedbackItems) {
        setClickFeedbackItems(clickFeedbackItems);
        return this;
    }

    /**
     * <p>
     * Provides Amazon Kendra with relevant or not relevant feedback for whether
     * a particular item was relevant to the search.
     * </p>
     *
     * @return <p>
     *         Provides Amazon Kendra with relevant or not relevant feedback for
     *         whether a particular item was relevant to the search.
     *         </p>
     */
    public java.util.List<RelevanceFeedback> getRelevanceFeedbackItems() {
        return relevanceFeedbackItems;
    }

    /**
     * <p>
     * Provides Amazon Kendra with relevant or not relevant feedback for whether
     * a particular item was relevant to the search.
     * </p>
     *
     * @param relevanceFeedbackItems <p>
     *            Provides Amazon Kendra with relevant or not relevant feedback
     *            for whether a particular item was relevant to the search.
     *            </p>
     */
    public void setRelevanceFeedbackItems(
            java.util.Collection<RelevanceFeedback> relevanceFeedbackItems) {
        if (relevanceFeedbackItems == null) {
            this.relevanceFeedbackItems = null;
            return;
        }

        this.relevanceFeedbackItems = new java.util.ArrayList<RelevanceFeedback>(
                relevanceFeedbackItems);
    }

    /**
     * <p>
     * Provides Amazon Kendra with relevant or not relevant feedback for whether
     * a particular item was relevant to the search.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param relevanceFeedbackItems <p>
     *            Provides Amazon Kendra with relevant or not relevant feedback
     *            for whether a particular item was relevant to the search.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SubmitFeedbackRequest withRelevanceFeedbackItems(
            RelevanceFeedback... relevanceFeedbackItems) {
        if (getRelevanceFeedbackItems() == null) {
            this.relevanceFeedbackItems = new java.util.ArrayList<RelevanceFeedback>(
                    relevanceFeedbackItems.length);
        }
        for (RelevanceFeedback value : relevanceFeedbackItems) {
            this.relevanceFeedbackItems.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Provides Amazon Kendra with relevant or not relevant feedback for whether
     * a particular item was relevant to the search.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param relevanceFeedbackItems <p>
     *            Provides Amazon Kendra with relevant or not relevant feedback
     *            for whether a particular item was relevant to the search.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SubmitFeedbackRequest withRelevanceFeedbackItems(
            java.util.Collection<RelevanceFeedback> relevanceFeedbackItems) {
        setRelevanceFeedbackItems(relevanceFeedbackItems);
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
        if (getIndexId() != null)
            sb.append("IndexId: " + getIndexId() + ",");
        if (getQueryId() != null)
            sb.append("QueryId: " + getQueryId() + ",");
        if (getClickFeedbackItems() != null)
            sb.append("ClickFeedbackItems: " + getClickFeedbackItems() + ",");
        if (getRelevanceFeedbackItems() != null)
            sb.append("RelevanceFeedbackItems: " + getRelevanceFeedbackItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndexId() == null) ? 0 : getIndexId().hashCode());
        hashCode = prime * hashCode + ((getQueryId() == null) ? 0 : getQueryId().hashCode());
        hashCode = prime * hashCode
                + ((getClickFeedbackItems() == null) ? 0 : getClickFeedbackItems().hashCode());
        hashCode = prime
                * hashCode
                + ((getRelevanceFeedbackItems() == null) ? 0 : getRelevanceFeedbackItems()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SubmitFeedbackRequest == false)
            return false;
        SubmitFeedbackRequest other = (SubmitFeedbackRequest) obj;

        if (other.getIndexId() == null ^ this.getIndexId() == null)
            return false;
        if (other.getIndexId() != null && other.getIndexId().equals(this.getIndexId()) == false)
            return false;
        if (other.getQueryId() == null ^ this.getQueryId() == null)
            return false;
        if (other.getQueryId() != null && other.getQueryId().equals(this.getQueryId()) == false)
            return false;
        if (other.getClickFeedbackItems() == null ^ this.getClickFeedbackItems() == null)
            return false;
        if (other.getClickFeedbackItems() != null
                && other.getClickFeedbackItems().equals(this.getClickFeedbackItems()) == false)
            return false;
        if (other.getRelevanceFeedbackItems() == null ^ this.getRelevanceFeedbackItems() == null)
            return false;
        if (other.getRelevanceFeedbackItems() != null
                && other.getRelevanceFeedbackItems().equals(this.getRelevanceFeedbackItems()) == false)
            return false;
        return true;
    }
}
