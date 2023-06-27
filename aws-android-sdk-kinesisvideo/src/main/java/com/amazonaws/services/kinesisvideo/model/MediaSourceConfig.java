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

package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;

/**
 * <p>
 * The configuration details that consist of the credentials required (
 * <code>MediaUriSecretArn</code> and <code>MediaUriType</code>) to access the
 * media files that are streamed to the camera.
 * </p>
 */
public class MediaSourceConfig implements Serializable {
    /**
     * <p>
     * The Amazon Web Services Secrets Manager ARN for the username and password
     * of the camera, or a local media file location.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[a-z\d-]+:secretsmanager:[a-z0-9-]+:[0-9]+:secret:[a-zA-Z0-9_.-]+
     * <br/>
     */
    private String mediaUriSecretArn;

    /**
     * <p>
     * The Uniform Resource Identifier (URI) type. The <code>FILE_URI</code>
     * value can be used to stream local media files.
     * </p>
     * <note>
     * <p>
     * Preview only supports the <code>RTSP_URI</code> media source URI format .
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RTSP_URI, FILE_URI
     */
    private String mediaUriType;

    /**
     * <p>
     * The Amazon Web Services Secrets Manager ARN for the username and password
     * of the camera, or a local media file location.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[a-z\d-]+:secretsmanager:[a-z0-9-]+:[0-9]+:secret:[a-zA-Z0-9_.-]+
     * <br/>
     *
     * @return <p>
     *         The Amazon Web Services Secrets Manager ARN for the username and
     *         password of the camera, or a local media file location.
     *         </p>
     */
    public String getMediaUriSecretArn() {
        return mediaUriSecretArn;
    }

    /**
     * <p>
     * The Amazon Web Services Secrets Manager ARN for the username and password
     * of the camera, or a local media file location.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[a-z\d-]+:secretsmanager:[a-z0-9-]+:[0-9]+:secret:[a-zA-Z0-9_.-]+
     * <br/>
     *
     * @param mediaUriSecretArn <p>
     *            The Amazon Web Services Secrets Manager ARN for the username
     *            and password of the camera, or a local media file location.
     *            </p>
     */
    public void setMediaUriSecretArn(String mediaUriSecretArn) {
        this.mediaUriSecretArn = mediaUriSecretArn;
    }

    /**
     * <p>
     * The Amazon Web Services Secrets Manager ARN for the username and password
     * of the camera, or a local media file location.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[a-z\d-]+:secretsmanager:[a-z0-9-]+:[0-9]+:secret:[a-zA-Z0-9_.-]+
     * <br/>
     *
     * @param mediaUriSecretArn <p>
     *            The Amazon Web Services Secrets Manager ARN for the username
     *            and password of the camera, or a local media file location.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MediaSourceConfig withMediaUriSecretArn(String mediaUriSecretArn) {
        this.mediaUriSecretArn = mediaUriSecretArn;
        return this;
    }

    /**
     * <p>
     * The Uniform Resource Identifier (URI) type. The <code>FILE_URI</code>
     * value can be used to stream local media files.
     * </p>
     * <note>
     * <p>
     * Preview only supports the <code>RTSP_URI</code> media source URI format .
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RTSP_URI, FILE_URI
     *
     * @return <p>
     *         The Uniform Resource Identifier (URI) type. The
     *         <code>FILE_URI</code> value can be used to stream local media
     *         files.
     *         </p>
     *         <note>
     *         <p>
     *         Preview only supports the <code>RTSP_URI</code> media source URI
     *         format .
     *         </p>
     *         </note>
     * @see MediaUriType
     */
    public String getMediaUriType() {
        return mediaUriType;
    }

    /**
     * <p>
     * The Uniform Resource Identifier (URI) type. The <code>FILE_URI</code>
     * value can be used to stream local media files.
     * </p>
     * <note>
     * <p>
     * Preview only supports the <code>RTSP_URI</code> media source URI format .
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RTSP_URI, FILE_URI
     *
     * @param mediaUriType <p>
     *            The Uniform Resource Identifier (URI) type. The
     *            <code>FILE_URI</code> value can be used to stream local media
     *            files.
     *            </p>
     *            <note>
     *            <p>
     *            Preview only supports the <code>RTSP_URI</code> media source
     *            URI format .
     *            </p>
     *            </note>
     * @see MediaUriType
     */
    public void setMediaUriType(String mediaUriType) {
        this.mediaUriType = mediaUriType;
    }

    /**
     * <p>
     * The Uniform Resource Identifier (URI) type. The <code>FILE_URI</code>
     * value can be used to stream local media files.
     * </p>
     * <note>
     * <p>
     * Preview only supports the <code>RTSP_URI</code> media source URI format .
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RTSP_URI, FILE_URI
     *
     * @param mediaUriType <p>
     *            The Uniform Resource Identifier (URI) type. The
     *            <code>FILE_URI</code> value can be used to stream local media
     *            files.
     *            </p>
     *            <note>
     *            <p>
     *            Preview only supports the <code>RTSP_URI</code> media source
     *            URI format .
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MediaUriType
     */
    public MediaSourceConfig withMediaUriType(String mediaUriType) {
        this.mediaUriType = mediaUriType;
        return this;
    }

    /**
     * <p>
     * The Uniform Resource Identifier (URI) type. The <code>FILE_URI</code>
     * value can be used to stream local media files.
     * </p>
     * <note>
     * <p>
     * Preview only supports the <code>RTSP_URI</code> media source URI format .
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RTSP_URI, FILE_URI
     *
     * @param mediaUriType <p>
     *            The Uniform Resource Identifier (URI) type. The
     *            <code>FILE_URI</code> value can be used to stream local media
     *            files.
     *            </p>
     *            <note>
     *            <p>
     *            Preview only supports the <code>RTSP_URI</code> media source
     *            URI format .
     *            </p>
     *            </note>
     * @see MediaUriType
     */
    public void setMediaUriType(MediaUriType mediaUriType) {
        this.mediaUriType = mediaUriType.toString();
    }

    /**
     * <p>
     * The Uniform Resource Identifier (URI) type. The <code>FILE_URI</code>
     * value can be used to stream local media files.
     * </p>
     * <note>
     * <p>
     * Preview only supports the <code>RTSP_URI</code> media source URI format .
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RTSP_URI, FILE_URI
     *
     * @param mediaUriType <p>
     *            The Uniform Resource Identifier (URI) type. The
     *            <code>FILE_URI</code> value can be used to stream local media
     *            files.
     *            </p>
     *            <note>
     *            <p>
     *            Preview only supports the <code>RTSP_URI</code> media source
     *            URI format .
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MediaUriType
     */
    public MediaSourceConfig withMediaUriType(MediaUriType mediaUriType) {
        this.mediaUriType = mediaUriType.toString();
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
        if (getMediaUriSecretArn() != null)
            sb.append("MediaUriSecretArn: " + getMediaUriSecretArn() + ",");
        if (getMediaUriType() != null)
            sb.append("MediaUriType: " + getMediaUriType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMediaUriSecretArn() == null) ? 0 : getMediaUriSecretArn().hashCode());
        hashCode = prime * hashCode
                + ((getMediaUriType() == null) ? 0 : getMediaUriType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MediaSourceConfig == false)
            return false;
        MediaSourceConfig other = (MediaSourceConfig) obj;

        if (other.getMediaUriSecretArn() == null ^ this.getMediaUriSecretArn() == null)
            return false;
        if (other.getMediaUriSecretArn() != null
                && other.getMediaUriSecretArn().equals(this.getMediaUriSecretArn()) == false)
            return false;
        if (other.getMediaUriType() == null ^ this.getMediaUriType() == null)
            return false;
        if (other.getMediaUriType() != null
                && other.getMediaUriType().equals(this.getMediaUriType()) == false)
            return false;
        return true;
    }
}
