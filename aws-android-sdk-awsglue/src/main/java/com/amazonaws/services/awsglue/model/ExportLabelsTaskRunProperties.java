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

package com.amazonaws.services.awsglue.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies configuration properties for an exporting labels task run.
 * </p>
 */
public class ExportLabelsTaskRunProperties implements Serializable {
    /**
     * <p>
     * The Amazon Simple Storage Service (Amazon S3) path where you will export
     * the labels.
     * </p>
     */
    private String outputS3Path;

    /**
     * <p>
     * The Amazon Simple Storage Service (Amazon S3) path where you will export
     * the labels.
     * </p>
     *
     * @return <p>
     *         The Amazon Simple Storage Service (Amazon S3) path where you will
     *         export the labels.
     *         </p>
     */
    public String getOutputS3Path() {
        return outputS3Path;
    }

    /**
     * <p>
     * The Amazon Simple Storage Service (Amazon S3) path where you will export
     * the labels.
     * </p>
     *
     * @param outputS3Path <p>
     *            The Amazon Simple Storage Service (Amazon S3) path where you
     *            will export the labels.
     *            </p>
     */
    public void setOutputS3Path(String outputS3Path) {
        this.outputS3Path = outputS3Path;
    }

    /**
     * <p>
     * The Amazon Simple Storage Service (Amazon S3) path where you will export
     * the labels.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputS3Path <p>
     *            The Amazon Simple Storage Service (Amazon S3) path where you
     *            will export the labels.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExportLabelsTaskRunProperties withOutputS3Path(String outputS3Path) {
        this.outputS3Path = outputS3Path;
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
        if (getOutputS3Path() != null)
            sb.append("OutputS3Path: " + getOutputS3Path());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getOutputS3Path() == null) ? 0 : getOutputS3Path().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportLabelsTaskRunProperties == false)
            return false;
        ExportLabelsTaskRunProperties other = (ExportLabelsTaskRunProperties) obj;

        if (other.getOutputS3Path() == null ^ this.getOutputS3Path() == null)
            return false;
        if (other.getOutputS3Path() != null
                && other.getOutputS3Path().equals(this.getOutputS3Path()) == false)
            return false;
        return true;
    }
}
