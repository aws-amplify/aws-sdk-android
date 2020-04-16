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

package com.amazonaws.services.amazonaugmentedairuntime.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Starts a human loop, provided that at least one activation condition is met.
 * </p>
 */
public class StartHumanLoopRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the human loop.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](-*[a-z0-9])*$<br/>
     */
    private String humanLoopName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the flow definition associated with
     * this human loop.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:flow-definition/.*
     * <br/>
     */
    private String flowDefinitionArn;

    /**
     * <p>
     * An object that contains information about the human loop.
     * </p>
     */
    private HumanLoopInput humanLoopInput;

    /**
     * <p>
     * Attributes of the specified data. Use <code>DataAttributes</code> to
     * specify if your data is free of personally identifiable information
     * and/or free of adult content.
     * </p>
     */
    private HumanLoopDataAttributes dataAttributes;

    /**
     * <p>
     * The name of the human loop.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](-*[a-z0-9])*$<br/>
     *
     * @return <p>
     *         The name of the human loop.
     *         </p>
     */
    public String getHumanLoopName() {
        return humanLoopName;
    }

    /**
     * <p>
     * The name of the human loop.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](-*[a-z0-9])*$<br/>
     *
     * @param humanLoopName <p>
     *            The name of the human loop.
     *            </p>
     */
    public void setHumanLoopName(String humanLoopName) {
        this.humanLoopName = humanLoopName;
    }

    /**
     * <p>
     * The name of the human loop.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](-*[a-z0-9])*$<br/>
     *
     * @param humanLoopName <p>
     *            The name of the human loop.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartHumanLoopRequest withHumanLoopName(String humanLoopName) {
        this.humanLoopName = humanLoopName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the flow definition associated with
     * this human loop.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:flow-definition/.*
     * <br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the flow definition associated
     *         with this human loop.
     *         </p>
     */
    public String getFlowDefinitionArn() {
        return flowDefinitionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the flow definition associated with
     * this human loop.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:flow-definition/.*
     * <br/>
     *
     * @param flowDefinitionArn <p>
     *            The Amazon Resource Name (ARN) of the flow definition
     *            associated with this human loop.
     *            </p>
     */
    public void setFlowDefinitionArn(String flowDefinitionArn) {
        this.flowDefinitionArn = flowDefinitionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the flow definition associated with
     * this human loop.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:flow-definition/.*
     * <br/>
     *
     * @param flowDefinitionArn <p>
     *            The Amazon Resource Name (ARN) of the flow definition
     *            associated with this human loop.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartHumanLoopRequest withFlowDefinitionArn(String flowDefinitionArn) {
        this.flowDefinitionArn = flowDefinitionArn;
        return this;
    }

    /**
     * <p>
     * An object that contains information about the human loop.
     * </p>
     *
     * @return <p>
     *         An object that contains information about the human loop.
     *         </p>
     */
    public HumanLoopInput getHumanLoopInput() {
        return humanLoopInput;
    }

    /**
     * <p>
     * An object that contains information about the human loop.
     * </p>
     *
     * @param humanLoopInput <p>
     *            An object that contains information about the human loop.
     *            </p>
     */
    public void setHumanLoopInput(HumanLoopInput humanLoopInput) {
        this.humanLoopInput = humanLoopInput;
    }

    /**
     * <p>
     * An object that contains information about the human loop.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param humanLoopInput <p>
     *            An object that contains information about the human loop.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartHumanLoopRequest withHumanLoopInput(HumanLoopInput humanLoopInput) {
        this.humanLoopInput = humanLoopInput;
        return this;
    }

    /**
     * <p>
     * Attributes of the specified data. Use <code>DataAttributes</code> to
     * specify if your data is free of personally identifiable information
     * and/or free of adult content.
     * </p>
     *
     * @return <p>
     *         Attributes of the specified data. Use <code>DataAttributes</code>
     *         to specify if your data is free of personally identifiable
     *         information and/or free of adult content.
     *         </p>
     */
    public HumanLoopDataAttributes getDataAttributes() {
        return dataAttributes;
    }

    /**
     * <p>
     * Attributes of the specified data. Use <code>DataAttributes</code> to
     * specify if your data is free of personally identifiable information
     * and/or free of adult content.
     * </p>
     *
     * @param dataAttributes <p>
     *            Attributes of the specified data. Use
     *            <code>DataAttributes</code> to specify if your data is free of
     *            personally identifiable information and/or free of adult
     *            content.
     *            </p>
     */
    public void setDataAttributes(HumanLoopDataAttributes dataAttributes) {
        this.dataAttributes = dataAttributes;
    }

    /**
     * <p>
     * Attributes of the specified data. Use <code>DataAttributes</code> to
     * specify if your data is free of personally identifiable information
     * and/or free of adult content.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataAttributes <p>
     *            Attributes of the specified data. Use
     *            <code>DataAttributes</code> to specify if your data is free of
     *            personally identifiable information and/or free of adult
     *            content.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartHumanLoopRequest withDataAttributes(HumanLoopDataAttributes dataAttributes) {
        this.dataAttributes = dataAttributes;
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
        if (getHumanLoopName() != null)
            sb.append("HumanLoopName: " + getHumanLoopName() + ",");
        if (getFlowDefinitionArn() != null)
            sb.append("FlowDefinitionArn: " + getFlowDefinitionArn() + ",");
        if (getHumanLoopInput() != null)
            sb.append("HumanLoopInput: " + getHumanLoopInput() + ",");
        if (getDataAttributes() != null)
            sb.append("DataAttributes: " + getDataAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getHumanLoopName() == null) ? 0 : getHumanLoopName().hashCode());
        hashCode = prime * hashCode
                + ((getFlowDefinitionArn() == null) ? 0 : getFlowDefinitionArn().hashCode());
        hashCode = prime * hashCode
                + ((getHumanLoopInput() == null) ? 0 : getHumanLoopInput().hashCode());
        hashCode = prime * hashCode
                + ((getDataAttributes() == null) ? 0 : getDataAttributes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartHumanLoopRequest == false)
            return false;
        StartHumanLoopRequest other = (StartHumanLoopRequest) obj;

        if (other.getHumanLoopName() == null ^ this.getHumanLoopName() == null)
            return false;
        if (other.getHumanLoopName() != null
                && other.getHumanLoopName().equals(this.getHumanLoopName()) == false)
            return false;
        if (other.getFlowDefinitionArn() == null ^ this.getFlowDefinitionArn() == null)
            return false;
        if (other.getFlowDefinitionArn() != null
                && other.getFlowDefinitionArn().equals(this.getFlowDefinitionArn()) == false)
            return false;
        if (other.getHumanLoopInput() == null ^ this.getHumanLoopInput() == null)
            return false;
        if (other.getHumanLoopInput() != null
                && other.getHumanLoopInput().equals(this.getHumanLoopInput()) == false)
            return false;
        if (other.getDataAttributes() == null ^ this.getDataAttributes() == null)
            return false;
        if (other.getDataAttributes() != null
                && other.getDataAttributes().equals(this.getDataAttributes()) == false)
            return false;
        return true;
    }
}
