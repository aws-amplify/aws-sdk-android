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

public class DescribeHumanTaskUiResult implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the human task user interface.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:human-task-ui/.*<br/>
     */
    private String humanTaskUiArn;

    /**
     * <p>
     * The name of the human task user interface.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](-*[a-z0-9])*<br/>
     */
    private String humanTaskUiName;

    /**
     * <p>
     * The timestamp when the human task user interface was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * Container for user interface template information.
     * </p>
     */
    private UiTemplateInfo uiTemplate;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the human task user interface.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:human-task-ui/.*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the human task user interface.
     *         </p>
     */
    public String getHumanTaskUiArn() {
        return humanTaskUiArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the human task user interface.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:human-task-ui/.*<br/>
     *
     * @param humanTaskUiArn <p>
     *            The Amazon Resource Name (ARN) of the human task user
     *            interface.
     *            </p>
     */
    public void setHumanTaskUiArn(String humanTaskUiArn) {
        this.humanTaskUiArn = humanTaskUiArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the human task user interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:human-task-ui/.*<br/>
     *
     * @param humanTaskUiArn <p>
     *            The Amazon Resource Name (ARN) of the human task user
     *            interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeHumanTaskUiResult withHumanTaskUiArn(String humanTaskUiArn) {
        this.humanTaskUiArn = humanTaskUiArn;
        return this;
    }

    /**
     * <p>
     * The name of the human task user interface.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](-*[a-z0-9])*<br/>
     *
     * @return <p>
     *         The name of the human task user interface.
     *         </p>
     */
    public String getHumanTaskUiName() {
        return humanTaskUiName;
    }

    /**
     * <p>
     * The name of the human task user interface.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](-*[a-z0-9])*<br/>
     *
     * @param humanTaskUiName <p>
     *            The name of the human task user interface.
     *            </p>
     */
    public void setHumanTaskUiName(String humanTaskUiName) {
        this.humanTaskUiName = humanTaskUiName;
    }

    /**
     * <p>
     * The name of the human task user interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](-*[a-z0-9])*<br/>
     *
     * @param humanTaskUiName <p>
     *            The name of the human task user interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeHumanTaskUiResult withHumanTaskUiName(String humanTaskUiName) {
        this.humanTaskUiName = humanTaskUiName;
        return this;
    }

    /**
     * <p>
     * The timestamp when the human task user interface was created.
     * </p>
     *
     * @return <p>
     *         The timestamp when the human task user interface was created.
     *         </p>
     */
    public java.util.Date getCreationTime() {
        return creationTime;
    }

    /**
     * <p>
     * The timestamp when the human task user interface was created.
     * </p>
     *
     * @param creationTime <p>
     *            The timestamp when the human task user interface was created.
     *            </p>
     */
    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The timestamp when the human task user interface was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationTime <p>
     *            The timestamp when the human task user interface was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeHumanTaskUiResult withCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * <p>
     * Container for user interface template information.
     * </p>
     *
     * @return <p>
     *         Container for user interface template information.
     *         </p>
     */
    public UiTemplateInfo getUiTemplate() {
        return uiTemplate;
    }

    /**
     * <p>
     * Container for user interface template information.
     * </p>
     *
     * @param uiTemplate <p>
     *            Container for user interface template information.
     *            </p>
     */
    public void setUiTemplate(UiTemplateInfo uiTemplate) {
        this.uiTemplate = uiTemplate;
    }

    /**
     * <p>
     * Container for user interface template information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param uiTemplate <p>
     *            Container for user interface template information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeHumanTaskUiResult withUiTemplate(UiTemplateInfo uiTemplate) {
        this.uiTemplate = uiTemplate;
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
        if (getHumanTaskUiArn() != null)
            sb.append("HumanTaskUiArn: " + getHumanTaskUiArn() + ",");
        if (getHumanTaskUiName() != null)
            sb.append("HumanTaskUiName: " + getHumanTaskUiName() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getUiTemplate() != null)
            sb.append("UiTemplate: " + getUiTemplate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getHumanTaskUiArn() == null) ? 0 : getHumanTaskUiArn().hashCode());
        hashCode = prime * hashCode
                + ((getHumanTaskUiName() == null) ? 0 : getHumanTaskUiName().hashCode());
        hashCode = prime * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getUiTemplate() == null) ? 0 : getUiTemplate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeHumanTaskUiResult == false)
            return false;
        DescribeHumanTaskUiResult other = (DescribeHumanTaskUiResult) obj;

        if (other.getHumanTaskUiArn() == null ^ this.getHumanTaskUiArn() == null)
            return false;
        if (other.getHumanTaskUiArn() != null
                && other.getHumanTaskUiArn().equals(this.getHumanTaskUiArn()) == false)
            return false;
        if (other.getHumanTaskUiName() == null ^ this.getHumanTaskUiName() == null)
            return false;
        if (other.getHumanTaskUiName() != null
                && other.getHumanTaskUiName().equals(this.getHumanTaskUiName()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getUiTemplate() == null ^ this.getUiTemplate() == null)
            return false;
        if (other.getUiTemplate() != null
                && other.getUiTemplate().equals(this.getUiTemplate()) == false)
            return false;
        return true;
    }
}
