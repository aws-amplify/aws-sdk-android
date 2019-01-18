/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a launch template and the launch template version.
 * </p>
 * <p>
 * The launch template that is specified must be configured for use with an Auto
 * Scaling group. For more information, see <a href=
 * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/create-launch-template.html"
 * >Creating a Launch Template for an Auto Scaling group</a> in the <i>Amazon
 * EC2 Auto Scaling User Guide</i>.
 * </p>
 */
public class LaunchTemplateSpecification implements Serializable {
    /**
     * <p>
     * The ID of the launch template. You must specify either a template ID or a
     * template name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String launchTemplateId;

    /**
     * <p>
     * The name of the launch template. You must specify either a template name
     * or a template ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\(\)\.-/_]+<br/>
     */
    private String launchTemplateName;

    /**
     * <p>
     * The version number, <code>$Latest</code>, or <code>$Default</code>. If
     * the value is <code>$Latest</code>, Amazon EC2 Auto Scaling selects the
     * latest version of the launch template when launching instances. If the
     * value is <code>$Default</code>, Amazon EC2 Auto Scaling selects the
     * default version of the launch template when launching instances. The
     * default value is <code>$Default</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String version;

    /**
     * <p>
     * The ID of the launch template. You must specify either a template ID or a
     * template name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The ID of the launch template. You must specify either a template
     *         ID or a template name.
     *         </p>
     */
    public String getLaunchTemplateId() {
        return launchTemplateId;
    }

    /**
     * <p>
     * The ID of the launch template. You must specify either a template ID or a
     * template name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param launchTemplateId <p>
     *            The ID of the launch template. You must specify either a
     *            template ID or a template name.
     *            </p>
     */
    public void setLaunchTemplateId(String launchTemplateId) {
        this.launchTemplateId = launchTemplateId;
    }

    /**
     * <p>
     * The ID of the launch template. You must specify either a template ID or a
     * template name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param launchTemplateId <p>
     *            The ID of the launch template. You must specify either a
     *            template ID or a template name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchTemplateSpecification withLaunchTemplateId(String launchTemplateId) {
        this.launchTemplateId = launchTemplateId;
        return this;
    }

    /**
     * <p>
     * The name of the launch template. You must specify either a template name
     * or a template ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\(\)\.-/_]+<br/>
     *
     * @return <p>
     *         The name of the launch template. You must specify either a
     *         template name or a template ID.
     *         </p>
     */
    public String getLaunchTemplateName() {
        return launchTemplateName;
    }

    /**
     * <p>
     * The name of the launch template. You must specify either a template name
     * or a template ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\(\)\.-/_]+<br/>
     *
     * @param launchTemplateName <p>
     *            The name of the launch template. You must specify either a
     *            template name or a template ID.
     *            </p>
     */
    public void setLaunchTemplateName(String launchTemplateName) {
        this.launchTemplateName = launchTemplateName;
    }

    /**
     * <p>
     * The name of the launch template. You must specify either a template name
     * or a template ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\(\)\.-/_]+<br/>
     *
     * @param launchTemplateName <p>
     *            The name of the launch template. You must specify either a
     *            template name or a template ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchTemplateSpecification withLaunchTemplateName(String launchTemplateName) {
        this.launchTemplateName = launchTemplateName;
        return this;
    }

    /**
     * <p>
     * The version number, <code>$Latest</code>, or <code>$Default</code>. If
     * the value is <code>$Latest</code>, Amazon EC2 Auto Scaling selects the
     * latest version of the launch template when launching instances. If the
     * value is <code>$Default</code>, Amazon EC2 Auto Scaling selects the
     * default version of the launch template when launching instances. The
     * default value is <code>$Default</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The version number, <code>$Latest</code>, or
     *         <code>$Default</code>. If the value is <code>$Latest</code>,
     *         Amazon EC2 Auto Scaling selects the latest version of the launch
     *         template when launching instances. If the value is
     *         <code>$Default</code>, Amazon EC2 Auto Scaling selects the
     *         default version of the launch template when launching instances.
     *         The default value is <code>$Default</code>.
     *         </p>
     */
    public String getVersion() {
        return version;
    }

    /**
     * <p>
     * The version number, <code>$Latest</code>, or <code>$Default</code>. If
     * the value is <code>$Latest</code>, Amazon EC2 Auto Scaling selects the
     * latest version of the launch template when launching instances. If the
     * value is <code>$Default</code>, Amazon EC2 Auto Scaling selects the
     * default version of the launch template when launching instances. The
     * default value is <code>$Default</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param version <p>
     *            The version number, <code>$Latest</code>, or
     *            <code>$Default</code>. If the value is <code>$Latest</code>,
     *            Amazon EC2 Auto Scaling selects the latest version of the
     *            launch template when launching instances. If the value is
     *            <code>$Default</code>, Amazon EC2 Auto Scaling selects the
     *            default version of the launch template when launching
     *            instances. The default value is <code>$Default</code>.
     *            </p>
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version number, <code>$Latest</code>, or <code>$Default</code>. If
     * the value is <code>$Latest</code>, Amazon EC2 Auto Scaling selects the
     * latest version of the launch template when launching instances. If the
     * value is <code>$Default</code>, Amazon EC2 Auto Scaling selects the
     * default version of the launch template when launching instances. The
     * default value is <code>$Default</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param version <p>
     *            The version number, <code>$Latest</code>, or
     *            <code>$Default</code>. If the value is <code>$Latest</code>,
     *            Amazon EC2 Auto Scaling selects the latest version of the
     *            launch template when launching instances. If the value is
     *            <code>$Default</code>, Amazon EC2 Auto Scaling selects the
     *            default version of the launch template when launching
     *            instances. The default value is <code>$Default</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchTemplateSpecification withVersion(String version) {
        this.version = version;
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
        if (getLaunchTemplateId() != null)
            sb.append("LaunchTemplateId: " + getLaunchTemplateId() + ",");
        if (getLaunchTemplateName() != null)
            sb.append("LaunchTemplateName: " + getLaunchTemplateName() + ",");
        if (getVersion() != null)
            sb.append("Version: " + getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLaunchTemplateId() == null) ? 0 : getLaunchTemplateId().hashCode());
        hashCode = prime * hashCode
                + ((getLaunchTemplateName() == null) ? 0 : getLaunchTemplateName().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LaunchTemplateSpecification == false)
            return false;
        LaunchTemplateSpecification other = (LaunchTemplateSpecification) obj;

        if (other.getLaunchTemplateId() == null ^ this.getLaunchTemplateId() == null)
            return false;
        if (other.getLaunchTemplateId() != null
                && other.getLaunchTemplateId().equals(this.getLaunchTemplateId()) == false)
            return false;
        if (other.getLaunchTemplateName() == null ^ this.getLaunchTemplateName() == null)
            return false;
        if (other.getLaunchTemplateName() != null
                && other.getLaunchTemplateName().equals(this.getLaunchTemplateName()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }
}
