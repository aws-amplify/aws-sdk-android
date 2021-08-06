/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.textract.model;

import java.io.Serializable;

/**
 * <p>
 * The S3 bucket name and file name that identifies the document.
 * </p>
 * <p>
 * The AWS Region for the S3 bucket that contains the document must match the
 * Region that you use for Amazon Textract operations.
 * </p>
 * <p>
 * For Amazon Textract to process a file in an S3 bucket, the user must have
 * permission to access the S3 bucket and file.
 * </p>
 */
public class S3Object implements Serializable {
    /**
     * <p>
     * The name of the S3 bucket. Note that the # character is not valid in the
     * file name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[0-9A-Za-z\.\-_]*<br/>
     */
    private String bucket;

    /**
     * <p>
     * The file name of the input document. Synchronous operations can use image
     * files that are in JPEG or PNG format. Asynchronous operations also
     * support PDF format files.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String name;

    /**
     * <p>
     * If the bucket has versioning enabled, you can specify the object version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String version;

    /**
     * <p>
     * The name of the S3 bucket. Note that the # character is not valid in the
     * file name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[0-9A-Za-z\.\-_]*<br/>
     *
     * @return <p>
     *         The name of the S3 bucket. Note that the # character is not valid
     *         in the file name.
     *         </p>
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * <p>
     * The name of the S3 bucket. Note that the # character is not valid in the
     * file name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[0-9A-Za-z\.\-_]*<br/>
     *
     * @param bucket <p>
     *            The name of the S3 bucket. Note that the # character is not
     *            valid in the file name.
     *            </p>
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The name of the S3 bucket. Note that the # character is not valid in the
     * file name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[0-9A-Za-z\.\-_]*<br/>
     *
     * @param bucket <p>
     *            The name of the S3 bucket. Note that the # character is not
     *            valid in the file name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Object withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * <p>
     * The file name of the input document. Synchronous operations can use image
     * files that are in JPEG or PNG format. Asynchronous operations also
     * support PDF format files.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The file name of the input document. Synchronous operations can
     *         use image files that are in JPEG or PNG format. Asynchronous
     *         operations also support PDF format files.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The file name of the input document. Synchronous operations can use image
     * files that are in JPEG or PNG format. Asynchronous operations also
     * support PDF format files.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param name <p>
     *            The file name of the input document. Synchronous operations
     *            can use image files that are in JPEG or PNG format.
     *            Asynchronous operations also support PDF format files.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The file name of the input document. Synchronous operations can use image
     * files that are in JPEG or PNG format. Asynchronous operations also
     * support PDF format files.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param name <p>
     *            The file name of the input document. Synchronous operations
     *            can use image files that are in JPEG or PNG format.
     *            Asynchronous operations also support PDF format files.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Object withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * If the bucket has versioning enabled, you can specify the object version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         If the bucket has versioning enabled, you can specify the object
     *         version.
     *         </p>
     */
    public String getVersion() {
        return version;
    }

    /**
     * <p>
     * If the bucket has versioning enabled, you can specify the object version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param version <p>
     *            If the bucket has versioning enabled, you can specify the
     *            object version.
     *            </p>
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * If the bucket has versioning enabled, you can specify the object version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param version <p>
     *            If the bucket has versioning enabled, you can specify the
     *            object version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Object withVersion(String version) {
        this.version = version;
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getVersion() != null)
            sb.append("Version: " + getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3Object == false)
            return false;
        S3Object other = (S3Object) obj;

        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }
}
