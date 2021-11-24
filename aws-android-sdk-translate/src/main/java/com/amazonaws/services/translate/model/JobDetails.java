/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.translate.model;

import java.io.Serializable;

/**
 * <p>
 * The number of documents successfully and unsuccessfully processed during a
 * translation job.
 * </p>
 */
public class JobDetails implements Serializable {
    /**
     * <p>
     * The number of documents successfully processed during a translation job.
     * </p>
     */
    private Integer translatedDocumentsCount;

    /**
     * <p>
     * The number of documents that could not be processed during a translation
     * job.
     * </p>
     */
    private Integer documentsWithErrorsCount;

    /**
     * <p>
     * The number of documents used as input in a translation job.
     * </p>
     */
    private Integer inputDocumentsCount;

    /**
     * <p>
     * The number of documents successfully processed during a translation job.
     * </p>
     *
     * @return <p>
     *         The number of documents successfully processed during a
     *         translation job.
     *         </p>
     */
    public Integer getTranslatedDocumentsCount() {
        return translatedDocumentsCount;
    }

    /**
     * <p>
     * The number of documents successfully processed during a translation job.
     * </p>
     *
     * @param translatedDocumentsCount <p>
     *            The number of documents successfully processed during a
     *            translation job.
     *            </p>
     */
    public void setTranslatedDocumentsCount(Integer translatedDocumentsCount) {
        this.translatedDocumentsCount = translatedDocumentsCount;
    }

    /**
     * <p>
     * The number of documents successfully processed during a translation job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param translatedDocumentsCount <p>
     *            The number of documents successfully processed during a
     *            translation job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobDetails withTranslatedDocumentsCount(Integer translatedDocumentsCount) {
        this.translatedDocumentsCount = translatedDocumentsCount;
        return this;
    }

    /**
     * <p>
     * The number of documents that could not be processed during a translation
     * job.
     * </p>
     *
     * @return <p>
     *         The number of documents that could not be processed during a
     *         translation job.
     *         </p>
     */
    public Integer getDocumentsWithErrorsCount() {
        return documentsWithErrorsCount;
    }

    /**
     * <p>
     * The number of documents that could not be processed during a translation
     * job.
     * </p>
     *
     * @param documentsWithErrorsCount <p>
     *            The number of documents that could not be processed during a
     *            translation job.
     *            </p>
     */
    public void setDocumentsWithErrorsCount(Integer documentsWithErrorsCount) {
        this.documentsWithErrorsCount = documentsWithErrorsCount;
    }

    /**
     * <p>
     * The number of documents that could not be processed during a translation
     * job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param documentsWithErrorsCount <p>
     *            The number of documents that could not be processed during a
     *            translation job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobDetails withDocumentsWithErrorsCount(Integer documentsWithErrorsCount) {
        this.documentsWithErrorsCount = documentsWithErrorsCount;
        return this;
    }

    /**
     * <p>
     * The number of documents used as input in a translation job.
     * </p>
     *
     * @return <p>
     *         The number of documents used as input in a translation job.
     *         </p>
     */
    public Integer getInputDocumentsCount() {
        return inputDocumentsCount;
    }

    /**
     * <p>
     * The number of documents used as input in a translation job.
     * </p>
     *
     * @param inputDocumentsCount <p>
     *            The number of documents used as input in a translation job.
     *            </p>
     */
    public void setInputDocumentsCount(Integer inputDocumentsCount) {
        this.inputDocumentsCount = inputDocumentsCount;
    }

    /**
     * <p>
     * The number of documents used as input in a translation job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputDocumentsCount <p>
     *            The number of documents used as input in a translation job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobDetails withInputDocumentsCount(Integer inputDocumentsCount) {
        this.inputDocumentsCount = inputDocumentsCount;
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
        if (getTranslatedDocumentsCount() != null)
            sb.append("TranslatedDocumentsCount: " + getTranslatedDocumentsCount() + ",");
        if (getDocumentsWithErrorsCount() != null)
            sb.append("DocumentsWithErrorsCount: " + getDocumentsWithErrorsCount() + ",");
        if (getInputDocumentsCount() != null)
            sb.append("InputDocumentsCount: " + getInputDocumentsCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getTranslatedDocumentsCount() == null) ? 0 : getTranslatedDocumentsCount()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getDocumentsWithErrorsCount() == null) ? 0 : getDocumentsWithErrorsCount()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getInputDocumentsCount() == null) ? 0 : getInputDocumentsCount().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobDetails == false)
            return false;
        JobDetails other = (JobDetails) obj;

        if (other.getTranslatedDocumentsCount() == null
                ^ this.getTranslatedDocumentsCount() == null)
            return false;
        if (other.getTranslatedDocumentsCount() != null
                && other.getTranslatedDocumentsCount().equals(this.getTranslatedDocumentsCount()) == false)
            return false;
        if (other.getDocumentsWithErrorsCount() == null
                ^ this.getDocumentsWithErrorsCount() == null)
            return false;
        if (other.getDocumentsWithErrorsCount() != null
                && other.getDocumentsWithErrorsCount().equals(this.getDocumentsWithErrorsCount()) == false)
            return false;
        if (other.getInputDocumentsCount() == null ^ this.getInputDocumentsCount() == null)
            return false;
        if (other.getInputDocumentsCount() != null
                && other.getInputDocumentsCount().equals(this.getInputDocumentsCount()) == false)
            return false;
        return true;
    }
}
