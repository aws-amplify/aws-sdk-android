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

package com.amazonaws.services.awsmigrationhub.model;

import java.io.Serializable;

public class ListProgressUpdateStreamsResult implements Serializable {
    /**
     * <p>
     * List of progress update streams up to the max number of results passed in
     * the input.
     * </p>
     */
    private java.util.List<ProgressUpdateStreamSummary> progressUpdateStreamSummaryList;

    /**
     * <p>
     * If there are more streams created than the max result, return the next
     * token to be passed to the next call as a bookmark of where to start from.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\/\+\=]{0,2048}$<br/>
     */
    private String nextToken;

    /**
     * <p>
     * List of progress update streams up to the max number of results passed in
     * the input.
     * </p>
     *
     * @return <p>
     *         List of progress update streams up to the max number of results
     *         passed in the input.
     *         </p>
     */
    public java.util.List<ProgressUpdateStreamSummary> getProgressUpdateStreamSummaryList() {
        return progressUpdateStreamSummaryList;
    }

    /**
     * <p>
     * List of progress update streams up to the max number of results passed in
     * the input.
     * </p>
     *
     * @param progressUpdateStreamSummaryList <p>
     *            List of progress update streams up to the max number of
     *            results passed in the input.
     *            </p>
     */
    public void setProgressUpdateStreamSummaryList(
            java.util.Collection<ProgressUpdateStreamSummary> progressUpdateStreamSummaryList) {
        if (progressUpdateStreamSummaryList == null) {
            this.progressUpdateStreamSummaryList = null;
            return;
        }

        this.progressUpdateStreamSummaryList = new java.util.ArrayList<ProgressUpdateStreamSummary>(
                progressUpdateStreamSummaryList);
    }

    /**
     * <p>
     * List of progress update streams up to the max number of results passed in
     * the input.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param progressUpdateStreamSummaryList <p>
     *            List of progress update streams up to the max number of
     *            results passed in the input.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListProgressUpdateStreamsResult withProgressUpdateStreamSummaryList(
            ProgressUpdateStreamSummary... progressUpdateStreamSummaryList) {
        if (getProgressUpdateStreamSummaryList() == null) {
            this.progressUpdateStreamSummaryList = new java.util.ArrayList<ProgressUpdateStreamSummary>(
                    progressUpdateStreamSummaryList.length);
        }
        for (ProgressUpdateStreamSummary value : progressUpdateStreamSummaryList) {
            this.progressUpdateStreamSummaryList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of progress update streams up to the max number of results passed in
     * the input.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param progressUpdateStreamSummaryList <p>
     *            List of progress update streams up to the max number of
     *            results passed in the input.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListProgressUpdateStreamsResult withProgressUpdateStreamSummaryList(
            java.util.Collection<ProgressUpdateStreamSummary> progressUpdateStreamSummaryList) {
        setProgressUpdateStreamSummaryList(progressUpdateStreamSummaryList);
        return this;
    }

    /**
     * <p>
     * If there are more streams created than the max result, return the next
     * token to be passed to the next call as a bookmark of where to start from.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\/\+\=]{0,2048}$<br/>
     *
     * @return <p>
     *         If there are more streams created than the max result, return the
     *         next token to be passed to the next call as a bookmark of where
     *         to start from.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If there are more streams created than the max result, return the next
     * token to be passed to the next call as a bookmark of where to start from.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\/\+\=]{0,2048}$<br/>
     *
     * @param nextToken <p>
     *            If there are more streams created than the max result, return
     *            the next token to be passed to the next call as a bookmark of
     *            where to start from.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are more streams created than the max result, return the next
     * token to be passed to the next call as a bookmark of where to start from.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\/\+\=]{0,2048}$<br/>
     *
     * @param nextToken <p>
     *            If there are more streams created than the max result, return
     *            the next token to be passed to the next call as a bookmark of
     *            where to start from.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListProgressUpdateStreamsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getProgressUpdateStreamSummaryList() != null)
            sb.append("ProgressUpdateStreamSummaryList: " + getProgressUpdateStreamSummaryList()
                    + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getProgressUpdateStreamSummaryList() == null) ? 0
                        : getProgressUpdateStreamSummaryList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListProgressUpdateStreamsResult == false)
            return false;
        ListProgressUpdateStreamsResult other = (ListProgressUpdateStreamsResult) obj;

        if (other.getProgressUpdateStreamSummaryList() == null
                ^ this.getProgressUpdateStreamSummaryList() == null)
            return false;
        if (other.getProgressUpdateStreamSummaryList() != null
                && other.getProgressUpdateStreamSummaryList().equals(
                        this.getProgressUpdateStreamSummaryList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
