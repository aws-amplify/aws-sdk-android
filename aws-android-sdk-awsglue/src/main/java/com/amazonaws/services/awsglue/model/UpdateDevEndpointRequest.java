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

package com.amazonaws.services.awsglue.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates a specified development endpoint.
 * </p>
 */
public class UpdateDevEndpointRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the <code>DevEndpoint</code> to be updated.
     * </p>
     */
    private String endpointName;

    /**
     * <p>
     * The public key for the <code>DevEndpoint</code> to use.
     * </p>
     */
    private String publicKey;

    /**
     * <p>
     * The list of public keys for the <code>DevEndpoint</code> to use.
     * </p>
     */
    private java.util.List<String> addPublicKeys;

    /**
     * <p>
     * The list of public keys to be deleted from the <code>DevEndpoint</code>.
     * </p>
     */
    private java.util.List<String> deletePublicKeys;

    /**
     * <p>
     * Custom Python or Java libraries to be loaded in the
     * <code>DevEndpoint</code>.
     * </p>
     */
    private DevEndpointCustomLibraries customLibraries;

    /**
     * <p>
     * <code>True</code> if the list of custom libraries to be loaded in the
     * development endpoint needs to be updated, or <code>False</code> if
     * otherwise.
     * </p>
     */
    private Boolean updateEtlLibraries;

    /**
     * <p>
     * The list of argument keys to be deleted from the map of arguments used to
     * configure the <code>DevEndpoint</code>.
     * </p>
     */
    private java.util.List<String> deleteArguments;

    /**
     * <p>
     * The map of arguments to add the map of arguments used to configure the
     * <code>DevEndpoint</code>.
     * </p>
     * <p>
     * Valid arguments are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"--enable-glue-datacatalog": ""</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"GLUE_PYTHON_VERSION": "3"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"GLUE_PYTHON_VERSION": "2"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can specify a version of Python support for development endpoints by
     * using the <code>Arguments</code> parameter in the
     * <code>CreateDevEndpoint</code> or <code>UpdateDevEndpoint</code> APIs. If
     * no arguments are provided, the version defaults to Python 2.
     * </p>
     */
    private java.util.Map<String, String> addArguments;

    /**
     * <p>
     * The name of the <code>DevEndpoint</code> to be updated.
     * </p>
     *
     * @return <p>
     *         The name of the <code>DevEndpoint</code> to be updated.
     *         </p>
     */
    public String getEndpointName() {
        return endpointName;
    }

    /**
     * <p>
     * The name of the <code>DevEndpoint</code> to be updated.
     * </p>
     *
     * @param endpointName <p>
     *            The name of the <code>DevEndpoint</code> to be updated.
     *            </p>
     */
    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    /**
     * <p>
     * The name of the <code>DevEndpoint</code> to be updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endpointName <p>
     *            The name of the <code>DevEndpoint</code> to be updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDevEndpointRequest withEndpointName(String endpointName) {
        this.endpointName = endpointName;
        return this;
    }

    /**
     * <p>
     * The public key for the <code>DevEndpoint</code> to use.
     * </p>
     *
     * @return <p>
     *         The public key for the <code>DevEndpoint</code> to use.
     *         </p>
     */
    public String getPublicKey() {
        return publicKey;
    }

    /**
     * <p>
     * The public key for the <code>DevEndpoint</code> to use.
     * </p>
     *
     * @param publicKey <p>
     *            The public key for the <code>DevEndpoint</code> to use.
     *            </p>
     */
    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    /**
     * <p>
     * The public key for the <code>DevEndpoint</code> to use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param publicKey <p>
     *            The public key for the <code>DevEndpoint</code> to use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDevEndpointRequest withPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }

    /**
     * <p>
     * The list of public keys for the <code>DevEndpoint</code> to use.
     * </p>
     *
     * @return <p>
     *         The list of public keys for the <code>DevEndpoint</code> to use.
     *         </p>
     */
    public java.util.List<String> getAddPublicKeys() {
        return addPublicKeys;
    }

    /**
     * <p>
     * The list of public keys for the <code>DevEndpoint</code> to use.
     * </p>
     *
     * @param addPublicKeys <p>
     *            The list of public keys for the <code>DevEndpoint</code> to
     *            use.
     *            </p>
     */
    public void setAddPublicKeys(java.util.Collection<String> addPublicKeys) {
        if (addPublicKeys == null) {
            this.addPublicKeys = null;
            return;
        }

        this.addPublicKeys = new java.util.ArrayList<String>(addPublicKeys);
    }

    /**
     * <p>
     * The list of public keys for the <code>DevEndpoint</code> to use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param addPublicKeys <p>
     *            The list of public keys for the <code>DevEndpoint</code> to
     *            use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDevEndpointRequest withAddPublicKeys(String... addPublicKeys) {
        if (getAddPublicKeys() == null) {
            this.addPublicKeys = new java.util.ArrayList<String>(addPublicKeys.length);
        }
        for (String value : addPublicKeys) {
            this.addPublicKeys.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of public keys for the <code>DevEndpoint</code> to use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param addPublicKeys <p>
     *            The list of public keys for the <code>DevEndpoint</code> to
     *            use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDevEndpointRequest withAddPublicKeys(java.util.Collection<String> addPublicKeys) {
        setAddPublicKeys(addPublicKeys);
        return this;
    }

    /**
     * <p>
     * The list of public keys to be deleted from the <code>DevEndpoint</code>.
     * </p>
     *
     * @return <p>
     *         The list of public keys to be deleted from the
     *         <code>DevEndpoint</code>.
     *         </p>
     */
    public java.util.List<String> getDeletePublicKeys() {
        return deletePublicKeys;
    }

    /**
     * <p>
     * The list of public keys to be deleted from the <code>DevEndpoint</code>.
     * </p>
     *
     * @param deletePublicKeys <p>
     *            The list of public keys to be deleted from the
     *            <code>DevEndpoint</code>.
     *            </p>
     */
    public void setDeletePublicKeys(java.util.Collection<String> deletePublicKeys) {
        if (deletePublicKeys == null) {
            this.deletePublicKeys = null;
            return;
        }

        this.deletePublicKeys = new java.util.ArrayList<String>(deletePublicKeys);
    }

    /**
     * <p>
     * The list of public keys to be deleted from the <code>DevEndpoint</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deletePublicKeys <p>
     *            The list of public keys to be deleted from the
     *            <code>DevEndpoint</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDevEndpointRequest withDeletePublicKeys(String... deletePublicKeys) {
        if (getDeletePublicKeys() == null) {
            this.deletePublicKeys = new java.util.ArrayList<String>(deletePublicKeys.length);
        }
        for (String value : deletePublicKeys) {
            this.deletePublicKeys.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of public keys to be deleted from the <code>DevEndpoint</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deletePublicKeys <p>
     *            The list of public keys to be deleted from the
     *            <code>DevEndpoint</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDevEndpointRequest withDeletePublicKeys(
            java.util.Collection<String> deletePublicKeys) {
        setDeletePublicKeys(deletePublicKeys);
        return this;
    }

    /**
     * <p>
     * Custom Python or Java libraries to be loaded in the
     * <code>DevEndpoint</code>.
     * </p>
     *
     * @return <p>
     *         Custom Python or Java libraries to be loaded in the
     *         <code>DevEndpoint</code>.
     *         </p>
     */
    public DevEndpointCustomLibraries getCustomLibraries() {
        return customLibraries;
    }

    /**
     * <p>
     * Custom Python or Java libraries to be loaded in the
     * <code>DevEndpoint</code>.
     * </p>
     *
     * @param customLibraries <p>
     *            Custom Python or Java libraries to be loaded in the
     *            <code>DevEndpoint</code>.
     *            </p>
     */
    public void setCustomLibraries(DevEndpointCustomLibraries customLibraries) {
        this.customLibraries = customLibraries;
    }

    /**
     * <p>
     * Custom Python or Java libraries to be loaded in the
     * <code>DevEndpoint</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customLibraries <p>
     *            Custom Python or Java libraries to be loaded in the
     *            <code>DevEndpoint</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDevEndpointRequest withCustomLibraries(DevEndpointCustomLibraries customLibraries) {
        this.customLibraries = customLibraries;
        return this;
    }

    /**
     * <p>
     * <code>True</code> if the list of custom libraries to be loaded in the
     * development endpoint needs to be updated, or <code>False</code> if
     * otherwise.
     * </p>
     *
     * @return <p>
     *         <code>True</code> if the list of custom libraries to be loaded in
     *         the development endpoint needs to be updated, or
     *         <code>False</code> if otherwise.
     *         </p>
     */
    public Boolean isUpdateEtlLibraries() {
        return updateEtlLibraries;
    }

    /**
     * <p>
     * <code>True</code> if the list of custom libraries to be loaded in the
     * development endpoint needs to be updated, or <code>False</code> if
     * otherwise.
     * </p>
     *
     * @return <p>
     *         <code>True</code> if the list of custom libraries to be loaded in
     *         the development endpoint needs to be updated, or
     *         <code>False</code> if otherwise.
     *         </p>
     */
    public Boolean getUpdateEtlLibraries() {
        return updateEtlLibraries;
    }

    /**
     * <p>
     * <code>True</code> if the list of custom libraries to be loaded in the
     * development endpoint needs to be updated, or <code>False</code> if
     * otherwise.
     * </p>
     *
     * @param updateEtlLibraries <p>
     *            <code>True</code> if the list of custom libraries to be loaded
     *            in the development endpoint needs to be updated, or
     *            <code>False</code> if otherwise.
     *            </p>
     */
    public void setUpdateEtlLibraries(Boolean updateEtlLibraries) {
        this.updateEtlLibraries = updateEtlLibraries;
    }

    /**
     * <p>
     * <code>True</code> if the list of custom libraries to be loaded in the
     * development endpoint needs to be updated, or <code>False</code> if
     * otherwise.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updateEtlLibraries <p>
     *            <code>True</code> if the list of custom libraries to be loaded
     *            in the development endpoint needs to be updated, or
     *            <code>False</code> if otherwise.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDevEndpointRequest withUpdateEtlLibraries(Boolean updateEtlLibraries) {
        this.updateEtlLibraries = updateEtlLibraries;
        return this;
    }

    /**
     * <p>
     * The list of argument keys to be deleted from the map of arguments used to
     * configure the <code>DevEndpoint</code>.
     * </p>
     *
     * @return <p>
     *         The list of argument keys to be deleted from the map of arguments
     *         used to configure the <code>DevEndpoint</code>.
     *         </p>
     */
    public java.util.List<String> getDeleteArguments() {
        return deleteArguments;
    }

    /**
     * <p>
     * The list of argument keys to be deleted from the map of arguments used to
     * configure the <code>DevEndpoint</code>.
     * </p>
     *
     * @param deleteArguments <p>
     *            The list of argument keys to be deleted from the map of
     *            arguments used to configure the <code>DevEndpoint</code>.
     *            </p>
     */
    public void setDeleteArguments(java.util.Collection<String> deleteArguments) {
        if (deleteArguments == null) {
            this.deleteArguments = null;
            return;
        }

        this.deleteArguments = new java.util.ArrayList<String>(deleteArguments);
    }

    /**
     * <p>
     * The list of argument keys to be deleted from the map of arguments used to
     * configure the <code>DevEndpoint</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deleteArguments <p>
     *            The list of argument keys to be deleted from the map of
     *            arguments used to configure the <code>DevEndpoint</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDevEndpointRequest withDeleteArguments(String... deleteArguments) {
        if (getDeleteArguments() == null) {
            this.deleteArguments = new java.util.ArrayList<String>(deleteArguments.length);
        }
        for (String value : deleteArguments) {
            this.deleteArguments.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of argument keys to be deleted from the map of arguments used to
     * configure the <code>DevEndpoint</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deleteArguments <p>
     *            The list of argument keys to be deleted from the map of
     *            arguments used to configure the <code>DevEndpoint</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDevEndpointRequest withDeleteArguments(java.util.Collection<String> deleteArguments) {
        setDeleteArguments(deleteArguments);
        return this;
    }

    /**
     * <p>
     * The map of arguments to add the map of arguments used to configure the
     * <code>DevEndpoint</code>.
     * </p>
     * <p>
     * Valid arguments are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"--enable-glue-datacatalog": ""</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"GLUE_PYTHON_VERSION": "3"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"GLUE_PYTHON_VERSION": "2"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can specify a version of Python support for development endpoints by
     * using the <code>Arguments</code> parameter in the
     * <code>CreateDevEndpoint</code> or <code>UpdateDevEndpoint</code> APIs. If
     * no arguments are provided, the version defaults to Python 2.
     * </p>
     *
     * @return <p>
     *         The map of arguments to add the map of arguments used to
     *         configure the <code>DevEndpoint</code>.
     *         </p>
     *         <p>
     *         Valid arguments are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>"--enable-glue-datacatalog": ""</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"GLUE_PYTHON_VERSION": "3"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"GLUE_PYTHON_VERSION": "2"</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         You can specify a version of Python support for development
     *         endpoints by using the <code>Arguments</code> parameter in the
     *         <code>CreateDevEndpoint</code> or <code>UpdateDevEndpoint</code>
     *         APIs. If no arguments are provided, the version defaults to
     *         Python 2.
     *         </p>
     */
    public java.util.Map<String, String> getAddArguments() {
        return addArguments;
    }

    /**
     * <p>
     * The map of arguments to add the map of arguments used to configure the
     * <code>DevEndpoint</code>.
     * </p>
     * <p>
     * Valid arguments are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"--enable-glue-datacatalog": ""</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"GLUE_PYTHON_VERSION": "3"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"GLUE_PYTHON_VERSION": "2"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can specify a version of Python support for development endpoints by
     * using the <code>Arguments</code> parameter in the
     * <code>CreateDevEndpoint</code> or <code>UpdateDevEndpoint</code> APIs. If
     * no arguments are provided, the version defaults to Python 2.
     * </p>
     *
     * @param addArguments <p>
     *            The map of arguments to add the map of arguments used to
     *            configure the <code>DevEndpoint</code>.
     *            </p>
     *            <p>
     *            Valid arguments are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>"--enable-glue-datacatalog": ""</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>"GLUE_PYTHON_VERSION": "3"</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>"GLUE_PYTHON_VERSION": "2"</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            You can specify a version of Python support for development
     *            endpoints by using the <code>Arguments</code> parameter in the
     *            <code>CreateDevEndpoint</code> or
     *            <code>UpdateDevEndpoint</code> APIs. If no arguments are
     *            provided, the version defaults to Python 2.
     *            </p>
     */
    public void setAddArguments(java.util.Map<String, String> addArguments) {
        this.addArguments = addArguments;
    }

    /**
     * <p>
     * The map of arguments to add the map of arguments used to configure the
     * <code>DevEndpoint</code>.
     * </p>
     * <p>
     * Valid arguments are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"--enable-glue-datacatalog": ""</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"GLUE_PYTHON_VERSION": "3"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"GLUE_PYTHON_VERSION": "2"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can specify a version of Python support for development endpoints by
     * using the <code>Arguments</code> parameter in the
     * <code>CreateDevEndpoint</code> or <code>UpdateDevEndpoint</code> APIs. If
     * no arguments are provided, the version defaults to Python 2.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param addArguments <p>
     *            The map of arguments to add the map of arguments used to
     *            configure the <code>DevEndpoint</code>.
     *            </p>
     *            <p>
     *            Valid arguments are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>"--enable-glue-datacatalog": ""</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>"GLUE_PYTHON_VERSION": "3"</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>"GLUE_PYTHON_VERSION": "2"</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            You can specify a version of Python support for development
     *            endpoints by using the <code>Arguments</code> parameter in the
     *            <code>CreateDevEndpoint</code> or
     *            <code>UpdateDevEndpoint</code> APIs. If no arguments are
     *            provided, the version defaults to Python 2.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDevEndpointRequest withAddArguments(java.util.Map<String, String> addArguments) {
        this.addArguments = addArguments;
        return this;
    }

    /**
     * <p>
     * The map of arguments to add the map of arguments used to configure the
     * <code>DevEndpoint</code>.
     * </p>
     * <p>
     * Valid arguments are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"--enable-glue-datacatalog": ""</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"GLUE_PYTHON_VERSION": "3"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"GLUE_PYTHON_VERSION": "2"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can specify a version of Python support for development endpoints by
     * using the <code>Arguments</code> parameter in the
     * <code>CreateDevEndpoint</code> or <code>UpdateDevEndpoint</code> APIs. If
     * no arguments are provided, the version defaults to Python 2.
     * </p>
     * <p>
     * The method adds a new key-value pair into AddArguments parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into AddArguments.
     * @param value The corresponding value of the entry to be added into
     *            AddArguments.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDevEndpointRequest addAddArgumentsEntry(String key, String value) {
        if (null == this.addArguments) {
            this.addArguments = new java.util.HashMap<String, String>();
        }
        if (this.addArguments.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.addArguments.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AddArguments.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public UpdateDevEndpointRequest clearAddArgumentsEntries() {
        this.addArguments = null;
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
        if (getEndpointName() != null)
            sb.append("EndpointName: " + getEndpointName() + ",");
        if (getPublicKey() != null)
            sb.append("PublicKey: " + getPublicKey() + ",");
        if (getAddPublicKeys() != null)
            sb.append("AddPublicKeys: " + getAddPublicKeys() + ",");
        if (getDeletePublicKeys() != null)
            sb.append("DeletePublicKeys: " + getDeletePublicKeys() + ",");
        if (getCustomLibraries() != null)
            sb.append("CustomLibraries: " + getCustomLibraries() + ",");
        if (getUpdateEtlLibraries() != null)
            sb.append("UpdateEtlLibraries: " + getUpdateEtlLibraries() + ",");
        if (getDeleteArguments() != null)
            sb.append("DeleteArguments: " + getDeleteArguments() + ",");
        if (getAddArguments() != null)
            sb.append("AddArguments: " + getAddArguments());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEndpointName() == null) ? 0 : getEndpointName().hashCode());
        hashCode = prime * hashCode + ((getPublicKey() == null) ? 0 : getPublicKey().hashCode());
        hashCode = prime * hashCode
                + ((getAddPublicKeys() == null) ? 0 : getAddPublicKeys().hashCode());
        hashCode = prime * hashCode
                + ((getDeletePublicKeys() == null) ? 0 : getDeletePublicKeys().hashCode());
        hashCode = prime * hashCode
                + ((getCustomLibraries() == null) ? 0 : getCustomLibraries().hashCode());
        hashCode = prime * hashCode
                + ((getUpdateEtlLibraries() == null) ? 0 : getUpdateEtlLibraries().hashCode());
        hashCode = prime * hashCode
                + ((getDeleteArguments() == null) ? 0 : getDeleteArguments().hashCode());
        hashCode = prime * hashCode
                + ((getAddArguments() == null) ? 0 : getAddArguments().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDevEndpointRequest == false)
            return false;
        UpdateDevEndpointRequest other = (UpdateDevEndpointRequest) obj;

        if (other.getEndpointName() == null ^ this.getEndpointName() == null)
            return false;
        if (other.getEndpointName() != null
                && other.getEndpointName().equals(this.getEndpointName()) == false)
            return false;
        if (other.getPublicKey() == null ^ this.getPublicKey() == null)
            return false;
        if (other.getPublicKey() != null
                && other.getPublicKey().equals(this.getPublicKey()) == false)
            return false;
        if (other.getAddPublicKeys() == null ^ this.getAddPublicKeys() == null)
            return false;
        if (other.getAddPublicKeys() != null
                && other.getAddPublicKeys().equals(this.getAddPublicKeys()) == false)
            return false;
        if (other.getDeletePublicKeys() == null ^ this.getDeletePublicKeys() == null)
            return false;
        if (other.getDeletePublicKeys() != null
                && other.getDeletePublicKeys().equals(this.getDeletePublicKeys()) == false)
            return false;
        if (other.getCustomLibraries() == null ^ this.getCustomLibraries() == null)
            return false;
        if (other.getCustomLibraries() != null
                && other.getCustomLibraries().equals(this.getCustomLibraries()) == false)
            return false;
        if (other.getUpdateEtlLibraries() == null ^ this.getUpdateEtlLibraries() == null)
            return false;
        if (other.getUpdateEtlLibraries() != null
                && other.getUpdateEtlLibraries().equals(this.getUpdateEtlLibraries()) == false)
            return false;
        if (other.getDeleteArguments() == null ^ this.getDeleteArguments() == null)
            return false;
        if (other.getDeleteArguments() != null
                && other.getDeleteArguments().equals(this.getDeleteArguments()) == false)
            return false;
        if (other.getAddArguments() == null ^ this.getAddArguments() == null)
            return false;
        if (other.getAddArguments() != null
                && other.getAddArguments().equals(this.getAddArguments()) == false)
            return false;
        return true;
    }
}
