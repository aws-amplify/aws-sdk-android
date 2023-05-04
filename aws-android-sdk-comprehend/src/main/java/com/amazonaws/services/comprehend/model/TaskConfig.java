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
 * Configuration about the custom classifier associated with the flywheel.
 * </p>
 */
public class TaskConfig implements Serializable {
    /**
     * <p>
     * Language code for the language that the model supports.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en, es, fr, de, it, pt, ar, hi, ja, ko, zh, zh-TW
     */
    private String languageCode;

    /**
     * <p>
     * Configuration required for a classification model.
     * </p>
     */
    private DocumentClassificationConfig documentClassificationConfig;

    /**
     * <p>
     * Configuration required for an entity recognition model.
     * </p>
     */
    private EntityRecognitionConfig entityRecognitionConfig;

    /**
     * <p>
     * Language code for the language that the model supports.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en, es, fr, de, it, pt, ar, hi, ja, ko, zh, zh-TW
     *
     * @return <p>
     *         Language code for the language that the model supports.
     *         </p>
     * @see LanguageCode
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * <p>
     * Language code for the language that the model supports.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en, es, fr, de, it, pt, ar, hi, ja, ko, zh, zh-TW
     *
     * @param languageCode <p>
     *            Language code for the language that the model supports.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * Language code for the language that the model supports.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en, es, fr, de, it, pt, ar, hi, ja, ko, zh, zh-TW
     *
     * @param languageCode <p>
     *            Language code for the language that the model supports.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public TaskConfig withLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * <p>
     * Language code for the language that the model supports.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en, es, fr, de, it, pt, ar, hi, ja, ko, zh, zh-TW
     *
     * @param languageCode <p>
     *            Language code for the language that the model supports.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
    }

    /**
     * <p>
     * Language code for the language that the model supports.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en, es, fr, de, it, pt, ar, hi, ja, ko, zh, zh-TW
     *
     * @param languageCode <p>
     *            Language code for the language that the model supports.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public TaskConfig withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * Configuration required for a classification model.
     * </p>
     *
     * @return <p>
     *         Configuration required for a classification model.
     *         </p>
     */
    public DocumentClassificationConfig getDocumentClassificationConfig() {
        return documentClassificationConfig;
    }

    /**
     * <p>
     * Configuration required for a classification model.
     * </p>
     *
     * @param documentClassificationConfig <p>
     *            Configuration required for a classification model.
     *            </p>
     */
    public void setDocumentClassificationConfig(
            DocumentClassificationConfig documentClassificationConfig) {
        this.documentClassificationConfig = documentClassificationConfig;
    }

    /**
     * <p>
     * Configuration required for a classification model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param documentClassificationConfig <p>
     *            Configuration required for a classification model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskConfig withDocumentClassificationConfig(
            DocumentClassificationConfig documentClassificationConfig) {
        this.documentClassificationConfig = documentClassificationConfig;
        return this;
    }

    /**
     * <p>
     * Configuration required for an entity recognition model.
     * </p>
     *
     * @return <p>
     *         Configuration required for an entity recognition model.
     *         </p>
     */
    public EntityRecognitionConfig getEntityRecognitionConfig() {
        return entityRecognitionConfig;
    }

    /**
     * <p>
     * Configuration required for an entity recognition model.
     * </p>
     *
     * @param entityRecognitionConfig <p>
     *            Configuration required for an entity recognition model.
     *            </p>
     */
    public void setEntityRecognitionConfig(EntityRecognitionConfig entityRecognitionConfig) {
        this.entityRecognitionConfig = entityRecognitionConfig;
    }

    /**
     * <p>
     * Configuration required for an entity recognition model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entityRecognitionConfig <p>
     *            Configuration required for an entity recognition model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TaskConfig withEntityRecognitionConfig(EntityRecognitionConfig entityRecognitionConfig) {
        this.entityRecognitionConfig = entityRecognitionConfig;
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
        if (getLanguageCode() != null)
            sb.append("LanguageCode: " + getLanguageCode() + ",");
        if (getDocumentClassificationConfig() != null)
            sb.append("DocumentClassificationConfig: " + getDocumentClassificationConfig() + ",");
        if (getEntityRecognitionConfig() != null)
            sb.append("EntityRecognitionConfig: " + getEntityRecognitionConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime
                * hashCode
                + ((getDocumentClassificationConfig() == null) ? 0
                        : getDocumentClassificationConfig().hashCode());
        hashCode = prime
                * hashCode
                + ((getEntityRecognitionConfig() == null) ? 0 : getEntityRecognitionConfig()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TaskConfig == false)
            return false;
        TaskConfig other = (TaskConfig) obj;

        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null
                && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getDocumentClassificationConfig() == null
                ^ this.getDocumentClassificationConfig() == null)
            return false;
        if (other.getDocumentClassificationConfig() != null
                && other.getDocumentClassificationConfig().equals(
                        this.getDocumentClassificationConfig()) == false)
            return false;
        if (other.getEntityRecognitionConfig() == null ^ this.getEntityRecognitionConfig() == null)
            return false;
        if (other.getEntityRecognitionConfig() != null
                && other.getEntityRecognitionConfig().equals(this.getEntityRecognitionConfig()) == false)
            return false;
        return true;
    }
}
