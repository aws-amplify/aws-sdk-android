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
 * The details of an Elastic Inference Accelerator type.
 * </p>
 */
public class AcceleratorType implements Serializable {
    /**
     * <p>
     * The name of the Elastic Inference Accelerator type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^\S+$<br/>
     */
    private String acceleratorTypeName;

    /**
     * <p>
     * The memory information of the Elastic Inference Accelerator type.
     * </p>
     */
    private MemoryInfo memoryInfo;

    /**
     * <p>
     * The throughput information of the Elastic Inference Accelerator type.
     * </p>
     */
    private java.util.List<KeyValuePair> throughputInfo;

    /**
     * <p>
     * The name of the Elastic Inference Accelerator type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^\S+$<br/>
     *
     * @return <p>
     *         The name of the Elastic Inference Accelerator type.
     *         </p>
     */
    public String getAcceleratorTypeName() {
        return acceleratorTypeName;
    }

    /**
     * <p>
     * The name of the Elastic Inference Accelerator type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^\S+$<br/>
     *
     * @param acceleratorTypeName <p>
     *            The name of the Elastic Inference Accelerator type.
     *            </p>
     */
    public void setAcceleratorTypeName(String acceleratorTypeName) {
        this.acceleratorTypeName = acceleratorTypeName;
    }

    /**
     * <p>
     * The name of the Elastic Inference Accelerator type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^\S+$<br/>
     *
     * @param acceleratorTypeName <p>
     *            The name of the Elastic Inference Accelerator type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AcceleratorType withAcceleratorTypeName(String acceleratorTypeName) {
        this.acceleratorTypeName = acceleratorTypeName;
        return this;
    }

    /**
     * <p>
     * The memory information of the Elastic Inference Accelerator type.
     * </p>
     *
     * @return <p>
     *         The memory information of the Elastic Inference Accelerator type.
     *         </p>
     */
    public MemoryInfo getMemoryInfo() {
        return memoryInfo;
    }

    /**
     * <p>
     * The memory information of the Elastic Inference Accelerator type.
     * </p>
     *
     * @param memoryInfo <p>
     *            The memory information of the Elastic Inference Accelerator
     *            type.
     *            </p>
     */
    public void setMemoryInfo(MemoryInfo memoryInfo) {
        this.memoryInfo = memoryInfo;
    }

    /**
     * <p>
     * The memory information of the Elastic Inference Accelerator type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param memoryInfo <p>
     *            The memory information of the Elastic Inference Accelerator
     *            type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AcceleratorType withMemoryInfo(MemoryInfo memoryInfo) {
        this.memoryInfo = memoryInfo;
        return this;
    }

    /**
     * <p>
     * The throughput information of the Elastic Inference Accelerator type.
     * </p>
     *
     * @return <p>
     *         The throughput information of the Elastic Inference Accelerator
     *         type.
     *         </p>
     */
    public java.util.List<KeyValuePair> getThroughputInfo() {
        return throughputInfo;
    }

    /**
     * <p>
     * The throughput information of the Elastic Inference Accelerator type.
     * </p>
     *
     * @param throughputInfo <p>
     *            The throughput information of the Elastic Inference
     *            Accelerator type.
     *            </p>
     */
    public void setThroughputInfo(java.util.Collection<KeyValuePair> throughputInfo) {
        if (throughputInfo == null) {
            this.throughputInfo = null;
            return;
        }

        this.throughputInfo = new java.util.ArrayList<KeyValuePair>(throughputInfo);
    }

    /**
     * <p>
     * The throughput information of the Elastic Inference Accelerator type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param throughputInfo <p>
     *            The throughput information of the Elastic Inference
     *            Accelerator type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AcceleratorType withThroughputInfo(KeyValuePair... throughputInfo) {
        if (getThroughputInfo() == null) {
            this.throughputInfo = new java.util.ArrayList<KeyValuePair>(throughputInfo.length);
        }
        for (KeyValuePair value : throughputInfo) {
            this.throughputInfo.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The throughput information of the Elastic Inference Accelerator type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param throughputInfo <p>
     *            The throughput information of the Elastic Inference
     *            Accelerator type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AcceleratorType withThroughputInfo(java.util.Collection<KeyValuePair> throughputInfo) {
        setThroughputInfo(throughputInfo);
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
        if (getAcceleratorTypeName() != null)
            sb.append("acceleratorTypeName: " + getAcceleratorTypeName() + ",");
        if (getMemoryInfo() != null)
            sb.append("memoryInfo: " + getMemoryInfo() + ",");
        if (getThroughputInfo() != null)
            sb.append("throughputInfo: " + getThroughputInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAcceleratorTypeName() == null) ? 0 : getAcceleratorTypeName().hashCode());
        hashCode = prime * hashCode + ((getMemoryInfo() == null) ? 0 : getMemoryInfo().hashCode());
        hashCode = prime * hashCode
                + ((getThroughputInfo() == null) ? 0 : getThroughputInfo().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AcceleratorType == false)
            return false;
        AcceleratorType other = (AcceleratorType) obj;

        if (other.getAcceleratorTypeName() == null ^ this.getAcceleratorTypeName() == null)
            return false;
        if (other.getAcceleratorTypeName() != null
                && other.getAcceleratorTypeName().equals(this.getAcceleratorTypeName()) == false)
            return false;
        if (other.getMemoryInfo() == null ^ this.getMemoryInfo() == null)
            return false;
        if (other.getMemoryInfo() != null
                && other.getMemoryInfo().equals(this.getMemoryInfo()) == false)
            return false;
        if (other.getThroughputInfo() == null ^ this.getThroughputInfo() == null)
            return false;
        if (other.getThroughputInfo() != null
                && other.getThroughputInfo().equals(this.getThroughputInfo()) == false)
            return false;
        return true;
    }
}
