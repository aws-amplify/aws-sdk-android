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
 * Starts asynchronous detection of faces in a stored video.
 * </p>
 * <p>
 * Amazon Rekognition Video can detect faces in a video stored in an Amazon S3
 * bucket. Use <a>Video</a> to specify the bucket name and the filename of the
 * video. <code>StartFaceDetection</code> returns a job identifier (
 * <code>JobId</code>) that you use to get the results of the operation. When
 * face detection is finished, Amazon Rekognition Video publishes a completion
 * status to the Amazon Simple Notification Service topic that you specify in
 * <code>NotificationChannel</code>. To get the results of the label detection
 * operation, first check that the status value published to the Amazon SNS
 * topic is <code>SUCCEEDED</code>. If so, call and pass the job identifier (
 * <code>JobId</code>) from the initial call to <code>StartFaceDetection</code>.
 * </p>
 * <p>
 * For more information, see Detecting Faces in a Stored Video in the Amazon
 * Rekognition Developer Guide.
 * </p>
 */
public class StartFaceDetectionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The video in which you want to detect faces. The video must be stored in
     * an Amazon S3 bucket.
     * </p>
     */
    private Video video;

    /**
     * <p>
     * Idempotent token used to identify the start request. If you use the same
     * token with multiple <code>StartFaceDetection</code> requests, the same
     * <code>JobId</code> is returned. Use <code>ClientRequestToken</code> to
     * prevent the same job from being accidently started more than once.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The ARN of the Amazon SNS topic to which you want Amazon Rekognition
     * Video to publish the completion status of the face detection operation.
     * </p>
     */
    private NotificationChannel notificationChannel;

    /**
     * <p>
     * The face attributes you want returned.
     * </p>
     * <p>
     * <code>DEFAULT</code> - The following subset of facial attributes are
     * returned: BoundingBox, Confidence, Pose, Quality and Landmarks.
     * </p>
     * <p>
     * <code>ALL</code> - All facial attributes are returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, ALL
     */
    private String faceAttributes;

    /**
     * <p>
     * Unique identifier you specify to identify the job in the completion
     * status published to the Amazon Simple Notification Service topic.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-:]+<br/>
     */
    private String jobTag;

    /**
     * <p>
     * The video in which you want to detect faces. The video must be stored in
     * an Amazon S3 bucket.
     * </p>
     *
     * @return <p>
     *         The video in which you want to detect faces. The video must be
     *         stored in an Amazon S3 bucket.
     *         </p>
     */
    public Video getVideo() {
        return video;
    }

    /**
     * <p>
     * The video in which you want to detect faces. The video must be stored in
     * an Amazon S3 bucket.
     * </p>
     *
     * @param video <p>
     *            The video in which you want to detect faces. The video must be
     *            stored in an Amazon S3 bucket.
     *            </p>
     */
    public void setVideo(Video video) {
        this.video = video;
    }

    /**
     * <p>
     * The video in which you want to detect faces. The video must be stored in
     * an Amazon S3 bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param video <p>
     *            The video in which you want to detect faces. The video must be
     *            stored in an Amazon S3 bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartFaceDetectionRequest withVideo(Video video) {
        this.video = video;
        return this;
    }

    /**
     * <p>
     * Idempotent token used to identify the start request. If you use the same
     * token with multiple <code>StartFaceDetection</code> requests, the same
     * <code>JobId</code> is returned. Use <code>ClientRequestToken</code> to
     * prevent the same job from being accidently started more than once.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @return <p>
     *         Idempotent token used to identify the start request. If you use
     *         the same token with multiple <code>StartFaceDetection</code>
     *         requests, the same <code>JobId</code> is returned. Use
     *         <code>ClientRequestToken</code> to prevent the same job from
     *         being accidently started more than once.
     *         </p>
     */
    public String getClientRequestToken() {
        return clientRequestToken;
    }

    /**
     * <p>
     * Idempotent token used to identify the start request. If you use the same
     * token with multiple <code>StartFaceDetection</code> requests, the same
     * <code>JobId</code> is returned. Use <code>ClientRequestToken</code> to
     * prevent the same job from being accidently started more than once.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @param clientRequestToken <p>
     *            Idempotent token used to identify the start request. If you
     *            use the same token with multiple
     *            <code>StartFaceDetection</code> requests, the same
     *            <code>JobId</code> is returned. Use
     *            <code>ClientRequestToken</code> to prevent the same job from
     *            being accidently started more than once.
     *            </p>
     */
    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * Idempotent token used to identify the start request. If you use the same
     * token with multiple <code>StartFaceDetection</code> requests, the same
     * <code>JobId</code> is returned. Use <code>ClientRequestToken</code> to
     * prevent the same job from being accidently started more than once.
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
     *            <code>StartFaceDetection</code> requests, the same
     *            <code>JobId</code> is returned. Use
     *            <code>ClientRequestToken</code> to prevent the same job from
     *            being accidently started more than once.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartFaceDetectionRequest withClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
        return this;
    }

    /**
     * <p>
     * The ARN of the Amazon SNS topic to which you want Amazon Rekognition
     * Video to publish the completion status of the face detection operation.
     * </p>
     *
     * @return <p>
     *         The ARN of the Amazon SNS topic to which you want Amazon
     *         Rekognition Video to publish the completion status of the face
     *         detection operation.
     *         </p>
     */
    public NotificationChannel getNotificationChannel() {
        return notificationChannel;
    }

    /**
     * <p>
     * The ARN of the Amazon SNS topic to which you want Amazon Rekognition
     * Video to publish the completion status of the face detection operation.
     * </p>
     *
     * @param notificationChannel <p>
     *            The ARN of the Amazon SNS topic to which you want Amazon
     *            Rekognition Video to publish the completion status of the face
     *            detection operation.
     *            </p>
     */
    public void setNotificationChannel(NotificationChannel notificationChannel) {
        this.notificationChannel = notificationChannel;
    }

    /**
     * <p>
     * The ARN of the Amazon SNS topic to which you want Amazon Rekognition
     * Video to publish the completion status of the face detection operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notificationChannel <p>
     *            The ARN of the Amazon SNS topic to which you want Amazon
     *            Rekognition Video to publish the completion status of the face
     *            detection operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartFaceDetectionRequest withNotificationChannel(NotificationChannel notificationChannel) {
        this.notificationChannel = notificationChannel;
        return this;
    }

    /**
     * <p>
     * The face attributes you want returned.
     * </p>
     * <p>
     * <code>DEFAULT</code> - The following subset of facial attributes are
     * returned: BoundingBox, Confidence, Pose, Quality and Landmarks.
     * </p>
     * <p>
     * <code>ALL</code> - All facial attributes are returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, ALL
     *
     * @return <p>
     *         The face attributes you want returned.
     *         </p>
     *         <p>
     *         <code>DEFAULT</code> - The following subset of facial attributes
     *         are returned: BoundingBox, Confidence, Pose, Quality and
     *         Landmarks.
     *         </p>
     *         <p>
     *         <code>ALL</code> - All facial attributes are returned.
     *         </p>
     * @see FaceAttributes
     */
    public String getFaceAttributes() {
        return faceAttributes;
    }

    /**
     * <p>
     * The face attributes you want returned.
     * </p>
     * <p>
     * <code>DEFAULT</code> - The following subset of facial attributes are
     * returned: BoundingBox, Confidence, Pose, Quality and Landmarks.
     * </p>
     * <p>
     * <code>ALL</code> - All facial attributes are returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, ALL
     *
     * @param faceAttributes <p>
     *            The face attributes you want returned.
     *            </p>
     *            <p>
     *            <code>DEFAULT</code> - The following subset of facial
     *            attributes are returned: BoundingBox, Confidence, Pose,
     *            Quality and Landmarks.
     *            </p>
     *            <p>
     *            <code>ALL</code> - All facial attributes are returned.
     *            </p>
     * @see FaceAttributes
     */
    public void setFaceAttributes(String faceAttributes) {
        this.faceAttributes = faceAttributes;
    }

    /**
     * <p>
     * The face attributes you want returned.
     * </p>
     * <p>
     * <code>DEFAULT</code> - The following subset of facial attributes are
     * returned: BoundingBox, Confidence, Pose, Quality and Landmarks.
     * </p>
     * <p>
     * <code>ALL</code> - All facial attributes are returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, ALL
     *
     * @param faceAttributes <p>
     *            The face attributes you want returned.
     *            </p>
     *            <p>
     *            <code>DEFAULT</code> - The following subset of facial
     *            attributes are returned: BoundingBox, Confidence, Pose,
     *            Quality and Landmarks.
     *            </p>
     *            <p>
     *            <code>ALL</code> - All facial attributes are returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FaceAttributes
     */
    public StartFaceDetectionRequest withFaceAttributes(String faceAttributes) {
        this.faceAttributes = faceAttributes;
        return this;
    }

    /**
     * <p>
     * The face attributes you want returned.
     * </p>
     * <p>
     * <code>DEFAULT</code> - The following subset of facial attributes are
     * returned: BoundingBox, Confidence, Pose, Quality and Landmarks.
     * </p>
     * <p>
     * <code>ALL</code> - All facial attributes are returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, ALL
     *
     * @param faceAttributes <p>
     *            The face attributes you want returned.
     *            </p>
     *            <p>
     *            <code>DEFAULT</code> - The following subset of facial
     *            attributes are returned: BoundingBox, Confidence, Pose,
     *            Quality and Landmarks.
     *            </p>
     *            <p>
     *            <code>ALL</code> - All facial attributes are returned.
     *            </p>
     * @see FaceAttributes
     */
    public void setFaceAttributes(FaceAttributes faceAttributes) {
        this.faceAttributes = faceAttributes.toString();
    }

    /**
     * <p>
     * The face attributes you want returned.
     * </p>
     * <p>
     * <code>DEFAULT</code> - The following subset of facial attributes are
     * returned: BoundingBox, Confidence, Pose, Quality and Landmarks.
     * </p>
     * <p>
     * <code>ALL</code> - All facial attributes are returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, ALL
     *
     * @param faceAttributes <p>
     *            The face attributes you want returned.
     *            </p>
     *            <p>
     *            <code>DEFAULT</code> - The following subset of facial
     *            attributes are returned: BoundingBox, Confidence, Pose,
     *            Quality and Landmarks.
     *            </p>
     *            <p>
     *            <code>ALL</code> - All facial attributes are returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FaceAttributes
     */
    public StartFaceDetectionRequest withFaceAttributes(FaceAttributes faceAttributes) {
        this.faceAttributes = faceAttributes.toString();
        return this;
    }

    /**
     * <p>
     * Unique identifier you specify to identify the job in the completion
     * status published to the Amazon Simple Notification Service topic.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-:]+<br/>
     *
     * @return <p>
     *         Unique identifier you specify to identify the job in the
     *         completion status published to the Amazon Simple Notification
     *         Service topic.
     *         </p>
     */
    public String getJobTag() {
        return jobTag;
    }

    /**
     * <p>
     * Unique identifier you specify to identify the job in the completion
     * status published to the Amazon Simple Notification Service topic.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-:]+<br/>
     *
     * @param jobTag <p>
     *            Unique identifier you specify to identify the job in the
     *            completion status published to the Amazon Simple Notification
     *            Service topic.
     *            </p>
     */
    public void setJobTag(String jobTag) {
        this.jobTag = jobTag;
    }

    /**
     * <p>
     * Unique identifier you specify to identify the job in the completion
     * status published to the Amazon Simple Notification Service topic.
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
     *            Unique identifier you specify to identify the job in the
     *            completion status published to the Amazon Simple Notification
     *            Service topic.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartFaceDetectionRequest withJobTag(String jobTag) {
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
        if (getVideo() != null)
            sb.append("Video: " + getVideo() + ",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: " + getClientRequestToken() + ",");
        if (getNotificationChannel() != null)
            sb.append("NotificationChannel: " + getNotificationChannel() + ",");
        if (getFaceAttributes() != null)
            sb.append("FaceAttributes: " + getFaceAttributes() + ",");
        if (getJobTag() != null)
            sb.append("JobTag: " + getJobTag());
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
        hashCode = prime * hashCode
                + ((getFaceAttributes() == null) ? 0 : getFaceAttributes().hashCode());
        hashCode = prime * hashCode + ((getJobTag() == null) ? 0 : getJobTag().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartFaceDetectionRequest == false)
            return false;
        StartFaceDetectionRequest other = (StartFaceDetectionRequest) obj;

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
        if (other.getFaceAttributes() == null ^ this.getFaceAttributes() == null)
            return false;
        if (other.getFaceAttributes() != null
                && other.getFaceAttributes().equals(this.getFaceAttributes()) == false)
            return false;
        if (other.getJobTag() == null ^ this.getJobTag() == null)
            return false;
        if (other.getJobTag() != null && other.getJobTag().equals(this.getJobTag()) == false)
            return false;
        return true;
    }
}
