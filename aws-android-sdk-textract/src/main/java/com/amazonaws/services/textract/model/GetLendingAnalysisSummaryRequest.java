/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.textract.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets summarized results for the <code>StartLendingAnalysis</code> operation,
 * which analyzes text in a lending document. The returned summary consists of
 * information about documents grouped together by a common document type.
 * Information like detected signatures, page numbers, and split documents is
 * returned with respect to the type of grouped document.
 * </p>
 * <p>
 * You start asynchronous text analysis by calling
 * <code>StartLendingAnalysis</code>, which returns a job identifier (
 * <code>JobId</code>). When the text analysis operation finishes, Amazon
 * Textract publishes a completion status to the Amazon Simple Notification
 * Service (Amazon SNS) topic that's registered in the initial call to
 * <code>StartLendingAnalysis</code>.
 * </p>
 * <p>
 * To get the results of the text analysis operation, first check that the
 * status value published to the Amazon SNS topic is SUCCEEDED. If so, call
 * <code>GetLendingAnalysisSummary</code>, and pass the job identifier (
 * <code>JobId</code>) from the initial call to
 * <code>StartLendingAnalysis</code>.
 * </p>
 */
public class GetLendingAnalysisSummaryRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * A unique identifier for the lending or text-detection job. The
     * <code>JobId</code> is returned from StartLendingAnalysis. A
     * <code>JobId</code> value is only valid for 7 days.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     */
    private String jobId;

    /**
     * <p>
     * A unique identifier for the lending or text-detection job. The
     * <code>JobId</code> is returned from StartLendingAnalysis. A
     * <code>JobId</code> value is only valid for 7 days.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @return <p>
     *         A unique identifier for the lending or text-detection job. The
     *         <code>JobId</code> is returned from StartLendingAnalysis. A
     *         <code>JobId</code> value is only valid for 7 days.
     *         </p>
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * <p>
     * A unique identifier for the lending or text-detection job. The
     * <code>JobId</code> is returned from StartLendingAnalysis. A
     * <code>JobId</code> value is only valid for 7 days.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @param jobId <p>
     *            A unique identifier for the lending or text-detection job. The
     *            <code>JobId</code> is returned from StartLendingAnalysis. A
     *            <code>JobId</code> value is only valid for 7 days.
     *            </p>
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * A unique identifier for the lending or text-detection job. The
     * <code>JobId</code> is returned from StartLendingAnalysis. A
     * <code>JobId</code> value is only valid for 7 days.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @param jobId <p>
     *            A unique identifier for the lending or text-detection job. The
     *            <code>JobId</code> is returned from StartLendingAnalysis. A
     *            <code>JobId</code> value is only valid for 7 days.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetLendingAnalysisSummaryRequest withJobId(String jobId) {
        this.jobId = jobId;
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
        if (getJobId() != null)
            sb.append("JobId: " + getJobId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetLendingAnalysisSummaryRequest == false)
            return false;
        GetLendingAnalysisSummaryRequest other = (GetLendingAnalysisSummaryRequest) obj;

        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        return true;
    }
}
