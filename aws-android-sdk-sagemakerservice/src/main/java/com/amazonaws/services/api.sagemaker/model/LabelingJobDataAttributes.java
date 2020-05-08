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
 * Attributes of the data specified by the customer. Use these to describe the
 * data to be labeled.
 * </p>
 */
public class LabelingJobDataAttributes implements Serializable {
    /**
     * <p>
     * Declares that your content is free of personally identifiable information
     * or adult content. Amazon SageMaker may restrict the Amazon Mechanical
     * Turk workers that can view your task based on this information.
     * </p>
     */
    private java.util.List<String> contentClassifiers;

    /**
     * <p>
     * Declares that your content is free of personally identifiable information
     * or adult content. Amazon SageMaker may restrict the Amazon Mechanical
     * Turk workers that can view your task based on this information.
     * </p>
     *
     * @return <p>
     *         Declares that your content is free of personally identifiable
     *         information or adult content. Amazon SageMaker may restrict the
     *         Amazon Mechanical Turk workers that can view your task based on
     *         this information.
     *         </p>
     */
    public java.util.List<String> getContentClassifiers() {
        return contentClassifiers;
    }

    /**
     * <p>
     * Declares that your content is free of personally identifiable information
     * or adult content. Amazon SageMaker may restrict the Amazon Mechanical
     * Turk workers that can view your task based on this information.
     * </p>
     *
     * @param contentClassifiers <p>
     *            Declares that your content is free of personally identifiable
     *            information or adult content. Amazon SageMaker may restrict
     *            the Amazon Mechanical Turk workers that can view your task
     *            based on this information.
     *            </p>
     */
    public void setContentClassifiers(java.util.Collection<String> contentClassifiers) {
        if (contentClassifiers == null) {
            this.contentClassifiers = null;
            return;
        }

        this.contentClassifiers = new java.util.ArrayList<String>(contentClassifiers);
    }

    /**
     * <p>
     * Declares that your content is free of personally identifiable information
     * or adult content. Amazon SageMaker may restrict the Amazon Mechanical
     * Turk workers that can view your task based on this information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contentClassifiers <p>
     *            Declares that your content is free of personally identifiable
     *            information or adult content. Amazon SageMaker may restrict
     *            the Amazon Mechanical Turk workers that can view your task
     *            based on this information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LabelingJobDataAttributes withContentClassifiers(String... contentClassifiers) {
        if (getContentClassifiers() == null) {
            this.contentClassifiers = new java.util.ArrayList<String>(contentClassifiers.length);
        }
        for (String value : contentClassifiers) {
            this.contentClassifiers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Declares that your content is free of personally identifiable information
     * or adult content. Amazon SageMaker may restrict the Amazon Mechanical
     * Turk workers that can view your task based on this information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contentClassifiers <p>
     *            Declares that your content is free of personally identifiable
     *            information or adult content. Amazon SageMaker may restrict
     *            the Amazon Mechanical Turk workers that can view your task
     *            based on this information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LabelingJobDataAttributes withContentClassifiers(
            java.util.Collection<String> contentClassifiers) {
        setContentClassifiers(contentClassifiers);
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
        if (getContentClassifiers() != null)
            sb.append("ContentClassifiers: " + getContentClassifiers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getContentClassifiers() == null) ? 0 : getContentClassifiers().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LabelingJobDataAttributes == false)
            return false;
        LabelingJobDataAttributes other = (LabelingJobDataAttributes) obj;

        if (other.getContentClassifiers() == null ^ this.getContentClassifiers() == null)
            return false;
        if (other.getContentClassifiers() != null
                && other.getContentClassifiers().equals(this.getContentClassifiers()) == false)
            return false;
        return true;
    }
}
