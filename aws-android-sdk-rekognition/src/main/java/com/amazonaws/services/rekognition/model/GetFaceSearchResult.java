/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class GetFaceSearchResult implements Serializable {
    /**
     * <p>
     * The current status of the face search job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, SUCCEEDED, FAILED
     */
    private String jobStatus;

    /**
     * <p>
     * If the job fails, <code>StatusMessage</code> provides a descriptive error
     * message.
     * </p>
     */
    private String statusMessage;

    /**
     * <p>
     * If the response is truncated, Rekognition Video returns this token that
     * you can use in the subsequent request to retrieve the next set of search
     * results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String nextToken;

    /**
     * <p>
     * Information about a video that Amazon Rekognition analyzed.
     * <code>Videometadata</code> is returned in every page of paginated
     * responses from a Rekognition Video operation.
     * </p>
     */
    private VideoMetadata videoMetadata;

    /**
     * <p>
     * An array of persons, , in the video whose face(s) match the face(s) in an
     * Amazon Rekognition collection. It also includes time information for when
     * persons are matched in the video. You specify the input collection in an
     * initial call to <code>StartFaceSearch</code>. Each <code>Persons</code>
     * element includes a time the person was matched, face match details (
     * <code>FaceMatches</code>) for matching faces in the collection, and
     * person information (<code>Person</code>) for the matched person.
     * </p>
     */
    private java.util.List<PersonMatch> persons;

    /**
     * <p>
     * The current status of the face search job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, SUCCEEDED, FAILED
     *
     * @return <p>
     *         The current status of the face search job.
     *         </p>
     * @see VideoJobStatus
     */
    public String getJobStatus() {
        return jobStatus;
    }

    /**
     * <p>
     * The current status of the face search job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, SUCCEEDED, FAILED
     *
     * @param jobStatus <p>
     *            The current status of the face search job.
     *            </p>
     * @see VideoJobStatus
     */
    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * <p>
     * The current status of the face search job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, SUCCEEDED, FAILED
     *
     * @param jobStatus <p>
     *            The current status of the face search job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VideoJobStatus
     */
    public GetFaceSearchResult withJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }

    /**
     * <p>
     * The current status of the face search job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, SUCCEEDED, FAILED
     *
     * @param jobStatus <p>
     *            The current status of the face search job.
     *            </p>
     * @see VideoJobStatus
     */
    public void setJobStatus(VideoJobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
    }

    /**
     * <p>
     * The current status of the face search job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, SUCCEEDED, FAILED
     *
     * @param jobStatus <p>
     *            The current status of the face search job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VideoJobStatus
     */
    public GetFaceSearchResult withJobStatus(VideoJobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
        return this;
    }

    /**
     * <p>
     * If the job fails, <code>StatusMessage</code> provides a descriptive error
     * message.
     * </p>
     *
     * @return <p>
     *         If the job fails, <code>StatusMessage</code> provides a
     *         descriptive error message.
     *         </p>
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    /**
     * <p>
     * If the job fails, <code>StatusMessage</code> provides a descriptive error
     * message.
     * </p>
     *
     * @param statusMessage <p>
     *            If the job fails, <code>StatusMessage</code> provides a
     *            descriptive error message.
     *            </p>
     */
    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * If the job fails, <code>StatusMessage</code> provides a descriptive error
     * message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statusMessage <p>
     *            If the job fails, <code>StatusMessage</code> provides a
     *            descriptive error message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFaceSearchResult withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    /**
     * <p>
     * If the response is truncated, Rekognition Video returns this token that
     * you can use in the subsequent request to retrieve the next set of search
     * results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         If the response is truncated, Rekognition Video returns this
     *         token that you can use in the subsequent request to retrieve the
     *         next set of search results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Rekognition Video returns this token that
     * you can use in the subsequent request to retrieve the next set of search
     * results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param nextToken <p>
     *            If the response is truncated, Rekognition Video returns this
     *            token that you can use in the subsequent request to retrieve
     *            the next set of search results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Rekognition Video returns this token that
     * you can use in the subsequent request to retrieve the next set of search
     * results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param nextToken <p>
     *            If the response is truncated, Rekognition Video returns this
     *            token that you can use in the subsequent request to retrieve
     *            the next set of search results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFaceSearchResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * Information about a video that Amazon Rekognition analyzed.
     * <code>Videometadata</code> is returned in every page of paginated
     * responses from a Rekognition Video operation.
     * </p>
     *
     * @return <p>
     *         Information about a video that Amazon Rekognition analyzed.
     *         <code>Videometadata</code> is returned in every page of paginated
     *         responses from a Rekognition Video operation.
     *         </p>
     */
    public VideoMetadata getVideoMetadata() {
        return videoMetadata;
    }

    /**
     * <p>
     * Information about a video that Amazon Rekognition analyzed.
     * <code>Videometadata</code> is returned in every page of paginated
     * responses from a Rekognition Video operation.
     * </p>
     *
     * @param videoMetadata <p>
     *            Information about a video that Amazon Rekognition analyzed.
     *            <code>Videometadata</code> is returned in every page of
     *            paginated responses from a Rekognition Video operation.
     *            </p>
     */
    public void setVideoMetadata(VideoMetadata videoMetadata) {
        this.videoMetadata = videoMetadata;
    }

    /**
     * <p>
     * Information about a video that Amazon Rekognition analyzed.
     * <code>Videometadata</code> is returned in every page of paginated
     * responses from a Rekognition Video operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param videoMetadata <p>
     *            Information about a video that Amazon Rekognition analyzed.
     *            <code>Videometadata</code> is returned in every page of
     *            paginated responses from a Rekognition Video operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFaceSearchResult withVideoMetadata(VideoMetadata videoMetadata) {
        this.videoMetadata = videoMetadata;
        return this;
    }

    /**
     * <p>
     * An array of persons, , in the video whose face(s) match the face(s) in an
     * Amazon Rekognition collection. It also includes time information for when
     * persons are matched in the video. You specify the input collection in an
     * initial call to <code>StartFaceSearch</code>. Each <code>Persons</code>
     * element includes a time the person was matched, face match details (
     * <code>FaceMatches</code>) for matching faces in the collection, and
     * person information (<code>Person</code>) for the matched person.
     * </p>
     *
     * @return <p>
     *         An array of persons, , in the video whose face(s) match the
     *         face(s) in an Amazon Rekognition collection. It also includes
     *         time information for when persons are matched in the video. You
     *         specify the input collection in an initial call to
     *         <code>StartFaceSearch</code>. Each <code>Persons</code> element
     *         includes a time the person was matched, face match details (
     *         <code>FaceMatches</code>) for matching faces in the collection,
     *         and person information (<code>Person</code>) for the matched
     *         person.
     *         </p>
     */
    public java.util.List<PersonMatch> getPersons() {
        return persons;
    }

    /**
     * <p>
     * An array of persons, , in the video whose face(s) match the face(s) in an
     * Amazon Rekognition collection. It also includes time information for when
     * persons are matched in the video. You specify the input collection in an
     * initial call to <code>StartFaceSearch</code>. Each <code>Persons</code>
     * element includes a time the person was matched, face match details (
     * <code>FaceMatches</code>) for matching faces in the collection, and
     * person information (<code>Person</code>) for the matched person.
     * </p>
     *
     * @param persons <p>
     *            An array of persons, , in the video whose face(s) match the
     *            face(s) in an Amazon Rekognition collection. It also includes
     *            time information for when persons are matched in the video.
     *            You specify the input collection in an initial call to
     *            <code>StartFaceSearch</code>. Each <code>Persons</code>
     *            element includes a time the person was matched, face match
     *            details (<code>FaceMatches</code>) for matching faces in the
     *            collection, and person information (<code>Person</code>) for
     *            the matched person.
     *            </p>
     */
    public void setPersons(java.util.Collection<PersonMatch> persons) {
        if (persons == null) {
            this.persons = null;
            return;
        }

        this.persons = new java.util.ArrayList<PersonMatch>(persons);
    }

    /**
     * <p>
     * An array of persons, , in the video whose face(s) match the face(s) in an
     * Amazon Rekognition collection. It also includes time information for when
     * persons are matched in the video. You specify the input collection in an
     * initial call to <code>StartFaceSearch</code>. Each <code>Persons</code>
     * element includes a time the person was matched, face match details (
     * <code>FaceMatches</code>) for matching faces in the collection, and
     * person information (<code>Person</code>) for the matched person.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param persons <p>
     *            An array of persons, , in the video whose face(s) match the
     *            face(s) in an Amazon Rekognition collection. It also includes
     *            time information for when persons are matched in the video.
     *            You specify the input collection in an initial call to
     *            <code>StartFaceSearch</code>. Each <code>Persons</code>
     *            element includes a time the person was matched, face match
     *            details (<code>FaceMatches</code>) for matching faces in the
     *            collection, and person information (<code>Person</code>) for
     *            the matched person.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFaceSearchResult withPersons(PersonMatch... persons) {
        if (getPersons() == null) {
            this.persons = new java.util.ArrayList<PersonMatch>(persons.length);
        }
        for (PersonMatch value : persons) {
            this.persons.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of persons, , in the video whose face(s) match the face(s) in an
     * Amazon Rekognition collection. It also includes time information for when
     * persons are matched in the video. You specify the input collection in an
     * initial call to <code>StartFaceSearch</code>. Each <code>Persons</code>
     * element includes a time the person was matched, face match details (
     * <code>FaceMatches</code>) for matching faces in the collection, and
     * person information (<code>Person</code>) for the matched person.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param persons <p>
     *            An array of persons, , in the video whose face(s) match the
     *            face(s) in an Amazon Rekognition collection. It also includes
     *            time information for when persons are matched in the video.
     *            You specify the input collection in an initial call to
     *            <code>StartFaceSearch</code>. Each <code>Persons</code>
     *            element includes a time the person was matched, face match
     *            details (<code>FaceMatches</code>) for matching faces in the
     *            collection, and person information (<code>Person</code>) for
     *            the matched person.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFaceSearchResult withPersons(java.util.Collection<PersonMatch> persons) {
        setPersons(persons);
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
        if (getJobStatus() != null)
            sb.append("JobStatus: " + getJobStatus() + ",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: " + getStatusMessage() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getVideoMetadata() != null)
            sb.append("VideoMetadata: " + getVideoMetadata() + ",");
        if (getPersons() != null)
            sb.append("Persons: " + getPersons());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobStatus() == null) ? 0 : getJobStatus().hashCode());
        hashCode = prime * hashCode
                + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getVideoMetadata() == null) ? 0 : getVideoMetadata().hashCode());
        hashCode = prime * hashCode + ((getPersons() == null) ? 0 : getPersons().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetFaceSearchResult == false)
            return false;
        GetFaceSearchResult other = (GetFaceSearchResult) obj;

        if (other.getJobStatus() == null ^ this.getJobStatus() == null)
            return false;
        if (other.getJobStatus() != null
                && other.getJobStatus().equals(this.getJobStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null
                && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getVideoMetadata() == null ^ this.getVideoMetadata() == null)
            return false;
        if (other.getVideoMetadata() != null
                && other.getVideoMetadata().equals(this.getVideoMetadata()) == false)
            return false;
        if (other.getPersons() == null ^ this.getPersons() == null)
            return false;
        if (other.getPersons() != null && other.getPersons().equals(this.getPersons()) == false)
            return false;
        return true;
    }
}
