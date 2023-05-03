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

public class GetLabelDetectionResult implements Serializable {
    /**
     * <p>
     * The current status of the label detection job.
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
     * responses from a Amazon Rekognition video operation.
     * </p>
     */
    private VideoMetadata videoMetadata;

    /**
     * <p>
     * If the response is truncated, Amazon Rekognition Video returns this token
     * that you can use in the subsequent request to retrieve the next set of
     * labels.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String nextToken;

    /**
     * <p>
     * An array of labels detected in the video. Each element contains the
     * detected label and the time, in milliseconds from the start of the video,
     * that the label was detected.
     * </p>
     */
    private java.util.List<LabelDetection> labels;

    /**
     * <p>
     * Version number of the label detection model that was used to detect
     * labels.
     * </p>
     */
    private String labelModelVersion;

    /**
     * <p>
     * Job identifier for the label detection operation for which you want to
     * obtain results. The job identifer is returned by an initial call to
     * StartLabelDetection.
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
     * A job identifier specified in the call to StartLabelDetection and
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
     * Information about the paramters used when getting a response. Includes
     * information on aggregation and sorting methods.
     * </p>
     */
    private GetLabelDetectionRequestMetadata getRequestMetadata;

    /**
     * <p>
     * The current status of the label detection job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, SUCCEEDED, FAILED
     *
     * @return <p>
     *         The current status of the label detection job.
     *         </p>
     * @see VideoJobStatus
     */
    public String getJobStatus() {
        return jobStatus;
    }

    /**
     * <p>
     * The current status of the label detection job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, SUCCEEDED, FAILED
     *
     * @param jobStatus <p>
     *            The current status of the label detection job.
     *            </p>
     * @see VideoJobStatus
     */
    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * <p>
     * The current status of the label detection job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, SUCCEEDED, FAILED
     *
     * @param jobStatus <p>
     *            The current status of the label detection job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VideoJobStatus
     */
    public GetLabelDetectionResult withJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }

    /**
     * <p>
     * The current status of the label detection job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, SUCCEEDED, FAILED
     *
     * @param jobStatus <p>
     *            The current status of the label detection job.
     *            </p>
     * @see VideoJobStatus
     */
    public void setJobStatus(VideoJobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
    }

    /**
     * <p>
     * The current status of the label detection job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, SUCCEEDED, FAILED
     *
     * @param jobStatus <p>
     *            The current status of the label detection job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VideoJobStatus
     */
    public GetLabelDetectionResult withJobStatus(VideoJobStatus jobStatus) {
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
    public GetLabelDetectionResult withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    /**
     * <p>
     * Information about a video that Amazon Rekognition Video analyzed.
     * <code>Videometadata</code> is returned in every page of paginated
     * responses from a Amazon Rekognition video operation.
     * </p>
     *
     * @return <p>
     *         Information about a video that Amazon Rekognition Video analyzed.
     *         <code>Videometadata</code> is returned in every page of paginated
     *         responses from a Amazon Rekognition video operation.
     *         </p>
     */
    public VideoMetadata getVideoMetadata() {
        return videoMetadata;
    }

    /**
     * <p>
     * Information about a video that Amazon Rekognition Video analyzed.
     * <code>Videometadata</code> is returned in every page of paginated
     * responses from a Amazon Rekognition video operation.
     * </p>
     *
     * @param videoMetadata <p>
     *            Information about a video that Amazon Rekognition Video
     *            analyzed. <code>Videometadata</code> is returned in every page
     *            of paginated responses from a Amazon Rekognition video
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
     * responses from a Amazon Rekognition video operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param videoMetadata <p>
     *            Information about a video that Amazon Rekognition Video
     *            analyzed. <code>Videometadata</code> is returned in every page
     *            of paginated responses from a Amazon Rekognition video
     *            operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetLabelDetectionResult withVideoMetadata(VideoMetadata videoMetadata) {
        this.videoMetadata = videoMetadata;
        return this;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Rekognition Video returns this token
     * that you can use in the subsequent request to retrieve the next set of
     * labels.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         If the response is truncated, Amazon Rekognition Video returns
     *         this token that you can use in the subsequent request to retrieve
     *         the next set of labels.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Rekognition Video returns this token
     * that you can use in the subsequent request to retrieve the next set of
     * labels.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param nextToken <p>
     *            If the response is truncated, Amazon Rekognition Video returns
     *            this token that you can use in the subsequent request to
     *            retrieve the next set of labels.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Rekognition Video returns this token
     * that you can use in the subsequent request to retrieve the next set of
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
     *            If the response is truncated, Amazon Rekognition Video returns
     *            this token that you can use in the subsequent request to
     *            retrieve the next set of labels.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetLabelDetectionResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * An array of labels detected in the video. Each element contains the
     * detected label and the time, in milliseconds from the start of the video,
     * that the label was detected.
     * </p>
     *
     * @return <p>
     *         An array of labels detected in the video. Each element contains
     *         the detected label and the time, in milliseconds from the start
     *         of the video, that the label was detected.
     *         </p>
     */
    public java.util.List<LabelDetection> getLabels() {
        return labels;
    }

    /**
     * <p>
     * An array of labels detected in the video. Each element contains the
     * detected label and the time, in milliseconds from the start of the video,
     * that the label was detected.
     * </p>
     *
     * @param labels <p>
     *            An array of labels detected in the video. Each element
     *            contains the detected label and the time, in milliseconds from
     *            the start of the video, that the label was detected.
     *            </p>
     */
    public void setLabels(java.util.Collection<LabelDetection> labels) {
        if (labels == null) {
            this.labels = null;
            return;
        }

        this.labels = new java.util.ArrayList<LabelDetection>(labels);
    }

    /**
     * <p>
     * An array of labels detected in the video. Each element contains the
     * detected label and the time, in milliseconds from the start of the video,
     * that the label was detected.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param labels <p>
     *            An array of labels detected in the video. Each element
     *            contains the detected label and the time, in milliseconds from
     *            the start of the video, that the label was detected.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetLabelDetectionResult withLabels(LabelDetection... labels) {
        if (getLabels() == null) {
            this.labels = new java.util.ArrayList<LabelDetection>(labels.length);
        }
        for (LabelDetection value : labels) {
            this.labels.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of labels detected in the video. Each element contains the
     * detected label and the time, in milliseconds from the start of the video,
     * that the label was detected.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param labels <p>
     *            An array of labels detected in the video. Each element
     *            contains the detected label and the time, in milliseconds from
     *            the start of the video, that the label was detected.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetLabelDetectionResult withLabels(java.util.Collection<LabelDetection> labels) {
        setLabels(labels);
        return this;
    }

    /**
     * <p>
     * Version number of the label detection model that was used to detect
     * labels.
     * </p>
     *
     * @return <p>
     *         Version number of the label detection model that was used to
     *         detect labels.
     *         </p>
     */
    public String getLabelModelVersion() {
        return labelModelVersion;
    }

    /**
     * <p>
     * Version number of the label detection model that was used to detect
     * labels.
     * </p>
     *
     * @param labelModelVersion <p>
     *            Version number of the label detection model that was used to
     *            detect labels.
     *            </p>
     */
    public void setLabelModelVersion(String labelModelVersion) {
        this.labelModelVersion = labelModelVersion;
    }

    /**
     * <p>
     * Version number of the label detection model that was used to detect
     * labels.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param labelModelVersion <p>
     *            Version number of the label detection model that was used to
     *            detect labels.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetLabelDetectionResult withLabelModelVersion(String labelModelVersion) {
        this.labelModelVersion = labelModelVersion;
        return this;
    }

    /**
     * <p>
     * Job identifier for the label detection operation for which you want to
     * obtain results. The job identifer is returned by an initial call to
     * StartLabelDetection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @return <p>
     *         Job identifier for the label detection operation for which you
     *         want to obtain results. The job identifer is returned by an
     *         initial call to StartLabelDetection.
     *         </p>
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * <p>
     * Job identifier for the label detection operation for which you want to
     * obtain results. The job identifer is returned by an initial call to
     * StartLabelDetection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @param jobId <p>
     *            Job identifier for the label detection operation for which you
     *            want to obtain results. The job identifer is returned by an
     *            initial call to StartLabelDetection.
     *            </p>
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * Job identifier for the label detection operation for which you want to
     * obtain results. The job identifer is returned by an initial call to
     * StartLabelDetection.
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
     *            want to obtain results. The job identifer is returned by an
     *            initial call to StartLabelDetection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetLabelDetectionResult withJobId(String jobId) {
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
    public GetLabelDetectionResult withVideo(Video video) {
        this.video = video;
        return this;
    }

    /**
     * <p>
     * A job identifier specified in the call to StartLabelDetection and
     * returned in the job completion notification sent to your Amazon Simple
     * Notification Service topic.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-:+=\/]+<br/>
     *
     * @return <p>
     *         A job identifier specified in the call to StartLabelDetection and
     *         returned in the job completion notification sent to your Amazon
     *         Simple Notification Service topic.
     *         </p>
     */
    public String getJobTag() {
        return jobTag;
    }

    /**
     * <p>
     * A job identifier specified in the call to StartLabelDetection and
     * returned in the job completion notification sent to your Amazon Simple
     * Notification Service topic.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-:+=\/]+<br/>
     *
     * @param jobTag <p>
     *            A job identifier specified in the call to StartLabelDetection
     *            and returned in the job completion notification sent to your
     *            Amazon Simple Notification Service topic.
     *            </p>
     */
    public void setJobTag(String jobTag) {
        this.jobTag = jobTag;
    }

    /**
     * <p>
     * A job identifier specified in the call to StartLabelDetection and
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
     *            A job identifier specified in the call to StartLabelDetection
     *            and returned in the job completion notification sent to your
     *            Amazon Simple Notification Service topic.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetLabelDetectionResult withJobTag(String jobTag) {
        this.jobTag = jobTag;
        return this;
    }

    /**
     * <p>
     * Information about the paramters used when getting a response. Includes
     * information on aggregation and sorting methods.
     * </p>
     *
     * @return <p>
     *         Information about the paramters used when getting a response.
     *         Includes information on aggregation and sorting methods.
     *         </p>
     */
    public GetLabelDetectionRequestMetadata getGetRequestMetadata() {
        return getRequestMetadata;
    }

    /**
     * <p>
     * Information about the paramters used when getting a response. Includes
     * information on aggregation and sorting methods.
     * </p>
     *
     * @param getRequestMetadata <p>
     *            Information about the paramters used when getting a response.
     *            Includes information on aggregation and sorting methods.
     *            </p>
     */
    public void setGetRequestMetadata(GetLabelDetectionRequestMetadata getRequestMetadata) {
        this.getRequestMetadata = getRequestMetadata;
    }

    /**
     * <p>
     * Information about the paramters used when getting a response. Includes
     * information on aggregation and sorting methods.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param getRequestMetadata <p>
     *            Information about the paramters used when getting a response.
     *            Includes information on aggregation and sorting methods.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetLabelDetectionResult withGetRequestMetadata(
            GetLabelDetectionRequestMetadata getRequestMetadata) {
        this.getRequestMetadata = getRequestMetadata;
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
        if (getLabels() != null)
            sb.append("Labels: " + getLabels() + ",");
        if (getLabelModelVersion() != null)
            sb.append("LabelModelVersion: " + getLabelModelVersion() + ",");
        if (getJobId() != null)
            sb.append("JobId: " + getJobId() + ",");
        if (getVideo() != null)
            sb.append("Video: " + getVideo() + ",");
        if (getJobTag() != null)
            sb.append("JobTag: " + getJobTag() + ",");
        if (getGetRequestMetadata() != null)
            sb.append("GetRequestMetadata: " + getGetRequestMetadata());
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
        hashCode = prime * hashCode + ((getLabels() == null) ? 0 : getLabels().hashCode());
        hashCode = prime * hashCode
                + ((getLabelModelVersion() == null) ? 0 : getLabelModelVersion().hashCode());
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getVideo() == null) ? 0 : getVideo().hashCode());
        hashCode = prime * hashCode + ((getJobTag() == null) ? 0 : getJobTag().hashCode());
        hashCode = prime * hashCode
                + ((getGetRequestMetadata() == null) ? 0 : getGetRequestMetadata().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetLabelDetectionResult == false)
            return false;
        GetLabelDetectionResult other = (GetLabelDetectionResult) obj;

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
        if (other.getLabels() == null ^ this.getLabels() == null)
            return false;
        if (other.getLabels() != null && other.getLabels().equals(this.getLabels()) == false)
            return false;
        if (other.getLabelModelVersion() == null ^ this.getLabelModelVersion() == null)
            return false;
        if (other.getLabelModelVersion() != null
                && other.getLabelModelVersion().equals(this.getLabelModelVersion()) == false)
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
        if (other.getGetRequestMetadata() == null ^ this.getGetRequestMetadata() == null)
            return false;
        if (other.getGetRequestMetadata() != null
                && other.getGetRequestMetadata().equals(this.getGetRequestMetadata()) == false)
            return false;
        return true;
    }
}
