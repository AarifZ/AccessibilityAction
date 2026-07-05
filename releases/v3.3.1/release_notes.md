# v3.3.1 — Init & Kid App fixes

Fixes initialization on modern Tasker (6.7+) and Kid App / App Factory exports.

- **Fix `Command not found: Environment()`** — `a11Y.java` now resolves `.bsh`
  commands with `cd(ENV_PATH); addClassPath(".")` (the pattern that works when
  sourced from an absolute path), instead of `addClassPath(<absolute path>)`.
  Top-level command invocations are untyped assignments.
- **Add `main/getA11yInstance.bsh`** (was referenced but missing).
- **Kid App color fallback no longer crashes init** — `MaterialColorFallback`
  guards against API-34-only color tokens (`resId == 0` / `NotFoundException`),
  and `mcf.load()` is wrapped so init always reaches the `a11Y=:=start`
  command. `ThemeManager.color(...)` returns `0` instead of throwing when no
  fallback is present.
- Remove fragile optional extras that don't survive targetSdk 35+
  (`isLocked`, `isScreenOn`, `takeScreenshot`, `getPixelColor`).

No API changes to actions, events, or the assist UI.
