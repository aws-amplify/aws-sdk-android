/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The dataset configuration options for a given version of an adapter. Can
 * include an Amazon S3 bucket if specified.
 * </p>
 */
public class AdapterVersionDatasetConfig implements Serializable {
    /**
     * <p>
     * The S3 bucket name and file name that identifies the document.
     * </p>
     * <p>
     * The AWS Region for the S3 bucket that contains the document must match
     * the Region that you use for Amazon Textract operations.
     * </p>
     * <p>
     * For Amazon Textract to process a file in an S3 bucket, the user must have
     * permission to access the S3 bucket and file.
     * </p>
     */
    private S3Object manifestS3Object;

    /**
     * <p>
     * The S3 bucket name and file name that identifies the document.
     * </p>
     * <p>
     * The AWS Region for the S3 bucket that contains the document must match
     * the Region that you use for Amazon Textract operations.
     * </p>
     * <p>
     * For Amazon Textract to process a file in an S3 bucket, the user must have
     * permission to access the S3 bucket and file.
     * </p>
     *
     * @return <p>
     *         The S3 bucket name and file name that identifies the document.
     *         </p>
     *         <p>
     *         The AWS Region for the S3 bucket that contains the document must
     *         match the Region that you use for Amazon Textract operations.
     *         </p>
     *         <p>
     *         For Amazon Textract to process a file in an S3 bucket, the user
     *         must have permission to access the S3 bucket and file.
     *         </p>
     */
    public S3Object getManifestS3Object() {
        return manifestS3Object;
    }

    /**
     * <p>
     * The S3 bucket name and file name that identifies the document.
     * </p>
     * <p>
     * The AWS Region for the S3 bucket that contains the document must match
     * the Region that you use for Amazon Textract operations.
     * </p>
     * <p>
     * For Amazon Textract to process a file in an S3 bucket, the user must have
     * permission to access the S3 bucket and file.
     * </p>
     *
     * @param manifestS3Object <p>
     *            The S3 bucket name and file name that identifies the document.
     *            </p>
     *            <p>
     *            The AWS Region for the S3 bucket that contains the document
     *            must match the Region that you use for Amazon Textract
     *            operations.
     *            </p>
     *            <p>
     *            For Amazon Textract to process a file in an S3 bucket, the
     *            user must have permission to access the S3 bucket and file.
     *            </p>
     */
    public void setManifestS3Object(S3Object manifestS3Object) {
        this.manifestS3Object = manifestS3Object;
    }

    /**
     * <p>
     * The S3 bucket name and file name that identifies the document.
     * </p>
     * <p>
     * The AWS Region for the S3 bucket that contains the document must match
     * the Region that you use for Amazon Textract operations.
     * </p>
     * <p>
     * For Amazon Textract to process a file in an S3 bucket, the user must have
     * permission to access the S3 bucket and file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param manifestS3Object <p>
     *            The S3 bucket name and file name that identifies the document.
     *            </p>
     *            <p>
     *            The AWS Region for the S3 bucket that contains the document
     *            must match the Region that you use for Amazon Textract
     *            operations.
     *            </p>
     *            <p>
     *            For Amazon Textract to process a file in an S3 bucket, the
     *            user must have permission to access the S3 bucket and file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdapterVersionDatasetConfig withManifestS3Object(S3Object manifestS3Object) {
        this.manifestS3Object = manifestS3Object;
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
        if (getManifestS3Object() != null)
            sb.append("ManifestS3Object: " + getManifestS3Object());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getManifestS3Object() == null) ? 0 : getManifestS3Object().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdapterVersionDatasetConfig == false)
            return false;
        AdapterVersionDatasetConfig other = (AdapterVersionDatasetConfig) obj;

        if (other.getManifestS3Object() == null ^ this.getManifestS3Object() == null)
            return false;
        if (other.getManifestS3Object() != null
                && other.getManifestS3Object().equals(this.getManifestS3Object()) == false)
            return false;
        return true;
    }
}
