/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.translate.model;

import java.io.Serializable;

/**
 * <p>
 * The input configuration properties for requesting a batch translation job.
 * </p>
 */
public class InputDataConfig implements Serializable {
    /**
     * <p>
     * The URI of the AWS S3 folder that contains the input file. The folder
     * must be in the same Region as the API endpoint you are calling.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>s3://[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9](/.*)?<br/>
     */
    private String s3Uri;

    /**
     * <p>
     * The multipurpose internet mail extension (MIME) type of the input files.
     * Valid values are <code>text/plain</code> for plaintext files and
     * <code>text/html</code> for HTML files.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>^[-\w.]+\/[-\w.+]+$<br/>
     */
    private String contentType;

    /**
     * <p>
     * The URI of the AWS S3 folder that contains the input file. The folder
     * must be in the same Region as the API endpoint you are calling.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>s3://[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9](/.*)?<br/>
     *
     * @return <p>
     *         The URI of the AWS S3 folder that contains the input file. The
     *         folder must be in the same Region as the API endpoint you are
     *         calling.
     *         </p>
     */
    public String getS3Uri() {
        return s3Uri;
    }

    /**
     * <p>
     * The URI of the AWS S3 folder that contains the input file. The folder
     * must be in the same Region as the API endpoint you are calling.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>s3://[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9](/.*)?<br/>
     *
     * @param s3Uri <p>
     *            The URI of the AWS S3 folder that contains the input file. The
     *            folder must be in the same Region as the API endpoint you are
     *            calling.
     *            </p>
     */
    public void setS3Uri(String s3Uri) {
        this.s3Uri = s3Uri;
    }

    /**
     * <p>
     * The URI of the AWS S3 folder that contains the input file. The folder
     * must be in the same Region as the API endpoint you are calling.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>s3://[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9](/.*)?<br/>
     *
     * @param s3Uri <p>
     *            The URI of the AWS S3 folder that contains the input file. The
     *            folder must be in the same Region as the API endpoint you are
     *            calling.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputDataConfig withS3Uri(String s3Uri) {
        this.s3Uri = s3Uri;
        return this;
    }

    /**
     * <p>
     * The multipurpose internet mail extension (MIME) type of the input files.
     * Valid values are <code>text/plain</code> for plaintext files and
     * <code>text/html</code> for HTML files.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>^[-\w.]+\/[-\w.+]+$<br/>
     *
     * @return <p>
     *         The multipurpose internet mail extension (MIME) type of the input
     *         files. Valid values are <code>text/plain</code> for plaintext
     *         files and <code>text/html</code> for HTML files.
     *         </p>
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * <p>
     * The multipurpose internet mail extension (MIME) type of the input files.
     * Valid values are <code>text/plain</code> for plaintext files and
     * <code>text/html</code> for HTML files.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>^[-\w.]+\/[-\w.+]+$<br/>
     *
     * @param contentType <p>
     *            The multipurpose internet mail extension (MIME) type of the
     *            input files. Valid values are <code>text/plain</code> for
     *            plaintext files and <code>text/html</code> for HTML files.
     *            </p>
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The multipurpose internet mail extension (MIME) type of the input files.
     * Valid values are <code>text/plain</code> for plaintext files and
     * <code>text/html</code> for HTML files.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>^[-\w.]+\/[-\w.+]+$<br/>
     *
     * @param contentType <p>
     *            The multipurpose internet mail extension (MIME) type of the
     *            input files. Valid values are <code>text/plain</code> for
     *            plaintext files and <code>text/html</code> for HTML files.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputDataConfig withContentType(String contentType) {
        this.contentType = contentType;
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
        if (getS3Uri() != null)
            sb.append("S3Uri: " + getS3Uri() + ",");
        if (getContentType() != null)
            sb.append("ContentType: " + getContentType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Uri() == null) ? 0 : getS3Uri().hashCode());
        hashCode = prime * hashCode
                + ((getContentType() == null) ? 0 : getContentType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputDataConfig == false)
            return false;
        InputDataConfig other = (InputDataConfig) obj;

        if (other.getS3Uri() == null ^ this.getS3Uri() == null)
            return false;
        if (other.getS3Uri() != null && other.getS3Uri().equals(this.getS3Uri()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null
                && other.getContentType().equals(this.getContentType()) == false)
            return false;
        return true;
    }
}
