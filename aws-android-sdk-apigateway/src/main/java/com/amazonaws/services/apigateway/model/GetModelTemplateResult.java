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

package com.amazonaws.services.apigateway.model;

import java.io.Serializable;

/**
 * <p>
 * Represents a mapping template used to transform a payload.
 * </p>
 * <div class="seeAlso"> <a href=
 * "https://docs.aws.amazon.com/apigateway/latest/developerguide/models-mappings.html#models-mappings-mappings"
 * >Mapping Templates</a> </div>
 */
public class GetModelTemplateResult implements Serializable {
    /**
     * <p>
     * The Apache <a
     * href="https://velocity.apache.org/engine/devel/vtl-reference.html"
     * target="_blank">Velocity Template Language (VTL)</a> template content
     * used for the template resource.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The Apache <a
     * href="https://velocity.apache.org/engine/devel/vtl-reference.html"
     * target="_blank">Velocity Template Language (VTL)</a> template content
     * used for the template resource.
     * </p>
     *
     * @return <p>
     *         The Apache <a href=
     *         "https://velocity.apache.org/engine/devel/vtl-reference.html"
     *         target="_blank">Velocity Template Language (VTL)</a> template
     *         content used for the template resource.
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * The Apache <a
     * href="https://velocity.apache.org/engine/devel/vtl-reference.html"
     * target="_blank">Velocity Template Language (VTL)</a> template content
     * used for the template resource.
     * </p>
     *
     * @param value <p>
     *            The Apache <a href=
     *            "https://velocity.apache.org/engine/devel/vtl-reference.html"
     *            target="_blank">Velocity Template Language (VTL)</a> template
     *            content used for the template resource.
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The Apache <a
     * href="https://velocity.apache.org/engine/devel/vtl-reference.html"
     * target="_blank">Velocity Template Language (VTL)</a> template content
     * used for the template resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            The Apache <a href=
     *            "https://velocity.apache.org/engine/devel/vtl-reference.html"
     *            target="_blank">Velocity Template Language (VTL)</a> template
     *            content used for the template resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetModelTemplateResult withValue(String value) {
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
        if (getValue() != null)
            sb.append("value: " + getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetModelTemplateResult == false)
            return false;
        GetModelTemplateResult other = (GetModelTemplateResult) obj;

        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }
}
