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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

/**
 * <p>
 * The Amazon S3 data source.
 * </p>
 */
public class AutoMLS3DataSource implements Serializable {
    /**
     * <p>
     * The data type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ManifestFile, S3Prefix
     */
    private String s3DataType;

    /**
     * <p>
     * The URL to the Amazon S3 data source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     */
    private String s3Uri;

    /**
     * <p>
     * The data type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ManifestFile, S3Prefix
     *
     * @return <p>
     *         The data type.
     *         </p>
     * @see AutoMLS3DataType
     */
    public String getS3DataType() {
        return s3DataType;
    }

    /**
     * <p>
     * The data type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ManifestFile, S3Prefix
     *
     * @param s3DataType <p>
     *            The data type.
     *            </p>
     * @see AutoMLS3DataType
     */
    public void setS3DataType(String s3DataType) {
        this.s3DataType = s3DataType;
    }

    /**
     * <p>
     * The data type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ManifestFile, S3Prefix
     *
     * @param s3DataType <p>
     *            The data type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AutoMLS3DataType
     */
    public AutoMLS3DataSource withS3DataType(String s3DataType) {
        this.s3DataType = s3DataType;
        return this;
    }

    /**
     * <p>
     * The data type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ManifestFile, S3Prefix
     *
     * @param s3DataType <p>
     *            The data type.
     *            </p>
     * @see AutoMLS3DataType
     */
    public void setS3DataType(AutoMLS3DataType s3DataType) {
        this.s3DataType = s3DataType.toString();
    }

    /**
     * <p>
     * The data type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ManifestFile, S3Prefix
     *
     * @param s3DataType <p>
     *            The data type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AutoMLS3DataType
     */
    public AutoMLS3DataSource withS3DataType(AutoMLS3DataType s3DataType) {
        this.s3DataType = s3DataType.toString();
        return this;
    }

    /**
     * <p>
     * The URL to the Amazon S3 data source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     *
     * @return <p>
     *         The URL to the Amazon S3 data source.
     *         </p>
     */
    public String getS3Uri() {
        return s3Uri;
    }

    /**
     * <p>
     * The URL to the Amazon S3 data source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     *
     * @param s3Uri <p>
     *            The URL to the Amazon S3 data source.
     *            </p>
     */
    public void setS3Uri(String s3Uri) {
        this.s3Uri = s3Uri;
    }

    /**
     * <p>
     * The URL to the Amazon S3 data source.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     *
     * @param s3Uri <p>
     *            The URL to the Amazon S3 data source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoMLS3DataSource withS3Uri(String s3Uri) {
        this.s3Uri = s3Uri;
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
        if (getS3DataType() != null)
            sb.append("S3DataType: " + getS3DataType() + ",");
        if (getS3Uri() != null)
            sb.append("S3Uri: " + getS3Uri());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3DataType() == null) ? 0 : getS3DataType().hashCode());
        hashCode = prime * hashCode + ((getS3Uri() == null) ? 0 : getS3Uri().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoMLS3DataSource == false)
            return false;
        AutoMLS3DataSource other = (AutoMLS3DataSource) obj;

        if (other.getS3DataType() == null ^ this.getS3DataType() == null)
            return false;
        if (other.getS3DataType() != null
                && other.getS3DataType().equals(this.getS3DataType()) == false)
            return false;
        if (other.getS3Uri() == null ^ this.getS3Uri() == null)
            return false;
        if (other.getS3Uri() != null && other.getS3Uri().equals(this.getS3Uri()) == false)
            return false;
        return true;
    }
}
