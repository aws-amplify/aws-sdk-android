/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class GetPersonTrackingResult implements Serializable {
    /**
     * <p>
     * The current status of the person tracking job.
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
     * Information about a video that Amazon Rekognition Video analyzed.
     * <code>Videometadata</code> is returned in every page of paginated
     * responses from a Amazon Rekognition Video operation.
     * </p>
     */
    private VideoMetadata videoMetadata;

    /**
     * <p>
     * If the response is truncated, Amazon Rekognition Video returns this token
     * that you can use in the subsequent request to retrieve the next set of
     * persons.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String nextToken;

    /**
     * <p>
     * An array of the persons detected in the video and the time(s) their path
     * was tracked throughout the video. An array element will exist for each
     * time a person's path is tracked.
     * </p>
     */
    private java.util.List<PersonDetection> persons;

    /**
     * <p>
     * Job identifier for the person tracking operation for which you want to
     * obtain results. The job identifer is returned by an initial call to
     * StartPersonTracking.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     */
    private String jobId;

    /**
     * <p>
     * Video file stored in an Amazon S3 bucket. Amazon Rekognition video start
     * operations such as <a>StartLabelDetection</a> use <code>Video</code> to
     * specify a video for analysis. The supported file formats are .mp4, .mov
     * and .avi.
     * </p>
     */
    private Video video;

    /**
     * <p>
     * A job identifier specified in the call to StartCelebrityRecognition and
     * returned in the job completion notification sent to your Amazon Simple
     * Notification Service topic.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-:+=\/]+<br/>
     */
    private String jobTag;

    /**
     * <p>
     * The current status of the person tracking job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, SUCCEEDED, FAILED
     *
     * @return <p>
     *         The current status of the person tracking job.
     *         </p>
     * @see VideoJobStatus
     */
    public String getJobStatus() {
        return jobStatus;
    }

    /**
     * <p>
     * The current status of the person tracking job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, SUCCEEDED, FAILED
     *
     * @param jobStatus <p>
     *            The current status of the person tracking job.
     *            </p>
     * @see VideoJobStatus
     */
    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * <p>
     * The current status of the person tracking job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, SUCCEEDED, FAILED
     *
     * @param jobStatus <p>
     *            The current status of the person tracking job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VideoJobStatus
     */
    public GetPersonTrackingResult withJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }

    /**
     * <p>
     * The current status of the person tracking job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, SUCCEEDED, FAILED
     *
     * @param jobStatus <p>
     *            The current status of the person tracking job.
     *            </p>
     * @see VideoJobStatus
     */
    public void setJobStatus(VideoJobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
    }

    /**
     * <p>
     * The current status of the person tracking job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, SUCCEEDED, FAILED
     *
     * @param jobStatus <p>
     *            The current status of the person tracking job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VideoJobStatus
     */
    public GetPersonTrackingResult withJobStatus(VideoJobStatus jobStatus) {
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
    public GetPersonTrackingResult withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    /**
     * <p>
     * Information about a video that Amazon Rekognition Video analyzed.
     * <code>Videometadata</code> is returned in every page of paginated
     * responses from a Amazon Rekognition Video operation.
     * </p>
     *
     * @return <p>
     *         Information about a video that Amazon Rekognition Video analyzed.
     *         <code>Videometadata</code> is returned in every page of paginated
     *         responses from a Amazon Rekognition Video operation.
     *         </p>
     */
    public VideoMetadata getVideoMetadata() {
        return videoMetadata;
    }

    /**
     * <p>
     * Information about a video that Amazon Rekognition Video analyzed.
     * <code>Videometadata</code> is returned in every page of paginated
     * responses from a Amazon Rekognition Video operation.
     * </p>
     *
     * @param videoMetadata <p>
     *            Information about a video that Amazon Rekognition Video
     *            analyzed. <code>Videometadata</code> is returned in every page
     *            of paginated responses from a Amazon Rekognition Video
     *            operation.
     *            </p>
     */
    public void setVideoMetadata(VideoMetadata videoMetadata) {
        this.videoMetadata = videoMetadata;
    }

    /**
     * <p>
     * Information about a video that Amazon Rekognition Video analyzed.
     * <code>Videometadata</code> is returned in every page of paginated
     * responses from a Amazon Rekognition Video operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param videoMetadata <p>
     *            Information about a video that Amazon Rekognition Video
     *            analyzed. <code>Videometadata</code> is returned in every page
     *            of paginated responses from a Amazon Rekognition Video
     *            operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPersonTrackingResult withVideoMetadata(VideoMetadata videoMetadata) {
        this.videoMetadata = videoMetadata;
        return this;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Rekognition Video returns this token
     * that you can use in the subsequent request to retrieve the next set of
     * persons.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         If the response is truncated, Amazon Rekognition Video returns
     *         this token that you can use in the subsequent request to retrieve
     *         the next set of persons.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Rekognition Video returns this token
     * that you can use in the subsequent request to retrieve the next set of
     * persons.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param nextToken <p>
     *            If the response is truncated, Amazon Rekognition Video returns
     *            this token that you can use in the subsequent request to
     *            retrieve the next set of persons.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Rekognition Video returns this token
     * that you can use in the subsequent request to retrieve the next set of
     * persons.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param nextToken <p>
     *            If the response is truncated, Amazon Rekognition Video returns
     *            this token that you can use in the subsequent request to
     *            retrieve the next set of persons.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPersonTrackingResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * An array of the persons detected in the video and the time(s) their path
     * was tracked throughout the video. An array element will exist for each
     * time a person's path is tracked.
     * </p>
     *
     * @return <p>
     *         An array of the persons detected in the video and the time(s)
     *         their path was tracked throughout the video. An array element
     *         will exist for each time a person's path is tracked.
     *         </p>
     */
    public java.util.List<PersonDetection> getPersons() {
        return persons;
    }

    /**
     * <p>
     * An array of the persons detected in the video and the time(s) their path
     * was tracked throughout the video. An array element will exist for each
     * time a person's path is tracked.
     * </p>
     *
     * @param persons <p>
     *            An array of the persons detected in the video and the time(s)
     *            their path was tracked throughout the video. An array element
     *            will exist for each time a person's path is tracked.
     *            </p>
     */
    public void setPersons(java.util.Collection<PersonDetection> persons) {
        if (persons == null) {
            this.persons = null;
            return;
        }

        this.persons = new java.util.ArrayList<PersonDetection>(persons);
    }

    /**
     * <p>
     * An array of the persons detected in the video and the time(s) their path
     * was tracked throughout the video. An array element will exist for each
     * time a person's path is tracked.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param persons <p>
     *            An array of the persons detected in the video and the time(s)
     *            their path was tracked throughout the video. An array element
     *            will exist for each time a person's path is tracked.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPersonTrackingResult withPersons(PersonDetection... persons) {
        if (getPersons() == null) {
            this.persons = new java.util.ArrayList<PersonDetection>(persons.length);
        }
        for (PersonDetection value : persons) {
            this.persons.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of the persons detected in the video and the time(s) their path
     * was tracked throughout the video. An array element will exist for each
     * time a person's path is tracked.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param persons <p>
     *            An array of the persons detected in the video and the time(s)
     *            their path was tracked throughout the video. An array element
     *            will exist for each time a person's path is tracked.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPersonTrackingResult withPersons(java.util.Collection<PersonDetection> persons) {
        setPersons(persons);
        return this;
    }

    /**
     * <p>
     * Job identifier for the person tracking operation for which you want to
     * obtain results. The job identifer is returned by an initial call to
     * StartPersonTracking.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @return <p>
     *         Job identifier for the person tracking operation for which you
     *         want to obtain results. The job identifer is returned by an
     *         initial call to StartPersonTracking.
     *         </p>
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * <p>
     * Job identifier for the person tracking operation for which you want to
     * obtain results. The job identifer is returned by an initial call to
     * StartPersonTracking.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @param jobId <p>
     *            Job identifier for the person tracking operation for which you
     *            want to obtain results. The job identifer is returned by an
     *            initial call to StartPersonTracking.
     *            </p>
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * Job identifier for the person tracking operation for which you want to
     * obtain results. The job identifer is returned by an initial call to
     * StartPersonTracking.
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
     *            Job identifier for the person tracking operation for which you
     *            want to obtain results. The job identifer is returned by an
     *            initial call to StartPersonTracking.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPersonTrackingResult withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * <p>
     * Video file stored in an Amazon S3 bucket. Amazon Rekognition video start
     * operations such as <a>StartLabelDetection</a> use <code>Video</code> to
     * specify a video for analysis. The supported file formats are .mp4, .mov
     * and .avi.
     * </p>
     *
     * @return <p>
     *         Video file stored in an Amazon S3 bucket. Amazon Rekognition
     *         video start operations such as <a>StartLabelDetection</a> use
     *         <code>Video</code> to specify a video for analysis. The supported
     *         file formats are .mp4, .mov and .avi.
     *         </p>
     */
    public Video getVideo() {
        return video;
    }

    /**
     * <p>
     * Video file stored in an Amazon S3 bucket. Amazon Rekognition video start
     * operations such as <a>StartLabelDetection</a> use <code>Video</code> to
     * specify a video for analysis. The supported file formats are .mp4, .mov
     * and .avi.
     * </p>
     *
     * @param video <p>
     *            Video file stored in an Amazon S3 bucket. Amazon Rekognition
     *            video start operations such as <a>StartLabelDetection</a> use
     *            <code>Video</code> to specify a video for analysis. The
     *            supported file formats are .mp4, .mov and .avi.
     *            </p>
     */
    public void setVideo(Video video) {
        this.video = video;
    }

    /**
     * <p>
     * Video file stored in an Amazon S3 bucket. Amazon Rekognition video start
     * operations such as <a>StartLabelDetection</a> use <code>Video</code> to
     * specify a video for analysis. The supported file formats are .mp4, .mov
     * and .avi.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param video <p>
     *            Video file stored in an Amazon S3 bucket. Amazon Rekognition
     *            video start operations such as <a>StartLabelDetection</a> use
     *            <code>Video</code> to specify a video for analysis. The
     *            supported file formats are .mp4, .mov and .avi.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPersonTrackingResult withVideo(Video video) {
        this.video = video;
        return this;
    }

    /**
     * <p>
     * A job identifier specified in the call to StartCelebrityRecognition and
     * returned in the job completion notification sent to your Amazon Simple
     * Notification Service topic.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-:+=\/]+<br/>
     *
     * @return <p>
     *         A job identifier specified in the call to
     *         StartCelebrityRecognition and returned in the job completion
     *         notification sent to your Amazon Simple Notification Service
     *         topic.
     *         </p>
     */
    public String getJobTag() {
        return jobTag;
    }

    /**
     * <p>
     * A job identifier specified in the call to StartCelebrityRecognition and
     * returned in the job completion notification sent to your Amazon Simple
     * Notification Service topic.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-:+=\/]+<br/>
     *
     * @param jobTag <p>
     *            A job identifier specified in the call to
     *            StartCelebrityRecognition and returned in the job completion
     *            notification sent to your Amazon Simple Notification Service
     *            topic.
     *            </p>
     */
    public void setJobTag(String jobTag) {
        this.jobTag = jobTag;
    }

    /**
     * <p>
     * A job identifier specified in the call to StartCelebrityRecognition and
     * returned in the job completion notification sent to your Amazon Simple
     * Notification Service topic.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-:+=\/]+<br/>
     *
     * @param jobTag <p>
     *            A job identifier specified in the call to
     *            StartCelebrityRecognition and returned in the job completion
     *            notification sent to your Amazon Simple Notification Service
     *            topic.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPersonTrackingResult withJobTag(String jobTag) {
        this.jobTag = jobTag;
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
        if (getVideoMetadata() != null)
            sb.append("VideoMetadata: " + getVideoMetadata() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getPersons() != null)
            sb.append("Persons: " + getPersons() + ",");
        if (getJobId() != null)
            sb.append("JobId: " + getJobId() + ",");
        if (getVideo() != null)
            sb.append("Video: " + getVideo() + ",");
        if (getJobTag() != null)
            sb.append("JobTag: " + getJobTag());
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
        hashCode = prime * hashCode
                + ((getVideoMetadata() == null) ? 0 : getVideoMetadata().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getPersons() == null) ? 0 : getPersons().hashCode());
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getVideo() == null) ? 0 : getVideo().hashCode());
        hashCode = prime * hashCode + ((getJobTag() == null) ? 0 : getJobTag().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPersonTrackingResult == false)
            return false;
        GetPersonTrackingResult other = (GetPersonTrackingResult) obj;

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
        if (other.getVideoMetadata() == null ^ this.getVideoMetadata() == null)
            return false;
        if (other.getVideoMetadata() != null
                && other.getVideoMetadata().equals(this.getVideoMetadata()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getPersons() == null ^ this.getPersons() == null)
            return false;
        if (other.getPersons() != null && other.getPersons().equals(this.getPersons()) == false)
            return false;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getVideo() == null ^ this.getVideo() == null)
            return false;
        if (other.getVideo() != null && other.getVideo().equals(this.getVideo()) == false)
            return false;
        if (other.getJobTag() == null ^ this.getJobTag() == null)
            return false;
        if (other.getJobTag() != null && other.getJobTag().equals(this.getJobTag()) == false)
            return false;
        return true;
    }
}
