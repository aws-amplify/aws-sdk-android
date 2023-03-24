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

package com.amazonaws.services.comprehend.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies the format and location of the input data for the dataset.
 * </p>
 */
public class DatasetInputDataConfig implements Serializable {
    /**
     * <p>
     * A list of augmented manifest files that provide training data for your
     * custom model. An augmented manifest file is a labeled dataset that is
     * produced by Amazon SageMaker Ground Truth.
     * </p>
     */
    private java.util.List<DatasetAugmentedManifestsListItem> augmentedManifests;

    /**
     * <p>
     * <code>COMPREHEND_CSV</code>: The data format is a two-column CSV file,
     * where the first column contains labels and the second column contains
     * documents.
     * </p>
     * <p>
     * <code>AUGMENTED_MANIFEST</code>: The data format
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPREHEND_CSV, AUGMENTED_MANIFEST
     */
    private String dataFormat;

    /**
     * <p>
     * The input properties for training a document classifier model.
     * </p>
     * <p>
     * For more information on how the input file is formatted, see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/prep-classifier-data.html"
     * >Preparing training data</a> in the Comprehend Developer Guide.
     * </p>
     */
    private DatasetDocumentClassifierInputDataConfig documentClassifierInputDataConfig;

    /**
     * <p>
     * The input properties for training an entity recognizer model.
     * </p>
     */
    private DatasetEntityRecognizerInputDataConfig entityRecognizerInputDataConfig;

    /**
     * <p>
     * A list of augmented manifest files that provide training data for your
     * custom model. An augmented manifest file is a labeled dataset that is
     * produced by Amazon SageMaker Ground Truth.
     * </p>
     *
     * @return <p>
     *         A list of augmented manifest files that provide training data for
     *         your custom model. An augmented manifest file is a labeled
     *         dataset that is produced by Amazon SageMaker Ground Truth.
     *         </p>
     */
    public java.util.List<DatasetAugmentedManifestsListItem> getAugmentedManifests() {
        return augmentedManifests;
    }

    /**
     * <p>
     * A list of augmented manifest files that provide training data for your
     * custom model. An augmented manifest file is a labeled dataset that is
     * produced by Amazon SageMaker Ground Truth.
     * </p>
     *
     * @param augmentedManifests <p>
     *            A list of augmented manifest files that provide training data
     *            for your custom model. An augmented manifest file is a labeled
     *            dataset that is produced by Amazon SageMaker Ground Truth.
     *            </p>
     */
    public void setAugmentedManifests(
            java.util.Collection<DatasetAugmentedManifestsListItem> augmentedManifests) {
        if (augmentedManifests == null) {
            this.augmentedManifests = null;
            return;
        }

        this.augmentedManifests = new java.util.ArrayList<DatasetAugmentedManifestsListItem>(
                augmentedManifests);
    }

    /**
     * <p>
     * A list of augmented manifest files that provide training data for your
     * custom model. An augmented manifest file is a labeled dataset that is
     * produced by Amazon SageMaker Ground Truth.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param augmentedManifests <p>
     *            A list of augmented manifest files that provide training data
     *            for your custom model. An augmented manifest file is a labeled
     *            dataset that is produced by Amazon SageMaker Ground Truth.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DatasetInputDataConfig withAugmentedManifests(
            DatasetAugmentedManifestsListItem... augmentedManifests) {
        if (getAugmentedManifests() == null) {
            this.augmentedManifests = new java.util.ArrayList<DatasetAugmentedManifestsListItem>(
                    augmentedManifests.length);
        }
        for (DatasetAugmentedManifestsListItem value : augmentedManifests) {
            this.augmentedManifests.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of augmented manifest files that provide training data for your
     * custom model. An augmented manifest file is a labeled dataset that is
     * produced by Amazon SageMaker Ground Truth.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param augmentedManifests <p>
     *            A list of augmented manifest files that provide training data
     *            for your custom model. An augmented manifest file is a labeled
     *            dataset that is produced by Amazon SageMaker Ground Truth.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DatasetInputDataConfig withAugmentedManifests(
            java.util.Collection<DatasetAugmentedManifestsListItem> augmentedManifests) {
        setAugmentedManifests(augmentedManifests);
        return this;
    }

    /**
     * <p>
     * <code>COMPREHEND_CSV</code>: The data format is a two-column CSV file,
     * where the first column contains labels and the second column contains
     * documents.
     * </p>
     * <p>
     * <code>AUGMENTED_MANIFEST</code>: The data format
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPREHEND_CSV, AUGMENTED_MANIFEST
     *
     * @return <p>
     *         <code>COMPREHEND_CSV</code>: The data format is a two-column CSV
     *         file, where the first column contains labels and the second
     *         column contains documents.
     *         </p>
     *         <p>
     *         <code>AUGMENTED_MANIFEST</code>: The data format
     *         </p>
     * @see DatasetDataFormat
     */
    public String getDataFormat() {
        return dataFormat;
    }

    /**
     * <p>
     * <code>COMPREHEND_CSV</code>: The data format is a two-column CSV file,
     * where the first column contains labels and the second column contains
     * documents.
     * </p>
     * <p>
     * <code>AUGMENTED_MANIFEST</code>: The data format
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPREHEND_CSV, AUGMENTED_MANIFEST
     *
     * @param dataFormat <p>
     *            <code>COMPREHEND_CSV</code>: The data format is a two-column
     *            CSV file, where the first column contains labels and the
     *            second column contains documents.
     *            </p>
     *            <p>
     *            <code>AUGMENTED_MANIFEST</code>: The data format
     *            </p>
     * @see DatasetDataFormat
     */
    public void setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
    }

    /**
     * <p>
     * <code>COMPREHEND_CSV</code>: The data format is a two-column CSV file,
     * where the first column contains labels and the second column contains
     * documents.
     * </p>
     * <p>
     * <code>AUGMENTED_MANIFEST</code>: The data format
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPREHEND_CSV, AUGMENTED_MANIFEST
     *
     * @param dataFormat <p>
     *            <code>COMPREHEND_CSV</code>: The data format is a two-column
     *            CSV file, where the first column contains labels and the
     *            second column contains documents.
     *            </p>
     *            <p>
     *            <code>AUGMENTED_MANIFEST</code>: The data format
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DatasetDataFormat
     */
    public DatasetInputDataConfig withDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }

    /**
     * <p>
     * <code>COMPREHEND_CSV</code>: The data format is a two-column CSV file,
     * where the first column contains labels and the second column contains
     * documents.
     * </p>
     * <p>
     * <code>AUGMENTED_MANIFEST</code>: The data format
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPREHEND_CSV, AUGMENTED_MANIFEST
     *
     * @param dataFormat <p>
     *            <code>COMPREHEND_CSV</code>: The data format is a two-column
     *            CSV file, where the first column contains labels and the
     *            second column contains documents.
     *            </p>
     *            <p>
     *            <code>AUGMENTED_MANIFEST</code>: The data format
     *            </p>
     * @see DatasetDataFormat
     */
    public void setDataFormat(DatasetDataFormat dataFormat) {
        this.dataFormat = dataFormat.toString();
    }

    /**
     * <p>
     * <code>COMPREHEND_CSV</code>: The data format is a two-column CSV file,
     * where the first column contains labels and the second column contains
     * documents.
     * </p>
     * <p>
     * <code>AUGMENTED_MANIFEST</code>: The data format
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPREHEND_CSV, AUGMENTED_MANIFEST
     *
     * @param dataFormat <p>
     *            <code>COMPREHEND_CSV</code>: The data format is a two-column
     *            CSV file, where the first column contains labels and the
     *            second column contains documents.
     *            </p>
     *            <p>
     *            <code>AUGMENTED_MANIFEST</code>: The data format
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DatasetDataFormat
     */
    public DatasetInputDataConfig withDataFormat(DatasetDataFormat dataFormat) {
        this.dataFormat = dataFormat.toString();
        return this;
    }

    /**
     * <p>
     * The input properties for training a document classifier model.
     * </p>
     * <p>
     * For more information on how the input file is formatted, see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/prep-classifier-data.html"
     * >Preparing training data</a> in the Comprehend Developer Guide.
     * </p>
     *
     * @return <p>
     *         The input properties for training a document classifier model.
     *         </p>
     *         <p>
     *         For more information on how the input file is formatted, see <a
     *         href=
     *         "https://docs.aws.amazon.com/comprehend/latest/dg/prep-classifier-data.html"
     *         >Preparing training data</a> in the Comprehend Developer Guide.
     *         </p>
     */
    public DatasetDocumentClassifierInputDataConfig getDocumentClassifierInputDataConfig() {
        return documentClassifierInputDataConfig;
    }

    /**
     * <p>
     * The input properties for training a document classifier model.
     * </p>
     * <p>
     * For more information on how the input file is formatted, see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/prep-classifier-data.html"
     * >Preparing training data</a> in the Comprehend Developer Guide.
     * </p>
     *
     * @param documentClassifierInputDataConfig <p>
     *            The input properties for training a document classifier model.
     *            </p>
     *            <p>
     *            For more information on how the input file is formatted, see
     *            <a href=
     *            "https://docs.aws.amazon.com/comprehend/latest/dg/prep-classifier-data.html"
     *            >Preparing training data</a> in the Comprehend Developer
     *            Guide.
     *            </p>
     */
    public void setDocumentClassifierInputDataConfig(
            DatasetDocumentClassifierInputDataConfig documentClassifierInputDataConfig) {
        this.documentClassifierInputDataConfig = documentClassifierInputDataConfig;
    }

    /**
     * <p>
     * The input properties for training a document classifier model.
     * </p>
     * <p>
     * For more information on how the input file is formatted, see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/prep-classifier-data.html"
     * >Preparing training data</a> in the Comprehend Developer Guide.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param documentClassifierInputDataConfig <p>
     *            The input properties for training a document classifier model.
     *            </p>
     *            <p>
     *            For more information on how the input file is formatted, see
     *            <a href=
     *            "https://docs.aws.amazon.com/comprehend/latest/dg/prep-classifier-data.html"
     *            >Preparing training data</a> in the Comprehend Developer
     *            Guide.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DatasetInputDataConfig withDocumentClassifierInputDataConfig(
            DatasetDocumentClassifierInputDataConfig documentClassifierInputDataConfig) {
        this.documentClassifierInputDataConfig = documentClassifierInputDataConfig;
        return this;
    }

    /**
     * <p>
     * The input properties for training an entity recognizer model.
     * </p>
     *
     * @return <p>
     *         The input properties for training an entity recognizer model.
     *         </p>
     */
    public DatasetEntityRecognizerInputDataConfig getEntityRecognizerInputDataConfig() {
        return entityRecognizerInputDataConfig;
    }

    /**
     * <p>
     * The input properties for training an entity recognizer model.
     * </p>
     *
     * @param entityRecognizerInputDataConfig <p>
     *            The input properties for training an entity recognizer model.
     *            </p>
     */
    public void setEntityRecognizerInputDataConfig(
            DatasetEntityRecognizerInputDataConfig entityRecognizerInputDataConfig) {
        this.entityRecognizerInputDataConfig = entityRecognizerInputDataConfig;
    }

    /**
     * <p>
     * The input properties for training an entity recognizer model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entityRecognizerInputDataConfig <p>
     *            The input properties for training an entity recognizer model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DatasetInputDataConfig withEntityRecognizerInputDataConfig(
            DatasetEntityRecognizerInputDataConfig entityRecognizerInputDataConfig) {
        this.entityRecognizerInputDataConfig = entityRecognizerInputDataConfig;
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
        if (getAugmentedManifests() != null)
            sb.append("AugmentedManifests: " + getAugmentedManifests() + ",");
        if (getDataFormat() != null)
            sb.append("DataFormat: " + getDataFormat() + ",");
        if (getDocumentClassifierInputDataConfig() != null)
            sb.append("DocumentClassifierInputDataConfig: "
                    + getDocumentClassifierInputDataConfig() + ",");
        if (getEntityRecognizerInputDataConfig() != null)
            sb.append("EntityRecognizerInputDataConfig: " + getEntityRecognizerInputDataConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAugmentedManifests() == null) ? 0 : getAugmentedManifests().hashCode());
        hashCode = prime * hashCode + ((getDataFormat() == null) ? 0 : getDataFormat().hashCode());
        hashCode = prime
                * hashCode
                + ((getDocumentClassifierInputDataConfig() == null) ? 0
                        : getDocumentClassifierInputDataConfig().hashCode());
        hashCode = prime
                * hashCode
                + ((getEntityRecognizerInputDataConfig() == null) ? 0
                        : getEntityRecognizerInputDataConfig().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatasetInputDataConfig == false)
            return false;
        DatasetInputDataConfig other = (DatasetInputDataConfig) obj;

        if (other.getAugmentedManifests() == null ^ this.getAugmentedManifests() == null)
            return false;
        if (other.getAugmentedManifests() != null
                && other.getAugmentedManifests().equals(this.getAugmentedManifests()) == false)
            return false;
        if (other.getDataFormat() == null ^ this.getDataFormat() == null)
            return false;
        if (other.getDataFormat() != null
                && other.getDataFormat().equals(this.getDataFormat()) == false)
            return false;
        if (other.getDocumentClassifierInputDataConfig() == null
                ^ this.getDocumentClassifierInputDataConfig() == null)
            return false;
        if (other.getDocumentClassifierInputDataConfig() != null
                && other.getDocumentClassifierInputDataConfig().equals(
                        this.getDocumentClassifierInputDataConfig()) == false)
            return false;
        if (other.getEntityRecognizerInputDataConfig() == null
                ^ this.getEntityRecognizerInputDataConfig() == null)
            return false;
        if (other.getEntityRecognizerInputDataConfig() != null
                && other.getEntityRecognizerInputDataConfig().equals(
                        this.getEntityRecognizerInputDataConfig()) == false)
            return false;
        return true;
    }
}
