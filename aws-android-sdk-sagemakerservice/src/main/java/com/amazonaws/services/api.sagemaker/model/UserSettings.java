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

package com.amazonaws.services.api.sagemaker.model;

import java.io.Serializable;

/**
 * <p>
 * A collection of settings.
 * </p>
 */
public class UserSettings implements Serializable {
    /**
     * <p>
     * The execution role for the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+$<br/>
     */
    private String executionRole;

    /**
     * <p>
     * The security groups.
     * </p>
     */
    private java.util.List<String> securityGroups;

    /**
     * <p>
     * The sharing settings.
     * </p>
     */
    private SharingSettings sharingSettings;

    /**
     * <p>
     * The Jupyter server's app settings.
     * </p>
     */
    private JupyterServerAppSettings jupyterServerAppSettings;

    /**
     * <p>
     * The kernel gateway app settings.
     * </p>
     */
    private KernelGatewayAppSettings kernelGatewayAppSettings;

    /**
     * <p>
     * The TensorBoard app settings.
     * </p>
     */
    private TensorBoardAppSettings tensorBoardAppSettings;

    /**
     * <p>
     * The execution role for the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+$<br/>
     *
     * @return <p>
     *         The execution role for the user.
     *         </p>
     */
    public String getExecutionRole() {
        return executionRole;
    }

    /**
     * <p>
     * The execution role for the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+$<br/>
     *
     * @param executionRole <p>
     *            The execution role for the user.
     *            </p>
     */
    public void setExecutionRole(String executionRole) {
        this.executionRole = executionRole;
    }

    /**
     * <p>
     * The execution role for the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+$<br/>
     *
     * @param executionRole <p>
     *            The execution role for the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserSettings withExecutionRole(String executionRole) {
        this.executionRole = executionRole;
        return this;
    }

    /**
     * <p>
     * The security groups.
     * </p>
     *
     * @return <p>
     *         The security groups.
     *         </p>
     */
    public java.util.List<String> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * <p>
     * The security groups.
     * </p>
     *
     * @param securityGroups <p>
     *            The security groups.
     *            </p>
     */
    public void setSecurityGroups(java.util.Collection<String> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }

        this.securityGroups = new java.util.ArrayList<String>(securityGroups);
    }

    /**
     * <p>
     * The security groups.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroups <p>
     *            The security groups.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserSettings withSecurityGroups(String... securityGroups) {
        if (getSecurityGroups() == null) {
            this.securityGroups = new java.util.ArrayList<String>(securityGroups.length);
        }
        for (String value : securityGroups) {
            this.securityGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The security groups.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroups <p>
     *            The security groups.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserSettings withSecurityGroups(java.util.Collection<String> securityGroups) {
        setSecurityGroups(securityGroups);
        return this;
    }

    /**
     * <p>
     * The sharing settings.
     * </p>
     *
     * @return <p>
     *         The sharing settings.
     *         </p>
     */
    public SharingSettings getSharingSettings() {
        return sharingSettings;
    }

    /**
     * <p>
     * The sharing settings.
     * </p>
     *
     * @param sharingSettings <p>
     *            The sharing settings.
     *            </p>
     */
    public void setSharingSettings(SharingSettings sharingSettings) {
        this.sharingSettings = sharingSettings;
    }

    /**
     * <p>
     * The sharing settings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sharingSettings <p>
     *            The sharing settings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserSettings withSharingSettings(SharingSettings sharingSettings) {
        this.sharingSettings = sharingSettings;
        return this;
    }

    /**
     * <p>
     * The Jupyter server's app settings.
     * </p>
     *
     * @return <p>
     *         The Jupyter server's app settings.
     *         </p>
     */
    public JupyterServerAppSettings getJupyterServerAppSettings() {
        return jupyterServerAppSettings;
    }

    /**
     * <p>
     * The Jupyter server's app settings.
     * </p>
     *
     * @param jupyterServerAppSettings <p>
     *            The Jupyter server's app settings.
     *            </p>
     */
    public void setJupyterServerAppSettings(JupyterServerAppSettings jupyterServerAppSettings) {
        this.jupyterServerAppSettings = jupyterServerAppSettings;
    }

    /**
     * <p>
     * The Jupyter server's app settings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jupyterServerAppSettings <p>
     *            The Jupyter server's app settings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserSettings withJupyterServerAppSettings(
            JupyterServerAppSettings jupyterServerAppSettings) {
        this.jupyterServerAppSettings = jupyterServerAppSettings;
        return this;
    }

    /**
     * <p>
     * The kernel gateway app settings.
     * </p>
     *
     * @return <p>
     *         The kernel gateway app settings.
     *         </p>
     */
    public KernelGatewayAppSettings getKernelGatewayAppSettings() {
        return kernelGatewayAppSettings;
    }

    /**
     * <p>
     * The kernel gateway app settings.
     * </p>
     *
     * @param kernelGatewayAppSettings <p>
     *            The kernel gateway app settings.
     *            </p>
     */
    public void setKernelGatewayAppSettings(KernelGatewayAppSettings kernelGatewayAppSettings) {
        this.kernelGatewayAppSettings = kernelGatewayAppSettings;
    }

    /**
     * <p>
     * The kernel gateway app settings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kernelGatewayAppSettings <p>
     *            The kernel gateway app settings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserSettings withKernelGatewayAppSettings(
            KernelGatewayAppSettings kernelGatewayAppSettings) {
        this.kernelGatewayAppSettings = kernelGatewayAppSettings;
        return this;
    }

    /**
     * <p>
     * The TensorBoard app settings.
     * </p>
     *
     * @return <p>
     *         The TensorBoard app settings.
     *         </p>
     */
    public TensorBoardAppSettings getTensorBoardAppSettings() {
        return tensorBoardAppSettings;
    }

    /**
     * <p>
     * The TensorBoard app settings.
     * </p>
     *
     * @param tensorBoardAppSettings <p>
     *            The TensorBoard app settings.
     *            </p>
     */
    public void setTensorBoardAppSettings(TensorBoardAppSettings tensorBoardAppSettings) {
        this.tensorBoardAppSettings = tensorBoardAppSettings;
    }

    /**
     * <p>
     * The TensorBoard app settings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tensorBoardAppSettings <p>
     *            The TensorBoard app settings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserSettings withTensorBoardAppSettings(TensorBoardAppSettings tensorBoardAppSettings) {
        this.tensorBoardAppSettings = tensorBoardAppSettings;
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
        if (getExecutionRole() != null)
            sb.append("ExecutionRole: " + getExecutionRole() + ",");
        if (getSecurityGroups() != null)
            sb.append("SecurityGroups: " + getSecurityGroups() + ",");
        if (getSharingSettings() != null)
            sb.append("SharingSettings: " + getSharingSettings() + ",");
        if (getJupyterServerAppSettings() != null)
            sb.append("JupyterServerAppSettings: " + getJupyterServerAppSettings() + ",");
        if (getKernelGatewayAppSettings() != null)
            sb.append("KernelGatewayAppSettings: " + getKernelGatewayAppSettings() + ",");
        if (getTensorBoardAppSettings() != null)
            sb.append("TensorBoardAppSettings: " + getTensorBoardAppSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getExecutionRole() == null) ? 0 : getExecutionRole().hashCode());
        hashCode = prime * hashCode
                + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode());
        hashCode = prime * hashCode
                + ((getSharingSettings() == null) ? 0 : getSharingSettings().hashCode());
        hashCode = prime
                * hashCode
                + ((getJupyterServerAppSettings() == null) ? 0 : getJupyterServerAppSettings()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getKernelGatewayAppSettings() == null) ? 0 : getKernelGatewayAppSettings()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getTensorBoardAppSettings() == null) ? 0 : getTensorBoardAppSettings()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserSettings == false)
            return false;
        UserSettings other = (UserSettings) obj;

        if (other.getExecutionRole() == null ^ this.getExecutionRole() == null)
            return false;
        if (other.getExecutionRole() != null
                && other.getExecutionRole().equals(this.getExecutionRole()) == false)
            return false;
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null)
            return false;
        if (other.getSecurityGroups() != null
                && other.getSecurityGroups().equals(this.getSecurityGroups()) == false)
            return false;
        if (other.getSharingSettings() == null ^ this.getSharingSettings() == null)
            return false;
        if (other.getSharingSettings() != null
                && other.getSharingSettings().equals(this.getSharingSettings()) == false)
            return false;
        if (other.getJupyterServerAppSettings() == null
                ^ this.getJupyterServerAppSettings() == null)
            return false;
        if (other.getJupyterServerAppSettings() != null
                && other.getJupyterServerAppSettings().equals(this.getJupyterServerAppSettings()) == false)
            return false;
        if (other.getKernelGatewayAppSettings() == null
                ^ this.getKernelGatewayAppSettings() == null)
            return false;
        if (other.getKernelGatewayAppSettings() != null
                && other.getKernelGatewayAppSettings().equals(this.getKernelGatewayAppSettings()) == false)
            return false;
        if (other.getTensorBoardAppSettings() == null ^ this.getTensorBoardAppSettings() == null)
            return false;
        if (other.getTensorBoardAppSettings() != null
                && other.getTensorBoardAppSettings().equals(this.getTensorBoardAppSettings()) == false)
            return false;
        return true;
    }
}
