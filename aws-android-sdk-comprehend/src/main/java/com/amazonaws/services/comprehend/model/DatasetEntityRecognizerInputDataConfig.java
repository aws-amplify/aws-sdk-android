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
 * Specifies the format and location of the input data. You must provide either
 * the <code>Annotations</code> parameter or the <code>EntityList</code>
 * parameter.
 * </p>
 */
public class DatasetEntityRecognizerInputDataConfig implements Serializable {
    /**
     * <p>
     * The S3 location of the annotation documents for your custom entity
     * recognizer.
     * </p>
     */
    private DatasetEntityRecognizerAnnotations annotations;

    /**
     * <p>
     * The format and location of the training documents for your custom entity
     * recognizer.
     * </p>
     */
    private DatasetEntityRecognizerDocuments documents;

    /**
     * <p>
     * The S3 location of the entity list for your custom entity recognizer.
     * </p>
     */
    private DatasetEntityRecognizerEntityList entityList;

    /**
     * <p>
     * The S3 location of the annotation documents for your custom entity
     * recognizer.
     * </p>
     *
     * @return <p>
     *         The S3 location of the annotation documents for your custom
     *         entity recognizer.
     *         </p>
     */
    public DatasetEntityRecognizerAnnotations getAnnotations() {
        return annotations;
    }

    /**
     * <p>
     * The S3 location of the annotation documents for your custom entity
     * recognizer.
     * </p>
     *
     * @param annotations <p>
     *            The S3 location of the annotation documents for your custom
     *            entity recognizer.
     *            </p>
     */
    public void setAnnotations(DatasetEntityRecognizerAnnotations annotations) {
        this.annotations = annotations;
    }

    /**
     * <p>
     * The S3 location of the annotation documents for your custom entity
     * recognizer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param annotations <p>
     *            The S3 location of the annotation documents for your custom
     *            entity recognizer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DatasetEntityRecognizerInputDataConfig withAnnotations(
            DatasetEntityRecognizerAnnotations annotations) {
        this.annotations = annotations;
        return this;
    }

    /**
     * <p>
     * The format and location of the training documents for your custom entity
     * recognizer.
     * </p>
     *
     * @return <p>
     *         The format and location of the training documents for your custom
     *         entity recognizer.
     *         </p>
     */
    public DatasetEntityRecognizerDocuments getDocuments() {
        return documents;
    }

    /**
     * <p>
     * The format and location of the training documents for your custom entity
     * recognizer.
     * </p>
     *
     * @param documents <p>
     *            The format and location of the training documents for your
     *            custom entity recognizer.
     *            </p>
     */
    public void setDocuments(DatasetEntityRecognizerDocuments documents) {
        this.documents = documents;
    }

    /**
     * <p>
     * The format and location of the training documents for your custom entity
     * recognizer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param documents <p>
     *            The format and location of the training documents for your
     *            custom entity recognizer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DatasetEntityRecognizerInputDataConfig withDocuments(
            DatasetEntityRecognizerDocuments documents) {
        this.documents = documents;
        return this;
    }

    /**
     * <p>
     * The S3 location of the entity list for your custom entity recognizer.
     * </p>
     *
     * @return <p>
     *         The S3 location of the entity list for your custom entity
     *         recognizer.
     *         </p>
     */
    public DatasetEntityRecognizerEntityList getEntityList() {
        return entityList;
    }

    /**
     * <p>
     * The S3 location of the entity list for your custom entity recognizer.
     * </p>
     *
     * @param entityList <p>
     *            The S3 location of the entity list for your custom entity
     *            recognizer.
     *            </p>
     */
    public void setEntityList(DatasetEntityRecognizerEntityList entityList) {
        this.entityList = entityList;
    }

    /**
     * <p>
     * The S3 location of the entity list for your custom entity recognizer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entityList <p>
     *            The S3 location of the entity list for your custom entity
     *            recognizer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DatasetEntityRecognizerInputDataConfig withEntityList(
            DatasetEntityRecognizerEntityList entityList) {
        this.entityList = entityList;
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
        if (getAnnotations() != null)
            sb.append("Annotations: " + getAnnotations() + ",");
        if (getDocuments() != null)
            sb.append("Documents: " + getDocuments() + ",");
        if (getEntityList() != null)
            sb.append("EntityList: " + getEntityList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAnnotations() == null) ? 0 : getAnnotations().hashCode());
        hashCode = prime * hashCode + ((getDocuments() == null) ? 0 : getDocuments().hashCode());
        hashCode = prime * hashCode + ((getEntityList() == null) ? 0 : getEntityList().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatasetEntityRecognizerInputDataConfig == false)
            return false;
        DatasetEntityRecognizerInputDataConfig other = (DatasetEntityRecognizerInputDataConfig) obj;

        if (other.getAnnotations() == null ^ this.getAnnotations() == null)
            return false;
        if (other.getAnnotations() != null
                && other.getAnnotations().equals(this.getAnnotations()) == false)
            return false;
        if (other.getDocuments() == null ^ this.getDocuments() == null)
            return false;
        if (other.getDocuments() != null
                && other.getDocuments().equals(this.getDocuments()) == false)
            return false;
        if (other.getEntityList() == null ^ this.getEntityList() == null)
            return false;
        if (other.getEntityList() != null
                && other.getEntityList().equals(this.getEntityList()) == false)
            return false;
        return true;
    }
}
