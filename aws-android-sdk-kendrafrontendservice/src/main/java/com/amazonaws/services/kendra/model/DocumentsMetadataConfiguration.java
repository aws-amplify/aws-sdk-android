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

package com.amazonaws.services.kendra.model;

import java.io.Serializable;

/**
 * <p>
 * Document metadata files that contain information such as the document access
 * control information, source URI, document author, and custom attributes. Each
 * metadata file contains metadata about a single document.
 * </p>
 */
public class DocumentsMetadataConfiguration implements Serializable {
    /**
     * <p>
     * A prefix used to filter metadata configuration files in the AWS S3
     * bucket. The S3 bucket might contain multiple metadata files. Use
     * <code>S3Prefix</code> to include only the desired metadata files.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String s3Prefix;

    /**
     * <p>
     * A prefix used to filter metadata configuration files in the AWS S3
     * bucket. The S3 bucket might contain multiple metadata files. Use
     * <code>S3Prefix</code> to include only the desired metadata files.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         A prefix used to filter metadata configuration files in the AWS
     *         S3 bucket. The S3 bucket might contain multiple metadata files.
     *         Use <code>S3Prefix</code> to include only the desired metadata
     *         files.
     *         </p>
     */
    public String getS3Prefix() {
        return s3Prefix;
    }

    /**
     * <p>
     * A prefix used to filter metadata configuration files in the AWS S3
     * bucket. The S3 bucket might contain multiple metadata files. Use
     * <code>S3Prefix</code> to include only the desired metadata files.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param s3Prefix <p>
     *            A prefix used to filter metadata configuration files in the
     *            AWS S3 bucket. The S3 bucket might contain multiple metadata
     *            files. Use <code>S3Prefix</code> to include only the desired
     *            metadata files.
     *            </p>
     */
    public void setS3Prefix(String s3Prefix) {
        this.s3Prefix = s3Prefix;
    }

    /**
     * <p>
     * A prefix used to filter metadata configuration files in the AWS S3
     * bucket. The S3 bucket might contain multiple metadata files. Use
     * <code>S3Prefix</code> to include only the desired metadata files.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param s3Prefix <p>
     *            A prefix used to filter metadata configuration files in the
     *            AWS S3 bucket. The S3 bucket might contain multiple metadata
     *            files. Use <code>S3Prefix</code> to include only the desired
     *            metadata files.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentsMetadataConfiguration withS3Prefix(String s3Prefix) {
        this.s3Prefix = s3Prefix;
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
        if (getS3Prefix() != null)
            sb.append("S3Prefix: " + getS3Prefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Prefix() == null) ? 0 : getS3Prefix().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DocumentsMetadataConfiguration == false)
            return false;
        DocumentsMetadataConfiguration other = (DocumentsMetadataConfiguration) obj;

        if (other.getS3Prefix() == null ^ this.getS3Prefix() == null)
            return false;
        if (other.getS3Prefix() != null && other.getS3Prefix().equals(this.getS3Prefix()) == false)
            return false;
        return true;
    }
}
