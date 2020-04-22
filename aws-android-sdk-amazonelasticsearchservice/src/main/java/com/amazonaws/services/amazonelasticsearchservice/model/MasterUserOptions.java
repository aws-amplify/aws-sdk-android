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

package com.amazonaws.services.amazonelasticsearchservice.model;

import java.io.Serializable;

/**
 * <p>
 * Credentials for the master user: username and password, ARN, or both.
 * </p>
 */
public class MasterUserOptions implements Serializable {
    /**
     * <p>
     * ARN for the master user (if IAM is enabled).
     * </p>
     */
    private String masterUserARN;

    /**
     * <p>
     * The master user's username, which is stored in the Amazon Elasticsearch
     * Service domain's internal database.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String masterUserName;

    /**
     * <p>
     * The master user's password, which is stored in the Amazon Elasticsearch
     * Service domain's internal database.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>8 - <br/>
     */
    private String masterUserPassword;

    /**
     * <p>
     * ARN for the master user (if IAM is enabled).
     * </p>
     *
     * @return <p>
     *         ARN for the master user (if IAM is enabled).
     *         </p>
     */
    public String getMasterUserARN() {
        return masterUserARN;
    }

    /**
     * <p>
     * ARN for the master user (if IAM is enabled).
     * </p>
     *
     * @param masterUserARN <p>
     *            ARN for the master user (if IAM is enabled).
     *            </p>
     */
    public void setMasterUserARN(String masterUserARN) {
        this.masterUserARN = masterUserARN;
    }

    /**
     * <p>
     * ARN for the master user (if IAM is enabled).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param masterUserARN <p>
     *            ARN for the master user (if IAM is enabled).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MasterUserOptions withMasterUserARN(String masterUserARN) {
        this.masterUserARN = masterUserARN;
        return this;
    }

    /**
     * <p>
     * The master user's username, which is stored in the Amazon Elasticsearch
     * Service domain's internal database.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The master user's username, which is stored in the Amazon
     *         Elasticsearch Service domain's internal database.
     *         </p>
     */
    public String getMasterUserName() {
        return masterUserName;
    }

    /**
     * <p>
     * The master user's username, which is stored in the Amazon Elasticsearch
     * Service domain's internal database.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param masterUserName <p>
     *            The master user's username, which is stored in the Amazon
     *            Elasticsearch Service domain's internal database.
     *            </p>
     */
    public void setMasterUserName(String masterUserName) {
        this.masterUserName = masterUserName;
    }

    /**
     * <p>
     * The master user's username, which is stored in the Amazon Elasticsearch
     * Service domain's internal database.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param masterUserName <p>
     *            The master user's username, which is stored in the Amazon
     *            Elasticsearch Service domain's internal database.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MasterUserOptions withMasterUserName(String masterUserName) {
        this.masterUserName = masterUserName;
        return this;
    }

    /**
     * <p>
     * The master user's password, which is stored in the Amazon Elasticsearch
     * Service domain's internal database.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>8 - <br/>
     *
     * @return <p>
     *         The master user's password, which is stored in the Amazon
     *         Elasticsearch Service domain's internal database.
     *         </p>
     */
    public String getMasterUserPassword() {
        return masterUserPassword;
    }

    /**
     * <p>
     * The master user's password, which is stored in the Amazon Elasticsearch
     * Service domain's internal database.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>8 - <br/>
     *
     * @param masterUserPassword <p>
     *            The master user's password, which is stored in the Amazon
     *            Elasticsearch Service domain's internal database.
     *            </p>
     */
    public void setMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
    }

    /**
     * <p>
     * The master user's password, which is stored in the Amazon Elasticsearch
     * Service domain's internal database.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>8 - <br/>
     *
     * @param masterUserPassword <p>
     *            The master user's password, which is stored in the Amazon
     *            Elasticsearch Service domain's internal database.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MasterUserOptions withMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
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
        if (getMasterUserARN() != null)
            sb.append("MasterUserARN: " + getMasterUserARN() + ",");
        if (getMasterUserName() != null)
            sb.append("MasterUserName: " + getMasterUserName() + ",");
        if (getMasterUserPassword() != null)
            sb.append("MasterUserPassword: " + getMasterUserPassword());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMasterUserARN() == null) ? 0 : getMasterUserARN().hashCode());
        hashCode = prime * hashCode
                + ((getMasterUserName() == null) ? 0 : getMasterUserName().hashCode());
        hashCode = prime * hashCode
                + ((getMasterUserPassword() == null) ? 0 : getMasterUserPassword().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MasterUserOptions == false)
            return false;
        MasterUserOptions other = (MasterUserOptions) obj;

        if (other.getMasterUserARN() == null ^ this.getMasterUserARN() == null)
            return false;
        if (other.getMasterUserARN() != null
                && other.getMasterUserARN().equals(this.getMasterUserARN()) == false)
            return false;
        if (other.getMasterUserName() == null ^ this.getMasterUserName() == null)
            return false;
        if (other.getMasterUserName() != null
                && other.getMasterUserName().equals(this.getMasterUserName()) == false)
            return false;
        if (other.getMasterUserPassword() == null ^ this.getMasterUserPassword() == null)
            return false;
        if (other.getMasterUserPassword() != null
                && other.getMasterUserPassword().equals(this.getMasterUserPassword()) == false)
            return false;
        return true;
    }
}
