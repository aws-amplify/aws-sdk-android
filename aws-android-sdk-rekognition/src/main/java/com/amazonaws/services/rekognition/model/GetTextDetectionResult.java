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

package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

public class GetTextDetectionResult implements Serializable {
    /**
     * <p>
     * Current status of the text detection job.
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
     * Information about a video that Amazon Rekognition analyzed.
     * <code>Videometadata</code> is returned in every page of paginated
     * responses from a Amazon Rekognition video operation.
     * </p>
     */
    private VideoMetadata videoMetadata;

    /**
     * <p>
     * An array of text detected in the video. Each element contains the
     * detected text, the time in milliseconds from the start of the video that
     * the text was detected, and where it was detected on the screen.
     * </p>
     */
    private java.util.List<TextDetectionResult> textDetections;

    /**
     * <p>
     * If the response is truncated, Amazon Rekognition Video returns this token
     * that you can use in the subsequent request to retrieve the next set of
     * text.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String nextToken;

    /**
     * <p>
     * Version number of the text detection model that was used to detect text.
     * </p>
     */
    private String textModelVersion;

    /**
     * <p>
     * Current status of the text detection job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, SUCCEEDED, FAILED
     *
     * @return <p>
     *         Current status of the text detection job.
     *         </p>
     * @see VideoJobStatus
     */
    public String getJobStatus() {
        return jobStatus;
    }

    /**
     * <p>
     * Current status of the text detection job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, SUCCEEDED, FAILED
     *
     * @param jobStatus <p>
     *            Current status of the text detection job.
     *            </p>
     * @see VideoJobStatus
     */
    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * <p>
     * Current status of the text detection job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, SUCCEEDED, FAILED
     *
     * @param jobStatus <p>
     *            Current status of the text detection job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VideoJobStatus
     */
    public GetTextDetectionResult withJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }

    /**
     * <p>
     * Current status of the text detection job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, SUCCEEDED, FAILED
     *
     * @param jobStatus <p>
     *            Current status of the text detection job.
     *            </p>
     * @see VideoJobStatus
     */
    public void setJobStatus(VideoJobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
    }

    /**
     * <p>
     * Current status of the text detection job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, SUCCEEDED, FAILED
     *
     * @param jobStatus <p>
     *            Current status of the text detection job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VideoJobStatus
     */
    public GetTextDetectionResult withJobStatus(VideoJobStatus jobStatus) {
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
    public GetTextDetectionResult withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    /**
     * <p>
     * Information about a video that Amazon Rekognition analyzed.
     * <code>Videometadata</code> is returned in every page of paginated
     * responses from a Amazon Rekognition video operation.
     * </p>
     *
     * @return <p>
     *         Information about a video that Amazon Rekognition analyzed.
     *         <code>Videometadata</code> is returned in every page of paginated
     *         responses from a Amazon Rekognition video operation.
     *         </p>
     */
    public VideoMetadata getVideoMetadata() {
        return videoMetadata;
    }

    /**
     * <p>
     * Information about a video that Amazon Rekognition analyzed.
     * <code>Videometadata</code> is returned in every page of paginated
     * responses from a Amazon Rekognition video operation.
     * </p>
     *
     * @param videoMetadata <p>
     *            Information about a video that Amazon Rekognition analyzed.
     *            <code>Videometadata</code> is returned in every page of
     *            paginated responses from a Amazon Rekognition video operation.
     *            </p>
     */
    public void setVideoMetadata(VideoMetadata videoMetadata) {
        this.videoMetadata = videoMetadata;
    }

    /**
     * <p>
     * Information about a video that Amazon Rekognition analyzed.
     * <code>Videometadata</code> is returned in every page of paginated
     * responses from a Amazon Rekognition video operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param videoMetadata <p>
     *            Information about a video that Amazon Rekognition analyzed.
     *            <code>Videometadata</code> is returned in every page of
     *            paginated responses from a Amazon Rekognition video operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetTextDetectionResult withVideoMetadata(VideoMetadata videoMetadata) {
        this.videoMetadata = videoMetadata;
        return this;
    }

    /**
     * <p>
     * An array of text detected in the video. Each element contains the
     * detected text, the time in milliseconds from the start of the video that
     * the text was detected, and where it was detected on the screen.
     * </p>
     *
     * @return <p>
     *         An array of text detected in the video. Each element contains the
     *         detected text, the time in milliseconds from the start of the
     *         video that the text was detected, and where it was detected on
     *         the screen.
     *         </p>
     */
    public java.util.List<TextDetectionResult> getTextDetections() {
        return textDetections;
    }

    /**
     * <p>
     * An array of text detected in the video. Each element contains the
     * detected text, the time in milliseconds from the start of the video that
     * the text was detected, and where it was detected on the screen.
     * </p>
     *
     * @param textDetections <p>
     *            An array of text detected in the video. Each element contains
     *            the detected text, the time in milliseconds from the start of
     *            the video that the text was detected, and where it was
     *            detected on the screen.
     *            </p>
     */
    public void setTextDetections(java.util.Collection<TextDetectionResult> textDetections) {
        if (textDetections == null) {
            this.textDetections = null;
            return;
        }

        this.textDetections = new java.util.ArrayList<TextDetectionResult>(textDetections);
    }

    /**
     * <p>
     * An array of text detected in the video. Each element contains the
     * detected text, the time in milliseconds from the start of the video that
     * the text was detected, and where it was detected on the screen.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param textDetections <p>
     *            An array of text detected in the video. Each element contains
     *            the detected text, the time in milliseconds from the start of
     *            the video that the text was detected, and where it was
     *            detected on the screen.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetTextDetectionResult withTextDetections(TextDetectionResult... textDetections) {
        if (getTextDetections() == null) {
            this.textDetections = new java.util.ArrayList<TextDetectionResult>(
                    textDetections.length);
        }
        for (TextDetectionResult value : textDetections) {
            this.textDetections.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of text detected in the video. Each element contains the
     * detected text, the time in milliseconds from the start of the video that
     * the text was detected, and where it was detected on the screen.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param textDetections <p>
     *            An array of text detected in the video. Each element contains
     *            the detected text, the time in milliseconds from the start of
     *            the video that the text was detected, and where it was
     *            detected on the screen.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetTextDetectionResult withTextDetections(
            java.util.Collection<TextDetectionResult> textDetections) {
        setTextDetections(textDetections);
        return this;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Rekognition Video returns this token
     * that you can use in the subsequent request to retrieve the next set of
     * text.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         If the response is truncated, Amazon Rekognition Video returns
     *         this token that you can use in the subsequent request to retrieve
     *         the next set of text.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Rekognition Video returns this token
     * that you can use in the subsequent request to retrieve the next set of
     * text.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param nextToken <p>
     *            If the response is truncated, Amazon Rekognition Video returns
     *            this token that you can use in the subsequent request to
     *            retrieve the next set of text.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon Rekognition Video returns this token
     * that you can use in the subsequent request to retrieve the next set of
     * text.
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
     *            retrieve the next set of text.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetTextDetectionResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * Version number of the text detection model that was used to detect text.
     * </p>
     *
     * @return <p>
     *         Version number of the text detection model that was used to
     *         detect text.
     *         </p>
     */
    public String getTextModelVersion() {
        return textModelVersion;
    }

    /**
     * <p>
     * Version number of the text detection model that was used to detect text.
     * </p>
     *
     * @param textModelVersion <p>
     *            Version number of the text detection model that was used to
     *            detect text.
     *            </p>
     */
    public void setTextModelVersion(String textModelVersion) {
        this.textModelVersion = textModelVersion;
    }

    /**
     * <p>
     * Version number of the text detection model that was used to detect text.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param textModelVersion <p>
     *            Version number of the text detection model that was used to
     *            detect text.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetTextDetectionResult withTextModelVersion(String textModelVersion) {
        this.textModelVersion = textModelVersion;
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
        if (getTextDetections() != null)
            sb.append("TextDetections: " + getTextDetections() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getTextModelVersion() != null)
            sb.append("TextModelVersion: " + getTextModelVersion());
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
        hashCode = prime * hashCode
                + ((getTextDetections() == null) ? 0 : getTextDetections().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getTextModelVersion() == null) ? 0 : getTextModelVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTextDetectionResult == false)
            return false;
        GetTextDetectionResult other = (GetTextDetectionResult) obj;

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
        if (other.getTextDetections() == null ^ this.getTextDetections() == null)
            return false;
        if (other.getTextDetections() != null
                && other.getTextDetections().equals(this.getTextDetections()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getTextModelVersion() == null ^ this.getTextModelVersion() == null)
            return false;
        if (other.getTextModelVersion() != null
                && other.getTextModelVersion().equals(this.getTextModelVersion()) == false)
            return false;
        return true;
    }
}
