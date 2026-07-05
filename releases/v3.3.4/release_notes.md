# v3.3.4 — assist bar builds on strict BeanShell hosts

- **Fix `No static field or inner class: ScaleType of class android.widget.ImageButton`**
  at `AssistBar.bsh` `IconButton()`. `ScaleType` is declared on `ImageView`;
  referencing it via the `ImageButton` subclass compiles in javac but fails in
  Tasker's BeanShell (nested classes are not resolved through inheritance) —
  and as a bsh EvalError it bypasses script-level try/catch, so `addButtons()`
  died and left the bar half-built. Now uses `ImageView.ScaleType.CENTER`.
- `show()` fully rebuilds after a partial failure (`handle == null` triggers
  `create()+addButtons()` again) and resets state on build errors, so a failed
  attempt can't poison later ones.
- Remove dead `assist/AssistButton.bsh` (old pre-3.3 launcher UI; no callers,
  not in upstream).
