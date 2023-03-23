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
 * Gets the results for an Amazon Textract asynchronous operation that analyzes
 * text in a lending document.
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
 * GetLendingAnalysis, and pass the job identifier (<code>JobId</code>) from the
 * initial call to <code>StartLendingAnalysis</code>.
 * </p>
 */
public class GetLendingAnalysisRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A unique identifier for the lending or text-detection job. The
     * <code>JobId</code> is returned from <code>StartLendingAnalysis</code>. A
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
     * The maximum number of results to return per paginated call. The largest
     * value that you can specify is 30. If you specify a value greater than 30,
     * a maximum of 30 results is returned. The default value is 30.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * If the previous response was incomplete, Amazon Textract returns a
     * pagination token in the response. You can use this pagination token to
     * retrieve the next set of lending results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String nextToken;

    /**
     * <p>
     * A unique identifier for the lending or text-detection job. The
     * <code>JobId</code> is returned from <code>StartLendingAnalysis</code>. A
     * <code>JobId</code> value is only valid for 7 days.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @return <p>
     *         A unique identifier for the lending or text-detection job. The
     *         <code>JobId</code> is returned from
     *         <code>StartLendingAnalysis</code>. A <code>JobId</code> value is
     *         only valid for 7 days.
     *         </p>
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * <p>
     * A unique identifier for the lending or text-detection job. The
     * <code>JobId</code> is returned from <code>StartLendingAnalysis</code>. A
     * <code>JobId</code> value is only valid for 7 days.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @param jobId <p>
     *            A unique identifier for the lending or text-detection job. The
     *            <code>JobId</code> is returned from
     *            <code>StartLendingAnalysis</code>. A <code>JobId</code> value
     *            is only valid for 7 days.
     *            </p>
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * A unique identifier for the lending or text-detection job. The
     * <code>JobId</code> is returned from <code>StartLendingAnalysis</code>. A
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
     *            <code>JobId</code> is returned from
     *            <code>StartLendingAnalysis</code>. A <code>JobId</code> value
     *            is only valid for 7 days.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetLendingAnalysisRequest withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return per paginated call. The largest
     * value that you can specify is 30. If you specify a value greater than 30,
     * a maximum of 30 results is returned. The default value is 30.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The maximum number of results to return per paginated call. The
     *         largest value that you can specify is 30. If you specify a value
     *         greater than 30, a maximum of 30 results is returned. The default
     *         value is 30.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per paginated call. The largest
     * value that you can specify is 30. If you specify a value greater than 30,
     * a maximum of 30 results is returned. The default value is 30.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return per paginated call.
     *            The largest value that you can specify is 30. If you specify a
     *            value greater than 30, a maximum of 30 results is returned.
     *            The default value is 30.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per paginated call. The largest
     * value that you can specify is 30. If you specify a value greater than 30,
     * a maximum of 30 results is returned. The default value is 30.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return per paginated call.
     *            The largest value that you can specify is 30. If you specify a
     *            value greater than 30, a maximum of 30 results is returned.
     *            The default value is 30.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetLendingAnalysisRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * If the previous response was incomplete, Amazon Textract returns a
     * pagination token in the response. You can use this pagination token to
     * retrieve the next set of lending results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         If the previous response was incomplete, Amazon Textract returns
     *         a pagination token in the response. You can use this pagination
     *         token to retrieve the next set of lending results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the previous response was incomplete, Amazon Textract returns a
     * pagination token in the response. You can use this pagination token to
     * retrieve the next set of lending results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param nextToken <p>
     *            If the previous response was incomplete, Amazon Textract
     *            returns a pagination token in the response. You can use this
     *            pagination token to retrieve the next set of lending results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous response was incomplete, Amazon Textract returns a
     * pagination token in the response. You can use this pagination token to
     * retrieve the next set of lending results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param nextToken <p>
     *            If the previous response was incomplete, Amazon Textract
     *            returns a pagination token in the response. You can use this
     *            pagination token to retrieve the next set of lending results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetLendingAnalysisRequest withNextToken(String nextToken) {
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
        if (getJobId() != null)
            sb.append("JobId: " + getJobId() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetLendingAnalysisRequest == false)
            return false;
        GetLendingAnalysisRequest other = (GetLendingAnalysisRequest) obj;

        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
