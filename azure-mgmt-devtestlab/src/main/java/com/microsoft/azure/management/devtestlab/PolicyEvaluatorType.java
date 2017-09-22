/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for PolicyEvaluatorType.
 */
public final class PolicyEvaluatorType {
    /** Static value AllowedValuesPolicy for PolicyEvaluatorType. */
    public static final PolicyEvaluatorType ALLOWED_VALUES_POLICY = new PolicyEvaluatorType("AllowedValuesPolicy");

    /** Static value MaxValuePolicy for PolicyEvaluatorType. */
    public static final PolicyEvaluatorType MAX_VALUE_POLICY = new PolicyEvaluatorType("MaxValuePolicy");

    private String value;

    /**
     * Creates a custom value for PolicyEvaluatorType.
     * @param value the custom value
     */
    public PolicyEvaluatorType(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof PolicyEvaluatorType)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        PolicyEvaluatorType rhs = (PolicyEvaluatorType) obj;
        if (value == null) {
            return rhs.value == null;
        } else {
            return value.equals(rhs.value);
        }
    }
}