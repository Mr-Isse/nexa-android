# NEXA — Project Roadmap

## Goal

Build a reliable native Android experience for the Presage SmartSpectra SDK Challenge. NEXA should demonstrate meaningful use of real-time human signals through a useful adaptive wellness interaction.

## Phase 1 — Foundation and SDK setup

- [x] Create the GitHub repository.
- [x] Add project-level AI engineering instructions.
- [x] Document product direction, privacy principles, and roadmap.
- [ ] Confirm current challenge requirements and submission format.
- [ ] Review the official SmartSpectra Android quick start and agent skill.
- [ ] Choose a cloud-based Android build workflow that does not require installing Android Studio locally.
- [x] Confirm the physical Android test device: Samsung Galaxy A51, Android 13 (API 33).
- [x] Obtain the SmartSpectra API key through the developer portal; keep it private and never commit it.

**Exit criteria:** documented toolchain, reproducible project setup plan, and a safe SDK credential approach.

## Phase 2 — Android app skeleton

- [ ] Create the native Kotlin Android project.
- [ ] Configure Gradle and Compose using versions verified against current official compatibility guidance.
- [ ] Add app theme, navigation, and a minimal launch screen.
- [ ] Add a build workflow that can produce a debug APK.
- [ ] Verify a clean build.

**Exit criteria:** the app builds successfully and launches on the user's Android phone.

## Phase 3 — SmartSpectra integration

- [ ] Add the official SmartSpectra SDK dependency.
- [ ] Implement camera permission and clear consent UX.
- [ ] Initialize the SDK using documented APIs.
- [ ] Connect the camera preview using the official Android integration pattern.
- [ ] Request only the metrics needed for the first experience.
- [ ] Handle permission denial, unavailable camera, low signal quality, interruption, and SDK errors.
- [ ] Validate at least one real signal on a physical Android device.

**Exit criteria:** a real, documented SDK signal is measured on-device; no simulated data is represented as real.

## Phase 4 — Core sensing experience

- [ ] Build onboarding and consent screens.
- [ ] Build the home screen and live scan flow.
- [ ] Show supported live metrics and signal quality with clear labels.
- [ ] Provide measurement progress and completion states.
- [ ] Add accessible loading, empty, and error states.

**Exit criteria:** a user can complete a clear and understandable live sensing session.

## Phase 5 — Adaptive wellness experience

- [ ] Design a guided-breathing experience.
- [ ] Define a conservative, documented adaptation rule using only reliable supported signals.
- [ ] Make the experience explain why its guidance changes.
- [ ] Avoid diagnosis, treatment, or medical claims.
- [ ] Test behavior when signals become unreliable or unavailable.

**Exit criteria:** at least one meaningful experience adapts to validated live SDK data.

## Phase 6 — Session summaries and history

- [ ] Define the minimum useful session summary.
- [ ] Ask before saving session summaries.
- [ ] Store only necessary data locally.
- [ ] Add history and simple trends where they add value.
- [ ] Add a clear delete-history action.

**Exit criteria:** optional local history works and users can remove it.

## Phase 7 — Testing and polish

- [ ] Test on the physical Android device in varied lighting and positioning conditions.
- [ ] Test camera permission denial and revocation.
- [ ] Test interruptions, app backgrounding, and camera release.
- [ ] Verify signal-quality handling and prevent misleading readings.
- [ ] Review privacy, accessibility, performance, and crash behavior.
- [ ] Produce a reproducible debug/release build.

**Exit criteria:** the core demo works reliably on the target device, with known limitations documented.

## Phase 8 — Challenge submission

- [ ] Re-check the official challenge rules and deadline.
- [ ] Make the repository public and remove all secrets.
- [ ] Complete setup and privacy documentation.
- [ ] Record a concise demo showing real SDK functionality.
- [ ] Publish the required DEV community post.
- [ ] Submit before the official deadline.

**Exit criteria:** all required submission materials are published and the submission is complete.

## Working agreement

Work one phase at a time. For each phase, inspect first, propose a plan, implement the approved scope, test, review, and report. Do not silently move into the next phase.
