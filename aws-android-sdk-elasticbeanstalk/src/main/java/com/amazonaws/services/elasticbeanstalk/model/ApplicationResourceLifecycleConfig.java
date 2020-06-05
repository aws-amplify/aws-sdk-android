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

package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;

/**
 * <p>
 * The resource lifecycle configuration for an application. Defines lifecycle
 * settings for resources that belong to the application, and the service role
 * that AWS Elastic Beanstalk assumes in order to apply lifecycle settings. The
 * version lifecycle configuration defines lifecycle settings for application
 * versions.
 * </p>
 */
public class ApplicationResourceLifecycleConfig implements Serializable {
    /**
     * <p>
     * The ARN of an IAM service role that Elastic Beanstalk has permission to
     * assume.
     * </p>
     * <p>
     * The <code>ServiceRole</code> property is required the first time that you
     * provide a <code>VersionLifecycleConfig</code> for the application in one
     * of the supporting calls (<code>CreateApplication</code> or
     * <code>UpdateApplicationResourceLifecycle</code>). After you provide it
     * once, in either one of the calls, Elastic Beanstalk persists the Service
     * Role with the application, and you don't need to specify it again in
     * subsequent <code>UpdateApplicationResourceLifecycle</code> calls. You
     * can, however, specify it in subsequent calls to change the Service Role
     * to another value.
     * </p>
     */
    private String serviceRole;

    /**
     * <p>
     * Defines lifecycle settings for application versions.
     * </p>
     */
    private ApplicationVersionLifecycleConfig versionLifecycleConfig;

    /**
     * <p>
     * The ARN of an IAM service role that Elastic Beanstalk has permission to
     * assume.
     * </p>
     * <p>
     * The <code>ServiceRole</code> property is required the first time that you
     * provide a <code>VersionLifecycleConfig</code> for the application in one
     * of the supporting calls (<code>CreateApplication</code> or
     * <code>UpdateApplicationResourceLifecycle</code>). After you provide it
     * once, in either one of the calls, Elastic Beanstalk persists the Service
     * Role with the application, and you don't need to specify it again in
     * subsequent <code>UpdateApplicationResourceLifecycle</code> calls. You
     * can, however, specify it in subsequent calls to change the Service Role
     * to another value.
     * </p>
     *
     * @return <p>
     *         The ARN of an IAM service role that Elastic Beanstalk has
     *         permission to assume.
     *         </p>
     *         <p>
     *         The <code>ServiceRole</code> property is required the first time
     *         that you provide a <code>VersionLifecycleConfig</code> for the
     *         application in one of the supporting calls (
     *         <code>CreateApplication</code> or
     *         <code>UpdateApplicationResourceLifecycle</code>). After you
     *         provide it once, in either one of the calls, Elastic Beanstalk
     *         persists the Service Role with the application, and you don't
     *         need to specify it again in subsequent
     *         <code>UpdateApplicationResourceLifecycle</code> calls. You can,
     *         however, specify it in subsequent calls to change the Service
     *         Role to another value.
     *         </p>
     */
    public String getServiceRole() {
        return serviceRole;
    }

    /**
     * <p>
     * The ARN of an IAM service role that Elastic Beanstalk has permission to
     * assume.
     * </p>
     * <p>
     * The <code>ServiceRole</code> property is required the first time that you
     * provide a <code>VersionLifecycleConfig</code> for the application in one
     * of the supporting calls (<code>CreateApplication</code> or
     * <code>UpdateApplicationResourceLifecycle</code>). After you provide it
     * once, in either one of the calls, Elastic Beanstalk persists the Service
     * Role with the application, and you don't need to specify it again in
     * subsequent <code>UpdateApplicationResourceLifecycle</code> calls. You
     * can, however, specify it in subsequent calls to change the Service Role
     * to another value.
     * </p>
     *
     * @param serviceRole <p>
     *            The ARN of an IAM service role that Elastic Beanstalk has
     *            permission to assume.
     *            </p>
     *            <p>
     *            The <code>ServiceRole</code> property is required the first
     *            time that you provide a <code>VersionLifecycleConfig</code>
     *            for the application in one of the supporting calls (
     *            <code>CreateApplication</code> or
     *            <code>UpdateApplicationResourceLifecycle</code>). After you
     *            provide it once, in either one of the calls, Elastic Beanstalk
     *            persists the Service Role with the application, and you don't
     *            need to specify it again in subsequent
     *            <code>UpdateApplicationResourceLifecycle</code> calls. You
     *            can, however, specify it in subsequent calls to change the
     *            Service Role to another value.
     *            </p>
     */
    public void setServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
    }

    /**
     * <p>
     * The ARN of an IAM service role that Elastic Beanstalk has permission to
     * assume.
     * </p>
     * <p>
     * The <code>ServiceRole</code> property is required the first time that you
     * provide a <code>VersionLifecycleConfig</code> for the application in one
     * of the supporting calls (<code>CreateApplication</code> or
     * <code>UpdateApplicationResourceLifecycle</code>). After you provide it
     * once, in either one of the calls, Elastic Beanstalk persists the Service
     * Role with the application, and you don't need to specify it again in
     * subsequent <code>UpdateApplicationResourceLifecycle</code> calls. You
     * can, however, specify it in subsequent calls to change the Service Role
     * to another value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceRole <p>
     *            The ARN of an IAM service role that Elastic Beanstalk has
     *            permission to assume.
     *            </p>
     *            <p>
     *            The <code>ServiceRole</code> property is required the first
     *            time that you provide a <code>VersionLifecycleConfig</code>
     *            for the application in one of the supporting calls (
     *            <code>CreateApplication</code> or
     *            <code>UpdateApplicationResourceLifecycle</code>). After you
     *            provide it once, in either one of the calls, Elastic Beanstalk
     *            persists the Service Role with the application, and you don't
     *            need to specify it again in subsequent
     *            <code>UpdateApplicationResourceLifecycle</code> calls. You
     *            can, however, specify it in subsequent calls to change the
     *            Service Role to another value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApplicationResourceLifecycleConfig withServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
        return this;
    }

    /**
     * <p>
     * Defines lifecycle settings for application versions.
     * </p>
     *
     * @return <p>
     *         Defines lifecycle settings for application versions.
     *         </p>
     */
    public ApplicationVersionLifecycleConfig getVersionLifecycleConfig() {
        return versionLifecycleConfig;
    }

    /**
     * <p>
     * Defines lifecycle settings for application versions.
     * </p>
     *
     * @param versionLifecycleConfig <p>
     *            Defines lifecycle settings for application versions.
     *            </p>
     */
    public void setVersionLifecycleConfig(ApplicationVersionLifecycleConfig versionLifecycleConfig) {
        this.versionLifecycleConfig = versionLifecycleConfig;
    }

    /**
     * <p>
     * Defines lifecycle settings for application versions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param versionLifecycleConfig <p>
     *            Defines lifecycle settings for application versions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApplicationResourceLifecycleConfig withVersionLifecycleConfig(
            ApplicationVersionLifecycleConfig versionLifecycleConfig) {
        this.versionLifecycleConfig = versionLifecycleConfig;
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
        if (getServiceRole() != null)
            sb.append("ServiceRole: " + getServiceRole() + ",");
        if (getVersionLifecycleConfig() != null)
            sb.append("VersionLifecycleConfig: " + getVersionLifecycleConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getServiceRole() == null) ? 0 : getServiceRole().hashCode());
        hashCode = prime
                * hashCode
                + ((getVersionLifecycleConfig() == null) ? 0 : getVersionLifecycleConfig()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplicationResourceLifecycleConfig == false)
            return false;
        ApplicationResourceLifecycleConfig other = (ApplicationResourceLifecycleConfig) obj;

        if (other.getServiceRole() == null ^ this.getServiceRole() == null)
            return false;
        if (other.getServiceRole() != null
                && other.getServiceRole().equals(this.getServiceRole()) == false)
            return false;
        if (other.getVersionLifecycleConfig() == null ^ this.getVersionLifecycleConfig() == null)
            return false;
        if (other.getVersionLifecycleConfig() != null
                && other.getVersionLifecycleConfig().equals(this.getVersionLifecycleConfig()) == false)
            return false;
        return true;
    }
}
