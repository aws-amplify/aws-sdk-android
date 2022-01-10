/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.transcribe.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Provides more information about the custom language models you've created.
 * You can use the information in this list to find a specific custom language
 * model. You can then use the operation to get more information about it.
 * </p>
 */
public class ListLanguageModelsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * When specified, returns only custom language models with the specified
     * status. Language models are ordered by creation date, with the newest
     * models first. If you don't specify a status, Amazon Transcribe returns
     * all custom language models ordered by date.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, FAILED, COMPLETED
     */
    private String statusEquals;

    /**
     * <p>
     * When specified, the custom language model names returned contain the
     * substring you've specified.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     */
    private String nameContains;

    /**
     * <p>
     * When included, fetches the next set of jobs if the result of the previous
     * request was truncated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.+<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of language models to return in each page of results.
     * If there are fewer results than the value you specify, only the actual
     * results are returned. If you do not specify a value, the default of 5 is
     * used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * When specified, returns only custom language models with the specified
     * status. Language models are ordered by creation date, with the newest
     * models first. If you don't specify a status, Amazon Transcribe returns
     * all custom language models ordered by date.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, FAILED, COMPLETED
     *
     * @return <p>
     *         When specified, returns only custom language models with the
     *         specified status. Language models are ordered by creation date,
     *         with the newest models first. If you don't specify a status,
     *         Amazon Transcribe returns all custom language models ordered by
     *         date.
     *         </p>
     * @see ModelStatus
     */
    public String getStatusEquals() {
        return statusEquals;
    }

    /**
     * <p>
     * When specified, returns only custom language models with the specified
     * status. Language models are ordered by creation date, with the newest
     * models first. If you don't specify a status, Amazon Transcribe returns
     * all custom language models ordered by date.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, FAILED, COMPLETED
     *
     * @param statusEquals <p>
     *            When specified, returns only custom language models with the
     *            specified status. Language models are ordered by creation
     *            date, with the newest models first. If you don't specify a
     *            status, Amazon Transcribe returns all custom language models
     *            ordered by date.
     *            </p>
     * @see ModelStatus
     */
    public void setStatusEquals(String statusEquals) {
        this.statusEquals = statusEquals;
    }

    /**
     * <p>
     * When specified, returns only custom language models with the specified
     * status. Language models are ordered by creation date, with the newest
     * models first. If you don't specify a status, Amazon Transcribe returns
     * all custom language models ordered by date.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, FAILED, COMPLETED
     *
     * @param statusEquals <p>
     *            When specified, returns only custom language models with the
     *            specified status. Language models are ordered by creation
     *            date, with the newest models first. If you don't specify a
     *            status, Amazon Transcribe returns all custom language models
     *            ordered by date.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ModelStatus
     */
    public ListLanguageModelsRequest withStatusEquals(String statusEquals) {
        this.statusEquals = statusEquals;
        return this;
    }

    /**
     * <p>
     * When specified, returns only custom language models with the specified
     * status. Language models are ordered by creation date, with the newest
     * models first. If you don't specify a status, Amazon Transcribe returns
     * all custom language models ordered by date.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, FAILED, COMPLETED
     *
     * @param statusEquals <p>
     *            When specified, returns only custom language models with the
     *            specified status. Language models are ordered by creation
     *            date, with the newest models first. If you don't specify a
     *            status, Amazon Transcribe returns all custom language models
     *            ordered by date.
     *            </p>
     * @see ModelStatus
     */
    public void setStatusEquals(ModelStatus statusEquals) {
        this.statusEquals = statusEquals.toString();
    }

    /**
     * <p>
     * When specified, returns only custom language models with the specified
     * status. Language models are ordered by creation date, with the newest
     * models first. If you don't specify a status, Amazon Transcribe returns
     * all custom language models ordered by date.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, FAILED, COMPLETED
     *
     * @param statusEquals <p>
     *            When specified, returns only custom language models with the
     *            specified status. Language models are ordered by creation
     *            date, with the newest models first. If you don't specify a
     *            status, Amazon Transcribe returns all custom language models
     *            ordered by date.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ModelStatus
     */
    public ListLanguageModelsRequest withStatusEquals(ModelStatus statusEquals) {
        this.statusEquals = statusEquals.toString();
        return this;
    }

    /**
     * <p>
     * When specified, the custom language model names returned contain the
     * substring you've specified.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @return <p>
     *         When specified, the custom language model names returned contain
     *         the substring you've specified.
     *         </p>
     */
    public String getNameContains() {
        return nameContains;
    }

    /**
     * <p>
     * When specified, the custom language model names returned contain the
     * substring you've specified.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param nameContains <p>
     *            When specified, the custom language model names returned
     *            contain the substring you've specified.
     *            </p>
     */
    public void setNameContains(String nameContains) {
        this.nameContains = nameContains;
    }

    /**
     * <p>
     * When specified, the custom language model names returned contain the
     * substring you've specified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param nameContains <p>
     *            When specified, the custom language model names returned
     *            contain the substring you've specified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListLanguageModelsRequest withNameContains(String nameContains) {
        this.nameContains = nameContains;
        return this;
    }

    /**
     * <p>
     * When included, fetches the next set of jobs if the result of the previous
     * request was truncated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @return <p>
     *         When included, fetches the next set of jobs if the result of the
     *         previous request was truncated.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * When included, fetches the next set of jobs if the result of the previous
     * request was truncated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @param nextToken <p>
     *            When included, fetches the next set of jobs if the result of
     *            the previous request was truncated.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When included, fetches the next set of jobs if the result of the previous
     * request was truncated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @param nextToken <p>
     *            When included, fetches the next set of jobs if the result of
     *            the previous request was truncated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListLanguageModelsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of language models to return in each page of results.
     * If there are fewer results than the value you specify, only the actual
     * results are returned. If you do not specify a value, the default of 5 is
     * used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>
     *         The maximum number of language models to return in each page of
     *         results. If there are fewer results than the value you specify,
     *         only the actual results are returned. If you do not specify a
     *         value, the default of 5 is used.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of language models to return in each page of results.
     * If there are fewer results than the value you specify, only the actual
     * results are returned. If you do not specify a value, the default of 5 is
     * used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of language models to return in each page
     *            of results. If there are fewer results than the value you
     *            specify, only the actual results are returned. If you do not
     *            specify a value, the default of 5 is used.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of language models to return in each page of results.
     * If there are fewer results than the value you specify, only the actual
     * results are returned. If you do not specify a value, the default of 5 is
     * used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of language models to return in each page
     *            of results. If there are fewer results than the value you
     *            specify, only the actual results are returned. If you do not
     *            specify a value, the default of 5 is used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListLanguageModelsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
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
        if (getStatusEquals() != null)
            sb.append("StatusEquals: " + getStatusEquals() + ",");
        if (getNameContains() != null)
            sb.append("NameContains: " + getNameContains() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getStatusEquals() == null) ? 0 : getStatusEquals().hashCode());
        hashCode = prime * hashCode
                + ((getNameContains() == null) ? 0 : getNameContains().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListLanguageModelsRequest == false)
            return false;
        ListLanguageModelsRequest other = (ListLanguageModelsRequest) obj;

        if (other.getStatusEquals() == null ^ this.getStatusEquals() == null)
            return false;
        if (other.getStatusEquals() != null
                && other.getStatusEquals().equals(this.getStatusEquals()) == false)
            return false;
        if (other.getNameContains() == null ^ this.getNameContains() == null)
            return false;
        if (other.getNameContains() != null
                && other.getNameContains().equals(this.getNameContains()) == false)
            return false;
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
        return true;
    }
}
