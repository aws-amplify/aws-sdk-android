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
 * Details about the error that resulted in failure of the job.
 * </p>
 */
public class MediaAnalysisJobFailureDetails implements Serializable {
    /**
     * <p>
     * Error code for the failed job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INTERNAL_ERROR, INVALID_S3_OBJECT,
     * INVALID_MANIFEST, INVALID_OUTPUT_CONFIG, INVALID_KMS_KEY, ACCESS_DENIED,
     * RESOURCE_NOT_FOUND, RESOURCE_NOT_READY, THROTTLED
     */
    private String code;

    /**
     * <p>
     * Human readable error message.
     * </p>
     */
    private String message;

    /**
     * <p>
     * Error code for the failed job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INTERNAL_ERROR, INVALID_S3_OBJECT,
     * INVALID_MANIFEST, INVALID_OUTPUT_CONFIG, INVALID_KMS_KEY, ACCESS_DENIED,
     * RESOURCE_NOT_FOUND, RESOURCE_NOT_READY, THROTTLED
     *
     * @return <p>
     *         Error code for the failed job.
     *         </p>
     * @see MediaAnalysisJobFailureCode
     */
    public String getCode() {
        return code;
    }

    /**
     * <p>
     * Error code for the failed job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INTERNAL_ERROR, INVALID_S3_OBJECT,
     * INVALID_MANIFEST, INVALID_OUTPUT_CONFIG, INVALID_KMS_KEY, ACCESS_DENIED,
     * RESOURCE_NOT_FOUND, RESOURCE_NOT_READY, THROTTLED
     *
     * @param code <p>
     *            Error code for the failed job.
     *            </p>
     * @see MediaAnalysisJobFailureCode
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * Error code for the failed job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INTERNAL_ERROR, INVALID_S3_OBJECT,
     * INVALID_MANIFEST, INVALID_OUTPUT_CONFIG, INVALID_KMS_KEY, ACCESS_DENIED,
     * RESOURCE_NOT_FOUND, RESOURCE_NOT_READY, THROTTLED
     *
     * @param code <p>
     *            Error code for the failed job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MediaAnalysisJobFailureCode
     */
    public MediaAnalysisJobFailureDetails withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * <p>
     * Error code for the failed job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INTERNAL_ERROR, INVALID_S3_OBJECT,
     * INVALID_MANIFEST, INVALID_OUTPUT_CONFIG, INVALID_KMS_KEY, ACCESS_DENIED,
     * RESOURCE_NOT_FOUND, RESOURCE_NOT_READY, THROTTLED
     *
     * @param code <p>
     *            Error code for the failed job.
     *            </p>
     * @see MediaAnalysisJobFailureCode
     */
    public void setCode(MediaAnalysisJobFailureCode code) {
        this.code = code.toString();
    }

    /**
     * <p>
     * Error code for the failed job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INTERNAL_ERROR, INVALID_S3_OBJECT,
     * INVALID_MANIFEST, INVALID_OUTPUT_CONFIG, INVALID_KMS_KEY, ACCESS_DENIED,
     * RESOURCE_NOT_FOUND, RESOURCE_NOT_READY, THROTTLED
     *
     * @param code <p>
     *            Error code for the failed job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MediaAnalysisJobFailureCode
     */
    public MediaAnalysisJobFailureDetails withCode(MediaAnalysisJobFailureCode code) {
        this.code = code.toString();
        return this;
    }

    /**
     * <p>
     * Human readable error message.
     * </p>
     *
     * @return <p>
     *         Human readable error message.
     *         </p>
     */
    public String getMessage() {
        return message;
    }

    /**
     * <p>
     * Human readable error message.
     * </p>
     *
     * @param message <p>
     *            Human readable error message.
     *            </p>
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Human readable error message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param message <p>
     *            Human readable error message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MediaAnalysisJobFailureDetails withMessage(String message) {
        this.message = message;
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
        if (getCode() != null)
            sb.append("Code: " + getCode() + ",");
        if (getMessage() != null)
            sb.append("Message: " + getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MediaAnalysisJobFailureDetails == false)
            return false;
        MediaAnalysisJobFailureDetails other = (MediaAnalysisJobFailureDetails) obj;

        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }
}
