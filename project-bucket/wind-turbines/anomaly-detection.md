**Source:** _Adrian Ramirez Marin, DETECTION OF ANOMALIES IN WIND turbine electrical components THROUGH SCADA DATA, an application to Digital Twin_

# 1. Introduction

Wind farms implement the Supervisory Control and Data Acquisition (SCADA) systems to monitor operational data such as power output, temperature readings, and vibration levels for risk reduction reasons.

This early detection mode for wind turbine failures have gone through recent improvement by advanced data analysis techniques that allow patterns in SCADA data to be identified as anomalies before they develop into major issues.

Technical specifications of the Senvion MM92 turbines:

- **Rated power:** 2.05 MW

- **Rotor diameter:** 92 meters

- **Hub height:** 69 meters

- **Cut-in wind speed:** 4 m/s

- **Rated wind speed:** 12 m/s

- **Cut-out wind speed:** 25 m/s

## 1.3 Methodology Overview:

Analyzing SCADA data can involve examining different factors, like power generation levels and temperature of bearings and roto speeds. Studying different modes of failures such as gearbox wear and blade damage, can help us comprehend this change in SCADA signals.

## 1.4 Main Components

**1. Rotor:**

This components receives the incoming wind energy and starts the energy transformation process. It consists of the hub and blade of the wind turbine

- **Blades**: Generates lift when wind flows through them due to a pressure difference. This causes the rotor to turn. The structure is lightweight due to being made of composite materials such as fiberglass epoxy and carbon fibre. The blades are independently 40-80 meters in length and are expected to have a utility life of 20-25 years.

- **Hub:** Attaches the multiple blade units to the main shaft. The system incorporates pitch control to allow each individual blade to turn around their axis and is used to control wind energy optimization and fatigue reduction by adjusting to the wind farm environment.

**Engineering Considerations:** The design of the rotor determines the cut-in speed together with its rated power output and load characteristics. The requirement of having minimal vibration alongside an optimized efficiency depends on the proper balancingh and aerodynamic adjustments.

**2. Main Shaft:** The main shaft transfers mechanical energy from the rotating rotor to the drivetrain, typically the gearbox.

It typically operates at 10-60 revolutions per minute, and this is known as the low-speed shaft.

High-strength steel is used to endure large torques with cyclic loads. The structure is also hollow to minimize the weight.

**Engineering Considerations:** Small deviations from precise alignment can cause excessive stress on bearings along with damage being caused to the drivetain.

The main bearing requires constant maintainance inspections alongside non-destructive testing for optimal performance throughout its operational life.

**3. Main Bearing:** The main bearing supports the main shaft and lets the rotor rotate freely.

The system consists of spherical roller bearings or tapered roller bearings which support both axial and radial loads.

**Engineering Considerations:** Mechanical wear occurs at this component which can result in severe consequences for drivetrain failure.

CMS (Conditional Monitoring System) track the conditions of bearings through temperature spikes and vibration/acoustic emission.

**4. Gearbox:**

The gearbox bearing consists of a spherical roller bearing and tapered roller bearing system which supports both axial and radial loads.

The drivetrain design is what determines whether to use a single bearing vs dual-bearing configuration.

A centralized lubricating system must be present to main optimal performance and increase lifespan of the turbine.


**Engineering Considerations:** A gearbox failure can result in severe drivetrain damage, and this represents an area of interest in anomaly detection.

The CMS can track temperature variations for this component as well as vibration emission signals.

**Gearbox Bearing:**  The internal bearings within the gearbox that supports the gear shafts and reduces friction.

The gearbox features journal bearings, roller bearings and needle bearings.

They are able to handle rotation as well as the heavy loads while preserving ratio standards to stop misalighnment for gears.

**Engineering Considerations:** Misalighnment along with excessive noise and failure can occur when performance deterioates.

The components function in a lubricated environment to minimize heat dissipative energy loss.

**6. Generator Shaft:** Transfers rotational power from the gearbox to generate electricity.

The generator speed operates between 1000 and 1800 rpm depending on generatr specifications.

Proper torque limiting coupling appears in some applications to safeguard against rapid changes in torque or load.

**Engineering Considerations:** Thermal expansion as well as torsional stress and cyclic loading must be accounted for in this component. Precise alignment and high-quality materials are used to achieve extended operational performance.

**7. Brake:** A known safety system to dynamically control the rotor movement.

Operates through mechanical and hydraulic or electromagnetic system. Mostly for emergency situations and speed control during maintenance.

**Engineering Considerations:** The safety system relies on aerodynamic braking alongside blade pitch adjustment to provide multi level protection.
