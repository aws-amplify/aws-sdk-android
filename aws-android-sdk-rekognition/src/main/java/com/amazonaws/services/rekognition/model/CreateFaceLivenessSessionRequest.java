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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * This API operation initiates a Face Liveness session. It returns a
 * <code>SessionId</code>, which you can use to start streaming Face Liveness
 * video and get the results for a Face Liveness session.
 * </p>
 * <p>
 * You can use the <code>OutputConfig</code> option in the Settings parameter to
 * provide an Amazon S3 bucket location. The Amazon S3 bucket stores reference
 * images and audit images. If no Amazon S3 bucket is defined, raw bytes are
 * sent instead.
 * </p>
 * <p>
 * You can use <code>AuditImagesLimit</code> to limit the number of audit images
 * returned when <code>GetFaceLivenessSessionResults</code> is called. This
 * number is between 0 and 4. By default, it is set to 0. The limit is best
 * effort and based on the duration of the selfie-video.
 * </p>
 */
public class CreateFaceLivenessSessionRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The identifier for your AWS Key Management Service key (AWS KMS key).
     * Used to encrypt audit images and reference images.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[A-Za-z0-9][A-Za-z0-9:_/+=,@.-]{0,2048}$<br/>
     */
    private String kmsKeyId;

    /**
     * <p>
     * A session settings object. It contains settings for the operation to be
     * performed. For Face Liveness, it accepts <code>OutputConfig</code> and
     * <code>AuditImagesLimit</code>.
     * </p>
     */
    private CreateFaceLivenessSessionRequestSettings settings;

    /**
     * <p>
     * Idempotent token is used to recognize the Face Liveness request. If the
     * same token is used with multiple <code>CreateFaceLivenessSession</code>
     * requests, the same session is returned. This token is employed to avoid
     * unintentionally creating the same session multiple times.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The identifier for your AWS Key Management Service key (AWS KMS key).
     * Used to encrypt audit images and reference images.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[A-Za-z0-9][A-Za-z0-9:_/+=,@.-]{0,2048}$<br/>
     *
     * @return <p>
     *         The identifier for your AWS Key Management Service key (AWS KMS
     *         key). Used to encrypt audit images and reference images.
     *         </p>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>
     * The identifier for your AWS Key Management Service key (AWS KMS key).
     * Used to encrypt audit images and reference images.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[A-Za-z0-9][A-Za-z0-9:_/+=,@.-]{0,2048}$<br/>
     *
     * @param kmsKeyId <p>
     *            The identifier for your AWS Key Management Service key (AWS
     *            KMS key). Used to encrypt audit images and reference images.
     *            </p>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The identifier for your AWS Key Management Service key (AWS KMS key).
     * Used to encrypt audit images and reference images.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[A-Za-z0-9][A-Za-z0-9:_/+=,@.-]{0,2048}$<br/>
     *
     * @param kmsKeyId <p>
     *            The identifier for your AWS Key Management Service key (AWS
     *            KMS key). Used to encrypt audit images and reference images.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFaceLivenessSessionRequest withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * <p>
     * A session settings object. It contains settings for the operation to be
     * performed. For Face Liveness, it accepts <code>OutputConfig</code> and
     * <code>AuditImagesLimit</code>.
     * </p>
     *
     * @return <p>
     *         A session settings object. It contains settings for the operation
     *         to be performed. For Face Liveness, it accepts
     *         <code>OutputConfig</code> and <code>AuditImagesLimit</code>.
     *         </p>
     */
    public CreateFaceLivenessSessionRequestSettings getSettings() {
        return settings;
    }

    /**
     * <p>
     * A session settings object. It contains settings for the operation to be
     * performed. For Face Liveness, it accepts <code>OutputConfig</code> and
     * <code>AuditImagesLimit</code>.
     * </p>
     *
     * @param settings <p>
     *            A session settings object. It contains settings for the
     *            operation to be performed. For Face Liveness, it accepts
     *            <code>OutputConfig</code> and <code>AuditImagesLimit</code>.
     *            </p>
     */
    public void setSettings(CreateFaceLivenessSessionRequestSettings settings) {
        this.settings = settings;
    }

    /**
     * <p>
     * A session settings object. It contains settings for the operation to be
     * performed. For Face Liveness, it accepts <code>OutputConfig</code> and
     * <code>AuditImagesLimit</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param settings <p>
     *            A session settings object. It contains settings for the
     *            operation to be performed. For Face Liveness, it accepts
     *            <code>OutputConfig</code> and <code>AuditImagesLimit</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFaceLivenessSessionRequest withSettings(
            CreateFaceLivenessSessionRequestSettings settings) {
        this.settings = settings;
        return this;
    }

    /**
     * <p>
     * Idempotent token is used to recognize the Face Liveness request. If the
     * same token is used with multiple <code>CreateFaceLivenessSession</code>
     * requests, the same session is returned. This token is employed to avoid
     * unintentionally creating the same session multiple times.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @return <p>
     *         Idempotent token is used to recognize the Face Liveness request.
     *         If the same token is used with multiple
     *         <code>CreateFaceLivenessSession</code> requests, the same session
     *         is returned. This token is employed to avoid unintentionally
     *         creating the same session multiple times.
     *         </p>
     */
    public String getClientRequestToken() {
        return clientRequestToken;
    }

    /**
     * <p>
     * Idempotent token is used to recognize the Face Liveness request. If the
     * same token is used with multiple <code>CreateFaceLivenessSession</code>
     * requests, the same session is returned. This token is employed to avoid
     * unintentionally creating the same session multiple times.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-_]+$<br/>
     *
     * @param clientRequestToken <p>
     *            Idempotent token is used to recognize the Face Liveness
     *            request. If the same token is used with multiple
     *            <code>CreateFaceLivenessSession</code> requests, the same
     *            session is returned. This token is employed to avoid
     *            unintentionally creating the same session multiple times.
     *            </p>
     */
    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * Idempotent token is used to recognize the Face Liveness request. If the
     * same token is used with multiple <code>CreateFaceLivenessSession</code>
     * requests, the same session is returned. This token is employed to avoid
     * unintentionally creating the same session multiple times.
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
     *            Idempotent token is used to recognize the Face Liveness
     *            request. If the same token is used with multiple
     *            <code>CreateFaceLivenessSession</code> requests, the same
     *            session is returned. This token is employed to avoid
     *            unintentionally creating the same session multiple times.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFaceLivenessSessionRequest withClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
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
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId() + ",");
        if (getSettings() != null)
            sb.append("Settings: " + getSettings() + ",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: " + getClientRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        hashCode = prime * hashCode
                + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFaceLivenessSessionRequest == false)
            return false;
        CreateFaceLivenessSessionRequest other = (CreateFaceLivenessSessionRequest) obj;

        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getSettings() == null ^ this.getSettings() == null)
            return false;
        if (other.getSettings() != null && other.getSettings().equals(this.getSettings()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null
                && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }
}
