/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

public class CreateContactFlowResult implements Serializable {
    /**
     * <p>
     * The identifier of the contact flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     */
    private String contactFlowId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact flow.
     * </p>
     */
    private String contactFlowArn;

    /**
     * <p>
     * The identifier of the contact flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @return <p>
     *         The identifier of the contact flow.
     *         </p>
     */
    public String getContactFlowId() {
        return contactFlowId;
    }

    /**
     * <p>
     * The identifier of the contact flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @param contactFlowId <p>
     *            The identifier of the contact flow.
     *            </p>
     */
    public void setContactFlowId(String contactFlowId) {
        this.contactFlowId = contactFlowId;
    }

    /**
     * <p>
     * The identifier of the contact flow.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @param contactFlowId <p>
     *            The identifier of the contact flow.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateContactFlowResult withContactFlowId(String contactFlowId) {
        this.contactFlowId = contactFlowId;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact flow.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the contact flow.
     *         </p>
     */
    public String getContactFlowArn() {
        return contactFlowArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact flow.
     * </p>
     *
     * @param contactFlowArn <p>
     *            The Amazon Resource Name (ARN) of the contact flow.
     *            </p>
     */
    public void setContactFlowArn(String contactFlowArn) {
        this.contactFlowArn = contactFlowArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact flow.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param contactFlowArn <p>
     *            The Amazon Resource Name (ARN) of the contact flow.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateContactFlowResult withContactFlowArn(String contactFlowArn) {
        this.contactFlowArn = contactFlowArn;
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
        if (getContactFlowId() != null)
            sb.append("ContactFlowId: " + getContactFlowId() + ",");
        if (getContactFlowArn() != null)
            sb.append("ContactFlowArn: " + getContactFlowArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getContactFlowId() == null) ? 0 : getContactFlowId().hashCode());
        hashCode = prime * hashCode
                + ((getContactFlowArn() == null) ? 0 : getContactFlowArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateContactFlowResult == false)
            return false;
        CreateContactFlowResult other = (CreateContactFlowResult) obj;

        if (other.getContactFlowId() == null ^ this.getContactFlowId() == null)
            return false;
        if (other.getContactFlowId() != null
                && other.getContactFlowId().equals(this.getContactFlowId()) == false)
            return false;
        if (other.getContactFlowArn() == null ^ this.getContactFlowArn() == null)
            return false;
        if (other.getContactFlowArn() != null
                && other.getContactFlowArn().equals(this.getContactFlowArn()) == false)
            return false;
        return true;
    }
}
