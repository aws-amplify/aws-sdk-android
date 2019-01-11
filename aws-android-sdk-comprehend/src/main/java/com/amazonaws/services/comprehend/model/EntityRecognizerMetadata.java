/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Detailed information about an entity recognizer.
 * </p>
 */
public class EntityRecognizerMetadata implements Serializable {
    /**
     * <p>
     * The number of documents in the input data that were used to train the
     * entity recognizer. Typically this is 80 to 90 percent of the input
     * documents.
     * </p>
     */
    private Integer numberOfTrainedDocuments;

    /**
     * <p>
     * The number of documents in the input data that were used to test the
     * entity recognizer. Typically this is 10 to 20 percent of the input
     * documents.
     * </p>
     */
    private Integer numberOfTestDocuments;

    /**
     * <p>
     * Detailed information about the accuracy of an entity recognizer.
     * </p>
     */
    private EntityRecognizerEvaluationMetrics evaluationMetrics;

    /**
     * <p>
     * Entity types from the metadata of an entity recognizer.
     * </p>
     */
    private java.util.List<EntityRecognizerMetadataEntityTypesListItem> entityTypes;

    /**
     * <p>
     * The number of documents in the input data that were used to train the
     * entity recognizer. Typically this is 80 to 90 percent of the input
     * documents.
     * </p>
     *
     * @return <p>
     *         The number of documents in the input data that were used to train
     *         the entity recognizer. Typically this is 80 to 90 percent of the
     *         input documents.
     *         </p>
     */
    public Integer getNumberOfTrainedDocuments() {
        return numberOfTrainedDocuments;
    }

    /**
     * <p>
     * The number of documents in the input data that were used to train the
     * entity recognizer. Typically this is 80 to 90 percent of the input
     * documents.
     * </p>
     *
     * @param numberOfTrainedDocuments <p>
     *            The number of documents in the input data that were used to
     *            train the entity recognizer. Typically this is 80 to 90
     *            percent of the input documents.
     *            </p>
     */
    public void setNumberOfTrainedDocuments(Integer numberOfTrainedDocuments) {
        this.numberOfTrainedDocuments = numberOfTrainedDocuments;
    }

    /**
     * <p>
     * The number of documents in the input data that were used to train the
     * entity recognizer. Typically this is 80 to 90 percent of the input
     * documents.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param numberOfTrainedDocuments <p>
     *            The number of documents in the input data that were used to
     *            train the entity recognizer. Typically this is 80 to 90
     *            percent of the input documents.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EntityRecognizerMetadata withNumberOfTrainedDocuments(Integer numberOfTrainedDocuments) {
        this.numberOfTrainedDocuments = numberOfTrainedDocuments;
        return this;
    }

    /**
     * <p>
     * The number of documents in the input data that were used to test the
     * entity recognizer. Typically this is 10 to 20 percent of the input
     * documents.
     * </p>
     *
     * @return <p>
     *         The number of documents in the input data that were used to test
     *         the entity recognizer. Typically this is 10 to 20 percent of the
     *         input documents.
     *         </p>
     */
    public Integer getNumberOfTestDocuments() {
        return numberOfTestDocuments;
    }

    /**
     * <p>
     * The number of documents in the input data that were used to test the
     * entity recognizer. Typically this is 10 to 20 percent of the input
     * documents.
     * </p>
     *
     * @param numberOfTestDocuments <p>
     *            The number of documents in the input data that were used to
     *            test the entity recognizer. Typically this is 10 to 20 percent
     *            of the input documents.
     *            </p>
     */
    public void setNumberOfTestDocuments(Integer numberOfTestDocuments) {
        this.numberOfTestDocuments = numberOfTestDocuments;
    }

    /**
     * <p>
     * The number of documents in the input data that were used to test the
     * entity recognizer. Typically this is 10 to 20 percent of the input
     * documents.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param numberOfTestDocuments <p>
     *            The number of documents in the input data that were used to
     *            test the entity recognizer. Typically this is 10 to 20 percent
     *            of the input documents.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EntityRecognizerMetadata withNumberOfTestDocuments(Integer numberOfTestDocuments) {
        this.numberOfTestDocuments = numberOfTestDocuments;
        return this;
    }

    /**
     * <p>
     * Detailed information about the accuracy of an entity recognizer.
     * </p>
     *
     * @return <p>
     *         Detailed information about the accuracy of an entity recognizer.
     *         </p>
     */
    public EntityRecognizerEvaluationMetrics getEvaluationMetrics() {
        return evaluationMetrics;
    }

    /**
     * <p>
     * Detailed information about the accuracy of an entity recognizer.
     * </p>
     *
     * @param evaluationMetrics <p>
     *            Detailed information about the accuracy of an entity
     *            recognizer.
     *            </p>
     */
    public void setEvaluationMetrics(EntityRecognizerEvaluationMetrics evaluationMetrics) {
        this.evaluationMetrics = evaluationMetrics;
    }

    /**
     * <p>
     * Detailed information about the accuracy of an entity recognizer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param evaluationMetrics <p>
     *            Detailed information about the accuracy of an entity
     *            recognizer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EntityRecognizerMetadata withEvaluationMetrics(
            EntityRecognizerEvaluationMetrics evaluationMetrics) {
        this.evaluationMetrics = evaluationMetrics;
        return this;
    }

    /**
     * <p>
     * Entity types from the metadata of an entity recognizer.
     * </p>
     *
     * @return <p>
     *         Entity types from the metadata of an entity recognizer.
     *         </p>
     */
    public java.util.List<EntityRecognizerMetadataEntityTypesListItem> getEntityTypes() {
        return entityTypes;
    }

    /**
     * <p>
     * Entity types from the metadata of an entity recognizer.
     * </p>
     *
     * @param entityTypes <p>
     *            Entity types from the metadata of an entity recognizer.
     *            </p>
     */
    public void setEntityTypes(
            java.util.Collection<EntityRecognizerMetadataEntityTypesListItem> entityTypes) {
        if (entityTypes == null) {
            this.entityTypes = null;
            return;
        }

        this.entityTypes = new java.util.ArrayList<EntityRecognizerMetadataEntityTypesListItem>(
                entityTypes);
    }

    /**
     * <p>
     * Entity types from the metadata of an entity recognizer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entityTypes <p>
     *            Entity types from the metadata of an entity recognizer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EntityRecognizerMetadata withEntityTypes(
            EntityRecognizerMetadataEntityTypesListItem... entityTypes) {
        if (getEntityTypes() == null) {
            this.entityTypes = new java.util.ArrayList<EntityRecognizerMetadataEntityTypesListItem>(
                    entityTypes.length);
        }
        for (EntityRecognizerMetadataEntityTypesListItem value : entityTypes) {
            this.entityTypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Entity types from the metadata of an entity recognizer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entityTypes <p>
     *            Entity types from the metadata of an entity recognizer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EntityRecognizerMetadata withEntityTypes(
            java.util.Collection<EntityRecognizerMetadataEntityTypesListItem> entityTypes) {
        setEntityTypes(entityTypes);
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
        if (getNumberOfTrainedDocuments() != null)
            sb.append("NumberOfTrainedDocuments: " + getNumberOfTrainedDocuments() + ",");
        if (getNumberOfTestDocuments() != null)
            sb.append("NumberOfTestDocuments: " + getNumberOfTestDocuments() + ",");
        if (getEvaluationMetrics() != null)
            sb.append("EvaluationMetrics: " + getEvaluationMetrics() + ",");
        if (getEntityTypes() != null)
            sb.append("EntityTypes: " + getEntityTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getNumberOfTrainedDocuments() == null) ? 0 : getNumberOfTrainedDocuments()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getNumberOfTestDocuments() == null) ? 0 : getNumberOfTestDocuments().hashCode());
        hashCode = prime * hashCode
                + ((getEvaluationMetrics() == null) ? 0 : getEvaluationMetrics().hashCode());
        hashCode = prime * hashCode
                + ((getEntityTypes() == null) ? 0 : getEntityTypes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EntityRecognizerMetadata == false)
            return false;
        EntityRecognizerMetadata other = (EntityRecognizerMetadata) obj;

        if (other.getNumberOfTrainedDocuments() == null
                ^ this.getNumberOfTrainedDocuments() == null)
            return false;
        if (other.getNumberOfTrainedDocuments() != null
                && other.getNumberOfTrainedDocuments().equals(this.getNumberOfTrainedDocuments()) == false)
            return false;
        if (other.getNumberOfTestDocuments() == null ^ this.getNumberOfTestDocuments() == null)
            return false;
        if (other.getNumberOfTestDocuments() != null
                && other.getNumberOfTestDocuments().equals(this.getNumberOfTestDocuments()) == false)
            return false;
        if (other.getEvaluationMetrics() == null ^ this.getEvaluationMetrics() == null)
            return false;
        if (other.getEvaluationMetrics() != null
                && other.getEvaluationMetrics().equals(this.getEvaluationMetrics()) == false)
            return false;
        if (other.getEntityTypes() == null ^ this.getEntityTypes() == null)
            return false;
        if (other.getEntityTypes() != null
                && other.getEntityTypes().equals(this.getEntityTypes()) == false)
            return false;
        return true;
    }
}
