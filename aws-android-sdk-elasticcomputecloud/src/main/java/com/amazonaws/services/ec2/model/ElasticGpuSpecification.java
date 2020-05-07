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
 * A specification for an Elastic Graphics accelerator.
 * </p>
 */
public class ElasticGpuSpecification implements Serializable {
    /**
     * <p>
     * The type of Elastic Graphics accelerator. For more information about the
     * values to specify for <code>Type</code>, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/elastic-graphics.html#elastic-graphics-basics"
     * >Elastic Graphics Basics</a>, specifically the Elastic Graphics
     * accelerator column, in the <i>Amazon Elastic Compute Cloud User Guide for
     * Windows Instances</i>.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The type of Elastic Graphics accelerator. For more information about the
     * values to specify for <code>Type</code>, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/elastic-graphics.html#elastic-graphics-basics"
     * >Elastic Graphics Basics</a>, specifically the Elastic Graphics
     * accelerator column, in the <i>Amazon Elastic Compute Cloud User Guide for
     * Windows Instances</i>.
     * </p>
     *
     * @return <p>
     *         The type of Elastic Graphics accelerator. For more information
     *         about the values to specify for <code>Type</code>, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/elastic-graphics.html#elastic-graphics-basics"
     *         >Elastic Graphics Basics</a>, specifically the Elastic Graphics
     *         accelerator column, in the <i>Amazon Elastic Compute Cloud User
     *         Guide for Windows Instances</i>.
     *         </p>
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of Elastic Graphics accelerator. For more information about the
     * values to specify for <code>Type</code>, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/elastic-graphics.html#elastic-graphics-basics"
     * >Elastic Graphics Basics</a>, specifically the Elastic Graphics
     * accelerator column, in the <i>Amazon Elastic Compute Cloud User Guide for
     * Windows Instances</i>.
     * </p>
     *
     * @param type <p>
     *            The type of Elastic Graphics accelerator. For more information
     *            about the values to specify for <code>Type</code>, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/elastic-graphics.html#elastic-graphics-basics"
     *            >Elastic Graphics Basics</a>, specifically the Elastic
     *            Graphics accelerator column, in the <i>Amazon Elastic Compute
     *            Cloud User Guide for Windows Instances</i>.
     *            </p>
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of Elastic Graphics accelerator. For more information about the
     * values to specify for <code>Type</code>, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/elastic-graphics.html#elastic-graphics-basics"
     * >Elastic Graphics Basics</a>, specifically the Elastic Graphics
     * accelerator column, in the <i>Amazon Elastic Compute Cloud User Guide for
     * Windows Instances</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param type <p>
     *            The type of Elastic Graphics accelerator. For more information
     *            about the values to specify for <code>Type</code>, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/elastic-graphics.html#elastic-graphics-basics"
     *            >Elastic Graphics Basics</a>, specifically the Elastic
     *            Graphics accelerator column, in the <i>Amazon Elastic Compute
     *            Cloud User Guide for Windows Instances</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticGpuSpecification withType(String type) {
        this.type = type;
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
            sb.append("Type: " + getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ElasticGpuSpecification == false)
            return false;
        ElasticGpuSpecification other = (ElasticGpuSpecification) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }
}
