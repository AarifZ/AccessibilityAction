# [checkEnv](/code/main/checkEnv.bsh)

Return the current execution environment.

&nbsp;
# Dependencies
None

&nbsp;
# How it works
`checkEnv` detects whether the script is running under Tasker or MacroDroid by checking environment-specific runtime globals. It returns a text identifier for the active automation host.

&nbsp;
# How to use

**Detect the environment:**
```
env = checkEnv();
```

&nbsp;
**Use the returned environment name:**
```
if (checkEnv() == "TASKER") {
  // Tasker-specific logic
}
```

&nbsp;
## Return Value
Returns `TASKER` if Tasker is available, `MACRODROID` if MacroDroid is available, or `null` if neither environment is detected.