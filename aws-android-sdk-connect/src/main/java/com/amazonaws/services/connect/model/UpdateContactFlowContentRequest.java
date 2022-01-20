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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates the specified contact flow.
 * </p>
 * <p>
 * You can also create and update contact flows using the <a href=
 * "https://docs.aws.amazon.com/connect/latest/adminguide/flow-language.html"
 * >Amazon Connect Flow language</a>.
 * </p>
 */
public class UpdateContactFlowContentRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The identifier of the Amazon Connect instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String instanceId;

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
     * The JSON string that represents contact flow’s content. For an example,
     * see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/flow-language-example.html"
     * >Example contact flow in Amazon Connect Flow language</a> in the
     * <i>Amazon Connect Administrator Guide</i>.
     * </p>
     */
    private String content;

    /**
     * <p>
     * The identifier of the Amazon Connect instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The identifier of the Amazon Connect instance.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateContactFlowContentRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

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
    public UpdateContactFlowContentRequest withContactFlowId(String contactFlowId) {
        this.contactFlowId = contactFlowId;
        return this;
    }

    /**
     * <p>
     * The JSON string that represents contact flow’s content. For an example,
     * see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/flow-language-example.html"
     * >Example contact flow in Amazon Connect Flow language</a> in the
     * <i>Amazon Connect Administrator Guide</i>.
     * </p>
     *
     * @return <p>
     *         The JSON string that represents contact flow’s content. For an
     *         example, see <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/flow-language-example.html"
     *         >Example contact flow in Amazon Connect Flow language</a> in the
     *         <i>Amazon Connect Administrator Guide</i>.
     *         </p>
     */
    public String getContent() {
        return content;
    }

    /**
     * <p>
     * The JSON string that represents contact flow’s content. For an example,
     * see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/flow-language-example.html"
     * >Example contact flow in Amazon Connect Flow language</a> in the
     * <i>Amazon Connect Administrator Guide</i>.
     * </p>
     *
     * @param content <p>
     *            The JSON string that represents contact flow’s content. For an
     *            example, see <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/flow-language-example.html"
     *            >Example contact flow in Amazon Connect Flow language</a> in
     *            the <i>Amazon Connect Administrator Guide</i>.
     *            </p>
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * The JSON string that represents contact flow’s content. For an example,
     * see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/flow-language-example.html"
     * >Example contact flow in Amazon Connect Flow language</a> in the
     * <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param content <p>
     *            The JSON string that represents contact flow’s content. For an
     *            example, see <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/flow-language-example.html"
     *            >Example contact flow in Amazon Connect Flow language</a> in
     *            the <i>Amazon Connect Administrator Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateContactFlowContentRequest withContent(String content) {
        this.content = content;
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
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getContactFlowId() != null)
            sb.append("ContactFlowId: " + getContactFlowId() + ",");
        if (getContent() != null)
            sb.append("Content: " + getContent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode
                + ((getContactFlowId() == null) ? 0 : getContactFlowId().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateContactFlowContentRequest == false)
            return false;
        UpdateContactFlowContentRequest other = (UpdateContactFlowContentRequest) obj;

        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getContactFlowId() == null ^ this.getContactFlowId() == null)
            return false;
        if (other.getContactFlowId() != null
                && other.getContactFlowId().equals(this.getContactFlowId()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        return true;
    }
}
