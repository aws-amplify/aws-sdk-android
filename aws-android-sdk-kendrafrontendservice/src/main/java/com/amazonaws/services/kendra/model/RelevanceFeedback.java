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

/**
 * <p>
 * Provides feedback on how relevant a document is to a search. Your application
 * uses the <a>SubmitFeedback</a> operation to provide relevance information.
 * </p>
 */
public class RelevanceFeedback implements Serializable {
    /**
     * <p>
     * The unique identifier of the search result that the user provided
     * relevance feedback for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 73<br/>
     */
    private String resultId;

    /**
     * <p>
     * Whether to document was relevant or not relevant to the search.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RELEVANT, NOT_RELEVANT
     */
    private String relevanceValue;

    /**
     * <p>
     * The unique identifier of the search result that the user provided
     * relevance feedback for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 73<br/>
     *
     * @return <p>
     *         The unique identifier of the search result that the user provided
     *         relevance feedback for.
     *         </p>
     */
    public String getResultId() {
        return resultId;
    }

    /**
     * <p>
     * The unique identifier of the search result that the user provided
     * relevance feedback for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 73<br/>
     *
     * @param resultId <p>
     *            The unique identifier of the search result that the user
     *            provided relevance feedback for.
     *            </p>
     */
    public void setResultId(String resultId) {
        this.resultId = resultId;
    }

    /**
     * <p>
     * The unique identifier of the search result that the user provided
     * relevance feedback for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 73<br/>
     *
     * @param resultId <p>
     *            The unique identifier of the search result that the user
     *            provided relevance feedback for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RelevanceFeedback withResultId(String resultId) {
        this.resultId = resultId;
        return this;
    }

    /**
     * <p>
     * Whether to document was relevant or not relevant to the search.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RELEVANT, NOT_RELEVANT
     *
     * @return <p>
     *         Whether to document was relevant or not relevant to the search.
     *         </p>
     * @see RelevanceType
     */
    public String getRelevanceValue() {
        return relevanceValue;
    }

    /**
     * <p>
     * Whether to document was relevant or not relevant to the search.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RELEVANT, NOT_RELEVANT
     *
     * @param relevanceValue <p>
     *            Whether to document was relevant or not relevant to the
     *            search.
     *            </p>
     * @see RelevanceType
     */
    public void setRelevanceValue(String relevanceValue) {
        this.relevanceValue = relevanceValue;
    }

    /**
     * <p>
     * Whether to document was relevant or not relevant to the search.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RELEVANT, NOT_RELEVANT
     *
     * @param relevanceValue <p>
     *            Whether to document was relevant or not relevant to the
     *            search.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RelevanceType
     */
    public RelevanceFeedback withRelevanceValue(String relevanceValue) {
        this.relevanceValue = relevanceValue;
        return this;
    }

    /**
     * <p>
     * Whether to document was relevant or not relevant to the search.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RELEVANT, NOT_RELEVANT
     *
     * @param relevanceValue <p>
     *            Whether to document was relevant or not relevant to the
     *            search.
     *            </p>
     * @see RelevanceType
     */
    public void setRelevanceValue(RelevanceType relevanceValue) {
        this.relevanceValue = relevanceValue.toString();
    }

    /**
     * <p>
     * Whether to document was relevant or not relevant to the search.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RELEVANT, NOT_RELEVANT
     *
     * @param relevanceValue <p>
     *            Whether to document was relevant or not relevant to the
     *            search.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RelevanceType
     */
    public RelevanceFeedback withRelevanceValue(RelevanceType relevanceValue) {
        this.relevanceValue = relevanceValue.toString();
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
        if (getResultId() != null)
            sb.append("ResultId: " + getResultId() + ",");
        if (getRelevanceValue() != null)
            sb.append("RelevanceValue: " + getRelevanceValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResultId() == null) ? 0 : getResultId().hashCode());
        hashCode = prime * hashCode
                + ((getRelevanceValue() == null) ? 0 : getRelevanceValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RelevanceFeedback == false)
            return false;
        RelevanceFeedback other = (RelevanceFeedback) obj;

        if (other.getResultId() == null ^ this.getResultId() == null)
            return false;
        if (other.getResultId() != null && other.getResultId().equals(this.getResultId()) == false)
            return false;
        if (other.getRelevanceValue() == null ^ this.getRelevanceValue() == null)
            return false;
        if (other.getRelevanceValue() != null
                && other.getRelevanceValue().equals(this.getRelevanceValue()) == false)
            return false;
        return true;
    }
}
