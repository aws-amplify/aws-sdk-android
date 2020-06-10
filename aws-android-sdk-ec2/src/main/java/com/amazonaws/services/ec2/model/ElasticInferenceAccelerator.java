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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes an elastic inference accelerator.
 * </p>
 */
public class ElasticInferenceAccelerator implements Serializable {
    /**
     * <p>
     * The type of elastic inference accelerator. The possible values are
     * <code>eia1.medium</code>, <code>eia1.large</code>, and
     * <code>eia1.xlarge</code>.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The number of elastic inference accelerators to attach to the instance.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer count;

    /**
     * <p>
     * The type of elastic inference accelerator. The possible values are
     * <code>eia1.medium</code>, <code>eia1.large</code>, and
     * <code>eia1.xlarge</code>.
     * </p>
     *
     * @return <p>
     *         The type of elastic inference accelerator. The possible values
     *         are <code>eia1.medium</code>, <code>eia1.large</code>, and
     *         <code>eia1.xlarge</code>.
     *         </p>
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of elastic inference accelerator. The possible values are
     * <code>eia1.medium</code>, <code>eia1.large</code>, and
     * <code>eia1.xlarge</code>.
     * </p>
     *
     * @param type <p>
     *            The type of elastic inference accelerator. The possible values
     *            are <code>eia1.medium</code>, <code>eia1.large</code>, and
     *            <code>eia1.xlarge</code>.
     *            </p>
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of elastic inference accelerator. The possible values are
     * <code>eia1.medium</code>, <code>eia1.large</code>, and
     * <code>eia1.xlarge</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param type <p>
     *            The type of elastic inference accelerator. The possible values
     *            are <code>eia1.medium</code>, <code>eia1.large</code>, and
     *            <code>eia1.xlarge</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticInferenceAccelerator withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The number of elastic inference accelerators to attach to the instance.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The number of elastic inference accelerators to attach to the
     *         instance.
     *         </p>
     *         <p>
     *         Default: 1
     *         </p>
     */
    public Integer getCount() {
        return count;
    }

    /**
     * <p>
     * The number of elastic inference accelerators to attach to the instance.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param count <p>
     *            The number of elastic inference accelerators to attach to the
     *            instance.
     *            </p>
     *            <p>
     *            Default: 1
     *            </p>
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * <p>
     * The number of elastic inference accelerators to attach to the instance.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param count <p>
     *            The number of elastic inference accelerators to attach to the
     *            instance.
     *            </p>
     *            <p>
     *            Default: 1
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticInferenceAccelerator withCount(Integer count) {
        this.count = count;
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
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getCount() != null)
            sb.append("Count: " + getCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ElasticInferenceAccelerator == false)
            return false;
        ElasticInferenceAccelerator other = (ElasticInferenceAccelerator) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        return true;
    }
}
