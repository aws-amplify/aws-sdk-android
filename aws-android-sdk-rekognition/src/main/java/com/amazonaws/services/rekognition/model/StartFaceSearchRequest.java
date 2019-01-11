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
 * Starts the asynchronous search for faces in a collection that match the faces
 * of persons detected in a stored video.
 * </p>
 * <p>
 * The video must be stored in an Amazon S3 bucket. Use <a>Video</a> to specify
 * the bucket name and the filename of the video. <code>StartFaceSearch</code>
 * returns a job identifier (<code>JobId</code>) which you use to get the search
 * results once the search has completed. When searching is finished, Amazon
 * Rekognition Video publishes a completion status to the Amazon Simple
 * Notification Service topic that you specify in
 * <code>NotificationChannel</code>. To get the search results, first check that
 * the status value published to the Amazon SNS topic is <code>SUCCEEDED</code>.
 * If so, call and pass the job identifier (<code>JobId</code>) from the initial
 * call to <code>StartFaceSearch</code>. For more information, see
 * <a>procedure-person-search-videos</a>.
 * </p>
 */
public class StartFaceSearchRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The video you want to search. The video must be stored in an Amazon S3
     * bucket.
     * </p>
     */
    private Video video;

    /**
     * <p>
     * Idempotent token used to identify the start request. If you use the same
     * token with multiple <code>StartFaceSearch</code> requests, the same
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
     * The minimum confidence in the person match to return. For example, don't
     * return any matches where confidence in matches is less than 70%.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     */
    private Float faceMatchThreshold;

    /**
     * <p>
     * ID of the collection that contains the faces you want to search for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-]+<br/>
     */
    private String collectionId;

    /**
     * The new value for the enablePersonTracking property for this object.
     */
    private Boolean enablePersonTracking;

    /**
     * <p>
     * The ARN of the Amazon SNS topic to which you want Amazon Rekognition
     * Video to publish the completion status of the search.
     * </p>
     */
    private NotificationChannel notificationChannel;

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
     * The video you want to search. The video must be stored in an Amazon S3
     * bucket.
     * </p>
     *
     * @return <p>
     *         The video you want to search. The video must be stored in an
     *         Amazon S3 bucket.
     *         </p>
     */
    public Video getVideo() {
        return video;
    }

    /**
     * <p>
     * The video you want to search. The video must be stored in an Amazon S3
     * bucket.
     * </p>
     *
     * @param video <p>
     *            The video you want to search. The video must be stored in an
     *            Amazon S3 bucket.
     *            </p>
     */
    public void setVideo(Video video) {
        this.video = video;
    }

    /**
     * <p>
     * The video you want to search. The video must be stored in an Amazon S3
     * bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param video <p>
     *            The video you want to search. The video must be stored in an
     *            Amazon S3 bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartFaceSearchRequest withVideo(Video video) {
        this.video = video;
        return this;
    }

    /**
     * <p>
     * Idempotent token used to identify the start request. If you use the same
     * token with multiple <code>StartFaceSearch</code> requests, the same
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
     *         the same token with multiple <code>StartFaceSearch</code>
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
     * token with multiple <code>StartFaceSearch</code> requests, the same
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
     *            use the same token with multiple <code>StartFaceSearch</code>
     *            requests, the same <code>JobId</code> is returned. Use
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
     * token with multiple <code>StartFaceSearch</code> requests, the same
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
     *            use the same token with multiple <code>StartFaceSearch</code>
     *            requests, the same <code>JobId</code> is returned. Use
     *            <code>ClientRequestToken</code> to prevent the same job from
     *            being accidently started more than once.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartFaceSearchRequest withClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
        return this;
    }

    /**
     * <p>
     * The minimum confidence in the person match to return. For example, don't
     * return any matches where confidence in matches is less than 70%.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @return <p>
     *         The minimum confidence in the person match to return. For
     *         example, don't return any matches where confidence in matches is
     *         less than 70%.
     *         </p>
     */
    public Float getFaceMatchThreshold() {
        return faceMatchThreshold;
    }

    /**
     * <p>
     * The minimum confidence in the person match to return. For example, don't
     * return any matches where confidence in matches is less than 70%.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param faceMatchThreshold <p>
     *            The minimum confidence in the person match to return. For
     *            example, don't return any matches where confidence in matches
     *            is less than 70%.
     *            </p>
     */
    public void setFaceMatchThreshold(Float faceMatchThreshold) {
        this.faceMatchThreshold = faceMatchThreshold;
    }

    /**
     * <p>
     * The minimum confidence in the person match to return. For example, don't
     * return any matches where confidence in matches is less than 70%.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param faceMatchThreshold <p>
     *            The minimum confidence in the person match to return. For
     *            example, don't return any matches where confidence in matches
     *            is less than 70%.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartFaceSearchRequest withFaceMatchThreshold(Float faceMatchThreshold) {
        this.faceMatchThreshold = faceMatchThreshold;
        return this;
    }

    /**
     * <p>
     * ID of the collection that contains the faces you want to search for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-]+<br/>
     *
     * @return <p>
     *         ID of the collection that contains the faces you want to search
     *         for.
     *         </p>
     */
    public String getCollectionId() {
        return collectionId;
    }

    /**
     * <p>
     * ID of the collection that contains the faces you want to search for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-]+<br/>
     *
     * @param collectionId <p>
     *            ID of the collection that contains the faces you want to
     *            search for.
     *            </p>
     */
    public void setCollectionId(String collectionId) {
        this.collectionId = collectionId;
    }

    /**
     * <p>
     * ID of the collection that contains the faces you want to search for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-]+<br/>
     *
     * @param collectionId <p>
     *            ID of the collection that contains the faces you want to
     *            search for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartFaceSearchRequest withCollectionId(String collectionId) {
        this.collectionId = collectionId;
        return this;
    }

    /**
     * Returns the value of the enablePersonTracking property for this object.
     *
     * @return The value of the enablePersonTracking property for this object.
     */
    public Boolean isEnablePersonTracking() {
        return enablePersonTracking;
    }

    /**
     * Returns the value of the enablePersonTracking property for this object.
     *
     * @return The value of the enablePersonTracking property for this object.
     */
    public Boolean getEnablePersonTracking() {
        return enablePersonTracking;
    }

    /**
     * Sets the value of enablePersonTracking
     *
     * @param enablePersonTracking The new value for the enablePersonTracking
     *            property for this object.
     */
    public void setEnablePersonTracking(Boolean enablePersonTracking) {
        this.enablePersonTracking = enablePersonTracking;
    }

    /**
     * Sets the value of the enablePersonTracking property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enablePersonTracking The new value for the enablePersonTracking
     *            property for this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartFaceSearchRequest withEnablePersonTracking(Boolean enablePersonTracking) {
        this.enablePersonTracking = enablePersonTracking;
        return this;
    }

    /**
     * <p>
     * The ARN of the Amazon SNS topic to which you want Amazon Rekognition
     * Video to publish the completion status of the search.
     * </p>
     *
     * @return <p>
     *         The ARN of the Amazon SNS topic to which you want Amazon
     *         Rekognition Video to publish the completion status of the search.
     *         </p>
     */
    public NotificationChannel getNotificationChannel() {
        return notificationChannel;
    }

    /**
     * <p>
     * The ARN of the Amazon SNS topic to which you want Amazon Rekognition
     * Video to publish the completion status of the search.
     * </p>
     *
     * @param notificationChannel <p>
     *            The ARN of the Amazon SNS topic to which you want Amazon
     *            Rekognition Video to publish the completion status of the
     *            search.
     *            </p>
     */
    public void setNotificationChannel(NotificationChannel notificationChannel) {
        this.notificationChannel = notificationChannel;
    }

    /**
     * <p>
     * The ARN of the Amazon SNS topic to which you want Amazon Rekognition
     * Video to publish the completion status of the search.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notificationChannel <p>
     *            The ARN of the Amazon SNS topic to which you want Amazon
     *            Rekognition Video to publish the completion status of the
     *            search.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartFaceSearchRequest withNotificationChannel(NotificationChannel notificationChannel) {
        this.notificationChannel = notificationChannel;
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
    public StartFaceSearchRequest withJobTag(String jobTag) {
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
        if (getFaceMatchThreshold() != null)
            sb.append("FaceMatchThreshold: " + getFaceMatchThreshold() + ",");
        if (getCollectionId() != null)
            sb.append("CollectionId: " + getCollectionId() + ",");
        if (getEnablePersonTracking() != null)
            sb.append("EnablePersonTracking: " + getEnablePersonTracking() + ",");
        if (getNotificationChannel() != null)
            sb.append("NotificationChannel: " + getNotificationChannel() + ",");
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
                + ((getFaceMatchThreshold() == null) ? 0 : getFaceMatchThreshold().hashCode());
        hashCode = prime * hashCode
                + ((getCollectionId() == null) ? 0 : getCollectionId().hashCode());
        hashCode = prime * hashCode
                + ((getEnablePersonTracking() == null) ? 0 : getEnablePersonTracking().hashCode());
        hashCode = prime * hashCode
                + ((getNotificationChannel() == null) ? 0 : getNotificationChannel().hashCode());
        hashCode = prime * hashCode + ((getJobTag() == null) ? 0 : getJobTag().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartFaceSearchRequest == false)
            return false;
        StartFaceSearchRequest other = (StartFaceSearchRequest) obj;

        if (other.getVideo() == null ^ this.getVideo() == null)
            return false;
        if (other.getVideo() != null && other.getVideo().equals(this.getVideo()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null
                && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getFaceMatchThreshold() == null ^ this.getFaceMatchThreshold() == null)
            return false;
        if (other.getFaceMatchThreshold() != null
                && other.getFaceMatchThreshold().equals(this.getFaceMatchThreshold()) == false)
            return false;
        if (other.getCollectionId() == null ^ this.getCollectionId() == null)
            return false;
        if (other.getCollectionId() != null
                && other.getCollectionId().equals(this.getCollectionId()) == false)
            return false;
        if (other.getEnablePersonTracking() == null ^ this.getEnablePersonTracking() == null)
            return false;
        if (other.getEnablePersonTracking() != null
                && other.getEnablePersonTracking().equals(this.getEnablePersonTracking()) == false)
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
        return true;
    }
}
