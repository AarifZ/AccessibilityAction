# v3.3.2 — remove broken dead fallback renderers

- **Fix init crash at `inspector.read()`** — `assist/ScriptEditor_Fallback.bsh`
  contained a BeanShell `class` declaration, which Tasker's interpreter does
  not support. `MethodInspector.read()` sources every `.bsh` file via
  `ThisManager.make()`, so this one file aborted the whole initialization.
- **Remove all six `assist/*_Fallback.bsh` renderers** — they are never
  dispatched (BeanShell resolves commands by file name, so callers always get
  the primary renderer), and `ThemeManager_Fallback.bsh` defined a method
  named `ThemeManager()` that could shadow the real one. The functioning
  no-Material-color path remains `lib/MaterialColorFallback.bsh` +
  `ThemeManager`'s fallback branch (hardened in v3.3.1).
- **`ThisManager.make()` now skips files that fail to source** (logged as
  ERROR) instead of aborting init.
