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

package com.amazonaws.services.amazonelasticinference.model;

import java.io.Serializable;

/**
 * <p>
 * A throughput entry for an Elastic Inference Accelerator type.
 * </p>
 */
public class KeyValuePair implements Serializable {
    /**
     * <p>
     * The throughput value of the Elastic Inference Accelerator type. It can
     * assume the following values: TFLOPS16bit: the throughput expressed in
     * 16bit TeraFLOPS. TFLOPS32bit: the throughput expressed in 32bit
     * TeraFLOPS.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^\S+$<br/>
     */
    private String key;

    /**
     * <p>
     * The throughput value of the Elastic Inference Accelerator type.
     * </p>
     */
    private Integer value;

    /**
     * <p>
     * The throughput value of the Elastic Inference Accelerator type. It can
     * assume the following values: TFLOPS16bit: the throughput expressed in
     * 16bit TeraFLOPS. TFLOPS32bit: the throughput expressed in 32bit
     * TeraFLOPS.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^\S+$<br/>
     *
     * @return <p>
     *         The throughput value of the Elastic Inference Accelerator type.
     *         It can assume the following values: TFLOPS16bit: the throughput
     *         expressed in 16bit TeraFLOPS. TFLOPS32bit: the throughput
     *         expressed in 32bit TeraFLOPS.
     *         </p>
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>
     * The throughput value of the Elastic Inference Accelerator type. It can
     * assume the following values: TFLOPS16bit: the throughput expressed in
     * 16bit TeraFLOPS. TFLOPS32bit: the throughput expressed in 32bit
     * TeraFLOPS.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^\S+$<br/>
     *
     * @param key <p>
     *            The throughput value of the Elastic Inference Accelerator
     *            type. It can assume the following values: TFLOPS16bit: the
     *            throughput expressed in 16bit TeraFLOPS. TFLOPS32bit: the
     *            throughput expressed in 32bit TeraFLOPS.
     *            </p>
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The throughput value of the Elastic Inference Accelerator type. It can
     * assume the following values: TFLOPS16bit: the throughput expressed in
     * 16bit TeraFLOPS. TFLOPS32bit: the throughput expressed in 32bit
     * TeraFLOPS.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^\S+$<br/>
     *
     * @param key <p>
     *            The throughput value of the Elastic Inference Accelerator
     *            type. It can assume the following values: TFLOPS16bit: the
     *            throughput expressed in 16bit TeraFLOPS. TFLOPS32bit: the
     *            throughput expressed in 32bit TeraFLOPS.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KeyValuePair withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>
     * The throughput value of the Elastic Inference Accelerator type.
     * </p>
     *
     * @return <p>
     *         The throughput value of the Elastic Inference Accelerator type.
     *         </p>
     */
    public Integer getValue() {
        return value;
    }

    /**
     * <p>
     * The throughput value of the Elastic Inference Accelerator type.
     * </p>
     *
     * @param value <p>
     *            The throughput value of the Elastic Inference Accelerator
     *            type.
     *            </p>
     */
    public void setValue(Integer value) {
        this.value = value;
    }

    /**
     * <p>
     * The throughput value of the Elastic Inference Accelerator type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            The throughput value of the Elastic Inference Accelerator
     *            type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KeyValuePair withValue(Integer value) {
        this.value = value;
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
        if (getKey() != null)
            sb.append("key: " + getKey() + ",");
        if (getValue() != null)
            sb.append("value: " + getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KeyValuePair == false)
            return false;
        KeyValuePair other = (KeyValuePair) obj;

        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }
}
