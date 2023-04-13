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

package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets the label detection results of a Amazon Rekognition Video analysis
 * started by <a>StartLabelDetection</a>.
 * </p>
 * <p>
 * The label detection operation is started by a call to
 * <a>StartLabelDetection</a> which returns a job identifier (<code>JobId</code>
 * ). When the label detection operation finishes, Amazon Rekognition publishes
 * a completion status to the Amazon Simple Notification Service topic
 * registered in the initial call to <code>StartlabelDetection</code>.
 * </p>
 * <p>
 * To get the results of the label detection operation, first check that the
 * status value published to the Amazon SNS topic is <code>SUCCEEDED</code>. If
 * so, call <a>GetLabelDetection</a> and pass the job identifier (
 * <code>JobId</code>) from the initial call to <code>StartLabelDetection</code>
 * .
 * </p>
 * <p>
 * <code>GetLabelDetection</code> returns an array of detected labels (
 * <code>Labels</code>) sorted by the time the labels were detected. You can
 * also sort by the label name by specifying <code>NAME</code> for the
 * <code>SortBy</code> input parameter. If there is no <code>NAME</code>
 * specified, the default sort is by timestamp.
 * </p>
 * <p>
 * You can select how results are aggregated by using the
 * <code>AggregateBy</code> input parameter. The default aggregation method is
 * <code>TIMESTAMPS</code>. You can also aggregate by <code>SEGMENTS</code>,
 * which aggregates all instances of labels detected in a given segment.
 * </p>
 * <p>
 * The returned Labels array may include the following attributes:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Name - The name of the detected label.
 * </p>
 * </li>
 * <li>
 * <p>
 * Confidence - The level of confidence in the label assigned to a detected
 * object.
 * </p>
 * </li>
 * <li>
 * <p>
 * Parents - The ancestor labels for a detected label. GetLabelDetection returns
 * a hierarchical taxonomy of detected labels. For example, a detected car might
 * be assigned the label car. The label car has two parent labels: Vehicle (its
 * parent) and Transportation (its grandparent). The response includes the all
 * ancestors for a label, where every ancestor is a unique label. In the
 * previous example, Car, Vehicle, and Transportation are returned as unique
 * labels in the response.
 * </p>
 * </li>
 * <li>
 * <p>
 * Aliases - Possible Aliases for the label.
 * </p>
 * </li>
 * <li>
 * <p>
 * Categories - The label categories that the detected label belongs to.
 * </p>
 * </li>
 * <li>
 * <p>
 * BoundingBox — Bounding boxes are described for all instances of detected
 * common object labels, returned in an array of Instance objects. An Instance
 * object contains a BoundingBox object, describing the location of the label on
 * the input image. It also includes the confidence for the accuracy of the
 * detected bounding box.
 * </p>
 * </li>
 * <li>
 * <p>
 * Timestamp - Time, in milliseconds from the start of the video, that the label
 * was detected. For aggregation by <code>SEGMENTS</code>, the
 * <code>StartTimestampMillis</code>, <code>EndTimestampMillis</code>, and
 * <code>DurationMillis</code> structures are what define a segment. Although
 * the “Timestamp” structure is still returned with each label, its value is set
 * to be the same as <code>StartTimestampMillis</code>.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Timestamp and Bounding box information are returned for detected Instances,
 * only if aggregation is done by <code>TIMESTAMPS</code>. If aggregating by
 * <code>SEGMENTS</code>, information about detected instances isn’t returned.
 * </p>
 * <p>
 * The version of the label model used for the detection is also returned.
 * </p>
 * <p>
 * <b>Note <code>DominantColors</code> isn't returned for <code>Instances</code>
 * , although it is shown as part of the response in the sample seen below.</b>
 * </p>
 * <p>
 * Use <code>MaxResults</code> parameter to limit the number of labels returned.
 * If there are more results than specified in <code>MaxResults</code>, the
 * value of <code>NextToken</code> in the operation response contains a
 * pagination token for getting the next set of results. To get the next page of
 * results, call <code>GetlabelDetection</code> and populate the
 * <code>NextToken</code> request parameter with the token value returned from
 * the previous call to <code>GetLabelDetection</code>.
 * </p>
 */
public class GetLabelDetectionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Job identifier for the label detection operation for which you want
     * results returned. You get the job identifer from an initial call to
     * <code>StartlabelDetection</code>.
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
     * If the previous response was incomplete (because there are more labels to
     * retrieve), Amazon Rekognition Video returns a pagination token in the
     * response. You can use this pagination token to retrieve the next set of
     * labels.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String nextToken;

    /**
     * <p>
     * Sort to use for elements in the <code>Labels</code> array. Use
     * <code>TIMESTAMP</code> to sort array elements by the time labels are
     * detected. Use <code>NAME</code> to alphabetically group elements for a
     * label together. Within each label group, the array element are sorted by
     * detection confidence. The default sort is by <code>TIMESTAMP</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NAME, TIMESTAMP
     */
    private String sortBy;

    /**
     * <p>
     * Defines how to aggregate the returned results. Results can be aggregated
     * by timestamps or segments.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TIMESTAMPS, SEGMENTS
     */
    private String aggregateBy;

    /**
     * <p>
     * Job identifier for the label detection operation for which you want
     * results returned. You get the job identifer from an initial call to
     * <code>StartlabelDetection</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @return <p>
     *         Job identifier for the label detection operation for which you
     *         want results returned. You get the job identifer from an initial
     *         call to <code>StartlabelDetection</code>.
     *         </p>
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * <p>
     * Job identifier for the label detection operation for which you want
     * results returned. You get the job identifer from an initial call to
     * <code>StartlabelDetection</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @param jobId <p>
     *            Job identifier for the label detection operation for which you
     *            want results returned. You get the job identifer from an
     *            initial call to <code>StartlabelDetection</code>.
     *            </p>
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * Job identifier for the label detection operation for which you want
     * results returned. You get the job identifer from an initial call to
     * <code>StartlabelDetection</code>.
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
     *            Job identifier for the label detection operation for which you
     *            want results returned. You get the job identifer from an
     *            initial call to <code>StartlabelDetection</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetLabelDetectionRequest withJobId(String jobId) {
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
    public GetLabelDetectionRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there are more labels to
     * retrieve), Amazon Rekognition Video returns a pagination token in the
     * response. You can use this pagination token to retrieve the next set of
     * labels.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         If the previous response was incomplete (because there are more
     *         labels to retrieve), Amazon Rekognition Video returns a
     *         pagination token in the response. You can use this pagination
     *         token to retrieve the next set of labels.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there are more labels to
     * retrieve), Amazon Rekognition Video returns a pagination token in the
     * response. You can use this pagination token to retrieve the next set of
     * labels.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param nextToken <p>
     *            If the previous response was incomplete (because there are
     *            more labels to retrieve), Amazon Rekognition Video returns a
     *            pagination token in the response. You can use this pagination
     *            token to retrieve the next set of labels.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there are more labels to
     * retrieve), Amazon Rekognition Video returns a pagination token in the
     * response. You can use this pagination token to retrieve the next set of
     * labels.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param nextToken <p>
     *            If the previous response was incomplete (because there are
     *            more labels to retrieve), Amazon Rekognition Video returns a
     *            pagination token in the response. You can use this pagination
     *            token to retrieve the next set of labels.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetLabelDetectionRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * Sort to use for elements in the <code>Labels</code> array. Use
     * <code>TIMESTAMP</code> to sort array elements by the time labels are
     * detected. Use <code>NAME</code> to alphabetically group elements for a
     * label together. Within each label group, the array element are sorted by
     * detection confidence. The default sort is by <code>TIMESTAMP</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NAME, TIMESTAMP
     *
     * @return <p>
     *         Sort to use for elements in the <code>Labels</code> array. Use
     *         <code>TIMESTAMP</code> to sort array elements by the time labels
     *         are detected. Use <code>NAME</code> to alphabetically group
     *         elements for a label together. Within each label group, the array
     *         element are sorted by detection confidence. The default sort is
     *         by <code>TIMESTAMP</code>.
     *         </p>
     * @see LabelDetectionSortBy
     */
    public String getSortBy() {
        return sortBy;
    }

    /**
     * <p>
     * Sort to use for elements in the <code>Labels</code> array. Use
     * <code>TIMESTAMP</code> to sort array elements by the time labels are
     * detected. Use <code>NAME</code> to alphabetically group elements for a
     * label together. Within each label group, the array element are sorted by
     * detection confidence. The default sort is by <code>TIMESTAMP</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NAME, TIMESTAMP
     *
     * @param sortBy <p>
     *            Sort to use for elements in the <code>Labels</code> array. Use
     *            <code>TIMESTAMP</code> to sort array elements by the time
     *            labels are detected. Use <code>NAME</code> to alphabetically
     *            group elements for a label together. Within each label group,
     *            the array element are sorted by detection confidence. The
     *            default sort is by <code>TIMESTAMP</code>.
     *            </p>
     * @see LabelDetectionSortBy
     */
    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * Sort to use for elements in the <code>Labels</code> array. Use
     * <code>TIMESTAMP</code> to sort array elements by the time labels are
     * detected. Use <code>NAME</code> to alphabetically group elements for a
     * label together. Within each label group, the array element are sorted by
     * detection confidence. The default sort is by <code>TIMESTAMP</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NAME, TIMESTAMP
     *
     * @param sortBy <p>
     *            Sort to use for elements in the <code>Labels</code> array. Use
     *            <code>TIMESTAMP</code> to sort array elements by the time
     *            labels are detected. Use <code>NAME</code> to alphabetically
     *            group elements for a label together. Within each label group,
     *            the array element are sorted by detection confidence. The
     *            default sort is by <code>TIMESTAMP</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LabelDetectionSortBy
     */
    public GetLabelDetectionRequest withSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }

    /**
     * <p>
     * Sort to use for elements in the <code>Labels</code> array. Use
     * <code>TIMESTAMP</code> to sort array elements by the time labels are
     * detected. Use <code>NAME</code> to alphabetically group elements for a
     * label together. Within each label group, the array element are sorted by
     * detection confidence. The default sort is by <code>TIMESTAMP</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NAME, TIMESTAMP
     *
     * @param sortBy <p>
     *            Sort to use for elements in the <code>Labels</code> array. Use
     *            <code>TIMESTAMP</code> to sort array elements by the time
     *            labels are detected. Use <code>NAME</code> to alphabetically
     *            group elements for a label together. Within each label group,
     *            the array element are sorted by detection confidence. The
     *            default sort is by <code>TIMESTAMP</code>.
     *            </p>
     * @see LabelDetectionSortBy
     */
    public void setSortBy(LabelDetectionSortBy sortBy) {
        this.sortBy = sortBy.toString();
    }

    /**
     * <p>
     * Sort to use for elements in the <code>Labels</code> array. Use
     * <code>TIMESTAMP</code> to sort array elements by the time labels are
     * detected. Use <code>NAME</code> to alphabetically group elements for a
     * label together. Within each label group, the array element are sorted by
     * detection confidence. The default sort is by <code>TIMESTAMP</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NAME, TIMESTAMP
     *
     * @param sortBy <p>
     *            Sort to use for elements in the <code>Labels</code> array. Use
     *            <code>TIMESTAMP</code> to sort array elements by the time
     *            labels are detected. Use <code>NAME</code> to alphabetically
     *            group elements for a label together. Within each label group,
     *            the array element are sorted by detection confidence. The
     *            default sort is by <code>TIMESTAMP</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LabelDetectionSortBy
     */
    public GetLabelDetectionRequest withSortBy(LabelDetectionSortBy sortBy) {
        this.sortBy = sortBy.toString();
        return this;
    }

    /**
     * <p>
     * Defines how to aggregate the returned results. Results can be aggregated
     * by timestamps or segments.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TIMESTAMPS, SEGMENTS
     *
     * @return <p>
     *         Defines how to aggregate the returned results. Results can be
     *         aggregated by timestamps or segments.
     *         </p>
     * @see LabelDetectionAggregateBy
     */
    public String getAggregateBy() {
        return aggregateBy;
    }

    /**
     * <p>
     * Defines how to aggregate the returned results. Results can be aggregated
     * by timestamps or segments.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TIMESTAMPS, SEGMENTS
     *
     * @param aggregateBy <p>
     *            Defines how to aggregate the returned results. Results can be
     *            aggregated by timestamps or segments.
     *            </p>
     * @see LabelDetectionAggregateBy
     */
    public void setAggregateBy(String aggregateBy) {
        this.aggregateBy = aggregateBy;
    }

    /**
     * <p>
     * Defines how to aggregate the returned results. Results can be aggregated
     * by timestamps or segments.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TIMESTAMPS, SEGMENTS
     *
     * @param aggregateBy <p>
     *            Defines how to aggregate the returned results. Results can be
     *            aggregated by timestamps or segments.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LabelDetectionAggregateBy
     */
    public GetLabelDetectionRequest withAggregateBy(String aggregateBy) {
        this.aggregateBy = aggregateBy;
        return this;
    }

    /**
     * <p>
     * Defines how to aggregate the returned results. Results can be aggregated
     * by timestamps or segments.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TIMESTAMPS, SEGMENTS
     *
     * @param aggregateBy <p>
     *            Defines how to aggregate the returned results. Results can be
     *            aggregated by timestamps or segments.
     *            </p>
     * @see LabelDetectionAggregateBy
     */
    public void setAggregateBy(LabelDetectionAggregateBy aggregateBy) {
        this.aggregateBy = aggregateBy.toString();
    }

    /**
     * <p>
     * Defines how to aggregate the returned results. Results can be aggregated
     * by timestamps or segments.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TIMESTAMPS, SEGMENTS
     *
     * @param aggregateBy <p>
     *            Defines how to aggregate the returned results. Results can be
     *            aggregated by timestamps or segments.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LabelDetectionAggregateBy
     */
    public GetLabelDetectionRequest withAggregateBy(LabelDetectionAggregateBy aggregateBy) {
        this.aggregateBy = aggregateBy.toString();
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
            sb.append("SortBy: " + getSortBy() + ",");
        if (getAggregateBy() != null)
            sb.append("AggregateBy: " + getAggregateBy());
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
        hashCode = prime * hashCode
                + ((getAggregateBy() == null) ? 0 : getAggregateBy().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetLabelDetectionRequest == false)
            return false;
        GetLabelDetectionRequest other = (GetLabelDetectionRequest) obj;

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
        if (other.getAggregateBy() == null ^ this.getAggregateBy() == null)
            return false;
        if (other.getAggregateBy() != null
                && other.getAggregateBy().equals(this.getAggregateBy()) == false)
            return false;
        return true;
    }
}
