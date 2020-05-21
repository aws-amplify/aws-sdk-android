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
 * Returns some or all (up to 1,000) of the objects in a bucket. You can use the
 * request parameters as selection criteria to return a subset of the objects in
 * a bucket. A 200 OK response can contain valid or invalid XML. Be sure to
 * design your application to parse the contents of the response and handle it
 * appropriately.
 * </p>
 * <important>
 * <p>
 * This API has been revised. We recommend that you use the newer version,
 * <a>ListObjectsV2</a>, when developing applications. For backward
 * compatibility, Amazon S3 continues to support <code>ListObjects</code>.
 * </p>
 * </important>
 * <p>
 * The following operations are related to <code>ListObjects</code>:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>ListObjectsV2</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetObject</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>PutObject</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>CreateBucket</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListBuckets</a>
 * </p>
 * </li>
 * </ul>
 */
public class ListObjectsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the bucket containing the objects.
     * </p>
     */
    private String bucket;

    /**
     * <p>
     * A delimiter is a character you use to group keys.
     * </p>
     */
    private String delimiter;

    /**
     * <p>
     * Requests Amazon S3 to encode the object keys in the response and
     * specifies the encoding method to use. An object key may contain any
     * Unicode character; however, XML 1.0 parser cannot parse some characters,
     * such as characters with an ASCII value from 0 to 10. For characters that
     * are not supported in XML 1.0, you can add this parameter to request that
     * Amazon S3 encode the keys in the response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>url
     */
    private String encodingType;

    /**
     * <p>
     * Specifies the key to start with when listing objects in a bucket.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * Sets the maximum number of keys returned in the response. By default the
     * API returns up to 1,000 key names. The response might contain fewer keys
     * but will never contain more.
     * </p>
     */
    private Integer maxKeys;

    /**
     * <p>
     * Limits the response to keys that begin with the specified prefix.
     * </p>
     */
    private String prefix;

    /**
     * <p>
     * Confirms that the requester knows that she or he will be charged for the
     * list objects request. Bucket owners need not specify this parameter in
     * their requests.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     */
    private String requestPayer;

    /**
     * <p>
     * The name of the bucket containing the objects.
     * </p>
     *
     * @return <p>
     *         The name of the bucket containing the objects.
     *         </p>
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * <p>
     * The name of the bucket containing the objects.
     * </p>
     *
     * @param bucket <p>
     *            The name of the bucket containing the objects.
     *            </p>
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The name of the bucket containing the objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucket <p>
     *            The name of the bucket containing the objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListObjectsRequest withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * <p>
     * A delimiter is a character you use to group keys.
     * </p>
     *
     * @return <p>
     *         A delimiter is a character you use to group keys.
     *         </p>
     */
    public String getDelimiter() {
        return delimiter;
    }

    /**
     * <p>
     * A delimiter is a character you use to group keys.
     * </p>
     *
     * @param delimiter <p>
     *            A delimiter is a character you use to group keys.
     *            </p>
     */
    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    /**
     * <p>
     * A delimiter is a character you use to group keys.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param delimiter <p>
     *            A delimiter is a character you use to group keys.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListObjectsRequest withDelimiter(String delimiter) {
        this.delimiter = delimiter;
        return this;
    }

    /**
     * <p>
     * Requests Amazon S3 to encode the object keys in the response and
     * specifies the encoding method to use. An object key may contain any
     * Unicode character; however, XML 1.0 parser cannot parse some characters,
     * such as characters with an ASCII value from 0 to 10. For characters that
     * are not supported in XML 1.0, you can add this parameter to request that
     * Amazon S3 encode the keys in the response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>url
     *
     * @return <p>
     *         Requests Amazon S3 to encode the object keys in the response and
     *         specifies the encoding method to use. An object key may contain
     *         any Unicode character; however, XML 1.0 parser cannot parse some
     *         characters, such as characters with an ASCII value from 0 to 10.
     *         For characters that are not supported in XML 1.0, you can add
     *         this parameter to request that Amazon S3 encode the keys in the
     *         response.
     *         </p>
     * @see EncodingType
     */
    public String getEncodingType() {
        return encodingType;
    }

    /**
     * <p>
     * Requests Amazon S3 to encode the object keys in the response and
     * specifies the encoding method to use. An object key may contain any
     * Unicode character; however, XML 1.0 parser cannot parse some characters,
     * such as characters with an ASCII value from 0 to 10. For characters that
     * are not supported in XML 1.0, you can add this parameter to request that
     * Amazon S3 encode the keys in the response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>url
     *
     * @param encodingType <p>
     *            Requests Amazon S3 to encode the object keys in the response
     *            and specifies the encoding method to use. An object key may
     *            contain any Unicode character; however, XML 1.0 parser cannot
     *            parse some characters, such as characters with an ASCII value
     *            from 0 to 10. For characters that are not supported in XML
     *            1.0, you can add this parameter to request that Amazon S3
     *            encode the keys in the response.
     *            </p>
     * @see EncodingType
     */
    public void setEncodingType(String encodingType) {
        this.encodingType = encodingType;
    }

    /**
     * <p>
     * Requests Amazon S3 to encode the object keys in the response and
     * specifies the encoding method to use. An object key may contain any
     * Unicode character; however, XML 1.0 parser cannot parse some characters,
     * such as characters with an ASCII value from 0 to 10. For characters that
     * are not supported in XML 1.0, you can add this parameter to request that
     * Amazon S3 encode the keys in the response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>url
     *
     * @param encodingType <p>
     *            Requests Amazon S3 to encode the object keys in the response
     *            and specifies the encoding method to use. An object key may
     *            contain any Unicode character; however, XML 1.0 parser cannot
     *            parse some characters, such as characters with an ASCII value
     *            from 0 to 10. For characters that are not supported in XML
     *            1.0, you can add this parameter to request that Amazon S3
     *            encode the keys in the response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EncodingType
     */
    public ListObjectsRequest withEncodingType(String encodingType) {
        this.encodingType = encodingType;
        return this;
    }

    /**
     * <p>
     * Requests Amazon S3 to encode the object keys in the response and
     * specifies the encoding method to use. An object key may contain any
     * Unicode character; however, XML 1.0 parser cannot parse some characters,
     * such as characters with an ASCII value from 0 to 10. For characters that
     * are not supported in XML 1.0, you can add this parameter to request that
     * Amazon S3 encode the keys in the response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>url
     *
     * @param encodingType <p>
     *            Requests Amazon S3 to encode the object keys in the response
     *            and specifies the encoding method to use. An object key may
     *            contain any Unicode character; however, XML 1.0 parser cannot
     *            parse some characters, such as characters with an ASCII value
     *            from 0 to 10. For characters that are not supported in XML
     *            1.0, you can add this parameter to request that Amazon S3
     *            encode the keys in the response.
     *            </p>
     * @see EncodingType
     */
    public void setEncodingType(EncodingType encodingType) {
        this.encodingType = encodingType.toString();
    }

    /**
     * <p>
     * Requests Amazon S3 to encode the object keys in the response and
     * specifies the encoding method to use. An object key may contain any
     * Unicode character; however, XML 1.0 parser cannot parse some characters,
     * such as characters with an ASCII value from 0 to 10. For characters that
     * are not supported in XML 1.0, you can add this parameter to request that
     * Amazon S3 encode the keys in the response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>url
     *
     * @param encodingType <p>
     *            Requests Amazon S3 to encode the object keys in the response
     *            and specifies the encoding method to use. An object key may
     *            contain any Unicode character; however, XML 1.0 parser cannot
     *            parse some characters, such as characters with an ASCII value
     *            from 0 to 10. For characters that are not supported in XML
     *            1.0, you can add this parameter to request that Amazon S3
     *            encode the keys in the response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EncodingType
     */
    public ListObjectsRequest withEncodingType(EncodingType encodingType) {
        this.encodingType = encodingType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the key to start with when listing objects in a bucket.
     * </p>
     *
     * @return <p>
     *         Specifies the key to start with when listing objects in a bucket.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * Specifies the key to start with when listing objects in a bucket.
     * </p>
     *
     * @param marker <p>
     *            Specifies the key to start with when listing objects in a
     *            bucket.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * Specifies the key to start with when listing objects in a bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            Specifies the key to start with when listing objects in a
     *            bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListObjectsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * Sets the maximum number of keys returned in the response. By default the
     * API returns up to 1,000 key names. The response might contain fewer keys
     * but will never contain more.
     * </p>
     *
     * @return <p>
     *         Sets the maximum number of keys returned in the response. By
     *         default the API returns up to 1,000 key names. The response might
     *         contain fewer keys but will never contain more.
     *         </p>
     */
    public Integer getMaxKeys() {
        return maxKeys;
    }

    /**
     * <p>
     * Sets the maximum number of keys returned in the response. By default the
     * API returns up to 1,000 key names. The response might contain fewer keys
     * but will never contain more.
     * </p>
     *
     * @param maxKeys <p>
     *            Sets the maximum number of keys returned in the response. By
     *            default the API returns up to 1,000 key names. The response
     *            might contain fewer keys but will never contain more.
     *            </p>
     */
    public void setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
    }

    /**
     * <p>
     * Sets the maximum number of keys returned in the response. By default the
     * API returns up to 1,000 key names. The response might contain fewer keys
     * but will never contain more.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxKeys <p>
     *            Sets the maximum number of keys returned in the response. By
     *            default the API returns up to 1,000 key names. The response
     *            might contain fewer keys but will never contain more.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListObjectsRequest withMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }

    /**
     * <p>
     * Limits the response to keys that begin with the specified prefix.
     * </p>
     *
     * @return <p>
     *         Limits the response to keys that begin with the specified prefix.
     *         </p>
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * <p>
     * Limits the response to keys that begin with the specified prefix.
     * </p>
     *
     * @param prefix <p>
     *            Limits the response to keys that begin with the specified
     *            prefix.
     *            </p>
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * Limits the response to keys that begin with the specified prefix.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param prefix <p>
     *            Limits the response to keys that begin with the specified
     *            prefix.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListObjectsRequest withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * <p>
     * Confirms that the requester knows that she or he will be charged for the
     * list objects request. Bucket owners need not specify this parameter in
     * their requests.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     *
     * @return <p>
     *         Confirms that the requester knows that she or he will be charged
     *         for the list objects request. Bucket owners need not specify this
     *         parameter in their requests.
     *         </p>
     * @see RequestPayer
     */
    public String getRequestPayer() {
        return requestPayer;
    }

    /**
     * <p>
     * Confirms that the requester knows that she or he will be charged for the
     * list objects request. Bucket owners need not specify this parameter in
     * their requests.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     *
     * @param requestPayer <p>
     *            Confirms that the requester knows that she or he will be
     *            charged for the list objects request. Bucket owners need not
     *            specify this parameter in their requests.
     *            </p>
     * @see RequestPayer
     */
    public void setRequestPayer(String requestPayer) {
        this.requestPayer = requestPayer;
    }

    /**
     * <p>
     * Confirms that the requester knows that she or he will be charged for the
     * list objects request. Bucket owners need not specify this parameter in
     * their requests.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     *
     * @param requestPayer <p>
     *            Confirms that the requester knows that she or he will be
     *            charged for the list objects request. Bucket owners need not
     *            specify this parameter in their requests.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RequestPayer
     */
    public ListObjectsRequest withRequestPayer(String requestPayer) {
        this.requestPayer = requestPayer;
        return this;
    }

    /**
     * <p>
     * Confirms that the requester knows that she or he will be charged for the
     * list objects request. Bucket owners need not specify this parameter in
     * their requests.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     *
     * @param requestPayer <p>
     *            Confirms that the requester knows that she or he will be
     *            charged for the list objects request. Bucket owners need not
     *            specify this parameter in their requests.
     *            </p>
     * @see RequestPayer
     */
    public void setRequestPayer(RequestPayer requestPayer) {
        this.requestPayer = requestPayer.toString();
    }

    /**
     * <p>
     * Confirms that the requester knows that she or he will be charged for the
     * list objects request. Bucket owners need not specify this parameter in
     * their requests.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     *
     * @param requestPayer <p>
     *            Confirms that the requester knows that she or he will be
     *            charged for the list objects request. Bucket owners need not
     *            specify this parameter in their requests.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RequestPayer
     */
    public ListObjectsRequest withRequestPayer(RequestPayer requestPayer) {
        this.requestPayer = requestPayer.toString();
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
        if (getDelimiter() != null)
            sb.append("Delimiter: " + getDelimiter() + ",");
        if (getEncodingType() != null)
            sb.append("EncodingType: " + getEncodingType() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getMaxKeys() != null)
            sb.append("MaxKeys: " + getMaxKeys() + ",");
        if (getPrefix() != null)
            sb.append("Prefix: " + getPrefix() + ",");
        if (getRequestPayer() != null)
            sb.append("RequestPayer: " + getRequestPayer());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getDelimiter() == null) ? 0 : getDelimiter().hashCode());
        hashCode = prime * hashCode
                + ((getEncodingType() == null) ? 0 : getEncodingType().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getMaxKeys() == null) ? 0 : getMaxKeys().hashCode());
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        hashCode = prime * hashCode
                + ((getRequestPayer() == null) ? 0 : getRequestPayer().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListObjectsRequest == false)
            return false;
        ListObjectsRequest other = (ListObjectsRequest) obj;

        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getDelimiter() == null ^ this.getDelimiter() == null)
            return false;
        if (other.getDelimiter() != null
                && other.getDelimiter().equals(this.getDelimiter()) == false)
            return false;
        if (other.getEncodingType() == null ^ this.getEncodingType() == null)
            return false;
        if (other.getEncodingType() != null
                && other.getEncodingType().equals(this.getEncodingType()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getMaxKeys() == null ^ this.getMaxKeys() == null)
            return false;
        if (other.getMaxKeys() != null && other.getMaxKeys().equals(this.getMaxKeys()) == false)
            return false;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        if (other.getRequestPayer() == null ^ this.getRequestPayer() == null)
            return false;
        if (other.getRequestPayer() != null
                && other.getRequestPayer().equals(this.getRequestPayer()) == false)
            return false;
        return true;
    }
}
