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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Create or update a group of environments that each run a separate component
 * of a single application. Takes a list of version labels that specify
 * application source bundles for each of the environments to create or update.
 * The name of each environment and other required information must be included
 * in the source bundles in an environment manifest named <code>env.yaml</code>.
 * See <a href=
 * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/environment-mgmt-compose.html"
 * >Compose Environments</a> for details.
 * </p>
 */
public class ComposeEnvironmentsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the application to which the specified source bundles belong.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String applicationName;

    /**
     * <p>
     * The name of the group to which the target environments belong. Specify a
     * group name only if the environment name defined in each target
     * environment's manifest ends with a + (plus) character. See <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/environment-cfg-manifest.html"
     * >Environment Manifest (env.yaml)</a> for details.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 19<br/>
     */
    private String groupName;

    /**
     * <p>
     * A list of version labels, specifying one or more application source
     * bundles that belong to the target application. Each source bundle must
     * include an environment manifest that specifies the name of the
     * environment and the name of the solution stack to use, and optionally can
     * specify environment links to create.
     * </p>
     */
    private java.util.List<String> versionLabels;

    /**
     * <p>
     * The name of the application to which the specified source bundles belong.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The name of the application to which the specified source bundles
     *         belong.
     *         </p>
     */
    public String getApplicationName() {
        return applicationName;
    }

    /**
     * <p>
     * The name of the application to which the specified source bundles belong.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName <p>
     *            The name of the application to which the specified source
     *            bundles belong.
     *            </p>
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of the application to which the specified source bundles belong.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName <p>
     *            The name of the application to which the specified source
     *            bundles belong.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ComposeEnvironmentsRequest withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * <p>
     * The name of the group to which the target environments belong. Specify a
     * group name only if the environment name defined in each target
     * environment's manifest ends with a + (plus) character. See <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/environment-cfg-manifest.html"
     * >Environment Manifest (env.yaml)</a> for details.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 19<br/>
     *
     * @return <p>
     *         The name of the group to which the target environments belong.
     *         Specify a group name only if the environment name defined in each
     *         target environment's manifest ends with a + (plus) character. See
     *         <a href=
     *         "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/environment-cfg-manifest.html"
     *         >Environment Manifest (env.yaml)</a> for details.
     *         </p>
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * <p>
     * The name of the group to which the target environments belong. Specify a
     * group name only if the environment name defined in each target
     * environment's manifest ends with a + (plus) character. See <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/environment-cfg-manifest.html"
     * >Environment Manifest (env.yaml)</a> for details.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 19<br/>
     *
     * @param groupName <p>
     *            The name of the group to which the target environments belong.
     *            Specify a group name only if the environment name defined in
     *            each target environment's manifest ends with a + (plus)
     *            character. See <a href=
     *            "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/environment-cfg-manifest.html"
     *            >Environment Manifest (env.yaml)</a> for details.
     *            </p>
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The name of the group to which the target environments belong. Specify a
     * group name only if the environment name defined in each target
     * environment's manifest ends with a + (plus) character. See <a href=
     * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/environment-cfg-manifest.html"
     * >Environment Manifest (env.yaml)</a> for details.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 19<br/>
     *
     * @param groupName <p>
     *            The name of the group to which the target environments belong.
     *            Specify a group name only if the environment name defined in
     *            each target environment's manifest ends with a + (plus)
     *            character. See <a href=
     *            "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/environment-cfg-manifest.html"
     *            >Environment Manifest (env.yaml)</a> for details.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ComposeEnvironmentsRequest withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * <p>
     * A list of version labels, specifying one or more application source
     * bundles that belong to the target application. Each source bundle must
     * include an environment manifest that specifies the name of the
     * environment and the name of the solution stack to use, and optionally can
     * specify environment links to create.
     * </p>
     *
     * @return <p>
     *         A list of version labels, specifying one or more application
     *         source bundles that belong to the target application. Each source
     *         bundle must include an environment manifest that specifies the
     *         name of the environment and the name of the solution stack to
     *         use, and optionally can specify environment links to create.
     *         </p>
     */
    public java.util.List<String> getVersionLabels() {
        return versionLabels;
    }

    /**
     * <p>
     * A list of version labels, specifying one or more application source
     * bundles that belong to the target application. Each source bundle must
     * include an environment manifest that specifies the name of the
     * environment and the name of the solution stack to use, and optionally can
     * specify environment links to create.
     * </p>
     *
     * @param versionLabels <p>
     *            A list of version labels, specifying one or more application
     *            source bundles that belong to the target application. Each
     *            source bundle must include an environment manifest that
     *            specifies the name of the environment and the name of the
     *            solution stack to use, and optionally can specify environment
     *            links to create.
     *            </p>
     */
    public void setVersionLabels(java.util.Collection<String> versionLabels) {
        if (versionLabels == null) {
            this.versionLabels = null;
            return;
        }

        this.versionLabels = new java.util.ArrayList<String>(versionLabels);
    }

    /**
     * <p>
     * A list of version labels, specifying one or more application source
     * bundles that belong to the target application. Each source bundle must
     * include an environment manifest that specifies the name of the
     * environment and the name of the solution stack to use, and optionally can
     * specify environment links to create.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param versionLabels <p>
     *            A list of version labels, specifying one or more application
     *            source bundles that belong to the target application. Each
     *            source bundle must include an environment manifest that
     *            specifies the name of the environment and the name of the
     *            solution stack to use, and optionally can specify environment
     *            links to create.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ComposeEnvironmentsRequest withVersionLabels(String... versionLabels) {
        if (getVersionLabels() == null) {
            this.versionLabels = new java.util.ArrayList<String>(versionLabels.length);
        }
        for (String value : versionLabels) {
            this.versionLabels.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of version labels, specifying one or more application source
     * bundles that belong to the target application. Each source bundle must
     * include an environment manifest that specifies the name of the
     * environment and the name of the solution stack to use, and optionally can
     * specify environment links to create.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param versionLabels <p>
     *            A list of version labels, specifying one or more application
     *            source bundles that belong to the target application. Each
     *            source bundle must include an environment manifest that
     *            specifies the name of the environment and the name of the
     *            solution stack to use, and optionally can specify environment
     *            links to create.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ComposeEnvironmentsRequest withVersionLabels(java.util.Collection<String> versionLabels) {
        setVersionLabels(versionLabels);
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
        if (getApplicationName() != null)
            sb.append("ApplicationName: " + getApplicationName() + ",");
        if (getGroupName() != null)
            sb.append("GroupName: " + getGroupName() + ",");
        if (getVersionLabels() != null)
            sb.append("VersionLabels: " + getVersionLabels());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode
                + ((getVersionLabels() == null) ? 0 : getVersionLabels().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComposeEnvironmentsRequest == false)
            return false;
        ComposeEnvironmentsRequest other = (ComposeEnvironmentsRequest) obj;

        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null
                && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null
                && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getVersionLabels() == null ^ this.getVersionLabels() == null)
            return false;
        if (other.getVersionLabels() != null
                && other.getVersionLabels().equals(this.getVersionLabels()) == false)
            return false;
        return true;
    }
}
