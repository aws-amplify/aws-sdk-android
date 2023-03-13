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

package com.amazonaws.services.transcribe.model;

import java.io.Serializable;

public class DescribeLanguageModelResult implements Serializable {
    /**
     * <p>
     * Provides information about the specified custom language model.
     * </p>
     * <p>
     * This parameter also shows if the base language model you used to create
     * your custom language model has been updated. If Amazon Transcribe has
     * updated the base model, you can create a new custom language model using
     * the updated base model.
     * </p>
     * <p>
     * If you tried to create a new custom language model and the request wasn't
     * successful, you can use this <code>DescribeLanguageModel</code> to help
     * identify the reason for this failure.
     * </p>
     */
    private LanguageModel languageModel;

    /**
     * <p>
     * Provides information about the specified custom language model.
     * </p>
     * <p>
     * This parameter also shows if the base language model you used to create
     * your custom language model has been updated. If Amazon Transcribe has
     * updated the base model, you can create a new custom language model using
     * the updated base model.
     * </p>
     * <p>
     * If you tried to create a new custom language model and the request wasn't
     * successful, you can use this <code>DescribeLanguageModel</code> to help
     * identify the reason for this failure.
     * </p>
     *
     * @return <p>
     *         Provides information about the specified custom language model.
     *         </p>
     *         <p>
     *         This parameter also shows if the base language model you used to
     *         create your custom language model has been updated. If Amazon
     *         Transcribe has updated the base model, you can create a new
     *         custom language model using the updated base model.
     *         </p>
     *         <p>
     *         If you tried to create a new custom language model and the
     *         request wasn't successful, you can use this
     *         <code>DescribeLanguageModel</code> to help identify the reason
     *         for this failure.
     *         </p>
     */
    public LanguageModel getLanguageModel() {
        return languageModel;
    }

    /**
     * <p>
     * Provides information about the specified custom language model.
     * </p>
     * <p>
     * This parameter also shows if the base language model you used to create
     * your custom language model has been updated. If Amazon Transcribe has
     * updated the base model, you can create a new custom language model using
     * the updated base model.
     * </p>
     * <p>
     * If you tried to create a new custom language model and the request wasn't
     * successful, you can use this <code>DescribeLanguageModel</code> to help
     * identify the reason for this failure.
     * </p>
     *
     * @param languageModel <p>
     *            Provides information about the specified custom language
     *            model.
     *            </p>
     *            <p>
     *            This parameter also shows if the base language model you used
     *            to create your custom language model has been updated. If
     *            Amazon Transcribe has updated the base model, you can create a
     *            new custom language model using the updated base model.
     *            </p>
     *            <p>
     *            If you tried to create a new custom language model and the
     *            request wasn't successful, you can use this
     *            <code>DescribeLanguageModel</code> to help identify the reason
     *            for this failure.
     *            </p>
     */
    public void setLanguageModel(LanguageModel languageModel) {
        this.languageModel = languageModel;
    }

    /**
     * <p>
     * Provides information about the specified custom language model.
     * </p>
     * <p>
     * This parameter also shows if the base language model you used to create
     * your custom language model has been updated. If Amazon Transcribe has
     * updated the base model, you can create a new custom language model using
     * the updated base model.
     * </p>
     * <p>
     * If you tried to create a new custom language model and the request wasn't
     * successful, you can use this <code>DescribeLanguageModel</code> to help
     * identify the reason for this failure.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param languageModel <p>
     *            Provides information about the specified custom language
     *            model.
     *            </p>
     *            <p>
     *            This parameter also shows if the base language model you used
     *            to create your custom language model has been updated. If
     *            Amazon Transcribe has updated the base model, you can create a
     *            new custom language model using the updated base model.
     *            </p>
     *            <p>
     *            If you tried to create a new custom language model and the
     *            request wasn't successful, you can use this
     *            <code>DescribeLanguageModel</code> to help identify the reason
     *            for this failure.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLanguageModelResult withLanguageModel(LanguageModel languageModel) {
        this.languageModel = languageModel;
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
        if (getLanguageModel() != null)
            sb.append("LanguageModel: " + getLanguageModel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLanguageModel() == null) ? 0 : getLanguageModel().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeLanguageModelResult == false)
            return false;
        DescribeLanguageModelResult other = (DescribeLanguageModelResult) obj;

        if (other.getLanguageModel() == null ^ this.getLanguageModel() == null)
            return false;
        if (other.getLanguageModel() != null
                && other.getLanguageModel().equals(this.getLanguageModel()) == false)
            return false;
        return true;
    }
}
