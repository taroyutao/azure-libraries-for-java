/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.graphrbac.implementation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Role definition permissions.
 */
public class PermissionInner {
    /**
     * Allowed actions.
     */
    @JsonProperty(value = "actions")
    private List<String> actions;

    /**
     * Denied actions.
     */
    @JsonProperty(value = "notActions")
    private List<String> notActions;

    /**
     * Allowed Data actions.
     */
    @JsonProperty(value = "dataActions")
    private List<String> dataActions;

    /**
     * Denied Data actions.
     */
    @JsonProperty(value = "notDataActions")
    private List<String> notDataActions;

    /**
     * Get the actions value.
     *
     * @return the actions value
     */
    public List<String> actions() {
        return this.actions;
    }

    /**
     * Set the actions value.
     *
     * @param actions the actions value to set
     * @return the PermissionInner object itself.
     */
    public PermissionInner withActions(List<String> actions) {
        this.actions = actions;
        return this;
    }

    /**
     * Get the notActions value.
     *
     * @return the notActions value
     */
    public List<String> notActions() {
        return this.notActions;
    }

    /**
     * Set the notActions value.
     *
     * @param notActions the notActions value to set
     * @return the PermissionInner object itself.
     */
    public PermissionInner withNotActions(List<String> notActions) {
        this.notActions = notActions;
        return this;
    }

    /**
     * Get the dataActions value.
     *
     * @return the dataActions value
     */
    public List<String> dataActions() {
        return this.dataActions;
    }

    /**
     * Set the dataActions value.
     *
     * @param dataActions the dataActions value to set
     * @return the PermissionInner object itself.
     */
    public PermissionInner withDataActions(List<String> dataActions) {
        this.dataActions = dataActions;
        return this;
    }

    /**
     * Get the notDataActions value.
     *
     * @return the notDataActions value
     */
    public List<String> notDataActions() {
        return this.notDataActions;
    }

    /**
     * Set the notDataActions value.
     *
     * @param notDataActions the notDataActions value to set
     * @return the PermissionInner object itself.
     */
    public PermissionInner withNotDataActions(List<String> notDataActions) {
        this.notDataActions = notDataActions;
        return this;
    }

}
