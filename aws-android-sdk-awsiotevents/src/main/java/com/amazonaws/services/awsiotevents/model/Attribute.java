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

package com.amazonaws.services.awsiotevents.model;

import java.io.Serializable;

/**
 * <p>
 * The attributes from the JSON payload that are made available by the input.
 * Inputs are derived from messages sent to the AWS IoT Events system using
 * <code>BatchPutMessage</code>. Each such message contains a JSON payload.
 * Those attributes (and their paired values) specified here are available for
 * use in the <code>condition</code> expressions used by detectors.
 * </p>
 */
public class Attribute implements Serializable {
    /**
     * <p>
     * An expression that specifies an attribute-value pair in a JSON structure.
     * Use this to specify an attribute from the JSON payload that is made
     * available by the input. Inputs are derived from messages sent to AWS IoT
     * Events (<code>BatchPutMessage</code>). Each such message contains a JSON
     * payload. The attribute (and its paired value) specified here are
     * available for use in the <code>condition</code> expressions used by
     * detectors.
     * </p>
     * <p>
     * Syntax: <code>&lt;field-name&gt;.&lt;field-name&gt;...</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^((`[\w\- ]+`)|([\w\-]+))(\.((`[\w- ]+`)|([\w\-]+)))*$
     * <br/>
     */
    private String jsonPath;

    /**
     * <p>
     * An expression that specifies an attribute-value pair in a JSON structure.
     * Use this to specify an attribute from the JSON payload that is made
     * available by the input. Inputs are derived from messages sent to AWS IoT
     * Events (<code>BatchPutMessage</code>). Each such message contains a JSON
     * payload. The attribute (and its paired value) specified here are
     * available for use in the <code>condition</code> expressions used by
     * detectors.
     * </p>
     * <p>
     * Syntax: <code>&lt;field-name&gt;.&lt;field-name&gt;...</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^((`[\w\- ]+`)|([\w\-]+))(\.((`[\w- ]+`)|([\w\-]+)))*$
     * <br/>
     *
     * @return <p>
     *         An expression that specifies an attribute-value pair in a JSON
     *         structure. Use this to specify an attribute from the JSON payload
     *         that is made available by the input. Inputs are derived from
     *         messages sent to AWS IoT Events (<code>BatchPutMessage</code>).
     *         Each such message contains a JSON payload. The attribute (and its
     *         paired value) specified here are available for use in the
     *         <code>condition</code> expressions used by detectors.
     *         </p>
     *         <p>
     *         Syntax: <code>&lt;field-name&gt;.&lt;field-name&gt;...</code>
     *         </p>
     */
    public String getJsonPath() {
        return jsonPath;
    }

    /**
     * <p>
     * An expression that specifies an attribute-value pair in a JSON structure.
     * Use this to specify an attribute from the JSON payload that is made
     * available by the input. Inputs are derived from messages sent to AWS IoT
     * Events (<code>BatchPutMessage</code>). Each such message contains a JSON
     * payload. The attribute (and its paired value) specified here are
     * available for use in the <code>condition</code> expressions used by
     * detectors.
     * </p>
     * <p>
     * Syntax: <code>&lt;field-name&gt;.&lt;field-name&gt;...</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^((`[\w\- ]+`)|([\w\-]+))(\.((`[\w- ]+`)|([\w\-]+)))*$
     * <br/>
     *
     * @param jsonPath <p>
     *            An expression that specifies an attribute-value pair in a JSON
     *            structure. Use this to specify an attribute from the JSON
     *            payload that is made available by the input. Inputs are
     *            derived from messages sent to AWS IoT Events (
     *            <code>BatchPutMessage</code>). Each such message contains a
     *            JSON payload. The attribute (and its paired value) specified
     *            here are available for use in the <code>condition</code>
     *            expressions used by detectors.
     *            </p>
     *            <p>
     *            Syntax: <code>&lt;field-name&gt;.&lt;field-name&gt;...</code>
     *            </p>
     */
    public void setJsonPath(String jsonPath) {
        this.jsonPath = jsonPath;
    }

    /**
     * <p>
     * An expression that specifies an attribute-value pair in a JSON structure.
     * Use this to specify an attribute from the JSON payload that is made
     * available by the input. Inputs are derived from messages sent to AWS IoT
     * Events (<code>BatchPutMessage</code>). Each such message contains a JSON
     * payload. The attribute (and its paired value) specified here are
     * available for use in the <code>condition</code> expressions used by
     * detectors.
     * </p>
     * <p>
     * Syntax: <code>&lt;field-name&gt;.&lt;field-name&gt;...</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>^((`[\w\- ]+`)|([\w\-]+))(\.((`[\w- ]+`)|([\w\-]+)))*$
     * <br/>
     *
     * @param jsonPath <p>
     *            An expression that specifies an attribute-value pair in a JSON
     *            structure. Use this to specify an attribute from the JSON
     *            payload that is made available by the input. Inputs are
     *            derived from messages sent to AWS IoT Events (
     *            <code>BatchPutMessage</code>). Each such message contains a
     *            JSON payload. The attribute (and its paired value) specified
     *            here are available for use in the <code>condition</code>
     *            expressions used by detectors.
     *            </p>
     *            <p>
     *            Syntax: <code>&lt;field-name&gt;.&lt;field-name&gt;...</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Attribute withJsonPath(String jsonPath) {
        this.jsonPath = jsonPath;
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
        if (getJsonPath() != null)
            sb.append("jsonPath: " + getJsonPath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJsonPath() == null) ? 0 : getJsonPath().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Attribute == false)
            return false;
        Attribute other = (Attribute) obj;

        if (other.getJsonPath() == null ^ this.getJsonPath() == null)
            return false;
        if (other.getJsonPath() != null && other.getJsonPath().equals(this.getJsonPath()) == false)
            return false;
        return true;
    }
}
