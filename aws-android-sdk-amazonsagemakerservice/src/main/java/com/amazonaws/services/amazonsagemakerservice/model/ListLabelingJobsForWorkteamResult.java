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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

public class ListLabelingJobsForWorkteamResult implements Serializable {
    /**
     * <p>
     * An array of <code>LabelingJobSummary</code> objects, each describing a
     * labeling job.
     * </p>
     */
    private java.util.List<LabelingJobForWorkteamSummary> labelingJobSummaryList;

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To
     * retrieve the next set of labeling jobs, use it in the subsequent request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String nextToken;

    /**
     * <p>
     * An array of <code>LabelingJobSummary</code> objects, each describing a
     * labeling job.
     * </p>
     *
     * @return <p>
     *         An array of <code>LabelingJobSummary</code> objects, each
     *         describing a labeling job.
     *         </p>
     */
    public java.util.List<LabelingJobForWorkteamSummary> getLabelingJobSummaryList() {
        return labelingJobSummaryList;
    }

    /**
     * <p>
     * An array of <code>LabelingJobSummary</code> objects, each describing a
     * labeling job.
     * </p>
     *
     * @param labelingJobSummaryList <p>
     *            An array of <code>LabelingJobSummary</code> objects, each
     *            describing a labeling job.
     *            </p>
     */
    public void setLabelingJobSummaryList(
            java.util.Collection<LabelingJobForWorkteamSummary> labelingJobSummaryList) {
        if (labelingJobSummaryList == null) {
            this.labelingJobSummaryList = null;
            return;
        }

        this.labelingJobSummaryList = new java.util.ArrayList<LabelingJobForWorkteamSummary>(
                labelingJobSummaryList);
    }

    /**
     * <p>
     * An array of <code>LabelingJobSummary</code> objects, each describing a
     * labeling job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param labelingJobSummaryList <p>
     *            An array of <code>LabelingJobSummary</code> objects, each
     *            describing a labeling job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListLabelingJobsForWorkteamResult withLabelingJobSummaryList(
            LabelingJobForWorkteamSummary... labelingJobSummaryList) {
        if (getLabelingJobSummaryList() == null) {
            this.labelingJobSummaryList = new java.util.ArrayList<LabelingJobForWorkteamSummary>(
                    labelingJobSummaryList.length);
        }
        for (LabelingJobForWorkteamSummary value : labelingJobSummaryList) {
            this.labelingJobSummaryList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>LabelingJobSummary</code> objects, each describing a
     * labeling job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param labelingJobSummaryList <p>
     *            An array of <code>LabelingJobSummary</code> objects, each
     *            describing a labeling job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListLabelingJobsForWorkteamResult withLabelingJobSummaryList(
            java.util.Collection<LabelingJobForWorkteamSummary> labelingJobSummaryList) {
        setLabelingJobSummaryList(labelingJobSummaryList);
        return this;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To
     * retrieve the next set of labeling jobs, use it in the subsequent request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         If the response is truncated, Amazon SageMaker returns this
     *         token. To retrieve the next set of labeling jobs, use it in the
     *         subsequent request.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To
     * retrieve the next set of labeling jobs, use it in the subsequent request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param nextToken <p>
     *            If the response is truncated, Amazon SageMaker returns this
     *            token. To retrieve the next set of labeling jobs, use it in
     *            the subsequent request.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To
     * retrieve the next set of labeling jobs, use it in the subsequent request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param nextToken <p>
     *            If the response is truncated, Amazon SageMaker returns this
     *            token. To retrieve the next set of labeling jobs, use it in
     *            the subsequent request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListLabelingJobsForWorkteamResult withNextToken(String nextToken) {
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
        if (getLabelingJobSummaryList() != null)
            sb.append("LabelingJobSummaryList: " + getLabelingJobSummaryList() + ",");
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
                + ((getLabelingJobSummaryList() == null) ? 0 : getLabelingJobSummaryList()
                        .hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListLabelingJobsForWorkteamResult == false)
            return false;
        ListLabelingJobsForWorkteamResult other = (ListLabelingJobsForWorkteamResult) obj;

        if (other.getLabelingJobSummaryList() == null ^ this.getLabelingJobSummaryList() == null)
            return false;
        if (other.getLabelingJobSummaryList() != null
                && other.getLabelingJobSummaryList().equals(this.getLabelingJobSummaryList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
