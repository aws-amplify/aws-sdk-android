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
 * Information needed to configure the payload.
 * </p>
 * <p>
 * By default, AWS IoT Events generates a standard payload in JSON for any
 * action. This action payload contains all attribute-value pairs that have the
 * information about the detector model instance and the event triggered the
 * action. To configure the action payload, you can use
 * <code>contentExpression</code>.
 * </p>
 */
public class Payload implements Serializable {
    /**
     * <p>
     * The content of the payload. You can use a string expression that includes
     * quoted strings (<code>'&lt;string&gt;'</code>), variables (
     * <code>$variable.&lt;variable-name&gt;</code>), input values (
     * <code>$input.&lt;input-name&gt;.&lt;path-to-datum&gt;</code>), string
     * concatenations, and quoted strings that contain <code>${}</code> as the
     * content. The recommended maximum size of a content expression is 1 KB.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String contentExpression;

    /**
     * <p>
     * The value of the payload type can be either <code>STRING</code> or
     * <code>JSON</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STRING, JSON
     */
    private String type;

    /**
     * <p>
     * The content of the payload. You can use a string expression that includes
     * quoted strings (<code>'&lt;string&gt;'</code>), variables (
     * <code>$variable.&lt;variable-name&gt;</code>), input values (
     * <code>$input.&lt;input-name&gt;.&lt;path-to-datum&gt;</code>), string
     * concatenations, and quoted strings that contain <code>${}</code> as the
     * content. The recommended maximum size of a content expression is 1 KB.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The content of the payload. You can use a string expression that
     *         includes quoted strings (<code>'&lt;string&gt;'</code>),
     *         variables (<code>$variable.&lt;variable-name&gt;</code>), input
     *         values (
     *         <code>$input.&lt;input-name&gt;.&lt;path-to-datum&gt;</code>),
     *         string concatenations, and quoted strings that contain
     *         <code>${}</code> as the content. The recommended maximum size of
     *         a content expression is 1 KB.
     *         </p>
     */
    public String getContentExpression() {
        return contentExpression;
    }

    /**
     * <p>
     * The content of the payload. You can use a string expression that includes
     * quoted strings (<code>'&lt;string&gt;'</code>), variables (
     * <code>$variable.&lt;variable-name&gt;</code>), input values (
     * <code>$input.&lt;input-name&gt;.&lt;path-to-datum&gt;</code>), string
     * concatenations, and quoted strings that contain <code>${}</code> as the
     * content. The recommended maximum size of a content expression is 1 KB.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param contentExpression <p>
     *            The content of the payload. You can use a string expression
     *            that includes quoted strings (<code>'&lt;string&gt;'</code>),
     *            variables (<code>$variable.&lt;variable-name&gt;</code>),
     *            input values (
     *            <code>$input.&lt;input-name&gt;.&lt;path-to-datum&gt;</code>),
     *            string concatenations, and quoted strings that contain
     *            <code>${}</code> as the content. The recommended maximum size
     *            of a content expression is 1 KB.
     *            </p>
     */
    public void setContentExpression(String contentExpression) {
        this.contentExpression = contentExpression;
    }

    /**
     * <p>
     * The content of the payload. You can use a string expression that includes
     * quoted strings (<code>'&lt;string&gt;'</code>), variables (
     * <code>$variable.&lt;variable-name&gt;</code>), input values (
     * <code>$input.&lt;input-name&gt;.&lt;path-to-datum&gt;</code>), string
     * concatenations, and quoted strings that contain <code>${}</code> as the
     * content. The recommended maximum size of a content expression is 1 KB.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param contentExpression <p>
     *            The content of the payload. You can use a string expression
     *            that includes quoted strings (<code>'&lt;string&gt;'</code>),
     *            variables (<code>$variable.&lt;variable-name&gt;</code>),
     *            input values (
     *            <code>$input.&lt;input-name&gt;.&lt;path-to-datum&gt;</code>),
     *            string concatenations, and quoted strings that contain
     *            <code>${}</code> as the content. The recommended maximum size
     *            of a content expression is 1 KB.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Payload withContentExpression(String contentExpression) {
        this.contentExpression = contentExpression;
        return this;
    }

    /**
     * <p>
     * The value of the payload type can be either <code>STRING</code> or
     * <code>JSON</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STRING, JSON
     *
     * @return <p>
     *         The value of the payload type can be either <code>STRING</code>
     *         or <code>JSON</code>.
     *         </p>
     * @see PayloadType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The value of the payload type can be either <code>STRING</code> or
     * <code>JSON</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STRING, JSON
     *
     * @param type <p>
     *            The value of the payload type can be either
     *            <code>STRING</code> or <code>JSON</code>.
     *            </p>
     * @see PayloadType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The value of the payload type can be either <code>STRING</code> or
     * <code>JSON</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STRING, JSON
     *
     * @param type <p>
     *            The value of the payload type can be either
     *            <code>STRING</code> or <code>JSON</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PayloadType
     */
    public Payload withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The value of the payload type can be either <code>STRING</code> or
     * <code>JSON</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STRING, JSON
     *
     * @param type <p>
     *            The value of the payload type can be either
     *            <code>STRING</code> or <code>JSON</code>.
     *            </p>
     * @see PayloadType
     */
    public void setType(PayloadType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The value of the payload type can be either <code>STRING</code> or
     * <code>JSON</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STRING, JSON
     *
     * @param type <p>
     *            The value of the payload type can be either
     *            <code>STRING</code> or <code>JSON</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PayloadType
     */
    public Payload withType(PayloadType type) {
        this.type = type.toString();
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
        if (getContentExpression() != null)
            sb.append("contentExpression: " + getContentExpression() + ",");
        if (getType() != null)
            sb.append("type: " + getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getContentExpression() == null) ? 0 : getContentExpression().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Payload == false)
            return false;
        Payload other = (Payload) obj;

        if (other.getContentExpression() == null ^ this.getContentExpression() == null)
            return false;
        if (other.getContentExpression() != null
                && other.getContentExpression().equals(this.getContentExpression()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }
}
