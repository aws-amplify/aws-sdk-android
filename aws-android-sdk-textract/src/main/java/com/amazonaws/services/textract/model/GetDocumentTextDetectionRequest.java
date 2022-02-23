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

package com.amazonaws.services.textract.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets the results for an Amazon Textract asynchronous operation that detects
 * text in a document. Amazon Textract can detect lines of text and the words
 * that make up a line of text.
 * </p>
 * <p>
 * You start asynchronous text detection by calling
 * <a>StartDocumentTextDetection</a>, which returns a job identifier (
 * <code>JobId</code>). When the text detection operation finishes, Amazon
 * Textract publishes a completion status to the Amazon Simple Notification
 * Service (Amazon SNS) topic that's registered in the initial call to
 * <code>StartDocumentTextDetection</code>. To get the results of the
 * text-detection operation, first check that the status value published to the
 * Amazon SNS topic is <code>SUCCEEDED</code>. If so, call
 * <code>GetDocumentTextDetection</code>, and pass the job identifier (
 * <code>JobId</code>) from the initial call to
 * <code>StartDocumentTextDetection</code>.
 * </p>
 * <p>
 * <code>GetDocumentTextDetection</code> returns an array of <a>Block</a>
 * objects.
 * </p>
 * <p>
 * Each document page has as an associated <code>Block</code> of type PAGE. Each
 * PAGE <code>Block</code> object is the parent of LINE <code>Block</code>
 * objects that represent the lines of detected text on a page. A LINE
 * <code>Block</code> object is a parent for each word that makes up the line.
 * Words are represented by <code>Block</code> objects of type WORD.
 * </p>
 * <p>
 * Use the MaxResults parameter to limit the number of blocks that are returned.
 * If there are more results than specified in <code>MaxResults</code>, the
 * value of <code>NextToken</code> in the operation response contains a
 * pagination token for getting the next set of results. To get the next page of
 * results, call <code>GetDocumentTextDetection</code>, and populate the
 * <code>NextToken</code> request parameter with the token value that's returned
 * from the previous call to <code>GetDocumentTextDetection</code>.
 * </p>
 * <p>
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/textract/latest/dg/how-it-works-detecting.html"
 * >Document Text Detection</a>.
 * </p>
 */
public class GetDocumentTextDetectionRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * A unique identifier for the text detection job. The <code>JobId</code> is
     * returned from <code>StartDocumentTextDetection</code>. A
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
     * value you can specify is 1,000. If you specify a value greater than
     * 1,000, a maximum of 1,000 results is returned. The default value is
     * 1,000.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * If the previous response was incomplete (because there are more blocks to
     * retrieve), Amazon Textract returns a pagination token in the response.
     * You can use this pagination token to retrieve the next set of blocks.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String nextToken;

    /**
     * <p>
     * A unique identifier for the text detection job. The <code>JobId</code> is
     * returned from <code>StartDocumentTextDetection</code>. A
     * <code>JobId</code> value is only valid for 7 days.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @return <p>
     *         A unique identifier for the text detection job. The
     *         <code>JobId</code> is returned from
     *         <code>StartDocumentTextDetection</code>. A <code>JobId</code>
     *         value is only valid for 7 days.
     *         </p>
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * <p>
     * A unique identifier for the text detection job. The <code>JobId</code> is
     * returned from <code>StartDocumentTextDetection</code>. A
     * <code>JobId</code> value is only valid for 7 days.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @param jobId <p>
     *            A unique identifier for the text detection job. The
     *            <code>JobId</code> is returned from
     *            <code>StartDocumentTextDetection</code>. A <code>JobId</code>
     *            value is only valid for 7 days.
     *            </p>
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * A unique identifier for the text detection job. The <code>JobId</code> is
     * returned from <code>StartDocumentTextDetection</code>. A
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
     *            A unique identifier for the text detection job. The
     *            <code>JobId</code> is returned from
     *            <code>StartDocumentTextDetection</code>. A <code>JobId</code>
     *            value is only valid for 7 days.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDocumentTextDetectionRequest withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return per paginated call. The largest
     * value you can specify is 1,000. If you specify a value greater than
     * 1,000, a maximum of 1,000 results is returned. The default value is
     * 1,000.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The maximum number of results to return per paginated call. The
     *         largest value you can specify is 1,000. If you specify a value
     *         greater than 1,000, a maximum of 1,000 results is returned. The
     *         default value is 1,000.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per paginated call. The largest
     * value you can specify is 1,000. If you specify a value greater than
     * 1,000, a maximum of 1,000 results is returned. The default value is
     * 1,000.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return per paginated call.
     *            The largest value you can specify is 1,000. If you specify a
     *            value greater than 1,000, a maximum of 1,000 results is
     *            returned. The default value is 1,000.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per paginated call. The largest
     * value you can specify is 1,000. If you specify a value greater than
     * 1,000, a maximum of 1,000 results is returned. The default value is
     * 1,000.
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
     *            The largest value you can specify is 1,000. If you specify a
     *            value greater than 1,000, a maximum of 1,000 results is
     *            returned. The default value is 1,000.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDocumentTextDetectionRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there are more blocks to
     * retrieve), Amazon Textract returns a pagination token in the response.
     * You can use this pagination token to retrieve the next set of blocks.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         If the previous response was incomplete (because there are more
     *         blocks to retrieve), Amazon Textract returns a pagination token
     *         in the response. You can use this pagination token to retrieve
     *         the next set of blocks.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there are more blocks to
     * retrieve), Amazon Textract returns a pagination token in the response.
     * You can use this pagination token to retrieve the next set of blocks.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param nextToken <p>
     *            If the previous response was incomplete (because there are
     *            more blocks to retrieve), Amazon Textract returns a pagination
     *            token in the response. You can use this pagination token to
     *            retrieve the next set of blocks.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there are more blocks to
     * retrieve), Amazon Textract returns a pagination token in the response.
     * You can use this pagination token to retrieve the next set of blocks.
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
     *            If the previous response was incomplete (because there are
     *            more blocks to retrieve), Amazon Textract returns a pagination
     *            token in the response. You can use this pagination token to
     *            retrieve the next set of blocks.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDocumentTextDetectionRequest withNextToken(String nextToken) {
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

        if (obj instanceof GetDocumentTextDetectionRequest == false)
            return false;
        GetDocumentTextDetectionRequest other = (GetDocumentTextDetectionRequest) obj;

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
