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

/**
 * <p>
 * Contains <code>ToxicityCategories</code>, which is a required parameter if
 * you want to enable toxicity detection (<code>ToxicityDetection</code>) in
 * your transcription request.
 * </p>
 */
public class ToxicityDetectionSettings implements Serializable {
    /**
     * <p>
     * If you include <code>ToxicityDetection</code> in your transcription
     * request, you must also include <code>ToxicityCategories</code>. The only
     * accepted value for this parameter is <code>ALL</code>.
     * </p>
     */
    private java.util.List<String> toxicityCategories;

    /**
     * <p>
     * If you include <code>ToxicityDetection</code> in your transcription
     * request, you must also include <code>ToxicityCategories</code>. The only
     * accepted value for this parameter is <code>ALL</code>.
     * </p>
     *
     * @return <p>
     *         If you include <code>ToxicityDetection</code> in your
     *         transcription request, you must also include
     *         <code>ToxicityCategories</code>. The only accepted value for this
     *         parameter is <code>ALL</code>.
     *         </p>
     */
    public java.util.List<String> getToxicityCategories() {
        return toxicityCategories;
    }

    /**
     * <p>
     * If you include <code>ToxicityDetection</code> in your transcription
     * request, you must also include <code>ToxicityCategories</code>. The only
     * accepted value for this parameter is <code>ALL</code>.
     * </p>
     *
     * @param toxicityCategories <p>
     *            If you include <code>ToxicityDetection</code> in your
     *            transcription request, you must also include
     *            <code>ToxicityCategories</code>. The only accepted value for
     *            this parameter is <code>ALL</code>.
     *            </p>
     */
    public void setToxicityCategories(java.util.Collection<String> toxicityCategories) {
        if (toxicityCategories == null) {
            this.toxicityCategories = null;
            return;
        }

        this.toxicityCategories = new java.util.ArrayList<String>(toxicityCategories);
    }

    /**
     * <p>
     * If you include <code>ToxicityDetection</code> in your transcription
     * request, you must also include <code>ToxicityCategories</code>. The only
     * accepted value for this parameter is <code>ALL</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param toxicityCategories <p>
     *            If you include <code>ToxicityDetection</code> in your
     *            transcription request, you must also include
     *            <code>ToxicityCategories</code>. The only accepted value for
     *            this parameter is <code>ALL</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ToxicityDetectionSettings withToxicityCategories(String... toxicityCategories) {
        if (getToxicityCategories() == null) {
            this.toxicityCategories = new java.util.ArrayList<String>(toxicityCategories.length);
        }
        for (String value : toxicityCategories) {
            this.toxicityCategories.add(value);
        }
        return this;
    }

    /**
     * <p>
     * If you include <code>ToxicityDetection</code> in your transcription
     * request, you must also include <code>ToxicityCategories</code>. The only
     * accepted value for this parameter is <code>ALL</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param toxicityCategories <p>
     *            If you include <code>ToxicityDetection</code> in your
     *            transcription request, you must also include
     *            <code>ToxicityCategories</code>. The only accepted value for
     *            this parameter is <code>ALL</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ToxicityDetectionSettings withToxicityCategories(
            java.util.Collection<String> toxicityCategories) {
        setToxicityCategories(toxicityCategories);
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
        if (getToxicityCategories() != null)
            sb.append("ToxicityCategories: " + getToxicityCategories());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getToxicityCategories() == null) ? 0 : getToxicityCategories().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ToxicityDetectionSettings == false)
            return false;
        ToxicityDetectionSettings other = (ToxicityDetectionSettings) obj;

        if (other.getToxicityCategories() == null ^ this.getToxicityCategories() == null)
            return false;
        if (other.getToxicityCategories() != null
                && other.getToxicityCategories().equals(this.getToxicityCategories()) == false)
            return false;
        return true;
    }
}
