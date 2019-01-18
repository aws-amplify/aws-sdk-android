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
 * Gets the face search results for Amazon Rekognition Video face search started
 * by . The search returns faces in a collection that match the faces of persons
 * detected in a video. It also includes the time(s) that faces are matched in
 * the video.
 * </p>
 * <p>
 * Face search in a video is an asynchronous operation. You start face search by
 * calling to which returns a job identifier (<code>JobId</code>). When the
 * search operation finishes, Amazon Rekognition Video publishes a completion
 * status to the Amazon Simple Notification Service topic registered in the
 * initial call to <code>StartFaceSearch</code>. To get the search results,
 * first check that the status value published to the Amazon SNS topic is
 * <code>SUCCEEDED</code>. If so, call <code>GetFaceSearch</code> and pass the
 * job identifier (<code>JobId</code>) from the initial call to
 * <code>StartFaceSearch</code>.
 * </p>
 * <p>
 * For more information, see Searching Faces in a Collection in the Amazon
 * Rekognition Developer Guide.
 * </p>
 * <p>
 * The search results are retured in an array, <code>Persons</code>, of objects.
 * Each<code>PersonMatch</code> element contains details about the matching
 * faces in the input collection, person information (facial attributes,
 * bounding boxes, and person identifer) for the matched person, and the time
 * the person was matched in the video.
 * </p>
 * <note>
 * <p>
 * <code>GetFaceSearch</code> only returns the default facial attributes (
 * <code>BoundingBox</code>, <code>Confidence</code>, <code>Landmarks</code>,
 * <code>Pose</code>, and <code>Quality</code>). The other facial attributes
 * listed in the <code>Face</code> object of the following response syntax are
 * not returned. For more information, see FaceDetail in the Amazon Rekognition
 * Developer Guide.
 * </p>
 * </note>
 * <p>
 * By default, the <code>Persons</code> array is sorted by the time, in
 * milliseconds from the start of the video, persons are matched. You can also
 * sort by persons by specifying <code>INDEX</code> for the <code>SORTBY</code>
 * input parameter.
 * </p>
 */
public class GetFaceSearchRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The job identifer for the search request. You get the job identifier from
     * an initial call to <code>StartFaceSearch</code>.
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
     * If the previous response was incomplete (because there is more search
     * results to retrieve), Amazon Rekognition Video returns a pagination token
     * in the response. You can use this pagination token to retrieve the next
     * set of search results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String nextToken;

    /**
     * <p>
     * Sort to use for grouping faces in the response. Use
     * <code>TIMESTAMP</code> to group faces by the time that they are
     * recognized. Use <code>INDEX</code> to sort by recognized faces.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INDEX, TIMESTAMP
     */
    private String sortBy;

    /**
     * <p>
     * The job identifer for the search request. You get the job identifier from
     * an initial call to <code>StartFaceSearch</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @return <p>
     *         The job identifer for the search request. You get the job
     *         identifier from an initial call to <code>StartFaceSearch</code>.
     *         </p>
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * <p>
     * The job identifer for the search request. You get the job identifier from
     * an initial call to <code>StartFaceSearch</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @param jobId <p>
     *            The job identifer for the search request. You get the job
     *            identifier from an initial call to
     *            <code>StartFaceSearch</code>.
     *            </p>
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The job identifer for the search request. You get the job identifier from
     * an initial call to <code>StartFaceSearch</code>.
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
     *            The job identifer for the search request. You get the job
     *            identifier from an initial call to
     *            <code>StartFaceSearch</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFaceSearchRequest withJobId(String jobId) {
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
    public GetFaceSearchRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there is more search
     * results to retrieve), Amazon Rekognition Video returns a pagination token
     * in the response. You can use this pagination token to retrieve the next
     * set of search results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         If the previous response was incomplete (because there is more
     *         search results to retrieve), Amazon Rekognition Video returns a
     *         pagination token in the response. You can use this pagination
     *         token to retrieve the next set of search results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there is more search
     * results to retrieve), Amazon Rekognition Video returns a pagination token
     * in the response. You can use this pagination token to retrieve the next
     * set of search results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param nextToken <p>
     *            If the previous response was incomplete (because there is more
     *            search results to retrieve), Amazon Rekognition Video returns
     *            a pagination token in the response. You can use this
     *            pagination token to retrieve the next set of search results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there is more search
     * results to retrieve), Amazon Rekognition Video returns a pagination token
     * in the response. You can use this pagination token to retrieve the next
     * set of search results.
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
     *            search results to retrieve), Amazon Rekognition Video returns
     *            a pagination token in the response. You can use this
     *            pagination token to retrieve the next set of search results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFaceSearchRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * Sort to use for grouping faces in the response. Use
     * <code>TIMESTAMP</code> to group faces by the time that they are
     * recognized. Use <code>INDEX</code> to sort by recognized faces.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INDEX, TIMESTAMP
     *
     * @return <p>
     *         Sort to use for grouping faces in the response. Use
     *         <code>TIMESTAMP</code> to group faces by the time that they are
     *         recognized. Use <code>INDEX</code> to sort by recognized faces.
     *         </p>
     * @see FaceSearchSortBy
     */
    public String getSortBy() {
        return sortBy;
    }

    /**
     * <p>
     * Sort to use for grouping faces in the response. Use
     * <code>TIMESTAMP</code> to group faces by the time that they are
     * recognized. Use <code>INDEX</code> to sort by recognized faces.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INDEX, TIMESTAMP
     *
     * @param sortBy <p>
     *            Sort to use for grouping faces in the response. Use
     *            <code>TIMESTAMP</code> to group faces by the time that they
     *            are recognized. Use <code>INDEX</code> to sort by recognized
     *            faces.
     *            </p>
     * @see FaceSearchSortBy
     */
    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * Sort to use for grouping faces in the response. Use
     * <code>TIMESTAMP</code> to group faces by the time that they are
     * recognized. Use <code>INDEX</code> to sort by recognized faces.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INDEX, TIMESTAMP
     *
     * @param sortBy <p>
     *            Sort to use for grouping faces in the response. Use
     *            <code>TIMESTAMP</code> to group faces by the time that they
     *            are recognized. Use <code>INDEX</code> to sort by recognized
     *            faces.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FaceSearchSortBy
     */
    public GetFaceSearchRequest withSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }

    /**
     * <p>
     * Sort to use for grouping faces in the response. Use
     * <code>TIMESTAMP</code> to group faces by the time that they are
     * recognized. Use <code>INDEX</code> to sort by recognized faces.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INDEX, TIMESTAMP
     *
     * @param sortBy <p>
     *            Sort to use for grouping faces in the response. Use
     *            <code>TIMESTAMP</code> to group faces by the time that they
     *            are recognized. Use <code>INDEX</code> to sort by recognized
     *            faces.
     *            </p>
     * @see FaceSearchSortBy
     */
    public void setSortBy(FaceSearchSortBy sortBy) {
        this.sortBy = sortBy.toString();
    }

    /**
     * <p>
     * Sort to use for grouping faces in the response. Use
     * <code>TIMESTAMP</code> to group faces by the time that they are
     * recognized. Use <code>INDEX</code> to sort by recognized faces.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INDEX, TIMESTAMP
     *
     * @param sortBy <p>
     *            Sort to use for grouping faces in the response. Use
     *            <code>TIMESTAMP</code> to group faces by the time that they
     *            are recognized. Use <code>INDEX</code> to sort by recognized
     *            faces.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FaceSearchSortBy
     */
    public GetFaceSearchRequest withSortBy(FaceSearchSortBy sortBy) {
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

        if (obj instanceof GetFaceSearchRequest == false)
            return false;
        GetFaceSearchRequest other = (GetFaceSearchRequest) obj;

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
