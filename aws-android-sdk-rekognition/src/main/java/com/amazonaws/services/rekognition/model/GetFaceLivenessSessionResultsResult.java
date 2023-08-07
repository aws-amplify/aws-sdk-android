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

public class GetFaceLivenessSessionResultsResult implements Serializable {
    /**
     * <p>
     * The sessionId for which this request was called.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     */
    private String sessionId;

    /**
     * <p>
     * Represents a status corresponding to the state of the session. Possible
     * statuses are: CREATED, IN_PROGRESS, SUCCEEDED, FAILED, EXPIRED.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATED, IN_PROGRESS, SUCCEEDED, FAILED, EXPIRED
     */
    private String status;

    /**
     * <p>
     * Probabalistic confidence score for if the person in the given video was
     * live, represented as a float value between 0 to 100.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0.0 - 100.0<br/>
     */
    private Float confidence;

    /**
     * <p>
     * A high-quality image from the Face Liveness video that can be used for
     * face comparison or search. It includes a bounding box of the face and the
     * Base64-encoded bytes that return an image. If the
     * CreateFaceLivenessSession request included an OutputConfig argument, the
     * image will be uploaded to an S3Object specified in the output
     * configuration. In case the reference image is not returned, it's
     * recommended to retry the Liveness check.
     * </p>
     */
    private AuditImage referenceImage;

    /**
     * <p>
     * A set of images from the Face Liveness video that can be used for audit
     * purposes. It includes a bounding box of the face and the Base64-encoded
     * bytes that return an image. If the CreateFaceLivenessSession request
     * included an OutputConfig argument, the image will be uploaded to an
     * S3Object specified in the output configuration. If no Amazon S3 bucket is
     * defined, raw bytes are sent instead.
     * </p>
     */
    private java.util.List<AuditImage> auditImages;

    /**
     * <p>
     * The sessionId for which this request was called.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     *
     * @return <p>
     *         The sessionId for which this request was called.
     *         </p>
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * <p>
     * The sessionId for which this request was called.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     *
     * @param sessionId <p>
     *            The sessionId for which this request was called.
     *            </p>
     */
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * <p>
     * The sessionId for which this request was called.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     *
     * @param sessionId <p>
     *            The sessionId for which this request was called.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFaceLivenessSessionResultsResult withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * <p>
     * Represents a status corresponding to the state of the session. Possible
     * statuses are: CREATED, IN_PROGRESS, SUCCEEDED, FAILED, EXPIRED.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATED, IN_PROGRESS, SUCCEEDED, FAILED, EXPIRED
     *
     * @return <p>
     *         Represents a status corresponding to the state of the session.
     *         Possible statuses are: CREATED, IN_PROGRESS, SUCCEEDED, FAILED,
     *         EXPIRED.
     *         </p>
     * @see LivenessSessionStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * Represents a status corresponding to the state of the session. Possible
     * statuses are: CREATED, IN_PROGRESS, SUCCEEDED, FAILED, EXPIRED.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATED, IN_PROGRESS, SUCCEEDED, FAILED, EXPIRED
     *
     * @param status <p>
     *            Represents a status corresponding to the state of the session.
     *            Possible statuses are: CREATED, IN_PROGRESS, SUCCEEDED,
     *            FAILED, EXPIRED.
     *            </p>
     * @see LivenessSessionStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Represents a status corresponding to the state of the session. Possible
     * statuses are: CREATED, IN_PROGRESS, SUCCEEDED, FAILED, EXPIRED.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATED, IN_PROGRESS, SUCCEEDED, FAILED, EXPIRED
     *
     * @param status <p>
     *            Represents a status corresponding to the state of the session.
     *            Possible statuses are: CREATED, IN_PROGRESS, SUCCEEDED,
     *            FAILED, EXPIRED.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LivenessSessionStatus
     */
    public GetFaceLivenessSessionResultsResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * Represents a status corresponding to the state of the session. Possible
     * statuses are: CREATED, IN_PROGRESS, SUCCEEDED, FAILED, EXPIRED.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATED, IN_PROGRESS, SUCCEEDED, FAILED, EXPIRED
     *
     * @param status <p>
     *            Represents a status corresponding to the state of the session.
     *            Possible statuses are: CREATED, IN_PROGRESS, SUCCEEDED,
     *            FAILED, EXPIRED.
     *            </p>
     * @see LivenessSessionStatus
     */
    public void setStatus(LivenessSessionStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * Represents a status corresponding to the state of the session. Possible
     * statuses are: CREATED, IN_PROGRESS, SUCCEEDED, FAILED, EXPIRED.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATED, IN_PROGRESS, SUCCEEDED, FAILED, EXPIRED
     *
     * @param status <p>
     *            Represents a status corresponding to the state of the session.
     *            Possible statuses are: CREATED, IN_PROGRESS, SUCCEEDED,
     *            FAILED, EXPIRED.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LivenessSessionStatus
     */
    public GetFaceLivenessSessionResultsResult withStatus(LivenessSessionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Probabalistic confidence score for if the person in the given video was
     * live, represented as a float value between 0 to 100.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0.0 - 100.0<br/>
     *
     * @return <p>
     *         Probabalistic confidence score for if the person in the given
     *         video was live, represented as a float value between 0 to 100.
     *         </p>
     */
    public Float getConfidence() {
        return confidence;
    }

    /**
     * <p>
     * Probabalistic confidence score for if the person in the given video was
     * live, represented as a float value between 0 to 100.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0.0 - 100.0<br/>
     *
     * @param confidence <p>
     *            Probabalistic confidence score for if the person in the given
     *            video was live, represented as a float value between 0 to 100.
     *            </p>
     */
    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    /**
     * <p>
     * Probabalistic confidence score for if the person in the given video was
     * live, represented as a float value between 0 to 100.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0.0 - 100.0<br/>
     *
     * @param confidence <p>
     *            Probabalistic confidence score for if the person in the given
     *            video was live, represented as a float value between 0 to 100.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFaceLivenessSessionResultsResult withConfidence(Float confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * <p>
     * A high-quality image from the Face Liveness video that can be used for
     * face comparison or search. It includes a bounding box of the face and the
     * Base64-encoded bytes that return an image. If the
     * CreateFaceLivenessSession request included an OutputConfig argument, the
     * image will be uploaded to an S3Object specified in the output
     * configuration. In case the reference image is not returned, it's
     * recommended to retry the Liveness check.
     * </p>
     *
     * @return <p>
     *         A high-quality image from the Face Liveness video that can be
     *         used for face comparison or search. It includes a bounding box of
     *         the face and the Base64-encoded bytes that return an image. If
     *         the CreateFaceLivenessSession request included an OutputConfig
     *         argument, the image will be uploaded to an S3Object specified in
     *         the output configuration. In case the reference image is not
     *         returned, it's recommended to retry the Liveness check.
     *         </p>
     */
    public AuditImage getReferenceImage() {
        return referenceImage;
    }

    /**
     * <p>
     * A high-quality image from the Face Liveness video that can be used for
     * face comparison or search. It includes a bounding box of the face and the
     * Base64-encoded bytes that return an image. If the
     * CreateFaceLivenessSession request included an OutputConfig argument, the
     * image will be uploaded to an S3Object specified in the output
     * configuration. In case the reference image is not returned, it's
     * recommended to retry the Liveness check.
     * </p>
     *
     * @param referenceImage <p>
     *            A high-quality image from the Face Liveness video that can be
     *            used for face comparison or search. It includes a bounding box
     *            of the face and the Base64-encoded bytes that return an image.
     *            If the CreateFaceLivenessSession request included an
     *            OutputConfig argument, the image will be uploaded to an
     *            S3Object specified in the output configuration. In case the
     *            reference image is not returned, it's recommended to retry the
     *            Liveness check.
     *            </p>
     */
    public void setReferenceImage(AuditImage referenceImage) {
        this.referenceImage = referenceImage;
    }

    /**
     * <p>
     * A high-quality image from the Face Liveness video that can be used for
     * face comparison or search. It includes a bounding box of the face and the
     * Base64-encoded bytes that return an image. If the
     * CreateFaceLivenessSession request included an OutputConfig argument, the
     * image will be uploaded to an S3Object specified in the output
     * configuration. In case the reference image is not returned, it's
     * recommended to retry the Liveness check.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param referenceImage <p>
     *            A high-quality image from the Face Liveness video that can be
     *            used for face comparison or search. It includes a bounding box
     *            of the face and the Base64-encoded bytes that return an image.
     *            If the CreateFaceLivenessSession request included an
     *            OutputConfig argument, the image will be uploaded to an
     *            S3Object specified in the output configuration. In case the
     *            reference image is not returned, it's recommended to retry the
     *            Liveness check.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFaceLivenessSessionResultsResult withReferenceImage(AuditImage referenceImage) {
        this.referenceImage = referenceImage;
        return this;
    }

    /**
     * <p>
     * A set of images from the Face Liveness video that can be used for audit
     * purposes. It includes a bounding box of the face and the Base64-encoded
     * bytes that return an image. If the CreateFaceLivenessSession request
     * included an OutputConfig argument, the image will be uploaded to an
     * S3Object specified in the output configuration. If no Amazon S3 bucket is
     * defined, raw bytes are sent instead.
     * </p>
     *
     * @return <p>
     *         A set of images from the Face Liveness video that can be used for
     *         audit purposes. It includes a bounding box of the face and the
     *         Base64-encoded bytes that return an image. If the
     *         CreateFaceLivenessSession request included an OutputConfig
     *         argument, the image will be uploaded to an S3Object specified in
     *         the output configuration. If no Amazon S3 bucket is defined, raw
     *         bytes are sent instead.
     *         </p>
     */
    public java.util.List<AuditImage> getAuditImages() {
        return auditImages;
    }

    /**
     * <p>
     * A set of images from the Face Liveness video that can be used for audit
     * purposes. It includes a bounding box of the face and the Base64-encoded
     * bytes that return an image. If the CreateFaceLivenessSession request
     * included an OutputConfig argument, the image will be uploaded to an
     * S3Object specified in the output configuration. If no Amazon S3 bucket is
     * defined, raw bytes are sent instead.
     * </p>
     *
     * @param auditImages <p>
     *            A set of images from the Face Liveness video that can be used
     *            for audit purposes. It includes a bounding box of the face and
     *            the Base64-encoded bytes that return an image. If the
     *            CreateFaceLivenessSession request included an OutputConfig
     *            argument, the image will be uploaded to an S3Object specified
     *            in the output configuration. If no Amazon S3 bucket is
     *            defined, raw bytes are sent instead.
     *            </p>
     */
    public void setAuditImages(java.util.Collection<AuditImage> auditImages) {
        if (auditImages == null) {
            this.auditImages = null;
            return;
        }

        this.auditImages = new java.util.ArrayList<AuditImage>(auditImages);
    }

    /**
     * <p>
     * A set of images from the Face Liveness video that can be used for audit
     * purposes. It includes a bounding box of the face and the Base64-encoded
     * bytes that return an image. If the CreateFaceLivenessSession request
     * included an OutputConfig argument, the image will be uploaded to an
     * S3Object specified in the output configuration. If no Amazon S3 bucket is
     * defined, raw bytes are sent instead.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param auditImages <p>
     *            A set of images from the Face Liveness video that can be used
     *            for audit purposes. It includes a bounding box of the face and
     *            the Base64-encoded bytes that return an image. If the
     *            CreateFaceLivenessSession request included an OutputConfig
     *            argument, the image will be uploaded to an S3Object specified
     *            in the output configuration. If no Amazon S3 bucket is
     *            defined, raw bytes are sent instead.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFaceLivenessSessionResultsResult withAuditImages(AuditImage... auditImages) {
        if (getAuditImages() == null) {
            this.auditImages = new java.util.ArrayList<AuditImage>(auditImages.length);
        }
        for (AuditImage value : auditImages) {
            this.auditImages.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A set of images from the Face Liveness video that can be used for audit
     * purposes. It includes a bounding box of the face and the Base64-encoded
     * bytes that return an image. If the CreateFaceLivenessSession request
     * included an OutputConfig argument, the image will be uploaded to an
     * S3Object specified in the output configuration. If no Amazon S3 bucket is
     * defined, raw bytes are sent instead.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param auditImages <p>
     *            A set of images from the Face Liveness video that can be used
     *            for audit purposes. It includes a bounding box of the face and
     *            the Base64-encoded bytes that return an image. If the
     *            CreateFaceLivenessSession request included an OutputConfig
     *            argument, the image will be uploaded to an S3Object specified
     *            in the output configuration. If no Amazon S3 bucket is
     *            defined, raw bytes are sent instead.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFaceLivenessSessionResultsResult withAuditImages(
            java.util.Collection<AuditImage> auditImages) {
        setAuditImages(auditImages);
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
        if (getSessionId() != null)
            sb.append("SessionId: " + getSessionId() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getConfidence() != null)
            sb.append("Confidence: " + getConfidence() + ",");
        if (getReferenceImage() != null)
            sb.append("ReferenceImage: " + getReferenceImage() + ",");
        if (getAuditImages() != null)
            sb.append("AuditImages: " + getAuditImages());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSessionId() == null) ? 0 : getSessionId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getConfidence() == null) ? 0 : getConfidence().hashCode());
        hashCode = prime * hashCode
                + ((getReferenceImage() == null) ? 0 : getReferenceImage().hashCode());
        hashCode = prime * hashCode
                + ((getAuditImages() == null) ? 0 : getAuditImages().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetFaceLivenessSessionResultsResult == false)
            return false;
        GetFaceLivenessSessionResultsResult other = (GetFaceLivenessSessionResultsResult) obj;

        if (other.getSessionId() == null ^ this.getSessionId() == null)
            return false;
        if (other.getSessionId() != null
                && other.getSessionId().equals(this.getSessionId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getConfidence() == null ^ this.getConfidence() == null)
            return false;
        if (other.getConfidence() != null
                && other.getConfidence().equals(this.getConfidence()) == false)
            return false;
        if (other.getReferenceImage() == null ^ this.getReferenceImage() == null)
            return false;
        if (other.getReferenceImage() != null
                && other.getReferenceImage().equals(this.getReferenceImage()) == false)
            return false;
        if (other.getAuditImages() == null ^ this.getAuditImages() == null)
            return false;
        if (other.getAuditImages() != null
                && other.getAuditImages().equals(this.getAuditImages()) == false)
            return false;
        return true;
    }
}
