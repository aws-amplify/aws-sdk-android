/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes updates or additions to a dataset. A Single update or addition is
 * an entry (JSON Line) that provides information about a single image. To
 * update an existing entry, you match the <code>source-ref</code> field of the
 * update entry with the <code>source-ref</code> filed of the entry that you
 * want to update. If the <code>source-ref</code> field doesn't match an
 * existing entry, the entry is added to dataset as a new entry.
 * </p>
 */
public class DatasetChanges implements Serializable {
    /**
     * <p>
     * A Base64-encoded binary data object containing one or JSON lines that
     * either update the dataset or are additions to the dataset. You change a
     * dataset by calling <a>UpdateDatasetEntries</a>. If you are using an AWS
     * SDK to call <code>UpdateDatasetEntries</code>, you don't need to encode
     * <code>Changes</code> as the SDK encodes the data for you.
     * </p>
     * <p>
     * For example JSON lines, see Image-Level labels in manifest files and and
     * Object localization in manifest files in the <i>Amazon Rekognition Custom
     * Labels Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 5242880<br/>
     */
    private java.nio.ByteBuffer groundTruth;

    /**
     * <p>
     * A Base64-encoded binary data object containing one or JSON lines that
     * either update the dataset or are additions to the dataset. You change a
     * dataset by calling <a>UpdateDatasetEntries</a>. If you are using an AWS
     * SDK to call <code>UpdateDatasetEntries</code>, you don't need to encode
     * <code>Changes</code> as the SDK encodes the data for you.
     * </p>
     * <p>
     * For example JSON lines, see Image-Level labels in manifest files and and
     * Object localization in manifest files in the <i>Amazon Rekognition Custom
     * Labels Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 5242880<br/>
     *
     * @return <p>
     *         A Base64-encoded binary data object containing one or JSON lines
     *         that either update the dataset or are additions to the dataset.
     *         You change a dataset by calling <a>UpdateDatasetEntries</a>. If
     *         you are using an AWS SDK to call
     *         <code>UpdateDatasetEntries</code>, you don't need to encode
     *         <code>Changes</code> as the SDK encodes the data for you.
     *         </p>
     *         <p>
     *         For example JSON lines, see Image-Level labels in manifest files
     *         and and Object localization in manifest files in the <i>Amazon
     *         Rekognition Custom Labels Developer Guide</i>.
     *         </p>
     */
    public java.nio.ByteBuffer getGroundTruth() {
        return groundTruth;
    }

    /**
     * <p>
     * A Base64-encoded binary data object containing one or JSON lines that
     * either update the dataset or are additions to the dataset. You change a
     * dataset by calling <a>UpdateDatasetEntries</a>. If you are using an AWS
     * SDK to call <code>UpdateDatasetEntries</code>, you don't need to encode
     * <code>Changes</code> as the SDK encodes the data for you.
     * </p>
     * <p>
     * For example JSON lines, see Image-Level labels in manifest files and and
     * Object localization in manifest files in the <i>Amazon Rekognition Custom
     * Labels Developer Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 5242880<br/>
     *
     * @param groundTruth <p>
     *            A Base64-encoded binary data object containing one or JSON
     *            lines that either update the dataset or are additions to the
     *            dataset. You change a dataset by calling
     *            <a>UpdateDatasetEntries</a>. If you are using an AWS SDK to
     *            call <code>UpdateDatasetEntries</code>, you don't need to
     *            encode <code>Changes</code> as the SDK encodes the data for
     *            you.
     *            </p>
     *            <p>
     *            For example JSON lines, see Image-Level labels in manifest
     *            files and and Object localization in manifest files in the
     *            <i>Amazon Rekognition Custom Labels Developer Guide</i>.
     *            </p>
     */
    public void setGroundTruth(java.nio.ByteBuffer groundTruth) {
        this.groundTruth = groundTruth;
    }

    /**
     * <p>
     * A Base64-encoded binary data object containing one or JSON lines that
     * either update the dataset or are additions to the dataset. You change a
     * dataset by calling <a>UpdateDatasetEntries</a>. If you are using an AWS
     * SDK to call <code>UpdateDatasetEntries</code>, you don't need to encode
     * <code>Changes</code> as the SDK encodes the data for you.
     * </p>
     * <p>
     * For example JSON lines, see Image-Level labels in manifest files and and
     * Object localization in manifest files in the <i>Amazon Rekognition Custom
     * Labels Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 5242880<br/>
     *
     * @param groundTruth <p>
     *            A Base64-encoded binary data object containing one or JSON
     *            lines that either update the dataset or are additions to the
     *            dataset. You change a dataset by calling
     *            <a>UpdateDatasetEntries</a>. If you are using an AWS SDK to
     *            call <code>UpdateDatasetEntries</code>, you don't need to
     *            encode <code>Changes</code> as the SDK encodes the data for
     *            you.
     *            </p>
     *            <p>
     *            For example JSON lines, see Image-Level labels in manifest
     *            files and and Object localization in manifest files in the
     *            <i>Amazon Rekognition Custom Labels Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DatasetChanges withGroundTruth(java.nio.ByteBuffer groundTruth) {
        this.groundTruth = groundTruth;
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
        if (getGroundTruth() != null)
            sb.append("GroundTruth: " + getGroundTruth());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getGroundTruth() == null) ? 0 : getGroundTruth().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatasetChanges == false)
            return false;
        DatasetChanges other = (DatasetChanges) obj;

        if (other.getGroundTruth() == null ^ this.getGroundTruth() == null)
            return false;
        if (other.getGroundTruth() != null
                && other.getGroundTruth().equals(this.getGroundTruth()) == false)
            return false;
        return true;
    }
}
