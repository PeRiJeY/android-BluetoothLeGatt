/*
 * Copyright (C) 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.bluetoothlegatt;

import java.util.HashMap;

/**
 * This class includes a small subset of standard GATT attributes for demonstration purposes.
 */
public class SampleGattAttributes {
    private static HashMap<String, String> attributes = new HashMap();
    public static String HEART_RATE_MEASUREMENT = "00002a37-0000-1000-8000-00805f9b34fb";
    public static String CLIENT_CHARACTERISTIC_CONFIG = "00002902-0000-1000-8000-00805f9b34fb";

    public static byte FEATURE_HEART_RATE = 109;
    public static byte FEATURE_PRESSURE = 105;
    public static byte FEATURE_BLOOD_OXYGEN = 107;

    public static String GENERIC_SERVICE = "0000feea-0000-1000-8000-00805f9b34fb";
    public static String CHARACTERISTIC_TO_WRITE = "0000fee2-0000-1000-8000-00805f9b34fb";
    public static String CHARACTERISTIC_TO_NOTIFY = "0000fee3-0000-1000-8000-00805f9b34fb";

    /*static {
        // Sample Services.
        attributes.put("0000180d-0000-1000-8000-00805f9b34fb", "Heart Rate Service");
        attributes.put("0000180a-0000-1000-8000-00805f9b34fb", "Device Information Service");
        // Sample Characteristics.
        attributes.put(HEART_RATE_MEASUREMENT, "Heart Rate Measurement");
        attributes.put("00002a29-0000-1000-8000-00805f9b34fb", "Manufacturer Name String");
    }*/

    static {
        attributes.put("00001800-0000-1000-8000-00805f9b34fb", "Generic Access");
        attributes.put("00001801-0000-1000-8000-00805f9b34fb", "Generic Attribute");
        attributes.put("00001802-0000-1000-8000-00805f9b34fb", "Immediate Alert");
        attributes.put("00001803-0000-1000-8000-00805f9b34fb", "Link Loss");
        attributes.put("00001804-0000-1000-8000-00805f9b34fb", "Tx Power");
        attributes.put("00001805-0000-1000-8000-00805f9b34fb", "Current Time Service");
        attributes.put("00001806-0000-1000-8000-00805f9b34fb", "Reference Time Update Service");
        attributes.put("00001807-0000-1000-8000-00805f9b34fb", "Next DST Change Service");
        attributes.put("00001808-0000-1000-8000-00805f9b34fb", "Glucose");
        attributes.put("00001809-0000-1000-8000-00805f9b34fb", "Health Thermometer");
        attributes.put("0000180a-0000-1000-8000-00805f9b34fb", "Device Information");
        attributes.put("0000180d-0000-1000-8000-00805f9b34fb", "Heart Rate");
        attributes.put("0000180e-0000-1000-8000-00805f9b34fb", "Phone Alert Status Service");
        attributes.put("0000180f-0000-1000-8000-00805f9b34fb", "Battery Service");
        attributes.put("00001810-0000-1000-8000-00805f9b34fb", "Blood Pressure");
        attributes.put("00001811-0000-1000-8000-00805f9b34fb", "Alert Notification Service");
        attributes.put("00001812-0000-1000-8000-00805f9b34fb", "Human Interface Device");
        attributes.put("00001813-0000-1000-8000-00805f9b34fb", "Scan Parameters");
        attributes.put("00001814-0000-1000-8000-00805f9b34fb", "Running Speed and Cadence");
        attributes.put("00001815-0000-1000-8000-00805f9b34fb", "Automation IO");
        attributes.put("00001816-0000-1000-8000-00805f9b34fb", "Cycling Speed and Cadence");
        attributes.put("00001818-0000-1000-8000-00805f9b34fb", "Cycling Power");
        attributes.put("00001819-0000-1000-8000-00805f9b34fb", "Location and Navigation");
        attributes.put("0000181a-0000-1000-8000-00805f9b34fb", "Environmental Sensing");
        attributes.put("0000181b-0000-1000-8000-00805f9b34fb", "Body Composition");
        attributes.put("0000181c-0000-1000-8000-00805f9b34fb", "User Data");
        attributes.put("0000181d-0000-1000-8000-00805f9b34fb", "Weight Scale");
        attributes.put("0000181e-0000-1000-8000-00805f9b34fb", "Bond Management Service");
        attributes.put("0000181f-0000-1000-8000-00805f9b34fb", "Continuous Glucose Monitoring");
        attributes.put("00001820-0000-1000-8000-00805f9b34fb", "Internet Protocol Support Service");
        attributes.put("00001821-0000-1000-8000-00805f9b34fb", "Indoor Positioning");
        attributes.put("00001822-0000-1000-8000-00805f9b34fb", "Pulse Oximeter Service");
        attributes.put("00001823-0000-1000-8000-00805f9b34fb", "HTTP Proxy");
        attributes.put("00001824-0000-1000-8000-00805f9b34fb", "Transport Discovery");
        attributes.put("00001825-0000-1000-8000-00805f9b34fb", "Object Transfer Service");
        attributes.put("00001826-0000-1000-8000-00805f9b34fb", "Fitness Machine");
        attributes.put("00001827-0000-1000-8000-00805f9b34fb", "Mesh Provisioning Service");
        attributes.put("00001828-0000-1000-8000-00805f9b34fb", "Mesh Proxy Service");
        attributes.put("00001829-0000-1000-8000-00805f9b34fb", "Reconnection Configuration");


        // Sample Characteristics.
        attributes.put(HEART_RATE_MEASUREMENT, "Heart Rate Measurement");
        attributes.put("00002a29-0000-1000-8000-00805f9b34fb", "Manufacturer Name String");

        attributes.put("00002a00-0000-1000-8000-00805f9b34fb", "Device Name");
        attributes.put("00002a01-0000-1000-8000-00805f9b34fb", "Appearance");
        attributes.put("00002a02-0000-1000-8000-00805f9b34fb", "Peripheral Privacy Flag");
        attributes.put("00002a03-0000-1000-8000-00805f9b34fb", "Reconnection Address");
        attributes.put("00002a04-0000-1000-8000-00805f9b34fb", "Manufacturer Name String");
        attributes.put("00002a05-0000-1000-8000-00805f9b34fb", "Service Changed");
        attributes.put("00002A06-0000-1000-8000-00805f9b34fb", "Alert level");
    }

    public static String lookup(String uuid, String defaultName) {
        String name = attributes.get(uuid);
        return name == null ? defaultName : name;
    }
}
