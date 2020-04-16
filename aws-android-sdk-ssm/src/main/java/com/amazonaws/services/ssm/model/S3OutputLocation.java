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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

/**
 * <p>
 * An Amazon S3 bucket where you want to store the results of this request.
 * </p>
 */
public class S3OutputLocation implements Serializable {
    /**
     * <p>
     * (Deprecated) You can no longer specify this parameter. The system ignores
     * it. Instead, Systems Manager automatically determines the Amazon S3
     * bucket region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 20<br/>
     */
    private String outputS3Region;

    /**
     * <p>
     * The name of the Amazon S3 bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 63<br/>
     */
    private String outputS3BucketName;

    /**
     * <p>
     * The Amazon S3 bucket subfolder.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     */
    private String outputS3KeyPrefix;

    /**
     * <p>
     * (Deprecated) You can no longer specify this parameter. The system ignores
     * it. Instead, Systems Manager automatically determines the Amazon S3
     * bucket region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 20<br/>
     *
     * @return <p>
     *         (Deprecated) You can no longer specify this parameter. The system
     *         ignores it. Instead, Systems Manager automatically determines the
     *         Amazon S3 bucket region.
     *         </p>
     */
    public String getOutputS3Region() {
        return outputS3Region;
    }

    /**
     * <p>
     * (Deprecated) You can no longer specify this parameter. The system ignores
     * it. Instead, Systems Manager automatically determines the Amazon S3
     * bucket region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 20<br/>
     *
     * @param outputS3Region <p>
     *            (Deprecated) You can no longer specify this parameter. The
     *            system ignores it. Instead, Systems Manager automatically
     *            determines the Amazon S3 bucket region.
     *            </p>
     */
    public void setOutputS3Region(String outputS3Region) {
        this.outputS3Region = outputS3Region;
    }

    /**
     * <p>
     * (Deprecated) You can no longer specify this parameter. The system ignores
     * it. Instead, Systems Manager automatically determines the Amazon S3
     * bucket region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 20<br/>
     *
     * @param outputS3Region <p>
     *            (Deprecated) You can no longer specify this parameter. The
     *            system ignores it. Instead, Systems Manager automatically
     *            determines the Amazon S3 bucket region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3OutputLocation withOutputS3Region(String outputS3Region) {
        this.outputS3Region = outputS3Region;
        return this;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 63<br/>
     *
     * @return <p>
     *         The name of the Amazon S3 bucket.
     *         </p>
     */
    public String getOutputS3BucketName() {
        return outputS3BucketName;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 63<br/>
     *
     * @param outputS3BucketName <p>
     *            The name of the Amazon S3 bucket.
     *            </p>
     */
    public void setOutputS3BucketName(String outputS3BucketName) {
        this.outputS3BucketName = outputS3BucketName;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 63<br/>
     *
     * @param outputS3BucketName <p>
     *            The name of the Amazon S3 bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3OutputLocation withOutputS3BucketName(String outputS3BucketName) {
        this.outputS3BucketName = outputS3BucketName;
        return this;
    }

    /**
     * <p>
     * The Amazon S3 bucket subfolder.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @return <p>
     *         The Amazon S3 bucket subfolder.
     *         </p>
     */
    public String getOutputS3KeyPrefix() {
        return outputS3KeyPrefix;
    }

    /**
     * <p>
     * The Amazon S3 bucket subfolder.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @param outputS3KeyPrefix <p>
     *            The Amazon S3 bucket subfolder.
     *            </p>
     */
    public void setOutputS3KeyPrefix(String outputS3KeyPrefix) {
        this.outputS3KeyPrefix = outputS3KeyPrefix;
    }

    /**
     * <p>
     * The Amazon S3 bucket subfolder.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @param outputS3KeyPrefix <p>
     *            The Amazon S3 bucket subfolder.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3OutputLocation withOutputS3KeyPrefix(String outputS3KeyPrefix) {
        this.outputS3KeyPrefix = outputS3KeyPrefix;
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
        if (getOutputS3Region() != null)
            sb.append("OutputS3Region: " + getOutputS3Region() + ",");
        if (getOutputS3BucketName() != null)
            sb.append("OutputS3BucketName: " + getOutputS3BucketName() + ",");
        if (getOutputS3KeyPrefix() != null)
            sb.append("OutputS3KeyPrefix: " + getOutputS3KeyPrefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getOutputS3Region() == null) ? 0 : getOutputS3Region().hashCode());
        hashCode = prime * hashCode
                + ((getOutputS3BucketName() == null) ? 0 : getOutputS3BucketName().hashCode());
        hashCode = prime * hashCode
                + ((getOutputS3KeyPrefix() == null) ? 0 : getOutputS3KeyPrefix().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3OutputLocation == false)
            return false;
        S3OutputLocation other = (S3OutputLocation) obj;

        if (other.getOutputS3Region() == null ^ this.getOutputS3Region() == null)
            return false;
        if (other.getOutputS3Region() != null
                && other.getOutputS3Region().equals(this.getOutputS3Region()) == false)
            return false;
        if (other.getOutputS3BucketName() == null ^ this.getOutputS3BucketName() == null)
            return false;
        if (other.getOutputS3BucketName() != null
                && other.getOutputS3BucketName().equals(this.getOutputS3BucketName()) == false)
            return false;
        if (other.getOutputS3KeyPrefix() == null ^ this.getOutputS3KeyPrefix() == null)
            return false;
        if (other.getOutputS3KeyPrefix() != null
                && other.getOutputS3KeyPrefix().equals(this.getOutputS3KeyPrefix()) == false)
            return false;
        return true;
    }
}
