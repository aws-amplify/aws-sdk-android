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
 * The application version lifecycle settings for an application. Defines the
 * rules that Elastic Beanstalk applies to an application's versions in order to
 * avoid hitting the per-region limit for application versions.
 * </p>
 * <p>
 * When Elastic Beanstalk deletes an application version from its database, you
 * can no longer deploy that version to an environment. The source bundle
 * remains in S3 unless you configure the rule to delete it.
 * </p>
 */
public class ApplicationVersionLifecycleConfig implements Serializable {
    /**
     * <p>
     * Specify a max count rule to restrict the number of application versions
     * that are retained for an application.
     * </p>
     */
    private MaxCountRule maxCountRule;

    /**
     * <p>
     * Specify a max age rule to restrict the length of time that application
     * versions are retained for an application.
     * </p>
     */
    private MaxAgeRule maxAgeRule;

    /**
     * <p>
     * Specify a max count rule to restrict the number of application versions
     * that are retained for an application.
     * </p>
     *
     * @return <p>
     *         Specify a max count rule to restrict the number of application
     *         versions that are retained for an application.
     *         </p>
     */
    public MaxCountRule getMaxCountRule() {
        return maxCountRule;
    }

    /**
     * <p>
     * Specify a max count rule to restrict the number of application versions
     * that are retained for an application.
     * </p>
     *
     * @param maxCountRule <p>
     *            Specify a max count rule to restrict the number of application
     *            versions that are retained for an application.
     *            </p>
     */
    public void setMaxCountRule(MaxCountRule maxCountRule) {
        this.maxCountRule = maxCountRule;
    }

    /**
     * <p>
     * Specify a max count rule to restrict the number of application versions
     * that are retained for an application.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxCountRule <p>
     *            Specify a max count rule to restrict the number of application
     *            versions that are retained for an application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApplicationVersionLifecycleConfig withMaxCountRule(MaxCountRule maxCountRule) {
        this.maxCountRule = maxCountRule;
        return this;
    }

    /**
     * <p>
     * Specify a max age rule to restrict the length of time that application
     * versions are retained for an application.
     * </p>
     *
     * @return <p>
     *         Specify a max age rule to restrict the length of time that
     *         application versions are retained for an application.
     *         </p>
     */
    public MaxAgeRule getMaxAgeRule() {
        return maxAgeRule;
    }

    /**
     * <p>
     * Specify a max age rule to restrict the length of time that application
     * versions are retained for an application.
     * </p>
     *
     * @param maxAgeRule <p>
     *            Specify a max age rule to restrict the length of time that
     *            application versions are retained for an application.
     *            </p>
     */
    public void setMaxAgeRule(MaxAgeRule maxAgeRule) {
        this.maxAgeRule = maxAgeRule;
    }

    /**
     * <p>
     * Specify a max age rule to restrict the length of time that application
     * versions are retained for an application.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxAgeRule <p>
     *            Specify a max age rule to restrict the length of time that
     *            application versions are retained for an application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApplicationVersionLifecycleConfig withMaxAgeRule(MaxAgeRule maxAgeRule) {
        this.maxAgeRule = maxAgeRule;
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
        if (getMaxCountRule() != null)
            sb.append("MaxCountRule: " + getMaxCountRule() + ",");
        if (getMaxAgeRule() != null)
            sb.append("MaxAgeRule: " + getMaxAgeRule());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMaxCountRule() == null) ? 0 : getMaxCountRule().hashCode());
        hashCode = prime * hashCode + ((getMaxAgeRule() == null) ? 0 : getMaxAgeRule().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplicationVersionLifecycleConfig == false)
            return false;
        ApplicationVersionLifecycleConfig other = (ApplicationVersionLifecycleConfig) obj;

        if (other.getMaxCountRule() == null ^ this.getMaxCountRule() == null)
            return false;
        if (other.getMaxCountRule() != null
                && other.getMaxCountRule().equals(this.getMaxCountRule()) == false)
            return false;
        if (other.getMaxAgeRule() == null ^ this.getMaxAgeRule() == null)
            return false;
        if (other.getMaxAgeRule() != null
                && other.getMaxAgeRule().equals(this.getMaxAgeRule()) == false)
            return false;
        return true;
    }
}
