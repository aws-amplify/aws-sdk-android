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

package com.amazonaws.services.awsmigrationhub.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Provides identifying details of the resource being migrated so that it can be
 * associated in the Application Discovery Service repository. This association
 * occurs asynchronously after <code>PutResourceAttributes</code> returns.
 * </p>
 * <important>
 * <ul>
 * <li>
 * <p>
 * Keep in mind that subsequent calls to PutResourceAttributes will override
 * previously stored attributes. For example, if it is first called with a MAC
 * address, but later, it is desired to <i>add</i> an IP address, it will then
 * be required to call it with <i>both</i> the IP and MAC addresses to prevent
 * overriding the MAC address.
 * </p>
 * </li>
 * <li>
 * <p>
 * Note the instructions regarding the special use case of the <a href=
 * "https://docs.aws.amazon.com/migrationhub/latest/ug/API_PutResourceAttributes.html#migrationhub-PutResourceAttributes-request-ResourceAttributeList"
 * > <code>ResourceAttributeList</code> </a> parameter when specifying any "VM"
 * related value.
 * </p>
 * </li>
 * </ul>
 * </important> <note>
 * <p>
 * Because this is an asynchronous call, it will always return 200, whether an
 * association occurs or not. To confirm if an association was found based on
 * the provided details, call <code>ListDiscoveredResources</code>.
 * </p>
 * </note>
 */
public class PutResourceAttributesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the ProgressUpdateStream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[^/:|\000-\037]+<br/>
     */
    private String progressUpdateStream;

    /**
     * <p>
     * Unique identifier that references the migration task. <i>Do not store
     * personal data in this field.</i>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^:|]+<br/>
     */
    private String migrationTaskName;

    /**
     * <p>
     * Information about the resource that is being migrated. This data will be
     * used to map the task to a resource in the Application Discovery Service
     * repository.
     * </p>
     * <note>
     * <p>
     * Takes the object array of <code>ResourceAttribute</code> where the
     * <code>Type</code> field is reserved for the following values:
     * <code>IPV4_ADDRESS | IPV6_ADDRESS | MAC_ADDRESS | FQDN | VM_MANAGER_ID | VM_MANAGED_OBJECT_REFERENCE | VM_NAME | VM_PATH | BIOS_ID | MOTHERBOARD_SERIAL_NUMBER</code>
     * where the identifying value can be a string up to 256 characters.
     * </p>
     * </note> <important>
     * <ul>
     * <li>
     * <p>
     * If any "VM" related value is set for a <code>ResourceAttribute</code>
     * object, it is required that <code>VM_MANAGER_ID</code>, as a minimum, is
     * always set. If <code>VM_MANAGER_ID</code> is not set, then all "VM"
     * fields will be discarded and "VM" fields will not be used for matching
     * the migration task to a server in Application Discovery Service
     * repository. See the <a href=
     * "https://docs.aws.amazon.com/migrationhub/latest/ug/API_PutResourceAttributes.html#API_PutResourceAttributes_Examples"
     * >Example</a> section below for a use case of specifying "VM" related
     * values.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a server you are trying to match has multiple IP or MAC addresses, you
     * should provide as many as you know in separate type/value pairs passed to
     * the <code>ResourceAttributeList</code> parameter to maximize the chances
     * of matching.
     * </p>
     * </li>
     * </ul>
     * </important>
     */
    private java.util.List<ResourceAttribute> resourceAttributeList;

    /**
     * <p>
     * Optional boolean flag to indicate whether any effect should take place.
     * Used to test if the caller has permission to make the call.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * The name of the ProgressUpdateStream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[^/:|\000-\037]+<br/>
     *
     * @return <p>
     *         The name of the ProgressUpdateStream.
     *         </p>
     */
    public String getProgressUpdateStream() {
        return progressUpdateStream;
    }

    /**
     * <p>
     * The name of the ProgressUpdateStream.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[^/:|\000-\037]+<br/>
     *
     * @param progressUpdateStream <p>
     *            The name of the ProgressUpdateStream.
     *            </p>
     */
    public void setProgressUpdateStream(String progressUpdateStream) {
        this.progressUpdateStream = progressUpdateStream;
    }

    /**
     * <p>
     * The name of the ProgressUpdateStream.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[^/:|\000-\037]+<br/>
     *
     * @param progressUpdateStream <p>
     *            The name of the ProgressUpdateStream.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutResourceAttributesRequest withProgressUpdateStream(String progressUpdateStream) {
        this.progressUpdateStream = progressUpdateStream;
        return this;
    }

    /**
     * <p>
     * Unique identifier that references the migration task. <i>Do not store
     * personal data in this field.</i>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^:|]+<br/>
     *
     * @return <p>
     *         Unique identifier that references the migration task. <i>Do not
     *         store personal data in this field.</i>
     *         </p>
     */
    public String getMigrationTaskName() {
        return migrationTaskName;
    }

    /**
     * <p>
     * Unique identifier that references the migration task. <i>Do not store
     * personal data in this field.</i>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^:|]+<br/>
     *
     * @param migrationTaskName <p>
     *            Unique identifier that references the migration task. <i>Do
     *            not store personal data in this field.</i>
     *            </p>
     */
    public void setMigrationTaskName(String migrationTaskName) {
        this.migrationTaskName = migrationTaskName;
    }

    /**
     * <p>
     * Unique identifier that references the migration task. <i>Do not store
     * personal data in this field.</i>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[^:|]+<br/>
     *
     * @param migrationTaskName <p>
     *            Unique identifier that references the migration task. <i>Do
     *            not store personal data in this field.</i>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutResourceAttributesRequest withMigrationTaskName(String migrationTaskName) {
        this.migrationTaskName = migrationTaskName;
        return this;
    }

    /**
     * <p>
     * Information about the resource that is being migrated. This data will be
     * used to map the task to a resource in the Application Discovery Service
     * repository.
     * </p>
     * <note>
     * <p>
     * Takes the object array of <code>ResourceAttribute</code> where the
     * <code>Type</code> field is reserved for the following values:
     * <code>IPV4_ADDRESS | IPV6_ADDRESS | MAC_ADDRESS | FQDN | VM_MANAGER_ID | VM_MANAGED_OBJECT_REFERENCE | VM_NAME | VM_PATH | BIOS_ID | MOTHERBOARD_SERIAL_NUMBER</code>
     * where the identifying value can be a string up to 256 characters.
     * </p>
     * </note> <important>
     * <ul>
     * <li>
     * <p>
     * If any "VM" related value is set for a <code>ResourceAttribute</code>
     * object, it is required that <code>VM_MANAGER_ID</code>, as a minimum, is
     * always set. If <code>VM_MANAGER_ID</code> is not set, then all "VM"
     * fields will be discarded and "VM" fields will not be used for matching
     * the migration task to a server in Application Discovery Service
     * repository. See the <a href=
     * "https://docs.aws.amazon.com/migrationhub/latest/ug/API_PutResourceAttributes.html#API_PutResourceAttributes_Examples"
     * >Example</a> section below for a use case of specifying "VM" related
     * values.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a server you are trying to match has multiple IP or MAC addresses, you
     * should provide as many as you know in separate type/value pairs passed to
     * the <code>ResourceAttributeList</code> parameter to maximize the chances
     * of matching.
     * </p>
     * </li>
     * </ul>
     * </important>
     *
     * @return <p>
     *         Information about the resource that is being migrated. This data
     *         will be used to map the task to a resource in the Application
     *         Discovery Service repository.
     *         </p>
     *         <note>
     *         <p>
     *         Takes the object array of <code>ResourceAttribute</code> where
     *         the <code>Type</code> field is reserved for the following values:
     *         <code>IPV4_ADDRESS | IPV6_ADDRESS | MAC_ADDRESS | FQDN | VM_MANAGER_ID | VM_MANAGED_OBJECT_REFERENCE | VM_NAME | VM_PATH | BIOS_ID | MOTHERBOARD_SERIAL_NUMBER</code>
     *         where the identifying value can be a string up to 256 characters.
     *         </p>
     *         </note> <important>
     *         <ul>
     *         <li>
     *         <p>
     *         If any "VM" related value is set for a
     *         <code>ResourceAttribute</code> object, it is required that
     *         <code>VM_MANAGER_ID</code>, as a minimum, is always set. If
     *         <code>VM_MANAGER_ID</code> is not set, then all "VM" fields will
     *         be discarded and "VM" fields will not be used for matching the
     *         migration task to a server in Application Discovery Service
     *         repository. See the <a href=
     *         "https://docs.aws.amazon.com/migrationhub/latest/ug/API_PutResourceAttributes.html#API_PutResourceAttributes_Examples"
     *         >Example</a> section below for a use case of specifying "VM"
     *         related values.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If a server you are trying to match has multiple IP or MAC
     *         addresses, you should provide as many as you know in separate
     *         type/value pairs passed to the <code>ResourceAttributeList</code>
     *         parameter to maximize the chances of matching.
     *         </p>
     *         </li>
     *         </ul>
     *         </important>
     */
    public java.util.List<ResourceAttribute> getResourceAttributeList() {
        return resourceAttributeList;
    }

    /**
     * <p>
     * Information about the resource that is being migrated. This data will be
     * used to map the task to a resource in the Application Discovery Service
     * repository.
     * </p>
     * <note>
     * <p>
     * Takes the object array of <code>ResourceAttribute</code> where the
     * <code>Type</code> field is reserved for the following values:
     * <code>IPV4_ADDRESS | IPV6_ADDRESS | MAC_ADDRESS | FQDN | VM_MANAGER_ID | VM_MANAGED_OBJECT_REFERENCE | VM_NAME | VM_PATH | BIOS_ID | MOTHERBOARD_SERIAL_NUMBER</code>
     * where the identifying value can be a string up to 256 characters.
     * </p>
     * </note> <important>
     * <ul>
     * <li>
     * <p>
     * If any "VM" related value is set for a <code>ResourceAttribute</code>
     * object, it is required that <code>VM_MANAGER_ID</code>, as a minimum, is
     * always set. If <code>VM_MANAGER_ID</code> is not set, then all "VM"
     * fields will be discarded and "VM" fields will not be used for matching
     * the migration task to a server in Application Discovery Service
     * repository. See the <a href=
     * "https://docs.aws.amazon.com/migrationhub/latest/ug/API_PutResourceAttributes.html#API_PutResourceAttributes_Examples"
     * >Example</a> section below for a use case of specifying "VM" related
     * values.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a server you are trying to match has multiple IP or MAC addresses, you
     * should provide as many as you know in separate type/value pairs passed to
     * the <code>ResourceAttributeList</code> parameter to maximize the chances
     * of matching.
     * </p>
     * </li>
     * </ul>
     * </important>
     *
     * @param resourceAttributeList <p>
     *            Information about the resource that is being migrated. This
     *            data will be used to map the task to a resource in the
     *            Application Discovery Service repository.
     *            </p>
     *            <note>
     *            <p>
     *            Takes the object array of <code>ResourceAttribute</code> where
     *            the <code>Type</code> field is reserved for the following
     *            values:
     *            <code>IPV4_ADDRESS | IPV6_ADDRESS | MAC_ADDRESS | FQDN | VM_MANAGER_ID | VM_MANAGED_OBJECT_REFERENCE | VM_NAME | VM_PATH | BIOS_ID | MOTHERBOARD_SERIAL_NUMBER</code>
     *            where the identifying value can be a string up to 256
     *            characters.
     *            </p>
     *            </note> <important>
     *            <ul>
     *            <li>
     *            <p>
     *            If any "VM" related value is set for a
     *            <code>ResourceAttribute</code> object, it is required that
     *            <code>VM_MANAGER_ID</code>, as a minimum, is always set. If
     *            <code>VM_MANAGER_ID</code> is not set, then all "VM" fields
     *            will be discarded and "VM" fields will not be used for
     *            matching the migration task to a server in Application
     *            Discovery Service repository. See the <a href=
     *            "https://docs.aws.amazon.com/migrationhub/latest/ug/API_PutResourceAttributes.html#API_PutResourceAttributes_Examples"
     *            >Example</a> section below for a use case of specifying "VM"
     *            related values.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If a server you are trying to match has multiple IP or MAC
     *            addresses, you should provide as many as you know in separate
     *            type/value pairs passed to the
     *            <code>ResourceAttributeList</code> parameter to maximize the
     *            chances of matching.
     *            </p>
     *            </li>
     *            </ul>
     *            </important>
     */
    public void setResourceAttributeList(
            java.util.Collection<ResourceAttribute> resourceAttributeList) {
        if (resourceAttributeList == null) {
            this.resourceAttributeList = null;
            return;
        }

        this.resourceAttributeList = new java.util.ArrayList<ResourceAttribute>(
                resourceAttributeList);
    }

    /**
     * <p>
     * Information about the resource that is being migrated. This data will be
     * used to map the task to a resource in the Application Discovery Service
     * repository.
     * </p>
     * <note>
     * <p>
     * Takes the object array of <code>ResourceAttribute</code> where the
     * <code>Type</code> field is reserved for the following values:
     * <code>IPV4_ADDRESS | IPV6_ADDRESS | MAC_ADDRESS | FQDN | VM_MANAGER_ID | VM_MANAGED_OBJECT_REFERENCE | VM_NAME | VM_PATH | BIOS_ID | MOTHERBOARD_SERIAL_NUMBER</code>
     * where the identifying value can be a string up to 256 characters.
     * </p>
     * </note> <important>
     * <ul>
     * <li>
     * <p>
     * If any "VM" related value is set for a <code>ResourceAttribute</code>
     * object, it is required that <code>VM_MANAGER_ID</code>, as a minimum, is
     * always set. If <code>VM_MANAGER_ID</code> is not set, then all "VM"
     * fields will be discarded and "VM" fields will not be used for matching
     * the migration task to a server in Application Discovery Service
     * repository. See the <a href=
     * "https://docs.aws.amazon.com/migrationhub/latest/ug/API_PutResourceAttributes.html#API_PutResourceAttributes_Examples"
     * >Example</a> section below for a use case of specifying "VM" related
     * values.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a server you are trying to match has multiple IP or MAC addresses, you
     * should provide as many as you know in separate type/value pairs passed to
     * the <code>ResourceAttributeList</code> parameter to maximize the chances
     * of matching.
     * </p>
     * </li>
     * </ul>
     * </important>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceAttributeList <p>
     *            Information about the resource that is being migrated. This
     *            data will be used to map the task to a resource in the
     *            Application Discovery Service repository.
     *            </p>
     *            <note>
     *            <p>
     *            Takes the object array of <code>ResourceAttribute</code> where
     *            the <code>Type</code> field is reserved for the following
     *            values:
     *            <code>IPV4_ADDRESS | IPV6_ADDRESS | MAC_ADDRESS | FQDN | VM_MANAGER_ID | VM_MANAGED_OBJECT_REFERENCE | VM_NAME | VM_PATH | BIOS_ID | MOTHERBOARD_SERIAL_NUMBER</code>
     *            where the identifying value can be a string up to 256
     *            characters.
     *            </p>
     *            </note> <important>
     *            <ul>
     *            <li>
     *            <p>
     *            If any "VM" related value is set for a
     *            <code>ResourceAttribute</code> object, it is required that
     *            <code>VM_MANAGER_ID</code>, as a minimum, is always set. If
     *            <code>VM_MANAGER_ID</code> is not set, then all "VM" fields
     *            will be discarded and "VM" fields will not be used for
     *            matching the migration task to a server in Application
     *            Discovery Service repository. See the <a href=
     *            "https://docs.aws.amazon.com/migrationhub/latest/ug/API_PutResourceAttributes.html#API_PutResourceAttributes_Examples"
     *            >Example</a> section below for a use case of specifying "VM"
     *            related values.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If a server you are trying to match has multiple IP or MAC
     *            addresses, you should provide as many as you know in separate
     *            type/value pairs passed to the
     *            <code>ResourceAttributeList</code> parameter to maximize the
     *            chances of matching.
     *            </p>
     *            </li>
     *            </ul>
     *            </important>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutResourceAttributesRequest withResourceAttributeList(
            ResourceAttribute... resourceAttributeList) {
        if (getResourceAttributeList() == null) {
            this.resourceAttributeList = new java.util.ArrayList<ResourceAttribute>(
                    resourceAttributeList.length);
        }
        for (ResourceAttribute value : resourceAttributeList) {
            this.resourceAttributeList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the resource that is being migrated. This data will be
     * used to map the task to a resource in the Application Discovery Service
     * repository.
     * </p>
     * <note>
     * <p>
     * Takes the object array of <code>ResourceAttribute</code> where the
     * <code>Type</code> field is reserved for the following values:
     * <code>IPV4_ADDRESS | IPV6_ADDRESS | MAC_ADDRESS | FQDN | VM_MANAGER_ID | VM_MANAGED_OBJECT_REFERENCE | VM_NAME | VM_PATH | BIOS_ID | MOTHERBOARD_SERIAL_NUMBER</code>
     * where the identifying value can be a string up to 256 characters.
     * </p>
     * </note> <important>
     * <ul>
     * <li>
     * <p>
     * If any "VM" related value is set for a <code>ResourceAttribute</code>
     * object, it is required that <code>VM_MANAGER_ID</code>, as a minimum, is
     * always set. If <code>VM_MANAGER_ID</code> is not set, then all "VM"
     * fields will be discarded and "VM" fields will not be used for matching
     * the migration task to a server in Application Discovery Service
     * repository. See the <a href=
     * "https://docs.aws.amazon.com/migrationhub/latest/ug/API_PutResourceAttributes.html#API_PutResourceAttributes_Examples"
     * >Example</a> section below for a use case of specifying "VM" related
     * values.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a server you are trying to match has multiple IP or MAC addresses, you
     * should provide as many as you know in separate type/value pairs passed to
     * the <code>ResourceAttributeList</code> parameter to maximize the chances
     * of matching.
     * </p>
     * </li>
     * </ul>
     * </important>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceAttributeList <p>
     *            Information about the resource that is being migrated. This
     *            data will be used to map the task to a resource in the
     *            Application Discovery Service repository.
     *            </p>
     *            <note>
     *            <p>
     *            Takes the object array of <code>ResourceAttribute</code> where
     *            the <code>Type</code> field is reserved for the following
     *            values:
     *            <code>IPV4_ADDRESS | IPV6_ADDRESS | MAC_ADDRESS | FQDN | VM_MANAGER_ID | VM_MANAGED_OBJECT_REFERENCE | VM_NAME | VM_PATH | BIOS_ID | MOTHERBOARD_SERIAL_NUMBER</code>
     *            where the identifying value can be a string up to 256
     *            characters.
     *            </p>
     *            </note> <important>
     *            <ul>
     *            <li>
     *            <p>
     *            If any "VM" related value is set for a
     *            <code>ResourceAttribute</code> object, it is required that
     *            <code>VM_MANAGER_ID</code>, as a minimum, is always set. If
     *            <code>VM_MANAGER_ID</code> is not set, then all "VM" fields
     *            will be discarded and "VM" fields will not be used for
     *            matching the migration task to a server in Application
     *            Discovery Service repository. See the <a href=
     *            "https://docs.aws.amazon.com/migrationhub/latest/ug/API_PutResourceAttributes.html#API_PutResourceAttributes_Examples"
     *            >Example</a> section below for a use case of specifying "VM"
     *            related values.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If a server you are trying to match has multiple IP or MAC
     *            addresses, you should provide as many as you know in separate
     *            type/value pairs passed to the
     *            <code>ResourceAttributeList</code> parameter to maximize the
     *            chances of matching.
     *            </p>
     *            </li>
     *            </ul>
     *            </important>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutResourceAttributesRequest withResourceAttributeList(
            java.util.Collection<ResourceAttribute> resourceAttributeList) {
        setResourceAttributeList(resourceAttributeList);
        return this;
    }

    /**
     * <p>
     * Optional boolean flag to indicate whether any effect should take place.
     * Used to test if the caller has permission to make the call.
     * </p>
     *
     * @return <p>
     *         Optional boolean flag to indicate whether any effect should take
     *         place. Used to test if the caller has permission to make the
     *         call.
     *         </p>
     */
    public Boolean isDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Optional boolean flag to indicate whether any effect should take place.
     * Used to test if the caller has permission to make the call.
     * </p>
     *
     * @return <p>
     *         Optional boolean flag to indicate whether any effect should take
     *         place. Used to test if the caller has permission to make the
     *         call.
     *         </p>
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Optional boolean flag to indicate whether any effect should take place.
     * Used to test if the caller has permission to make the call.
     * </p>
     *
     * @param dryRun <p>
     *            Optional boolean flag to indicate whether any effect should
     *            take place. Used to test if the caller has permission to make
     *            the call.
     *            </p>
     */
    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Optional boolean flag to indicate whether any effect should take place.
     * Used to test if the caller has permission to make the call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dryRun <p>
     *            Optional boolean flag to indicate whether any effect should
     *            take place. Used to test if the caller has permission to make
     *            the call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutResourceAttributesRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
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
        if (getProgressUpdateStream() != null)
            sb.append("ProgressUpdateStream: " + getProgressUpdateStream() + ",");
        if (getMigrationTaskName() != null)
            sb.append("MigrationTaskName: " + getMigrationTaskName() + ",");
        if (getResourceAttributeList() != null)
            sb.append("ResourceAttributeList: " + getResourceAttributeList() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getProgressUpdateStream() == null) ? 0 : getProgressUpdateStream().hashCode());
        hashCode = prime * hashCode
                + ((getMigrationTaskName() == null) ? 0 : getMigrationTaskName().hashCode());
        hashCode = prime
                * hashCode
                + ((getResourceAttributeList() == null) ? 0 : getResourceAttributeList().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutResourceAttributesRequest == false)
            return false;
        PutResourceAttributesRequest other = (PutResourceAttributesRequest) obj;

        if (other.getProgressUpdateStream() == null ^ this.getProgressUpdateStream() == null)
            return false;
        if (other.getProgressUpdateStream() != null
                && other.getProgressUpdateStream().equals(this.getProgressUpdateStream()) == false)
            return false;
        if (other.getMigrationTaskName() == null ^ this.getMigrationTaskName() == null)
            return false;
        if (other.getMigrationTaskName() != null
                && other.getMigrationTaskName().equals(this.getMigrationTaskName()) == false)
            return false;
        if (other.getResourceAttributeList() == null ^ this.getResourceAttributeList() == null)
            return false;
        if (other.getResourceAttributeList() != null
                && other.getResourceAttributeList().equals(this.getResourceAttributeList()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }
}
