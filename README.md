# NEXA

**Human Signals. Smarter Experiences.**

NEXA is an Android wellness companion concept built around real-time human sensing with the [Presage SmartSpectra SDK](https://presagetech.com/docs/smartspectra-sdk). The goal is to translate supported live signals into a thoughtful, adaptive experience rather than simply displaying measurements.

> **Project status:** Phase 1 — foundation and SDK setup. Features described here are planned until implemented and verified on a physical Android device.

## Product direction

NEXA aims to provide:
- A clear onboarding and camera-consent experience.
- A live sensing flow with understandable signal-quality feedback.
- Live insights for metrics supported by the SDK and validated by signal quality.
- An adaptive guided-breathing experience that responds to reliable live signals.
- Optional local session summaries and trends, with user-controlled deletion.

The exact metrics and experience will be limited to what the current SmartSpectra SDK supports and what can be responsibly validated.

## Privacy and safety

- Camera access is requested only when needed and explained before use.
- Raw camera video or frames are not intended to be stored.
- Session summaries are intended to remain local unless a future feature clearly explains otherwise and obtains consent.
- Users should be able to clear locally stored session data.
- NEXA is for general wellness and information, not diagnosis or treatment. It does not replace professional medical advice.

## Technology

- Kotlin
- Native Android
- Jetpack Compose
- Presage SmartSpectra Android SDK

Specific toolchain and dependency versions will be selected after checking the current official Android quick start and compatibility requirements.

## Development

This repository is being developed in phases. See [docs/PROJECT_PLAN.md](docs/PROJECT_PLAN.md) and [AGENTS.md](AGENTS.md) for the current roadmap and engineering rules.

Before SDK integration, consult:
- [SmartSpectra SDK documentation](https://presagetech.com/docs/smartspectra-sdk)
- [Android quick start](https://presagetech.com/docs/smartspectra-sdk/android)
- [SmartSpectra SDK repository](https://github.com/Presage-Security/SmartSpectra)

Never commit API keys or other credentials. Use secure local configuration or repository/CI secrets.
