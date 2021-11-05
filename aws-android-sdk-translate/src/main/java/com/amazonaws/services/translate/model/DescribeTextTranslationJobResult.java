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

public class DescribeTextTranslationJobResult implements Serializable {
    /**
     * <p>
     * An object that contains the properties associated with an asynchronous
     * batch translation job.
     * </p>
     */
    private TextTranslationJobProperties textTranslationJobProperties;

    /**
     * <p>
     * An object that contains the properties associated with an asynchronous
     * batch translation job.
     * </p>
     *
     * @return <p>
     *         An object that contains the properties associated with an
     *         asynchronous batch translation job.
     *         </p>
     */
    public TextTranslationJobProperties getTextTranslationJobProperties() {
        return textTranslationJobProperties;
    }

    /**
     * <p>
     * An object that contains the properties associated with an asynchronous
     * batch translation job.
     * </p>
     *
     * @param textTranslationJobProperties <p>
     *            An object that contains the properties associated with an
     *            asynchronous batch translation job.
     *            </p>
     */
    public void setTextTranslationJobProperties(
            TextTranslationJobProperties textTranslationJobProperties) {
        this.textTranslationJobProperties = textTranslationJobProperties;
    }

    /**
     * <p>
     * An object that contains the properties associated with an asynchronous
     * batch translation job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param textTranslationJobProperties <p>
     *            An object that contains the properties associated with an
     *            asynchronous batch translation job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTextTranslationJobResult withTextTranslationJobProperties(
            TextTranslationJobProperties textTranslationJobProperties) {
        this.textTranslationJobProperties = textTranslationJobProperties;
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
        if (getTextTranslationJobProperties() != null)
            sb.append("TextTranslationJobProperties: " + getTextTranslationJobProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getTextTranslationJobProperties() == null) ? 0
                        : getTextTranslationJobProperties().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTextTranslationJobResult == false)
            return false;
        DescribeTextTranslationJobResult other = (DescribeTextTranslationJobResult) obj;

        if (other.getTextTranslationJobProperties() == null
                ^ this.getTextTranslationJobProperties() == null)
            return false;
        if (other.getTextTranslationJobProperties() != null
                && other.getTextTranslationJobProperties().equals(
                        this.getTextTranslationJobProperties()) == false)
            return false;
        return true;
    }
}
