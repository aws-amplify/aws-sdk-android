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

public class GetSegmentDetectionResult implements Serializable {
    /**
     * <p>
     * Current status of the segment detection job.
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
     * Currently, Amazon Rekognition Video returns a single object in the
     * <code>VideoMetadata</code> array. The object contains information about
     * the video stream in the input file that Amazon Rekognition Video chose to
     * analyze. The <code>VideoMetadata</code> object includes the video codec,
     * video format and other information. Video metadata is returned in each
     * page of information returned by <code>GetSegmentDetection</code>.
     * </p>
     */
    private java.util.List<VideoMetadata> videoMetadata;

    /**
     * <p>
     * An array of objects. There can be multiple audio streams. Each
     * <code>AudioMetadata</code> object contains metadata for a single audio
     * stream. Audio information in an <code>AudioMetadata</code> objects
     * includes the audio codec, the number of audio channels, the duration of
     * the audio stream, and the sample rate. Audio metadata is returned in each
     * page of information returned by <code>GetSegmentDetection</code>.
     * </p>
     */
    private java.util.List<AudioMetadata> audioMetadata;

    /**
     * <p>
     * If the previous response was incomplete (because there are more labels to
     * retrieve), Amazon Rekognition Video returns a pagination token in the
     * response. You can use this pagination token to retrieve the next set of
     * text.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String nextToken;

    /**
     * <p>
     * An array of segments detected in a video. The array is sorted by the
     * segment types (TECHNICAL_CUE or SHOT) specified in the
     * <code>SegmentTypes</code> input parameter of
     * <code>StartSegmentDetection</code>. Within each segment type the array is
     * sorted by timestamp values.
     * </p>
     */
    private java.util.List<SegmentDetection> segments;

    /**
     * <p>
     * An array containing the segment types requested in the call to
     * <code>StartSegmentDetection</code>.
     * </p>
     */
    private java.util.List<SegmentTypeInfo> selectedSegmentTypes;

    /**
     * <p>
     * Current status of the segment detection job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, SUCCEEDED, FAILED
     *
     * @return <p>
     *         Current status of the segment detection job.
     *         </p>
     * @see VideoJobStatus
     */
    public String getJobStatus() {
        return jobStatus;
    }

    /**
     * <p>
     * Current status of the segment detection job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, SUCCEEDED, FAILED
     *
     * @param jobStatus <p>
     *            Current status of the segment detection job.
     *            </p>
     * @see VideoJobStatus
     */
    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * <p>
     * Current status of the segment detection job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, SUCCEEDED, FAILED
     *
     * @param jobStatus <p>
     *            Current status of the segment detection job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VideoJobStatus
     */
    public GetSegmentDetectionResult withJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }

    /**
     * <p>
     * Current status of the segment detection job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, SUCCEEDED, FAILED
     *
     * @param jobStatus <p>
     *            Current status of the segment detection job.
     *            </p>
     * @see VideoJobStatus
     */
    public void setJobStatus(VideoJobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
    }

    /**
     * <p>
     * Current status of the segment detection job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, SUCCEEDED, FAILED
     *
     * @param jobStatus <p>
     *            Current status of the segment detection job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VideoJobStatus
     */
    public GetSegmentDetectionResult withJobStatus(VideoJobStatus jobStatus) {
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
    public GetSegmentDetectionResult withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    /**
     * <p>
     * Currently, Amazon Rekognition Video returns a single object in the
     * <code>VideoMetadata</code> array. The object contains information about
     * the video stream in the input file that Amazon Rekognition Video chose to
     * analyze. The <code>VideoMetadata</code> object includes the video codec,
     * video format and other information. Video metadata is returned in each
     * page of information returned by <code>GetSegmentDetection</code>.
     * </p>
     *
     * @return <p>
     *         Currently, Amazon Rekognition Video returns a single object in
     *         the <code>VideoMetadata</code> array. The object contains
     *         information about the video stream in the input file that Amazon
     *         Rekognition Video chose to analyze. The
     *         <code>VideoMetadata</code> object includes the video codec, video
     *         format and other information. Video metadata is returned in each
     *         page of information returned by <code>GetSegmentDetection</code>.
     *         </p>
     */
    public java.util.List<VideoMetadata> getVideoMetadata() {
        return videoMetadata;
    }

    /**
     * <p>
     * Currently, Amazon Rekognition Video returns a single object in the
     * <code>VideoMetadata</code> array. The object contains information about
     * the video stream in the input file that Amazon Rekognition Video chose to
     * analyze. The <code>VideoMetadata</code> object includes the video codec,
     * video format and other information. Video metadata is returned in each
     * page of information returned by <code>GetSegmentDetection</code>.
     * </p>
     *
     * @param videoMetadata <p>
     *            Currently, Amazon Rekognition Video returns a single object in
     *            the <code>VideoMetadata</code> array. The object contains
     *            information about the video stream in the input file that
     *            Amazon Rekognition Video chose to analyze. The
     *            <code>VideoMetadata</code> object includes the video codec,
     *            video format and other information. Video metadata is returned
     *            in each page of information returned by
     *            <code>GetSegmentDetection</code>.
     *            </p>
     */
    public void setVideoMetadata(java.util.Collection<VideoMetadata> videoMetadata) {
        if (videoMetadata == null) {
            this.videoMetadata = null;
            return;
        }

        this.videoMetadata = new java.util.ArrayList<VideoMetadata>(videoMetadata);
    }

    /**
     * <p>
     * Currently, Amazon Rekognition Video returns a single object in the
     * <code>VideoMetadata</code> array. The object contains information about
     * the video stream in the input file that Amazon Rekognition Video chose to
     * analyze. The <code>VideoMetadata</code> object includes the video codec,
     * video format and other information. Video metadata is returned in each
     * page of information returned by <code>GetSegmentDetection</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param videoMetadata <p>
     *            Currently, Amazon Rekognition Video returns a single object in
     *            the <code>VideoMetadata</code> array. The object contains
     *            information about the video stream in the input file that
     *            Amazon Rekognition Video chose to analyze. The
     *            <code>VideoMetadata</code> object includes the video codec,
     *            video format and other information. Video metadata is returned
     *            in each page of information returned by
     *            <code>GetSegmentDetection</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSegmentDetectionResult withVideoMetadata(VideoMetadata... videoMetadata) {
        if (getVideoMetadata() == null) {
            this.videoMetadata = new java.util.ArrayList<VideoMetadata>(videoMetadata.length);
        }
        for (VideoMetadata value : videoMetadata) {
            this.videoMetadata.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Currently, Amazon Rekognition Video returns a single object in the
     * <code>VideoMetadata</code> array. The object contains information about
     * the video stream in the input file that Amazon Rekognition Video chose to
     * analyze. The <code>VideoMetadata</code> object includes the video codec,
     * video format and other information. Video metadata is returned in each
     * page of information returned by <code>GetSegmentDetection</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param videoMetadata <p>
     *            Currently, Amazon Rekognition Video returns a single object in
     *            the <code>VideoMetadata</code> array. The object contains
     *            information about the video stream in the input file that
     *            Amazon Rekognition Video chose to analyze. The
     *            <code>VideoMetadata</code> object includes the video codec,
     *            video format and other information. Video metadata is returned
     *            in each page of information returned by
     *            <code>GetSegmentDetection</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSegmentDetectionResult withVideoMetadata(
            java.util.Collection<VideoMetadata> videoMetadata) {
        setVideoMetadata(videoMetadata);
        return this;
    }

    /**
     * <p>
     * An array of objects. There can be multiple audio streams. Each
     * <code>AudioMetadata</code> object contains metadata for a single audio
     * stream. Audio information in an <code>AudioMetadata</code> objects
     * includes the audio codec, the number of audio channels, the duration of
     * the audio stream, and the sample rate. Audio metadata is returned in each
     * page of information returned by <code>GetSegmentDetection</code>.
     * </p>
     *
     * @return <p>
     *         An array of objects. There can be multiple audio streams. Each
     *         <code>AudioMetadata</code> object contains metadata for a single
     *         audio stream. Audio information in an <code>AudioMetadata</code>
     *         objects includes the audio codec, the number of audio channels,
     *         the duration of the audio stream, and the sample rate. Audio
     *         metadata is returned in each page of information returned by
     *         <code>GetSegmentDetection</code>.
     *         </p>
     */
    public java.util.List<AudioMetadata> getAudioMetadata() {
        return audioMetadata;
    }

    /**
     * <p>
     * An array of objects. There can be multiple audio streams. Each
     * <code>AudioMetadata</code> object contains metadata for a single audio
     * stream. Audio information in an <code>AudioMetadata</code> objects
     * includes the audio codec, the number of audio channels, the duration of
     * the audio stream, and the sample rate. Audio metadata is returned in each
     * page of information returned by <code>GetSegmentDetection</code>.
     * </p>
     *
     * @param audioMetadata <p>
     *            An array of objects. There can be multiple audio streams. Each
     *            <code>AudioMetadata</code> object contains metadata for a
     *            single audio stream. Audio information in an
     *            <code>AudioMetadata</code> objects includes the audio codec,
     *            the number of audio channels, the duration of the audio
     *            stream, and the sample rate. Audio metadata is returned in
     *            each page of information returned by
     *            <code>GetSegmentDetection</code>.
     *            </p>
     */
    public void setAudioMetadata(java.util.Collection<AudioMetadata> audioMetadata) {
        if (audioMetadata == null) {
            this.audioMetadata = null;
            return;
        }

        this.audioMetadata = new java.util.ArrayList<AudioMetadata>(audioMetadata);
    }

    /**
     * <p>
     * An array of objects. There can be multiple audio streams. Each
     * <code>AudioMetadata</code> object contains metadata for a single audio
     * stream. Audio information in an <code>AudioMetadata</code> objects
     * includes the audio codec, the number of audio channels, the duration of
     * the audio stream, and the sample rate. Audio metadata is returned in each
     * page of information returned by <code>GetSegmentDetection</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param audioMetadata <p>
     *            An array of objects. There can be multiple audio streams. Each
     *            <code>AudioMetadata</code> object contains metadata for a
     *            single audio stream. Audio information in an
     *            <code>AudioMetadata</code> objects includes the audio codec,
     *            the number of audio channels, the duration of the audio
     *            stream, and the sample rate. Audio metadata is returned in
     *            each page of information returned by
     *            <code>GetSegmentDetection</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSegmentDetectionResult withAudioMetadata(AudioMetadata... audioMetadata) {
        if (getAudioMetadata() == null) {
            this.audioMetadata = new java.util.ArrayList<AudioMetadata>(audioMetadata.length);
        }
        for (AudioMetadata value : audioMetadata) {
            this.audioMetadata.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects. There can be multiple audio streams. Each
     * <code>AudioMetadata</code> object contains metadata for a single audio
     * stream. Audio information in an <code>AudioMetadata</code> objects
     * includes the audio codec, the number of audio channels, the duration of
     * the audio stream, and the sample rate. Audio metadata is returned in each
     * page of information returned by <code>GetSegmentDetection</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param audioMetadata <p>
     *            An array of objects. There can be multiple audio streams. Each
     *            <code>AudioMetadata</code> object contains metadata for a
     *            single audio stream. Audio information in an
     *            <code>AudioMetadata</code> objects includes the audio codec,
     *            the number of audio channels, the duration of the audio
     *            stream, and the sample rate. Audio metadata is returned in
     *            each page of information returned by
     *            <code>GetSegmentDetection</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSegmentDetectionResult withAudioMetadata(
            java.util.Collection<AudioMetadata> audioMetadata) {
        setAudioMetadata(audioMetadata);
        return this;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there are more labels to
     * retrieve), Amazon Rekognition Video returns a pagination token in the
     * response. You can use this pagination token to retrieve the next set of
     * text.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         If the previous response was incomplete (because there are more
     *         labels to retrieve), Amazon Rekognition Video returns a
     *         pagination token in the response. You can use this pagination
     *         token to retrieve the next set of text.
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
     * text.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param nextToken <p>
     *            If the previous response was incomplete (because there are
     *            more labels to retrieve), Amazon Rekognition Video returns a
     *            pagination token in the response. You can use this pagination
     *            token to retrieve the next set of text.
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
     *            If the previous response was incomplete (because there are
     *            more labels to retrieve), Amazon Rekognition Video returns a
     *            pagination token in the response. You can use this pagination
     *            token to retrieve the next set of text.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSegmentDetectionResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * An array of segments detected in a video. The array is sorted by the
     * segment types (TECHNICAL_CUE or SHOT) specified in the
     * <code>SegmentTypes</code> input parameter of
     * <code>StartSegmentDetection</code>. Within each segment type the array is
     * sorted by timestamp values.
     * </p>
     *
     * @return <p>
     *         An array of segments detected in a video. The array is sorted by
     *         the segment types (TECHNICAL_CUE or SHOT) specified in the
     *         <code>SegmentTypes</code> input parameter of
     *         <code>StartSegmentDetection</code>. Within each segment type the
     *         array is sorted by timestamp values.
     *         </p>
     */
    public java.util.List<SegmentDetection> getSegments() {
        return segments;
    }

    /**
     * <p>
     * An array of segments detected in a video. The array is sorted by the
     * segment types (TECHNICAL_CUE or SHOT) specified in the
     * <code>SegmentTypes</code> input parameter of
     * <code>StartSegmentDetection</code>. Within each segment type the array is
     * sorted by timestamp values.
     * </p>
     *
     * @param segments <p>
     *            An array of segments detected in a video. The array is sorted
     *            by the segment types (TECHNICAL_CUE or SHOT) specified in the
     *            <code>SegmentTypes</code> input parameter of
     *            <code>StartSegmentDetection</code>. Within each segment type
     *            the array is sorted by timestamp values.
     *            </p>
     */
    public void setSegments(java.util.Collection<SegmentDetection> segments) {
        if (segments == null) {
            this.segments = null;
            return;
        }

        this.segments = new java.util.ArrayList<SegmentDetection>(segments);
    }

    /**
     * <p>
     * An array of segments detected in a video. The array is sorted by the
     * segment types (TECHNICAL_CUE or SHOT) specified in the
     * <code>SegmentTypes</code> input parameter of
     * <code>StartSegmentDetection</code>. Within each segment type the array is
     * sorted by timestamp values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param segments <p>
     *            An array of segments detected in a video. The array is sorted
     *            by the segment types (TECHNICAL_CUE or SHOT) specified in the
     *            <code>SegmentTypes</code> input parameter of
     *            <code>StartSegmentDetection</code>. Within each segment type
     *            the array is sorted by timestamp values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSegmentDetectionResult withSegments(SegmentDetection... segments) {
        if (getSegments() == null) {
            this.segments = new java.util.ArrayList<SegmentDetection>(segments.length);
        }
        for (SegmentDetection value : segments) {
            this.segments.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of segments detected in a video. The array is sorted by the
     * segment types (TECHNICAL_CUE or SHOT) specified in the
     * <code>SegmentTypes</code> input parameter of
     * <code>StartSegmentDetection</code>. Within each segment type the array is
     * sorted by timestamp values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param segments <p>
     *            An array of segments detected in a video. The array is sorted
     *            by the segment types (TECHNICAL_CUE or SHOT) specified in the
     *            <code>SegmentTypes</code> input parameter of
     *            <code>StartSegmentDetection</code>. Within each segment type
     *            the array is sorted by timestamp values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSegmentDetectionResult withSegments(java.util.Collection<SegmentDetection> segments) {
        setSegments(segments);
        return this;
    }

    /**
     * <p>
     * An array containing the segment types requested in the call to
     * <code>StartSegmentDetection</code>.
     * </p>
     *
     * @return <p>
     *         An array containing the segment types requested in the call to
     *         <code>StartSegmentDetection</code>.
     *         </p>
     */
    public java.util.List<SegmentTypeInfo> getSelectedSegmentTypes() {
        return selectedSegmentTypes;
    }

    /**
     * <p>
     * An array containing the segment types requested in the call to
     * <code>StartSegmentDetection</code>.
     * </p>
     *
     * @param selectedSegmentTypes <p>
     *            An array containing the segment types requested in the call to
     *            <code>StartSegmentDetection</code>.
     *            </p>
     */
    public void setSelectedSegmentTypes(java.util.Collection<SegmentTypeInfo> selectedSegmentTypes) {
        if (selectedSegmentTypes == null) {
            this.selectedSegmentTypes = null;
            return;
        }

        this.selectedSegmentTypes = new java.util.ArrayList<SegmentTypeInfo>(selectedSegmentTypes);
    }

    /**
     * <p>
     * An array containing the segment types requested in the call to
     * <code>StartSegmentDetection</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param selectedSegmentTypes <p>
     *            An array containing the segment types requested in the call to
     *            <code>StartSegmentDetection</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSegmentDetectionResult withSelectedSegmentTypes(
            SegmentTypeInfo... selectedSegmentTypes) {
        if (getSelectedSegmentTypes() == null) {
            this.selectedSegmentTypes = new java.util.ArrayList<SegmentTypeInfo>(
                    selectedSegmentTypes.length);
        }
        for (SegmentTypeInfo value : selectedSegmentTypes) {
            this.selectedSegmentTypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array containing the segment types requested in the call to
     * <code>StartSegmentDetection</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param selectedSegmentTypes <p>
     *            An array containing the segment types requested in the call to
     *            <code>StartSegmentDetection</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSegmentDetectionResult withSelectedSegmentTypes(
            java.util.Collection<SegmentTypeInfo> selectedSegmentTypes) {
        setSelectedSegmentTypes(selectedSegmentTypes);
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
        if (getAudioMetadata() != null)
            sb.append("AudioMetadata: " + getAudioMetadata() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getSegments() != null)
            sb.append("Segments: " + getSegments() + ",");
        if (getSelectedSegmentTypes() != null)
            sb.append("SelectedSegmentTypes: " + getSelectedSegmentTypes());
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
                + ((getAudioMetadata() == null) ? 0 : getAudioMetadata().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSegments() == null) ? 0 : getSegments().hashCode());
        hashCode = prime * hashCode
                + ((getSelectedSegmentTypes() == null) ? 0 : getSelectedSegmentTypes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSegmentDetectionResult == false)
            return false;
        GetSegmentDetectionResult other = (GetSegmentDetectionResult) obj;

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
        if (other.getAudioMetadata() == null ^ this.getAudioMetadata() == null)
            return false;
        if (other.getAudioMetadata() != null
                && other.getAudioMetadata().equals(this.getAudioMetadata()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSegments() == null ^ this.getSegments() == null)
            return false;
        if (other.getSegments() != null && other.getSegments().equals(this.getSegments()) == false)
            return false;
        if (other.getSelectedSegmentTypes() == null ^ this.getSelectedSegmentTypes() == null)
            return false;
        if (other.getSelectedSegmentTypes() != null
                && other.getSelectedSegmentTypes().equals(this.getSelectedSegmentTypes()) == false)
            return false;
        return true;
    }
}
