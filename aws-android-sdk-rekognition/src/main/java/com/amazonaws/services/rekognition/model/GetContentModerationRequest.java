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
 * Gets the content moderation analysis results for a Amazon Rekognition Video
 * analysis started by .
 * </p>
 * <p>
 * Content moderation analysis of a video is an asynchronous operation. You
 * start analysis by calling . which returns a job identifier (
 * <code>JobId</code>). When analysis finishes, Amazon Rekognition Video
 * publishes a completion status to the Amazon Simple Notification Service topic
 * registered in the initial call to <code>StartContentModeration</code>. To get
 * the results of the content moderation analysis, first check that the status
 * value published to the Amazon SNS topic is <code>SUCCEEDED</code>. If so,
 * call <code>GetCelebrityDetection</code> and pass the job identifier (
 * <code>JobId</code>) from the initial call to
 * <code>StartCelebrityDetection</code>.
 * </p>
 * <p>
 * For more information, see Working with Stored Videos in the Amazon
 * Rekognition Devlopers Guide.
 * </p>
 * <p>
 * <code>GetContentModeration</code> returns detected content moderation labels,
 * and the time they are detected, in an array, <code>ModerationLabels</code>,
 * of objects.
 * </p>
 * <p>
 * By default, the moderated labels are returned sorted by time, in milliseconds
 * from the start of the video. You can also sort them by moderated label by
 * specifying <code>NAME</code> for the <code>SortBy</code> input parameter.
 * </p>
 * <p>
 * Since video analysis can return a large number of results, use the
 * <code>MaxResults</code> parameter to limit the number of labels returned in a
 * single call to <code>GetContentModeration</code>. If there are more results
 * than specified in <code>MaxResults</code>, the value of
 * <code>NextToken</code> in the operation response contains a pagination token
 * for getting the next set of results. To get the next page of results, call
 * <code>GetContentModeration</code> and populate the <code>NextToken</code>
 * request parameter with the value of <code>NextToken</code> returned from the
 * previous call to <code>GetContentModeration</code>.
 * </p>
 * <p>
 * For more information, see Detecting Unsafe Content in the Amazon Rekognition
 * Developer Guide.
 * </p>
 */
public class GetContentModerationRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier for the content moderation job. Use <code>JobId</code> to
     * identify the job in a subsequent call to
     * <code>GetContentModeration</code>.
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
     * If the previous response was incomplete (because there is more data to
     * retrieve), Amazon Rekognition returns a pagination token in the response.
     * You can use this pagination token to retrieve the next set of content
     * moderation labels.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String nextToken;

    /**
     * <p>
     * Sort to use for elements in the <code>ModerationLabelDetections</code>
     * array. Use <code>TIMESTAMP</code> to sort array elements by the time
     * labels are detected. Use <code>NAME</code> to alphabetically group
     * elements for a label together. Within each label group, the array element
     * are sorted by detection confidence. The default sort is by
     * <code>TIMESTAMP</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NAME, TIMESTAMP
     */
    private String sortBy;

    /**
     * <p>
     * The identifier for the content moderation job. Use <code>JobId</code> to
     * identify the job in a subsequent call to
     * <code>GetContentModeration</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @return <p>
     *         The identifier for the content moderation job. Use
     *         <code>JobId</code> to identify the job in a subsequent call to
     *         <code>GetContentModeration</code>.
     *         </p>
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * <p>
     * The identifier for the content moderation job. Use <code>JobId</code> to
     * identify the job in a subsequent call to
     * <code>GetContentModeration</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @param jobId <p>
     *            The identifier for the content moderation job. Use
     *            <code>JobId</code> to identify the job in a subsequent call to
     *            <code>GetContentModeration</code>.
     *            </p>
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The identifier for the content moderation job. Use <code>JobId</code> to
     * identify the job in a subsequent call to
     * <code>GetContentModeration</code>.
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
     *            The identifier for the content moderation job. Use
     *            <code>JobId</code> to identify the job in a subsequent call to
     *            <code>GetContentModeration</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetContentModerationRequest withJobId(String jobId) {
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
    public GetContentModerationRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there is more data to
     * retrieve), Amazon Rekognition returns a pagination token in the response.
     * You can use this pagination token to retrieve the next set of content
     * moderation labels.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         If the previous response was incomplete (because there is more
     *         data to retrieve), Amazon Rekognition returns a pagination token
     *         in the response. You can use this pagination token to retrieve
     *         the next set of content moderation labels.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there is more data to
     * retrieve), Amazon Rekognition returns a pagination token in the response.
     * You can use this pagination token to retrieve the next set of content
     * moderation labels.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param nextToken <p>
     *            If the previous response was incomplete (because there is more
     *            data to retrieve), Amazon Rekognition returns a pagination
     *            token in the response. You can use this pagination token to
     *            retrieve the next set of content moderation labels.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there is more data to
     * retrieve), Amazon Rekognition returns a pagination token in the response.
     * You can use this pagination token to retrieve the next set of content
     * moderation labels.
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
     *            data to retrieve), Amazon Rekognition returns a pagination
     *            token in the response. You can use this pagination token to
     *            retrieve the next set of content moderation labels.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetContentModerationRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * Sort to use for elements in the <code>ModerationLabelDetections</code>
     * array. Use <code>TIMESTAMP</code> to sort array elements by the time
     * labels are detected. Use <code>NAME</code> to alphabetically group
     * elements for a label together. Within each label group, the array element
     * are sorted by detection confidence. The default sort is by
     * <code>TIMESTAMP</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NAME, TIMESTAMP
     *
     * @return <p>
     *         Sort to use for elements in the
     *         <code>ModerationLabelDetections</code> array. Use
     *         <code>TIMESTAMP</code> to sort array elements by the time labels
     *         are detected. Use <code>NAME</code> to alphabetically group
     *         elements for a label together. Within each label group, the array
     *         element are sorted by detection confidence. The default sort is
     *         by <code>TIMESTAMP</code>.
     *         </p>
     * @see ContentModerationSortBy
     */
    public String getSortBy() {
        return sortBy;
    }

    /**
     * <p>
     * Sort to use for elements in the <code>ModerationLabelDetections</code>
     * array. Use <code>TIMESTAMP</code> to sort array elements by the time
     * labels are detected. Use <code>NAME</code> to alphabetically group
     * elements for a label together. Within each label group, the array element
     * are sorted by detection confidence. The default sort is by
     * <code>TIMESTAMP</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NAME, TIMESTAMP
     *
     * @param sortBy <p>
     *            Sort to use for elements in the
     *            <code>ModerationLabelDetections</code> array. Use
     *            <code>TIMESTAMP</code> to sort array elements by the time
     *            labels are detected. Use <code>NAME</code> to alphabetically
     *            group elements for a label together. Within each label group,
     *            the array element are sorted by detection confidence. The
     *            default sort is by <code>TIMESTAMP</code>.
     *            </p>
     * @see ContentModerationSortBy
     */
    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * Sort to use for elements in the <code>ModerationLabelDetections</code>
     * array. Use <code>TIMESTAMP</code> to sort array elements by the time
     * labels are detected. Use <code>NAME</code> to alphabetically group
     * elements for a label together. Within each label group, the array element
     * are sorted by detection confidence. The default sort is by
     * <code>TIMESTAMP</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NAME, TIMESTAMP
     *
     * @param sortBy <p>
     *            Sort to use for elements in the
     *            <code>ModerationLabelDetections</code> array. Use
     *            <code>TIMESTAMP</code> to sort array elements by the time
     *            labels are detected. Use <code>NAME</code> to alphabetically
     *            group elements for a label together. Within each label group,
     *            the array element are sorted by detection confidence. The
     *            default sort is by <code>TIMESTAMP</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContentModerationSortBy
     */
    public GetContentModerationRequest withSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }

    /**
     * <p>
     * Sort to use for elements in the <code>ModerationLabelDetections</code>
     * array. Use <code>TIMESTAMP</code> to sort array elements by the time
     * labels are detected. Use <code>NAME</code> to alphabetically group
     * elements for a label together. Within each label group, the array element
     * are sorted by detection confidence. The default sort is by
     * <code>TIMESTAMP</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NAME, TIMESTAMP
     *
     * @param sortBy <p>
     *            Sort to use for elements in the
     *            <code>ModerationLabelDetections</code> array. Use
     *            <code>TIMESTAMP</code> to sort array elements by the time
     *            labels are detected. Use <code>NAME</code> to alphabetically
     *            group elements for a label together. Within each label group,
     *            the array element are sorted by detection confidence. The
     *            default sort is by <code>TIMESTAMP</code>.
     *            </p>
     * @see ContentModerationSortBy
     */
    public void setSortBy(ContentModerationSortBy sortBy) {
        this.sortBy = sortBy.toString();
    }

    /**
     * <p>
     * Sort to use for elements in the <code>ModerationLabelDetections</code>
     * array. Use <code>TIMESTAMP</code> to sort array elements by the time
     * labels are detected. Use <code>NAME</code> to alphabetically group
     * elements for a label together. Within each label group, the array element
     * are sorted by detection confidence. The default sort is by
     * <code>TIMESTAMP</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NAME, TIMESTAMP
     *
     * @param sortBy <p>
     *            Sort to use for elements in the
     *            <code>ModerationLabelDetections</code> array. Use
     *            <code>TIMESTAMP</code> to sort array elements by the time
     *            labels are detected. Use <code>NAME</code> to alphabetically
     *            group elements for a label together. Within each label group,
     *            the array element are sorted by detection confidence. The
     *            default sort is by <code>TIMESTAMP</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ContentModerationSortBy
     */
    public GetContentModerationRequest withSortBy(ContentModerationSortBy sortBy) {
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

        if (obj instanceof GetContentModerationRequest == false)
            return false;
        GetContentModerationRequest other = (GetContentModerationRequest) obj;

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
