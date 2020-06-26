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

package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns the template body for a specified stack. You can get the template for
 * running or deleted stacks.
 * </p>
 * <p>
 * For deleted stacks, GetTemplate returns the template for up to 90 days after
 * the stack has been deleted.
 * </p>
 * <note>
 * <p>
 * If the template does not exist, a <code>ValidationError</code> is returned.
 * </p>
 * </note>
 */
public class GetTemplateRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name or the unique stack ID that is associated with the stack, which
     * are not always interchangeable:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Running stacks: You can specify either the stack's name or its unique
     * stack ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * Deleted stacks: You must specify the unique stack ID.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: There is no default value.
     * </p>
     */
    private String stackName;

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of a change set for which AWS
     * CloudFormation returns the associated template. If you specify a name,
     * you must also specify the <code>StackName</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[a-zA-Z][-a-zA-Z0-9]*|arn:[-a-zA-Z0-9:/]*<br/>
     */
    private String changeSetName;

    /**
     * <p>
     * For templates that include transforms, the stage of the template that AWS
     * CloudFormation returns. To get the user-submitted template, specify
     * <code>Original</code>. To get the template after AWS CloudFormation has
     * processed all transforms, specify <code>Processed</code>.
     * </p>
     * <p>
     * If the template doesn't include transforms, <code>Original</code> and
     * <code>Processed</code> return the same template. By default, AWS
     * CloudFormation specifies <code>Original</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Original, Processed
     */
    private String templateStage;

    /**
     * <p>
     * The name or the unique stack ID that is associated with the stack, which
     * are not always interchangeable:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Running stacks: You can specify either the stack's name or its unique
     * stack ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * Deleted stacks: You must specify the unique stack ID.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: There is no default value.
     * </p>
     *
     * @return <p>
     *         The name or the unique stack ID that is associated with the
     *         stack, which are not always interchangeable:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Running stacks: You can specify either the stack's name or its
     *         unique stack ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Deleted stacks: You must specify the unique stack ID.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Default: There is no default value.
     *         </p>
     */
    public String getStackName() {
        return stackName;
    }

    /**
     * <p>
     * The name or the unique stack ID that is associated with the stack, which
     * are not always interchangeable:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Running stacks: You can specify either the stack's name or its unique
     * stack ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * Deleted stacks: You must specify the unique stack ID.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: There is no default value.
     * </p>
     *
     * @param stackName <p>
     *            The name or the unique stack ID that is associated with the
     *            stack, which are not always interchangeable:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Running stacks: You can specify either the stack's name or its
     *            unique stack ID.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Deleted stacks: You must specify the unique stack ID.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Default: There is no default value.
     *            </p>
     */
    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    /**
     * <p>
     * The name or the unique stack ID that is associated with the stack, which
     * are not always interchangeable:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Running stacks: You can specify either the stack's name or its unique
     * stack ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * Deleted stacks: You must specify the unique stack ID.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: There is no default value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stackName <p>
     *            The name or the unique stack ID that is associated with the
     *            stack, which are not always interchangeable:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Running stacks: You can specify either the stack's name or its
     *            unique stack ID.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Deleted stacks: You must specify the unique stack ID.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Default: There is no default value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetTemplateRequest withStackName(String stackName) {
        this.stackName = stackName;
        return this;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of a change set for which AWS
     * CloudFormation returns the associated template. If you specify a name,
     * you must also specify the <code>StackName</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[a-zA-Z][-a-zA-Z0-9]*|arn:[-a-zA-Z0-9:/]*<br/>
     *
     * @return <p>
     *         The name or Amazon Resource Name (ARN) of a change set for which
     *         AWS CloudFormation returns the associated template. If you
     *         specify a name, you must also specify the <code>StackName</code>.
     *         </p>
     */
    public String getChangeSetName() {
        return changeSetName;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of a change set for which AWS
     * CloudFormation returns the associated template. If you specify a name,
     * you must also specify the <code>StackName</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[a-zA-Z][-a-zA-Z0-9]*|arn:[-a-zA-Z0-9:/]*<br/>
     *
     * @param changeSetName <p>
     *            The name or Amazon Resource Name (ARN) of a change set for
     *            which AWS CloudFormation returns the associated template. If
     *            you specify a name, you must also specify the
     *            <code>StackName</code>.
     *            </p>
     */
    public void setChangeSetName(String changeSetName) {
        this.changeSetName = changeSetName;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of a change set for which AWS
     * CloudFormation returns the associated template. If you specify a name,
     * you must also specify the <code>StackName</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[a-zA-Z][-a-zA-Z0-9]*|arn:[-a-zA-Z0-9:/]*<br/>
     *
     * @param changeSetName <p>
     *            The name or Amazon Resource Name (ARN) of a change set for
     *            which AWS CloudFormation returns the associated template. If
     *            you specify a name, you must also specify the
     *            <code>StackName</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetTemplateRequest withChangeSetName(String changeSetName) {
        this.changeSetName = changeSetName;
        return this;
    }

    /**
     * <p>
     * For templates that include transforms, the stage of the template that AWS
     * CloudFormation returns. To get the user-submitted template, specify
     * <code>Original</code>. To get the template after AWS CloudFormation has
     * processed all transforms, specify <code>Processed</code>.
     * </p>
     * <p>
     * If the template doesn't include transforms, <code>Original</code> and
     * <code>Processed</code> return the same template. By default, AWS
     * CloudFormation specifies <code>Original</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Original, Processed
     *
     * @return <p>
     *         For templates that include transforms, the stage of the template
     *         that AWS CloudFormation returns. To get the user-submitted
     *         template, specify <code>Original</code>. To get the template
     *         after AWS CloudFormation has processed all transforms, specify
     *         <code>Processed</code>.
     *         </p>
     *         <p>
     *         If the template doesn't include transforms, <code>Original</code>
     *         and <code>Processed</code> return the same template. By default,
     *         AWS CloudFormation specifies <code>Original</code>.
     *         </p>
     * @see TemplateStage
     */
    public String getTemplateStage() {
        return templateStage;
    }

    /**
     * <p>
     * For templates that include transforms, the stage of the template that AWS
     * CloudFormation returns. To get the user-submitted template, specify
     * <code>Original</code>. To get the template after AWS CloudFormation has
     * processed all transforms, specify <code>Processed</code>.
     * </p>
     * <p>
     * If the template doesn't include transforms, <code>Original</code> and
     * <code>Processed</code> return the same template. By default, AWS
     * CloudFormation specifies <code>Original</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Original, Processed
     *
     * @param templateStage <p>
     *            For templates that include transforms, the stage of the
     *            template that AWS CloudFormation returns. To get the
     *            user-submitted template, specify <code>Original</code>. To get
     *            the template after AWS CloudFormation has processed all
     *            transforms, specify <code>Processed</code>.
     *            </p>
     *            <p>
     *            If the template doesn't include transforms,
     *            <code>Original</code> and <code>Processed</code> return the
     *            same template. By default, AWS CloudFormation specifies
     *            <code>Original</code>.
     *            </p>
     * @see TemplateStage
     */
    public void setTemplateStage(String templateStage) {
        this.templateStage = templateStage;
    }

    /**
     * <p>
     * For templates that include transforms, the stage of the template that AWS
     * CloudFormation returns. To get the user-submitted template, specify
     * <code>Original</code>. To get the template after AWS CloudFormation has
     * processed all transforms, specify <code>Processed</code>.
     * </p>
     * <p>
     * If the template doesn't include transforms, <code>Original</code> and
     * <code>Processed</code> return the same template. By default, AWS
     * CloudFormation specifies <code>Original</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Original, Processed
     *
     * @param templateStage <p>
     *            For templates that include transforms, the stage of the
     *            template that AWS CloudFormation returns. To get the
     *            user-submitted template, specify <code>Original</code>. To get
     *            the template after AWS CloudFormation has processed all
     *            transforms, specify <code>Processed</code>.
     *            </p>
     *            <p>
     *            If the template doesn't include transforms,
     *            <code>Original</code> and <code>Processed</code> return the
     *            same template. By default, AWS CloudFormation specifies
     *            <code>Original</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TemplateStage
     */
    public GetTemplateRequest withTemplateStage(String templateStage) {
        this.templateStage = templateStage;
        return this;
    }

    /**
     * <p>
     * For templates that include transforms, the stage of the template that AWS
     * CloudFormation returns. To get the user-submitted template, specify
     * <code>Original</code>. To get the template after AWS CloudFormation has
     * processed all transforms, specify <code>Processed</code>.
     * </p>
     * <p>
     * If the template doesn't include transforms, <code>Original</code> and
     * <code>Processed</code> return the same template. By default, AWS
     * CloudFormation specifies <code>Original</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Original, Processed
     *
     * @param templateStage <p>
     *            For templates that include transforms, the stage of the
     *            template that AWS CloudFormation returns. To get the
     *            user-submitted template, specify <code>Original</code>. To get
     *            the template after AWS CloudFormation has processed all
     *            transforms, specify <code>Processed</code>.
     *            </p>
     *            <p>
     *            If the template doesn't include transforms,
     *            <code>Original</code> and <code>Processed</code> return the
     *            same template. By default, AWS CloudFormation specifies
     *            <code>Original</code>.
     *            </p>
     * @see TemplateStage
     */
    public void setTemplateStage(TemplateStage templateStage) {
        this.templateStage = templateStage.toString();
    }

    /**
     * <p>
     * For templates that include transforms, the stage of the template that AWS
     * CloudFormation returns. To get the user-submitted template, specify
     * <code>Original</code>. To get the template after AWS CloudFormation has
     * processed all transforms, specify <code>Processed</code>.
     * </p>
     * <p>
     * If the template doesn't include transforms, <code>Original</code> and
     * <code>Processed</code> return the same template. By default, AWS
     * CloudFormation specifies <code>Original</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Original, Processed
     *
     * @param templateStage <p>
     *            For templates that include transforms, the stage of the
     *            template that AWS CloudFormation returns. To get the
     *            user-submitted template, specify <code>Original</code>. To get
     *            the template after AWS CloudFormation has processed all
     *            transforms, specify <code>Processed</code>.
     *            </p>
     *            <p>
     *            If the template doesn't include transforms,
     *            <code>Original</code> and <code>Processed</code> return the
     *            same template. By default, AWS CloudFormation specifies
     *            <code>Original</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TemplateStage
     */
    public GetTemplateRequest withTemplateStage(TemplateStage templateStage) {
        this.templateStage = templateStage.toString();
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
        if (getStackName() != null)
            sb.append("StackName: " + getStackName() + ",");
        if (getChangeSetName() != null)
            sb.append("ChangeSetName: " + getChangeSetName() + ",");
        if (getTemplateStage() != null)
            sb.append("TemplateStage: " + getTemplateStage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode());
        hashCode = prime * hashCode
                + ((getChangeSetName() == null) ? 0 : getChangeSetName().hashCode());
        hashCode = prime * hashCode
                + ((getTemplateStage() == null) ? 0 : getTemplateStage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTemplateRequest == false)
            return false;
        GetTemplateRequest other = (GetTemplateRequest) obj;

        if (other.getStackName() == null ^ this.getStackName() == null)
            return false;
        if (other.getStackName() != null
                && other.getStackName().equals(this.getStackName()) == false)
            return false;
        if (other.getChangeSetName() == null ^ this.getChangeSetName() == null)
            return false;
        if (other.getChangeSetName() != null
                && other.getChangeSetName().equals(this.getChangeSetName()) == false)
            return false;
        if (other.getTemplateStage() == null ^ this.getTemplateStage() == null)
            return false;
        if (other.getTemplateStage() != null
                && other.getTemplateStage().equals(this.getTemplateStage()) == false)
            return false;
        return true;
    }
}
