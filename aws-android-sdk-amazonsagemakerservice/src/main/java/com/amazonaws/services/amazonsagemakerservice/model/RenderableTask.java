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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

/**
 * <p>
 * Contains input values for a task.
 * </p>
 */
public class RenderableTask implements Serializable {
    /**
     * <p>
     * A JSON object that contains values for the variables defined in the
     * template. It is made available to the template under the substitution
     * variable <code>task.input</code>. For example, if you define a variable
     * <code>task.input.text</code> in your template, you can supply the
     * variable in the JSON object as <code>"text": "sample text"</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 128000<br/>
     * <b>Pattern: </b>[\S\s]+<br/>
     */
    private String input;

    /**
     * <p>
     * A JSON object that contains values for the variables defined in the
     * template. It is made available to the template under the substitution
     * variable <code>task.input</code>. For example, if you define a variable
     * <code>task.input.text</code> in your template, you can supply the
     * variable in the JSON object as <code>"text": "sample text"</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 128000<br/>
     * <b>Pattern: </b>[\S\s]+<br/>
     *
     * @return <p>
     *         A JSON object that contains values for the variables defined in
     *         the template. It is made available to the template under the
     *         substitution variable <code>task.input</code>. For example, if
     *         you define a variable <code>task.input.text</code> in your
     *         template, you can supply the variable in the JSON object as
     *         <code>"text": "sample text"</code>.
     *         </p>
     */
    public String getInput() {
        return input;
    }

    /**
     * <p>
     * A JSON object that contains values for the variables defined in the
     * template. It is made available to the template under the substitution
     * variable <code>task.input</code>. For example, if you define a variable
     * <code>task.input.text</code> in your template, you can supply the
     * variable in the JSON object as <code>"text": "sample text"</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 128000<br/>
     * <b>Pattern: </b>[\S\s]+<br/>
     *
     * @param input <p>
     *            A JSON object that contains values for the variables defined
     *            in the template. It is made available to the template under
     *            the substitution variable <code>task.input</code>. For
     *            example, if you define a variable <code>task.input.text</code>
     *            in your template, you can supply the variable in the JSON
     *            object as <code>"text": "sample text"</code>.
     *            </p>
     */
    public void setInput(String input) {
        this.input = input;
    }

    /**
     * <p>
     * A JSON object that contains values for the variables defined in the
     * template. It is made available to the template under the substitution
     * variable <code>task.input</code>. For example, if you define a variable
     * <code>task.input.text</code> in your template, you can supply the
     * variable in the JSON object as <code>"text": "sample text"</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 128000<br/>
     * <b>Pattern: </b>[\S\s]+<br/>
     *
     * @param input <p>
     *            A JSON object that contains values for the variables defined
     *            in the template. It is made available to the template under
     *            the substitution variable <code>task.input</code>. For
     *            example, if you define a variable <code>task.input.text</code>
     *            in your template, you can supply the variable in the JSON
     *            object as <code>"text": "sample text"</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RenderableTask withInput(String input) {
        this.input = input;
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
        if (getInput() != null)
            sb.append("Input: " + getInput());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInput() == null) ? 0 : getInput().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RenderableTask == false)
            return false;
        RenderableTask other = (RenderableTask) obj;

        if (other.getInput() == null ^ this.getInput() == null)
            return false;
        if (other.getInput() != null && other.getInput().equals(this.getInput()) == false)
            return false;
        return true;
    }
}
