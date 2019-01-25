/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets the celebrity recognition results for a Amazon Rekognition Video
 * analysis started by .
 * </p>
 * <p>
 * Celebrity recognition in a video is an asynchronous operation. Analysis is
 * started by a call to which returns a job identifier (<code>JobId</code>).
 * When the celebrity recognition operation finishes, Amazon Rekognition Video
 * publishes a completion status to the Amazon Simple Notification Service topic
 * registered in the initial call to <code>StartCelebrityRecognition</code>. To
 * get the results of the celebrity recognition analysis, first check that the
 * status value published to the Amazon SNS topic is <code>SUCCEEDED</code>. If
 * so, call <code>GetCelebrityDetection</code> and pass the job identifier (
 * <code>JobId</code>) from the initial call to
 * <code>StartCelebrityDetection</code>.
 * </p>
 * <p>
 * For more information, see Working With Stored Videos in the Amazon
 * Rekognition Developer Guide.
 * </p>
 * <p>
 * <code>GetCelebrityRecognition</code> returns detected celebrities and the
 * time(s) they are detected in an array (<code>Celebrities</code>) of objects.
 * Each <code>CelebrityRecognition</code> contains information about the
 * celebrity in a object and the time, <code>Timestamp</code>, the celebrity was
 * detected.
 * </p>
 * <note>
 * <p>
 * <code>GetCelebrityRecognition</code> only returns the default facial
 * attributes (<code>BoundingBox</code>, <code>Confidence</code>,
 * <code>Landmarks</code>, <code>Pose</code>, and <code>Quality</code>). The
 * other facial attributes listed in the <code>Face</code> object of the
 * following response syntax are not returned. For more information, see
 * FaceDetail in the Amazon Rekognition Developer Guide.
 * </p>
 * </note>
 * <p>
 * By default, the <code>Celebrities</code> array is sorted by time
 * (milliseconds from the start of the video). You can also sort the array by
 * celebrity by specifying the value <code>ID</code> in the <code>SortBy</code>
 * input parameter.
 * </p>
 * <p>
 * The <code>CelebrityDetail</code> object includes the celebrity identifer and
 * additional information urls. If you don't store the additional information
 * urls, you can get them later by calling with the celebrity identifer.
 * </p>
 * <p>
 * No information is returned for faces not recognized as celebrities.
 * </p>
 * <p>
 * Use MaxResults parameter to limit the number of labels returned. If there are
 * more results than specified in <code>MaxResults</code>, the value of
 * <code>NextToken</code> in the operation response contains a pagination token
 * for getting the next set of results. To get the next page of results, call
 * <code>GetCelebrityDetection</code> and populate the <code>NextToken</code>
 * request parameter with the token value returned from the previous call to
 * <code>GetCelebrityRecognition</code>.
 * </p>
 */
public class GetCelebrityRecognitionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Job identifier for the required celebrity recognition analysis. You can
     * get the job identifer from a call to
     * <code>StartCelebrityRecognition</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     */
    private String jobId;

    /**
     * <p>
     * Maximum number of results to return per paginated call. The largest value
     * you can specify is 1000. If you specify a value greater than 1000, a
     * maximum of 1000 results is returned. The default value is 1000.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * If the previous response was incomplete (because there is more recognized
     * celebrities to retrieve), Amazon Rekognition Video returns a pagination
     * token in the response. You can use this pagination token to retrieve the
     * next set of celebrities.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String nextToken;

    /**
     * <p>
     * Sort to use for celebrities returned in <code>Celebrities</code> field.
     * Specify <code>ID</code> to sort by the celebrity identifier, specify
     * <code>TIMESTAMP</code> to sort by the time the celebrity was recognized.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ID, TIMESTAMP
     */
    private String sortBy;

    /**
     * <p>
     * Job identifier for the required celebrity recognition analysis. You can
     * get the job identifer from a call to
     * <code>StartCelebrityRecognition</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @return <p>
     *         Job identifier for the required celebrity recognition analysis.
     *         You can get the job identifer from a call to
     *         <code>StartCelebrityRecognition</code>.
     *         </p>
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * <p>
     * Job identifier for the required celebrity recognition analysis. You can
     * get the job identifer from a call to
     * <code>StartCelebrityRecognition</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @param jobId <p>
     *            Job identifier for the required celebrity recognition
     *            analysis. You can get the job identifer from a call to
     *            <code>StartCelebrityRecognition</code>.
     *            </p>
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * Job identifier for the required celebrity recognition analysis. You can
     * get the job identifer from a call to
     * <code>StartCelebrityRecognition</code>.
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
     *            Job identifier for the required celebrity recognition
     *            analysis. You can get the job identifer from a call to
     *            <code>StartCelebrityRecognition</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCelebrityRecognitionRequest withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * <p>
     * Maximum number of results to return per paginated call. The largest value
     * you can specify is 1000. If you specify a value greater than 1000, a
     * maximum of 1000 results is returned. The default value is 1000.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         Maximum number of results to return per paginated call. The
     *         largest value you can specify is 1000. If you specify a value
     *         greater than 1000, a maximum of 1000 results is returned. The
     *         default value is 1000.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * Maximum number of results to return per paginated call. The largest value
     * you can specify is 1000. If you specify a value greater than 1000, a
     * maximum of 1000 results is returned. The default value is 1000.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param maxResults <p>
     *            Maximum number of results to return per paginated call. The
     *            largest value you can specify is 1000. If you specify a value
     *            greater than 1000, a maximum of 1000 results is returned. The
     *            default value is 1000.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Maximum number of results to return per paginated call. The largest value
     * you can specify is 1000. If you specify a value greater than 1000, a
     * maximum of 1000 results is returned. The default value is 1000.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param maxResults <p>
     *            Maximum number of results to return per paginated call. The
     *            largest value you can specify is 1000. If you specify a value
     *            greater than 1000, a maximum of 1000 results is returned. The
     *            default value is 1000.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCelebrityRecognitionRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there is more recognized
     * celebrities to retrieve), Amazon Rekognition Video returns a pagination
     * token in the response. You can use this pagination token to retrieve the
     * next set of celebrities.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         If the previous response was incomplete (because there is more
     *         recognized celebrities to retrieve), Amazon Rekognition Video
     *         returns a pagination token in the response. You can use this
     *         pagination token to retrieve the next set of celebrities.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there is more recognized
     * celebrities to retrieve), Amazon Rekognition Video returns a pagination
     * token in the response. You can use this pagination token to retrieve the
     * next set of celebrities.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param nextToken <p>
     *            If the previous response was incomplete (because there is more
     *            recognized celebrities to retrieve), Amazon Rekognition Video
     *            returns a pagination token in the response. You can use this
     *            pagination token to retrieve the next set of celebrities.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there is more recognized
     * celebrities to retrieve), Amazon Rekognition Video returns a pagination
     * token in the response. You can use this pagination token to retrieve the
     * next set of celebrities.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param nextToken <p>
     *            If the previous response was incomplete (because there is more
     *            recognized celebrities to retrieve), Amazon Rekognition Video
     *            returns a pagination token in the response. You can use this
     *            pagination token to retrieve the next set of celebrities.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCelebrityRecognitionRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * Sort to use for celebrities returned in <code>Celebrities</code> field.
     * Specify <code>ID</code> to sort by the celebrity identifier, specify
     * <code>TIMESTAMP</code> to sort by the time the celebrity was recognized.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ID, TIMESTAMP
     *
     * @return <p>
     *         Sort to use for celebrities returned in <code>Celebrities</code>
     *         field. Specify <code>ID</code> to sort by the celebrity
     *         identifier, specify <code>TIMESTAMP</code> to sort by the time
     *         the celebrity was recognized.
     *         </p>
     * @see CelebrityRecognitionSortBy
     */
    public String getSortBy() {
        return sortBy;
    }

    /**
     * <p>
     * Sort to use for celebrities returned in <code>Celebrities</code> field.
     * Specify <code>ID</code> to sort by the celebrity identifier, specify
     * <code>TIMESTAMP</code> to sort by the time the celebrity was recognized.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ID, TIMESTAMP
     *
     * @param sortBy <p>
     *            Sort to use for celebrities returned in
     *            <code>Celebrities</code> field. Specify <code>ID</code> to
     *            sort by the celebrity identifier, specify
     *            <code>TIMESTAMP</code> to sort by the time the celebrity was
     *            recognized.
     *            </p>
     * @see CelebrityRecognitionSortBy
     */
    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * Sort to use for celebrities returned in <code>Celebrities</code> field.
     * Specify <code>ID</code> to sort by the celebrity identifier, specify
     * <code>TIMESTAMP</code> to sort by the time the celebrity was recognized.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ID, TIMESTAMP
     *
     * @param sortBy <p>
     *            Sort to use for celebrities returned in
     *            <code>Celebrities</code> field. Specify <code>ID</code> to
     *            sort by the celebrity identifier, specify
     *            <code>TIMESTAMP</code> to sort by the time the celebrity was
     *            recognized.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CelebrityRecognitionSortBy
     */
    public GetCelebrityRecognitionRequest withSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }

    /**
     * <p>
     * Sort to use for celebrities returned in <code>Celebrities</code> field.
     * Specify <code>ID</code> to sort by the celebrity identifier, specify
     * <code>TIMESTAMP</code> to sort by the time the celebrity was recognized.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ID, TIMESTAMP
     *
     * @param sortBy <p>
     *            Sort to use for celebrities returned in
     *            <code>Celebrities</code> field. Specify <code>ID</code> to
     *            sort by the celebrity identifier, specify
     *            <code>TIMESTAMP</code> to sort by the time the celebrity was
     *            recognized.
     *            </p>
     * @see CelebrityRecognitionSortBy
     */
    public void setSortBy(CelebrityRecognitionSortBy sortBy) {
        this.sortBy = sortBy.toString();
    }

    /**
     * <p>
     * Sort to use for celebrities returned in <code>Celebrities</code> field.
     * Specify <code>ID</code> to sort by the celebrity identifier, specify
     * <code>TIMESTAMP</code> to sort by the time the celebrity was recognized.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ID, TIMESTAMP
     *
     * @param sortBy <p>
     *            Sort to use for celebrities returned in
     *            <code>Celebrities</code> field. Specify <code>ID</code> to
     *            sort by the celebrity identifier, specify
     *            <code>TIMESTAMP</code> to sort by the time the celebrity was
     *            recognized.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CelebrityRecognitionSortBy
     */
    public GetCelebrityRecognitionRequest withSortBy(CelebrityRecognitionSortBy sortBy) {
        this.sortBy = sortBy.toString();
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
            sb.append("NextToken: " + getNextToken() + ",");
        if (getSortBy() != null)
            sb.append("SortBy: " + getSortBy());
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
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCelebrityRecognitionRequest == false)
            return false;
        GetCelebrityRecognitionRequest other = (GetCelebrityRecognitionRequest) obj;

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
        if (other.getSortBy() == null ^ this.getSortBy() == null)
            return false;
        if (other.getSortBy() != null && other.getSortBy().equals(this.getSortBy()) == false)
            return false;
        return true;
    }
}
