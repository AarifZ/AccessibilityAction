# v3.3.3 — assist overlay no longer crashes the app

- **Fix fatal `NullPointerException` at `AssistBar.bsh` `handleGesture.getDetector()`**
  in the main-thread Runnable. When the overlay build failed partway (most
  commonly `getService()` → "Accessibility service not active!" when the app's
  accessibility service isn't enabled), `assistButton` was left created but
  `handleGesture` null; the next `show()` skipped the build and posted a
  Runnable that dereferenced the null `handleGesture` on the UI thread,
  crashing the whole app.
- `show()` now builds atomically and self-heals a partial build, wraps the
  build in try/catch (logs + toasts the real reason instead of crashing), and
  guards the posted Runnable so it can never crash the process.

Note: the assist overlay requires the app's accessibility service to be
enabled (Android Settings → Accessibility, or grant `WRITE_SECURE_SETTINGS`
via adb so the in-app toggle works). Without it you now get a clear toast
instead of a crash.
