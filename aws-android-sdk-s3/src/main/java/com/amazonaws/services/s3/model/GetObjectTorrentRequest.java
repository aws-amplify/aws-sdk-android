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
 * Return torrent files from a bucket. BitTorrent can save you bandwidth when
 * you're distributing large files. For more information about BitTorrent, see
 * <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/S3Torrent.html">
 * Amazon S3 Torrent</a>.
 * </p>
 * <note>
 * <p>
 * You can get torrent only for objects that are less than 5 GB in size and that
 * are not encrypted using server-side encryption with customer-provided
 * encryption key.
 * </p>
 * </note>
 * <p>
 * To use GET, you must have READ access to the object.
 * </p>
 * <p>
 * The following operation is related to <code>GetObjectTorrent</code>:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>GetObject</a>
 * </p>
 * </li>
 * </ul>
 */
public class GetObjectTorrentRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the bucket containing the object for which to get the torrent
     * files.
     * </p>
     */
    private String bucket;

    /**
     * <p>
     * The object key for which to get the information.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String key;

    /**
     * <p>
     * Confirms that the requester knows that they will be charged for the
     * request. Bucket owners need not specify this parameter in their requests.
     * For information about downloading objects from requester pays buckets,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html"
     * >Downloading Objects in Requestor Pays Buckets</a> in the <i>Amazon S3
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     */
    private String requestPayer;

    /**
     * <p>
     * The name of the bucket containing the object for which to get the torrent
     * files.
     * </p>
     *
     * @return <p>
     *         The name of the bucket containing the object for which to get the
     *         torrent files.
     *         </p>
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * <p>
     * The name of the bucket containing the object for which to get the torrent
     * files.
     * </p>
     *
     * @param bucket <p>
     *            The name of the bucket containing the object for which to get
     *            the torrent files.
     *            </p>
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The name of the bucket containing the object for which to get the torrent
     * files.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucket <p>
     *            The name of the bucket containing the object for which to get
     *            the torrent files.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetObjectTorrentRequest withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * <p>
     * The object key for which to get the information.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The object key for which to get the information.
     *         </p>
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>
     * The object key for which to get the information.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param key <p>
     *            The object key for which to get the information.
     *            </p>
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The object key for which to get the information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param key <p>
     *            The object key for which to get the information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetObjectTorrentRequest withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>
     * Confirms that the requester knows that they will be charged for the
     * request. Bucket owners need not specify this parameter in their requests.
     * For information about downloading objects from requester pays buckets,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html"
     * >Downloading Objects in Requestor Pays Buckets</a> in the <i>Amazon S3
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     *
     * @return <p>
     *         Confirms that the requester knows that they will be charged for
     *         the request. Bucket owners need not specify this parameter in
     *         their requests. For information about downloading objects from
     *         requester pays buckets, see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html"
     *         >Downloading Objects in Requestor Pays Buckets</a> in the
     *         <i>Amazon S3 Developer Guide</i>.
     *         </p>
     * @see RequestPayer
     */
    public String getRequestPayer() {
        return requestPayer;
    }

    /**
     * <p>
     * Confirms that the requester knows that they will be charged for the
     * request. Bucket owners need not specify this parameter in their requests.
     * For information about downloading objects from requester pays buckets,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html"
     * >Downloading Objects in Requestor Pays Buckets</a> in the <i>Amazon S3
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     *
     * @param requestPayer <p>
     *            Confirms that the requester knows that they will be charged
     *            for the request. Bucket owners need not specify this parameter
     *            in their requests. For information about downloading objects
     *            from requester pays buckets, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html"
     *            >Downloading Objects in Requestor Pays Buckets</a> in the
     *            <i>Amazon S3 Developer Guide</i>.
     *            </p>
     * @see RequestPayer
     */
    public void setRequestPayer(String requestPayer) {
        this.requestPayer = requestPayer;
    }

    /**
     * <p>
     * Confirms that the requester knows that they will be charged for the
     * request. Bucket owners need not specify this parameter in their requests.
     * For information about downloading objects from requester pays buckets,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html"
     * >Downloading Objects in Requestor Pays Buckets</a> in the <i>Amazon S3
     * Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     *
     * @param requestPayer <p>
     *            Confirms that the requester knows that they will be charged
     *            for the request. Bucket owners need not specify this parameter
     *            in their requests. For information about downloading objects
     *            from requester pays buckets, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html"
     *            >Downloading Objects in Requestor Pays Buckets</a> in the
     *            <i>Amazon S3 Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RequestPayer
     */
    public GetObjectTorrentRequest withRequestPayer(String requestPayer) {
        this.requestPayer = requestPayer;
        return this;
    }

    /**
     * <p>
     * Confirms that the requester knows that they will be charged for the
     * request. Bucket owners need not specify this parameter in their requests.
     * For information about downloading objects from requester pays buckets,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html"
     * >Downloading Objects in Requestor Pays Buckets</a> in the <i>Amazon S3
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     *
     * @param requestPayer <p>
     *            Confirms that the requester knows that they will be charged
     *            for the request. Bucket owners need not specify this parameter
     *            in their requests. For information about downloading objects
     *            from requester pays buckets, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html"
     *            >Downloading Objects in Requestor Pays Buckets</a> in the
     *            <i>Amazon S3 Developer Guide</i>.
     *            </p>
     * @see RequestPayer
     */
    public void setRequestPayer(RequestPayer requestPayer) {
        this.requestPayer = requestPayer.toString();
    }

    /**
     * <p>
     * Confirms that the requester knows that they will be charged for the
     * request. Bucket owners need not specify this parameter in their requests.
     * For information about downloading objects from requester pays buckets,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html"
     * >Downloading Objects in Requestor Pays Buckets</a> in the <i>Amazon S3
     * Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     *
     * @param requestPayer <p>
     *            Confirms that the requester knows that they will be charged
     *            for the request. Bucket owners need not specify this parameter
     *            in their requests. For information about downloading objects
     *            from requester pays buckets, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html"
     *            >Downloading Objects in Requestor Pays Buckets</a> in the
     *            <i>Amazon S3 Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RequestPayer
     */
    public GetObjectTorrentRequest withRequestPayer(RequestPayer requestPayer) {
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
        if (getKey() != null)
            sb.append("Key: " + getKey() + ",");
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
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
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

        if (obj instanceof GetObjectTorrentRequest == false)
            return false;
        GetObjectTorrentRequest other = (GetObjectTorrentRequest) obj;

        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getRequestPayer() == null ^ this.getRequestPayer() == null)
            return false;
        if (other.getRequestPayer() != null
                && other.getRequestPayer().equals(this.getRequestPayer()) == false)
            return false;
        return true;
    }
}
