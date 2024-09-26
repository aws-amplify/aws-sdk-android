/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the results for a media analysis job created with
 * StartMediaAnalysisJob.
 * </p>
 */
public class MediaAnalysisResults implements Serializable {
    /**
     * <p>
     * Provides the S3 bucket name and object name.
     * </p>
     * <p>
     * The region for the S3 bucket containing the S3 object must match the
     * region you use for Amazon Rekognition operations.
     * </p>
     * <p>
     * For Amazon Rekognition to process an S3 object, the user must have
     * permission to access the S3 object. For more information, see How Amazon
     * Rekognition works with IAM in the Amazon Rekognition Developer Guide.
     * </p>
     */
    private S3Object s3Object;

    /**
     * <p>
     * Information about the model versions for the features selected in a given
     * job.
     * </p>
     */
    private MediaAnalysisModelVersions modelVersions;

    /**
     * <p>
     * Provides the S3 bucket name and object name.
     * </p>
     * <p>
     * The region for the S3 bucket containing the S3 object must match the
     * region you use for Amazon Rekognition operations.
     * </p>
     * <p>
     * For Amazon Rekognition to process an S3 object, the user must have
     * permission to access the S3 object. For more information, see How Amazon
     * Rekognition works with IAM in the Amazon Rekognition Developer Guide.
     * </p>
     *
     * @return <p>
     *         Provides the S3 bucket name and object name.
     *         </p>
     *         <p>
     *         The region for the S3 bucket containing the S3 object must match
     *         the region you use for Amazon Rekognition operations.
     *         </p>
     *         <p>
     *         For Amazon Rekognition to process an S3 object, the user must
     *         have permission to access the S3 object. For more information,
     *         see How Amazon Rekognition works with IAM in the Amazon
     *         Rekognition Developer Guide.
     *         </p>
     */
    public S3Object getS3Object() {
        return s3Object;
    }

    /**
     * <p>
     * Provides the S3 bucket name and object name.
     * </p>
     * <p>
     * The region for the S3 bucket containing the S3 object must match the
     * region you use for Amazon Rekognition operations.
     * </p>
     * <p>
     * For Amazon Rekognition to process an S3 object, the user must have
     * permission to access the S3 object. For more information, see How Amazon
     * Rekognition works with IAM in the Amazon Rekognition Developer Guide.
     * </p>
     *
     * @param s3Object <p>
     *            Provides the S3 bucket name and object name.
     *            </p>
     *            <p>
     *            The region for the S3 bucket containing the S3 object must
     *            match the region you use for Amazon Rekognition operations.
     *            </p>
     *            <p>
     *            For Amazon Rekognition to process an S3 object, the user must
     *            have permission to access the S3 object. For more information,
     *            see How Amazon Rekognition works with IAM in the Amazon
     *            Rekognition Developer Guide.
     *            </p>
     */
    public void setS3Object(S3Object s3Object) {
        this.s3Object = s3Object;
    }

    /**
     * <p>
     * Provides the S3 bucket name and object name.
     * </p>
     * <p>
     * The region for the S3 bucket containing the S3 object must match the
     * region you use for Amazon Rekognition operations.
     * </p>
     * <p>
     * For Amazon Rekognition to process an S3 object, the user must have
     * permission to access the S3 object. For more information, see How Amazon
     * Rekognition works with IAM in the Amazon Rekognition Developer Guide.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3Object <p>
     *            Provides the S3 bucket name and object name.
     *            </p>
     *            <p>
     *            The region for the S3 bucket containing the S3 object must
     *            match the region you use for Amazon Rekognition operations.
     *            </p>
     *            <p>
     *            For Amazon Rekognition to process an S3 object, the user must
     *            have permission to access the S3 object. For more information,
     *            see How Amazon Rekognition works with IAM in the Amazon
     *            Rekognition Developer Guide.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MediaAnalysisResults withS3Object(S3Object s3Object) {
        this.s3Object = s3Object;
        return this;
    }

    /**
     * <p>
     * Information about the model versions for the features selected in a given
     * job.
     * </p>
     *
     * @return <p>
     *         Information about the model versions for the features selected in
     *         a given job.
     *         </p>
     */
    public MediaAnalysisModelVersions getModelVersions() {
        return modelVersions;
    }

    /**
     * <p>
     * Information about the model versions for the features selected in a given
     * job.
     * </p>
     *
     * @param modelVersions <p>
     *            Information about the model versions for the features selected
     *            in a given job.
     *            </p>
     */
    public void setModelVersions(MediaAnalysisModelVersions modelVersions) {
        this.modelVersions = modelVersions;
    }

    /**
     * <p>
     * Information about the model versions for the features selected in a given
     * job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param modelVersions <p>
     *            Information about the model versions for the features selected
     *            in a given job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MediaAnalysisResults withModelVersions(MediaAnalysisModelVersions modelVersions) {
        this.modelVersions = modelVersions;
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
        if (getS3Object() != null)
            sb.append("S3Object: " + getS3Object() + ",");
        if (getModelVersions() != null)
            sb.append("ModelVersions: " + getModelVersions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Object() == null) ? 0 : getS3Object().hashCode());
        hashCode = prime * hashCode
                + ((getModelVersions() == null) ? 0 : getModelVersions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MediaAnalysisResults == false)
            return false;
        MediaAnalysisResults other = (MediaAnalysisResults) obj;

        if (other.getS3Object() == null ^ this.getS3Object() == null)
            return false;
        if (other.getS3Object() != null && other.getS3Object().equals(this.getS3Object()) == false)
            return false;
        if (other.getModelVersions() == null ^ this.getModelVersions() == null)
            return false;
        if (other.getModelVersions() != null
                && other.getModelVersions().equals(this.getModelVersions()) == false)
            return false;
        return true;
    }
}
