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

package com.amazonaws.services.translate.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a parallel data resource in Amazon Translate by importing an input
 * file from Amazon S3. Parallel data files contain examples that show how you
 * want segments of text to be translated. By adding parallel data, you can
 * influence the style, tone, and word choice in your translation output.
 * </p>
 */
public class CreateParallelDataRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A custom name for the parallel data resource in Amazon Translate. You
     * must assign a name that is unique in the account and region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([A-Za-z0-9-]_?)+$<br/>
     */
    private String name;

    /**
     * <p>
     * A custom description for the parallel data resource in Amazon Translate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>[\P{M}\p{M}]{0,256}<br/>
     */
    private String description;

    /**
     * <p>
     * Specifies the format and S3 location of the parallel data input file.
     * </p>
     */
    private ParallelDataConfig parallelDataConfig;

    /**
     * <p>
     * The encryption key used to encrypt this object.
     * </p>
     */
    private EncryptionKey encryptionKey;

    /**
     * <p>
     * A unique identifier for the request. This token is automatically
     * generated when you use Amazon Translate through an AWS SDK.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-]+$<br/>
     */
    private String clientToken;

    /**
     * <p>
     * A custom name for the parallel data resource in Amazon Translate. You
     * must assign a name that is unique in the account and region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([A-Za-z0-9-]_?)+$<br/>
     *
     * @return <p>
     *         A custom name for the parallel data resource in Amazon Translate.
     *         You must assign a name that is unique in the account and region.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * A custom name for the parallel data resource in Amazon Translate. You
     * must assign a name that is unique in the account and region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([A-Za-z0-9-]_?)+$<br/>
     *
     * @param name <p>
     *            A custom name for the parallel data resource in Amazon
     *            Translate. You must assign a name that is unique in the
     *            account and region.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A custom name for the parallel data resource in Amazon Translate. You
     * must assign a name that is unique in the account and region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([A-Za-z0-9-]_?)+$<br/>
     *
     * @param name <p>
     *            A custom name for the parallel data resource in Amazon
     *            Translate. You must assign a name that is unique in the
     *            account and region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateParallelDataRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * A custom description for the parallel data resource in Amazon Translate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>[\P{M}\p{M}]{0,256}<br/>
     *
     * @return <p>
     *         A custom description for the parallel data resource in Amazon
     *         Translate.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A custom description for the parallel data resource in Amazon Translate.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>[\P{M}\p{M}]{0,256}<br/>
     *
     * @param description <p>
     *            A custom description for the parallel data resource in Amazon
     *            Translate.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A custom description for the parallel data resource in Amazon Translate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>[\P{M}\p{M}]{0,256}<br/>
     *
     * @param description <p>
     *            A custom description for the parallel data resource in Amazon
     *            Translate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateParallelDataRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Specifies the format and S3 location of the parallel data input file.
     * </p>
     *
     * @return <p>
     *         Specifies the format and S3 location of the parallel data input
     *         file.
     *         </p>
     */
    public ParallelDataConfig getParallelDataConfig() {
        return parallelDataConfig;
    }

    /**
     * <p>
     * Specifies the format and S3 location of the parallel data input file.
     * </p>
     *
     * @param parallelDataConfig <p>
     *            Specifies the format and S3 location of the parallel data
     *            input file.
     *            </p>
     */
    public void setParallelDataConfig(ParallelDataConfig parallelDataConfig) {
        this.parallelDataConfig = parallelDataConfig;
    }

    /**
     * <p>
     * Specifies the format and S3 location of the parallel data input file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parallelDataConfig <p>
     *            Specifies the format and S3 location of the parallel data
     *            input file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateParallelDataRequest withParallelDataConfig(ParallelDataConfig parallelDataConfig) {
        this.parallelDataConfig = parallelDataConfig;
        return this;
    }

    /**
     * <p>
     * The encryption key used to encrypt this object.
     * </p>
     *
     * @return <p>
     *         The encryption key used to encrypt this object.
     *         </p>
     */
    public EncryptionKey getEncryptionKey() {
        return encryptionKey;
    }

    /**
     * <p>
     * The encryption key used to encrypt this object.
     * </p>
     *
     * @param encryptionKey <p>
     *            The encryption key used to encrypt this object.
     *            </p>
     */
    public void setEncryptionKey(EncryptionKey encryptionKey) {
        this.encryptionKey = encryptionKey;
    }

    /**
     * <p>
     * The encryption key used to encrypt this object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encryptionKey <p>
     *            The encryption key used to encrypt this object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateParallelDataRequest withEncryptionKey(EncryptionKey encryptionKey) {
        this.encryptionKey = encryptionKey;
        return this;
    }

    /**
     * <p>
     * A unique identifier for the request. This token is automatically
     * generated when you use Amazon Translate through an AWS SDK.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-]+$<br/>
     *
     * @return <p>
     *         A unique identifier for the request. This token is automatically
     *         generated when you use Amazon Translate through an AWS SDK.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * A unique identifier for the request. This token is automatically
     * generated when you use Amazon Translate through an AWS SDK.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-]+$<br/>
     *
     * @param clientToken <p>
     *            A unique identifier for the request. This token is
     *            automatically generated when you use Amazon Translate through
     *            an AWS SDK.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique identifier for the request. This token is automatically
     * generated when you use Amazon Translate through an AWS SDK.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9-]+$<br/>
     *
     * @param clientToken <p>
     *            A unique identifier for the request. This token is
     *            automatically generated when you use Amazon Translate through
     *            an AWS SDK.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateParallelDataRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getParallelDataConfig() != null)
            sb.append("ParallelDataConfig: " + getParallelDataConfig() + ",");
        if (getEncryptionKey() != null)
            sb.append("EncryptionKey: " + getEncryptionKey() + ",");
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getParallelDataConfig() == null) ? 0 : getParallelDataConfig().hashCode());
        hashCode = prime * hashCode
                + ((getEncryptionKey() == null) ? 0 : getEncryptionKey().hashCode());
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateParallelDataRequest == false)
            return false;
        CreateParallelDataRequest other = (CreateParallelDataRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getParallelDataConfig() == null ^ this.getParallelDataConfig() == null)
            return false;
        if (other.getParallelDataConfig() != null
                && other.getParallelDataConfig().equals(this.getParallelDataConfig()) == false)
            return false;
        if (other.getEncryptionKey() == null ^ this.getEncryptionKey() == null)
            return false;
        if (other.getEncryptionKey() != null
                && other.getEncryptionKey().equals(this.getEncryptionKey()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }
}
