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
 * Gets face detection results for a Amazon Rekognition Video analysis started
 * by .
 * </p>
 * <p>
 * Face detection with Amazon Rekognition Video is an asynchronous operation.
 * You start face detection by calling which returns a job identifier (
 * <code>JobId</code>). When the face detection operation finishes, Amazon
 * Rekognition Video publishes a completion status to the Amazon Simple
 * Notification Service topic registered in the initial call to
 * <code>StartFaceDetection</code>. To get the results of the face detection
 * operation, first check that the status value published to the Amazon SNS
 * topic is <code>SUCCEEDED</code>. If so, call and pass the job identifier (
 * <code>JobId</code>) from the initial call to <code>StartFaceDetection</code>.
 * </p>
 * <p>
 * <code>GetFaceDetection</code> returns an array of detected faces (
 * <code>Faces</code>) sorted by the time the faces were detected.
 * </p>
 * <p>
 * Use MaxResults parameter to limit the number of labels returned. If there are
 * more results than specified in <code>MaxResults</code>, the value of
 * <code>NextToken</code> in the operation response contains a pagination token
 * for getting the next set of results. To get the next page of results, call
 * <code>GetFaceDetection</code> and populate the <code>NextToken</code> request
 * parameter with the token value returned from the previous call to
 * <code>GetFaceDetection</code>.
 * </p>
 */
public class GetFaceDetectionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Unique identifier for the face detection job. The <code>JobId</code> is
     * returned from <code>StartFaceDetection</code>.
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
     * If the previous response was incomplete (because there are more faces to
     * retrieve), Amazon Rekognition Video returns a pagination token in the
     * response. You can use this pagination token to retrieve the next set of
     * faces.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String nextToken;

    /**
     * <p>
     * Unique identifier for the face detection job. The <code>JobId</code> is
     * returned from <code>StartFaceDetection</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @return <p>
     *         Unique identifier for the face detection job. The
     *         <code>JobId</code> is returned from
     *         <code>StartFaceDetection</code>.
     *         </p>
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * <p>
     * Unique identifier for the face detection job. The <code>JobId</code> is
     * returned from <code>StartFaceDetection</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @param jobId <p>
     *            Unique identifier for the face detection job. The
     *            <code>JobId</code> is returned from
     *            <code>StartFaceDetection</code>.
     *            </p>
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * Unique identifier for the face detection job. The <code>JobId</code> is
     * returned from <code>StartFaceDetection</code>.
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
     *            Unique identifier for the face detection job. The
     *            <code>JobId</code> is returned from
     *            <code>StartFaceDetection</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFaceDetectionRequest withJobId(String jobId) {
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
    public GetFaceDetectionRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there are more faces to
     * retrieve), Amazon Rekognition Video returns a pagination token in the
     * response. You can use this pagination token to retrieve the next set of
     * faces.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         If the previous response was incomplete (because there are more
     *         faces to retrieve), Amazon Rekognition Video returns a pagination
     *         token in the response. You can use this pagination token to
     *         retrieve the next set of faces.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there are more faces to
     * retrieve), Amazon Rekognition Video returns a pagination token in the
     * response. You can use this pagination token to retrieve the next set of
     * faces.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param nextToken <p>
     *            If the previous response was incomplete (because there are
     *            more faces to retrieve), Amazon Rekognition Video returns a
     *            pagination token in the response. You can use this pagination
     *            token to retrieve the next set of faces.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there are more faces to
     * retrieve), Amazon Rekognition Video returns a pagination token in the
     * response. You can use this pagination token to retrieve the next set of
     * faces.
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
     *            more faces to retrieve), Amazon Rekognition Video returns a
     *            pagination token in the response. You can use this pagination
     *            token to retrieve the next set of faces.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFaceDetectionRequest withNextToken(String nextToken) {
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

        if (obj instanceof GetFaceDetectionRequest == false)
            return false;
        GetFaceDetectionRequest other = (GetFaceDetectionRequest) obj;

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
