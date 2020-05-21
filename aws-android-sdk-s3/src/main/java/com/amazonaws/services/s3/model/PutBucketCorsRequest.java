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

package com.amazonaws.services.s3.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Sets the <code>cors</code> configuration for your bucket. If the
 * configuration exists, Amazon S3 replaces it.
 * </p>
 * <p>
 * To use this operation, you must be allowed to perform the
 * <code>s3:PutBucketCORS</code> action. By default, the bucket owner has this
 * permission and can grant it to others.
 * </p>
 * <p>
 * You set this configuration on a bucket so that the bucket can service
 * cross-origin requests. For example, you might want to enable a request whose
 * origin is <code>http://www.example.com</code> to access your Amazon S3 bucket
 * at <code>my.example.bucket.com</code> by using the browser's
 * <code>XMLHttpRequest</code> capability.
 * </p>
 * <p>
 * To enable cross-origin resource sharing (CORS) on a bucket, you add the
 * <code>cors</code> subresource to the bucket. The <code>cors</code>
 * subresource is an XML document in which you configure rules that identify
 * origins and the HTTP methods that can be executed on your bucket. The
 * document is limited to 64 KB in size.
 * </p>
 * <p>
 * When Amazon S3 receives a cross-origin request (or a pre-flight OPTIONS
 * request) against a bucket, it evaluates the <code>cors</code> configuration
 * on the bucket and uses the first <code>CORSRule</code> rule that matches the
 * incoming browser request to enable a cross-origin request. For a rule to
 * match, the following conditions must be met:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The request's <code>Origin</code> header must match
 * <code>AllowedOrigin</code> elements.
 * </p>
 * </li>
 * <li>
 * <p>
 * The request method (for example, GET, PUT, HEAD, and so on) or the
 * <code>Access-Control-Request-Method</code> header in case of a pre-flight
 * <code>OPTIONS</code> request must be one of the <code>AllowedMethod</code>
 * elements.
 * </p>
 * </li>
 * <li>
 * <p>
 * Every header specified in the <code>Access-Control-Request-Headers</code>
 * request header of a pre-flight request must match an
 * <code>AllowedHeader</code> element.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For more information about CORS, go to <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html">Enabling
 * Cross-Origin Resource Sharing</a> in the <i>Amazon Simple Storage Service
 * Developer Guide</i>.
 * </p>
 * <p class="title">
 * <b>Related Resources</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>GetBucketCors</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteBucketCors</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>RESTOPTIONSobject</a>
 * </p>
 * </li>
 * </ul>
 */
public class PutBucketCorsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Specifies the bucket impacted by the <code>cors</code>configuration.
     * </p>
     */
    private String bucket;

    /**
     * <p>
     * Describes the cross-origin access configuration for objects in an Amazon
     * S3 bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html">Enabling
     * Cross-Origin Resource Sharing</a> in the <i>Amazon Simple Storage Service
     * Developer Guide</i>.
     * </p>
     */
    private CORSConfiguration cORSConfiguration;

    /**
     * <p>
     * The base64-encoded 128-bit MD5 digest of the data. This header must be
     * used as a message integrity check to verify that the request body was not
     * corrupted in transit. For more information, go to <a
     * href="http://www.ietf.org/rfc/rfc1864.txt">RFC 1864.</a>
     * </p>
     */
    private String contentMD5;

    /**
     * <p>
     * Specifies the bucket impacted by the <code>cors</code>configuration.
     * </p>
     *
     * @return <p>
     *         Specifies the bucket impacted by the <code>cors</code>
     *         configuration.
     *         </p>
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * <p>
     * Specifies the bucket impacted by the <code>cors</code>configuration.
     * </p>
     *
     * @param bucket <p>
     *            Specifies the bucket impacted by the <code>cors</code>
     *            configuration.
     *            </p>
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * Specifies the bucket impacted by the <code>cors</code>configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucket <p>
     *            Specifies the bucket impacted by the <code>cors</code>
     *            configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBucketCorsRequest withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * <p>
     * Describes the cross-origin access configuration for objects in an Amazon
     * S3 bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html">Enabling
     * Cross-Origin Resource Sharing</a> in the <i>Amazon Simple Storage Service
     * Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         Describes the cross-origin access configuration for objects in an
     *         Amazon S3 bucket. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html"
     *         >Enabling Cross-Origin Resource Sharing</a> in the <i>Amazon
     *         Simple Storage Service Developer Guide</i>.
     *         </p>
     */
    public CORSConfiguration getCORSConfiguration() {
        return cORSConfiguration;
    }

    /**
     * <p>
     * Describes the cross-origin access configuration for objects in an Amazon
     * S3 bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html">Enabling
     * Cross-Origin Resource Sharing</a> in the <i>Amazon Simple Storage Service
     * Developer Guide</i>.
     * </p>
     *
     * @param cORSConfiguration <p>
     *            Describes the cross-origin access configuration for objects in
     *            an Amazon S3 bucket. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html"
     *            >Enabling Cross-Origin Resource Sharing</a> in the <i>Amazon
     *            Simple Storage Service Developer Guide</i>.
     *            </p>
     */
    public void setCORSConfiguration(CORSConfiguration cORSConfiguration) {
        this.cORSConfiguration = cORSConfiguration;
    }

    /**
     * <p>
     * Describes the cross-origin access configuration for objects in an Amazon
     * S3 bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html">Enabling
     * Cross-Origin Resource Sharing</a> in the <i>Amazon Simple Storage Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cORSConfiguration <p>
     *            Describes the cross-origin access configuration for objects in
     *            an Amazon S3 bucket. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html"
     *            >Enabling Cross-Origin Resource Sharing</a> in the <i>Amazon
     *            Simple Storage Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBucketCorsRequest withCORSConfiguration(CORSConfiguration cORSConfiguration) {
        this.cORSConfiguration = cORSConfiguration;
        return this;
    }

    /**
     * <p>
     * The base64-encoded 128-bit MD5 digest of the data. This header must be
     * used as a message integrity check to verify that the request body was not
     * corrupted in transit. For more information, go to <a
     * href="http://www.ietf.org/rfc/rfc1864.txt">RFC 1864.</a>
     * </p>
     *
     * @return <p>
     *         The base64-encoded 128-bit MD5 digest of the data. This header
     *         must be used as a message integrity check to verify that the
     *         request body was not corrupted in transit. For more information,
     *         go to <a href="http://www.ietf.org/rfc/rfc1864.txt">RFC 1864.</a>
     *         </p>
     */
    public String getContentMD5() {
        return contentMD5;
    }

    /**
     * <p>
     * The base64-encoded 128-bit MD5 digest of the data. This header must be
     * used as a message integrity check to verify that the request body was not
     * corrupted in transit. For more information, go to <a
     * href="http://www.ietf.org/rfc/rfc1864.txt">RFC 1864.</a>
     * </p>
     *
     * @param contentMD5 <p>
     *            The base64-encoded 128-bit MD5 digest of the data. This header
     *            must be used as a message integrity check to verify that the
     *            request body was not corrupted in transit. For more
     *            information, go to <a
     *            href="http://www.ietf.org/rfc/rfc1864.txt">RFC 1864.</a>
     *            </p>
     */
    public void setContentMD5(String contentMD5) {
        this.contentMD5 = contentMD5;
    }

    /**
     * <p>
     * The base64-encoded 128-bit MD5 digest of the data. This header must be
     * used as a message integrity check to verify that the request body was not
     * corrupted in transit. For more information, go to <a
     * href="http://www.ietf.org/rfc/rfc1864.txt">RFC 1864.</a>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contentMD5 <p>
     *            The base64-encoded 128-bit MD5 digest of the data. This header
     *            must be used as a message integrity check to verify that the
     *            request body was not corrupted in transit. For more
     *            information, go to <a
     *            href="http://www.ietf.org/rfc/rfc1864.txt">RFC 1864.</a>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutBucketCorsRequest withContentMD5(String contentMD5) {
        this.contentMD5 = contentMD5;
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
        if (getBucket() != null)
            sb.append("Bucket: " + getBucket() + ",");
        if (getCORSConfiguration() != null)
            sb.append("CORSConfiguration: " + getCORSConfiguration() + ",");
        if (getContentMD5() != null)
            sb.append("ContentMD5: " + getContentMD5());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode
                + ((getCORSConfiguration() == null) ? 0 : getCORSConfiguration().hashCode());
        hashCode = prime * hashCode + ((getContentMD5() == null) ? 0 : getContentMD5().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutBucketCorsRequest == false)
            return false;
        PutBucketCorsRequest other = (PutBucketCorsRequest) obj;

        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getCORSConfiguration() == null ^ this.getCORSConfiguration() == null)
            return false;
        if (other.getCORSConfiguration() != null
                && other.getCORSConfiguration().equals(this.getCORSConfiguration()) == false)
            return false;
        if (other.getContentMD5() == null ^ this.getContentMD5() == null)
            return false;
        if (other.getContentMD5() != null
                && other.getContentMD5().equals(this.getContentMD5()) == false)
            return false;
        return true;
    }
}
