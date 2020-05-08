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

package com.amazonaws.services.api.sagemaker.model;

import java.io.Serializable;

/**
 * <p>
 * The sharing settings.
 * </p>
 */
public class SharingSettings implements Serializable {
    /**
     * <p>
     * The notebook output option.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Allowed, Disabled
     */
    private String notebookOutputOption;

    /**
     * <p>
     * The Amazon S3 output path.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     */
    private String s3OutputPath;

    /**
     * <p>
     * The AWS Key Management Service encryption key ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String s3KmsKeyId;

    /**
     * <p>
     * The notebook output option.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Allowed, Disabled
     *
     * @return <p>
     *         The notebook output option.
     *         </p>
     * @see NotebookOutputOption
     */
    public String getNotebookOutputOption() {
        return notebookOutputOption;
    }

    /**
     * <p>
     * The notebook output option.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Allowed, Disabled
     *
     * @param notebookOutputOption <p>
     *            The notebook output option.
     *            </p>
     * @see NotebookOutputOption
     */
    public void setNotebookOutputOption(String notebookOutputOption) {
        this.notebookOutputOption = notebookOutputOption;
    }

    /**
     * <p>
     * The notebook output option.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Allowed, Disabled
     *
     * @param notebookOutputOption <p>
     *            The notebook output option.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see NotebookOutputOption
     */
    public SharingSettings withNotebookOutputOption(String notebookOutputOption) {
        this.notebookOutputOption = notebookOutputOption;
        return this;
    }

    /**
     * <p>
     * The notebook output option.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Allowed, Disabled
     *
     * @param notebookOutputOption <p>
     *            The notebook output option.
     *            </p>
     * @see NotebookOutputOption
     */
    public void setNotebookOutputOption(NotebookOutputOption notebookOutputOption) {
        this.notebookOutputOption = notebookOutputOption.toString();
    }

    /**
     * <p>
     * The notebook output option.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Allowed, Disabled
     *
     * @param notebookOutputOption <p>
     *            The notebook output option.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see NotebookOutputOption
     */
    public SharingSettings withNotebookOutputOption(NotebookOutputOption notebookOutputOption) {
        this.notebookOutputOption = notebookOutputOption.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon S3 output path.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     *
     * @return <p>
     *         The Amazon S3 output path.
     *         </p>
     */
    public String getS3OutputPath() {
        return s3OutputPath;
    }

    /**
     * <p>
     * The Amazon S3 output path.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     *
     * @param s3OutputPath <p>
     *            The Amazon S3 output path.
     *            </p>
     */
    public void setS3OutputPath(String s3OutputPath) {
        this.s3OutputPath = s3OutputPath;
    }

    /**
     * <p>
     * The Amazon S3 output path.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     *
     * @param s3OutputPath <p>
     *            The Amazon S3 output path.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SharingSettings withS3OutputPath(String s3OutputPath) {
        this.s3OutputPath = s3OutputPath;
        return this;
    }

    /**
     * <p>
     * The AWS Key Management Service encryption key ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         The AWS Key Management Service encryption key ID.
     *         </p>
     */
    public String getS3KmsKeyId() {
        return s3KmsKeyId;
    }

    /**
     * <p>
     * The AWS Key Management Service encryption key ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param s3KmsKeyId <p>
     *            The AWS Key Management Service encryption key ID.
     *            </p>
     */
    public void setS3KmsKeyId(String s3KmsKeyId) {
        this.s3KmsKeyId = s3KmsKeyId;
    }

    /**
     * <p>
     * The AWS Key Management Service encryption key ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param s3KmsKeyId <p>
     *            The AWS Key Management Service encryption key ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SharingSettings withS3KmsKeyId(String s3KmsKeyId) {
        this.s3KmsKeyId = s3KmsKeyId;
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
        if (getNotebookOutputOption() != null)
            sb.append("NotebookOutputOption: " + getNotebookOutputOption() + ",");
        if (getS3OutputPath() != null)
            sb.append("S3OutputPath: " + getS3OutputPath() + ",");
        if (getS3KmsKeyId() != null)
            sb.append("S3KmsKeyId: " + getS3KmsKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getNotebookOutputOption() == null) ? 0 : getNotebookOutputOption().hashCode());
        hashCode = prime * hashCode
                + ((getS3OutputPath() == null) ? 0 : getS3OutputPath().hashCode());
        hashCode = prime * hashCode + ((getS3KmsKeyId() == null) ? 0 : getS3KmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SharingSettings == false)
            return false;
        SharingSettings other = (SharingSettings) obj;

        if (other.getNotebookOutputOption() == null ^ this.getNotebookOutputOption() == null)
            return false;
        if (other.getNotebookOutputOption() != null
                && other.getNotebookOutputOption().equals(this.getNotebookOutputOption()) == false)
            return false;
        if (other.getS3OutputPath() == null ^ this.getS3OutputPath() == null)
            return false;
        if (other.getS3OutputPath() != null
                && other.getS3OutputPath().equals(this.getS3OutputPath()) == false)
            return false;
        if (other.getS3KmsKeyId() == null ^ this.getS3KmsKeyId() == null)
            return false;
        if (other.getS3KmsKeyId() != null
                && other.getS3KmsKeyId().equals(this.getS3KmsKeyId()) == false)
            return false;
        return true;
    }
}
