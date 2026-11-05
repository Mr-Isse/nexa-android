---
name: using-smartspectra
description: Use when building or integrating the Presage SmartSpectra SDK for Android or another supported platform.
---

# SmartSpectra SDK — Agent Reference

This is a condensed project reference based on the official Presage SmartSpectra agent skill in the public repository:
https://github.com/Presage-Security/SmartSpectra/blob/main/.agents/skills/using-smartspectra/SKILL.md

**Maintenance:** Treat the upstream skill and live Presage documentation as authoritative. Before SDK implementation, compare this copy with the upstream version and consult the current Android documentation. Do not assume this copy remains current.

## What it is

SmartSpectra measures pulse, breathing, and other supported signals from camera/video frames. Metric computation occurs on-device inside the SDK. The SDK contacts Presage backend for API-key authentication and subscription validation. A network connection is required for that gating.

## Credentials

Register or log in at https://physiology.presagetech.com/auth/register. Treat API keys as secrets. Never commit keys or hardcode them into a distributable app binary. Use secure local configuration for development and investigate the documented OAuth flow for production mobile distribution.

If the SmartSpectra MCP server is connected, its documented tools may retrieve keys and register apps. Do not assume MCP access exists unless it is explicitly connected and authorized.

## Lifecycle

The general SDK lifecycle is:
1. Create configuration and set authentication plus only the requested metric groups.
2. Construct the SDK.
3. Subscribe to metrics, validation status, and errors before starting.
4. Select an input source.
5. Call start; call stop to end cleanly. Use reset only to rebuild the internal pipeline after an unrecoverable error.

Verify exact Android API names and signatures in the current Android documentation before writing code.

## Metric groups

The skill describes these conceptual groups:
- cardio: pulse, relative arterial-pressure waveform (not a calibrated blood-pressure reading), and HRV.
- breathing: breathing rate and chest/abdomen movement traces.
- face: landmarks, blinking, talking, and expression detections.
- eda: EDA Proxy trace.

Request only the groups the product actually uses. Values are time-series samples with confidence/stability/timestamp metadata; consult the platform payload schema for exact field names and accessors. Missing or unauthorized metrics may be omitted from payloads; authentication failures surface separately.

## Input and quality

The camera is the intended live use case. Measurement quality depends on lighting, framing, stillness, and camera stability. Surface validation guidance and never display an unreliable value as a confident measurement.

## Exact references

Read the live official documentation for signatures, configuration properties, enum values, installation, OAuth, troubleshooting, and complete samples:
- Documentation index: https://smartspectra.presagetech.com/llms.txt
- Android API-key setup: https://smartspectra.presagetech.com/docs/android/option-1-api-key/
- Android OAuth setup: https://smartspectra.presagetech.com/docs/android/option-2-oauth/
- Android troubleshooting: https://smartspectra.presagetech.com/docs/android/troubleshooting/
- Data types: https://smartspectra.presagetech.com/docs/data-types/

Markdown versions of documentation pages are available by appending .md to the URL.

## Safety and product integrity

SDK metrics are for general wellness and informational purposes only. They are not cleared for medical diagnosis or treatment. Do not make diagnostic or therapeutic claims. Never fabricate SDK data or claim a real measurement unless it has been validated on a physical device.
