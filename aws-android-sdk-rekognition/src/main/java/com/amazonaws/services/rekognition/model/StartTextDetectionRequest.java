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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Starts asynchronous detection of text in a stored video.
 * </p>
 * <p>
 * Amazon Rekognition Video can detect text in a video stored in an Amazon S3
 * bucket. Use <a>Video</a> to specify the bucket name and the filename of the
 * video. <code>StartTextDetection</code> returns a job identifier (
 * <code>JobId</code>) which you use to get the results of the operation. When
 * text detection is finished, Amazon Rekognition Video publishes a completion
 * status to the Amazon Simple Notification Service topic that you specify in
 * <code>NotificationChannel</code>.
 * </p>
 * <p>
 * To get the results of the text detection operation, first check that the
 * status value published to the Amazon SNS topic is <code>SUCCEEDED</code>. if
 * so, call <a>GetTextDetection</a> and pass the job identifier (
 * <code>JobId</code>) from the initial call to <code>StartTextDetection</code>.
 * </p>
 */
public class StartTextDetectionRequest extends AmazonWebServiceRequest implements Serializable {
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
     * Idempotent token used to identify the start request. If you use the same
     * token with multiple <code>StartTextDetection</code> requests, the same
     * <code>JobId</code> is returned. Use <code>ClientRequestToken</code> to
     * prevent the same job from being accidentaly started more than once.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The Amazon Simple Notification Service topic to which Amazon Rekognition
     * publishes the completion status of a video analysis operation. For more
     * information, see <a>api-video</a>. Note that the Amazon SNS topic must
     * have a topic name that begins with <i>AmazonRekognition</i> if you are
     * using the AmazonRekognitionServiceRole permissions policy to access the
     * topic. For more information, see <a href=
     * "https://docs.aws.amazon.com/rekognition/latest/dg/api-video-roles.html#api-video-roles-all-topics"
     * >Giving access to multiple Amazon SNS topics</a>.
     * </p>
     */
    private NotificationChannel notificationChannel;

    /**
     * <p>
     * An identifier returned in the completion status published by your Amazon
     * Simple Notification Service topic. For example, you can use
     * <code>JobTag</code> to group related jobs and identify them in the
     * completion notification.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-:]+<br/>
     */
    private String jobTag;

    /**
     * <p>
     * Optional parameters that let you set criteria the text must meet to be
     * included in your response.
     * </p>
     */
    private StartTextDetectionFilters filters;

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
    public StartTextDetectionRequest withVideo(Video video) {
        this.video = video;
        return this;
    }

    /**
     * <p>
     * Idempotent token used to identify the start request. If you use the same
     * token with multiple <code>StartTextDetection</code> requests, the same
     * <code>JobId</code> is returned. Use <code>ClientRequestToken</code> to
     * prevent the same job from being accidentaly started more than once.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @return <p>
     *         Idempotent token used to identify the start request. If you use
     *         the same token with multiple <code>StartTextDetection</code>
     *         requests, the same <code>JobId</code> is returned. Use
     *         <code>ClientRequestToken</code> to prevent the same job from
     *         being accidentaly started more than once.
     *         </p>
     */
    public String getClientRequestToken() {
        return clientRequestToken;
    }

    /**
     * <p>
     * Idempotent token used to identify the start request. If you use the same
     * token with multiple <code>StartTextDetection</code> requests, the same
     * <code>JobId</code> is returned. Use <code>ClientRequestToken</code> to
     * prevent the same job from being accidentaly started more than once.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @param clientRequestToken <p>
     *            Idempotent token used to identify the start request. If you
     *            use the same token with multiple
     *            <code>StartTextDetection</code> requests, the same
     *            <code>JobId</code> is returned. Use
     *            <code>ClientRequestToken</code> to prevent the same job from
     *            being accidentaly started more than once.
     *            </p>
     */
    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * Idempotent token used to identify the start request. If you use the same
     * token with multiple <code>StartTextDetection</code> requests, the same
     * <code>JobId</code> is returned. Use <code>ClientRequestToken</code> to
     * prevent the same job from being accidentaly started more than once.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @param clientRequestToken <p>
     *            Idempotent token used to identify the start request. If you
     *            use the same token with multiple
     *            <code>StartTextDetection</code> requests, the same
     *            <code>JobId</code> is returned. Use
     *            <code>ClientRequestToken</code> to prevent the same job from
     *            being accidentaly started more than once.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartTextDetectionRequest withClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
        return this;
    }

    /**
     * <p>
     * The Amazon Simple Notification Service topic to which Amazon Rekognition
     * publishes the completion status of a video analysis operation. For more
     * information, see <a>api-video</a>. Note that the Amazon SNS topic must
     * have a topic name that begins with <i>AmazonRekognition</i> if you are
     * using the AmazonRekognitionServiceRole permissions policy to access the
     * topic. For more information, see <a href=
     * "https://docs.aws.amazon.com/rekognition/latest/dg/api-video-roles.html#api-video-roles-all-topics"
     * >Giving access to multiple Amazon SNS topics</a>.
     * </p>
     *
     * @return <p>
     *         The Amazon Simple Notification Service topic to which Amazon
     *         Rekognition publishes the completion status of a video analysis
     *         operation. For more information, see <a>api-video</a>. Note that
     *         the Amazon SNS topic must have a topic name that begins with
     *         <i>AmazonRekognition</i> if you are using the
     *         AmazonRekognitionServiceRole permissions policy to access the
     *         topic. For more information, see <a href=
     *         "https://docs.aws.amazon.com/rekognition/latest/dg/api-video-roles.html#api-video-roles-all-topics"
     *         >Giving access to multiple Amazon SNS topics</a>.
     *         </p>
     */
    public NotificationChannel getNotificationChannel() {
        return notificationChannel;
    }

    /**
     * <p>
     * The Amazon Simple Notification Service topic to which Amazon Rekognition
     * publishes the completion status of a video analysis operation. For more
     * information, see <a>api-video</a>. Note that the Amazon SNS topic must
     * have a topic name that begins with <i>AmazonRekognition</i> if you are
     * using the AmazonRekognitionServiceRole permissions policy to access the
     * topic. For more information, see <a href=
     * "https://docs.aws.amazon.com/rekognition/latest/dg/api-video-roles.html#api-video-roles-all-topics"
     * >Giving access to multiple Amazon SNS topics</a>.
     * </p>
     *
     * @param notificationChannel <p>
     *            The Amazon Simple Notification Service topic to which Amazon
     *            Rekognition publishes the completion status of a video
     *            analysis operation. For more information, see
     *            <a>api-video</a>. Note that the Amazon SNS topic must have a
     *            topic name that begins with <i>AmazonRekognition</i> if you
     *            are using the AmazonRekognitionServiceRole permissions policy
     *            to access the topic. For more information, see <a href=
     *            "https://docs.aws.amazon.com/rekognition/latest/dg/api-video-roles.html#api-video-roles-all-topics"
     *            >Giving access to multiple Amazon SNS topics</a>.
     *            </p>
     */
    public void setNotificationChannel(NotificationChannel notificationChannel) {
        this.notificationChannel = notificationChannel;
    }

    /**
     * <p>
     * The Amazon Simple Notification Service topic to which Amazon Rekognition
     * publishes the completion status of a video analysis operation. For more
     * information, see <a>api-video</a>. Note that the Amazon SNS topic must
     * have a topic name that begins with <i>AmazonRekognition</i> if you are
     * using the AmazonRekognitionServiceRole permissions policy to access the
     * topic. For more information, see <a href=
     * "https://docs.aws.amazon.com/rekognition/latest/dg/api-video-roles.html#api-video-roles-all-topics"
     * >Giving access to multiple Amazon SNS topics</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notificationChannel <p>
     *            The Amazon Simple Notification Service topic to which Amazon
     *            Rekognition publishes the completion status of a video
     *            analysis operation. For more information, see
     *            <a>api-video</a>. Note that the Amazon SNS topic must have a
     *            topic name that begins with <i>AmazonRekognition</i> if you
     *            are using the AmazonRekognitionServiceRole permissions policy
     *            to access the topic. For more information, see <a href=
     *            "https://docs.aws.amazon.com/rekognition/latest/dg/api-video-roles.html#api-video-roles-all-topics"
     *            >Giving access to multiple Amazon SNS topics</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartTextDetectionRequest withNotificationChannel(NotificationChannel notificationChannel) {
        this.notificationChannel = notificationChannel;
        return this;
    }

    /**
     * <p>
     * An identifier returned in the completion status published by your Amazon
     * Simple Notification Service topic. For example, you can use
     * <code>JobTag</code> to group related jobs and identify them in the
     * completion notification.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-:]+<br/>
     *
     * @return <p>
     *         An identifier returned in the completion status published by your
     *         Amazon Simple Notification Service topic. For example, you can
     *         use <code>JobTag</code> to group related jobs and identify them
     *         in the completion notification.
     *         </p>
     */
    public String getJobTag() {
        return jobTag;
    }

    /**
     * <p>
     * An identifier returned in the completion status published by your Amazon
     * Simple Notification Service topic. For example, you can use
     * <code>JobTag</code> to group related jobs and identify them in the
     * completion notification.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-:]+<br/>
     *
     * @param jobTag <p>
     *            An identifier returned in the completion status published by
     *            your Amazon Simple Notification Service topic. For example,
     *            you can use <code>JobTag</code> to group related jobs and
     *            identify them in the completion notification.
     *            </p>
     */
    public void setJobTag(String jobTag) {
        this.jobTag = jobTag;
    }

    /**
     * <p>
     * An identifier returned in the completion status published by your Amazon
     * Simple Notification Service topic. For example, you can use
     * <code>JobTag</code> to group related jobs and identify them in the
     * completion notification.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-:]+<br/>
     *
     * @param jobTag <p>
     *            An identifier returned in the completion status published by
     *            your Amazon Simple Notification Service topic. For example,
     *            you can use <code>JobTag</code> to group related jobs and
     *            identify them in the completion notification.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartTextDetectionRequest withJobTag(String jobTag) {
        this.jobTag = jobTag;
        return this;
    }

    /**
     * <p>
     * Optional parameters that let you set criteria the text must meet to be
     * included in your response.
     * </p>
     *
     * @return <p>
     *         Optional parameters that let you set criteria the text must meet
     *         to be included in your response.
     *         </p>
     */
    public StartTextDetectionFilters getFilters() {
        return filters;
    }

    /**
     * <p>
     * Optional parameters that let you set criteria the text must meet to be
     * included in your response.
     * </p>
     *
     * @param filters <p>
     *            Optional parameters that let you set criteria the text must
     *            meet to be included in your response.
     *            </p>
     */
    public void setFilters(StartTextDetectionFilters filters) {
        this.filters = filters;
    }

    /**
     * <p>
     * Optional parameters that let you set criteria the text must meet to be
     * included in your response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filters <p>
     *            Optional parameters that let you set criteria the text must
     *            meet to be included in your response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartTextDetectionRequest withFilters(StartTextDetectionFilters filters) {
        this.filters = filters;
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
        if (getVideo() != null)
            sb.append("Video: " + getVideo() + ",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: " + getClientRequestToken() + ",");
        if (getNotificationChannel() != null)
            sb.append("NotificationChannel: " + getNotificationChannel() + ",");
        if (getJobTag() != null)
            sb.append("JobTag: " + getJobTag() + ",");
        if (getFilters() != null)
            sb.append("Filters: " + getFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVideo() == null) ? 0 : getVideo().hashCode());
        hashCode = prime * hashCode
                + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode
                + ((getNotificationChannel() == null) ? 0 : getNotificationChannel().hashCode());
        hashCode = prime * hashCode + ((getJobTag() == null) ? 0 : getJobTag().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartTextDetectionRequest == false)
            return false;
        StartTextDetectionRequest other = (StartTextDetectionRequest) obj;

        if (other.getVideo() == null ^ this.getVideo() == null)
            return false;
        if (other.getVideo() != null && other.getVideo().equals(this.getVideo()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null
                && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getNotificationChannel() == null ^ this.getNotificationChannel() == null)
            return false;
        if (other.getNotificationChannel() != null
                && other.getNotificationChannel().equals(this.getNotificationChannel()) == false)
            return false;
        if (other.getJobTag() == null ^ this.getJobTag() == null)
            return false;
        if (other.getJobTag() != null && other.getJobTag().equals(this.getJobTag()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        return true;
    }
}
