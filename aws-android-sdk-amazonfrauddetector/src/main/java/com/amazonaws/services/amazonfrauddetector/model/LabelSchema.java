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

package com.amazonaws.services.amazonfrauddetector.model;

import java.io.Serializable;

/**
 * <p>
 * The label schema.
 * </p>
 */
public class LabelSchema implements Serializable {
    /**
     * <p>
     * The label key.
     * </p>
     */
    private String labelKey;

    /**
     * <p>
     * The label mapper maps the Amazon Fraud Detector supported label to the
     * appropriate source labels. For example, if <code>"FRAUD"</code> and
     * <code>"LEGIT"</code> are Amazon Fraud Detector supported labels, this
     * mapper could be: <code>{"FRAUD" =&gt; ["0"]</code>, "LEGIT" =&gt; ["1"]}
     * or <code>{"FRAUD" =&gt; ["false"], "LEGIT" =&gt; ["true"]}</code> or
     * <code>{"FRAUD" =&gt; ["fraud", "abuse"], "LEGIT" =&gt; ["legit", "safe"]}</code>
     * . The value part of the mapper is a list, because you may have multiple
     * variants for a single Amazon Fraud Detector label.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> labelMapper;

    /**
     * <p>
     * The label key.
     * </p>
     *
     * @return <p>
     *         The label key.
     *         </p>
     */
    public String getLabelKey() {
        return labelKey;
    }

    /**
     * <p>
     * The label key.
     * </p>
     *
     * @param labelKey <p>
     *            The label key.
     *            </p>
     */
    public void setLabelKey(String labelKey) {
        this.labelKey = labelKey;
    }

    /**
     * <p>
     * The label key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param labelKey <p>
     *            The label key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LabelSchema withLabelKey(String labelKey) {
        this.labelKey = labelKey;
        return this;
    }

    /**
     * <p>
     * The label mapper maps the Amazon Fraud Detector supported label to the
     * appropriate source labels. For example, if <code>"FRAUD"</code> and
     * <code>"LEGIT"</code> are Amazon Fraud Detector supported labels, this
     * mapper could be: <code>{"FRAUD" =&gt; ["0"]</code>, "LEGIT" =&gt; ["1"]}
     * or <code>{"FRAUD" =&gt; ["false"], "LEGIT" =&gt; ["true"]}</code> or
     * <code>{"FRAUD" =&gt; ["fraud", "abuse"], "LEGIT" =&gt; ["legit", "safe"]}</code>
     * . The value part of the mapper is a list, because you may have multiple
     * variants for a single Amazon Fraud Detector label.
     * </p>
     *
     * @return <p>
     *         The label mapper maps the Amazon Fraud Detector supported label
     *         to the appropriate source labels. For example, if
     *         <code>"FRAUD"</code> and <code>"LEGIT"</code> are Amazon Fraud
     *         Detector supported labels, this mapper could be:
     *         <code>{"FRAUD" =&gt; ["0"]</code>, "LEGIT" =&gt; ["1"]} or
     *         <code>{"FRAUD" =&gt; ["false"], "LEGIT" =&gt; ["true"]}</code> or
     *         <code>{"FRAUD" =&gt; ["fraud", "abuse"], "LEGIT" =&gt; ["legit", "safe"]}</code>
     *         . The value part of the mapper is a list, because you may have
     *         multiple variants for a single Amazon Fraud Detector label.
     *         </p>
     */
    public java.util.Map<String, java.util.List<String>> getLabelMapper() {
        return labelMapper;
    }

    /**
     * <p>
     * The label mapper maps the Amazon Fraud Detector supported label to the
     * appropriate source labels. For example, if <code>"FRAUD"</code> and
     * <code>"LEGIT"</code> are Amazon Fraud Detector supported labels, this
     * mapper could be: <code>{"FRAUD" =&gt; ["0"]</code>, "LEGIT" =&gt; ["1"]}
     * or <code>{"FRAUD" =&gt; ["false"], "LEGIT" =&gt; ["true"]}</code> or
     * <code>{"FRAUD" =&gt; ["fraud", "abuse"], "LEGIT" =&gt; ["legit", "safe"]}</code>
     * . The value part of the mapper is a list, because you may have multiple
     * variants for a single Amazon Fraud Detector label.
     * </p>
     *
     * @param labelMapper <p>
     *            The label mapper maps the Amazon Fraud Detector supported
     *            label to the appropriate source labels. For example, if
     *            <code>"FRAUD"</code> and <code>"LEGIT"</code> are Amazon Fraud
     *            Detector supported labels, this mapper could be:
     *            <code>{"FRAUD" =&gt; ["0"]</code>, "LEGIT" =&gt; ["1"]} or
     *            <code>{"FRAUD" =&gt; ["false"], "LEGIT" =&gt; ["true"]}</code>
     *            or
     *            <code>{"FRAUD" =&gt; ["fraud", "abuse"], "LEGIT" =&gt; ["legit", "safe"]}</code>
     *            . The value part of the mapper is a list, because you may have
     *            multiple variants for a single Amazon Fraud Detector label.
     *            </p>
     */
    public void setLabelMapper(java.util.Map<String, java.util.List<String>> labelMapper) {
        this.labelMapper = labelMapper;
    }

    /**
     * <p>
     * The label mapper maps the Amazon Fraud Detector supported label to the
     * appropriate source labels. For example, if <code>"FRAUD"</code> and
     * <code>"LEGIT"</code> are Amazon Fraud Detector supported labels, this
     * mapper could be: <code>{"FRAUD" =&gt; ["0"]</code>, "LEGIT" =&gt; ["1"]}
     * or <code>{"FRAUD" =&gt; ["false"], "LEGIT" =&gt; ["true"]}</code> or
     * <code>{"FRAUD" =&gt; ["fraud", "abuse"], "LEGIT" =&gt; ["legit", "safe"]}</code>
     * . The value part of the mapper is a list, because you may have multiple
     * variants for a single Amazon Fraud Detector label.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param labelMapper <p>
     *            The label mapper maps the Amazon Fraud Detector supported
     *            label to the appropriate source labels. For example, if
     *            <code>"FRAUD"</code> and <code>"LEGIT"</code> are Amazon Fraud
     *            Detector supported labels, this mapper could be:
     *            <code>{"FRAUD" =&gt; ["0"]</code>, "LEGIT" =&gt; ["1"]} or
     *            <code>{"FRAUD" =&gt; ["false"], "LEGIT" =&gt; ["true"]}</code>
     *            or
     *            <code>{"FRAUD" =&gt; ["fraud", "abuse"], "LEGIT" =&gt; ["legit", "safe"]}</code>
     *            . The value part of the mapper is a list, because you may have
     *            multiple variants for a single Amazon Fraud Detector label.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LabelSchema withLabelMapper(java.util.Map<String, java.util.List<String>> labelMapper) {
        this.labelMapper = labelMapper;
        return this;
    }

    /**
     * <p>
     * The label mapper maps the Amazon Fraud Detector supported label to the
     * appropriate source labels. For example, if <code>"FRAUD"</code> and
     * <code>"LEGIT"</code> are Amazon Fraud Detector supported labels, this
     * mapper could be: <code>{"FRAUD" =&gt; ["0"]</code>, "LEGIT" =&gt; ["1"]}
     * or <code>{"FRAUD" =&gt; ["false"], "LEGIT" =&gt; ["true"]}</code> or
     * <code>{"FRAUD" =&gt; ["fraud", "abuse"], "LEGIT" =&gt; ["legit", "safe"]}</code>
     * . The value part of the mapper is a list, because you may have multiple
     * variants for a single Amazon Fraud Detector label.
     * </p>
     * <p>
     * The method adds a new key-value pair into labelMapper parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into labelMapper.
     * @param value The corresponding value of the entry to be added into
     *            labelMapper.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LabelSchema addlabelMapperEntry(String key, java.util.List<String> value) {
        if (null == this.labelMapper) {
            this.labelMapper = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.labelMapper.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.labelMapper.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into labelMapper.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public LabelSchema clearlabelMapperEntries() {
        this.labelMapper = null;
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
        if (getLabelKey() != null)
            sb.append("labelKey: " + getLabelKey() + ",");
        if (getLabelMapper() != null)
            sb.append("labelMapper: " + getLabelMapper());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLabelKey() == null) ? 0 : getLabelKey().hashCode());
        hashCode = prime * hashCode
                + ((getLabelMapper() == null) ? 0 : getLabelMapper().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LabelSchema == false)
            return false;
        LabelSchema other = (LabelSchema) obj;

        if (other.getLabelKey() == null ^ this.getLabelKey() == null)
            return false;
        if (other.getLabelKey() != null && other.getLabelKey().equals(this.getLabelKey()) == false)
            return false;
        if (other.getLabelMapper() == null ^ this.getLabelMapper() == null)
            return false;
        if (other.getLabelMapper() != null
                && other.getLabelMapper().equals(this.getLabelMapper()) == false)
            return false;
        return true;
    }
}
