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

package com.amazonaws.services.glue.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies configuration properties for an importing labels task run.
 * </p>
 */
public class ImportLabelsTaskRunProperties implements Serializable {
    /**
     * <p>
     * The Amazon Simple Storage Service (Amazon S3) path from where you will
     * import the labels.
     * </p>
     */
    private String inputS3Path;

    /**
     * <p>
     * Indicates whether to overwrite your existing labels.
     * </p>
     */
    private Boolean replace;

    /**
     * <p>
     * The Amazon Simple Storage Service (Amazon S3) path from where you will
     * import the labels.
     * </p>
     *
     * @return <p>
     *         The Amazon Simple Storage Service (Amazon S3) path from where you
     *         will import the labels.
     *         </p>
     */
    public String getInputS3Path() {
        return inputS3Path;
    }

    /**
     * <p>
     * The Amazon Simple Storage Service (Amazon S3) path from where you will
     * import the labels.
     * </p>
     *
     * @param inputS3Path <p>
     *            The Amazon Simple Storage Service (Amazon S3) path from where
     *            you will import the labels.
     *            </p>
     */
    public void setInputS3Path(String inputS3Path) {
        this.inputS3Path = inputS3Path;
    }

    /**
     * <p>
     * The Amazon Simple Storage Service (Amazon S3) path from where you will
     * import the labels.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputS3Path <p>
     *            The Amazon Simple Storage Service (Amazon S3) path from where
     *            you will import the labels.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportLabelsTaskRunProperties withInputS3Path(String inputS3Path) {
        this.inputS3Path = inputS3Path;
        return this;
    }

    /**
     * <p>
     * Indicates whether to overwrite your existing labels.
     * </p>
     *
     * @return <p>
     *         Indicates whether to overwrite your existing labels.
     *         </p>
     */
    public Boolean isReplace() {
        return replace;
    }

    /**
     * <p>
     * Indicates whether to overwrite your existing labels.
     * </p>
     *
     * @return <p>
     *         Indicates whether to overwrite your existing labels.
     *         </p>
     */
    public Boolean getReplace() {
        return replace;
    }

    /**
     * <p>
     * Indicates whether to overwrite your existing labels.
     * </p>
     *
     * @param replace <p>
     *            Indicates whether to overwrite your existing labels.
     *            </p>
     */
    public void setReplace(Boolean replace) {
        this.replace = replace;
    }

    /**
     * <p>
     * Indicates whether to overwrite your existing labels.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replace <p>
     *            Indicates whether to overwrite your existing labels.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportLabelsTaskRunProperties withReplace(Boolean replace) {
        this.replace = replace;
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
        if (getInputS3Path() != null)
            sb.append("InputS3Path: " + getInputS3Path() + ",");
        if (getReplace() != null)
            sb.append("Replace: " + getReplace());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInputS3Path() == null) ? 0 : getInputS3Path().hashCode());
        hashCode = prime * hashCode + ((getReplace() == null) ? 0 : getReplace().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportLabelsTaskRunProperties == false)
            return false;
        ImportLabelsTaskRunProperties other = (ImportLabelsTaskRunProperties) obj;

        if (other.getInputS3Path() == null ^ this.getInputS3Path() == null)
            return false;
        if (other.getInputS3Path() != null
                && other.getInputS3Path().equals(this.getInputS3Path()) == false)
            return false;
        if (other.getReplace() == null ^ this.getReplace() == null)
            return false;
        if (other.getReplace() != null && other.getReplace().equals(this.getReplace()) == false)
            return false;
        return true;
    }
}
