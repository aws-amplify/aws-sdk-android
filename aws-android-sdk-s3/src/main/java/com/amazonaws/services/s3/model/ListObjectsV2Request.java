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
 * a bucket. A <code>200 OK</code> response can contain valid or invalid XML.
 * Make sure to design your application to parse the contents of the response
 * and handle it appropriately.
 * </p>
 * <p>
 * To use this operation, you must have READ access to the bucket.
 * </p>
 * <p>
 * To use this operation in an AWS Identity and Access Management (IAM) policy,
 * you must have permissions to perform the <code>s3:ListBucket</code> action.
 * The bucket owner has this permission by default and can grant this permission
 * to others. For more information about permissions, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
 * >Permissions Related to Bucket Subresource Operations</a> and <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-access-control.html"
 * >Managing Access Permissions to Your Amazon S3 Resources</a>.
 * </p>
 * <important>
 * <p>
 * This section describes the latest revision of the API. We recommend that you
 * use this revised API for application development. For backward compatibility,
 * Amazon S3 continues to support the prior version of this API,
 * <a>ListObjects</a>.
 * </p>
 * </important>
 * <p>
 * To get a list of your buckets, see <a>ListBuckets</a>.
 * </p>
 * <p>
 * The following operations are related to <code>ListObjectsV2</code>:
 * </p>
 * <ul>
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
 * </ul>
 */
public class ListObjectsV2Request extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Bucket name to list.
     * </p>
     * <p>
     * When using this API with an access point, you must direct requests to the
     * access point hostname. The access point hostname takes the form
     * <i>AccessPointName
     * </i>-<i>AccountId</i>.s3-accesspoint.<i>Region</i>.amazonaws.com. When
     * using this operation using an access point through the AWS SDKs, you
     * provide the access point ARN in place of the bucket name. For more
     * information about access point ARNs, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/using-access-points.html"
     * >Using Access Points</a> in the <i>Amazon Simple Storage Service
     * Developer Guide</i>.
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
     * Encoding type used by Amazon S3 to encode object keys in the response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>url
     */
    private String encodingType;

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
     * ContinuationToken indicates Amazon S3 that the list is being continued on
     * this bucket with a token. ContinuationToken is obfuscated and is not a
     * real key.
     * </p>
     */
    private String continuationToken;

    /**
     * <p>
     * The owner field is not present in listV2 by default, if you want to
     * return owner field with each key in the result then set the fetch owner
     * field to true.
     * </p>
     */
    private Boolean fetchOwner;

    /**
     * <p>
     * StartAfter is where you want Amazon S3 to start listing from. Amazon S3
     * starts listing after this specified key. StartAfter can be any key in the
     * bucket.
     * </p>
     */
    private String startAfter;

    /**
     * <p>
     * Confirms that the requester knows that she or he will be charged for the
     * list objects request in V2 style. Bucket owners need not specify this
     * parameter in their requests.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     */
    private String requestPayer;

    /**
     * <p>
     * Bucket name to list.
     * </p>
     * <p>
     * When using this API with an access point, you must direct requests to the
     * access point hostname. The access point hostname takes the form
     * <i>AccessPointName
     * </i>-<i>AccountId</i>.s3-accesspoint.<i>Region</i>.amazonaws.com. When
     * using this operation using an access point through the AWS SDKs, you
     * provide the access point ARN in place of the bucket name. For more
     * information about access point ARNs, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/using-access-points.html"
     * >Using Access Points</a> in the <i>Amazon Simple Storage Service
     * Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         Bucket name to list.
     *         </p>
     *         <p>
     *         When using this API with an access point, you must direct
     *         requests to the access point hostname. The access point hostname
     *         takes the form
     *         <i>AccessPointName</i>-<i>AccountId</i>.s3-accesspoint
     *         .<i>Region</i>.amazonaws.com. When using this operation using an
     *         access point through the AWS SDKs, you provide the access point
     *         ARN in place of the bucket name. For more information about
     *         access point ARNs, see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/dev/using-access-points.html"
     *         >Using Access Points</a> in the <i>Amazon Simple Storage Service
     *         Developer Guide</i>.
     *         </p>
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * <p>
     * Bucket name to list.
     * </p>
     * <p>
     * When using this API with an access point, you must direct requests to the
     * access point hostname. The access point hostname takes the form
     * <i>AccessPointName
     * </i>-<i>AccountId</i>.s3-accesspoint.<i>Region</i>.amazonaws.com. When
     * using this operation using an access point through the AWS SDKs, you
     * provide the access point ARN in place of the bucket name. For more
     * information about access point ARNs, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/using-access-points.html"
     * >Using Access Points</a> in the <i>Amazon Simple Storage Service
     * Developer Guide</i>.
     * </p>
     *
     * @param bucket <p>
     *            Bucket name to list.
     *            </p>
     *            <p>
     *            When using this API with an access point, you must direct
     *            requests to the access point hostname. The access point
     *            hostname takes the form
     *            <i>AccessPointName</i>-<i>AccountId</i>
     *            .s3-accesspoint.<i>Region</i>.amazonaws.com. When using this
     *            operation using an access point through the AWS SDKs, you
     *            provide the access point ARN in place of the bucket name. For
     *            more information about access point ARNs, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/using-access-points.html"
     *            >Using Access Points</a> in the <i>Amazon Simple Storage
     *            Service Developer Guide</i>.
     *            </p>
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * Bucket name to list.
     * </p>
     * <p>
     * When using this API with an access point, you must direct requests to the
     * access point hostname. The access point hostname takes the form
     * <i>AccessPointName
     * </i>-<i>AccountId</i>.s3-accesspoint.<i>Region</i>.amazonaws.com. When
     * using this operation using an access point through the AWS SDKs, you
     * provide the access point ARN in place of the bucket name. For more
     * information about access point ARNs, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/using-access-points.html"
     * >Using Access Points</a> in the <i>Amazon Simple Storage Service
     * Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucket <p>
     *            Bucket name to list.
     *            </p>
     *            <p>
     *            When using this API with an access point, you must direct
     *            requests to the access point hostname. The access point
     *            hostname takes the form
     *            <i>AccessPointName</i>-<i>AccountId</i>
     *            .s3-accesspoint.<i>Region</i>.amazonaws.com. When using this
     *            operation using an access point through the AWS SDKs, you
     *            provide the access point ARN in place of the bucket name. For
     *            more information about access point ARNs, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/using-access-points.html"
     *            >Using Access Points</a> in the <i>Amazon Simple Storage
     *            Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListObjectsV2Request withBucket(String bucket) {
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
    public ListObjectsV2Request withDelimiter(String delimiter) {
        this.delimiter = delimiter;
        return this;
    }

    /**
     * <p>
     * Encoding type used by Amazon S3 to encode object keys in the response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>url
     *
     * @return <p>
     *         Encoding type used by Amazon S3 to encode object keys in the
     *         response.
     *         </p>
     * @see EncodingType
     */
    public String getEncodingType() {
        return encodingType;
    }

    /**
     * <p>
     * Encoding type used by Amazon S3 to encode object keys in the response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>url
     *
     * @param encodingType <p>
     *            Encoding type used by Amazon S3 to encode object keys in the
     *            response.
     *            </p>
     * @see EncodingType
     */
    public void setEncodingType(String encodingType) {
        this.encodingType = encodingType;
    }

    /**
     * <p>
     * Encoding type used by Amazon S3 to encode object keys in the response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>url
     *
     * @param encodingType <p>
     *            Encoding type used by Amazon S3 to encode object keys in the
     *            response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EncodingType
     */
    public ListObjectsV2Request withEncodingType(String encodingType) {
        this.encodingType = encodingType;
        return this;
    }

    /**
     * <p>
     * Encoding type used by Amazon S3 to encode object keys in the response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>url
     *
     * @param encodingType <p>
     *            Encoding type used by Amazon S3 to encode object keys in the
     *            response.
     *            </p>
     * @see EncodingType
     */
    public void setEncodingType(EncodingType encodingType) {
        this.encodingType = encodingType.toString();
    }

    /**
     * <p>
     * Encoding type used by Amazon S3 to encode object keys in the response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>url
     *
     * @param encodingType <p>
     *            Encoding type used by Amazon S3 to encode object keys in the
     *            response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EncodingType
     */
    public ListObjectsV2Request withEncodingType(EncodingType encodingType) {
        this.encodingType = encodingType.toString();
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
    public ListObjectsV2Request withMaxKeys(Integer maxKeys) {
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
    public ListObjectsV2Request withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * <p>
     * ContinuationToken indicates Amazon S3 that the list is being continued on
     * this bucket with a token. ContinuationToken is obfuscated and is not a
     * real key.
     * </p>
     *
     * @return <p>
     *         ContinuationToken indicates Amazon S3 that the list is being
     *         continued on this bucket with a token. ContinuationToken is
     *         obfuscated and is not a real key.
     *         </p>
     */
    public String getContinuationToken() {
        return continuationToken;
    }

    /**
     * <p>
     * ContinuationToken indicates Amazon S3 that the list is being continued on
     * this bucket with a token. ContinuationToken is obfuscated and is not a
     * real key.
     * </p>
     *
     * @param continuationToken <p>
     *            ContinuationToken indicates Amazon S3 that the list is being
     *            continued on this bucket with a token. ContinuationToken is
     *            obfuscated and is not a real key.
     *            </p>
     */
    public void setContinuationToken(String continuationToken) {
        this.continuationToken = continuationToken;
    }

    /**
     * <p>
     * ContinuationToken indicates Amazon S3 that the list is being continued on
     * this bucket with a token. ContinuationToken is obfuscated and is not a
     * real key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param continuationToken <p>
     *            ContinuationToken indicates Amazon S3 that the list is being
     *            continued on this bucket with a token. ContinuationToken is
     *            obfuscated and is not a real key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListObjectsV2Request withContinuationToken(String continuationToken) {
        this.continuationToken = continuationToken;
        return this;
    }

    /**
     * <p>
     * The owner field is not present in listV2 by default, if you want to
     * return owner field with each key in the result then set the fetch owner
     * field to true.
     * </p>
     *
     * @return <p>
     *         The owner field is not present in listV2 by default, if you want
     *         to return owner field with each key in the result then set the
     *         fetch owner field to true.
     *         </p>
     */
    public Boolean isFetchOwner() {
        return fetchOwner;
    }

    /**
     * <p>
     * The owner field is not present in listV2 by default, if you want to
     * return owner field with each key in the result then set the fetch owner
     * field to true.
     * </p>
     *
     * @return <p>
     *         The owner field is not present in listV2 by default, if you want
     *         to return owner field with each key in the result then set the
     *         fetch owner field to true.
     *         </p>
     */
    public Boolean getFetchOwner() {
        return fetchOwner;
    }

    /**
     * <p>
     * The owner field is not present in listV2 by default, if you want to
     * return owner field with each key in the result then set the fetch owner
     * field to true.
     * </p>
     *
     * @param fetchOwner <p>
     *            The owner field is not present in listV2 by default, if you
     *            want to return owner field with each key in the result then
     *            set the fetch owner field to true.
     *            </p>
     */
    public void setFetchOwner(Boolean fetchOwner) {
        this.fetchOwner = fetchOwner;
    }

    /**
     * <p>
     * The owner field is not present in listV2 by default, if you want to
     * return owner field with each key in the result then set the fetch owner
     * field to true.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fetchOwner <p>
     *            The owner field is not present in listV2 by default, if you
     *            want to return owner field with each key in the result then
     *            set the fetch owner field to true.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListObjectsV2Request withFetchOwner(Boolean fetchOwner) {
        this.fetchOwner = fetchOwner;
        return this;
    }

    /**
     * <p>
     * StartAfter is where you want Amazon S3 to start listing from. Amazon S3
     * starts listing after this specified key. StartAfter can be any key in the
     * bucket.
     * </p>
     *
     * @return <p>
     *         StartAfter is where you want Amazon S3 to start listing from.
     *         Amazon S3 starts listing after this specified key. StartAfter can
     *         be any key in the bucket.
     *         </p>
     */
    public String getStartAfter() {
        return startAfter;
    }

    /**
     * <p>
     * StartAfter is where you want Amazon S3 to start listing from. Amazon S3
     * starts listing after this specified key. StartAfter can be any key in the
     * bucket.
     * </p>
     *
     * @param startAfter <p>
     *            StartAfter is where you want Amazon S3 to start listing from.
     *            Amazon S3 starts listing after this specified key. StartAfter
     *            can be any key in the bucket.
     *            </p>
     */
    public void setStartAfter(String startAfter) {
        this.startAfter = startAfter;
    }

    /**
     * <p>
     * StartAfter is where you want Amazon S3 to start listing from. Amazon S3
     * starts listing after this specified key. StartAfter can be any key in the
     * bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startAfter <p>
     *            StartAfter is where you want Amazon S3 to start listing from.
     *            Amazon S3 starts listing after this specified key. StartAfter
     *            can be any key in the bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListObjectsV2Request withStartAfter(String startAfter) {
        this.startAfter = startAfter;
        return this;
    }

    /**
     * <p>
     * Confirms that the requester knows that she or he will be charged for the
     * list objects request in V2 style. Bucket owners need not specify this
     * parameter in their requests.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     *
     * @return <p>
     *         Confirms that the requester knows that she or he will be charged
     *         for the list objects request in V2 style. Bucket owners need not
     *         specify this parameter in their requests.
     *         </p>
     * @see RequestPayer
     */
    public String getRequestPayer() {
        return requestPayer;
    }

    /**
     * <p>
     * Confirms that the requester knows that she or he will be charged for the
     * list objects request in V2 style. Bucket owners need not specify this
     * parameter in their requests.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     *
     * @param requestPayer <p>
     *            Confirms that the requester knows that she or he will be
     *            charged for the list objects request in V2 style. Bucket
     *            owners need not specify this parameter in their requests.
     *            </p>
     * @see RequestPayer
     */
    public void setRequestPayer(String requestPayer) {
        this.requestPayer = requestPayer;
    }

    /**
     * <p>
     * Confirms that the requester knows that she or he will be charged for the
     * list objects request in V2 style. Bucket owners need not specify this
     * parameter in their requests.
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
     *            charged for the list objects request in V2 style. Bucket
     *            owners need not specify this parameter in their requests.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RequestPayer
     */
    public ListObjectsV2Request withRequestPayer(String requestPayer) {
        this.requestPayer = requestPayer;
        return this;
    }

    /**
     * <p>
     * Confirms that the requester knows that she or he will be charged for the
     * list objects request in V2 style. Bucket owners need not specify this
     * parameter in their requests.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     *
     * @param requestPayer <p>
     *            Confirms that the requester knows that she or he will be
     *            charged for the list objects request in V2 style. Bucket
     *            owners need not specify this parameter in their requests.
     *            </p>
     * @see RequestPayer
     */
    public void setRequestPayer(RequestPayer requestPayer) {
        this.requestPayer = requestPayer.toString();
    }

    /**
     * <p>
     * Confirms that the requester knows that she or he will be charged for the
     * list objects request in V2 style. Bucket owners need not specify this
     * parameter in their requests.
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
     *            charged for the list objects request in V2 style. Bucket
     *            owners need not specify this parameter in their requests.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RequestPayer
     */
    public ListObjectsV2Request withRequestPayer(RequestPayer requestPayer) {
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
        if (getMaxKeys() != null)
            sb.append("MaxKeys: " + getMaxKeys() + ",");
        if (getPrefix() != null)
            sb.append("Prefix: " + getPrefix() + ",");
        if (getContinuationToken() != null)
            sb.append("ContinuationToken: " + getContinuationToken() + ",");
        if (getFetchOwner() != null)
            sb.append("FetchOwner: " + getFetchOwner() + ",");
        if (getStartAfter() != null)
            sb.append("StartAfter: " + getStartAfter() + ",");
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
        hashCode = prime * hashCode + ((getMaxKeys() == null) ? 0 : getMaxKeys().hashCode());
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        hashCode = prime * hashCode
                + ((getContinuationToken() == null) ? 0 : getContinuationToken().hashCode());
        hashCode = prime * hashCode + ((getFetchOwner() == null) ? 0 : getFetchOwner().hashCode());
        hashCode = prime * hashCode + ((getStartAfter() == null) ? 0 : getStartAfter().hashCode());
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

        if (obj instanceof ListObjectsV2Request == false)
            return false;
        ListObjectsV2Request other = (ListObjectsV2Request) obj;

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
        if (other.getMaxKeys() == null ^ this.getMaxKeys() == null)
            return false;
        if (other.getMaxKeys() != null && other.getMaxKeys().equals(this.getMaxKeys()) == false)
            return false;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        if (other.getContinuationToken() == null ^ this.getContinuationToken() == null)
            return false;
        if (other.getContinuationToken() != null
                && other.getContinuationToken().equals(this.getContinuationToken()) == false)
            return false;
        if (other.getFetchOwner() == null ^ this.getFetchOwner() == null)
            return false;
        if (other.getFetchOwner() != null
                && other.getFetchOwner().equals(this.getFetchOwner()) == false)
            return false;
        if (other.getStartAfter() == null ^ this.getStartAfter() == null)
            return false;
        if (other.getStartAfter() != null
                && other.getStartAfter().equals(this.getStartAfter()) == false)
            return false;
        if (other.getRequestPayer() == null ^ this.getRequestPayer() == null)
            return false;
        if (other.getRequestPayer() != null
                && other.getRequestPayer().equals(this.getRequestPayer()) == false)
            return false;
        return true;
    }
}
