/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.services.s3.model.inventory;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * The InventoryConfiguration class.
 */
public class InventoryConfiguration implements Serializable {

    /** The ID used to identify the inventory configuration. */
    private String id;

    /** Contains information about where to publish the inventory results. */
    private InventoryDestination destination;

    /** Specifies whether the inventory is enabled or disabled. */
    private Boolean isEnabled;

    /** Specifies an inventory inventoryFilter. */
    private InventoryFilter inventoryFilter;

    /** Specifies which object version(s) to included in the inventory results. */
    private String includedObjectVersions;

    /** List to store the optional fields that are included in the inventory results. */
    private List<String> optionalFields;

    /** Specifies the schedule for generating inventory results. */
    private InventorySchedule schedule;


    /**
     * @return the ID used to identify the inventory configuration.
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the ID used to identify the inventory configuration.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @param id the ID used to identify the inventory configuration
     * @return this object for method chaining.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public InventoryConfiguration withId(String id) {
        setId(id);
        return this;
    }

    /**
     * @return the {@link InventoryDestination} that contains information
     * about where to publish the inventory results.
     */
    public InventoryDestination getDestination() {
        return destination;
    }

    /**
     * @param destination the {@link InventoryDestination} that contains information
     * about where to publish the inventory results.
     */
    public void setDestination(InventoryDestination destination) {
        this.destination = destination;
    }

    /**
     * @param destination  the {@link InventoryDestination} that contains information
     * about where to publish the inventory results.
     * @return this object for method chaining.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public InventoryConfiguration withDestination(InventoryDestination destination) {
        setDestination(destination);
        return this;
    }

    /**
     * @return true if the inventory is enabled or
     * false if inventory is disabled.
     */
    public Boolean isEnabled() {
        return isEnabled;
    }

    /**
     * @param enabled the value whether the inventory is enabled or disabled.
     *
     * The value true indicates the inventory is enabled and
     * false indicates the inventory is disabled.
     */
    public void setEnabled(Boolean enabled) {
        isEnabled = enabled;
    }

    /**
     * @param enabled the value whether the inventory is enabled or disabled.
     *
     * The value true indicates the inventory is enabled and
     * false indicates the inventory is disabled.
     * @return this object for method chaining.
     */
    public InventoryConfiguration withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * @return the inventoryFilter used to describe a set of objects
     * to include in inventory results.
     */
    public InventoryFilter getInventoryFilter() {
        return inventoryFilter;
    }

    /**
     * @param inventoryFilter he inventoryFilter used to describe a set of objects
     * to include in inventory results.
     */
    public void setInventoryFilter(InventoryFilter inventoryFilter) {
        this.inventoryFilter = inventoryFilter;
    }

    /**
     * @param inventoryFilter the inventoryFilter used to describe a set of objects
     * to include in inventory results.
     *
     * @return the {@link InventoryConfiguration} object is returned
     * for method chaining.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public InventoryConfiguration withFilter(InventoryFilter inventoryFilter) {
        setInventoryFilter(inventoryFilter);
        return this;
    }

    /**
     * @return which object version(s) to included in the inventory results.
     */
    public String getIncludedObjectVersions() {
        return includedObjectVersions;
    }

    /**
     * @param includedObjectVersions  which object version(s) to included in the inventory results.
     */
    public void setIncludedObjectVersions(String includedObjectVersions) {
        this.includedObjectVersions = includedObjectVersions;
    }

    /**
     * @param includedObjectVersions  which object version(s) to included in the inventory results
     * @return this object for method chaining.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public InventoryConfiguration withIncludedObjectVersions(String includedObjectVersions) {
        setIncludedObjectVersions(includedObjectVersions);
        return this;
    }

    /**
     * @param includedObjectVersions  which object version(s) to included in the inventory results.
     */
    public void setIncludedObjectVersions(InventoryIncludedObjectVersions includedObjectVersions) {
        setIncludedObjectVersions(includedObjectVersions == null ? (String) null : includedObjectVersions.toString());
    }

    /**
     * @param includedObjectVersions  which object version(s) to included in the inventory results
     * @return this object for method chaining.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public InventoryConfiguration withIncludedObjectVersions(InventoryIncludedObjectVersions includedObjectVersions) {
        setIncludedObjectVersions(includedObjectVersions);
        return this;
    }

    /**
     * @return the optional fields that are included in the inventory results.
     */
    public List<String> getOptionalFields() {
        return optionalFields;
    }

    /**
     * @param optionalFields  the optional fields that are included in the inventory results.
     */
    public void setOptionalFields(List<String> optionalFields) {
        this.optionalFields = optionalFields;
    }

    /**
     * @param optionalFields  the optional fields that are included in the inventory results.
     * @return the {@link InventoryConfiguration} object is returned for method chaining.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public InventoryConfiguration withOptionalFields(List<String> optionalFields) {
        setOptionalFields(optionalFields);
        return this;
    }

    /**
     * @param optionalField  to add a field to the list of optional fields that are included in the inventory results.
     */
    public void addOptionalField(String optionalField) {
        if (optionalField == null) {
            return;
        } else if (this.optionalFields == null) {
            this.optionalFields = new ArrayList<String>();
        }
        this.optionalFields.add(optionalField);
    }

    /**
     * @param optionalField to add a field to the list of optional fields that are included in the inventory results.
     */
    public void addOptionalField(InventoryOptionalField optionalField) {
        addOptionalField(optionalField == null ? (String) null : optionalField.toString());
    }

    /**
     * @return the schedule for generating inventory results.
     */
    public InventorySchedule getSchedule() {
        return schedule;
    }

    /**
     * @param schedule  the schedule for generating inventory results.
     */
    public void setSchedule(InventorySchedule schedule) {
        this.schedule = schedule;
    }

    /**
     * @param schedule  the schedule for generating inventory results
     * @return {@link InventoryConfiguration} object
     * for method chaining.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public InventoryConfiguration withSchedule(InventorySchedule schedule) {
        setSchedule(schedule);
        return this;
    }

}
