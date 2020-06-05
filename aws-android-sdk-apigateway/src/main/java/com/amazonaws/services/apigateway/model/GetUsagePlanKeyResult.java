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
 * Represents a usage plan key to identify a plan customer.
 * </p>
 * <div class="remarks">
 * <p>
 * To associate an API stage with a selected API key in a usage plan, you must
 * create a UsagePlanKey resource to represent the selected <a>ApiKey</a>.
 * </p>
 * </div>" <div class="seeAlso"> <a href="https://docs.aws.amazon.com/apigateway
 * /latest/developerguide/api-gateway-api-usage-plans.html">Create and Use Usage
 * Plans</a> </div>
 */
public class GetUsagePlanKeyResult implements Serializable {
    /**
     * <p>
     * The Id of a usage plan key.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The type of a usage plan key. Currently, the valid key type is
     * <code>API_KEY</code>.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The value of a usage plan key.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The name of a usage plan key.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The Id of a usage plan key.
     * </p>
     *
     * @return <p>
     *         The Id of a usage plan key.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The Id of a usage plan key.
     * </p>
     *
     * @param id <p>
     *            The Id of a usage plan key.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The Id of a usage plan key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The Id of a usage plan key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetUsagePlanKeyResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The type of a usage plan key. Currently, the valid key type is
     * <code>API_KEY</code>.
     * </p>
     *
     * @return <p>
     *         The type of a usage plan key. Currently, the valid key type is
     *         <code>API_KEY</code>.
     *         </p>
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of a usage plan key. Currently, the valid key type is
     * <code>API_KEY</code>.
     * </p>
     *
     * @param type <p>
     *            The type of a usage plan key. Currently, the valid key type is
     *            <code>API_KEY</code>.
     *            </p>
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of a usage plan key. Currently, the valid key type is
     * <code>API_KEY</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param type <p>
     *            The type of a usage plan key. Currently, the valid key type is
     *            <code>API_KEY</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetUsagePlanKeyResult withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The value of a usage plan key.
     * </p>
     *
     * @return <p>
     *         The value of a usage plan key.
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * The value of a usage plan key.
     * </p>
     *
     * @param value <p>
     *            The value of a usage plan key.
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of a usage plan key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            The value of a usage plan key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetUsagePlanKeyResult withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * <p>
     * The name of a usage plan key.
     * </p>
     *
     * @return <p>
     *         The name of a usage plan key.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of a usage plan key.
     * </p>
     *
     * @param name <p>
     *            The name of a usage plan key.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of a usage plan key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of a usage plan key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetUsagePlanKeyResult withName(String name) {
        this.name = name;
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
        if (getId() != null)
            sb.append("id: " + getId() + ",");
        if (getType() != null)
            sb.append("type: " + getType() + ",");
        if (getValue() != null)
            sb.append("value: " + getValue() + ",");
        if (getName() != null)
            sb.append("name: " + getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetUsagePlanKeyResult == false)
            return false;
        GetUsagePlanKeyResult other = (GetUsagePlanKeyResult) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }
}
