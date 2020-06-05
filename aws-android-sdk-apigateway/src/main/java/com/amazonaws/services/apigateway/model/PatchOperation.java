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
 * A single patch operation to apply to the specified resource. Please refer to
 * http://tools.ietf.org/html/rfc6902#section-4 for an explanation of how each
 * operation is used.
 */
public class PatchOperation implements Serializable {
    /**
     * <p>
     * An update operation to be performed with this PATCH request. The valid
     * value can be <code>add</code>, <code>remove</code>, <code>replace</code>
     * or <code>copy</code>. Not all valid operations are supported for a given
     * resource. Support of the operations depends on specific operational
     * contexts. Attempts to apply an unsupported operation on a resource will
     * return an error message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>add, remove, replace, move, copy, test
     */
    private String op;

    /**
     * <p>
     * The <code>op</code> operation's target, as identified by a <a
     * href="https://tools.ietf.org/html/draft-ietf-appsawg-json-pointer-08"
     * >JSON Pointer</a> value that references a location within the targeted
     * resource. For example, if the target resource has an updateable property
     * of <code>{"name":"value"}</code>, the path for this property is
     * <code>/name</code>. If the <code>name</code> property value is a JSON
     * object (e.g., <code>{"name": {"child/name": "child-value"}}</code>), the
     * path for the <code>child/name</code> property will be
     * <code>/name/child~1name</code>. Any slash ("/") character appearing in
     * path names must be escaped with "~1", as shown in the example above. Each
     * <code>op</code> operation can have only one <code>path</code> associated
     * with it.
     * </p>
     */
    private String path;

    /**
     * <p>
     * The new target value of the update operation. It is applicable for the
     * <code>add</code> or <code>replace</code> operation. When using AWS CLI to
     * update a property of a JSON value, enclose the JSON object with a pair of
     * single quotes in a Linux shell, e.g., '{"a": ...}'. In a Windows shell,
     * see <a href=
     * "https://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#cli-using-param-json"
     * >Using JSON for Parameters</a>.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The <code>copy</code> update operation's source as identified by a
     * <code>JSON-Pointer</code> value referencing the location within the
     * targeted resource to copy the value from. For example, to promote a
     * canary deployment, you copy the canary deployment ID to the affiliated
     * deployment ID by calling a PATCH request on a <a>Stage</a> resource with
     * <code>"op":"copy"</code>,
     * <code>"from":"/canarySettings/deploymentId"</code> and
     * <code>"path":"/deploymentId"</code>.
     * </p>
     */
    private String from;

    /**
     * <p>
     * An update operation to be performed with this PATCH request. The valid
     * value can be <code>add</code>, <code>remove</code>, <code>replace</code>
     * or <code>copy</code>. Not all valid operations are supported for a given
     * resource. Support of the operations depends on specific operational
     * contexts. Attempts to apply an unsupported operation on a resource will
     * return an error message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>add, remove, replace, move, copy, test
     *
     * @return <p>
     *         An update operation to be performed with this PATCH request. The
     *         valid value can be <code>add</code>, <code>remove</code>,
     *         <code>replace</code> or <code>copy</code>. Not all valid
     *         operations are supported for a given resource. Support of the
     *         operations depends on specific operational contexts. Attempts to
     *         apply an unsupported operation on a resource will return an error
     *         message.
     *         </p>
     * @see Op
     */
    public String getOp() {
        return op;
    }

    /**
     * <p>
     * An update operation to be performed with this PATCH request. The valid
     * value can be <code>add</code>, <code>remove</code>, <code>replace</code>
     * or <code>copy</code>. Not all valid operations are supported for a given
     * resource. Support of the operations depends on specific operational
     * contexts. Attempts to apply an unsupported operation on a resource will
     * return an error message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>add, remove, replace, move, copy, test
     *
     * @param op <p>
     *            An update operation to be performed with this PATCH request.
     *            The valid value can be <code>add</code>, <code>remove</code>,
     *            <code>replace</code> or <code>copy</code>. Not all valid
     *            operations are supported for a given resource. Support of the
     *            operations depends on specific operational contexts. Attempts
     *            to apply an unsupported operation on a resource will return an
     *            error message.
     *            </p>
     * @see Op
     */
    public void setOp(String op) {
        this.op = op;
    }

    /**
     * <p>
     * An update operation to be performed with this PATCH request. The valid
     * value can be <code>add</code>, <code>remove</code>, <code>replace</code>
     * or <code>copy</code>. Not all valid operations are supported for a given
     * resource. Support of the operations depends on specific operational
     * contexts. Attempts to apply an unsupported operation on a resource will
     * return an error message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>add, remove, replace, move, copy, test
     *
     * @param op <p>
     *            An update operation to be performed with this PATCH request.
     *            The valid value can be <code>add</code>, <code>remove</code>,
     *            <code>replace</code> or <code>copy</code>. Not all valid
     *            operations are supported for a given resource. Support of the
     *            operations depends on specific operational contexts. Attempts
     *            to apply an unsupported operation on a resource will return an
     *            error message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Op
     */
    public PatchOperation withOp(String op) {
        this.op = op;
        return this;
    }

    /**
     * <p>
     * An update operation to be performed with this PATCH request. The valid
     * value can be <code>add</code>, <code>remove</code>, <code>replace</code>
     * or <code>copy</code>. Not all valid operations are supported for a given
     * resource. Support of the operations depends on specific operational
     * contexts. Attempts to apply an unsupported operation on a resource will
     * return an error message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>add, remove, replace, move, copy, test
     *
     * @param op <p>
     *            An update operation to be performed with this PATCH request.
     *            The valid value can be <code>add</code>, <code>remove</code>,
     *            <code>replace</code> or <code>copy</code>. Not all valid
     *            operations are supported for a given resource. Support of the
     *            operations depends on specific operational contexts. Attempts
     *            to apply an unsupported operation on a resource will return an
     *            error message.
     *            </p>
     * @see Op
     */
    public void setOp(Op op) {
        this.op = op.toString();
    }

    /**
     * <p>
     * An update operation to be performed with this PATCH request. The valid
     * value can be <code>add</code>, <code>remove</code>, <code>replace</code>
     * or <code>copy</code>. Not all valid operations are supported for a given
     * resource. Support of the operations depends on specific operational
     * contexts. Attempts to apply an unsupported operation on a resource will
     * return an error message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>add, remove, replace, move, copy, test
     *
     * @param op <p>
     *            An update operation to be performed with this PATCH request.
     *            The valid value can be <code>add</code>, <code>remove</code>,
     *            <code>replace</code> or <code>copy</code>. Not all valid
     *            operations are supported for a given resource. Support of the
     *            operations depends on specific operational contexts. Attempts
     *            to apply an unsupported operation on a resource will return an
     *            error message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Op
     */
    public PatchOperation withOp(Op op) {
        this.op = op.toString();
        return this;
    }

    /**
     * <p>
     * The <code>op</code> operation's target, as identified by a <a
     * href="https://tools.ietf.org/html/draft-ietf-appsawg-json-pointer-08"
     * >JSON Pointer</a> value that references a location within the targeted
     * resource. For example, if the target resource has an updateable property
     * of <code>{"name":"value"}</code>, the path for this property is
     * <code>/name</code>. If the <code>name</code> property value is a JSON
     * object (e.g., <code>{"name": {"child/name": "child-value"}}</code>), the
     * path for the <code>child/name</code> property will be
     * <code>/name/child~1name</code>. Any slash ("/") character appearing in
     * path names must be escaped with "~1", as shown in the example above. Each
     * <code>op</code> operation can have only one <code>path</code> associated
     * with it.
     * </p>
     *
     * @return <p>
     *         The <code>op</code> operation's target, as identified by a <a
     *         href=
     *         "https://tools.ietf.org/html/draft-ietf-appsawg-json-pointer-08"
     *         >JSON Pointer</a> value that references a location within the
     *         targeted resource. For example, if the target resource has an
     *         updateable property of <code>{"name":"value"}</code>, the path
     *         for this property is <code>/name</code>. If the <code>name</code>
     *         property value is a JSON object (e.g.,
     *         <code>{"name": {"child/name": "child-value"}}</code>), the path
     *         for the <code>child/name</code> property will be
     *         <code>/name/child~1name</code>. Any slash ("/") character
     *         appearing in path names must be escaped with "~1", as shown in
     *         the example above. Each <code>op</code> operation can have only
     *         one <code>path</code> associated with it.
     *         </p>
     */
    public String getPath() {
        return path;
    }

    /**
     * <p>
     * The <code>op</code> operation's target, as identified by a <a
     * href="https://tools.ietf.org/html/draft-ietf-appsawg-json-pointer-08"
     * >JSON Pointer</a> value that references a location within the targeted
     * resource. For example, if the target resource has an updateable property
     * of <code>{"name":"value"}</code>, the path for this property is
     * <code>/name</code>. If the <code>name</code> property value is a JSON
     * object (e.g., <code>{"name": {"child/name": "child-value"}}</code>), the
     * path for the <code>child/name</code> property will be
     * <code>/name/child~1name</code>. Any slash ("/") character appearing in
     * path names must be escaped with "~1", as shown in the example above. Each
     * <code>op</code> operation can have only one <code>path</code> associated
     * with it.
     * </p>
     *
     * @param path <p>
     *            The <code>op</code> operation's target, as identified by a <a
     *            href=
     *            "https://tools.ietf.org/html/draft-ietf-appsawg-json-pointer-08"
     *            >JSON Pointer</a> value that references a location within the
     *            targeted resource. For example, if the target resource has an
     *            updateable property of <code>{"name":"value"}</code>, the path
     *            for this property is <code>/name</code>. If the
     *            <code>name</code> property value is a JSON object (e.g.,
     *            <code>{"name": {"child/name": "child-value"}}</code>), the
     *            path for the <code>child/name</code> property will be
     *            <code>/name/child~1name</code>. Any slash ("/") character
     *            appearing in path names must be escaped with "~1", as shown in
     *            the example above. Each <code>op</code> operation can have
     *            only one <code>path</code> associated with it.
     *            </p>
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The <code>op</code> operation's target, as identified by a <a
     * href="https://tools.ietf.org/html/draft-ietf-appsawg-json-pointer-08"
     * >JSON Pointer</a> value that references a location within the targeted
     * resource. For example, if the target resource has an updateable property
     * of <code>{"name":"value"}</code>, the path for this property is
     * <code>/name</code>. If the <code>name</code> property value is a JSON
     * object (e.g., <code>{"name": {"child/name": "child-value"}}</code>), the
     * path for the <code>child/name</code> property will be
     * <code>/name/child~1name</code>. Any slash ("/") character appearing in
     * path names must be escaped with "~1", as shown in the example above. Each
     * <code>op</code> operation can have only one <code>path</code> associated
     * with it.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param path <p>
     *            The <code>op</code> operation's target, as identified by a <a
     *            href=
     *            "https://tools.ietf.org/html/draft-ietf-appsawg-json-pointer-08"
     *            >JSON Pointer</a> value that references a location within the
     *            targeted resource. For example, if the target resource has an
     *            updateable property of <code>{"name":"value"}</code>, the path
     *            for this property is <code>/name</code>. If the
     *            <code>name</code> property value is a JSON object (e.g.,
     *            <code>{"name": {"child/name": "child-value"}}</code>), the
     *            path for the <code>child/name</code> property will be
     *            <code>/name/child~1name</code>. Any slash ("/") character
     *            appearing in path names must be escaped with "~1", as shown in
     *            the example above. Each <code>op</code> operation can have
     *            only one <code>path</code> associated with it.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PatchOperation withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * <p>
     * The new target value of the update operation. It is applicable for the
     * <code>add</code> or <code>replace</code> operation. When using AWS CLI to
     * update a property of a JSON value, enclose the JSON object with a pair of
     * single quotes in a Linux shell, e.g., '{"a": ...}'. In a Windows shell,
     * see <a href=
     * "https://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#cli-using-param-json"
     * >Using JSON for Parameters</a>.
     * </p>
     *
     * @return <p>
     *         The new target value of the update operation. It is applicable
     *         for the <code>add</code> or <code>replace</code> operation. When
     *         using AWS CLI to update a property of a JSON value, enclose the
     *         JSON object with a pair of single quotes in a Linux shell, e.g.,
     *         '{"a": ...}'. In a Windows shell, see <a href=
     *         "https://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#cli-using-param-json"
     *         >Using JSON for Parameters</a>.
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * The new target value of the update operation. It is applicable for the
     * <code>add</code> or <code>replace</code> operation. When using AWS CLI to
     * update a property of a JSON value, enclose the JSON object with a pair of
     * single quotes in a Linux shell, e.g., '{"a": ...}'. In a Windows shell,
     * see <a href=
     * "https://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#cli-using-param-json"
     * >Using JSON for Parameters</a>.
     * </p>
     *
     * @param value <p>
     *            The new target value of the update operation. It is applicable
     *            for the <code>add</code> or <code>replace</code> operation.
     *            When using AWS CLI to update a property of a JSON value,
     *            enclose the JSON object with a pair of single quotes in a
     *            Linux shell, e.g., '{"a": ...}'. In a Windows shell, see <a
     *            href=
     *            "https://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#cli-using-param-json"
     *            >Using JSON for Parameters</a>.
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The new target value of the update operation. It is applicable for the
     * <code>add</code> or <code>replace</code> operation. When using AWS CLI to
     * update a property of a JSON value, enclose the JSON object with a pair of
     * single quotes in a Linux shell, e.g., '{"a": ...}'. In a Windows shell,
     * see <a href=
     * "https://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#cli-using-param-json"
     * >Using JSON for Parameters</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            The new target value of the update operation. It is applicable
     *            for the <code>add</code> or <code>replace</code> operation.
     *            When using AWS CLI to update a property of a JSON value,
     *            enclose the JSON object with a pair of single quotes in a
     *            Linux shell, e.g., '{"a": ...}'. In a Windows shell, see <a
     *            href=
     *            "https://docs.aws.amazon.com/cli/latest/userguide/cli-using-param.html#cli-using-param-json"
     *            >Using JSON for Parameters</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PatchOperation withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * <p>
     * The <code>copy</code> update operation's source as identified by a
     * <code>JSON-Pointer</code> value referencing the location within the
     * targeted resource to copy the value from. For example, to promote a
     * canary deployment, you copy the canary deployment ID to the affiliated
     * deployment ID by calling a PATCH request on a <a>Stage</a> resource with
     * <code>"op":"copy"</code>,
     * <code>"from":"/canarySettings/deploymentId"</code> and
     * <code>"path":"/deploymentId"</code>.
     * </p>
     *
     * @return <p>
     *         The <code>copy</code> update operation's source as identified by
     *         a <code>JSON-Pointer</code> value referencing the location within
     *         the targeted resource to copy the value from. For example, to
     *         promote a canary deployment, you copy the canary deployment ID to
     *         the affiliated deployment ID by calling a PATCH request on a
     *         <a>Stage</a> resource with <code>"op":"copy"</code>,
     *         <code>"from":"/canarySettings/deploymentId"</code> and
     *         <code>"path":"/deploymentId"</code>.
     *         </p>
     */
    public String getFrom() {
        return from;
    }

    /**
     * <p>
     * The <code>copy</code> update operation's source as identified by a
     * <code>JSON-Pointer</code> value referencing the location within the
     * targeted resource to copy the value from. For example, to promote a
     * canary deployment, you copy the canary deployment ID to the affiliated
     * deployment ID by calling a PATCH request on a <a>Stage</a> resource with
     * <code>"op":"copy"</code>,
     * <code>"from":"/canarySettings/deploymentId"</code> and
     * <code>"path":"/deploymentId"</code>.
     * </p>
     *
     * @param from <p>
     *            The <code>copy</code> update operation's source as identified
     *            by a <code>JSON-Pointer</code> value referencing the location
     *            within the targeted resource to copy the value from. For
     *            example, to promote a canary deployment, you copy the canary
     *            deployment ID to the affiliated deployment ID by calling a
     *            PATCH request on a <a>Stage</a> resource with
     *            <code>"op":"copy"</code>,
     *            <code>"from":"/canarySettings/deploymentId"</code> and
     *            <code>"path":"/deploymentId"</code>.
     *            </p>
     */
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * <p>
     * The <code>copy</code> update operation's source as identified by a
     * <code>JSON-Pointer</code> value referencing the location within the
     * targeted resource to copy the value from. For example, to promote a
     * canary deployment, you copy the canary deployment ID to the affiliated
     * deployment ID by calling a PATCH request on a <a>Stage</a> resource with
     * <code>"op":"copy"</code>,
     * <code>"from":"/canarySettings/deploymentId"</code> and
     * <code>"path":"/deploymentId"</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param from <p>
     *            The <code>copy</code> update operation's source as identified
     *            by a <code>JSON-Pointer</code> value referencing the location
     *            within the targeted resource to copy the value from. For
     *            example, to promote a canary deployment, you copy the canary
     *            deployment ID to the affiliated deployment ID by calling a
     *            PATCH request on a <a>Stage</a> resource with
     *            <code>"op":"copy"</code>,
     *            <code>"from":"/canarySettings/deploymentId"</code> and
     *            <code>"path":"/deploymentId"</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PatchOperation withFrom(String from) {
        this.from = from;
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
        if (getOp() != null)
            sb.append("op: " + getOp() + ",");
        if (getPath() != null)
            sb.append("path: " + getPath() + ",");
        if (getValue() != null)
            sb.append("value: " + getValue() + ",");
        if (getFrom() != null)
            sb.append("from: " + getFrom());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOp() == null) ? 0 : getOp().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getFrom() == null) ? 0 : getFrom().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PatchOperation == false)
            return false;
        PatchOperation other = (PatchOperation) obj;

        if (other.getOp() == null ^ this.getOp() == null)
            return false;
        if (other.getOp() != null && other.getOp().equals(this.getOp()) == false)
            return false;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getFrom() == null ^ this.getFrom() == null)
            return false;
        if (other.getFrom() != null && other.getFrom().equals(this.getFrom()) == false)
            return false;
        return true;
    }
}
