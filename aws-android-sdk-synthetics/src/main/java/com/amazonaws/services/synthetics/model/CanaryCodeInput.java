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

package com.amazonaws.services.synthetics.model;

import java.io.Serializable;

/**
 * <p>
 * Use this structure to input your script code for the canary. This structure
 * contains the Lambda handler with the location where the canary should start
 * running the script. If the script is stored in an S3 bucket, the bucket name,
 * key, and version are also included. If the script was passed into the canary
 * directly, the script code is contained in the value of <code>Zipfile</code>.
 * </p>
 */
public class CanaryCodeInput implements Serializable {
    /**
     * <p>
     * If your canary script is located in S3, specify the full bucket name
     * here. The bucket must already exist. Specify the full bucket name,
     * including <code>s3://</code> as the start of the bucket name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String s3Bucket;

    /**
     * <p>
     * The S3 key of your script. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingObjects.html"
     * >Working with Amazon S3 Objects</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String s3Key;

    /**
     * <p>
     * The S3 version ID of your script.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String s3Version;

    /**
     * <p>
     * If you input your canary script directly into the canary instead of
     * referring to an S3 location, the value of this parameter is the .zip file
     * that contains the script. It can be up to 5 MB.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10000000<br/>
     */
    private java.nio.ByteBuffer zipFile;

    /**
     * <p>
     * The entry point to use for the source code when running the canary. This
     * value must end with the string <code>.handler</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String handler;

    /**
     * <p>
     * If your canary script is located in S3, specify the full bucket name
     * here. The bucket must already exist. Specify the full bucket name,
     * including <code>s3://</code> as the start of the bucket name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         If your canary script is located in S3, specify the full bucket
     *         name here. The bucket must already exist. Specify the full bucket
     *         name, including <code>s3://</code> as the start of the bucket
     *         name.
     *         </p>
     */
    public String getS3Bucket() {
        return s3Bucket;
    }

    /**
     * <p>
     * If your canary script is located in S3, specify the full bucket name
     * here. The bucket must already exist. Specify the full bucket name,
     * including <code>s3://</code> as the start of the bucket name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param s3Bucket <p>
     *            If your canary script is located in S3, specify the full
     *            bucket name here. The bucket must already exist. Specify the
     *            full bucket name, including <code>s3://</code> as the start of
     *            the bucket name.
     *            </p>
     */
    public void setS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
    }

    /**
     * <p>
     * If your canary script is located in S3, specify the full bucket name
     * here. The bucket must already exist. Specify the full bucket name,
     * including <code>s3://</code> as the start of the bucket name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param s3Bucket <p>
     *            If your canary script is located in S3, specify the full
     *            bucket name here. The bucket must already exist. Specify the
     *            full bucket name, including <code>s3://</code> as the start of
     *            the bucket name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CanaryCodeInput withS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
        return this;
    }

    /**
     * <p>
     * The S3 key of your script. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingObjects.html"
     * >Working with Amazon S3 Objects</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The S3 key of your script. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingObjects.html"
     *         >Working with Amazon S3 Objects</a>.
     *         </p>
     */
    public String getS3Key() {
        return s3Key;
    }

    /**
     * <p>
     * The S3 key of your script. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingObjects.html"
     * >Working with Amazon S3 Objects</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param s3Key <p>
     *            The S3 key of your script. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingObjects.html"
     *            >Working with Amazon S3 Objects</a>.
     *            </p>
     */
    public void setS3Key(String s3Key) {
        this.s3Key = s3Key;
    }

    /**
     * <p>
     * The S3 key of your script. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingObjects.html"
     * >Working with Amazon S3 Objects</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param s3Key <p>
     *            The S3 key of your script. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingObjects.html"
     *            >Working with Amazon S3 Objects</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CanaryCodeInput withS3Key(String s3Key) {
        this.s3Key = s3Key;
        return this;
    }

    /**
     * <p>
     * The S3 version ID of your script.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The S3 version ID of your script.
     *         </p>
     */
    public String getS3Version() {
        return s3Version;
    }

    /**
     * <p>
     * The S3 version ID of your script.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param s3Version <p>
     *            The S3 version ID of your script.
     *            </p>
     */
    public void setS3Version(String s3Version) {
        this.s3Version = s3Version;
    }

    /**
     * <p>
     * The S3 version ID of your script.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param s3Version <p>
     *            The S3 version ID of your script.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CanaryCodeInput withS3Version(String s3Version) {
        this.s3Version = s3Version;
        return this;
    }

    /**
     * <p>
     * If you input your canary script directly into the canary instead of
     * referring to an S3 location, the value of this parameter is the .zip file
     * that contains the script. It can be up to 5 MB.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10000000<br/>
     *
     * @return <p>
     *         If you input your canary script directly into the canary instead
     *         of referring to an S3 location, the value of this parameter is
     *         the .zip file that contains the script. It can be up to 5 MB.
     *         </p>
     */
    public java.nio.ByteBuffer getZipFile() {
        return zipFile;
    }

    /**
     * <p>
     * If you input your canary script directly into the canary instead of
     * referring to an S3 location, the value of this parameter is the .zip file
     * that contains the script. It can be up to 5 MB.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10000000<br/>
     *
     * @param zipFile <p>
     *            If you input your canary script directly into the canary
     *            instead of referring to an S3 location, the value of this
     *            parameter is the .zip file that contains the script. It can be
     *            up to 5 MB.
     *            </p>
     */
    public void setZipFile(java.nio.ByteBuffer zipFile) {
        this.zipFile = zipFile;
    }

    /**
     * <p>
     * If you input your canary script directly into the canary instead of
     * referring to an S3 location, the value of this parameter is the .zip file
     * that contains the script. It can be up to 5 MB.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 10000000<br/>
     *
     * @param zipFile <p>
     *            If you input your canary script directly into the canary
     *            instead of referring to an S3 location, the value of this
     *            parameter is the .zip file that contains the script. It can be
     *            up to 5 MB.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CanaryCodeInput withZipFile(java.nio.ByteBuffer zipFile) {
        this.zipFile = zipFile;
        return this;
    }

    /**
     * <p>
     * The entry point to use for the source code when running the canary. This
     * value must end with the string <code>.handler</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The entry point to use for the source code when running the
     *         canary. This value must end with the string <code>.handler</code>
     *         .
     *         </p>
     */
    public String getHandler() {
        return handler;
    }

    /**
     * <p>
     * The entry point to use for the source code when running the canary. This
     * value must end with the string <code>.handler</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param handler <p>
     *            The entry point to use for the source code when running the
     *            canary. This value must end with the string
     *            <code>.handler</code>.
     *            </p>
     */
    public void setHandler(String handler) {
        this.handler = handler;
    }

    /**
     * <p>
     * The entry point to use for the source code when running the canary. This
     * value must end with the string <code>.handler</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param handler <p>
     *            The entry point to use for the source code when running the
     *            canary. This value must end with the string
     *            <code>.handler</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CanaryCodeInput withHandler(String handler) {
        this.handler = handler;
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
        if (getS3Bucket() != null)
            sb.append("S3Bucket: " + getS3Bucket() + ",");
        if (getS3Key() != null)
            sb.append("S3Key: " + getS3Key() + ",");
        if (getS3Version() != null)
            sb.append("S3Version: " + getS3Version() + ",");
        if (getZipFile() != null)
            sb.append("ZipFile: " + getZipFile() + ",");
        if (getHandler() != null)
            sb.append("Handler: " + getHandler());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Bucket() == null) ? 0 : getS3Bucket().hashCode());
        hashCode = prime * hashCode + ((getS3Key() == null) ? 0 : getS3Key().hashCode());
        hashCode = prime * hashCode + ((getS3Version() == null) ? 0 : getS3Version().hashCode());
        hashCode = prime * hashCode + ((getZipFile() == null) ? 0 : getZipFile().hashCode());
        hashCode = prime * hashCode + ((getHandler() == null) ? 0 : getHandler().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CanaryCodeInput == false)
            return false;
        CanaryCodeInput other = (CanaryCodeInput) obj;

        if (other.getS3Bucket() == null ^ this.getS3Bucket() == null)
            return false;
        if (other.getS3Bucket() != null && other.getS3Bucket().equals(this.getS3Bucket()) == false)
            return false;
        if (other.getS3Key() == null ^ this.getS3Key() == null)
            return false;
        if (other.getS3Key() != null && other.getS3Key().equals(this.getS3Key()) == false)
            return false;
        if (other.getS3Version() == null ^ this.getS3Version() == null)
            return false;
        if (other.getS3Version() != null
                && other.getS3Version().equals(this.getS3Version()) == false)
            return false;
        if (other.getZipFile() == null ^ this.getZipFile() == null)
            return false;
        if (other.getZipFile() != null && other.getZipFile().equals(this.getZipFile()) == false)
            return false;
        if (other.getHandler() == null ^ this.getHandler() == null)
            return false;
        if (other.getHandler() != null && other.getHandler().equals(this.getHandler()) == false)
            return false;
        return true;
    }
}
